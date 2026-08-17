package p350t8;

import android.os.Parcel;
import android.os.Parcelable;
import p188k8.b;
import p188k8.c;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements Parcelable.Creator {
    static void a(n nVar, Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.n(parcel, 1, nVar.a2());
        c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = b.C(parcel);
        int iW = 0;
        while (parcel.dataPosition() < iC) {
            int iU = b.u(parcel);
            if (b.n(iU) != 1) {
                b.B(parcel, iU);
            } else {
                iW = b.w(parcel, iU);
            }
        }
        b.m(parcel, iC);
        return new n(iW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new n[i10];
    }
}
