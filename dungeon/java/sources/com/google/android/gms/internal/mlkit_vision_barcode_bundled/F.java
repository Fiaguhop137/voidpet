package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class F implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        boolean zO = false;
        W w10 = null;
        Y y10 = null;
        boolean zO2 = false;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            int iN = p188k8.b.n(iU);
            if (iN == 1) {
                w10 = (W) p188k8.b.g(parcel, iU, W.CREATOR);
            } else if (iN == 2) {
                y10 = (Y) p188k8.b.g(parcel, iU, Y.CREATOR);
            } else if (iN == 3) {
                zO = p188k8.b.o(parcel, iU);
            } else if (iN != 4) {
                p188k8.b.B(parcel, iU);
            } else {
                zO2 = p188k8.b.o(parcel, iU);
            }
        }
        p188k8.b.m(parcel, iC);
        return new E(w10, y10, zO, zO2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new E[i10];
    }
}
