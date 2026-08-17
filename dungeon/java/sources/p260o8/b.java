package p260o8;

import android.os.Process;

/* JADX INFO: loaded from: classes2.dex */
final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f50458a;

    public b(Runnable runnable, int i10) {
        this.f50458a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f50458a.run();
    }
}
