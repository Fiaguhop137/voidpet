package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        int iW = 0;
        boolean zO = false;
        long jY = -1;
        String strH = null;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            int iN = p188k8.b.n(iU);
            if (iN == 1) {
                strH = p188k8.b.h(parcel, iU);
            } else if (iN == 2) {
                iW = p188k8.b.w(parcel, iU);
            } else if (iN == 3) {
                jY = p188k8.b.y(parcel, iU);
            } else if (iN != 4) {
                p188k8.b.B(parcel, iU);
            } else {
                zO = p188k8.b.o(parcel, iU);
            }
        }
        p188k8.b.m(parcel, iC);
        return new C2335d(strH, iW, jY, zO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2335d[i10];
    }
}
