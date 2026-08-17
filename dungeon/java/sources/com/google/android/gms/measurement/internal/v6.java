package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class v6 extends p188k8.a {
    public static final Parcelable.Creator<v6> CREATOR = new w6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f35912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f35913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f35914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f35915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f35916g;

    v6(int i10, String str, long j10, Long l10, Float f10, String str2, String str3, Double d10) {
        this.f35910a = i10;
        this.f35911b = str;
        this.f35912c = j10;
        this.f35913d = l10;
        this.f35916g = i10 == 1 ? f10 != null ? Double.valueOf(f10.doubleValue()) : null : d10;
        this.f35914e = str2;
        this.f35915f = str3;
    }

    v6(x6 x6Var) {
        this(x6Var.f36017c, x6Var.f36018d, x6Var.f36019e, x6Var.f36016b);
    }

    v6(String str, long j10, Object obj, String str2) {
        p170j8.r.f(str);
        this.f35910a = 2;
        this.f35911b = str;
        this.f35912c = j10;
        this.f35915f = str2;
        if (obj == null) {
            this.f35913d = null;
            this.f35916g = null;
            this.f35914e = null;
            return;
        }
        if (obj instanceof Long) {
            this.f35913d = (Long) obj;
            this.f35916g = null;
            this.f35914e = null;
        } else if (obj instanceof String) {
            this.f35913d = null;
            this.f35916g = null;
            this.f35914e = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("User attribute given of un-supported type");
            }
            this.f35913d = null;
            this.f35916g = (Double) obj;
            this.f35914e = null;
        }
    }

    public final Object a4() {
        Long l10 = this.f35913d;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f35916g;
        if (d10 != null) {
            return d10;
        }
        String str = this.f35914e;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        w6.a(this, parcel, i10);
    }
}
