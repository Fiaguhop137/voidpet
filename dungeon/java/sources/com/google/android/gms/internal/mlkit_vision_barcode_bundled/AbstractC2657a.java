package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2657a implements IInterface {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final IBinder f33408e;

    protected AbstractC2657a(IBinder iBinder, String str) {
        this.f33408e = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f33408e;
    }
}
