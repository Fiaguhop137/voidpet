package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2329w implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f31863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2330x f31864b;

    C2329w(C2330x c2330x, TaskCompletionSource taskCompletionSource) {
        this.f31864b = c2330x;
        this.f31863a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        this.f31864b.f31866b.remove(this.f31863a);
    }
}
