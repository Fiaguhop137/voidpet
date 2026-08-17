package L8;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: L8.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class C1180z implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f6524a;

    /* synthetic */ C1180z(TaskCompletionSource taskCompletionSource) {
        this.f6524a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final /* synthetic */ void onComplete(Task task) {
        TaskCompletionSource taskCompletionSource = this.f6524a;
        if (task.isSuccessful() && ((Boolean) task.getResult()).booleanValue()) {
            taskCompletionSource.trySetResult(p350t8.b.f54542b);
        } else {
            taskCompletionSource.trySetResult(p350t8.b.f54543c);
        }
    }
}
