package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class J extends AbstractC2353a implements F0 {
    J(IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    @Override // com.google.android.gms.internal.auth.F0
    public final Bundle T(String str, Bundle bundle) {
        Parcel parcelG = g();
        parcelG.writeString(str);
        AbstractC2380j.c(parcelG, bundle);
        Parcel parcelH = h(2, parcelG);
        Bundle bundle2 = (Bundle) AbstractC2380j.a(parcelH, Bundle.CREATOR);
        parcelH.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.auth.F0
    public final Bundle m0(Account account, String str, Bundle bundle) {
        Parcel parcelG = g();
        AbstractC2380j.c(parcelG, account);
        parcelG.writeString(str);
        AbstractC2380j.c(parcelG, bundle);
        Parcel parcelH = h(5, parcelG);
        Bundle bundle2 = (Bundle) AbstractC2380j.a(parcelH, Bundle.CREATOR);
        parcelH.recycle();
        return bundle2;
    }
}
