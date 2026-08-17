package F8;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends a implements f {
    d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // F8.f
    public final boolean a() {
        Parcel parcelH = h(6, g());
        boolean zA = c.a(parcelH);
        parcelH.recycle();
        return zA;
    }

    @Override // F8.f
    public final boolean t(boolean z10) {
        Parcel parcelG = g();
        int i10 = c.f2988a;
        parcelG.writeInt(1);
        Parcel parcelH = h(2, parcelG);
        boolean zA = c.a(parcelH);
        parcelH.recycle();
        return zA;
    }

    @Override // F8.f
    public final String zzc() {
        Parcel parcelH = h(1, g());
        String string = parcelH.readString();
        parcelH.recycle();
        return string;
    }
}
