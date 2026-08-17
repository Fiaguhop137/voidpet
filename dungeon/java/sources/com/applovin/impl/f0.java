package com.applovin.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f27994a = {20};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f27995b = {7, 4, 2, 1, 11};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f27996c = {5, 6, 12, 10, 3, 9, 8, 14};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f27997d = {15, 13};

    public static String a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null) {
            int type = activeNetworkInfo.getType();
            int subtype = activeNetworkInfo.getSubtype();
            if (type == 1) {
                return "wifi";
            }
            if (type == 0) {
                if (a(subtype, f27995b)) {
                    return "2g";
                }
                if (a(subtype, f27996c)) {
                    return "3g";
                }
                if (a(subtype, f27997d)) {
                    return "4g";
                }
                return a(subtype, f27994a) ? "5g" : "mobile";
            }
        }
        return "unknown";
    }

    public static boolean a(int i10, int[] iArr) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }
}
