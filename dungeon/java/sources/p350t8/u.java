package p350t8;

import android.os.Parcel;
import android.os.Parcelable;
import p188k8.b;

/* JADX INFO: loaded from: classes2.dex */
public final class u implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = b.C(parcel);
        k kVar = null;
        k kVar2 = null;
        long jY = 0;
        long jY2 = 0;
        while (parcel.dataPosition() < iC) {
            int iU = b.u(parcel);
            int iN = b.n(iU);
            if (iN == 1) {
                jY = b.y(parcel, iU);
            } else if (iN == 2) {
                jY2 = b.y(parcel, iU);
            } else if (iN == 3) {
                kVar = (k) b.g(parcel, iU, k.CREATOR);
            } else if (iN != 4) {
                b.B(parcel, iU);
            } else {
                kVar2 = (k) b.g(parcel, iU, k.CREATOR);
            }
        }
        b.m(parcel, iC);
        return new l(jY, jY2, kVar, kVar2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new l[i10];
    }
}
