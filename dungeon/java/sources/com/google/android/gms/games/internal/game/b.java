package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b implements Parcelable.Creator {
    public GameBadgeEntity a(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        String strH = null;
        Uri uri = null;
        int iW = 0;
        String strH2 = null;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            int iN = p188k8.b.n(iU);
            if (iN == 1) {
                iW = p188k8.b.w(parcel, iU);
            } else if (iN == 2) {
                strH = p188k8.b.h(parcel, iU);
            } else if (iN == 3) {
                strH2 = p188k8.b.h(parcel, iU);
            } else if (iN != 4) {
                p188k8.b.B(parcel, iU);
            } else {
                uri = (Uri) p188k8.b.g(parcel, iU, Uri.CREATOR);
            }
        }
        p188k8.b.m(parcel, iC);
        return new GameBadgeEntity(iW, strH, strH2, uri);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GameBadgeEntity[i10];
    }
}
