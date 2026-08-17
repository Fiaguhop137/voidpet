package com.google.android.gms.games.event;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.PlayerEntity;
import p188k8.b;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = b.C(parcel);
        boolean zO = false;
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        Uri uri = null;
        String strH4 = null;
        PlayerEntity playerEntity = null;
        String strH5 = null;
        long jY = 0;
        while (parcel.dataPosition() < iC) {
            int iU = b.u(parcel);
            switch (b.n(iU)) {
                case 1:
                    strH = b.h(parcel, iU);
                    break;
                case 2:
                    strH2 = b.h(parcel, iU);
                    break;
                case 3:
                    strH3 = b.h(parcel, iU);
                    break;
                case 4:
                    uri = (Uri) b.g(parcel, iU, Uri.CREATOR);
                    break;
                case 5:
                    strH4 = b.h(parcel, iU);
                    break;
                case 6:
                    playerEntity = (PlayerEntity) b.g(parcel, iU, PlayerEntity.CREATOR);
                    break;
                case 7:
                    jY = b.y(parcel, iU);
                    break;
                case 8:
                    strH5 = b.h(parcel, iU);
                    break;
                case 9:
                    zO = b.o(parcel, iU);
                    break;
                default:
                    b.B(parcel, iU);
                    break;
            }
        }
        b.m(parcel, iC);
        return new EventEntity(strH, strH2, strH3, uri, strH4, playerEntity, jY, strH5, zO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new EventEntity[i10];
    }
}
