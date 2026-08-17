package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class E extends AbstractC2633x {
    protected E() {
        this.f33173a.add(N.AND);
        this.f33173a.add(N.NOT);
        this.f33173a.add(N.OR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2633x
    public final InterfaceC2572q a(String str, Y1 y10, List list) {
        N n10 = N.ADD;
        int iOrdinal = AbstractC2652z2.e(str).ordinal();
        if (iOrdinal == 1) {
            AbstractC2652z2.a(N.AND.name(), 2, list);
            InterfaceC2572q interfaceC2572qA = y10.a((InterfaceC2572q) list.get(0));
            return interfaceC2572qA.b().booleanValue() ? y10.a((InterfaceC2572q) list.get(1)) : interfaceC2572qA;
        }
        if (iOrdinal == 47) {
            AbstractC2652z2.a(N.NOT.name(), 1, list);
            return new C2482g(Boolean.valueOf(!y10.a((InterfaceC2572q) list.get(0)).b().booleanValue()));
        }
        if (iOrdinal != 50) {
            return super.b(str);
        }
        AbstractC2652z2.a(N.OR.name(), 2, list);
        InterfaceC2572q interfaceC2572qA2 = y10.a((InterfaceC2572q) list.get(0));
        return !interfaceC2572qA2.b().booleanValue() ? y10.a((InterfaceC2572q) list.get(1)) : interfaceC2572qA2;
    }
}
