package io.sentry;

import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class ShutdownHookIntegration implements InterfaceC3753p0, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runtime f44474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Thread f44475b;

    public ShutdownHookIntegration() {
        this(Runtime.getRuntime());
    }

    public ShutdownHookIntegration(Runtime runtime) {
        this.f44474a = (Runtime) io.sentry.util.w.c(runtime, "Runtime is required");
    }

    public static /* synthetic */ void a(ShutdownHookIntegration shutdownHookIntegration, C3833z3 c3833z3) {
        shutdownHookIntegration.f44474a.addShutdownHook(shutdownHookIntegration.f44475b);
        c3833z3.getLogger().c(EnumC3721i3.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
        io.sentry.util.n.a("ShutdownHook");
    }

    private void e(Runnable runnable) {
        try {
            runnable.run();
        } catch (IllegalStateException e10) {
            String message = e10.getMessage();
            if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                throw e10;
            }
        }
    }

    @Override // io.sentry.InterfaceC3753p0
    public void c(InterfaceC3619a0 interfaceC3619a0, C3833z3 c3833z3) {
        io.sentry.util.w.c(interfaceC3619a0, "Scopes are required");
        io.sentry.util.w.c(c3833z3, "SentryOptions is required");
        if (!c3833z3.isEnableShutdownHook()) {
            c3833z3.getLogger().c(EnumC3721i3.INFO, "enableShutdownHook is disabled.", new Object[0]);
        } else {
            this.f44475b = new Thread(new Q3(interfaceC3619a0, c3833z3), "sentry-shutdownhook");
            e(new R3(this, c3833z3));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f44475b != null) {
            e(new P3(this));
        }
    }
}
