package p350t8;

import android.os.Parcel;
import android.os.Parcelable;
import p188k8.b;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = b.C(parcel);
        long jY = 0;
        long jY2 = 0;
        int iW = 0;
        while (parcel.dataPosition() < iC) {
            int iU = b.u(parcel);
            int iN = b.n(iU);
            if (iN == 1) {
                iW = b.w(parcel, iU);
            } else if (iN == 2) {
                jY = b.y(parcel, iU);
            } else if (iN != 3) {
                b.B(parcel, iU);
            } else {
                jY2 = b.y(parcel, iU);
            }
        }
        b.m(parcel, iC);
        return new k(iW, jY, jY2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new k[i10];
    }
}
