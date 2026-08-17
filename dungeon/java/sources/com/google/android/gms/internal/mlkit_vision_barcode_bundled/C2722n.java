package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2722n extends p188k8.a {
    public static final Parcelable.Creator<C2722n> CREATOR = new C2717m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f34245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String[] f34246b;

    public C2722n(int i10, String[] strArr) {
        this.f34245a = i10;
        this.f34246b = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p188k8.c.a(parcel);
        p188k8.c.n(parcel, 1, this.f34245a);
        p188k8.c.v(parcel, 2, this.f34246b, false);
        p188k8.c.b(parcel, iA);
    }
}
