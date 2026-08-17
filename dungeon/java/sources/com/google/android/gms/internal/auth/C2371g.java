package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2371g extends p188k8.a {
    public static final Parcelable.Creator<C2371g> CREATOR = new C2374h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f32328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f32329b;

    public C2371g() {
        this.f32328a = 1;
    }

    C2371g(int i10, String str) {
        this.f32328a = i10;
        this.f32329b = str;
    }

    public final C2371g a4(String str) {
        this.f32329b = str;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p188k8.c.a(parcel);
        p188k8.c.n(parcel, 1, this.f32328a);
        p188k8.c.u(parcel, 2, this.f32329b, false);
        p188k8.c.b(parcel, iA);
    }
}
