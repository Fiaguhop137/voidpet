package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d implements Parcelable.Creator {
    public RoomEntity a(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            p188k8.b.n(iU);
            p188k8.b.B(parcel, iU);
        }
        p188k8.b.m(parcel, iC);
        return new RoomEntity();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new RoomEntity[i10];
    }
}
