package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final long f37629a = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f37630b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static X8.a f37631c;

    private static void b(Context context) {
        if (f37631c == null) {
            X8.a aVar = new X8.a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f37631c = aVar;
            aVar.d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Intent intent) {
        synchronized (f37630b) {
            try {
                if (f37631c != null && d(intent)) {
                    f(intent, false);
                    f37631c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static boolean d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    static void e(Context context, o0 o0Var, Intent intent) {
        synchronized (f37630b) {
            try {
                b(context);
                boolean zD = d(intent);
                f(intent, true);
                if (!zD) {
                    f37631c.a(f37629a);
                }
                o0Var.d(intent).addOnCompleteListener(new i0(intent));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void f(Intent intent, boolean z10) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z10);
    }

    static ComponentName g(Context context, Intent intent) {
        synchronized (f37630b) {
            try {
                b(context);
                boolean zD = d(intent);
                f(intent, true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!zD) {
                    f37631c.a(f37629a);
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
