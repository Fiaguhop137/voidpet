package com.google.android.gms.games.achievement;

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
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        Uri uri = null;
        String strH4 = null;
        Uri uri2 = null;
        String strH5 = null;
        String strH6 = null;
        PlayerEntity playerEntity = null;
        String strH7 = null;
        String strH8 = null;
        float fS = -1.0f;
        long jY = 0;
        long jY2 = 0;
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
        int iW4 = 0;
        while (parcel.dataPosition() < iC) {
            int iU = b.u(parcel);
            switch (b.n(iU)) {
                case 1:
                    strH = b.h(parcel, iU);
                    break;
                case 2:
                    iW = b.w(parcel, iU);
                    break;
                case 3:
                    strH2 = b.h(parcel, iU);
                    break;
                case 4:
                    strH3 = b.h(parcel, iU);
                    break;
                case 5:
                    uri = (Uri) b.g(parcel, iU, Uri.CREATOR);
                    break;
                case 6:
                    strH4 = b.h(parcel, iU);
                    break;
                case 7:
                    uri2 = (Uri) b.g(parcel, iU, Uri.CREATOR);
                    break;
                case 8:
                    strH5 = b.h(parcel, iU);
                    break;
                case 9:
                    iW2 = b.w(parcel, iU);
                    break;
                case 10:
                    strH6 = b.h(parcel, iU);
                    break;
                case 11:
                    playerEntity = (PlayerEntity) b.g(parcel, iU, PlayerEntity.CREATOR);
                    break;
                case 12:
                    iW3 = b.w(parcel, iU);
                    break;
                case 13:
                    iW4 = b.w(parcel, iU);
                    break;
                case 14:
                    strH7 = b.h(parcel, iU);
                    break;
                case 15:
                    jY = b.y(parcel, iU);
                    break;
                case 16:
                    jY2 = b.y(parcel, iU);
                    break;
                case 17:
                    fS = b.s(parcel, iU);
                    break;
                case 18:
                    strH8 = b.h(parcel, iU);
                    break;
                default:
                    b.B(parcel, iU);
                    break;
            }
        }
        b.m(parcel, iC);
        return new AchievementEntity(strH, iW, strH2, strH3, uri, strH4, uri2, strH5, iW2, strH6, playerEntity, iW3, iW4, strH7, jY, jY2, fS, strH8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AchievementEntity[i10];
    }
}
