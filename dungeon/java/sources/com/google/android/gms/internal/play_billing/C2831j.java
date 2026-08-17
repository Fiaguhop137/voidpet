package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2831j extends AbstractC2816g implements InterfaceC2841l {
    C2831j(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2841l
    public final void n0(String str, String str2, InterfaceC2856o interfaceC2856o) {
        Parcel parcelG = g();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        AbstractC2826i.c(parcelG, interfaceC2856o);
        c1(1, parcelG);
    }
}
