package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import p188k8.b;
import p188k8.c;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    static void a(MostRecentGameInfoEntity mostRecentGameInfoEntity, Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.u(parcel, 1, mostRecentGameInfoEntity.zza(), false);
        c.u(parcel, 2, mostRecentGameInfoEntity.zzb(), false);
        c.r(parcel, 3, mostRecentGameInfoEntity.zzc());
        c.t(parcel, 4, mostRecentGameInfoEntity.a(), i10, false);
        c.t(parcel, 5, mostRecentGameInfoEntity.b(), i10, false);
        c.t(parcel, 6, mostRecentGameInfoEntity.c(), i10, false);
        c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = b.C(parcel);
        String strH = null;
        String strH2 = null;
        Uri uri = null;
        Uri uri2 = null;
        Uri uri3 = null;
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
                    jY = b.y(parcel, iU);
                    break;
                case 4:
                    uri = (Uri) b.g(parcel, iU, Uri.CREATOR);
                    break;
                case 5:
                    uri2 = (Uri) b.g(parcel, iU, Uri.CREATOR);
                    break;
                case 6:
                    uri3 = (Uri) b.g(parcel, iU, Uri.CREATOR);
                    break;
                default:
                    b.B(parcel, iU);
                    break;
            }
        }
        b.m(parcel, iC);
        return new MostRecentGameInfoEntity(strH, strH2, jY, uri, uri2, uri3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new MostRecentGameInfoEntity[i10];
    }
}
