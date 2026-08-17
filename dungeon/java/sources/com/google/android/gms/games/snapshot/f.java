package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        String strH = null;
        Long lZ = null;
        BitmapTeleporter bitmapTeleporter = null;
        Uri uri = null;
        Long lZ2 = null;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            int iN = p188k8.b.n(iU);
            if (iN == 1) {
                strH = p188k8.b.h(parcel, iU);
            } else if (iN == 2) {
                lZ = p188k8.b.z(parcel, iU);
            } else if (iN == 4) {
                uri = (Uri) p188k8.b.g(parcel, iU, Uri.CREATOR);
            } else if (iN == 5) {
                bitmapTeleporter = (BitmapTeleporter) p188k8.b.g(parcel, iU, BitmapTeleporter.CREATOR);
            } else if (iN != 6) {
                p188k8.b.B(parcel, iU);
            } else {
                lZ2 = p188k8.b.z(parcel, iU);
            }
        }
        p188k8.b.m(parcel, iC);
        return new SnapshotMetadataChangeEntity(strH, lZ, bitmapTeleporter, uri, lZ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SnapshotMetadataChangeEntity[i10];
    }
}
