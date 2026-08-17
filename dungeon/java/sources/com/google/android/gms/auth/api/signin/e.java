package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        ArrayList arrayListL = null;
        Account account = null;
        String strH = null;
        String strH2 = null;
        ArrayList arrayListL2 = null;
        String strH3 = null;
        int iW = 0;
        boolean zO = false;
        boolean zO2 = false;
        boolean zO3 = false;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            switch (p188k8.b.n(iU)) {
                case 1:
                    iW = p188k8.b.w(parcel, iU);
                    break;
                case 2:
                    arrayListL = p188k8.b.l(parcel, iU, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) p188k8.b.g(parcel, iU, Account.CREATOR);
                    break;
                case 4:
                    zO = p188k8.b.o(parcel, iU);
                    break;
                case 5:
                    zO2 = p188k8.b.o(parcel, iU);
                    break;
                case 6:
                    zO3 = p188k8.b.o(parcel, iU);
                    break;
                case 7:
                    strH = p188k8.b.h(parcel, iU);
                    break;
                case 8:
                    strH2 = p188k8.b.h(parcel, iU);
                    break;
                case 9:
                    arrayListL2 = p188k8.b.l(parcel, iU, p081e8.a.CREATOR);
                    break;
                case 10:
                    strH3 = p188k8.b.h(parcel, iU);
                    break;
                default:
                    p188k8.b.B(parcel, iU);
                    break;
            }
        }
        p188k8.b.m(parcel, iC);
        return new GoogleSignInOptions(iW, arrayListL, account, zO, zO2, zO3, strH, strH2, arrayListL2, strH3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInOptions[i10];
    }
}
