package io.sentry;

/* JADX INFO: renamed from: io.sentry.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3747o implements InterfaceC3683b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f46026a = new ThreadLocal();

    /* JADX INFO: renamed from: io.sentry.o$a */
    static final class a implements InterfaceC3698e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC3619a0 f46027a;

        a(InterfaceC3619a0 interfaceC3619a0) {
            this.f46027a = interfaceC3619a0;
        }

        @Override // io.sentry.InterfaceC3698e0, java.lang.AutoCloseable
        public void close() {
            C3747o.f46026a.set(this.f46027a);
        }
    }

    @Override // io.sentry.InterfaceC3683b0
    public void a() {
    }

    @Override // io.sentry.InterfaceC3683b0
    public InterfaceC3698e0 b(InterfaceC3619a0 interfaceC3619a0) {
        InterfaceC3619a0 interfaceC3619a1 = get();
        f46026a.set(interfaceC3619a0);
        return new a(interfaceC3619a1);
    }

    @Override // io.sentry.InterfaceC3683b0
    public void close() {
        f46026a.remove();
    }

    @Override // io.sentry.InterfaceC3683b0
    public InterfaceC3619a0 get() {
        return (InterfaceC3619a0) f46026a.get();
    }
}
