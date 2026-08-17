package Ba;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.M1;

/* JADX INFO: renamed from: Ba.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0801e extends AbstractC2704j1 implements M1 {
    private static final C0801e zzb;
    private int zzd;
    private int zze;
    private I0 zzf = I0.f33335b;

    static {
        C0801e c0801e = new C0801e();
        zzb = c0801e;
        AbstractC2704j1.v(C0801e.class, c0801e);
    }

    private C0801e() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2704j1.s(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C0801e();
        }
        if (i11 == 4) {
            return new C0800d(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
