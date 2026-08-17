package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p170j8.AbstractC3836b;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2327u {
    public static void a(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.g4()) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(AbstractC3836b.a(status));
        }
    }

    public static boolean b(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        return status.g4() ? taskCompletionSource.trySetResult(obj) : taskCompletionSource.trySetException(AbstractC3836b.a(status));
    }
}
