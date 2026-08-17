package M8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        String strH4 = null;
        String strH5 = null;
        c cVar = null;
        c cVar2 = null;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            switch (p188k8.b.n(iU)) {
                case 1:
                    strH = p188k8.b.h(parcel, iU);
                    break;
                case 2:
                    strH2 = p188k8.b.h(parcel, iU);
                    break;
                case 3:
                    strH3 = p188k8.b.h(parcel, iU);
                    break;
                case 4:
                    strH4 = p188k8.b.h(parcel, iU);
                    break;
                case 5:
                    strH5 = p188k8.b.h(parcel, iU);
                    break;
                case 6:
                    cVar = (c) p188k8.b.g(parcel, iU, c.CREATOR);
                    break;
                case 7:
                    cVar2 = (c) p188k8.b.g(parcel, iU, c.CREATOR);
                    break;
                default:
                    p188k8.b.B(parcel, iU);
                    break;
            }
        }
        p188k8.b.m(parcel, iC);
        return new d(strH, strH2, strH3, strH4, strH5, cVar, cVar2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new d[i10];
    }
}
