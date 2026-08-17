package com.google.android.gms.games.internal.v2.appshortcuts;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class m extends n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(q qVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        Objects.requireNonNull(qVar);
    }

    @Override // com.google.android.gms.games.internal.v2.appshortcuts.n, A8.t
    public final void f(Intent intent) {
        if (intent == null) {
            h0(new Status(17));
        } else {
            this.f32122e.trySetResult(intent);
        }
    }
}
