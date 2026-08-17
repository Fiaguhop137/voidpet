package p081e8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p188k8.b;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = b.C(parcel);
        Bundle bundleB = null;
        int iW = 0;
        int iW2 = 0;
        while (parcel.dataPosition() < iC) {
            int iU = b.u(parcel);
            int iN = b.n(iU);
            if (iN == 1) {
                iW = b.w(parcel, iU);
            } else if (iN == 2) {
                iW2 = b.w(parcel, iU);
            } else if (iN != 3) {
                b.B(parcel, iU);
            } else {
                bundleB = b.b(parcel, iU);
            }
        }
        b.m(parcel, iC);
        return new a(iW, iW2, bundleB);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
