package Z7;

import K7.b;
import K7.c;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: Z7.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0234a extends b implements a {

        /* JADX INFO: renamed from: Z7.a$a$a, reason: collision with other inner class name */
        public static class C0235a extends K7.a implements a {
            C0235a(IBinder iBinder) {
                super(iBinder);
            }

            @Override // Z7.a
            public final Bundle B(Bundle bundle) {
                Parcel parcelG = g();
                c.b(parcelG, bundle);
                Parcel parcelH = h(parcelG);
                Bundle bundle2 = (Bundle) c.a(parcelH, Bundle.CREATOR);
                parcelH.recycle();
                return bundle2;
            }
        }

        public static a g(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new C0235a(iBinder);
        }
    }

    Bundle B(Bundle bundle);
}
