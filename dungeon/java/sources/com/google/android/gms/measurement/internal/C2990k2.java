package com.google.android.gms.measurement.internal;

import T8.InterfaceC1450d;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p170j8.AbstractC3839d;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.k2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2990k2 extends AbstractC3839d {
    public C2990k2(Context context, Looper looper, AbstractC3839d.a aVar, AbstractC3839d.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    @Override // p170j8.AbstractC3839d
    protected final String E() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // p170j8.AbstractC3839d
    protected final String F() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // p170j8.AbstractC3839d, h8.a.f
    public final int m() {
        return 12451000;
    }

    @Override // p170j8.AbstractC3839d
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1450d ? (InterfaceC1450d) iInterfaceQueryLocalInterface : new C2942e2(iBinder);
    }
}
