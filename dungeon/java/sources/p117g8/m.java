package p117g8;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ m f42211a = new m();

    private /* synthetic */ m() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
