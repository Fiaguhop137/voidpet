package p170j8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p188k8.b;

/* JADX INFO: loaded from: classes2.dex */
public final class A implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = b.C(parcel);
        ArrayList arrayListL = null;
        int iW = 0;
        while (parcel.dataPosition() < iC) {
            int iU = b.u(parcel);
            int iN = b.n(iU);
            if (iN == 1) {
                iW = b.w(parcel, iU);
            } else if (iN != 2) {
                b.B(parcel, iU);
            } else {
                arrayListL = b.l(parcel, iU, C3850o.CREATOR);
            }
        }
        b.m(parcel, iC);
        return new C3856v(iW, arrayListL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3856v[i10];
    }
}
