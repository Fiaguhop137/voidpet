package p324s0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes.dex */
public final class k0 implements p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f53174b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f53175c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Function1 f53176d = a.f53178a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4143i0 f53177a;

    static final class a extends o implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f53178a = new a();

        a() {
            super(1);
        }

        public final void a(k0 k0Var) {
            if (k0Var.G0()) {
                k0Var.b().n0();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((k0) obj);
            return Unit.f48228a;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Function1 a() {
            return k0.f53176d;
        }
    }

    public k0(InterfaceC4143i0 interfaceC4143i0) {
        this.f53177a = interfaceC4143i0;
    }

    @Override // p324s0.p0
    public boolean G0() {
        return this.f53177a.k0().D1();
    }

    public final InterfaceC4143i0 b() {
        return this.f53177a;
    }
}
