package A9;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.M1;

/* JADX INFO: loaded from: classes2.dex */
public final class D extends AbstractC2704j1 implements M1 {
    private static final D zzb;

    static {
        D d10 = new D();
        zzb = d10;
        AbstractC2704j1.v(D.class, d10);
    }

    private D() {
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
}
