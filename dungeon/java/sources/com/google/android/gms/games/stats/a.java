package com.google.android.gms.games.stats;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p188k8.b;
import p188k8.c;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    static void a(PlayerStatsEntity playerStatsEntity, Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.j(parcel, 1, playerStatsEntity.Y3());
        c.j(parcel, 2, playerStatsEntity.Z());
        c.n(parcel, 3, playerStatsEntity.T1());
        c.n(parcel, 4, playerStatsEntity.q1());
        c.n(parcel, 5, playerStatsEntity.u2());
        c.j(parcel, 6, playerStatsEntity.l1());
        c.j(parcel, 7, playerStatsEntity.r0());
        c.f(parcel, 8, playerStatsEntity.a4(), false);
        c.j(parcel, 9, playerStatsEntity.p1());
        c.j(parcel, 10, playerStatsEntity.O3());
        c.j(parcel, 11, playerStatsEntity.E2());
        c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = b.C(parcel);
        float fS = 0.0f;
        float fS2 = 0.0f;
        float fS3 = 0.0f;
        float fS4 = 0.0f;
        float fS5 = 0.0f;
        float fS6 = 0.0f;
        float fS7 = 0.0f;
        Bundle bundleB = null;
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
        while (parcel.dataPosition() < iC) {
            int iU = b.u(parcel);
            switch (b.n(iU)) {
                case 1:
                    fS = b.s(parcel, iU);
                    break;
                case 2:
                    fS2 = b.s(parcel, iU);
                    break;
                case 3:
                    iW = b.w(parcel, iU);
                    break;
                case 4:
                    iW2 = b.w(parcel, iU);
                    break;
                case 5:
                    iW3 = b.w(parcel, iU);
                    break;
                case 6:
                    fS3 = b.s(parcel, iU);
                    break;
                case 7:
                    fS4 = b.s(parcel, iU);
                    break;
                case 8:
                    bundleB = b.b(parcel, iU);
                    break;
                case 9:
                    fS5 = b.s(parcel, iU);
                    break;
                case 10:
                    fS6 = b.s(parcel, iU);
                    break;
                case 11:
                    fS7 = b.s(parcel, iU);
                    break;
                default:
                    b.B(parcel, iU);
                    break;
            }
        }
        b.m(parcel, iC);
        return new PlayerStatsEntity(fS, fS2, iW, iW2, iW3, fS3, fS4, bundleB, fS5, fS6, fS7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PlayerStatsEntity[i10];
    }
}
