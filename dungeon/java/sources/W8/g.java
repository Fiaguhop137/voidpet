package W8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends I8.a implements IInterface {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void d1(j jVar, f fVar) {
        Parcel parcelG = g();
        I8.c.c(parcelG, jVar);
        I8.c.d(parcelG, fVar);
        k(12, parcelG);
    }
}
