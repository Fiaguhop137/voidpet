package Ba;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.M1;

/* JADX INFO: loaded from: classes2.dex */
public final class L extends AbstractC2704j1 implements M1 {
    private static final L zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        L l10 = new L();
        zzb = l10;
        AbstractC2704j1.v(L.class, l10);
    }

    private L() {
    }

    public static L E() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2704j1.s(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", J.f639a, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new L();
        }
        if (i11 == 4) {
            return new I(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final String F() {
        return this.zzf;
    }

    public final String G() {
        return this.zzh;
    }

    public final String I() {
        return this.zzg;
    }

    public final int J() {
        int iA = K.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
