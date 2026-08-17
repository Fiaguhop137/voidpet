package p170j8;

import K8.a;
import K8.o;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.K;
import com.google.android.gms.common.M;
import com.google.android.gms.common.O;

/* JADX INFO: renamed from: j8.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3835a0 extends a implements c0 {
    C3835a0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // p170j8.c0
    public final M H0(K k10) {
        Parcel parcelH = h();
        o.c(parcelH, k10);
        Parcel parcelG = g(6, parcelH);
        M m10 = (M) o.b(parcelG, M.CREATOR);
        parcelG.recycle();
        return m10;
    }

    @Override // p170j8.c0
    public final M U0(K k10) {
        Parcel parcelH = h();
        o.c(parcelH, k10);
        Parcel parcelG = g(8, parcelH);
        M m10 = (M) o.b(parcelG, M.CREATOR);
        parcelG.recycle();
        return m10;
    }

    @Override // p170j8.c0
    public final boolean b1(O o10, p314r8.a aVar) {
        Parcel parcelH = h();
        o.c(parcelH, o10);
        o.d(parcelH, aVar);
        Parcel parcelG = g(5, parcelH);
        boolean zA = o.a(parcelG);
        parcelG.recycle();
        return zA;
    }

    @Override // p170j8.c0
    public final boolean d() {
        Parcel parcelG = g(7, h());
        boolean zA = o.a(parcelG);
        parcelG.recycle();
        return zA;
    }
}
