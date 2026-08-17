package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class M extends p188k8.a {
    public static final Parcelable.Creator<M> CREATOR = new N();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f31687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f31689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f31690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f31691e;

    M(boolean z10, String str, int i10, int i11, long j10) {
        this.f31687a = z10;
        this.f31688b = str;
        this.f31689c = V.a(i10) - 1;
        this.f31690d = x.a(i11) - 1;
        this.f31691e = j10;
    }

    public final int a4() {
        return V.a(this.f31689c);
    }

    public final int b() {
        return x.a(this.f31690d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p188k8.c.a(parcel);
        p188k8.c.c(parcel, 1, this.f31687a);
        p188k8.c.u(parcel, 2, this.f31688b, false);
        p188k8.c.n(parcel, 3, this.f31689c);
        p188k8.c.n(parcel, 4, this.f31690d);
        p188k8.c.r(parcel, 5, this.f31691e);
        p188k8.c.b(parcel, iA);
    }

    public final boolean zza() {
        return this.f31687a;
    }

    public final String zzb() {
        return this.f31688b;
    }

    public final long zzc() {
        return this.f31691e;
    }
}
