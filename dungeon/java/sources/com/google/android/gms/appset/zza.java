package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import p188k8.a;
import p188k8.c;

/* JADX INFO: loaded from: classes2.dex */
public final class zza extends a {
    public static final Parcelable.Creator<zza> CREATOR = new zzb();
    private final String zza;
    private final String zzb;

    public zza(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.u(parcel, 1, this.zza, false);
        c.u(parcel, 2, this.zzb, false);
        c.b(parcel, iA);
    }
}
