package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class Y5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        byte[] bArrC = null;
        String strH = null;
        Bundle bundleB = null;
        String strH2 = null;
        long jY = 0;
        long jY2 = 0;
        int iW = 0;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            switch (p188k8.b.n(iU)) {
                case 1:
                    jY = p188k8.b.y(parcel, iU);
                    break;
                case 2:
                    bArrC = p188k8.b.c(parcel, iU);
                    break;
                case 3:
                    strH = p188k8.b.h(parcel, iU);
                    break;
                case 4:
                    bundleB = p188k8.b.b(parcel, iU);
                    break;
                case 5:
                    iW = p188k8.b.w(parcel, iU);
                    break;
                case 6:
                    jY2 = p188k8.b.y(parcel, iU);
                    break;
                case 7:
                    strH2 = p188k8.b.h(parcel, iU);
                    break;
                default:
                    p188k8.b.B(parcel, iU);
                    break;
            }
        }
        p188k8.b.m(parcel, iC);
        return new X5(jY, bArrC, strH, bundleB, iW, jY2, strH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new X5[i10];
    }
}
