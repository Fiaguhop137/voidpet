package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f37488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f37489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f37490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f37491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f37492e = 0;

    J(Context context) {
        this.f37488a = context;
    }

    static String c(H9.e eVar) {
        String strF = eVar.q().f();
        if (strF != null) {
            return strF;
        }
        String strC = eVar.q().c();
        if (!strC.startsWith("1:")) {
            return strC;
        }
        String[] strArrSplit = strC.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private PackageInfo f(String str) {
        try {
            return this.f37488a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    private synchronized void h() {
        PackageInfo packageInfoF = f(this.f37488a.getPackageName());
        if (packageInfoF != null) {
            this.f37489b = Integer.toString(packageInfoF.versionCode);
            this.f37490c = packageInfoF.versionName;
        }
    }

    synchronized String a() {
        try {
            if (this.f37489b == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f37489b;
    }

    synchronized String b() {
        try {
            if (this.f37490c == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f37490c;
    }

    synchronized int d() {
        PackageInfo packageInfoF;
        try {
            if (this.f37491d == 0 && (packageInfoF = f("com.google.android.gms")) != null) {
                this.f37491d = packageInfoF.versionCode;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f37491d;
    }

    synchronized int e() {
        int i10 = this.f37492e;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f37488a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!com.google.android.gms.common.util.m.g()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.f37492e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f37492e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (com.google.android.gms.common.util.m.g()) {
            this.f37492e = 2;
        } else {
            this.f37492e = 1;
        }
        return this.f37492e;
    }

    boolean g() {
        return e() != 0;
    }
}
