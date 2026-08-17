package com.google.android.gms.internal.auth;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2383k extends ContentObserver {
    C2383k(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        AbstractC2386l.f32414e.set(true);
    }
}
