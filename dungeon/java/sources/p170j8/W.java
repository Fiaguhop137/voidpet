package p170j8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import p188k8.b;

/* JADX INFO: loaded from: classes2.dex */
public final class W implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = b.C(parcel);
        Scope[] scopeArr = null;
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
        while (parcel.dataPosition() < iC) {
            int iU = b.u(parcel);
            int iN = b.n(iU);
            if (iN == 1) {
                iW = b.w(parcel, iU);
            } else if (iN == 2) {
                iW2 = b.w(parcel, iU);
            } else if (iN == 3) {
                iW3 = b.w(parcel, iU);
            } else if (iN != 4) {
                b.B(parcel, iU);
            } else {
                scopeArr = (Scope[]) b.k(parcel, iU, Scope.CREATOR);
            }
        }
        b.m(parcel, iC);
        return new V(iW, iW2, iW3, scopeArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new V[i10];
    }
}
