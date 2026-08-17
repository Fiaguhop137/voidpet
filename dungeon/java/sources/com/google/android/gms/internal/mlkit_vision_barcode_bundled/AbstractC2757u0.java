package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2757u0 implements L1 {
    protected int zza = 0;

    abstract int a(InterfaceC2675d2 interfaceC2675d2);

    public final byte[] c() {
        try {
            int iY = y();
            byte[] bArr = new byte[iY];
            N0 n10 = new N0(bArr, 0, iY);
            b(n10);
            n10.c();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e10);
        }
    }
}
