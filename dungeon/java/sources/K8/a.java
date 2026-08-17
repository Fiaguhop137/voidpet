package K8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements IInterface {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final IBinder f6039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f6040f;

    protected a(IBinder iBinder, String str) {
        this.f6039e = iBinder;
        this.f6040f = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6039e;
    }

    protected final Parcel g(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f6039e.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    protected final Parcel h() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f6040f);
        return parcelObtain;
    }
}
