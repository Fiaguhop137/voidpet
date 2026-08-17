package com.applovin.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o2 f28397a;

    public x(String str, o2 o2Var) {
        this.f28397a = o2Var;
    }

    public final Boolean a(Context context) {
        if (context != null) {
            o2 o2Var = this.f28397a;
            return (Boolean) p2.a(o2Var.f28243a, null, o2Var.f28244b, p2.a(context), true);
        }
        p1.c(p1.f28288a, "Failed to get value for key: " + this.f28397a, null);
        return null;
    }
}
