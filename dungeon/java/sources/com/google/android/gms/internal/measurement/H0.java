package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class H0 extends p188k8.a {
    public static final Parcelable.Creator<H0> CREATOR = new I0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f32509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f32510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f32511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f32512e;

    public H0(long j10, long j11, boolean z10, Bundle bundle, String str) {
        this.f32508a = j10;
        this.f32509b = j11;
        this.f32510c = z10;
        this.f32511d = bundle;
        this.f32512e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f32508a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.r(parcel, 1, j10);
        p188k8.c.r(parcel, 2, this.f32509b);
        p188k8.c.c(parcel, 3, this.f32510c);
        p188k8.c.f(parcel, 7, this.f32511d, false);
        p188k8.c.u(parcel, 8, this.f32512e, false);
        p188k8.c.b(parcel, iA);
    }
}
