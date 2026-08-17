package io.sentry.android.core;

import io.sentry.C3833z3;
import io.sentry.EnumC3721i3;
import io.sentry.EnumC3727k;
import io.sentry.InterfaceC3619a0;
import io.sentry.InterfaceC3698e0;
import io.sentry.InterfaceC3753p0;
import io.sentry.T1;
import io.sentry.W1;
import io.sentry.util.C3799a;
import java.io.Closeable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
final class SendCachedEnvelopeIntegration implements InterfaceC3753p0, io.sentry.M.b, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W1 f44748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.util.p f44749b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private io.sentry.M f44751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC3619a0 f44752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SentryAndroidOptions f44753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private T1 f44754g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f44750c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f44755h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f44756i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C3799a f44757j = new C3799a();

    public SendCachedEnvelopeIntegration(W1 w10, io.sentry.util.p pVar) {
        this.f44748a = (W1) io.sentry.util.w.c(w10, "SendFireAndForgetFactory is required");
        this.f44749b = pVar;
    }

    public static /* synthetic */ void a(SendCachedEnvelopeIntegration sendCachedEnvelopeIntegration, SentryAndroidOptions sentryAndroidOptions, InterfaceC3619a0 interfaceC3619a0) {
        sendCachedEnvelopeIntegration.getClass();
        try {
            if (sendCachedEnvelopeIntegration.f44756i.get()) {
                sentryAndroidOptions.getLogger().c(EnumC3721i3.INFO, "SendCachedEnvelopeIntegration, not trying to send after closing.", new Object[0]);
                return;
            }
            if (!sendCachedEnvelopeIntegration.f44755h.getAndSet(true)) {
                io.sentry.M connectionStatusProvider = sentryAndroidOptions.getConnectionStatusProvider();
                sendCachedEnvelopeIntegration.f44751d = connectionStatusProvider;
                connectionStatusProvider.k3(sendCachedEnvelopeIntegration);
                sendCachedEnvelopeIntegration.f44754g = sendCachedEnvelopeIntegration.f44748a.c(interfaceC3619a0, sentryAndroidOptions);
            }
            io.sentry.M m10 = sendCachedEnvelopeIntegration.f44751d;
            if (m10 != null && m10.o1() == io.sentry.M.a.DISCONNECTED) {
                sentryAndroidOptions.getLogger().c(EnumC3721i3.INFO, "SendCachedEnvelopeIntegration, no connection.", new Object[0]);
                return;
            }
            io.sentry.transport.z zVarW = interfaceC3619a0.w();
            if (zVarW != null && zVarW.i(EnumC3727k.All)) {
                sentryAndroidOptions.getLogger().c(EnumC3721i3.INFO, "SendCachedEnvelopeIntegration, rate limiting active.", new Object[0]);
                return;
            }
            T1 t10 = sendCachedEnvelopeIntegration.f44754g;
            if (t10 == null) {
                sentryAndroidOptions.getLogger().c(EnumC3721i3.ERROR, "SendCachedEnvelopeIntegration factory is null.", new Object[0]);
            } else {
                t10.a();
            }
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().b(EnumC3721i3.ERROR, "Failed trying to send cached events.", th);
        }
    }

    private void d(InterfaceC3619a0 interfaceC3619a0, SentryAndroidOptions sentryAndroidOptions) {
        try {
            InterfaceC3698e0 interfaceC3698e0A = this.f44757j.a();
            try {
                Future futureSubmit = sentryAndroidOptions.getExecutorService().submit(new V0(this, sentryAndroidOptions, interfaceC3619a0));
                if (((Boolean) this.f44749b.a()).booleanValue() && this.f44750c.compareAndSet(false, true)) {
                    sentryAndroidOptions.getLogger().c(EnumC3721i3.DEBUG, "Startup Crash marker exists, blocking flush.", new Object[0]);
                    try {
                        futureSubmit.get(sentryAndroidOptions.getStartupCrashFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
                    } catch (TimeoutException unused) {
                        sentryAndroidOptions.getLogger().c(EnumC3721i3.DEBUG, "Synchronous send timed out, continuing in the background.", new Object[0]);
                    }
                }
                sentryAndroidOptions.getLogger().c(EnumC3721i3.DEBUG, "SendCachedEnvelopeIntegration installed.", new Object[0]);
                if (interfaceC3698e0A != null) {
                    interfaceC3698e0A.close();
                }
            } catch (Throwable th) {
                if (interfaceC3698e0A != null) {
                    try {
                        interfaceC3698e0A.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (RejectedExecutionException e10) {
            sentryAndroidOptions.getLogger().b(EnumC3721i3.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", e10);
        } catch (Throwable th3) {
            sentryAndroidOptions.getLogger().b(EnumC3721i3.ERROR, "Failed to call the executor. Cached events will not be sent", th3);
        }
    }

    @Override // io.sentry.M.b
    public void b(io.sentry.M.a aVar) {
        SentryAndroidOptions sentryAndroidOptions;
        InterfaceC3619a0 interfaceC3619a0 = this.f44752e;
        if (interfaceC3619a0 == null || (sentryAndroidOptions = this.f44753f) == null || aVar == io.sentry.M.a.DISCONNECTED) {
            return;
        }
        d(interfaceC3619a0, sentryAndroidOptions);
    }

    @Override // io.sentry.InterfaceC3753p0
    public void c(InterfaceC3619a0 interfaceC3619a0, C3833z3 c3833z3) {
        this.f44752e = (InterfaceC3619a0) io.sentry.util.w.c(interfaceC3619a0, "Scopes are required");
        this.f44753f = (SentryAndroidOptions) io.sentry.util.w.c(c3833z3 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c3833z3 : null, "SentryAndroidOptions is required");
        if (!this.f44748a.d(c3833z3.getCacheDirPath(), c3833z3.getLogger())) {
            c3833z3.getLogger().c(EnumC3721i3.ERROR, "No cache dir path is defined in options.", new Object[0]);
        } else {
            io.sentry.util.n.a("SendCachedEnvelope");
            d(interfaceC3619a0, this.f44753f);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f44756i.set(true);
        io.sentry.M m10 = this.f44751d;
        if (m10 != null) {
            m10.F3(this);
        }
    }
}
