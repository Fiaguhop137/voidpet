package A9;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.M1;

/* JADX INFO: renamed from: A9.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0787a extends AbstractC2704j1 implements M1 {
    private static final C0787a zzb;
    private int zzd;
    private m zze;
    private e zzf;
    private u zzg;

    static {
        C0787a c0787a = new C0787a();
        zzb = c0787a;
        AbstractC2704j1.v(C0787a.class, c0787a);
    }

    private C0787a() {
    }

    public static o D() {
        return (o) zzb.e();
    }

    static /* synthetic */ void F(C0787a c0787a, m mVar) {
        mVar.getClass();
        c0787a.zze = mVar;
        c0787a.zzd |= 1;
    }

    static /* synthetic */ void G(C0787a c0787a, e eVar) {
        eVar.getClass();
        c0787a.zzf = eVar;
        c0787a.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2704j1.s(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C0787a();
        }
        if (i11 == 4) {
            return new o(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
