package L8;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class E implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f6408a;

    /* synthetic */ E(TaskCompletionSource taskCompletionSource) {
        this.f6408a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final /* synthetic */ void onComplete(Task task) {
        TaskCompletionSource taskCompletionSource = this.f6408a;
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(H.a(((K0) task.getResult()).zza()));
            return;
        }
        Exception exception = task.getException();
        if (exception instanceof p135h8.b) {
            taskCompletionSource.trySetResult(H.b(((p135h8.b) exception).a()));
        } else {
            AbstractC1153h0.a(exception);
            taskCompletionSource.trySetException(exception);
        }
    }
}
