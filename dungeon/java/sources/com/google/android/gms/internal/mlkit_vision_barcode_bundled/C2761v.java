package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2761v extends p188k8.a {
    public static final Parcelable.Creator<C2761v> CREATOR = new C2663b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f34327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34328b;

    public C2761v(int i10, String str) {
        this.f34327a = i10;
        this.f34328b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f34327a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.n(parcel, 1, i11);
        p188k8.c.u(parcel, 2, this.f34328b, false);
        p188k8.c.b(parcel, iA);
    }
}
