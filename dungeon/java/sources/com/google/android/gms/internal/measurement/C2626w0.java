package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2626w0 extends O implements InterfaceC2642y0 {
    C2626w0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2642y0
    public final void j(Bundle bundle) {
        Parcel parcelH = h();
        Q.c(parcelH, bundle);
        k(1, parcelH);
    }
}
