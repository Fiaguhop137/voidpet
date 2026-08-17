package p170j8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C2333b;
import p188k8.b;

/* JADX INFO: loaded from: classes2.dex */
public final class U implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = b.C(parcel);
        int iW = 0;
        boolean zO = false;
        boolean zO2 = false;
        IBinder iBinderV = null;
        C2333b c2333b = null;
        while (parcel.dataPosition() < iC) {
            int iU = b.u(parcel);
            int iN = b.n(iU);
            if (iN == 1) {
                iW = b.w(parcel, iU);
            } else if (iN == 2) {
                iBinderV = b.v(parcel, iU);
            } else if (iN == 3) {
                c2333b = (C2333b) b.g(parcel, iU, C2333b.CREATOR);
            } else if (iN == 4) {
                zO = b.o(parcel, iU);
            } else if (iN != 5) {
                b.B(parcel, iU);
            } else {
                zO2 = b.o(parcel, iU);
            }
        }
        b.m(parcel, iC);
        return new T(iW, iBinderV, c2333b, zO, zO2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new T[i10];
    }
}
