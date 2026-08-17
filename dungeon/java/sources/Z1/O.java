package Z1;

import U1.C1464f;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1464f f18017a;

    public /* synthetic */ O(C1464f c1464f) {
        this.f18017a = c1464f;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f18017a.e(runnable);
    }
}
