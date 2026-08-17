package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2776y extends p188k8.a {
    public static final Parcelable.Creator<C2776y> CREATOR = new C2683f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f34353c;

    public C2776y(String str, String str2, int i10) {
        this.f34351a = str;
        this.f34352b = str2;
        this.f34353c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f34351a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.u(parcel, 1, str, false);
        p188k8.c.u(parcel, 2, this.f34352b, false);
        p188k8.c.n(parcel, 3, this.f34353c);
        p188k8.c.b(parcel, iA);
    }
}
