package H8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements IInterface {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final IBinder f4236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f4237f;

    protected a(IBinder iBinder, String str) {
        this.f4236e = iBinder;
        this.f4237f = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f4236e;
    }

    protected final Parcel g() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f4237f);
        return parcelObtain;
    }

    protected final void h(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f4236e.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
