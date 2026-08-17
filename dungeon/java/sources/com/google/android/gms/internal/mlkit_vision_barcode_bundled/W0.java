package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class W0 extends V0 {
    W0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.V0
    final void a(Object obj) {
        ((AbstractC2689g1) obj).zzb.g();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.V0
    final void b(G2 g10, Map.Entry entry) {
        C2694h1 c2694h1 = (C2694h1) entry.getKey();
        E2 e10 = E2.f33300b;
        switch (c2694h1.f34227b.ordinal()) {
            case 0:
                g10.a(c2694h1.f34226a, ((Double) entry.getValue()).doubleValue());
                break;
            case 1:
                g10.v(c2694h1.f34226a, ((Float) entry.getValue()).floatValue());
                break;
            case 2:
                g10.f(c2694h1.f34226a, ((Long) entry.getValue()).longValue());
                break;
            case 3:
                g10.N(c2694h1.f34226a, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                g10.j(c2694h1.f34226a, ((Integer) entry.getValue()).intValue());
                break;
            case 5:
                g10.A(c2694h1.f34226a, ((Long) entry.getValue()).longValue());
                break;
            case 6:
                g10.b(c2694h1.f34226a, ((Integer) entry.getValue()).intValue());
                break;
            case 7:
                g10.e(c2694h1.f34226a, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 8:
                g10.B(c2694h1.f34226a, (String) entry.getValue());
                break;
            case 9:
                g10.K(c2694h1.f34226a, entry.getValue(), S1.a().b(entry.getValue().getClass()));
                break;
            case 10:
                g10.C(c2694h1.f34226a, entry.getValue(), S1.a().b(entry.getValue().getClass()));
                break;
            case 11:
                g10.D(c2694h1.f34226a, (I0) entry.getValue());
                break;
            case 12:
                g10.I(c2694h1.f34226a, ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                g10.j(c2694h1.f34226a, ((Integer) entry.getValue()).intValue());
                break;
            case 14:
                g10.F(c2694h1.f34226a, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                g10.J(c2694h1.f34226a, ((Long) entry.getValue()).longValue());
                break;
            case 16:
                g10.G(c2694h1.f34226a, ((Integer) entry.getValue()).intValue());
                break;
            case 17:
                g10.E(c2694h1.f34226a, ((Long) entry.getValue()).longValue());
                break;
        }
    }
}
