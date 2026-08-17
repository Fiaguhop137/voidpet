package G8;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f3952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f3953b;

    public /* synthetic */ h(l lVar, TaskCompletionSource taskCompletionSource) {
        this.f3952a = lVar;
        this.f3953b = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3952a.d(this.f3953b);
    }
}
