package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static UserManager f32680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f32681b = !a();

    public static boolean a() {
        return true;
    }

    public static boolean b(Context context) {
        return a() && !d(context);
    }

    public static boolean c(Context context) {
        return !a() || d(context);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0050 A[Catch: all -> 0x000f, TryCatch #1 {all -> 0x000f, blocks: (B:7:0x0009, B:9:0x000d, B:16:0x0017, B:18:0x001b, B:19:0x0025, B:32:0x0050, B:33:0x0052, B:22:0x002b, B:24:0x0031, B:28:0x003e, B:30:0x004c), top: B:39:0x0009, inners: #0 }] */
    private static boolean d(Context context) {
        if (f32681b) {
            return true;
        }
        synchronized (O3.class) {
            try {
                if (f32681b) {
                    return true;
                }
                int i10 = 1;
                while (true) {
                    boolean z10 = false;
                    if (i10 <= 2) {
                        if (f32680a == null) {
                            f32680a = (UserManager) context.getSystemService(UserManager.class);
                        }
                        UserManager userManager = f32680a;
                        if (userManager == null) {
                            z10 = true;
                        } else {
                            try {
                                if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                                    z10 = true;
                                }
                            } catch (NullPointerException e10) {
                                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e10);
                                f32680a = null;
                                i10++;
                            }
                        }
                        if (z10) {
                            f32681b = true;
                        }
                        return z10;
                    }
                    if (z10) {
                        f32680a = null;
                    }
                    if (z10) {
                        f32681b = true;
                    }
                    return z10;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
