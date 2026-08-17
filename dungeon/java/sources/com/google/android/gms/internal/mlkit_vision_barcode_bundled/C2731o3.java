package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.o3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2731o3 extends AbstractC2704j1 implements M1 {
    private static final C2731o3 zzb;
    private int zzd;
    private boolean zze;
    private int zzf;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private boolean zzg = true;
    private String zzl = "";
    private String zzm = "";

    static {
        C2731o3 c2731o3 = new C2731o3();
        zzb = c2731o3;
        AbstractC2704j1.v(C2731o3.class, c2731o3);
    }

    private C2731o3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            InterfaceC2724n1 interfaceC2724n1 = C2741q3.f34277a;
            InterfaceC2724n1 interfaceC2724n2 = C2721m3.f34244a;
            InterfaceC2724n1 interfaceC2724n3 = C2736p3.f34268a;
            return AbstractC2704j1.s(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006\bဈ\u0007\tဈ\b", new Object[]{"zzd", "zze", "zzf", interfaceC2724n1, "zzg", "zzh", interfaceC2724n2, "zzi", interfaceC2724n3, "zzj", interfaceC2724n3, "zzk", interfaceC2724n3, "zzl", "zzm"});
        }
        if (i11 == 3) {
            return new C2731o3();
        }
        if (i11 == 4) {
            return new C2726n3(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
