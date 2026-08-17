package com.facebook.react.defaults;

import com.facebook.soloader.SoLoader;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f29564a = new e();

    private e() {
    }

    public static final synchronized void a() {
        SoLoader.t("react_newarchdefaults");
        try {
            SoLoader.t("appmodules");
        } catch (UnsatisfiedLinkError unused) {
        }
    }
}
