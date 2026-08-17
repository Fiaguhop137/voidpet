package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class V implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        boolean zO = false;
        boolean zO2 = false;
        boolean zO3 = false;
        float fS = 0.0f;
        byte[] bArrC = null;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            int iN = p188k8.b.n(iU);
            if (iN == 1) {
                zO = p188k8.b.o(parcel, iU);
            } else if (iN == 2) {
                bArrC = p188k8.b.c(parcel, iU);
            } else if (iN == 3) {
                zO2 = p188k8.b.o(parcel, iU);
            } else if (iN == 4) {
                fS = p188k8.b.s(parcel, iU);
            } else if (iN != 5) {
                p188k8.b.B(parcel, iU);
            } else {
                zO3 = p188k8.b.o(parcel, iU);
            }
        }
        p188k8.b.m(parcel, iC);
        return new U(zO, bArrC, zO2, fS, zO3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new U[i10];
    }
}
