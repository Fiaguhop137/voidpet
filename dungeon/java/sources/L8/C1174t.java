package L8;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: L8.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1174t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1160l f6503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TaskCompletionSource f6504b;

    public C1174t(InterfaceC1160l interfaceC1160l, TaskCompletionSource taskCompletionSource) {
        this.f6503a = interfaceC1160l;
        this.f6504b = taskCompletionSource;
    }

    public final void a(p135h8.e eVar) {
        this.f6503a.a(eVar).addOnCompleteListener(z0.a(), new C1173s(this));
    }

    public final void b(Exception exc) {
        this.f6504b.setException(exc);
    }

    final /* synthetic */ void c(Task task) {
        if (task.isSuccessful()) {
            this.f6504b.setResult(task.getResult());
            return;
        }
        TaskCompletionSource taskCompletionSource = this.f6504b;
        Exception exception = task.getException();
        AbstractC1153h0.a(exception);
        taskCompletionSource.setException(exception);
    }
}
