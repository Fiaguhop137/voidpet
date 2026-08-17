package M8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        String strH = null;
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
        int iW4 = 0;
        int iW5 = 0;
        int iW6 = 0;
        boolean zO = false;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            switch (p188k8.b.n(iU)) {
                case 1:
                    iW = p188k8.b.w(parcel, iU);
                    break;
                case 2:
                    iW2 = p188k8.b.w(parcel, iU);
                    break;
                case 3:
                    iW3 = p188k8.b.w(parcel, iU);
                    break;
                case 4:
                    iW4 = p188k8.b.w(parcel, iU);
                    break;
                case 5:
                    iW5 = p188k8.b.w(parcel, iU);
                    break;
                case 6:
                    iW6 = p188k8.b.w(parcel, iU);
                    break;
                case 7:
                    zO = p188k8.b.o(parcel, iU);
                    break;
                case 8:
                    strH = p188k8.b.h(parcel, iU);
                    break;
                default:
                    p188k8.b.B(parcel, iU);
                    break;
            }
        }
        p188k8.b.m(parcel, iC);
        return new c(iW, iW2, iW3, iW4, iW5, iW6, zO, strH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new c[i10];
    }
}
