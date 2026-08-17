package G0;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class K implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Choreographer f3755a;

    public /* synthetic */ K(Choreographer choreographer) {
        this.f3755a = choreographer;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        M.e(this.f3755a, runnable);
    }
}
