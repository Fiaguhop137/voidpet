package p352ta;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
enum r implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        g.a().f54597a.post(runnable);
    }
}
