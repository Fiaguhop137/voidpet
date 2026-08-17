package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class H implements Parcelable.Creator {
    static void a(G g10, Parcel parcel, int i10) {
        String str = g10.f35006a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.u(parcel, 2, str, false);
        p188k8.c.t(parcel, 3, g10.f35007b, i10, false);
        p188k8.c.u(parcel, 4, g10.f35008c, false);
        p188k8.c.r(parcel, 5, g10.f35009d);
        p188k8.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        long jY = 0;
        String strH = null;
        E e10 = null;
        String strH2 = null;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            int iN = p188k8.b.n(iU);
            if (iN == 2) {
                strH = p188k8.b.h(parcel, iU);
            } else if (iN == 3) {
                e10 = (E) p188k8.b.g(parcel, iU, E.CREATOR);
            } else if (iN == 4) {
                strH2 = p188k8.b.h(parcel, iU);
            } else if (iN != 5) {
                p188k8.b.B(parcel, iU);
            } else {
                jY = p188k8.b.y(parcel, iU);
            }
        }
        p188k8.b.m(parcel, iC);
        return new G(strH, e10, strH2, jY);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new G[i10];
    }
}
