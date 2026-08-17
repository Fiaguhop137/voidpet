package L8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class J0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        P0 p10 = null;
        int iW = 0;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            int iN = p188k8.b.n(iU);
            if (iN == 1) {
                iW = p188k8.b.w(parcel, iU);
            } else if (iN != 2) {
                p188k8.b.B(parcel, iU);
            } else {
                p10 = (P0) p188k8.b.g(parcel, iU, P0.CREATOR);
            }
        }
        p188k8.b.m(parcel, iC);
        return new I0(iW, p10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new I0[i10];
    }
}
