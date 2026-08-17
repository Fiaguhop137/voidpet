package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.GameEntity;
import p188k8.b;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = b.C(parcel);
        int iW = 0;
        int iW2 = 0;
        long jY = 0;
        long jY2 = 0;
        long jY3 = 0;
        String strH = null;
        GameEntity gameEntity = null;
        String strH2 = null;
        String strH3 = null;
        String strH4 = null;
        Uri uri = null;
        while (parcel.dataPosition() < iC) {
            int iU = b.u(parcel);
            switch (b.n(iU)) {
                case 1:
                    strH = b.h(parcel, iU);
                    break;
                case 2:
                    gameEntity = (GameEntity) b.g(parcel, iU, GameEntity.CREATOR);
                    break;
                case 3:
                    strH2 = b.h(parcel, iU);
                    break;
                case 4:
                    strH3 = b.h(parcel, iU);
                    break;
                case 5:
                    strH4 = b.h(parcel, iU);
                    break;
                case 6:
                    uri = (Uri) b.g(parcel, iU, Uri.CREATOR);
                    break;
                case 7:
                    jY = b.y(parcel, iU);
                    break;
                case 8:
                    jY2 = b.y(parcel, iU);
                    break;
                case 9:
                    jY3 = b.y(parcel, iU);
                    break;
                case 10:
                    iW = b.w(parcel, iU);
                    break;
                case 11:
                    iW2 = b.w(parcel, iU);
                    break;
                default:
                    b.B(parcel, iU);
                    break;
            }
        }
        b.m(parcel, iC);
        return new ExperienceEventEntity(strH, gameEntity, strH2, strH3, strH4, uri, jY, jY2, jY3, iW, iW2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ExperienceEventEntity[i10];
    }
}
