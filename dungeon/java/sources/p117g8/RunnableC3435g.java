package p117g8;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;

/* JADX INFO: renamed from: g8.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3435g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f42205a;

    public /* synthetic */ RunnableC3435g(TaskCompletionSource taskCompletionSource) {
        this.f42205a = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f42205a.trySetException(new IOException("TIMEOUT"))) {
            Log.w("Rpc", "No response");
        }
    }
}
