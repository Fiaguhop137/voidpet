package p350t8;

import android.os.Parcel;
import android.os.Parcelable;
import p188k8.b;
import p188k8.c;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements Parcelable.Creator {
    static void a(v vVar, Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.n(parcel, 1, vVar.s0());
        c.u(parcel, 2, vVar.zza(), false);
        c.u(parcel, 3, vVar.zzb(), false);
        c.u(parcel, 4, vVar.zzc(), false);
        c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = b.C(parcel);
        String strH = null;
        String strH2 = null;
        int iW = 0;
        String strH3 = null;
        while (parcel.dataPosition() < iC) {
            int iU = b.u(parcel);
            int iN = b.n(iU);
            if (iN == 1) {
                iW = b.w(parcel, iU);
            } else if (iN == 2) {
                strH = b.h(parcel, iU);
            } else if (iN == 3) {
                strH3 = b.h(parcel, iU);
            } else if (iN != 4) {
                b.B(parcel, iU);
            } else {
                strH2 = b.h(parcel, iU);
            }
        }
        b.m(parcel, iC);
        return new v(iW, strH, strH3, strH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new v[i10];
    }
}
