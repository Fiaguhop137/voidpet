package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.common.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2352v implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        PendingIntent pendingIntent = null;
        String strH = null;
        Integer numX = null;
        int iW = 0;
        int iW2 = 0;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            int iN = p188k8.b.n(iU);
            if (iN == 1) {
                iW = p188k8.b.w(parcel, iU);
            } else if (iN == 2) {
                iW2 = p188k8.b.w(parcel, iU);
            } else if (iN == 3) {
                pendingIntent = (PendingIntent) p188k8.b.g(parcel, iU, PendingIntent.CREATOR);
            } else if (iN == 4) {
                strH = p188k8.b.h(parcel, iU);
            } else if (iN != 5) {
                p188k8.b.B(parcel, iU);
            } else {
                numX = p188k8.b.x(parcel, iU);
            }
        }
        p188k8.b.m(parcel, iC);
        return new C2333b(iW, iW2, pendingIntent, strH, numX);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2333b[i10];
    }
}
