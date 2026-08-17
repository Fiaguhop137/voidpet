package G0;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class L implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f3756a;

    public /* synthetic */ L(Runnable runnable) {
        this.f3756a = runnable;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        M.f(this.f3756a, j10);
    }
}
