package com.google.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class F implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G f37463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f37464b;

    public /* synthetic */ F(G g10, TaskCompletionSource taskCompletionSource) {
        this.f37463a = g10;
        this.f37464b = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        G.a(this.f37463a, this.f37464b);
    }
}
