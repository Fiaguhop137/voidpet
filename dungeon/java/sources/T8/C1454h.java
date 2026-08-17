package T8;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.O;
import com.google.android.gms.internal.measurement.Q;
import com.google.android.gms.measurement.internal.Z5;

/* JADX INFO: renamed from: T8.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1454h extends O implements InterfaceC1456j {
    C1454h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // T8.InterfaceC1456j
    public final void L0(Z5 z10) {
        Parcel parcelH = h();
        Q.c(parcelH, z10);
        c1(2, parcelH);
    }
}
