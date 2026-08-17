package p170j8;

import I8.a;
import I8.c;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class K extends a implements IInterface {
    K(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final p314r8.a d1(p314r8.a aVar, V v10) {
        Parcel parcelG = g();
        c.d(parcelG, aVar);
        c.c(parcelG, v10);
        Parcel parcelH = h(2, parcelG);
        p314r8.a aVarH = p314r8.a.AbstractBinderC0632a.h(parcelH.readStrongBinder());
        parcelH.recycle();
        return aVarH;
    }
}
