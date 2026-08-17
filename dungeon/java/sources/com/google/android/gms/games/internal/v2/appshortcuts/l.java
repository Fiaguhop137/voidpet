package com.google.android.gms.games.internal.v2.appshortcuts;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class l extends n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(q qVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        Objects.requireNonNull(qVar);
    }

    @Override // com.google.android.gms.games.internal.v2.appshortcuts.n, A8.t
    public final void E0(g gVar) {
        if (gVar == null) {
            h0(new Status(17));
        } else {
            this.f32122e.trySetResult(gVar);
        }
    }
}
