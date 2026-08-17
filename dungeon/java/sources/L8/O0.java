package L8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class O0 extends AbstractC1138a implements IInterface {
    O0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.games.internal.connect.IGamesConnectService");
    }

    public final void c1(N0 n10, I0 i10) {
        Parcel parcelG = g();
        L.d(parcelG, n10);
        L.c(parcelG, i10);
        k(2, parcelG);
    }
}
