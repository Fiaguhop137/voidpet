package kotlin.reflect;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3975l;
import kotlin.jvm.internal.InterfaceC3977n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48414a;

        static {
            int[] iArr = new int[q.values().length];
            try {
                iArr[q.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f48414a = iArr;
        }
    }

    static final /* synthetic */ class b extends AbstractC3975l implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f48415a = new b();

        b() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Class invoke(Class p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return p10.getComponentType();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type c(o oVar, boolean z10) {
        e eVarE = oVar.e();
        if (eVarE instanceof p) {
            return new t((p) eVarE);
        }
        if (!(eVarE instanceof d)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + oVar);
        }
        d dVar = (d) eVarE;
        Class clsC = z10 ? Ld.a.c(dVar) : Ld.a.b(dVar);
        List listK = oVar.k();
        if (listK.isEmpty()) {
            return clsC;
        }
        if (!clsC.isArray()) {
            return e(clsC, listK);
        }
        if (clsC.getComponentType().isPrimitive()) {
            return clsC;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) CollectionsKt.H0(listK);
        if (kTypeProjection == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + oVar);
        }
        q variance = kTypeProjection.getVariance();
        o type = kTypeProjection.getType();
        int i10 = variance == null ? -1 : a.f48414a[variance.ordinal()];
        if (i10 == -1 || i10 == 1) {
            return clsC;
        }
        if (i10 != 2 && i10 != 3) {
            throw new Ad.n();
        }
        Intrinsics.c(type);
        Type typeD = d(type, false, 1, null);
        return typeD instanceof Class ? clsC : new kotlin.reflect.a(typeD);
    }

    static /* synthetic */ Type d(o oVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return c(oVar, z10);
    }

    private static final Type e(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.w(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(g((KTypeProjection) it.next()));
            }
            return new s(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(CollectionsKt.w(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(g((KTypeProjection) it2.next()));
            }
            return new s(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type typeE = e(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.w(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(g((KTypeProjection) it3.next()));
        }
        return new s(cls, typeE, arrayList3);
    }

    public static final Type f(o oVar) {
        Type typeF;
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        return (!(oVar instanceof InterfaceC3977n) || (typeF = ((InterfaceC3977n) oVar).f()) == null) ? d(oVar, false, 1, null) : typeF;
    }

    private static final Type g(KTypeProjection kTypeProjection) {
        q qVarD = kTypeProjection.d();
        if (qVarD == null) {
            return v.f48416c.a();
        }
        o oVarC = kTypeProjection.c();
        Intrinsics.c(oVarC);
        int i10 = a.f48414a[qVarD.ordinal()];
        if (i10 == 1) {
            return new v(null, c(oVarC, true));
        }
        if (i10 == 2) {
            return c(oVarC, true);
        }
        if (i10 == 3) {
            return new v(c(oVarC, true), null);
        }
        throw new Ad.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            String name = cls.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            return name;
        }
        Sequence sequenceQ = kotlin.sequences.k.q(type, b.f48415a);
        return ((Class) kotlin.sequences.k.M(sequenceQ)).getName() + StringsKt.E("[]", kotlin.sequences.k.z(sequenceQ));
    }
}
