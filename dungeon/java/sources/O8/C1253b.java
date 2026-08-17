package O8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: O8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1253b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        int iW = 0;
        boolean zO = false;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            int iN = p188k8.b.n(iU);
            if (iN == 2) {
                iW = p188k8.b.w(parcel, iU);
            } else if (iN != 3) {
                p188k8.b.B(parcel, iU);
            } else {
                zO = p188k8.b.o(parcel, iU);
            }
        }
        p188k8.b.m(parcel, iC);
        return new C1252a(iW, zO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C1252a[i10];
    }
}
