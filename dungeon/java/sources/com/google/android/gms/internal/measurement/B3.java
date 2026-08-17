package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class B3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map f32482a = new HashMap();

    public final void a(String str, Callable callable) {
        this.f32482a.put(str, callable);
    }
}
