package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2693h0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        long jY = 0;
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
        int iW4 = 0;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            int iN = p188k8.b.n(iU);
            if (iN == 1) {
                iW = p188k8.b.w(parcel, iU);
            } else if (iN == 2) {
                iW2 = p188k8.b.w(parcel, iU);
            } else if (iN == 3) {
                iW3 = p188k8.b.w(parcel, iU);
            } else if (iN == 4) {
                iW4 = p188k8.b.w(parcel, iU);
            } else if (iN != 5) {
                p188k8.b.B(parcel, iU);
            } else {
                jY = p188k8.b.y(parcel, iU);
            }
        }
        p188k8.b.m(parcel, iC);
        return new C2688g0(iW, iW2, iW3, iW4, jY);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2688g0[i10];
    }
}
