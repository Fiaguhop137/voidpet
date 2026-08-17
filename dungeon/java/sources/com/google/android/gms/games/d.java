package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;
import p350t8.l;
import p350t8.n;
import p350t8.v;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d implements Parcelable.Creator {
    public PlayerEntity a(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        String strH = null;
        String strH2 = null;
        Uri uri = null;
        Uri uri2 = null;
        String strH3 = null;
        String strH4 = null;
        String strH5 = null;
        MostRecentGameInfoEntity mostRecentGameInfoEntity = null;
        l lVar = null;
        String strH6 = null;
        String strH7 = null;
        Uri uri3 = null;
        String strH8 = null;
        Uri uri4 = null;
        String strH9 = null;
        v vVar = null;
        n nVar = null;
        String strH10 = null;
        int iW = 0;
        boolean zO = false;
        boolean zO2 = false;
        boolean zO3 = false;
        long jY = -1;
        long jY2 = 0;
        long jY3 = 0;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            switch (p188k8.b.n(iU)) {
                case 1:
                    strH = p188k8.b.h(parcel, iU);
                    break;
                case 2:
                    strH2 = p188k8.b.h(parcel, iU);
                    break;
                case 3:
                    uri = (Uri) p188k8.b.g(parcel, iU, Uri.CREATOR);
                    break;
                case 4:
                    uri2 = (Uri) p188k8.b.g(parcel, iU, Uri.CREATOR);
                    break;
                case 5:
                    jY2 = p188k8.b.y(parcel, iU);
                    break;
                case 6:
                    iW = p188k8.b.w(parcel, iU);
                    break;
                case 7:
                    jY3 = p188k8.b.y(parcel, iU);
                    break;
                case 8:
                    strH3 = p188k8.b.h(parcel, iU);
                    break;
                case 9:
                    strH4 = p188k8.b.h(parcel, iU);
                    break;
                case 10:
                case 11:
                case 12:
                case 13:
                case 17:
                case 26:
                case 27:
                case 28:
                case 30:
                case 31:
                case 32:
                case 34:
                default:
                    p188k8.b.B(parcel, iU);
                    break;
                case 14:
                    strH5 = p188k8.b.h(parcel, iU);
                    break;
                case 15:
                    mostRecentGameInfoEntity = (MostRecentGameInfoEntity) p188k8.b.g(parcel, iU, MostRecentGameInfoEntity.CREATOR);
                    break;
                case 16:
                    lVar = (l) p188k8.b.g(parcel, iU, l.CREATOR);
                    break;
                case 18:
                    zO = p188k8.b.o(parcel, iU);
                    break;
                case 19:
                    zO2 = p188k8.b.o(parcel, iU);
                    break;
                case 20:
                    strH6 = p188k8.b.h(parcel, iU);
                    break;
                case 21:
                    strH7 = p188k8.b.h(parcel, iU);
                    break;
                case 22:
                    uri3 = (Uri) p188k8.b.g(parcel, iU, Uri.CREATOR);
                    break;
                case 23:
                    strH8 = p188k8.b.h(parcel, iU);
                    break;
                case 24:
                    uri4 = (Uri) p188k8.b.g(parcel, iU, Uri.CREATOR);
                    break;
                case 25:
                    strH9 = p188k8.b.h(parcel, iU);
                    break;
                case 29:
                    jY = p188k8.b.y(parcel, iU);
                    break;
                case 33:
                    vVar = (v) p188k8.b.g(parcel, iU, v.CREATOR);
                    break;
                case 35:
                    nVar = (n) p188k8.b.g(parcel, iU, n.CREATOR);
                    break;
                case 36:
                    zO3 = p188k8.b.o(parcel, iU);
                    break;
                case 37:
                    strH10 = p188k8.b.h(parcel, iU);
                    break;
            }
        }
        p188k8.b.m(parcel, iC);
        return new PlayerEntity(strH, strH2, uri, uri2, jY2, iW, jY3, strH3, strH4, strH5, mostRecentGameInfoEntity, lVar, zO, zO2, strH6, strH7, uri3, strH8, uri4, strH9, jY, vVar, nVar, zO3, strH10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PlayerEntity[i10];
    }
}
