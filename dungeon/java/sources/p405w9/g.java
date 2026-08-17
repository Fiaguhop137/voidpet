package p405w9;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class g extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f56712a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(h hVar, Handler handler, TaskCompletionSource taskCompletionSource) {
        super(handler);
        this.f56712a = taskCompletionSource;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        this.f56712a.trySetResult(null);
    }
}
