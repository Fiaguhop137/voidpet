package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2442b4 extends AbstractC2518k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2446c f32867c;

    public C2442b4(C2446c c2446c) {
        super("internal.eventLogger");
        this.f32867c = c2446c;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2518k
    public final InterfaceC2572q d(Y1 y10, List list) {
        AbstractC2652z2.a(this.f32959a, 3, list);
        String strZzc = y10.a((InterfaceC2572q) list.get(0)).zzc();
        long jI = (long) AbstractC2652z2.i(y10.a((InterfaceC2572q) list.get(1)).a().doubleValue());
        InterfaceC2572q interfaceC2572qA = y10.a((InterfaceC2572q) list.get(2));
        this.f32867c.e(strZzc, jI, interfaceC2572qA instanceof C2545n ? AbstractC2652z2.k((C2545n) interfaceC2572qA) : new HashMap());
        return InterfaceC2572q.f33082p1;
    }
}
