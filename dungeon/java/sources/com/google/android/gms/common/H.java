package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
abstract class H extends E {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final WeakReference f31666g = new WeakReference(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WeakReference f31667f;

    H(byte[] bArr) {
        super(bArr);
        this.f31667f = f31666g;
    }

    protected abstract byte[] d1();

    @Override // com.google.android.gms.common.E
    final byte[] k() {
        byte[] bArrD1;
        synchronized (this) {
            try {
                bArrD1 = (byte[]) this.f31667f.get();
                if (bArrD1 == null) {
                    bArrD1 = d1();
                    this.f31667f = new WeakReference(bArrD1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrD1;
    }
}
