package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class X5 extends p188k8.a {
    public static final Parcelable.Creator<X5> CREATOR = new Y5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f35292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f35293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f35294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f35295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f35296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f35297g;

    X5(long j10, byte[] bArr, String str, Bundle bundle, int i10, long j11, String str2) {
        this.f35291a = j10;
        this.f35292b = bArr;
        this.f35293c = str;
        this.f35294d = bundle;
        this.f35295e = i10;
        this.f35296f = j11;
        this.f35297g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f35291a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.r(parcel, 1, j10);
        p188k8.c.g(parcel, 2, this.f35292b, false);
        p188k8.c.u(parcel, 3, this.f35293c, false);
        p188k8.c.f(parcel, 4, this.f35294d, false);
        p188k8.c.n(parcel, 5, this.f35295e);
        p188k8.c.r(parcel, 6, this.f35296f);
        p188k8.c.u(parcel, 7, this.f35297g, false);
        p188k8.c.b(parcel, iA);
    }
}
