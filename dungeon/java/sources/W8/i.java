package W8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        ArrayList arrayListJ = null;
        String strH = null;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            int iN = p188k8.b.n(iU);
            if (iN == 1) {
                arrayListJ = p188k8.b.j(parcel, iU);
            } else if (iN != 2) {
                p188k8.b.B(parcel, iU);
            } else {
                strH = p188k8.b.h(parcel, iU);
            }
        }
        p188k8.b.m(parcel, iC);
        return new h(arrayListJ, strH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new h[i10];
    }
}
