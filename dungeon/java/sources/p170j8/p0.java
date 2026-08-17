package p170j8;

import android.os.Parcel;
import android.os.Parcelable;
import p188k8.b;

/* JADX INFO: loaded from: classes2.dex */
public final class p0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = b.C(parcel);
        C3854t c3854t = null;
        int[] iArrE = null;
        int[] iArrE2 = null;
        boolean zO = false;
        boolean zO2 = false;
        int iW = 0;
        while (parcel.dataPosition() < iC) {
            int iU = b.u(parcel);
            switch (b.n(iU)) {
                case 1:
                    c3854t = (C3854t) b.g(parcel, iU, C3854t.CREATOR);
                    break;
                case 2:
                    zO = b.o(parcel, iU);
                    break;
                case 3:
                    zO2 = b.o(parcel, iU);
                    break;
                case 4:
                    iArrE = b.e(parcel, iU);
                    break;
                case 5:
                    iW = b.w(parcel, iU);
                    break;
                case 6:
                    iArrE2 = b.e(parcel, iU);
                    break;
                default:
                    b.B(parcel, iU);
                    break;
            }
        }
        b.m(parcel, iC);
        return new C3841f(c3854t, zO, zO2, iArrE, iW, iArrE2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3841f[i10];
    }
}
