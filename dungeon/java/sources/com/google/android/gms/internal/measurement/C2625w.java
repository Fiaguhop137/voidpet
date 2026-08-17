package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2625w extends AbstractC2633x {
    public C2625w() {
        this.f33173a.add(N.BITWISE_AND);
        this.f33173a.add(N.BITWISE_LEFT_SHIFT);
        this.f33173a.add(N.BITWISE_NOT);
        this.f33173a.add(N.BITWISE_OR);
        this.f33173a.add(N.BITWISE_RIGHT_SHIFT);
        this.f33173a.add(N.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f33173a.add(N.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2633x
    public final InterfaceC2572q a(String str, Y1 y10, List list) {
        N n10 = N.ADD;
        switch (AbstractC2652z2.e(str).ordinal()) {
            case 4:
                AbstractC2652z2.a(N.BITWISE_AND.name(), 2, list);
                return new C2509j(Double.valueOf(AbstractC2652z2.g(y10.a((InterfaceC2572q) list.get(0)).a().doubleValue()) & AbstractC2652z2.g(y10.a((InterfaceC2572q) list.get(1)).a().doubleValue())));
            case 5:
                AbstractC2652z2.a(N.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new C2509j(Double.valueOf(AbstractC2652z2.g(y10.a((InterfaceC2572q) list.get(0)).a().doubleValue()) << ((int) (AbstractC2652z2.h(y10.a((InterfaceC2572q) list.get(1)).a().doubleValue()) & 31))));
            case 6:
                AbstractC2652z2.a(N.BITWISE_NOT.name(), 1, list);
                return new C2509j(Double.valueOf(~AbstractC2652z2.g(y10.a((InterfaceC2572q) list.get(0)).a().doubleValue())));
            case 7:
                AbstractC2652z2.a(N.BITWISE_OR.name(), 2, list);
                return new C2509j(Double.valueOf(AbstractC2652z2.g(y10.a((InterfaceC2572q) list.get(0)).a().doubleValue()) | AbstractC2652z2.g(y10.a((InterfaceC2572q) list.get(1)).a().doubleValue())));
            case 8:
                AbstractC2652z2.a(N.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new C2509j(Double.valueOf(AbstractC2652z2.g(y10.a((InterfaceC2572q) list.get(0)).a().doubleValue()) >> ((int) (AbstractC2652z2.h(y10.a((InterfaceC2572q) list.get(1)).a().doubleValue()) & 31))));
            case 9:
                AbstractC2652z2.a(N.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new C2509j(Double.valueOf(AbstractC2652z2.h(y10.a((InterfaceC2572q) list.get(0)).a().doubleValue()) >>> ((int) (AbstractC2652z2.h(y10.a((InterfaceC2572q) list.get(1)).a().doubleValue()) & 31))));
            case 10:
                AbstractC2652z2.a(N.BITWISE_XOR.name(), 2, list);
                return new C2509j(Double.valueOf(AbstractC2652z2.g(y10.a((InterfaceC2572q) list.get(0)).a().doubleValue()) ^ AbstractC2652z2.g(y10.a((InterfaceC2572q) list.get(1)).a().doubleValue())));
            default:
                return super.b(str);
        }
    }
}
