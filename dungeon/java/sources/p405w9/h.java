package p405w9;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f56713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f56714b = new Handler(Looper.getMainLooper());

    h(m mVar) {
        this.f56713a = mVar;
    }

    @Override // p405w9.c
    public final Task a(Activity activity, b bVar) {
        if (bVar.zzb()) {
            return Tasks.forResult(null);
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", bVar.f());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        intent.putExtra("result_receiver", new g(this, this.f56714b, taskCompletionSource));
        activity.startActivity(intent);
        return taskCompletionSource.getTask();
    }

    @Override // p405w9.c
    public final Task b() {
        return this.f56713a.a();
    }
}
