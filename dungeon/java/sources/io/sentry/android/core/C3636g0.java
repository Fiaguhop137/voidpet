package io.sentry.android.core;

import android.os.Build;
import io.sentry.EnumC3721i3;
import io.sentry.ILogger;

/* JADX INFO: renamed from: io.sentry.android.core.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3636g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ILogger f44895a;

    public C3636g0(ILogger iLogger) {
        this.f44895a = (ILogger) io.sentry.util.w.c(iLogger, "The ILogger object is required.");
    }

    public String a() {
        return Build.TAGS;
    }

    public String b() {
        return Build.MANUFACTURER;
    }

    public String c() {
        return Build.MODEL;
    }

    public int d() {
        return Build.VERSION.SDK_INT;
    }

    public String e() {
        return Build.VERSION.RELEASE;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0097  */
    public Boolean f() {
        boolean z10;
        try {
            if (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) {
                z10 = true;
            } else {
                String str = Build.FINGERPRINT;
                if (str.startsWith("generic") || str.startsWith("unknown")) {
                    z10 = true;
                } else {
                    String str2 = Build.HARDWARE;
                    if (str2.contains("goldfish") || str2.contains("ranchu")) {
                        z10 = true;
                    } else {
                        String str3 = Build.MODEL;
                        if (str3.contains("google_sdk") || str3.contains("Emulator") || str3.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion")) {
                            z10 = true;
                        } else {
                            String str4 = Build.PRODUCT;
                            if (str4.contains("sdk_google") || str4.contains("google_sdk") || str4.contains("sdk") || str4.contains("sdk_x86") || str4.contains("vbox86p") || str4.contains("emulator") || str4.contains("simulator")) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        }
                    }
                }
            }
            return Boolean.valueOf(z10);
        } catch (Throwable th) {
            this.f44895a.b(EnumC3721i3.ERROR, "Error checking whether application is running in an emulator.", th);
            return null;
        }
    }
}
