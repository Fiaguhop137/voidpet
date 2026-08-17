package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class E extends p188k8.a implements Iterable {
    public static final Parcelable.Creator<E> CREATOR = new F();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f34953a;

    E(Bundle bundle) {
        this.f34953a = bundle;
    }

    final Object a4(String str) {
        return this.f34953a.get(str);
    }

    public final int b() {
        return this.f34953a.size();
    }

    final Long b4(String str) {
        return Long.valueOf(this.f34953a.getLong(str));
    }

    final Double c4(String str) {
        return Double.valueOf(this.f34953a.getDouble("value"));
    }

    final String d4(String str) {
        return this.f34953a.getString(str);
    }

    public final Bundle e4() {
        return new Bundle(this.f34953a);
    }

    final /* synthetic */ Bundle f4() {
        return this.f34953a;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new D(this);
    }

    public final String toString() {
        return this.f34953a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p188k8.c.a(parcel);
        p188k8.c.f(parcel, 2, e4(), false);
        p188k8.c.b(parcel, iA);
    }
}
