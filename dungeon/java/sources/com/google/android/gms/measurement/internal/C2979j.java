package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2979j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        String strH = null;
        String strH2 = null;
        v6 v6Var = null;
        String strH3 = null;
        G g10 = null;
        G g11 = null;
        G g12 = null;
        long jY = 0;
        long jY2 = 0;
        long jY3 = 0;
        boolean zO = false;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            switch (p188k8.b.n(iU)) {
                case 2:
                    strH = p188k8.b.h(parcel, iU);
                    break;
                case 3:
                    strH2 = p188k8.b.h(parcel, iU);
                    break;
                case 4:
                    v6Var = (v6) p188k8.b.g(parcel, iU, v6.CREATOR);
                    break;
                case 5:
                    jY = p188k8.b.y(parcel, iU);
                    break;
                case 6:
                    zO = p188k8.b.o(parcel, iU);
                    break;
                case 7:
                    strH3 = p188k8.b.h(parcel, iU);
                    break;
                case 8:
                    g10 = (G) p188k8.b.g(parcel, iU, G.CREATOR);
                    break;
                case 9:
                    jY2 = p188k8.b.y(parcel, iU);
                    break;
                case 10:
                    g11 = (G) p188k8.b.g(parcel, iU, G.CREATOR);
                    break;
                case 11:
                    jY3 = p188k8.b.y(parcel, iU);
                    break;
                case 12:
                    g12 = (G) p188k8.b.g(parcel, iU, G.CREATOR);
                    break;
                default:
                    p188k8.b.B(parcel, iU);
                    break;
            }
        }
        p188k8.b.m(parcel, iC);
        return new C2971i(strH, strH2, v6Var, jY, zO, strH3, g10, jY2, g11, jY3, g12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2971i[i10];
    }
}
