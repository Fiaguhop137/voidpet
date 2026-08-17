package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2389m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static UserManager f32423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f32424b = !b();

    /* JADX WARN: Code duplicated, block: B:33:0x0054 A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:9:0x000f, B:11:0x0013, B:18:0x001d, B:20:0x0021, B:21:0x002b, B:35:0x0058, B:36:0x005a, B:24:0x0031, B:26:0x0037, B:33:0x0054, B:31:0x0046), top: B:42:0x000f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0058 A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:9:0x000f, B:11:0x0013, B:18:0x001d, B:20:0x0021, B:21:0x002b, B:35:0x0058, B:36:0x005a, B:24:0x0031, B:26:0x0037, B:33:0x0054, B:31:0x0046), top: B:42:0x000f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x005d A[RETURN] */
    public static boolean a(Context context) {
        boolean z10;
        if (b() && !f32424b) {
            synchronized (AbstractC2389m.class) {
                try {
                    if (!f32424b) {
                        int i10 = 1;
                        while (true) {
                            if (i10 <= 2) {
                                if (f32423a == null) {
                                    f32423a = (UserManager) context.getSystemService(UserManager.class);
                                }
                                UserManager userManager = f32423a;
                                if (userManager == null) {
                                    z10 = true;
                                } else {
                                    try {
                                        if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                                            z10 = true;
                                        }
                                        if (z10) {
                                            f32423a = null;
                                        }
                                    } catch (NullPointerException e10) {
                                        Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e10);
                                        f32423a = null;
                                        i10++;
                                    }
                                }
                                if (z10) {
                                    f32424b = true;
                                }
                                if (!z10) {
                                    return true;
                                }
                            }
                            z10 = false;
                            if (z10) {
                                f32423a = null;
                            }
                            if (z10) {
                                f32424b = true;
                            }
                            if (!z10) {
                                return true;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return false;
    }

    public static boolean b() {
        return true;
    }
}
