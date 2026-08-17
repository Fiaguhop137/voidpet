package com.google.android.gms.internal.auth;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2397o1 extends RuntimeException {
    public C2397o1(Z0 z10) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final H0 a() {
        return new H0(getMessage());
    }
}
