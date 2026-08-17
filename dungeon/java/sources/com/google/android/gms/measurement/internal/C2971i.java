package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2971i extends p188k8.a {
    public static final Parcelable.Creator<C2971i> CREATOR = new C2979j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f35593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f35594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v6 f35595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f35596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f35597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f35598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final G f35599g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f35600h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public G f35601i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f35602j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final G f35603k;

    C2971i(C2971i c2971i) {
        p170j8.r.l(c2971i);
        this.f35593a = c2971i.f35593a;
        this.f35594b = c2971i.f35594b;
        this.f35595c = c2971i.f35595c;
        this.f35596d = c2971i.f35596d;
        this.f35597e = c2971i.f35597e;
        this.f35598f = c2971i.f35598f;
        this.f35599g = c2971i.f35599g;
        this.f35600h = c2971i.f35600h;
        this.f35601i = c2971i.f35601i;
        this.f35602j = c2971i.f35602j;
        this.f35603k = c2971i.f35603k;
    }

    C2971i(String str, String str2, v6 v6Var, long j10, boolean z10, String str3, G g10, long j11, G g11, long j12, G g12) {
        this.f35593a = str;
        this.f35594b = str2;
        this.f35595c = v6Var;
        this.f35596d = j10;
        this.f35597e = z10;
        this.f35598f = str3;
        this.f35599g = g10;
        this.f35600h = j11;
        this.f35601i = g11;
        this.f35602j = j12;
        this.f35603k = g12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p188k8.c.a(parcel);
        p188k8.c.u(parcel, 2, this.f35593a, false);
        p188k8.c.u(parcel, 3, this.f35594b, false);
        p188k8.c.t(parcel, 4, this.f35595c, i10, false);
        p188k8.c.r(parcel, 5, this.f35596d);
        p188k8.c.c(parcel, 6, this.f35597e);
        p188k8.c.u(parcel, 7, this.f35598f, false);
        p188k8.c.t(parcel, 8, this.f35599g, i10, false);
        p188k8.c.r(parcel, 9, this.f35600h);
        p188k8.c.t(parcel, 10, this.f35601i, i10, false);
        p188k8.c.r(parcel, 11, this.f35602j);
        p188k8.c.t(parcel, 12, this.f35603k, i10, false);
        p188k8.c.b(parcel, iA);
    }
}
