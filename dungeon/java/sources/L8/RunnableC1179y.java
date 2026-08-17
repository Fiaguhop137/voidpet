package L8;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: L8.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC1179y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ A0 f6520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f6521b;

    /* synthetic */ RunnableC1179y(A0 a10, TaskCompletionSource taskCompletionSource) {
        this.f6520a = a10;
        this.f6521b = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        ((Task) this.f6520a.zza()).addOnCompleteListener(new A(this.f6521b));
    }
}
