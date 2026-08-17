package com.facebook.react.uimanager;

/* JADX INFO: loaded from: classes2.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final U f30348a = new U();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f30349b = 1;

    private U() {
    }

    public static final synchronized int a() {
        int i10;
        i10 = f30349b;
        f30349b = i10 + 10;
        return i10;
    }
}
