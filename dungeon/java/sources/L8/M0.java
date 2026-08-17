package L8;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public abstract class M0 extends AbstractBinderC1170q implements N0 {
    public M0() {
        super("com.google.android.gms.games.internal.connect.IGamesConnectCallbacks");
    }

    @Override // L8.AbstractBinderC1170q
    protected final boolean g(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        Status status = (Status) L.b(parcel, Status.CREATOR);
        K0 k10 = (K0) L.b(parcel, K0.CREATOR);
        L.e(parcel);
        b0(status, k10);
        return true;
    }
}
