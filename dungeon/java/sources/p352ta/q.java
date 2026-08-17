package p352ta;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import p280pa.a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Callable f54615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f54616b;

    public /* synthetic */ q(Callable callable, TaskCompletionSource taskCompletionSource) {
        this.f54615a = callable;
        this.f54616b = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Callable callable = this.f54615a;
        TaskCompletionSource taskCompletionSource = this.f54616b;
        try {
            taskCompletionSource.setResult(callable.call());
        } catch (a e10) {
            taskCompletionSource.setException(e10);
        } catch (Exception e11) {
            taskCompletionSource.setException(new a("Internal error has occurred when executing ML Kit tasks", 13, e11));
        }
    }
}
