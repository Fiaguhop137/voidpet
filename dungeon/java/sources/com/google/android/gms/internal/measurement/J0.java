package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class J0 extends p188k8.a {
    public static final Parcelable.Creator<J0> CREATOR = new K0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f32548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Intent f32549c;

    public J0(int i10, String str, Intent intent) {
        this.f32547a = i10;
        this.f32548b = str;
        this.f32549c = intent;
    }

    public static J0 a4(Activity activity) {
        return new J0(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J0)) {
            return false;
        }
        J0 j10 = (J0) obj;
        return this.f32547a == j10.f32547a && Objects.equals(this.f32548b, j10.f32548b) && Objects.equals(this.f32549c, j10.f32549c);
    }

    public final int hashCode() {
        return this.f32547a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f32547a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.n(parcel, 1, i11);
        p188k8.c.u(parcel, 2, this.f32548b, false);
        p188k8.c.t(parcel, 3, this.f32549c, i10, false);
        p188k8.c.b(parcel, iA);
    }
}
