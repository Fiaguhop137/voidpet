package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.a6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2914a6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        ArrayList arrayListL = null;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            if (p188k8.b.n(iU) != 1) {
                p188k8.b.B(parcel, iU);
            } else {
                arrayListL = p188k8.b.l(parcel, iU, X5.CREATOR);
            }
        }
        p188k8.b.m(parcel, iC);
        return new Z5(arrayListL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Z5[i10];
    }
}
