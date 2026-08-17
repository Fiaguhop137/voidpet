package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC2791b extends AbstractBinderC2821h implements InterfaceC2796c {
    public AbstractBinderC2791b() {
        super("com.android.vending.billing.IInAppBillingGetBillingConfigCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractBinderC2821h
    protected final boolean g(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC2826i.a(parcel, Bundle.CREATOR);
        h(parcel);
        N0(bundle);
        parcel2.writeNoException();
        return true;
    }
}
