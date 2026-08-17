package B8;

import L8.HandlerC1143c0;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class a extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TaskCompletionSource f593a;

    public a() {
        super(new HandlerC1143c0(Looper.getMainLooper()));
        this.f593a = new TaskCompletionSource();
    }

    public final Task f() {
        return this.f593a.getTask();
    }

    @Override // android.os.ResultReceiver
    protected final void onReceiveResult(int i10, Bundle bundle) {
        Intent intent;
        super.onReceiveResult(i10, bundle);
        boolean z10 = i10 == -1;
        if (bundle == null || (intent = (Intent) bundle.getParcelable("resultData")) == null) {
            intent = new Intent();
        }
        this.f593a.trySetResult(z10 ? c.a(intent) : c.b(intent));
    }
}
