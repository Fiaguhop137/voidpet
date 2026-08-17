package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class C extends p188k8.a {
    public static final Parcelable.Creator<C> CREATOR = new D();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f33287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f33288b;

    public C(int i10, boolean z10) {
        this.f33287a = i10;
        this.f33288b = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p188k8.c.a(parcel);
        p188k8.c.n(parcel, 1, this.f33287a);
        p188k8.c.c(parcel, 2, this.f33288b);
        p188k8.c.b(parcel, iA);
    }

    public final int zza() {
        return this.f33287a;
    }

    public final boolean zzb() {
        return this.f33288b;
    }
}
