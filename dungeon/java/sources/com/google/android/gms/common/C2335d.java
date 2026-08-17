package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import p170j8.AbstractC3851p;

/* JADX INFO: renamed from: com.google.android.gms.common.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2335d extends p188k8.a {

    @NonNull
    public static final Parcelable.Creator<C2335d> CREATOR = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f31880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f31881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f31882d;

    public C2335d(String str, int i10, long j10, boolean z10) {
        this.f31879a = str;
        this.f31880b = i10;
        this.f31881c = j10;
        this.f31882d = z10;
    }

    public C2335d(String str, long j10) {
        this(str, -1, j10, false);
    }

    public boolean a4() {
        return this.f31882d;
    }

    public long b4() {
        long j10 = this.f31881c;
        return j10 == -1 ? this.f31880b : j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2335d) {
            C2335d c2335d = (C2335d) obj;
            if (AbstractC3851p.a(getName(), c2335d.getName()) && b4() == c2335d.b4() && a4() == c2335d.a4()) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return this.f31879a;
    }

    public final int hashCode() {
        return AbstractC3851p.b(getName(), Long.valueOf(b4()), Boolean.valueOf(a4()));
    }

    public final String toString() {
        AbstractC3851p.a aVarC = AbstractC3851p.c(this);
        aVarC.a("name", getName());
        aVarC.a("version", Long.valueOf(b4()));
        aVarC.a("is_fully_rolled_out", Boolean.valueOf(a4()));
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p188k8.c.a(parcel);
        p188k8.c.u(parcel, 1, getName(), false);
        p188k8.c.n(parcel, 2, this.f31880b);
        p188k8.c.r(parcel, 3, b4());
        p188k8.c.c(parcel, 4, a4());
        p188k8.c.b(parcel, iA);
    }
}
