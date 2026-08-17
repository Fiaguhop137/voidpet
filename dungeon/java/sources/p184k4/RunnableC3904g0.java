package p184k4;

import com.applovin.sdk.Axon;

/* JADX INFO: renamed from: k4.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3904g0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Axon.InitializationListener f48002a;

    public /* synthetic */ RunnableC3904g0(Axon.InitializationListener initializationListener) {
        this.f48002a = initializationListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48002a.onInitialized();
    }
}
