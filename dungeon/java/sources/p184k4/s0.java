package p184k4;

import com.applovin.impl.r2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r2 f48020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Thread f48021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f48022c;

    public /* synthetic */ s0(r2 r2Var, Thread thread, long j10) {
        this.f48020a = r2Var;
        this.f48021b = thread;
        this.f48022c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48020a.a(this.f48021b, this.f48022c);
    }
}
