package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class K extends AbstractC2633x {
    protected K() {
        this.f33173a.add(N.ADD);
        this.f33173a.add(N.DIVIDE);
        this.f33173a.add(N.MODULUS);
        this.f33173a.add(N.MULTIPLY);
        this.f33173a.add(N.NEGATE);
        this.f33173a.add(N.POST_DECREMENT);
        this.f33173a.add(N.POST_INCREMENT);
        this.f33173a.add(N.PRE_DECREMENT);
        this.f33173a.add(N.PRE_INCREMENT);
        this.f33173a.add(N.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2633x
    public final InterfaceC2572q a(String str, Y1 y10, List list) {
        N n10 = N.ADD;
        int iOrdinal = AbstractC2652z2.e(str).ordinal();
        if (iOrdinal == 0) {
            AbstractC2652z2.a(N.ADD.name(), 2, list);
            InterfaceC2572q interfaceC2572qA = y10.a((InterfaceC2572q) list.get(0));
            InterfaceC2572q interfaceC2572qA2 = y10.a((InterfaceC2572q) list.get(1));
            if (!(interfaceC2572qA instanceof InterfaceC2536m) && !(interfaceC2572qA instanceof C2607u) && !(interfaceC2572qA2 instanceof InterfaceC2536m) && !(interfaceC2572qA2 instanceof C2607u)) {
                return new C2509j(Double.valueOf(interfaceC2572qA.a().doubleValue() + interfaceC2572qA2.a().doubleValue()));
            }
            return new C2607u(String.valueOf(interfaceC2572qA.zzc()).concat(String.valueOf(interfaceC2572qA2.zzc())));
        }
        if (iOrdinal == 21) {
            AbstractC2652z2.a(N.DIVIDE.name(), 2, list);
            return new C2509j(Double.valueOf(y10.a((InterfaceC2572q) list.get(0)).a().doubleValue() / y10.a((InterfaceC2572q) list.get(1)).a().doubleValue()));
        }
        if (iOrdinal == 59) {
            AbstractC2652z2.a(N.SUBTRACT.name(), 2, list);
            return new C2509j(Double.valueOf(y10.a((InterfaceC2572q) list.get(0)).a().doubleValue() + new C2509j(Double.valueOf(-y10.a((InterfaceC2572q) list.get(1)).a().doubleValue())).a().doubleValue()));
        }
        if (iOrdinal == 52 || iOrdinal == 53) {
            AbstractC2652z2.a(str, 2, list);
            InterfaceC2572q interfaceC2572qA3 = y10.a((InterfaceC2572q) list.get(0));
            y10.a((InterfaceC2572q) list.get(1));
            return interfaceC2572qA3;
        }
        if (iOrdinal == 55 || iOrdinal == 56) {
            AbstractC2652z2.a(str, 1, list);
            return y10.a((InterfaceC2572q) list.get(0));
        }
        switch (iOrdinal) {
            case 44:
                AbstractC2652z2.a(N.MODULUS.name(), 2, list);
                return new C2509j(Double.valueOf(y10.a((InterfaceC2572q) list.get(0)).a().doubleValue() % y10.a((InterfaceC2572q) list.get(1)).a().doubleValue()));
            case 45:
                AbstractC2652z2.a(N.MULTIPLY.name(), 2, list);
                return new C2509j(Double.valueOf(y10.a((InterfaceC2572q) list.get(0)).a().doubleValue() * y10.a((InterfaceC2572q) list.get(1)).a().doubleValue()));
            case 46:
                AbstractC2652z2.a(N.NEGATE.name(), 1, list);
                return new C2509j(Double.valueOf(-y10.a((InterfaceC2572q) list.get(0)).a().doubleValue()));
            default:
                return super.b(str);
        }
    }
}
