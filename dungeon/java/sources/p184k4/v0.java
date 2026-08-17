package p184k4;

import com.applovin.impl.s0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0 f48024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f48025b;

    public /* synthetic */ v0(s0 s0Var, long j10) {
        this.f48024a = s0Var;
        this.f48025b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48024a.a(this.f48025b);
    }
}
