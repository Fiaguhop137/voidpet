package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2330x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f31865a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f31866b = Collections.synchronizedMap(new WeakHashMap());

    private final void h(boolean z10, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.f31865a) {
            map = new HashMap(this.f31865a);
        }
        synchronized (this.f31866b) {
            map2 = new HashMap(this.f31866b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).f(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new p135h8.b(status));
            }
        }
    }

    final void c(BasePendingResult basePendingResult, boolean z10) {
        this.f31865a.put(basePendingResult, Boolean.valueOf(z10));
        basePendingResult.c(new C2328v(this, basePendingResult));
    }

    final void d(TaskCompletionSource taskCompletionSource, boolean z10) {
        this.f31866b.put(taskCompletionSource, Boolean.valueOf(z10));
        taskCompletionSource.getTask().addOnCompleteListener(new C2329w(this, taskCompletionSource));
    }

    final void e(int i10, String str) {
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (str != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(str);
        }
        h(true, new Status(20, sb2.toString()));
    }

    public final void f() {
        h(false, C2314g.f31815p);
    }

    final boolean g() {
        return (this.f31865a.isEmpty() && this.f31866b.isEmpty()) ? false : true;
    }
}
