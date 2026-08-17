package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class P implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        boolean zO = false;
        String strH = null;
        IBinder iBinderV = null;
        boolean zO2 = false;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            int iN = p188k8.b.n(iU);
            if (iN == 1) {
                strH = p188k8.b.h(parcel, iU);
            } else if (iN == 2) {
                iBinderV = p188k8.b.v(parcel, iU);
            } else if (iN == 3) {
                zO = p188k8.b.o(parcel, iU);
            } else if (iN != 4) {
                p188k8.b.B(parcel, iU);
            } else {
                zO2 = p188k8.b.o(parcel, iU);
            }
        }
        p188k8.b.m(parcel, iC);
        return new O(strH, iBinderV, zO, zO2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new O[i10];
    }
}
