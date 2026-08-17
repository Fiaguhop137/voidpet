package com.facebook.react.uimanager;

import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class Q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Q0 f30343a = new Q0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Lazy f30344b;

    static {
        p348t6.b.a("YogaNodePool", p348t6.a.ERROR);
        f30344b = Ad.j.a(Ad.m.SYNCHRONIZED, new P0());
    }

    private Q0() {
    }

    public static final p312r6.b b() {
        return f30343a.c();
    }

    private final p312r6.b c() {
        return (p312r6.b) f30344b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p312r6.b d() {
        return new p312r6.b(1024);
    }
}
