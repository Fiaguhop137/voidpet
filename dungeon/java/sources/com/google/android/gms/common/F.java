package com.google.android.gms.common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class F extends E {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f31661f;

    F(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f31661f = bArr;
    }

    @Override // com.google.android.gms.common.E
    final byte[] k() {
        return this.f31661f;
    }
}
