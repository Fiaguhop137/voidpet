package io.sentry.transport;

/* JADX INFO: loaded from: classes3.dex */
public abstract class B {

    private static final class b extends B {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f46499a;

        b(int i10) {
            super(null);
            this.f46499a = i10;
        }

        @Override // io.sentry.transport.B
        public int c() {
            return this.f46499a;
        }

        @Override // io.sentry.transport.B
        public boolean d() {
            return false;
        }
    }

    private static final class c extends B {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f46500a = new c();

        private c() {
            super(null);
        }

        @Override // io.sentry.transport.B
        public int c() {
            return -1;
        }

        @Override // io.sentry.transport.B
        public boolean d() {
            return true;
        }
    }

    private B() {
    }

    /* synthetic */ B(a aVar) {
        this();
    }

    public static B a() {
        return b(-1);
    }

    public static B b(int i10) {
        return new b(i10);
    }

    public static B e() {
        return c.f46500a;
    }

    public abstract int c();

    public abstract boolean d();
}
