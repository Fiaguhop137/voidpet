package Ba;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2739q1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.M1;

/* JADX INFO: loaded from: classes2.dex */
public final class z extends AbstractC2704j1 implements M1 {
    private static final z zzb;
    private int zzd;
    private String zze = "";
    private InterfaceC2739q1 zzf = AbstractC2704j1.p();

    static {
        z zVar = new z();
        zzb = zVar;
        AbstractC2704j1.v(z.class, zVar);
    }

    private z() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2704j1.s(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzd", "zze", "zzf", N.class});
        }
        if (i11 == 3) {
            return new z();
        }
        if (i11 == 4) {
            return new y(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
