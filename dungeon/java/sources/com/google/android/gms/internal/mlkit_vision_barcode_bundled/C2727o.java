package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2727o extends p188k8.a {
    public static final Parcelable.Creator<C2727o> CREATOR = new I();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f34253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f34254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f34255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f34256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f34257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f34258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f34259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f34260h;

    public C2727o(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, String str) {
        this.f34253a = i10;
        this.f34254b = i11;
        this.f34255c = i12;
        this.f34256d = i13;
        this.f34257e = i14;
        this.f34258f = i15;
        this.f34259g = z10;
        this.f34260h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f34253a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.n(parcel, 1, i11);
        p188k8.c.n(parcel, 2, this.f34254b);
        p188k8.c.n(parcel, 3, this.f34255c);
        p188k8.c.n(parcel, 4, this.f34256d);
        p188k8.c.n(parcel, 5, this.f34257e);
        p188k8.c.n(parcel, 6, this.f34258f);
        p188k8.c.c(parcel, 7, this.f34259g);
        p188k8.c.u(parcel, 8, this.f34260h, false);
        p188k8.c.b(parcel, iA);
    }
}
