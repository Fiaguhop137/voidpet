package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        String strH = null;
        Long lZ = null;
        ArrayList arrayListJ = null;
        String strH2 = null;
        int iW = 0;
        boolean zO = false;
        boolean zO2 = false;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            switch (p188k8.b.n(iU)) {
                case 1:
                    iW = p188k8.b.w(parcel, iU);
                    break;
                case 2:
                    strH = p188k8.b.h(parcel, iU);
                    break;
                case 3:
                    lZ = p188k8.b.z(parcel, iU);
                    break;
                case 4:
                    zO = p188k8.b.o(parcel, iU);
                    break;
                case 5:
                    zO2 = p188k8.b.o(parcel, iU);
                    break;
                case 6:
                    arrayListJ = p188k8.b.j(parcel, iU);
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
        return new TokenData(iW, strH, lZ, zO, zO2, arrayListJ, strH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new TokenData[i10];
    }
}
