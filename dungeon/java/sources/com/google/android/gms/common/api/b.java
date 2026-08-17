package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C2333b;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        String strH = null;
        C2333b c2333b = null;
        int iW = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            int iN = p188k8.b.n(iU);
            if (iN == 1) {
                iW = p188k8.b.w(parcel, iU);
            } else if (iN == 2) {
                strH = p188k8.b.h(parcel, iU);
            } else if (iN == 3) {
                pendingIntent = (PendingIntent) p188k8.b.g(parcel, iU, PendingIntent.CREATOR);
            } else if (iN != 4) {
                p188k8.b.B(parcel, iU);
            } else {
                c2333b = (C2333b) p188k8.b.g(parcel, iU, C2333b.CREATOR);
            }
        }
        p188k8.b.m(parcel, iC);
        return new Status(iW, strH, pendingIntent, c2333b);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Status[i10];
    }
}
