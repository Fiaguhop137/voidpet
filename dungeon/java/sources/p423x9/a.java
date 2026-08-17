package p423x9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements IInterface {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final IBinder f57418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f57419f = "com.google.android.play.core.inappreview.protocol.IInAppReviewService";

    protected a(IBinder iBinder, String str) {
        this.f57418e = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f57418e;
    }

    protected final Parcel g() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f57419f);
        return parcelObtain;
    }

    protected final void h(int i10, Parcel parcel) {
        try {
            this.f57418e.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
