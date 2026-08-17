package G8;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.common.C2342k;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements AppSetIdClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AppSetIdClient f3968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AppSetIdClient f3969b;

    public r(Context context) {
        this.f3968a = new p(context, C2342k.f());
        this.f3969b = l.c(context);
    }

    public static /* synthetic */ Task a(r rVar, Task task) {
        if (!task.isSuccessful() && !task.isCanceled()) {
            Exception exception = task.getException();
            if (exception instanceof p135h8.b) {
                int iB = ((p135h8.b) exception).b();
                if (iB == 43001 || iB == 43002 || iB == 43003 || iB == 17) {
                    return rVar.f3969b.getAppSetIdInfo();
                }
                if (iB == 43000) {
                    return Tasks.forException(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
                }
                if (iB == 15) {
                    return Tasks.forException(new Exception("The operation to get app set ID timed out. Please try again later."));
                }
            }
        }
        return task;
    }

    @Override // com.google.android.gms.appset.AppSetIdClient
    public final Task getAppSetIdInfo() {
        return this.f3968a.getAppSetIdInfo().continueWithTask(new q(this));
    }
}
