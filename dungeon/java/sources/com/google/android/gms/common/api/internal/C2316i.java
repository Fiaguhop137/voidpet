package com.google.android.gms.common.api.internal;

import android.app.Activity;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2316i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f31838a;

    public C2316i(Activity activity) {
        p170j8.r.m(activity, "Activity must not be null");
        this.f31838a = activity;
    }

    public final boolean a() {
        return this.f31838a instanceof androidx.fragment.app.j;
    }

    public final boolean b() {
        return this.f31838a instanceof Activity;
    }

    public final Activity c() {
        return (Activity) this.f31838a;
    }

    public final androidx.fragment.app.j d() {
        return (androidx.fragment.app.j) this.f31838a;
    }
}
