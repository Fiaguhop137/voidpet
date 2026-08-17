package A9;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2729o1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.M1;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends AbstractC2704j1 implements M1 {
    private static final g zzb;
    private int zzd;
    private InterfaceC2729o1 zze = AbstractC2704j1.m();
    private InterfaceC2729o1 zzf = AbstractC2704j1.m();
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        g gVar = new g();
        zzb = gVar;
        AbstractC2704j1.v(g.class, gVar);
    }

    private g() {
    }

    public static f D() {
        return (f) zzb.e();
    }

    static /* synthetic */ void F(g gVar, int i10) {
        gVar.zzd |= 2;
        gVar.zzh = i10;
    }

    static /* synthetic */ void G(g gVar, float f10) {
        InterfaceC2729o1 interfaceC2729o1 = gVar.zze;
        if (!interfaceC2729o1.zzc()) {
            gVar.zze = AbstractC2704j1.n(interfaceC2729o1);
        }
        gVar.zze.X1(f10);
    }

    static /* synthetic */ void I(g gVar, float f10) {
        InterfaceC2729o1 interfaceC2729o1 = gVar.zzf;
        if (!interfaceC2729o1.zzc()) {
            gVar.zzf = AbstractC2704j1.n(interfaceC2729o1);
        }
        gVar.zzf.X1(f10);
    }

    static /* synthetic */ void J(g gVar, int i10) {
        gVar.zzd |= 1;
        gVar.zzg = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2704j1.s(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0013\u0002\u0013\u0003ဋ\u0000\u0004ဋ\u0001\u0005ဋ\u0002\u0006ဋ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new g();
        }
        if (i11 == 4) {
            return new f(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
