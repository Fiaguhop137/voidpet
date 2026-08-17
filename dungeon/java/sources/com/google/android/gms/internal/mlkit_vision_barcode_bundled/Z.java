package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class Z implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        float[] fArrD = null;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            if (p188k8.b.n(iU) != 1) {
                p188k8.b.B(parcel, iU);
            } else {
                fArrD = p188k8.b.d(parcel, iU);
            }
        }
        p188k8.b.m(parcel, iC);
        return new Y(fArrD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Y[i10];
    }
}
