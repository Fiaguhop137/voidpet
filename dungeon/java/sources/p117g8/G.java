package p117g8;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class G implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ G f42186a = new G();

    private /* synthetic */ G() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
