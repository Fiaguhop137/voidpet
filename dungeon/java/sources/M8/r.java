package M8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        i iVar = null;
        String strH = null;
        String strH2 = null;
        j[] jVarArr = null;
        g[] gVarArr = null;
        String[] strArrI = null;
        b[] bVarArr = null;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            switch (p188k8.b.n(iU)) {
                case 1:
                    iVar = (i) p188k8.b.g(parcel, iU, i.CREATOR);
                    break;
                case 2:
                    strH = p188k8.b.h(parcel, iU);
                    break;
                case 3:
                    strH2 = p188k8.b.h(parcel, iU);
                    break;
                case 4:
                    jVarArr = (j[]) p188k8.b.k(parcel, iU, j.CREATOR);
                    break;
                case 5:
                    gVarArr = (g[]) p188k8.b.k(parcel, iU, g.CREATOR);
                    break;
                case 6:
                    strArrI = p188k8.b.i(parcel, iU);
                    break;
                case 7:
                    bVarArr = (b[]) p188k8.b.k(parcel, iU, b.CREATOR);
                    break;
                default:
                    p188k8.b.B(parcel, iU);
                    break;
            }
        }
        p188k8.b.m(parcel, iC);
        return new e(iVar, strH, strH2, jVarArr, gVarArr, strArrI, bVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new e[i10];
    }
}
