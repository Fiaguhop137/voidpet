package com.facebook.react.uimanager;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.react.uimanager.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2244b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2244b0 f30385a = new C2244b0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Lazy f30386b;

    static {
        p348t6.b.b("ReactYogaConfigProvider", null, 2, null);
        f30386b = Ad.j.a(Ad.m.NONE, new C2242a0());
    }

    private C2244b0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.facebook.yoga.c c() {
        com.facebook.yoga.c cVarA = com.facebook.yoga.d.a();
        cVarA.b(0.0f);
        cVarA.a(com.facebook.yoga.k.ALL);
        return cVarA;
    }

    public final com.facebook.yoga.c b() {
        Object value = f30386b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (com.facebook.yoga.c) value;
    }
}
