package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import p170j8.AbstractBinderC3837b0;
import p170j8.c0;

/* JADX INFO: loaded from: classes2.dex */
abstract class J {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static volatile c0 f31677g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static Context f31679i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final H f31671a = new y(E.c1("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final H f31672b = new z(E.c1("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final H f31673c = new A(E.c1("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final H f31674d = new B(E.c1("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final H f31675e = new C(E.c1("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final H f31676f = new D(E.c1("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f31678h = new Object();

    static synchronized void a(Context context) {
        if (f31679i != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f31679i = context.getApplicationContext();
        }
    }

    static void b() {
        if (f31677g != null) {
            return;
        }
        p170j8.r.l(f31679i);
        synchronized (f31678h) {
            try {
                if (f31677g == null) {
                    f31677g = AbstractBinderC3837b0.h(DynamiteModule.e(f31679i, DynamiteModule.f31967f, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static U c(S s10) {
        U uD;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            p170j8.r.l(f31679i);
            try {
                b();
                p170j8.r.l(f31679i);
                K kB = s10.b(f31679i);
                try {
                    M mH0 = s10.a() ? f31677g.H0(kB) : f31677g.U0(kB);
                    if (mH0.zza()) {
                        uD = U.f(mH0.b(), mH0.zzc());
                    } else {
                        String strZzb = mH0.zzb();
                        PackageManager.NameNotFoundException nameNotFoundException = mH0.a4() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (strZzb == null) {
                            strZzb = "error checking package certificate";
                        }
                        uD = U.g(mH0.b(), mH0.a4(), strZzb, nameNotFoundException);
                    }
                } catch (RemoteException e10) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                    uD = U.d("module call", e10);
                }
            } catch (DynamiteModule.a e11) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
                uD = U.d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
            }
            return uD;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    static U d(String str, E e10, boolean z10, boolean z11) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, e10, z10, z11);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    static /* synthetic */ String e(boolean z10, String str, E e10) {
        String str2 = (z10 || !f(str, e10, true, false).f31704a) ? "not allowed" : "debug cert rejected";
        MessageDigest messageDigestB = com.google.android.gms.common.util.a.b("SHA-256");
        p170j8.r.l(messageDigestB);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, com.google.android.gms.common.util.k.a(messageDigestB.digest(e10.k())), Boolean.valueOf(z10), "12451000.false");
    }

    private static U f(String str, E e10, boolean z10, boolean z11) {
        try {
            b();
            p170j8.r.l(f31679i);
            try {
                return f31677g.b1(new O(str, e10, z10, z11), p314r8.b.c1(f31679i.getPackageManager())) ? U.b() : new T(new G(z10, str, e10), null);
            } catch (RemoteException e11) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
                return U.d("module call", e11);
            }
        } catch (DynamiteModule.a e12) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e12);
            return U.d("module init: ".concat(String.valueOf(e12.getMessage())), e12);
        }
    }
}
