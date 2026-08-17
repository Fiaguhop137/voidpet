package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2756u extends p188k8.a {
    public static final Parcelable.Creator<C2756u> CREATOR = new C2658a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f34310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f34311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f34312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f34313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f34314g;

    public C2756u(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f34308a = str;
        this.f34309b = str2;
        this.f34310c = str3;
        this.f34311d = str4;
        this.f34312e = str5;
        this.f34313f = str6;
        this.f34314g = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f34308a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.u(parcel, 1, str, false);
        p188k8.c.u(parcel, 2, this.f34309b, false);
        p188k8.c.u(parcel, 3, this.f34310c, false);
        p188k8.c.u(parcel, 4, this.f34311d, false);
        p188k8.c.u(parcel, 5, this.f34312e, false);
        p188k8.c.u(parcel, 6, this.f34313f, false);
        p188k8.c.u(parcel, 7, this.f34314g, false);
        p188k8.c.b(parcel, iA);
    }
}
