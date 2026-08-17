package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.r2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2873r2 extends RuntimeException {
    public C2873r2(InterfaceC2799c2 interfaceC2799c2) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final O1 a() {
        return new O1(getMessage());
    }
}
