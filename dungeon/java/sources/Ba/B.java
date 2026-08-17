package Ba;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.M1;

/* JADX INFO: loaded from: classes2.dex */
public final class B extends AbstractC2704j1 implements M1 {
    private static final B zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    static {
        B b10 = new B();
        zzb = b10;
        AbstractC2704j1.v(B.class, b10);
    }

    private B() {
    }

    public static B L() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2704j1.s(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new B();
        }
        if (i11 == 4) {
            return new A(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int D() {
        return this.zzg;
    }

    public final int E() {
        return this.zzh;
    }

    public final int F() {
        return this.zzi;
    }

    public final int G() {
        return this.zzf;
    }

    public final int I() {
        return this.zzj;
    }

    public final int J() {
        return this.zze;
    }

    public final boolean P() {
        return this.zzk;
    }
}
