package com.google.android.gms.ads.identifier;

import com.google.android.gms.tasks.OnFailureListener;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzc implements OnFailureListener {
    public final /* synthetic */ zzd zza;
    public final /* synthetic */ long zzb;

    public /* synthetic */ zzc(zzd zzdVar, long j10) {
        this.zza = zzdVar;
        this.zzb = j10;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        zzd.zzb(this.zza, this.zzb, exc);
    }
}
