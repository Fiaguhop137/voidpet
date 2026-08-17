package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2771x extends p188k8.a {
    public static final Parcelable.Creator<C2771x> CREATOR = new C2678e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34337b;

    public C2771x(String str, String str2) {
        this.f34336a = str;
        this.f34337b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f34336a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.u(parcel, 1, str, false);
        p188k8.c.u(parcel, 2, this.f34337b, false);
        p188k8.c.b(parcel, iA);
    }
}
