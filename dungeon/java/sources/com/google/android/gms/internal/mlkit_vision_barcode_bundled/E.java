package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class E extends p188k8.a {
    public static final Parcelable.Creator<E> CREATOR = new F();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W f33294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Y f33295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f33296c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f33297d;

    public E(W w10, Y y10, boolean z10, boolean z11) {
        this.f33294a = w10;
        this.f33295b = y10;
        this.f33297d = z11;
    }

    public final W a4() {
        return this.f33294a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p188k8.c.a(parcel);
        p188k8.c.t(parcel, 1, this.f33294a, i10, false);
        p188k8.c.t(parcel, 2, this.f33295b, i10, false);
        p188k8.c.c(parcel, 3, this.f33296c);
        p188k8.c.c(parcel, 4, this.f33297d);
        p188k8.c.b(parcel, iA);
    }

    public final boolean zzb() {
        return this.f33297d;
    }
}
