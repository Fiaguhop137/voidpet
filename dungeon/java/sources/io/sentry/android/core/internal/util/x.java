package io.sentry.android.core.internal.util;

import android.content.Context;
import android.content.pm.PackageManager;
import io.sentry.EnumC3721i3;
import io.sentry.ILogger;
import io.sentry.android.core.C3636g0;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Charset f45072g = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f45073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3636g0 f45074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ILogger f45075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f45076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String[] f45077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Runtime f45078f;

    public x(Context context, C3636g0 c3636g0, ILogger iLogger) {
        this(context, c3636g0, iLogger, new String[]{"/sbin/su", "/data/local/xbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/bin/su", "/system/app/Superuser.apk", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"}, new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"}, Runtime.getRuntime());
    }

    x(Context context, C3636g0 c3636g0, ILogger iLogger, String[] strArr, String[] strArr2, Runtime runtime) {
        this.f45073a = (Context) io.sentry.util.w.c(context, "The application context is required.");
        this.f45074b = (C3636g0) io.sentry.util.w.c(c3636g0, "The BuildInfoProvider is required.");
        this.f45075c = (ILogger) io.sentry.util.w.c(iLogger, "The Logger is required.");
        this.f45076d = (String[]) io.sentry.util.w.c(strArr, "The root Files are required.");
        this.f45077e = (String[]) io.sentry.util.w.c(strArr2, "The root packages are required.");
        this.f45078f = (Runtime) io.sentry.util.w.c(runtime, "The Runtime is required.");
    }

    private boolean a() {
        String strA = this.f45074b.a();
        return strA != null && strA.contains("test-keys");
    }

    private boolean b() {
        for (String str : this.f45076d) {
            try {
                if (new File(str).exists()) {
                    return true;
                }
            } catch (RuntimeException e10) {
                this.f45075c.a(EnumC3721i3.ERROR, e10, "Error when trying to check if root file %s exists.", str);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047 A[PHI: r2
      0x0047: PHI (r2v3 java.lang.Process) = (r2v1 java.lang.Process), (r2v4 java.lang.Process) binds: [B:20:0x0045, B:25:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    private boolean c() {
        Process processExec = null;
        try {
            try {
                processExec = this.f45078f.exec(new String[]{"/system/xbin/which", "su"});
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream(), f45072g));
                try {
                    boolean z10 = bufferedReader.readLine() != null;
                    bufferedReader.close();
                    processExec.destroy();
                    return z10;
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (processExec != null) {
                    processExec.destroy();
                }
                throw th3;
            }
        } catch (IOException unused) {
            this.f45075c.c(EnumC3721i3.DEBUG, "SU isn't found on this Device.", new Object[0]);
            if (processExec != null) {
                processExec.destroy();
            }
            return false;
        } catch (Throwable th4) {
            this.f45075c.b(EnumC3721i3.DEBUG, "Error when trying to check if SU exists.", th4);
            if (processExec != null) {
                processExec.destroy();
            }
            return false;
        }
    }

    private boolean d(ILogger iLogger) {
        C3636g0 c3636g0 = new C3636g0(iLogger);
        PackageManager packageManager = this.f45073a.getPackageManager();
        if (packageManager != null) {
            for (String str : this.f45077e) {
                try {
                    if (c3636g0.d() >= 33) {
                        packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
                        return true;
                    }
                    packageManager.getPackageInfo(str, 0);
                    return true;
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        return false;
    }

    public boolean e() {
        return a() || b() || c() || d(this.f45075c);
    }
}
