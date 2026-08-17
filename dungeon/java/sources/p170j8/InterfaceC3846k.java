package p170j8;

import K8.n;
import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: j8.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3846k extends IInterface {

    /* JADX INFO: renamed from: j8.k$a */
    public static abstract class a extends n implements InterfaceC3846k {
        public static InterfaceC3846k h(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return iInterfaceQueryLocalInterface instanceof InterfaceC3846k ? (InterfaceC3846k) iInterfaceQueryLocalInterface : new x0(iBinder);
        }
    }

    Account zzb();
}
