package com.applovin.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f28408a = new x("Has User Consent", o2.f28241g);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f28409b = new x("\"Do Not Sell\"", o2.f28242h);

    public static boolean a(o2 o2Var, Boolean bool, Context context) {
        if (context == null) {
            p1.c(p1.f28288a, "Failed to update compliance value for key: " + o2Var, null);
            return false;
        }
        try {
            Boolean bool2 = (Boolean) p2.a(o2Var.f28243a, null, o2Var.f28244b, p2.a(context), true);
            p2.a(o2Var.f28243a, bool, p2.a(context), null);
            return bool2 == null || bool2 != bool;
        } catch (Throwable th) {
            p1.c("ComplianceManager", "Unable to update compliance", th);
            return false;
        }
    }
}
