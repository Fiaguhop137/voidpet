package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class B6 extends p188k8.a {
    public static final Parcelable.Creator<B6> CREATOR = new C6();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final long f34883A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final String f34884B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final String f34885C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final long f34886D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f34887E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f34889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f34890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f34891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f34892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f34893f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f34894g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f34895h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f34896i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f34897j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f34898k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f34899l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f34900m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f34901n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f34902o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Boolean f34903p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f34904q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f34905r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f34906s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f34907t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f34908u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f34909v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f34910w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f34911x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f34912y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f34913z;

    B6(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z10, boolean z11, String str6, long j13, int i10, boolean z12, boolean z13, Boolean bool, long j14, List list, String str7, String str8, String str9, boolean z14, long j15, int i11, String str10, int i12, long j16, String str11, String str12, long j17, int i13) {
        p170j8.r.f(str);
        this.f34888a = str;
        this.f34889b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f34890c = str3;
        this.f34897j = j10;
        this.f34891d = str4;
        this.f34892e = j11;
        this.f34893f = j12;
        this.f34894g = str5;
        this.f34895h = z10;
        this.f34896i = z11;
        this.f34898k = str6;
        this.f34899l = j13;
        this.f34900m = i10;
        this.f34901n = z12;
        this.f34902o = z13;
        this.f34903p = bool;
        this.f34904q = j14;
        this.f34905r = list;
        this.f34906s = str7;
        this.f34907t = str8;
        this.f34908u = str9;
        this.f34909v = z14;
        this.f34910w = j15;
        this.f34911x = i11;
        this.f34912y = str10;
        this.f34913z = i12;
        this.f34883A = j16;
        this.f34884B = str11;
        this.f34885C = str12;
        this.f34886D = j17;
        this.f34887E = i13;
    }

    B6(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z10, boolean z11, long j12, String str6, long j13, int i10, boolean z12, boolean z13, Boolean bool, long j14, List list, String str7, String str8, String str9, boolean z14, long j15, int i11, String str10, int i12, long j16, String str11, String str12, long j17, int i13) {
        this.f34888a = str;
        this.f34889b = str2;
        this.f34890c = str3;
        this.f34897j = j12;
        this.f34891d = str4;
        this.f34892e = j10;
        this.f34893f = j11;
        this.f34894g = str5;
        this.f34895h = z10;
        this.f34896i = z11;
        this.f34898k = str6;
        this.f34899l = j13;
        this.f34900m = i10;
        this.f34901n = z12;
        this.f34902o = z13;
        this.f34903p = bool;
        this.f34904q = j14;
        this.f34905r = list;
        this.f34906s = str7;
        this.f34907t = str8;
        this.f34908u = str9;
        this.f34909v = z14;
        this.f34910w = j15;
        this.f34911x = i11;
        this.f34912y = str10;
        this.f34913z = i12;
        this.f34883A = j16;
        this.f34884B = str11;
        this.f34885C = str12;
        this.f34886D = j17;
        this.f34887E = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f34888a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.u(parcel, 2, str, false);
        p188k8.c.u(parcel, 3, this.f34889b, false);
        p188k8.c.u(parcel, 4, this.f34890c, false);
        p188k8.c.u(parcel, 5, this.f34891d, false);
        p188k8.c.r(parcel, 6, this.f34892e);
        p188k8.c.r(parcel, 7, this.f34893f);
        p188k8.c.u(parcel, 8, this.f34894g, false);
        p188k8.c.c(parcel, 9, this.f34895h);
        p188k8.c.c(parcel, 10, this.f34896i);
        p188k8.c.r(parcel, 11, this.f34897j);
        p188k8.c.u(parcel, 12, this.f34898k, false);
        p188k8.c.r(parcel, 14, this.f34899l);
        p188k8.c.n(parcel, 15, this.f34900m);
        p188k8.c.c(parcel, 16, this.f34901n);
        p188k8.c.c(parcel, 18, this.f34902o);
        p188k8.c.e(parcel, 21, this.f34903p, false);
        p188k8.c.r(parcel, 22, this.f34904q);
        p188k8.c.w(parcel, 23, this.f34905r, false);
        p188k8.c.u(parcel, 25, this.f34906s, false);
        p188k8.c.u(parcel, 26, this.f34907t, false);
        p188k8.c.u(parcel, 27, this.f34908u, false);
        p188k8.c.c(parcel, 28, this.f34909v);
        p188k8.c.r(parcel, 29, this.f34910w);
        p188k8.c.n(parcel, 30, this.f34911x);
        p188k8.c.u(parcel, 31, this.f34912y, false);
        p188k8.c.n(parcel, 32, this.f34913z);
        p188k8.c.r(parcel, 34, this.f34883A);
        p188k8.c.u(parcel, 35, this.f34884B, false);
        p188k8.c.u(parcel, 36, this.f34885C, false);
        p188k8.c.r(parcel, 37, this.f34886D);
        p188k8.c.n(parcel, 38, this.f34887E);
        p188k8.c.b(parcel, iA);
    }
}
