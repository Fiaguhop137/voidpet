package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends p188k8.a {
    public static final Parcelable.Creator<r> CREATOR = new L();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f34280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f34281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f34282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f34283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f34284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f34285h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f34286i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f34287j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f34288k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f34289l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f34290m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f34291n;

    public r(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f34278a = str;
        this.f34279b = str2;
        this.f34280c = str3;
        this.f34281d = str4;
        this.f34282e = str5;
        this.f34283f = str6;
        this.f34284g = str7;
        this.f34285h = str8;
        this.f34286i = str9;
        this.f34287j = str10;
        this.f34288k = str11;
        this.f34289l = str12;
        this.f34290m = str13;
        this.f34291n = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f34278a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.u(parcel, 1, str, false);
        p188k8.c.u(parcel, 2, this.f34279b, false);
        p188k8.c.u(parcel, 3, this.f34280c, false);
        p188k8.c.u(parcel, 4, this.f34281d, false);
        p188k8.c.u(parcel, 5, this.f34282e, false);
        p188k8.c.u(parcel, 6, this.f34283f, false);
        p188k8.c.u(parcel, 7, this.f34284g, false);
        p188k8.c.u(parcel, 8, this.f34285h, false);
        p188k8.c.u(parcel, 9, this.f34286i, false);
        p188k8.c.u(parcel, 10, this.f34287j, false);
        p188k8.c.u(parcel, 11, this.f34288k, false);
        p188k8.c.u(parcel, 12, this.f34289l, false);
        p188k8.c.u(parcel, 13, this.f34290m, false);
        p188k8.c.u(parcel, 14, this.f34291n, false);
        p188k8.c.b(parcel, iA);
    }
}
