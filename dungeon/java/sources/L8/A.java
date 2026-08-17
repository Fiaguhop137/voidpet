package L8;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class A implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f6397a;

    /* synthetic */ A(TaskCompletionSource taskCompletionSource) {
        this.f6397a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final /* synthetic */ void onComplete(Task task) {
        TaskCompletionSource taskCompletionSource = this.f6397a;
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
            return;
        }
        Exception exception = task.getException();
        AbstractC1153h0.a(exception);
        taskCompletionSource.trySetException(exception);
    }
}
