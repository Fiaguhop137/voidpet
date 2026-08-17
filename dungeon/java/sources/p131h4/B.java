package p131h4;

import com.google.android.gms.internal.play_billing.O;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Future f42568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f42569b;

    public /* synthetic */ B(Future future, Runnable runnable) {
        this.f42568a = future;
        this.f42569b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Future future = this.f42568a;
        if (future.isDone() || future.isCancelled()) {
            return;
        }
        Runnable runnable = this.f42569b;
        future.cancel(true);
        O.m("BillingClient", "Async task is taking too long, cancel it!");
        if (runnable != null) {
            runnable.run();
        }
    }
}
