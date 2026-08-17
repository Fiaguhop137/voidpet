package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        String strH = "";
        GoogleSignInAccount googleSignInAccount = null;
        String strH2 = "";
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            int iN = p188k8.b.n(iU);
            if (iN == 4) {
                strH = p188k8.b.h(parcel, iU);
            } else if (iN == 7) {
                googleSignInAccount = (GoogleSignInAccount) p188k8.b.g(parcel, iU, GoogleSignInAccount.CREATOR);
            } else if (iN != 8) {
                p188k8.b.B(parcel, iU);
            } else {
                strH2 = p188k8.b.h(parcel, iU);
            }
        }
        p188k8.b.m(parcel, iC);
        return new SignInAccount(strH, googleSignInAccount, strH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInAccount[i10];
    }
}
