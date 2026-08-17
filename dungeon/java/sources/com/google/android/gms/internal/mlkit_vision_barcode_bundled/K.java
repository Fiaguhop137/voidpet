package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class K implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        C2756u c2756u = null;
        String strH = null;
        String strH2 = null;
        C2761v[] c2761vArr = null;
        C2746s[] c2746sArr = null;
        String[] strArrI = null;
        C2722n[] c2722nArr = null;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            switch (p188k8.b.n(iU)) {
                case 1:
                    c2756u = (C2756u) p188k8.b.g(parcel, iU, C2756u.CREATOR);
                    break;
                case 2:
                    strH = p188k8.b.h(parcel, iU);
                    break;
                case 3:
                    strH2 = p188k8.b.h(parcel, iU);
                    break;
                case 4:
                    c2761vArr = (C2761v[]) p188k8.b.k(parcel, iU, C2761v.CREATOR);
                    break;
                case 5:
                    c2746sArr = (C2746s[]) p188k8.b.k(parcel, iU, C2746s.CREATOR);
                    break;
                case 6:
                    strArrI = p188k8.b.i(parcel, iU);
                    break;
                case 7:
                    c2722nArr = (C2722n[]) p188k8.b.k(parcel, iU, C2722n.CREATOR);
                    break;
                default:
                    p188k8.b.B(parcel, iU);
                    break;
            }
        }
        p188k8.b.m(parcel, iC);
        return new C2737q(c2756u, strH, strH2, c2761vArr, c2746sArr, strArrI, c2722nArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2737q[i10];
    }
}
