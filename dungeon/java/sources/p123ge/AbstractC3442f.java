package p123ge;

import Ad.v;
import Ld.a;
import Md.b;
import Md.c;
import Md.e;
import Md.f;
import Md.g;
import Md.h;
import Md.i;
import Md.j;
import Md.k;
import Md.l;
import Md.m;
import Md.n;
import Md.o;
import Md.p;
import Md.q;
import Md.r;
import Md.s;
import Md.t;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC3952n;
import kotlin.collections.CollectionsKt;
import kotlin.collections.N;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.d;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: ge.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3442f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List f42376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f42377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f42378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f42379d;

    static {
        int i10 = 0;
        List<d> listO = CollectionsKt.o(F.b(Boolean.TYPE), F.b(Byte.TYPE), F.b(Character.TYPE), F.b(Double.TYPE), F.b(Float.TYPE), F.b(Integer.TYPE), F.b(Long.TYPE), F.b(Short.TYPE));
        f42376a = listO;
        ArrayList arrayList = new ArrayList(CollectionsKt.w(listO, 10));
        for (d dVar : listO) {
            arrayList.add(v.a(a.c(dVar), a.d(dVar)));
        }
        f42377b = N.r(arrayList);
        List<d> list = f42376a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.w(list, 10));
        for (d dVar2 : list) {
            arrayList2.add(v.a(a.d(dVar2), a.c(dVar2)));
        }
        f42378c = N.r(arrayList2);
        List listO2 = CollectionsKt.o(Function0.class, Function1.class, Function2.class, n.class, o.class, p.class, q.class, r.class, s.class, t.class, Md.a.class, b.class, c.class, Md.d.class, e.class, f.class, g.class, h.class, i.class, j.class, k.class, l.class, m.class);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.w(listO2, 10));
        for (Object obj : listO2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.v();
            }
            arrayList3.add(v.a((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f42379d = N.r(arrayList3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParameterizedType a(ParameterizedType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Type ownerType = it.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            return (ParameterizedType) ownerType;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Sequence b(ParameterizedType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Type[] actualTypeArguments = it.getActualTypeArguments();
        Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "getActualTypeArguments(...)");
        return AbstractC3952n.J(actualTypeArguments);
    }

    public static final p464ze.b e(Class cls) {
        p464ze.b bVarE;
        Intrinsics.checkNotNullParameter(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
            String simpleName = cls.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            if (simpleName.length() != 0) {
                Class<?> declaringClass = cls.getDeclaringClass();
                if (declaringClass != null && (bVarE = e(declaringClass)) != null) {
                    p464ze.f fVarP = p464ze.f.p(cls.getSimpleName());
                    Intrinsics.checkNotNullExpressionValue(fVarP, "identifier(...)");
                    p464ze.b bVarD = bVarE.d(fVarP);
                    if (bVarD != null) {
                        return bVarD;
                    }
                }
                ze.b.a aVar = p464ze.b.f58558d;
                String name = cls.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                return aVar.c(new p464ze.c(name));
            }
        }
        String name2 = cls.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        p464ze.c cVar = new p464ze.c(name2);
        return new p464ze.b(cVar.d(), p464ze.c.f58562c.a(cVar.f()), true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String f(Class cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                String name = cls.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                return StringsKt.H(name, '.', '/', false, 4, null);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append('L');
            String name2 = cls.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
            sb2.append(StringsKt.H(name2, '.', '/', false, 4, null));
            sb2.append(';');
            return sb2.toString();
        }
        String name3 = cls.getName();
        switch (name3.hashCode()) {
            case -1325958191:
                if (name3.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name3.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name3.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name3.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name3.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name3.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name3.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name3.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name3.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported primitive type: " + cls);
    }

    public static final Integer g(Class cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return (Integer) f42379d.get(cls);
    }

    public static final List h(Type type) {
        Intrinsics.checkNotNullParameter(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return CollectionsKt.l();
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return kotlin.sequences.k.V(kotlin.sequences.k.H(kotlin.sequences.k.q(type, C3440d.f42374a), C3441e.f42375a));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "getActualTypeArguments(...)");
        return AbstractC3952n.J0(actualTypeArguments);
    }

    public static final Class i(Class cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return (Class) f42377b.get(cls);
    }

    public static final ClassLoader j(Class cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        Intrinsics.checkNotNullExpressionValue(systemClassLoader, "getSystemClassLoader(...)");
        return systemClassLoader;
    }

    public static final Class k(Class cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return (Class) f42378c.get(cls);
    }

    public static final boolean l(Class cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return Enum.class.isAssignableFrom(cls);
    }
}
