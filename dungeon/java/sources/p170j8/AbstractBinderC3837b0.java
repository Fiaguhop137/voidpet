package p170j8;

import K8.n;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: j8.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC3837b0 extends n implements c0 {
    public static c0 h(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return iInterfaceQueryLocalInterface instanceof c0 ? (c0) iInterfaceQueryLocalInterface : new C3835a0(iBinder);
    }
}
