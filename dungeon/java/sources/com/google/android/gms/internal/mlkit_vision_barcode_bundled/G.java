package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class G extends p188k8.a {
    public static final Parcelable.Creator<G> CREATOR = new H();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U f33332a;

    public G(U u10) {
        this.f33332a = u10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        U u10 = this.f33332a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.t(parcel, 1, u10, i10, false);
        p188k8.c.b(parcel, iA);
    }
}
