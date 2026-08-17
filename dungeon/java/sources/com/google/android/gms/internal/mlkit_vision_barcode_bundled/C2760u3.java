package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.u3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2760u3 extends AbstractC2704j1 implements M1 {
    private static final C2760u3 zzb;
    private int zzd;
    private boolean zzf;
    private int zzg;
    private boolean zzj;
    private int zzm;
    private int zzn;
    private boolean zzo;
    private int zze = -1;
    private I0 zzh = I0.f33335b;
    private String zzi = "";
    private boolean zzk = true;
    private boolean zzl = true;

    static {
        C2760u3 c2760u3 = new C2760u3();
        zzb = c2760u3;
        AbstractC2704j1.v(C2760u3.class, c2760u3);
    }

    private C2760u3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            InterfaceC2724n1 interfaceC2724n1 = C2750s3.f34304a;
            InterfaceC2724n1 interfaceC2724n2 = C2755t3.f34307a;
            return AbstractC2704j1.s(zzb, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ည\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\t᠌\b\n᠌\t\u000bဇ\n", new Object[]{"zzd", "zze", "zzf", "zzg", interfaceC2724n1, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", interfaceC2724n2, "zzn", interfaceC2724n2, "zzo"});
        }
        if (i11 == 3) {
            return new C2760u3();
        }
        if (i11 == 4) {
            return new C2745r3(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
