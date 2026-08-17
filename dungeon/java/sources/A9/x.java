package A9;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.M1;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends AbstractC2704j1 implements M1 {
    private static final x zzb;

    static {
        x xVar = new x();
        zzb = xVar;
        AbstractC2704j1.v(x.class, xVar);
    }

    private x() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2704j1.s(zzb, "\u0001\u0000", null);
        }
        if (i11 == 3) {
            return new x();
        }
        if (i11 == 4) {
            return new w(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
