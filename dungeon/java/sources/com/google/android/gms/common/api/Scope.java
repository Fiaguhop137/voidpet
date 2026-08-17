package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p170j8.r;
import p188k8.c;

/* JADX INFO: loaded from: classes2.dex */
public final class Scope extends p188k8.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<Scope> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f31711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31712b;

    Scope(int i10, String str) {
        r.g(str, "scopeUri must not be null or empty");
        this.f31711a = i10;
        this.f31712b = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public String a4() {
        return this.f31712b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f31712b.equals(((Scope) obj).f31712b);
        }
        return false;
    }

    public int hashCode() {
        return this.f31712b.hashCode();
    }

    public String toString() {
        return this.f31712b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f31711a;
        int iA = c.a(parcel);
        c.n(parcel, 1, i11);
        c.u(parcel, 2, a4(), false);
        c.b(parcel, iA);
    }
}
