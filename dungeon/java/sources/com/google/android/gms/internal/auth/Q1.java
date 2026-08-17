package com.google.android.gms.internal.auth;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Q1 extends AbstractBinderC2359c implements R1 {
    public Q1() {
        super("com.google.android.gms.auth.account.data.IGetTokenWithDetailsCallback");
    }

    @Override // com.google.android.gms.internal.auth.AbstractBinderC2359c
    protected final boolean g(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        Status status = (Status) AbstractC2380j.a(parcel, Status.CREATOR);
        Bundle bundle = (Bundle) AbstractC2380j.a(parcel, Bundle.CREATOR);
        AbstractC2380j.b(parcel);
        X(status, bundle);
        return true;
    }
}
