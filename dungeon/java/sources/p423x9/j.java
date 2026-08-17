package p423x9;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TaskCompletionSource f57422a;

    j() {
        this.f57422a = null;
    }

    public j(TaskCompletionSource taskCompletionSource) {
        this.f57422a = taskCompletionSource;
    }

    protected abstract void a();

    final TaskCompletionSource b() {
        return this.f57422a;
    }

    public final void c(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f57422a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            c(e10);
        }
    }
}
