package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import p188k8.b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzd implements Parcelable.Creator<zzc> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzc createFromParcel(Parcel parcel) {
        int iC = b.C(parcel);
        String strH = null;
        int iW = 0;
        while (parcel.dataPosition() < iC) {
            int iU = b.u(parcel);
            int iN = b.n(iU);
            if (iN == 1) {
                strH = b.h(parcel, iU);
            } else if (iN != 2) {
                b.B(parcel, iU);
            } else {
                iW = b.w(parcel, iU);
            }
        }
        b.m(parcel, iC);
        return new zzc(strH, iW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzc[] newArray(int i10) {
        return new zzc[i10];
    }
}
