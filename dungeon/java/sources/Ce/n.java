package Ce;

import Re.B0;
import Re.S;
import kotlin.Unit;
import kotlin.collections.W;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p015ae.EnumC1792f;
import p015ae.InterfaceC1791e;
import p015ae.InterfaceC1795i;
import p015ae.InterfaceC1799m;
import p015ae.l0;
import p015ae.t0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f1878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f1879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f1880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f1881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f1882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n f1883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n f1884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n f1885h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final n f1886i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final n f1887j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final n f1888k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final n f1889l;

    public static final class a {

        /* JADX INFO: renamed from: Ce.n$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0041a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f1890a;

            static {
                int[] iArr = new int[EnumC1792f.values().length];
                try {
                    iArr[EnumC1792f.CLASS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC1792f.INTERFACE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC1792f.ENUM_CLASS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC1792f.OBJECT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC1792f.ANNOTATION_CLASS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC1792f.ENUM_ENTRY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f1890a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(InterfaceC1795i classifier) {
            Intrinsics.checkNotNullParameter(classifier, "classifier");
            if (classifier instanceof l0) {
                return "typealias";
            }
            if (!(classifier instanceof InterfaceC1791e)) {
                throw new AssertionError("Unexpected classifier: " + classifier);
            }
            InterfaceC1791e interfaceC1791e = (InterfaceC1791e) classifier;
            if (interfaceC1791e.d0()) {
                return "companion object";
            }
            switch (C0041a.f1890a[interfaceC1791e.j().ordinal()]) {
                case 1:
                    return "class";
                case 2:
                    return "interface";
                case 3:
                    return "enum class";
                case 4:
                    return "object";
                case 5:
                    return "annotation class";
                case 6:
                    return "enum entry";
                default:
                    throw new Ad.n();
            }
        }

        public final n b(Function1 changeOptions) {
            Intrinsics.checkNotNullParameter(changeOptions, "changeOptions");
            z zVar = new z();
            changeOptions.invoke(zVar);
            zVar.q0();
            return new u(zVar);
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f1891a = new a();

            private a() {
            }

            @Override // Ce.n.b
            public void a(t0 parameter, int i10, int i11, StringBuilder builder) {
                Intrinsics.checkNotNullParameter(parameter, "parameter");
                Intrinsics.checkNotNullParameter(builder, "builder");
                if (i10 != i11 - 1) {
                    builder.append(", ");
                }
            }

            @Override // Ce.n.b
            public void b(t0 parameter, int i10, int i11, StringBuilder builder) {
                Intrinsics.checkNotNullParameter(parameter, "parameter");
                Intrinsics.checkNotNullParameter(builder, "builder");
            }

            @Override // Ce.n.b
            public void c(int i10, StringBuilder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.append("(");
            }

            @Override // Ce.n.b
            public void d(int i10, StringBuilder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.append(")");
            }
        }

        void a(t0 t0Var, int i10, int i11, StringBuilder sb2);

        void b(t0 t0Var, int i10, int i11, StringBuilder sb2);

        void c(int i10, StringBuilder sb2);

        void d(int i10, StringBuilder sb2);
    }

    static {
        a aVar = new a(null);
        f1878a = aVar;
        f1879b = aVar.b(C0907c.f1867a);
        f1880c = aVar.b(C0909e.f1869a);
        f1881d = aVar.b(C0910f.f1870a);
        f1882e = aVar.b(C0911g.f1871a);
        f1883f = aVar.b(h.f1872a);
        f1884g = aVar.b(i.f1873a);
        f1885h = aVar.b(j.f1874a);
        f1886i = aVar.b(k.f1875a);
        f1887j = aVar.b(l.f1876a);
        f1888k = aVar.b(m.f1877a);
        f1889l = aVar.b(C0908d.f1868a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(w withOptions) {
        Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
        withOptions.l(W.d());
        return Unit.f48228a;
    }

    public static /* synthetic */ String O(n nVar, p033be.c cVar, p033be.e eVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderAnnotation");
        }
        if ((i10 & 2) != 0) {
            eVar = null;
        }
        return nVar.N(cVar, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(w withOptions) {
        Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
        withOptions.c(false);
        withOptions.l(W.d());
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(w withOptions) {
        Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
        withOptions.c(false);
        withOptions.l(W.d());
        withOptions.f(true);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(w withOptions) {
        Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
        withOptions.c(false);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(w withOptions) {
        Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
        withOptions.l(W.d());
        withOptions.e(InterfaceC0906b.C0040b.f1865a);
        withOptions.o(D.ONLY_NON_SYNTHESIZED);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(w withOptions) {
        Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
        withOptions.m(true);
        withOptions.e(InterfaceC0906b.a.f1864a);
        withOptions.l(v.f1906d);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(w withOptions) {
        Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
        withOptions.l(v.f1905c);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(w withOptions) {
        Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
        withOptions.l(v.f1906d);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(w withOptions) {
        Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
        withOptions.a(F.f1854b);
        withOptions.l(v.f1906d);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(w withOptions) {
        Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
        withOptions.c(false);
        withOptions.l(W.d());
        withOptions.e(InterfaceC0906b.C0040b.f1865a);
        withOptions.p(true);
        withOptions.o(D.NONE);
        withOptions.g(true);
        withOptions.n(true);
        withOptions.f(true);
        withOptions.b(true);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(w withOptions) {
        Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
        withOptions.e(InterfaceC0906b.C0040b.f1865a);
        withOptions.o(D.ONLY_NON_SYNTHESIZED);
        return Unit.f48228a;
    }

    public abstract String M(InterfaceC1799m interfaceC1799m);

    public abstract String N(p033be.c cVar, p033be.e eVar);

    public abstract String P(String str, String str2, Xd.i iVar);

    public abstract String Q(p464ze.d dVar);

    public abstract String R(p464ze.f fVar, boolean z10);

    public abstract String S(S s10);

    public abstract String T(B0 b10);

    public final n U(Function1 changeOptions) {
        Intrinsics.checkNotNullParameter(changeOptions, "changeOptions");
        Intrinsics.d(this, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
        z zVarS = ((u) this).K0().s();
        changeOptions.invoke(zVarS);
        zVarS.q0();
        return new u(zVarS);
    }
}
