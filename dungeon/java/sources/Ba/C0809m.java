package Ba;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.M1;

/* JADX INFO: renamed from: Ba.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0809m extends AbstractC2704j1 implements M1 {
    private static final C0809m zzb;
    private int zzd;
    private byte zzg = 2;
    private String zze = "";
    private String zzf = "";

    static {
        C0809m c0809m = new C0809m();
        zzb = c0809m;
        AbstractC2704j1.v(C0809m.class, c0809m);
    }

    private C0809m() {
    }

    public static C0809m E() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i11 == 2) {
            return AbstractC2704j1.s(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᔈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C0809m();
        }
        if (i11 == 4) {
            return new C0808l(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final String F() {
        return this.zze;
    }

    public final String G() {
        return this.zzf;
    }
}
