package T8;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.P;
import com.google.android.gms.internal.measurement.Q;
import com.google.android.gms.measurement.internal.Z5;

/* JADX INFO: renamed from: T8.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC1455i extends P implements InterfaceC1456j {
    public AbstractBinderC1455i() {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // com.google.android.gms.internal.measurement.P
    protected final boolean g(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        Z5 z10 = (Z5) Q.b(parcel, Z5.CREATOR);
        Q.f(parcel);
        L0(z10);
        return true;
    }
}
