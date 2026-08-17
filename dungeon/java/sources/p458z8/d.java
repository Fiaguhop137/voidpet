package p458z8;

import android.os.Parcel;
import android.os.Parcelable;
import p188k8.b;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = b.C(parcel);
        boolean zO = false;
        boolean zO2 = false;
        boolean zO3 = false;
        boolean zO4 = false;
        boolean zO5 = false;
        boolean zO6 = false;
        boolean zO7 = false;
        boolean zO8 = false;
        boolean zO9 = false;
        boolean zO10 = false;
        while (parcel.dataPosition() < iC) {
            int iU = b.u(parcel);
            switch (b.n(iU)) {
                case 1:
                    zO = b.o(parcel, iU);
                    break;
                case 2:
                    zO2 = b.o(parcel, iU);
                    break;
                case 3:
                    zO3 = b.o(parcel, iU);
                    break;
                case 4:
                    zO4 = b.o(parcel, iU);
                    break;
                case 5:
                    zO5 = b.o(parcel, iU);
                    break;
                case 6:
                    zO6 = b.o(parcel, iU);
                    break;
                case 7:
                    zO7 = b.o(parcel, iU);
                    break;
                case 8:
                    zO8 = b.o(parcel, iU);
                    break;
                case 9:
                    zO9 = b.o(parcel, iU);
                    break;
                case 10:
                    zO10 = b.o(parcel, iU);
                    break;
                default:
                    b.B(parcel, iU);
                    break;
            }
        }
        b.m(parcel, iC);
        return new c(zO, zO2, zO3, zO4, zO5, zO6, zO7, zO8, zO9, zO10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new c[i10];
    }
}
