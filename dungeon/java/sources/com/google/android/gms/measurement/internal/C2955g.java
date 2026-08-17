package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2955g extends p188k8.a {
    public static final Parcelable.Creator<C2955g> CREATOR = new C2963h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f35545c;

    C2955g(long j10, int i10, long j11) {
        this.f35543a = j10;
        this.f35544b = i10;
        this.f35545c = j11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f35543a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.r(parcel, 1, j10);
        p188k8.c.n(parcel, 2, this.f35544b);
        p188k8.c.r(parcel, 3, this.f35545c);
        p188k8.c.b(parcel, iA);
    }
}
