package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2573q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final InterfaceC2555o0 f33090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile InterfaceC2555o0 f33091b;

    static {
        C2564p0 c2564p0 = new C2564p0(null);
        f33090a = c2564p0;
        f33091b = c2564p0;
    }

    public static InterfaceC2555o0 a() {
        return f33091b;
    }
}
