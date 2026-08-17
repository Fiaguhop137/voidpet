package com.google.android.gms.games.internal.v2.appshortcuts;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.PersistableBundle;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends p188k8.a {
    public static final Parcelable.Creator<i> CREATOR = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PersistableBundle f32119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Boolean f32120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f32121d;

    i(String str, PersistableBundle persistableBundle, Boolean bool, Boolean bool2) {
        this.f32118a = str;
        this.f32119b = persistableBundle;
        this.f32120c = bool;
        this.f32121d = bool2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f32118a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.u(parcel, 1, str, false);
        p188k8.c.t(parcel, 2, this.f32119b, i10, false);
        p188k8.c.e(parcel, 3, this.f32120c, false);
        p188k8.c.e(parcel, 4, this.f32121d, false);
        p188k8.c.b(parcel, iA);
    }

    public final String zza() {
        return this.f32118a;
    }
}
