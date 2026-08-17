package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2963h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        long jY = 0;
        long jY2 = 0;
        int iW = 0;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            int iN = p188k8.b.n(iU);
            if (iN == 1) {
                jY = p188k8.b.y(parcel, iU);
            } else if (iN == 2) {
                iW = p188k8.b.w(parcel, iU);
            } else if (iN != 3) {
                p188k8.b.B(parcel, iU);
            } else {
                jY2 = p188k8.b.y(parcel, iU);
            }
        }
        p188k8.b.m(parcel, iC);
        return new C2955g(jY, iW, jY2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2955g[i10];
    }
}
