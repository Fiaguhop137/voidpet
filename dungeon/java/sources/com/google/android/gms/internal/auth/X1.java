package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC2315h;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class X1 extends InterfaceC2315h.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f32293e;

    X1(C2356b c2356b, TaskCompletionSource taskCompletionSource) {
        this.f32293e = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC2315h
    public final void w0(Status status) {
        C2356b.w(status, null, this.f32293e);
    }
}
