package p170j8;

import K8.n;
import K8.o;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p314r8.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z0 extends n implements A0 {
    public z0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static A0 h(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return iInterfaceQueryLocalInterface instanceof A0 ? (A0) iInterfaceQueryLocalInterface : new y0(iBinder);
    }

    @Override // K8.n
    protected final boolean g(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            a aVarA = a();
            parcel2.writeNoException();
            o.d(parcel2, aVarA);
        } else {
            if (i10 != 2) {
                return false;
            }
            int iB = b();
            parcel2.writeNoException();
            parcel2.writeInt(iB);
        }
        return true;
    }
}
