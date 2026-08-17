package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        int iW = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        int iW2 = 0;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            int iN = p188k8.b.n(iU);
            if (iN == 1) {
                iW = p188k8.b.w(parcel, iU);
            } else if (iN == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) p188k8.b.g(parcel, iU, ParcelFileDescriptor.CREATOR);
            } else if (iN != 3) {
                p188k8.b.B(parcel, iU);
            } else {
                iW2 = p188k8.b.w(parcel, iU);
            }
        }
        p188k8.b.m(parcel, iC);
        return new BitmapTeleporter(iW, parcelFileDescriptor, iW2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new BitmapTeleporter[i10];
    }
}
