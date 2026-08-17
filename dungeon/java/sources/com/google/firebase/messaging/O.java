package com.google.firebase.messaging;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class O implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f37495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f37496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f37497c;

    public /* synthetic */ O(Context context, boolean z10, TaskCompletionSource taskCompletionSource) {
        this.f37495a = context;
        this.f37496b = z10;
        this.f37497c = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        P.a(this.f37495a, this.f37496b, this.f37497c);
    }
}
