package p314r8;

import K8.n;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: r8.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0632a extends n implements a {
        public AbstractBinderC0632a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static a h(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new d(iBinder);
        }
    }
}
