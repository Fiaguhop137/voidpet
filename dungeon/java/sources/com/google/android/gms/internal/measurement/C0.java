package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class C0 extends O implements E0 {
    C0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.E0
    public final int c() {
        Parcel parcelG = g(2, h());
        int i10 = parcelG.readInt();
        parcelG.recycle();
        return i10;
    }

    @Override // com.google.android.gms.internal.measurement.E0
    public final void n(String str, String str2, Bundle bundle, long j10) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        Q.c(parcelH, bundle);
        parcelH.writeLong(j10);
        k(1, parcelH);
    }
}
