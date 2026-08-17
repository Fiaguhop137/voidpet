package p170j8;

import android.os.Parcel;
import android.os.Parcelable;
import p188k8.b;

/* JADX INFO: loaded from: classes2.dex */
public final class L implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = b.C(parcel);
        int iW = -1;
        int iW2 = 0;
        int iW3 = 0;
        int iW4 = 0;
        int iW5 = 0;
        String strH = null;
        String strH2 = null;
        long jY = 0;
        long jY2 = 0;
        while (parcel.dataPosition() < iC) {
            int iU = b.u(parcel);
            switch (b.n(iU)) {
                case 1:
                    iW2 = b.w(parcel, iU);
                    break;
                case 2:
                    iW3 = b.w(parcel, iU);
                    break;
                case 3:
                    iW4 = b.w(parcel, iU);
                    break;
                case 4:
                    jY = b.y(parcel, iU);
                    break;
                case 5:
                    jY2 = b.y(parcel, iU);
                    break;
                case 6:
                    strH = b.h(parcel, iU);
                    break;
                case 7:
                    strH2 = b.h(parcel, iU);
                    break;
                case 8:
                    iW5 = b.w(parcel, iU);
                    break;
                case 9:
                    iW = b.w(parcel, iU);
                    break;
                default:
                    b.B(parcel, iU);
                    break;
            }
        }
        b.m(parcel, iC);
        return new C3850o(iW2, iW3, iW4, jY, jY2, strH, strH2, iW5, iW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3850o[i10];
    }
}
