package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Z5 extends p188k8.a {
    public static final Parcelable.Creator<Z5> CREATOR = new C2914a6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f35326a;

    Z5(List list) {
        this.f35326a = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f35326a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.y(parcel, 1, list, false);
        p188k8.c.b(parcel, iA);
    }
}
