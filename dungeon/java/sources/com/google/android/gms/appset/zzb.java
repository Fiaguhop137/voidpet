package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import p188k8.b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzb implements Parcelable.Creator<zza> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zza createFromParcel(Parcel parcel) {
        int iC = b.C(parcel);
        String strH = null;
        String strH2 = null;
        while (parcel.dataPosition() < iC) {
            int iU = b.u(parcel);
            int iN = b.n(iU);
            if (iN == 1) {
                strH = b.h(parcel, iU);
            } else if (iN != 2) {
                b.B(parcel, iU);
            } else {
                strH2 = b.h(parcel, iU);
            }
        }
        b.m(parcel, iC);
        return new zza(strH, strH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zza[] newArray(int i10) {
        return new zza[i10];
    }
}
