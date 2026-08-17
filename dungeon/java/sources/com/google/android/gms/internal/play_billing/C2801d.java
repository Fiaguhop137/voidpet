package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2801d extends AbstractC2816g implements InterfaceC2811f {
    C2801d(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2811f
    public final Bundle A0(int i10, String str, String str2, String str3, String str4) {
        Parcel parcelG = g();
        parcelG.writeInt(3);
        parcelG.writeString(str);
        parcelG.writeString(str2);
        parcelG.writeString(str3);
        parcelG.writeString(null);
        Parcel parcelH = h(3, parcelG);
        Bundle bundle = (Bundle) AbstractC2826i.a(parcelH, Bundle.CREATOR);
        parcelH.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2811f
    public final int F(int i10, String str, String str2) {
        Parcel parcelG = g();
        parcelG.writeInt(i10);
        parcelG.writeString(str);
        parcelG.writeString(str2);
        Parcel parcelH = h(1, parcelG);
        int i11 = parcelH.readInt();
        parcelH.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2811f
    public final Bundle J(int i10, String str, String str2, String str3) {
        Parcel parcelG = g();
        parcelG.writeInt(3);
        parcelG.writeString(str);
        parcelG.writeString(str2);
        parcelG.writeString(str3);
        Parcel parcelH = h(4, parcelG);
        Bundle bundle = (Bundle) AbstractC2826i.a(parcelH, Bundle.CREATOR);
        parcelH.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2811f
    public final Bundle R(int i10, String str, String str2, String str3, String str4, Bundle bundle) {
        Parcel parcelG = g();
        parcelG.writeInt(i10);
        parcelG.writeString(str);
        parcelG.writeString(str2);
        parcelG.writeString(str3);
        parcelG.writeString(null);
        AbstractC2826i.b(parcelG, bundle);
        Parcel parcelH = h(8, parcelG);
        Bundle bundle2 = (Bundle) AbstractC2826i.a(parcelH, Bundle.CREATOR);
        parcelH.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2811f
    public final int R0(int i10, String str, String str2, Bundle bundle) {
        Parcel parcelG = g();
        parcelG.writeInt(i10);
        parcelG.writeString(str);
        parcelG.writeString(str2);
        AbstractC2826i.b(parcelG, bundle);
        Parcel parcelH = h(10, parcelG);
        int i11 = parcelH.readInt();
        parcelH.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2811f
    public final Bundle T0(int i10, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel parcelG = g();
        parcelG.writeInt(i10);
        parcelG.writeString(str);
        parcelG.writeString(str2);
        AbstractC2826i.b(parcelG, bundle);
        AbstractC2826i.b(parcelG, bundle2);
        Parcel parcelH = h(901, parcelG);
        Bundle bundle3 = (Bundle) AbstractC2826i.a(parcelH, Bundle.CREATOR);
        parcelH.recycle();
        return bundle3;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2811f
    public final Bundle V(int i10, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelG = g();
        parcelG.writeInt(i10);
        parcelG.writeString(str);
        parcelG.writeString(str2);
        parcelG.writeString(str3);
        AbstractC2826i.b(parcelG, bundle);
        Parcel parcelH = h(11, parcelG);
        Bundle bundle2 = (Bundle) AbstractC2826i.a(parcelH, Bundle.CREATOR);
        parcelH.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2811f
    public final Bundle Z0(int i10, String str, String str2, Bundle bundle) {
        Parcel parcelG = g();
        parcelG.writeInt(9);
        parcelG.writeString(str);
        parcelG.writeString(str2);
        AbstractC2826i.b(parcelG, bundle);
        Parcel parcelH = h(902, parcelG);
        Bundle bundle2 = (Bundle) AbstractC2826i.a(parcelH, Bundle.CREATOR);
        parcelH.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2811f
    public final Bundle j0(int i10, String str, String str2, Bundle bundle) {
        Parcel parcelG = g();
        parcelG.writeInt(9);
        parcelG.writeString(str);
        parcelG.writeString(str2);
        AbstractC2826i.b(parcelG, bundle);
        Parcel parcelH = h(12, parcelG);
        Bundle bundle2 = (Bundle) AbstractC2826i.a(parcelH, Bundle.CREATOR);
        parcelH.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2811f
    public final int q(int i10, String str, String str2) {
        Parcel parcelG = g();
        parcelG.writeInt(3);
        parcelG.writeString(str);
        parcelG.writeString(str2);
        Parcel parcelH = h(5, parcelG);
        int i11 = parcelH.readInt();
        parcelH.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2811f
    public final void u(int i10, String str, Bundle bundle, InterfaceC2796c interfaceC2796c) {
        Parcel parcelG = g();
        parcelG.writeInt(18);
        parcelG.writeString(str);
        AbstractC2826i.b(parcelG, bundle);
        AbstractC2826i.c(parcelG, interfaceC2796c);
        k(1301, parcelG);
    }
}
