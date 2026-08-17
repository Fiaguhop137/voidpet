package Ba;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.M1;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends AbstractC2704j1 implements M1 {
    private static final q zzb;
    private int zzd;
    private int zzf;
    private boolean zzh;
    private byte zzi = 2;
    private String zze = "";
    private String zzg = "";

    static {
        q qVar = new q();
        zzb = qVar;
        AbstractC2704j1.v(q.class, qVar);
    }

    private q() {
    }

    public static q E() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i11 == 2) {
            return AbstractC2704j1.s(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᔈ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", C0811o.f641a, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new q();
        }
        if (i11 == 4) {
            return new C0810n(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final String F() {
        return this.zzg;
    }

    public final String G() {
        return this.zze;
    }

    public final int I() {
        int iA = AbstractC0812p.a(this.zzf);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
