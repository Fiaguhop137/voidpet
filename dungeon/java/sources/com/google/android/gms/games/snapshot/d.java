package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        p296q8.a aVar = null;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            if (p188k8.b.n(iU) != 1) {
                p188k8.b.B(parcel, iU);
            } else {
                aVar = (p296q8.a) p188k8.b.g(parcel, iU, p296q8.a.CREATOR);
            }
        }
        p188k8.b.m(parcel, iC);
        return new SnapshotContentsEntity(aVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SnapshotContentsEntity[i10];
    }
}
