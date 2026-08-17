package com.google.android.gms.games.internal.v2.appshortcuts;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p170j8.AbstractC3836b;

/* JADX INFO: loaded from: classes2.dex */
abstract class n extends A8.s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final TaskCompletionSource f32122e;

    n(TaskCompletionSource taskCompletionSource) {
        this.f32122e = taskCompletionSource;
    }

    public void E0(g gVar) {
        h0(new Status(10));
    }

    public void f(Intent intent) {
        h0(new Status(10));
    }

    @Override // A8.t
    public final void h0(Status status) {
        this.f32122e.trySetException(AbstractC3836b.a(status));
    }
}
