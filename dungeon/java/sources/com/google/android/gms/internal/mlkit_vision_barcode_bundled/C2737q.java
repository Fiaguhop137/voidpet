package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2737q extends p188k8.a {
    public static final Parcelable.Creator<C2737q> CREATOR = new K();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2756u f34269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f34271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C2761v[] f34272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C2746s[] f34273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String[] f34274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C2722n[] f34275g;

    public C2737q(C2756u c2756u, String str, String str2, C2761v[] c2761vArr, C2746s[] c2746sArr, String[] strArr, C2722n[] c2722nArr) {
        this.f34269a = c2756u;
        this.f34270b = str;
        this.f34271c = str2;
        this.f34272d = c2761vArr;
        this.f34273e = c2746sArr;
        this.f34274f = strArr;
        this.f34275g = c2722nArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C2756u c2756u = this.f34269a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.t(parcel, 1, c2756u, i10, false);
        p188k8.c.u(parcel, 2, this.f34270b, false);
        p188k8.c.u(parcel, 3, this.f34271c, false);
        p188k8.c.x(parcel, 4, this.f34272d, i10, false);
        p188k8.c.x(parcel, 5, this.f34273e, i10, false);
        p188k8.c.v(parcel, 6, this.f34274f, false);
        p188k8.c.x(parcel, 7, this.f34275g, i10, false);
        p188k8.c.b(parcel, iA);
    }
}
