package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2746s extends p188k8.a {
    public static final Parcelable.Creator<C2746s> CREATOR = new M();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f34300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f34302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f34303d;

    public C2746s(int i10, String str, String str2, String str3) {
        this.f34300a = i10;
        this.f34301b = str;
        this.f34302c = str2;
        this.f34303d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f34300a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.n(parcel, 1, i11);
        p188k8.c.u(parcel, 2, this.f34301b, false);
        p188k8.c.u(parcel, 3, this.f34302c, false);
        p188k8.c.u(parcel, 4, this.f34303d, false);
        p188k8.c.b(parcel, iA);
    }
}
