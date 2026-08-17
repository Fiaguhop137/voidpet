package A9;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2739q1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.M1;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends AbstractC2704j1 implements M1 {
    private static final u zzb;
    private InterfaceC2739q1 zzd = AbstractC2704j1.p();
    private InterfaceC2739q1 zze = AbstractC2704j1.p();

    static {
        u uVar = new u();
        zzb = uVar;
        AbstractC2704j1.v(u.class, uVar);
    }

    private u() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2704j1.s(zzb, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"zzd", r.class, "zze", r.class});
        }
        if (i11 == 3) {
            return new u();
        }
        if (i11 == 4) {
            return new t(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
