package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.InterfaceC2315h;

/* JADX INFO: loaded from: classes2.dex */
public final class S1 extends AbstractC2353a implements IInterface {
    S1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGoogleAuthService");
    }

    public final void c1(InterfaceC2315h interfaceC2315h, C2371g c2371g) {
        Parcel parcelG = g();
        AbstractC2380j.d(parcelG, interfaceC2315h);
        AbstractC2380j.c(parcelG, c2371g);
        k(2, parcelG);
    }

    public final void d1(R1 r10, Account account, String str, Bundle bundle) {
        Parcel parcelG = g();
        AbstractC2380j.d(parcelG, r10);
        AbstractC2380j.c(parcelG, account);
        parcelG.writeString(str);
        AbstractC2380j.c(parcelG, bundle);
        k(1, parcelG);
    }
}
