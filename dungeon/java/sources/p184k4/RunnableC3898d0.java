package p184k4;

import com.applovin.impl.p;
import com.applovin.sdk.Axon;

/* JADX INFO: renamed from: k4.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3898d0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f47998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Axon.InitializationListener f47999b;

    public /* synthetic */ RunnableC3898d0(p pVar, Axon.InitializationListener initializationListener) {
        this.f47998a = pVar;
        this.f47999b = initializationListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47998a.a(this.f47999b);
    }
}
