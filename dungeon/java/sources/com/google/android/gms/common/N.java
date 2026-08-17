package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class N implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        long jY = -1;
        boolean zO = false;
        int iW = 0;
        int iW2 = 0;
        String strH = null;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            int iN = p188k8.b.n(iU);
            if (iN == 1) {
                zO = p188k8.b.o(parcel, iU);
            } else if (iN == 2) {
                strH = p188k8.b.h(parcel, iU);
            } else if (iN == 3) {
                iW = p188k8.b.w(parcel, iU);
            } else if (iN == 4) {
                iW2 = p188k8.b.w(parcel, iU);
            } else if (iN != 5) {
                p188k8.b.B(parcel, iU);
            } else {
                jY = p188k8.b.y(parcel, iU);
            }
        }
        p188k8.b.m(parcel, iC);
        return new M(zO, strH, iW, iW2, jY);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new M[i10];
    }
}
