package p458z8;

import android.os.Parcel;
import android.os.Parcelable;
import p188k8.b;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = b.C(parcel);
        String strH = null;
        while (parcel.dataPosition() < iC) {
            int iU = b.u(parcel);
            if (b.n(iU) != 1) {
                b.B(parcel, iU);
            } else {
                strH = b.h(parcel, iU);
            }
        }
        b.m(parcel, iC);
        return new f(strH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new f[i10];
    }
}
