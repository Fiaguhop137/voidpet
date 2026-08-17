package Ud;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.AbstractC3952n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InterfaceC3977n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import p015ae.InterfaceC1791e;
import p015ae.InterfaceC1794h;
import p123ge.AbstractC3442f;

/* JADX INFO: loaded from: classes3.dex */
public final class U0 implements InterfaceC3977n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.k[] f13527e = {kotlin.jvm.internal.F.j(new kotlin.jvm.internal.w(U0.class, "classifier", "getClassifier()Lkotlin/reflect/KClassifier;", 0)), kotlin.jvm.internal.F.j(new kotlin.jvm.internal.w(U0.class, "arguments", "getArguments()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Re.S f13528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a1.a f13529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a1.a f13530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a1.a f13531d;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13532a;

        static {
            int[] iArr = new int[Re.N0.values().length];
            try {
                iArr[Re.N0.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Re.N0.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Re.N0.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13532a = iArr;
        }
    }

    public U0(Re.S type, Function0 function0) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f13528a = type;
        a1.a aVarC = null;
        a1.a aVar = function0 instanceof a1.a ? (a1.a) function0 : null;
        if (aVar != null) {
            aVarC = aVar;
        } else if (function0 != null) {
            aVarC = a1.c(function0);
        }
        this.f13529b = aVarC;
        this.f13530c = a1.c(new Q0(this));
        this.f13531d = a1.c(new R0(this, function0));
    }

    public /* synthetic */ U0(Re.S s10, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(s10, (i10 & 2) != 0 ? null : function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List r(U0 u10, Function0 function0) {
        KTypeProjection kTypeProjectionD;
        List listL0 = u10.f13528a.L0();
        if (listL0.isEmpty()) {
            return CollectionsKt.l();
        }
        Lazy lazyA = Ad.j.a(Ad.m.PUBLICATION, new S0(u10));
        ArrayList arrayList = new ArrayList(CollectionsKt.w(listL0, 10));
        int i10 = 0;
        for (Object obj : listL0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.v();
            }
            Re.B0 b10 = (Re.B0) obj;
            if (b10.a()) {
                kTypeProjectionD = KTypeProjection.INSTANCE.c();
            } else {
                Re.S type = b10.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                U0 u11 = new U0(type, function0 == null ? null : new T0(u10, i10, lazyA));
                int i12 = a.f13532a[b10.b().ordinal()];
                if (i12 == 1) {
                    kTypeProjectionD = KTypeProjection.INSTANCE.d(u11);
                } else if (i12 == 2) {
                    kTypeProjectionD = KTypeProjection.INSTANCE.a(u11);
                } else {
                    if (i12 != 3) {
                        throw new Ad.n();
                    }
                    kTypeProjectionD = KTypeProjection.INSTANCE.b(u11);
                }
            }
            arrayList.add(kTypeProjectionD);
            i10 = i11;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List v(U0 u10) {
        Type typeF = u10.f();
        Intrinsics.c(typeF);
        return AbstractC3442f.h(typeF);
    }

    private static final List w(Lazy lazy) {
        return (List) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type x(U0 u10, int i10, Lazy lazy) {
        Type typeF = u10.f();
        if (typeF instanceof Class) {
            Class cls = (Class) typeF;
            Class<?> componentType = cls.isArray() ? cls.getComponentType() : Object.class;
            Intrinsics.c(componentType);
            return componentType;
        }
        if (typeF instanceof GenericArrayType) {
            if (i10 == 0) {
                Type genericComponentType = ((GenericArrayType) typeF).getGenericComponentType();
                Intrinsics.c(genericComponentType);
                return genericComponentType;
            }
            throw new Y0("Array type has been queried for a non-0th argument: " + u10);
        }
        if (!(typeF instanceof ParameterizedType)) {
            throw new Y0("Non-generic type has been queried for arguments: " + u10);
        }
        Type type = (Type) w(lazy).get(i10);
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        Intrinsics.checkNotNullExpressionValue(lowerBounds, "getLowerBounds(...)");
        Type type2 = (Type) AbstractC3952n.S(lowerBounds);
        if (type2 == null) {
            Type[] upperBounds = wildcardType.getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            type2 = (Type) AbstractC3952n.R(upperBounds);
        }
        Intrinsics.c(type2);
        return type2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.reflect.e y(U0 u10) {
        return u10.z(u10.f13528a);
    }

    private final kotlin.reflect.e z(Re.S s10) {
        Re.S type;
        InterfaceC1794h interfaceC1794hP = s10.N0().p();
        if (!(interfaceC1794hP instanceof InterfaceC1791e)) {
            if (interfaceC1794hP instanceof p015ae.m0) {
                return new W0(null, (p015ae.m0) interfaceC1794hP);
            }
            if (!(interfaceC1794hP instanceof p015ae.l0)) {
                return null;
            }
            throw new Ad.o("An operation is not implemented: Type alias classifiers are not yet supported");
        }
        Class clsQ = j1.q((InterfaceC1791e) interfaceC1794hP);
        if (clsQ == null) {
            return null;
        }
        if (!clsQ.isArray()) {
            if (Re.J0.l(s10)) {
                return new X(clsQ);
            }
            Class clsI = AbstractC3442f.i(clsQ);
            if (clsI != null) {
                clsQ = clsI;
            }
            return new X(clsQ);
        }
        Re.B0 b10 = (Re.B0) CollectionsKt.H0(s10.L0());
        if (b10 == null || (type = b10.getType()) == null) {
            return new X(clsQ);
        }
        kotlin.reflect.e eVarZ = z(type);
        if (eVarZ != null) {
            return new X(j1.f(Ld.a.b(Td.b.a(eVarZ))));
        }
        throw new Y0("Cannot determine classifier for array element type: " + this);
    }

    public final Re.S A() {
        return this.f13528a;
    }

    @Override // kotlin.reflect.o
    public kotlin.reflect.e e() {
        return (kotlin.reflect.e) this.f13530c.b(this, f13527e[0]);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof U0)) {
            return false;
        }
        U0 u10 = (U0) obj;
        return Intrinsics.b(this.f13528a, u10.f13528a) && Intrinsics.b(e(), u10.e()) && Intrinsics.b(k(), u10.k());
    }

    @Override // kotlin.jvm.internal.InterfaceC3977n
    public Type f() {
        a1.a aVar = this.f13529b;
        if (aVar != null) {
            return (Type) aVar.invoke();
        }
        return null;
    }

    @Override // kotlin.reflect.b
    public List getAnnotations() {
        return j1.e(this.f13528a);
    }

    public int hashCode() {
        int iHashCode = this.f13528a.hashCode() * 31;
        kotlin.reflect.e eVarE = e();
        return ((iHashCode + (eVarE != null ? eVarE.hashCode() : 0)) * 31) + k().hashCode();
    }

    @Override // kotlin.reflect.o
    public List k() {
        Object objB = this.f13531d.b(this, f13527e[1]);
        Intrinsics.checkNotNullExpressionValue(objB, "getValue(...)");
        return (List) objB;
    }

    @Override // kotlin.reflect.o
    public boolean l() {
        return this.f13528a.O0();
    }

    public String toString() {
        return e1.f13592a.l(this.f13528a);
    }
}
