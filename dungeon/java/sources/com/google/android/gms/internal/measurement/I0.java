package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class I0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        Bundle bundleB = null;
        String strH = null;
        boolean zO = false;
        long jY = 0;
        long jY2 = 0;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            int iN = p188k8.b.n(iU);
            if (iN == 1) {
                jY = p188k8.b.y(parcel, iU);
            } else if (iN == 2) {
                jY2 = p188k8.b.y(parcel, iU);
            } else if (iN == 3) {
                zO = p188k8.b.o(parcel, iU);
            } else if (iN == 7) {
                bundleB = p188k8.b.b(parcel, iU);
            } else if (iN != 8) {
                p188k8.b.B(parcel, iU);
            } else {
                strH = p188k8.b.h(parcel, iU);
            }
        }
        p188k8.b.m(parcel, iC);
        return new H0(jY, jY2, zO, bundleB, strH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new H0[i10];
    }
}
