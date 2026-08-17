package Ba;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2739q1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.M1;

/* JADX INFO: renamed from: Ba.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0802f extends AbstractC2704j1 implements M1 {
    private static final C0802f zzb;
    private InterfaceC2739q1 zzd = AbstractC2704j1.p();

    static {
        C0802f c0802f = new C0802f();
        zzb = c0802f;
        AbstractC2704j1.v(C0802f.class, c0802f);
    }

    private C0802f() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2704j1.s(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C0801e.class});
        }
        if (i11 == 3) {
            return new C0802f();
        }
        if (i11 == 4) {
            return new C0799c(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
