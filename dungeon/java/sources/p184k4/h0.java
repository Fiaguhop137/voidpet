package p184k4;

import com.applovin.impl.p0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f48003a;

    public /* synthetic */ h0(p0 p0Var) {
        this.f48003a = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48003a.notifyDataSetChanged();
    }
}
