package W8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C2333b;
import p170j8.T;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        C2333b c2333b = null;
        int iW = 0;
        T t10 = null;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            int iN = p188k8.b.n(iU);
            if (iN == 1) {
                iW = p188k8.b.w(parcel, iU);
            } else if (iN == 2) {
                c2333b = (C2333b) p188k8.b.g(parcel, iU, C2333b.CREATOR);
            } else if (iN != 3) {
                p188k8.b.B(parcel, iU);
            } else {
                t10 = (T) p188k8.b.g(parcel, iU, T.CREATOR);
            }
        }
        p188k8.b.m(parcel, iC);
        return new l(iW, c2333b, t10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new l[i10];
    }
}
