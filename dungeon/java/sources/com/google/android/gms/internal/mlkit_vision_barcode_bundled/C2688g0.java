package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2688g0 extends p188k8.a {
    public static final Parcelable.Creator<C2688g0> CREATOR = new C2693h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f34219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f34220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f34221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f34222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f34223e;

    public C2688g0(int i10, int i11, int i12, int i13, long j10) {
        this.f34219a = i10;
        this.f34220b = i11;
        this.f34221c = i12;
        this.f34222d = i13;
        this.f34223e = j10;
    }

    public final int a4() {
        return this.f34219a;
    }

    public final int b4() {
        return this.f34222d;
    }

    public final int c4() {
        return this.f34220b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p188k8.c.a(parcel);
        p188k8.c.n(parcel, 1, this.f34219a);
        p188k8.c.n(parcel, 2, this.f34220b);
        p188k8.c.n(parcel, 3, this.f34221c);
        p188k8.c.n(parcel, 4, this.f34222d);
        p188k8.c.r(parcel, 5, this.f34223e);
        p188k8.c.b(parcel, iA);
    }

    public final int zza() {
        return this.f34221c;
    }
}
