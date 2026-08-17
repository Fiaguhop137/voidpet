package com.google.android.gms.games.internal.v2.appshortcuts;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.PersistableBundle;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        String strH = null;
        PersistableBundle persistableBundle = null;
        Boolean boolP = null;
        Boolean boolP2 = null;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            int iN = p188k8.b.n(iU);
            if (iN == 1) {
                strH = p188k8.b.h(parcel, iU);
            } else if (iN == 2) {
                persistableBundle = (PersistableBundle) p188k8.b.g(parcel, iU, PersistableBundle.CREATOR);
            } else if (iN == 3) {
                boolP = p188k8.b.p(parcel, iU);
            } else if (iN != 4) {
                p188k8.b.B(parcel, iU);
            } else {
                boolP2 = p188k8.b.p(parcel, iU);
            }
        }
        p188k8.b.m(parcel, iC);
        return new i(strH, persistableBundle, boolP, boolP2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new i[i10];
    }
}
