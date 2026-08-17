package L8;

import android.app.Activity;
import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class G implements D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Application f6415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p404w8.o f6416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1164n f6417c;

    G(Application application, p404w8.o oVar, C1164n c1164n) {
        this.f6415a = application;
        this.f6416b = oVar;
        this.f6417c = c1164n;
    }

    private final C0 c() {
        Activity activityD = this.f6416b.d();
        if (activityD != null) {
            return B0.a(activityD, this.f6417c.f6484b);
        }
        C1164n c1164n = this.f6417c;
        return B0.a(c1164n.f6483a, c1164n.f6484b);
    }

    @Override // L8.D
    public final Task a(I0 i10) {
        boolean z10 = false;
        if (i10.c4() == 0 && !p278p8.a.a(this.f6415a)) {
            z10 = true;
        }
        Task taskA = c().a(i10, z10);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskA.continueWithTask(z0.a(), new F(this, i10, z10)).addOnCompleteListener(z0.a(), new E(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    final /* synthetic */ Task b(I0 i10, boolean z10, Task task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            if ((exception instanceof p135h8.b) && ((p135h8.b) exception).b() == 20) {
                Y.a("GamesAuthenticator", "Service connection suspended during the first sign-in attempt. Trying again.");
                return c().a(i10, z10);
            }
        }
        return task;
    }
}
