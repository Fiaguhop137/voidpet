package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2861p extends C {
    C2861p() {
    }

    @Override // com.google.android.gms.internal.play_billing.C
    public final long a() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
