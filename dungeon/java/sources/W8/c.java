package W8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        Intent intent = null;
        int iW = 0;
        int iW2 = 0;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            int iN = p188k8.b.n(iU);
            if (iN == 1) {
                iW = p188k8.b.w(parcel, iU);
            } else if (iN == 2) {
                iW2 = p188k8.b.w(parcel, iU);
            } else if (iN != 3) {
                p188k8.b.B(parcel, iU);
            } else {
                intent = (Intent) p188k8.b.g(parcel, iU, Intent.CREATOR);
            }
        }
        p188k8.b.m(parcel, iC);
        return new b(iW, iW2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
