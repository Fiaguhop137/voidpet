package p170j8;

import K8.n;
import K8.o;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class B0 extends n implements InterfaceC3847l {
    public B0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // K8.n
    protected final boolean g(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            int i12 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) o.b(parcel, Bundle.CREATOR);
            o.e(parcel);
            M(i12, strongBinder, bundle);
        } else if (i10 == 2) {
            int i13 = parcel.readInt();
            Bundle bundle2 = (Bundle) o.b(parcel, Bundle.CREATOR);
            o.e(parcel);
            x0(i13, bundle2);
        } else {
            if (i10 != 3) {
                return false;
            }
            int i14 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            n0 n0Var = (n0) o.b(parcel, n0.CREATOR);
            o.e(parcel);
            g0(i14, strongBinder2, n0Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
