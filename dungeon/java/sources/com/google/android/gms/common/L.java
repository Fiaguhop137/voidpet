package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class L implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        boolean zO = false;
        boolean zO2 = false;
        boolean zO3 = false;
        boolean zO4 = false;
        boolean zO5 = false;
        String strH = null;
        IBinder iBinderV = null;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            switch (p188k8.b.n(iU)) {
                case 1:
                    strH = p188k8.b.h(parcel, iU);
                    break;
                case 2:
                    zO = p188k8.b.o(parcel, iU);
                    break;
                case 3:
                    zO2 = p188k8.b.o(parcel, iU);
                    break;
                case 4:
                    iBinderV = p188k8.b.v(parcel, iU);
                    break;
                case 5:
                    zO3 = p188k8.b.o(parcel, iU);
                    break;
                case 6:
                    zO4 = p188k8.b.o(parcel, iU);
                    break;
                case 7:
                default:
                    p188k8.b.B(parcel, iU);
                    break;
                case 8:
                    zO5 = p188k8.b.o(parcel, iU);
                    break;
            }
        }
        p188k8.b.m(parcel, iC);
        return new K(strH, zO, zO2, iBinderV, zO3, zO4, zO5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new K[i10];
    }
}
