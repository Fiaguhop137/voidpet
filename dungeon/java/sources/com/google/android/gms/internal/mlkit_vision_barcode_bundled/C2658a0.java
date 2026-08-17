package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2658a0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        String strH4 = null;
        String strH5 = null;
        String strH6 = null;
        String strH7 = null;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            switch (p188k8.b.n(iU)) {
                case 1:
                    strH = p188k8.b.h(parcel, iU);
                    break;
                case 2:
                    strH2 = p188k8.b.h(parcel, iU);
                    break;
                case 3:
                    strH3 = p188k8.b.h(parcel, iU);
                    break;
                case 4:
                    strH4 = p188k8.b.h(parcel, iU);
                    break;
                case 5:
                    strH5 = p188k8.b.h(parcel, iU);
                    break;
                case 6:
                    strH6 = p188k8.b.h(parcel, iU);
                    break;
                case 7:
                    strH7 = p188k8.b.h(parcel, iU);
                    break;
                default:
                    p188k8.b.B(parcel, iU);
                    break;
            }
        }
        p188k8.b.m(parcel, iC);
        return new C2756u(strH, strH2, strH3, strH4, strH5, strH6, strH7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2756u[i10];
    }
}
