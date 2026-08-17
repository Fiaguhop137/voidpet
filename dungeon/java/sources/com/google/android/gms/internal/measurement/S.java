package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class S extends O implements U {
    S(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.U
    public final Bundle y0(Bundle bundle) {
        Parcel parcelH = h();
        Q.c(parcelH, bundle);
        Parcel parcelG = g(1, parcelH);
        Bundle bundle2 = (Bundle) Q.b(parcelG, Bundle.CREATOR);
        parcelG.recycle();
        return bundle2;
    }
}
