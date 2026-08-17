package G8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements IInterface {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final IBinder f3949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f3950f = "com.google.android.gms.appset.internal.IAppSetService";

    protected a(IBinder iBinder, String str) {
        this.f3949e = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3949e;
    }

    protected final Parcel g() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f3950f);
        return parcelObtain;
    }

    protected final void h(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f3949e.transact(1, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
