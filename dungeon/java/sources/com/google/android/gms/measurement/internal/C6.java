package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class C6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        boolean zO = false;
        int iW = 0;
        boolean zO2 = false;
        boolean zO3 = false;
        int iW2 = 0;
        int iW3 = 0;
        long jY = 0;
        long jY2 = 0;
        long jY3 = 0;
        long jY4 = 0;
        long jY5 = 0;
        long jY6 = 0;
        long jY7 = 0;
        String strH = "";
        String strH2 = strH;
        String strH3 = strH2;
        String strH4 = strH3;
        String strH5 = null;
        String strH6 = null;
        String strH7 = null;
        String strH8 = null;
        String strH9 = null;
        String strH10 = null;
        Boolean boolP = null;
        ArrayList arrayListJ = null;
        String strH11 = null;
        String strH12 = null;
        int iW4 = 100;
        boolean zO4 = true;
        boolean zO5 = true;
        long jY8 = -2147483648L;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            switch (p188k8.b.n(iU)) {
                case 2:
                    strH5 = p188k8.b.h(parcel, iU);
                    break;
                case 3:
                    strH6 = p188k8.b.h(parcel, iU);
                    break;
                case 4:
                    strH7 = p188k8.b.h(parcel, iU);
                    break;
                case 5:
                    strH8 = p188k8.b.h(parcel, iU);
                    break;
                case 6:
                    jY = p188k8.b.y(parcel, iU);
                    break;
                case 7:
                    jY2 = p188k8.b.y(parcel, iU);
                    break;
                case 8:
                    strH9 = p188k8.b.h(parcel, iU);
                    break;
                case 9:
                    zO4 = p188k8.b.o(parcel, iU);
                    break;
                case 10:
                    zO = p188k8.b.o(parcel, iU);
                    break;
                case 11:
                    jY8 = p188k8.b.y(parcel, iU);
                    break;
                case 12:
                    strH10 = p188k8.b.h(parcel, iU);
                    break;
                case 13:
                case 17:
                case 19:
                case 20:
                case 24:
                case 33:
                default:
                    p188k8.b.B(parcel, iU);
                    break;
                case 14:
                    jY3 = p188k8.b.y(parcel, iU);
                    break;
                case 15:
                    iW = p188k8.b.w(parcel, iU);
                    break;
                case 16:
                    zO5 = p188k8.b.o(parcel, iU);
                    break;
                case 18:
                    zO2 = p188k8.b.o(parcel, iU);
                    break;
                case 21:
                    boolP = p188k8.b.p(parcel, iU);
                    break;
                case 22:
                    jY4 = p188k8.b.y(parcel, iU);
                    break;
                case 23:
                    arrayListJ = p188k8.b.j(parcel, iU);
                    break;
                case 25:
                    strH = p188k8.b.h(parcel, iU);
                    break;
                case 26:
                    strH2 = p188k8.b.h(parcel, iU);
                    break;
                case 27:
                    strH11 = p188k8.b.h(parcel, iU);
                    break;
                case 28:
                    zO3 = p188k8.b.o(parcel, iU);
                    break;
                case 29:
                    jY5 = p188k8.b.y(parcel, iU);
                    break;
                case 30:
                    iW4 = p188k8.b.w(parcel, iU);
                    break;
                case 31:
                    strH3 = p188k8.b.h(parcel, iU);
                    break;
                case 32:
                    iW2 = p188k8.b.w(parcel, iU);
                    break;
                case 34:
                    jY6 = p188k8.b.y(parcel, iU);
                    break;
                case 35:
                    strH12 = p188k8.b.h(parcel, iU);
                    break;
                case 36:
                    strH4 = p188k8.b.h(parcel, iU);
                    break;
                case 37:
                    jY7 = p188k8.b.y(parcel, iU);
                    break;
                case 38:
                    iW3 = p188k8.b.w(parcel, iU);
                    break;
            }
        }
        p188k8.b.m(parcel, iC);
        return new B6(strH5, strH6, strH7, strH8, jY, jY2, strH9, zO4, zO, jY8, strH10, jY3, iW, zO5, zO2, boolP, jY4, arrayListJ, strH, strH2, strH11, zO3, jY5, iW4, strH3, iW2, jY6, strH12, strH4, jY7, iW3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new B6[i10];
    }
}
