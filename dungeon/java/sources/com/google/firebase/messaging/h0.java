package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class h0 implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f37615f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Boolean f37616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Boolean f37617h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f37618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final J f37619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PowerManager.WakeLock f37620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g0 f37621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f37622e;

    class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private h0 f37623a;

        public a(h0 h0Var) {
            this.f37623a = h0Var;
        }

        public void a() {
            if (h0.j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            h0.this.f37618a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            try {
                h0 h0Var = this.f37623a;
                if (h0Var == null) {
                    return;
                }
                if (h0Var.i()) {
                    if (h0.j()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.f37623a.f37621d.k(this.f37623a, 0L);
                    context.unregisterReceiver(this);
                    this.f37623a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    h0(g0 g0Var, Context context, J j10, long j11) {
        this.f37621d = g0Var;
        this.f37618a = context;
        this.f37622e = j11;
        this.f37619b = j10;
        this.f37620c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    private static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    private static boolean f(Context context) {
        boolean zBooleanValue;
        synchronized (f37615f) {
            try {
                Boolean bool = f37617h;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f37617h = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    private static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", e(str));
        }
        return z10;
    }

    private static boolean h(Context context) {
        boolean zBooleanValue;
        synchronized (f37615f) {
            try {
                Boolean bool = f37616g;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f37616g = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean i() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f37618a.getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th) {
            throw th;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (h(this.f37618a)) {
            this.f37620c.acquire(AbstractC3110e.f37588a);
        }
        try {
            try {
                try {
                    this.f37621d.l(true);
                    if (!this.f37619b.g()) {
                        this.f37621d.l(false);
                        if (h(this.f37618a)) {
                            try {
                                this.f37620c.release();
                                return;
                            } catch (RuntimeException unused) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                                return;
                            }
                        }
                        return;
                    }
                    if (!f(this.f37618a) || i()) {
                        if (this.f37621d.o()) {
                            this.f37621d.l(false);
                        } else {
                            this.f37621d.p(this.f37622e);
                        }
                        if (h(this.f37618a)) {
                            this.f37620c.release();
                            return;
                        }
                        return;
                    }
                    new a(this).a();
                    if (h(this.f37618a)) {
                        try {
                            this.f37620c.release();
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } catch (Throwable th) {
                    if (h(this.f37618a)) {
                        try {
                            this.f37620c.release();
                        } catch (RuntimeException unused3) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                    throw th;
                }
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
                this.f37621d.l(false);
                if (h(this.f37618a)) {
                    this.f37620c.release();
                }
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
