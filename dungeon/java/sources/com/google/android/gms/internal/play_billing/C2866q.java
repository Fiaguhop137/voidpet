package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2866q extends C {
    C2866q() {
    }

    @Override // com.google.android.gms.internal.play_billing.C
    public final long a() {
        return SystemClock.elapsedRealtime() * 1000000;
    }
}
