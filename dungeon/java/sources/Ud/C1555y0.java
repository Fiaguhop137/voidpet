package Ud;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.AbstractC3952n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import p015ae.InterfaceC1788b;
import p015ae.InterfaceC1791e;
import p015ae.InterfaceC1799m;

/* JADX INFO: renamed from: Ud.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1555y0 implements kotlin.reflect.j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.k[] f13685f = {kotlin.jvm.internal.F.j(new kotlin.jvm.internal.w(C1555y0.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", 0)), kotlin.jvm.internal.F.j(new kotlin.jvm.internal.w(C1555y0.class, "annotations", "getAnnotations()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A f13686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.j.a f13688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a1.a f13689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a1.a f13690e;

    /* JADX INFO: renamed from: Ud.y0$a */
    private static final class a implements Type {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Type[] f13691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f13692b;

        public a(Type[] types) {
            Intrinsics.checkNotNullParameter(types, "types");
            this.f13691a = types;
            this.f13692b = Arrays.hashCode(types);
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && Arrays.equals(this.f13691a, ((a) obj).f13691a);
        }

        @Override // java.lang.reflect.Type
        public String getTypeName() {
            return AbstractC3952n.n0(this.f13691a, ", ", "[", "]", 0, null, null, 56, null);
        }

        public int hashCode() {
            return this.f13692b;
        }

        public String toString() {
            return getTypeName();
        }
    }

    public C1555y0(A callable, int i10, kotlin.reflect.j.a kind, Function0 computeDescriptor) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(computeDescriptor, "computeDescriptor");
        this.f13686a = callable;
        this.f13687b = i10;
        this.f13688c = kind;
        this.f13689d = a1.c(computeDescriptor);
        this.f13690e = a1.c(new C1551w0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type c(C1555y0 c1555y0) {
        List listI0;
        p015ae.W w10 = c1555y0.w();
        if ((w10 instanceof p015ae.c0) && Intrinsics.b(j1.i(c1555y0.f13686a.b0()), w10) && c1555y0.f13686a.b0().j() == InterfaceC1788b.a.FAKE_OVERRIDE) {
            InterfaceC1799m interfaceC1799mB = c1555y0.f13686a.b0().b();
            Intrinsics.d(interfaceC1799mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Class clsQ = j1.q((InterfaceC1791e) interfaceC1799mB);
            if (clsQ != null) {
                return clsQ;
            }
            throw new Y0("Cannot determine receiver Java type of inherited declaration: " + w10);
        }
        Vd.h hVarT = c1555y0.f13686a.T();
        if (!(hVarT instanceof Vd.n)) {
            if (!(hVarT instanceof Vd.n.b)) {
                return (Type) hVarT.a().get(c1555y0.getIndex());
            }
            Class[] clsArr = (Class[]) ((Collection) ((Vd.n.b) hVarT).e().get(c1555y0.getIndex())).toArray(new Class[0]);
            return c1555y0.r((Type[]) Arrays.copyOf(clsArr, clsArr.length));
        }
        if (c1555y0.f13686a.Z()) {
            Vd.n nVar = (Vd.n) hVarT;
            IntRange intRangeF = nVar.f(c1555y0.getIndex() + 1);
            int iH = nVar.f(0).h() + 1;
            listI0 = CollectionsKt.I0(nVar.a(), new IntRange(intRangeF.g() - iH, intRangeF.h() - iH));
        } else {
            Vd.n nVar2 = (Vd.n) hVarT;
            listI0 = CollectionsKt.I0(nVar2.a(), nVar2.f(c1555y0.getIndex()));
        }
        Type[] typeArr = (Type[]) listI0.toArray(new Type[0]);
        return c1555y0.r((Type[]) Arrays.copyOf(typeArr, typeArr.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List q(C1555y0 c1555y0) {
        return j1.e(c1555y0.w());
    }

    private final Type r(Type... typeArr) {
        int length = typeArr.length;
        if (length != 0) {
            return length != 1 ? new a(typeArr) : (Type) AbstractC3952n.v0(typeArr);
        }
        throw new Ld.b("Expected at least 1 type for compound type");
    }

    private final p015ae.W w() {
        Object objB = this.f13689d.b(this, f13685f[0]);
        Intrinsics.checkNotNullExpressionValue(objB, "getValue(...)");
        return (p015ae.W) objB;
    }

    @Override // kotlin.reflect.j
    public boolean b() {
        p015ae.W w10 = w();
        return (w10 instanceof p015ae.t0) && ((p015ae.t0) w10).v0() != null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1555y0)) {
            return false;
        }
        C1555y0 c1555y0 = (C1555y0) obj;
        return Intrinsics.b(this.f13686a, c1555y0.f13686a) && getIndex() == c1555y0.getIndex();
    }

    @Override // kotlin.reflect.b
    public List getAnnotations() {
        Object objB = this.f13690e.b(this, f13685f[1]);
        Intrinsics.checkNotNullExpressionValue(objB, "getValue(...)");
        return (List) objB;
    }

    @Override // kotlin.reflect.j
    public int getIndex() {
        return this.f13687b;
    }

    @Override // kotlin.reflect.j
    public String getName() {
        p015ae.W w10 = w();
        p015ae.t0 t0Var = w10 instanceof p015ae.t0 ? (p015ae.t0) w10 : null;
        if (t0Var == null || t0Var.b().j0()) {
            return null;
        }
        p464ze.f name = t0Var.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (name.r()) {
            return null;
        }
        return name.g();
    }

    @Override // kotlin.reflect.j
    public kotlin.reflect.o getType() {
        Re.S type = w().getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return new U0(type, new C1553x0(this));
    }

    public int hashCode() {
        return (this.f13686a.hashCode() * 31) + Integer.hashCode(getIndex());
    }

    @Override // kotlin.reflect.j
    public kotlin.reflect.j.a j() {
        return this.f13688c;
    }

    public String toString() {
        return e1.f13592a.j(this);
    }

    @Override // kotlin.reflect.j
    public boolean u() {
        p015ae.W w10 = w();
        p015ae.t0 t0Var = w10 instanceof p015ae.t0 ? (p015ae.t0) w10 : null;
        if (t0Var != null) {
            return He.e.f(t0Var);
        }
        return false;
    }

    public final A v() {
        return this.f13686a;
    }
}
