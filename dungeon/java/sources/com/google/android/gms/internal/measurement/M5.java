package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
final class M5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final M5 f32574c = new M5();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f32575d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f32577b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Q5 f32576a = new C2622v5();

    private M5() {
    }

    public static M5 a() {
        return f32574c;
    }

    public final P5 b(Class cls) {
        AbstractC2524k5.a(cls, "messageType");
        ConcurrentMap concurrentMap = this.f32577b;
        P5 p5A = (P5) concurrentMap.get(cls);
        if (p5A == null) {
            p5A = this.f32576a.a(cls);
            AbstractC2524k5.a(cls, "messageType");
            P5 p10 = (P5) concurrentMap.putIfAbsent(cls, p5A);
            if (p10 != null) {
                return p10;
            }
        }
        return p5A;
    }
}
