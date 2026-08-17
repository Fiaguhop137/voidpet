package p170j8;

import K8.a;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class y0 extends a implements A0 {
    y0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // p170j8.A0
    public final p314r8.a a() {
        Parcel parcelG = g(1, h());
        p314r8.a aVarH = p314r8.a.AbstractBinderC0632a.h(parcelG.readStrongBinder());
        parcelG.recycle();
        return aVarH;
    }

    @Override // p170j8.A0
    public final int b() {
        Parcel parcelG = g(2, h());
        int i10 = parcelG.readInt();
        parcelG.recycle();
        return i10;
    }
}
