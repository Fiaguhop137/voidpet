package p206l8;

import I8.c;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p170j8.C3856v;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends I8.a implements IInterface {
    a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void d1(C3856v c3856v) {
        Parcel parcelG = g();
        c.c(parcelG, c3856v);
        c1(1, parcelG);
    }
}
