package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC2896x0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Future f34819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final InterfaceC2892w0 f34820b;

    RunnableC2896x0(Future future, InterfaceC2892w0 interfaceC2892w0) {
        this.f34819a = future;
        this.f34820b = interfaceC2892w0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable thA;
        Future future = this.f34819a;
        if ((future instanceof K0) && (thA = L0.a((K0) future)) != null) {
            this.f34820b.b(thA);
            return;
        }
        try {
            if (!future.isDone()) {
                throw new IllegalStateException(A.b("Future was expected to be done: %s", future));
            }
            boolean z10 = false;
            Future future2 = future;
            while (true) {
                try {
                    obj = future2.get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    future2 = future2;
                } catch (Throwable th) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            this.f34820b.a(obj);
        } catch (ExecutionException e10) {
            this.f34820b.b(e10.getCause());
        } catch (Throwable th2) {
            this.f34820b.b(th2);
        }
    }

    public final String toString() {
        C2879t c2879tA = AbstractC2887v.a(this);
        c2879tA.a(this.f34820b);
        return c2879tA.toString();
    }
}
