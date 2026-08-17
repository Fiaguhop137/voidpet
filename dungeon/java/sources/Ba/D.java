package Ba;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.M1;

/* JADX INFO: loaded from: classes2.dex */
public final class D extends AbstractC2704j1 implements M1 {
    private static final D zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private B zzj;
    private B zzk;

    static {
        D d10 = new D();
        zzb = d10;
        AbstractC2704j1.v(D.class, d10);
    }

    private D() {
    }

    public static D G() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2704j1.s(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new D();
        }
        if (i11 == 4) {
            return new C(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final B D() {
        B b10 = this.zzk;
        return b10 == null ? B.L() : b10;
    }

    public final B E() {
        B b10 = this.zzj;
        return b10 == null ? B.L() : b10;
    }

    public final String I() {
        return this.zzf;
    }

    public final String J() {
        return this.zzg;
    }

    public final String K() {
        return this.zzh;
    }

    public final String L() {
        return this.zzi;
    }

    public final String P() {
        return this.zze;
    }
}
