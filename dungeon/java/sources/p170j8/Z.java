package p170j8;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
final class Z implements InterfaceC3848m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final IBinder f46902e;

    Z(IBinder iBinder) {
        this.f46902e = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f46902e;
    }

    @Override // p170j8.InterfaceC3848m
    public final void z(InterfaceC3847l interfaceC3847l, C3842g c3842g) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(interfaceC3847l != null ? interfaceC3847l.asBinder() : null);
            if (c3842g != null) {
                parcelObtain.writeInt(1);
                q0.a(c3842g, parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f46902e.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
