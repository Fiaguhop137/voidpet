package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.common.AbstractC2346o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f31938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f31939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Boolean f31940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Boolean f31941d;

    public static boolean a(Context context) {
        return h(context.getPackageManager());
    }

    public static boolean b() {
        int i10 = AbstractC2346o.f31915a;
        return "user".equals(Build.TYPE);
    }

    public static boolean c(Context context) {
        return e(context.getPackageManager());
    }

    public static boolean d(Context context) {
        if (c(context) && !m.f()) {
            return true;
        }
        if (f(context)) {
            return !m.g() || m.j();
        }
        return false;
    }

    public static boolean e(PackageManager packageManager) {
        if (f31938a == null) {
            f31938a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f31938a.booleanValue();
    }

    public static boolean f(Context context) {
        if (f31939b == null) {
            f31939b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f31939b.booleanValue();
    }

    public static boolean g(Context context) {
        if (f31940c == null) {
            f31940c = Boolean.valueOf(m.g() ? context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") : context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
        }
        return f31940c.booleanValue();
    }

    public static boolean h(PackageManager packageManager) {
        if (f31941d == null) {
            boolean z10 = false;
            if (m.g() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z10 = true;
            }
            f31941d = Boolean.valueOf(z10);
        }
        return f31941d.booleanValue();
    }
}
