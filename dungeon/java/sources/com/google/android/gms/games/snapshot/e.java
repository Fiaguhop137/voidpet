package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        SnapshotMetadataEntity snapshotMetadataEntity = null;
        SnapshotContentsEntity snapshotContentsEntity = null;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            int iN = p188k8.b.n(iU);
            if (iN == 1) {
                snapshotMetadataEntity = (SnapshotMetadataEntity) p188k8.b.g(parcel, iU, SnapshotMetadataEntity.CREATOR);
            } else if (iN != 3) {
                p188k8.b.B(parcel, iU);
            } else {
                snapshotContentsEntity = (SnapshotContentsEntity) p188k8.b.g(parcel, iU, SnapshotContentsEntity.CREATOR);
            }
        }
        p188k8.b.m(parcel, iC);
        return new SnapshotEntity(snapshotMetadataEntity, snapshotContentsEntity);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SnapshotEntity[i10];
    }
}
