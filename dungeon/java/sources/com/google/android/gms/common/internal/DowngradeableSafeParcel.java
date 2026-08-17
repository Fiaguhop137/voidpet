package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DowngradeableSafeParcel extends p188k8.a implements ReflectedParcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f31904b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f31905a = false;

    protected static boolean a4(String str) {
        synchronized (f31904b) {
        }
        return true;
    }

    protected static Integer b4() {
        synchronized (f31904b) {
        }
        return null;
    }

    protected boolean c4() {
        return this.f31905a;
    }
}
