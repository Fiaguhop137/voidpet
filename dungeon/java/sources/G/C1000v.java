package G;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: G.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1000v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f3698c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0982c f3699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private O0.d f3700b;

    /* JADX INFO: renamed from: G.v$a */
    public static final class a {

        /* JADX INFO: renamed from: G.v$a$a, reason: collision with other inner class name */
        static final class C0083a extends kotlin.jvm.internal.o implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0083a f3701a = new C0083a();

            C0083a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EnumC1001w invoke(R.m Saver, C1000v it) {
                Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                Intrinsics.checkNotNullParameter(it, "it");
                return it.d();
            }
        }

        /* JADX INFO: renamed from: G.v$a$b */
        static final class b extends kotlin.jvm.internal.o implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1 f3702a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Function1 function1) {
                super(1);
                this.f3702a = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C1000v invoke(EnumC1001w it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new C1000v(it, this.f3702a);
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final R.i a(Function1 confirmStateChange) {
            Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            return R.l.e(C0083a.f3701a, new b(confirmStateChange));
        }
    }

    /* JADX INFO: renamed from: G.v$b */
    static final class b extends kotlin.jvm.internal.o implements Function1 {
        b() {
            super(1);
        }

        public final Float a(float f10) {
            return Float.valueOf(C1000v.this.f().e1(AbstractC0999u.f3633b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).floatValue());
        }
    }

    /* JADX INFO: renamed from: G.v$c */
    static final class c extends kotlin.jvm.internal.o implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(C1000v.this.f().e1(AbstractC0999u.f3634c));
        }
    }

    public C1000v(EnumC1001w initialValue, Function1 confirmStateChange) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        this.f3699a = new C0982c(initialValue, new b(), new c(), AbstractC0999u.f3635d, confirmStateChange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final O0.d f() {
        O0.d dVar = this.f3700b;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(("The density on DrawerState (" + this + ") was not set. Did you use DrawerState with the Drawer composable?").toString());
    }

    public final Object b(Ed.b bVar) {
        Object objG = AbstractC0981b.g(this.f3699a, EnumC1001w.Closed, 0.0f, bVar, 2, null);
        return objG == Fd.b.e() ? objG : Unit.f48228a;
    }

    public final C0982c c() {
        return this.f3699a;
    }

    public final EnumC1001w d() {
        return (EnumC1001w) this.f3699a.u();
    }

    public final boolean e() {
        return d() == EnumC1001w.Open;
    }

    public final float g() {
        return this.f3699a.D();
    }

    public final void h(O0.d dVar) {
        this.f3700b = dVar;
    }
}
