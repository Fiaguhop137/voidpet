package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.p2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2735p2 extends RuntimeException {
    public C2735p2(L1 l10) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final C2753t1 a() {
        return new C2753t1(getMessage());
    }
}
