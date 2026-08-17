package p460za;

import android.util.Log;
import android.util.Pair;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicReference;
import p406wa.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final AtomicReference f58539a = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f58540b = new Object();

    static void a(a aVar, int i10) {
        Pair pair = (Pair) f58539a.getAndSet(null);
        if (pair == null) {
            Log.e("GmsBarcodeScannerImpl", "Scanning task source doesn't exist when setting back result.");
            return;
        }
        if (aVar != null) {
            ((TaskCompletionSource) pair.first).setResult(aVar);
        } else if (i10 == 201) {
            ((CancellationTokenSource) pair.second).cancel();
        } else {
            ((TaskCompletionSource) pair.first).setException(new p280pa.a("Failed to scan code.", i10));
        }
    }
}
