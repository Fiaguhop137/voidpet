package I9;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class d implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ d f5097a = new d();

    private /* synthetic */ d() {
    }

    @Override // java.util.concurrent.Executor
    public final /* synthetic */ void execute(Runnable runnable) {
        runnable.run();
    }
}
