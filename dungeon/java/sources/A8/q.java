package A8;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        String strH = null;
        ComponentName componentName = null;
        String strH2 = null;
        int iW = 0;
        long jY = 0;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            int iN = p188k8.b.n(iU);
            if (iN == 1) {
                jY = p188k8.b.y(parcel, iU);
            } else if (iN == 2) {
                strH = p188k8.b.h(parcel, iU);
            } else if (iN == 3) {
                iW = p188k8.b.w(parcel, iU);
            } else if (iN == 4) {
                componentName = (ComponentName) p188k8.b.g(parcel, iU, ComponentName.CREATOR);
            } else if (iN != 5) {
                p188k8.b.B(parcel, iU);
            } else {
                strH2 = p188k8.b.h(parcel, iU);
            }
        }
        p188k8.b.m(parcel, iC);
        return new p(jY, strH, iW, componentName, strH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new p[i10];
    }
}
