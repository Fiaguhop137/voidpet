package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2834j2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C2834j2 f34742c = new C2834j2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f34744b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2854n2 f34743a = new U1();

    private C2834j2() {
    }

    static C2834j2 a() {
        return f34742c;
    }

    final InterfaceC2849m2 b(Class cls) {
        byte[] bArr = M1.f34481b;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentMap concurrentMap = this.f34744b;
        InterfaceC2849m2 interfaceC2849m2A = (InterfaceC2849m2) concurrentMap.get(cls);
        if (interfaceC2849m2A == null) {
            interfaceC2849m2A = this.f34743a.a(cls);
            InterfaceC2849m2 interfaceC2849m2 = (InterfaceC2849m2) concurrentMap.putIfAbsent(cls, interfaceC2849m2A);
            if (interfaceC2849m2 != null) {
                return interfaceC2849m2;
            }
        }
        return interfaceC2849m2A;
    }
}
