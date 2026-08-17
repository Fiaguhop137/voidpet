package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class U extends p188k8.a {
    public static final Parcelable.Creator<U> CREATOR = new V();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f33380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f33381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f33382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f33383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f33384e;

    public U(boolean z10, byte[] bArr, boolean z11, float f10, boolean z12) {
        this.f33380a = z10;
        this.f33381b = bArr;
        this.f33382c = z11;
        this.f33383d = f10;
        this.f33384e = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10 = this.f33380a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.c(parcel, 1, z10);
        p188k8.c.g(parcel, 2, this.f33381b, false);
        p188k8.c.c(parcel, 3, this.f33382c);
        p188k8.c.j(parcel, 4, this.f33383d);
        p188k8.c.c(parcel, 5, this.f33384e);
        p188k8.c.b(parcel, iA);
    }
}
