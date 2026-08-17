package com.applovin.impl;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f28288a = "AppLovinSdk";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f28289b;

    public p1() {
        f28288a = "AxonSdk";
        c("AxonSdk", "\n========================================\nSDK Session Begin\n========================================");
    }

    public static void a(String str) {
        if (f28289b) {
            Log.w(f28288a, "[JsonUtils] " + str);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        if (f28289b) {
            c(str, str2, th);
        }
    }

    public static void c(String str, String str2) {
        Log.d(f28288a, "[" + str + "] " + str2);
    }

    public static void c(String str, String str2, Throwable th) {
        Log.e(f28288a, "[" + str + "] " + str2, th);
    }

    public final void a(String str, String str2) {
        Log.d("AxonSdk", "[" + str + "] " + str2);
    }

    public final void a(String str, String str2, Throwable th) {
        Log.e("AxonSdk", "[" + str + "] " + str2, th);
    }

    public final void a(String str, Throwable th) {
        for (Throwable th2 : th.getSuppressed()) {
            a(str, th2.toString(), null);
        }
    }

    public final void b(String str, String str2) {
        Log.i("AxonSdk", "[" + str + "] " + str2);
    }

    public final void d(String str, String str2, Throwable th) {
        Log.w("AxonSdk", "[" + str + "] " + str2, th);
    }
}
