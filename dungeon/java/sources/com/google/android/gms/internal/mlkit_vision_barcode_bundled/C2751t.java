package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2751t extends p188k8.a {
    public static final Parcelable.Creator<C2751t> CREATOR = new N();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f34305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f34306b;

    public C2751t(double d10, double d11) {
        this.f34305a = d10;
        this.f34306b = d11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        double d10 = this.f34305a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.h(parcel, 1, d10);
        p188k8.c.h(parcel, 2, this.f34306b);
        p188k8.c.b(parcel, iA);
    }
}
