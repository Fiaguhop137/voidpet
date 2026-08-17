package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.C2333b;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import p170j8.AbstractC3857w;
import p170j8.C3850o;
import p170j8.C3856v;
import p170j8.C3859y;
import p170j8.InterfaceC3858x;

/* JADX INFO: loaded from: classes2.dex */
public final class zzd {
    private static volatile zzd zza;
    private static final Object zzb = new Object();
    private static final Duration zzc = Duration.ofMinutes(30);
    private final InterfaceC3858x zzd;
    private final AtomicLong zze = new AtomicLong(-1);

    private zzd(Context context, String str) {
        this.zzd = AbstractC3857w.b(context, C3859y.a().b("ads_identifier:api").a());
    }

    public static zzd zza(Context context) {
        if (zza == null) {
            synchronized (zzb) {
                try {
                    if (zza == null) {
                        zza = new zzd(context, "ads_identifier:api");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zza;
    }

    public static /* synthetic */ void zzb(zzd zzdVar, long j10, Exception exc) {
        C2333b c2333bA4;
        Log.i("AdvertisingIdClient", "getting error as ".concat(String.valueOf(exc.getMessage())));
        if ((exc instanceof p135h8.b) && (c2333bA4 = ((p135h8.b) exc).a().a4()) != null && c2333bA4.b4() == 24) {
            zzdVar.zze.set(j10);
        }
    }

    public final synchronized void zzc(int i10, int i11, long j10, long j11, int i12) {
        AtomicLong atomicLong = this.zze;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Log.i("AdvertisingIdClient", "shouldSendLog " + atomicLong.get());
        if (this.zze.get() == -1 || jElapsedRealtime - this.zze.get() > zzc.toMillis()) {
            InterfaceC3858x interfaceC3858x = this.zzd;
            if (interfaceC3858x != null) {
                interfaceC3858x.d(new C3856v(0, Arrays.asList(new C3850o(35401, i11, 0, j10, j11, null, null, 0, i12)))).addOnFailureListener(new zzc(this, jElapsedRealtime));
            }
        }
    }
}
