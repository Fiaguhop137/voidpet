package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2683f0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        int iW = 0;
        String strH = null;
        String strH2 = null;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            int iN = p188k8.b.n(iU);
            if (iN == 1) {
                strH = p188k8.b.h(parcel, iU);
            } else if (iN == 2) {
                strH2 = p188k8.b.h(parcel, iU);
            } else if (iN != 3) {
                p188k8.b.B(parcel, iU);
            } else {
                iW = p188k8.b.w(parcel, iU);
            }
        }
        p188k8.b.m(parcel, iC);
        return new C2776y(strH, strH2, iW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2776y[i10];
    }
}
