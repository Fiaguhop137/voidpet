package com.google.android.gms.ads.identifier;

import F8.e;
import F8.f;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.C2342k;
import com.google.android.gms.common.C2343l;
import com.google.android.gms.common.C2344m;
import com.google.android.gms.common.ServiceConnectionC2307a;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p170j8.r;

/* JADX INFO: loaded from: classes2.dex */
public class AdvertisingIdClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f31589a = 0;
    private static final Object zzg = new Object();
    private static volatile AdvertisingIdClient zzh;
    ServiceConnectionC2307a zza;
    f zzb;
    boolean zzc;
    final Object zzd;
    zzb zze;
    final long zzf;
    private final Context zzi;

    public static final class Info {
        private final String zza;
        private final boolean zzb;

        @Deprecated
        public Info(String str, boolean z10) {
            this.zza = str;
            this.zzb = z10;
        }

        public String getId() {
            return this.zza;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.zzb;
        }

        @NonNull
        public String toString() {
            return "{" + this.zza + "}" + this.zzb;
        }
    }

    public AdvertisingIdClient(@NonNull Context context) {
        this(context, 30000L, false, false);
    }

    public AdvertisingIdClient(@NonNull Context context, long j10, boolean z10, boolean z11) {
        this.zzd = new Object();
        r.l(context);
        this.zzi = context.getApplicationContext();
        this.zzc = false;
        this.zzf = j10;
    }

    @NonNull
    public static Info getAdvertisingIdInfo(@NonNull Context context) throws Throwable {
        AdvertisingIdClient advertisingIdClient = zzh;
        if (advertisingIdClient == null) {
            synchronized (zzg) {
                try {
                    advertisingIdClient = zzh;
                    if (advertisingIdClient == null) {
                        Log.d("AdvertisingIdClient", "Creating AdvertisingIdClient");
                        advertisingIdClient = new AdvertisingIdClient(context);
                        zzh = advertisingIdClient;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        AdvertisingIdClient advertisingIdClient2 = advertisingIdClient;
        Log.d("AdvertisingIdClient", "AdvertisingIdClient already created.");
        zzd zzdVarZza = zzd.zza(context);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = -1;
        try {
            Info infoZzf = advertisingIdClient2.zzf(-1);
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            advertisingIdClient2.zze(infoZzf, true, 0.0f, jElapsedRealtime2, "", null);
            try {
                zzdVarZza.zzc(35401, 0, jElapsedRealtime, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - jElapsedRealtime));
                jElapsedRealtime = jElapsedRealtime;
                Log.i("AdvertisingIdClient", "GetInfoInternal elapse " + jElapsedRealtime2 + "ms");
                return infoZzf;
            } catch (Throwable th2) {
                th = th2;
                zzdVarZza = zzdVarZza;
                jElapsedRealtime = jElapsedRealtime;
                Throwable th3 = th;
                advertisingIdClient2.zze(null, true, 0.0f, -1L, "", th3);
                if (th3 instanceof IOException) {
                    i10 = 1;
                } else if (th3 instanceof C2343l) {
                    i10 = 9;
                } else if (th3 instanceof C2344m) {
                    i10 = 16;
                } else if (th3 instanceof IllegalStateException) {
                    i10 = 8;
                }
                zzdVarZza.zzc(35401, i10, jElapsedRealtime, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - jElapsedRealtime));
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(@NonNull Context context) throws C2344m, C2343l, IOException {
        boolean zA;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.zzc(false);
            r.k("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                advertisingIdClient.zzd();
                r.l(advertisingIdClient.zza);
                r.l(advertisingIdClient.zzb);
                try {
                    zA = advertisingIdClient.zzb.a();
                } catch (RemoteException e10) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e10);
                    throw new IOException("Remote exception", e10);
                }
            }
            advertisingIdClient.zzb();
            advertisingIdClient.zza();
            return zA;
        } catch (Throwable th) {
            advertisingIdClient.zza();
            throw th;
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z10) {
    }

    private final Info zzf(int i10) throws IOException {
        Info info;
        r.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            zzd();
            r.l(this.zza);
            r.l(this.zzb);
            try {
                info = new Info(this.zzb.zzc(), this.zzb.t(true));
            } catch (RemoteException e10) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e10);
                throw new IOException("Remote exception", e10);
            }
        }
        zzb();
        return info;
    }

    protected final void finalize() throws Throwable {
        zza();
        super.finalize();
    }

    @NonNull
    public Info getInfo() throws IOException {
        return zzf(-1);
    }

    public void start() throws C2344m, IllegalStateException, C2343l, IOException {
        zzc(true);
    }

    public final void zza() {
        r.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzi == null || this.zza == null) {
                    return;
                }
                try {
                    if (this.zzc) {
                        p242n8.a.b().c(this.zzi, this.zza);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.zzc = false;
                this.zzb = null;
                this.zza = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final void zzb() {
        synchronized (this.zzd) {
            zzb zzbVar = this.zze;
            if (zzbVar != null) {
                zzbVar.zza.countDown();
                try {
                    this.zze.join();
                } catch (InterruptedException unused) {
                }
            }
            long j10 = this.zzf;
            if (j10 > 0) {
                this.zze = new zzb(this, j10);
            }
        }
    }

    protected final void zzc(boolean z10) throws C2344m, IllegalStateException, C2343l, IOException {
        r.k("Calling this from your main thread can lead to deadlock");
        if (z10) {
            zzb();
        }
        synchronized (this) {
            try {
                if (this.zzc) {
                    return;
                }
                Context context = this.zzi;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iH = C2342k.f().h(context, 12451000);
                    if (iH != 0 && iH != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC2307a serviceConnectionC2307a = new ServiceConnectionC2307a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!p242n8.a.b().a(context, intent, serviceConnectionC2307a, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.zza = serviceConnectionC2307a;
                        try {
                            try {
                                this.zzb = e.g(serviceConnectionC2307a.b(10000L, TimeUnit.MILLISECONDS));
                                this.zzc = true;
                            } catch (InterruptedException unused) {
                                throw new IOException("Interrupted exception");
                            }
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } catch (Throwable th2) {
                        throw new IOException(th2);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new C2343l(9);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    final synchronized void zzd() throws IOException {
        try {
            if (!this.zzc) {
                try {
                    Log.d("AdvertisingIdClient", "AdvertisingIdClient is not bounded. Starting to bind it...");
                    zzc(false);
                    Log.d("AdvertisingIdClient", "AdvertisingIdClient is bounded");
                    if (!this.zzc) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e10) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    final boolean zze(Info info, boolean z10, float f10, long j10, String str, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", "1");
        if (info != null) {
            map.put("limit_ad_tracking", true != info.isLimitAdTrackingEnabled() ? "0" : "1");
            String id2 = info.getId();
            if (id2 != null) {
                map.put("ad_id_size", Integer.toString(id2.length()));
            }
        }
        if (th != null) {
            map.put("error", th.getClass().getName());
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j10));
        new zza(this, map).start();
        return true;
    }
}
