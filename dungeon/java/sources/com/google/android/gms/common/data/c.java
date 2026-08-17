package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        String[] strArrI = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundleB = null;
        int iW = 0;
        int iW2 = 0;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            int iN = p188k8.b.n(iU);
            if (iN == 1) {
                strArrI = p188k8.b.i(parcel, iU);
            } else if (iN == 2) {
                cursorWindowArr = (CursorWindow[]) p188k8.b.k(parcel, iU, CursorWindow.CREATOR);
            } else if (iN == 3) {
                iW2 = p188k8.b.w(parcel, iU);
            } else if (iN == 4) {
                bundleB = p188k8.b.b(parcel, iU);
            } else if (iN != 1000) {
                p188k8.b.B(parcel, iU);
            } else {
                iW = p188k8.b.w(parcel, iU);
            }
        }
        p188k8.b.m(parcel, iC);
        DataHolder dataHolder = new DataHolder(iW, strArrI, cursorWindowArr, iW2, bundleB);
        dataHolder.c4();
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new DataHolder[i10];
    }
}
