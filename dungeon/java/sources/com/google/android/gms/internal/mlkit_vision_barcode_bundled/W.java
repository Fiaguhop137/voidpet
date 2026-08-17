package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class W extends p188k8.a {
    public static final Parcelable.Creator<W> CREATOR = new X();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f33395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f33397c;

    public W(float[] fArr, int i10, boolean z10) {
        this.f33395a = fArr;
        this.f33396b = i10;
        this.f33397c = z10;
    }

    public final float[] a4() {
        return this.f33395a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        float[] fArr = this.f33395a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.k(parcel, 1, fArr, false);
        p188k8.c.n(parcel, 2, this.f33396b);
        p188k8.c.c(parcel, 3, this.f33397c);
        p188k8.c.b(parcel, iA);
    }

    public final int zza() {
        return this.f33396b;
    }

    public final boolean zzb() {
        return this.f33397c;
    }
}
