package com.applovin.impl;

import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {
    public static void a(HttpURLConnection httpURLConnection, p1 p1Var) {
        if (httpURLConnection == null) {
            return;
        }
        try {
            httpURLConnection.disconnect();
        } catch (Throwable th) {
            if (p1Var == null || !p1.f28289b) {
                return;
            }
            p1Var.a("ConnectionUtils", "Unable to disconnect connection: " + httpURLConnection, th);
        }
    }
}
