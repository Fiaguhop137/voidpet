package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2732p extends p188k8.a {
    public static final Parcelable.Creator<C2732p> CREATOR = new J();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f34263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f34264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f34265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C2727o f34266f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C2727o f34267g;

    public C2732p(String str, String str2, String str3, String str4, String str5, C2727o c2727o, C2727o c2727o2) {
        this.f34261a = str;
        this.f34262b = str2;
        this.f34263c = str3;
        this.f34264d = str4;
        this.f34265e = str5;
        this.f34266f = c2727o;
        this.f34267g = c2727o2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f34261a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.u(parcel, 1, str, false);
        p188k8.c.u(parcel, 2, this.f34262b, false);
        p188k8.c.u(parcel, 3, this.f34263c, false);
        p188k8.c.u(parcel, 4, this.f34264d, false);
        p188k8.c.u(parcel, 5, this.f34265e, false);
        p188k8.c.t(parcel, 6, this.f34266f, i10, false);
        p188k8.c.t(parcel, 7, this.f34267g, i10, false);
        p188k8.c.b(parcel, iA);
    }
}
