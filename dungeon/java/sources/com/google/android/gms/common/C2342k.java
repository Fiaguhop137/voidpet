package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.google.android.gms.common.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2342k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f31910a = AbstractC2346o.f31915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C2342k f31911b = new C2342k();

    C2342k() {
    }

    public static C2342k f() {
        return f31911b;
    }

    public int a(Context context) {
        return AbstractC2346o.b(context);
    }

    public Intent b(Context context, int i10, String str) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && com.google.android.gms.common.util.i.d(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("gcore_");
        sb2.append(f31910a);
        sb2.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        sb2.append("-");
        if (context != null) {
            sb2.append(context.getPackageName());
        }
        sb2.append("-");
        if (context != null) {
            try {
                sb2.append(p278p8.d.a(context).e(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb2.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public PendingIntent c(Context context, int i10, int i11) {
        return d(context, i10, i11, null);
    }

    public PendingIntent d(Context context, int i10, int i11, String str) {
        Intent intentB = b(context, i10, str);
        if (intentB == null) {
            return null;
        }
        return Y0.s.b(context, i11, intentB, 134217728, false);
    }

    public String e(int i10) {
        return AbstractC2346o.c(i10);
    }

    public int g(Context context) {
        return h(context, f31910a);
    }

    public int h(Context context, int i10) {
        int iG = AbstractC2346o.g(context, i10);
        if (AbstractC2346o.h(context, iG)) {
            return 18;
        }
        return iG;
    }

    public boolean i(Context context, String str) {
        return AbstractC2346o.l(context, str);
    }

    public boolean j(int i10) {
        return AbstractC2346o.j(i10);
    }

    public void k(Context context, int i10) throws C2344m, C2343l {
        AbstractC2346o.a(context, i10);
    }
}
