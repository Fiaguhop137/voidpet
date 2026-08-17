package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class N implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        double dQ = 0.0d;
        double dQ2 = 0.0d;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            int iN = p188k8.b.n(iU);
            if (iN == 1) {
                dQ = p188k8.b.q(parcel, iU);
            } else if (iN != 2) {
                p188k8.b.B(parcel, iU);
            } else {
                dQ2 = p188k8.b.q(parcel, iU);
            }
        }
        p188k8.b.m(parcel, iC);
        return new C2751t(dQ, dQ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2751t[i10];
    }
}
