package E8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        boolean[] zArrA = null;
        boolean[] zArrA2 = null;
        boolean zO = false;
        boolean zO2 = false;
        boolean zO3 = false;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            int iN = p188k8.b.n(iU);
            if (iN == 1) {
                zO = p188k8.b.o(parcel, iU);
            } else if (iN == 2) {
                zO2 = p188k8.b.o(parcel, iU);
            } else if (iN == 3) {
                zO3 = p188k8.b.o(parcel, iU);
            } else if (iN == 4) {
                zArrA = p188k8.b.a(parcel, iU);
            } else if (iN != 5) {
                p188k8.b.B(parcel, iU);
            } else {
                zArrA2 = p188k8.b.a(parcel, iU);
            }
        }
        p188k8.b.m(parcel, iC);
        return new a(zO, zO2, zO3, zArrA, zArrA2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
