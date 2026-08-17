package p170j8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C2335d;
import p188k8.b;

/* JADX INFO: loaded from: classes2.dex */
public final class o0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = b.C(parcel);
        Bundle bundleB = null;
        C3841f c3841f = null;
        int iW = 0;
        C2335d[] c2335dArr = null;
        while (parcel.dataPosition() < iC) {
            int iU = b.u(parcel);
            int iN = b.n(iU);
            if (iN == 1) {
                bundleB = b.b(parcel, iU);
            } else if (iN == 2) {
                c2335dArr = (C2335d[]) b.k(parcel, iU, C2335d.CREATOR);
            } else if (iN == 3) {
                iW = b.w(parcel, iU);
            } else if (iN != 4) {
                b.B(parcel, iU);
            } else {
                c3841f = (C3841f) b.g(parcel, iU, C3841f.CREATOR);
            }
        }
        b.m(parcel, iC);
        return new n0(bundleB, c2335dArr, iW, c3841f);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new n0[i10];
    }
}
