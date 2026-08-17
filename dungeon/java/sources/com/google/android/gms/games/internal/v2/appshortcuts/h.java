package com.google.android.gms.games.internal.v2.appshortcuts;

import android.content.pm.ShortcutInfo;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        ArrayList arrayListJ = null;
        ArrayList arrayListL = null;
        ArrayList arrayListJ2 = null;
        ArrayList arrayListJ3 = null;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            int iN = p188k8.b.n(iU);
            if (iN == 1) {
                arrayListJ = p188k8.b.j(parcel, iU);
            } else if (iN == 2) {
                arrayListL = p188k8.b.l(parcel, iU, ShortcutInfo.CREATOR);
            } else if (iN == 3) {
                arrayListJ2 = p188k8.b.j(parcel, iU);
            } else if (iN != 4) {
                p188k8.b.B(parcel, iU);
            } else {
                arrayListJ3 = p188k8.b.j(parcel, iU);
            }
        }
        p188k8.b.m(parcel, iC);
        return new g(arrayListJ, arrayListL, arrayListJ2, arrayListJ3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
