package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2717m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        String[] strArrI = null;
        int iW = 0;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            int iN = p188k8.b.n(iU);
            if (iN == 1) {
                iW = p188k8.b.w(parcel, iU);
            } else if (iN != 2) {
                p188k8.b.B(parcel, iU);
            } else {
                strArrI = p188k8.b.i(parcel, iU);
            }
        }
        p188k8.b.m(parcel, iC);
        return new C2722n(iW, strArrI);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2722n[i10];
    }
}
