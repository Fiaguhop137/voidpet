package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class R7 extends AbstractC2518k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V7 f32718c;

    public R7(V7 v10) {
        super("internal.registerCallback");
        this.f32718c = v10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2518k
    public final InterfaceC2572q d(Y1 y10, List list) {
        AbstractC2652z2.a(this.f32959a, 3, list);
        String strZzc = y10.a((InterfaceC2572q) list.get(0)).zzc();
        InterfaceC2572q interfaceC2572qA = y10.a((InterfaceC2572q) list.get(1));
        if (!(interfaceC2572qA instanceof C2563p)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        InterfaceC2572q interfaceC2572qA2 = y10.a((InterfaceC2572q) list.get(2));
        if (!(interfaceC2572qA2 instanceof C2545n)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        C2545n c2545n = (C2545n) interfaceC2572qA2;
        if (!c2545n.l("type")) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        this.f32718c.a(strZzc, c2545n.l("priority") ? AbstractC2652z2.g(c2545n.h("priority").a().doubleValue()) : 1000, (C2563p) interfaceC2572qA, c2545n.h("type").zzc());
        return InterfaceC2572q.f33082p1;
    }
}
