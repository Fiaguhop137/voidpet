package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class w6 implements Parcelable.Creator {
    static void a(v6 v6Var, Parcel parcel, int i10) {
        int i11 = v6Var.f35910a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.n(parcel, 1, i11);
        p188k8.c.u(parcel, 2, v6Var.f35911b, false);
        p188k8.c.r(parcel, 3, v6Var.f35912c);
        p188k8.c.s(parcel, 4, v6Var.f35913d, false);
        p188k8.c.l(parcel, 5, null, false);
        p188k8.c.u(parcel, 6, v6Var.f35914e, false);
        p188k8.c.u(parcel, 7, v6Var.f35915f, false);
        p188k8.c.i(parcel, 8, v6Var.f35916g, false);
        p188k8.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        String strH = null;
        Long lZ = null;
        Float fT = null;
        String strH2 = null;
        String strH3 = null;
        Double dR = null;
        long jY = 0;
        int iW = 0;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            switch (p188k8.b.n(iU)) {
                case 1:
                    iW = p188k8.b.w(parcel, iU);
                    break;
                case 2:
                    strH = p188k8.b.h(parcel, iU);
                    break;
                case 3:
                    jY = p188k8.b.y(parcel, iU);
                    break;
                case 4:
                    lZ = p188k8.b.z(parcel, iU);
                    break;
                case 5:
                    fT = p188k8.b.t(parcel, iU);
                    break;
                case 6:
                    strH2 = p188k8.b.h(parcel, iU);
                    break;
                case 7:
                    strH3 = p188k8.b.h(parcel, iU);
                    break;
                case 8:
                    dR = p188k8.b.r(parcel, iU);
                    break;
                default:
                    p188k8.b.B(parcel, iU);
                    break;
            }
        }
        p188k8.b.m(parcel, iC);
        return new v6(iW, strH, jY, lZ, fT, strH2, strH3, dR);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new v6[i10];
    }
}
