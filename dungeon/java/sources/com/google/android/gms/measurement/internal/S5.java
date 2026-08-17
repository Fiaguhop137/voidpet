package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class S5 extends p188k8.a {
    public static final Parcelable.Creator<S5> CREATOR = new T5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f35205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35206c;

    S5(String str, long j10, int i10) {
        this.f35204a = str;
        this.f35205b = j10;
        this.f35206c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f35204a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.u(parcel, 1, str, false);
        p188k8.c.r(parcel, 2, this.f35205b);
        p188k8.c.n(parcel, 3, this.f35206c);
        p188k8.c.b(parcel, iA);
    }
}
