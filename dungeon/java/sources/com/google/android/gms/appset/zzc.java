package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import p188k8.a;
import p188k8.c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzc extends a {
    public static final Parcelable.Creator<zzc> CREATOR = new zzd();
    private final String zza;
    private final int zzb;

    public zzc(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.u(parcel, 1, this.zza, false);
        c.n(parcel, 2, this.zzb);
        c.b(parcel, iA);
    }

    public final int zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }
}
