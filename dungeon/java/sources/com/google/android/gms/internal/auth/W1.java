package com.google.android.gms.internal.auth;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class W1 extends Q1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f32289e;

    W1(C2356b c2356b, TaskCompletionSource taskCompletionSource) {
        this.f32289e = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth.R1
    public final void X(Status status, Bundle bundle) {
        C2356b.w(status, bundle, this.f32289e);
    }
}
