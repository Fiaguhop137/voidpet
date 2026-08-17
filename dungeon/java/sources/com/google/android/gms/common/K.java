package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class K extends p188k8.a {
    public static final Parcelable.Creator<K> CREATOR = new L();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f31681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f31682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f31683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f31684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f31685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f31686g;

    K(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12, boolean z13, boolean z14) {
        this.f31680a = str;
        this.f31681b = z10;
        this.f31682c = z11;
        this.f31683d = (Context) p314r8.b.k(p314r8.a.AbstractBinderC0632a.h(iBinder));
        this.f31684e = z12;
        this.f31685f = z13;
        this.f31686g = z14;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [android.os.IBinder, r8.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f31680a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.u(parcel, 1, str, false);
        p188k8.c.c(parcel, 2, this.f31681b);
        p188k8.c.c(parcel, 3, this.f31682c);
        p188k8.c.m(parcel, 4, p314r8.b.c1(this.f31683d), false);
        p188k8.c.c(parcel, 5, this.f31684e);
        p188k8.c.c(parcel, 6, this.f31685f);
        p188k8.c.c(parcel, 8, this.f31686g);
        p188k8.c.b(parcel, iA);
    }
}
