package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class Y extends p188k8.a {
    public static final Parcelable.Creator<Y> CREATOR = new Z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f33401a;

    public Y(float[] fArr) {
        this.f33401a = fArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        float[] fArr = this.f33401a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.k(parcel, 1, fArr, false);
        p188k8.c.b(parcel, iA);
    }
}
