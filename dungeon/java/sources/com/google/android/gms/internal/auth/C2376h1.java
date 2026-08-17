package com.google.android.gms.internal.auth;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2376h1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C2376h1 f32335c = new C2376h1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f32337b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2388l1 f32336a = new S0();

    private C2376h1() {
    }

    public static C2376h1 a() {
        return f32335c;
    }

    public final InterfaceC2385k1 b(Class cls) {
        G0.c(cls, "messageType");
        InterfaceC2385k1 interfaceC2385k1 = (InterfaceC2385k1) this.f32337b.get(cls);
        if (interfaceC2385k1 != null) {
            return interfaceC2385k1;
        }
        InterfaceC2385k1 interfaceC2385k1A = this.f32336a.a(cls);
        G0.c(cls, "messageType");
        InterfaceC2385k1 interfaceC2385k2 = (InterfaceC2385k1) this.f32337b.putIfAbsent(cls, interfaceC2385k1A);
        return interfaceC2385k2 == null ? interfaceC2385k1A : interfaceC2385k2;
    }
}
