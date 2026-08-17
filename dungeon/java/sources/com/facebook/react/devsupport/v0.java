package com.facebook.react.devsupport;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f29787a = new v0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f29788b;

    static {
        f29788b = Build.VERSION.SDK_INT < 26 ? 2006 : 2038;
    }

    private v0() {
    }
}
