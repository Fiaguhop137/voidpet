package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
final class S1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final S1 f33371c = new S1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f33372d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f33374b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2680e2 f33373a = new E1();

    private S1() {
    }

    public static S1 a() {
        return f33371c;
    }

    public final InterfaceC2675d2 b(Class cls) {
        AbstractC2743r1.c(cls, "messageType");
        InterfaceC2675d2 interfaceC2675d2 = (InterfaceC2675d2) this.f33374b.get(cls);
        if (interfaceC2675d2 != null) {
            return interfaceC2675d2;
        }
        InterfaceC2675d2 interfaceC2675d2A = this.f33373a.a(cls);
        AbstractC2743r1.c(cls, "messageType");
        InterfaceC2675d2 interfaceC2675d3 = (InterfaceC2675d2) this.f33374b.putIfAbsent(cls, interfaceC2675d2A);
        return interfaceC2675d3 == null ? interfaceC2675d2A : interfaceC2675d3;
    }
}
