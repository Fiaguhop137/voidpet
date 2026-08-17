package p170j8;

import android.os.Parcel;
import android.os.Parcelable;
import p188k8.b;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = b.C(parcel);
        int iW = 0;
        boolean zO = false;
        boolean zO2 = false;
        int iW2 = 0;
        int iW3 = 0;
        while (parcel.dataPosition() < iC) {
            int iU = b.u(parcel);
            int iN = b.n(iU);
            if (iN == 1) {
                iW = b.w(parcel, iU);
            } else if (iN == 2) {
                zO = b.o(parcel, iU);
            } else if (iN == 3) {
                zO2 = b.o(parcel, iU);
            } else if (iN == 4) {
                iW2 = b.w(parcel, iU);
            } else if (iN != 5) {
                b.B(parcel, iU);
            } else {
                iW3 = b.w(parcel, iU);
            }
        }
        b.m(parcel, iC);
        return new C3854t(iW, zO, zO2, iW2, iW3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3854t[i10];
    }
}
