package Ba;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C2718m0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C2728o0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C2747s0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2739q1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.M1;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class F extends AbstractC2704j1 implements M1 {
    private static final F zzb;
    private int zzd;
    private C2728o0 zze;
    private byte zzm = 2;
    private String zzf = "";
    private String zzg = "";
    private InterfaceC2739q1 zzh = AbstractC2704j1.p();
    private InterfaceC2739q1 zzi = AbstractC2704j1.p();
    private InterfaceC2739q1 zzj = AbstractC2704j1.p();
    private InterfaceC2739q1 zzk = AbstractC2704j1.p();
    private String zzl = "";

    static {
        F f10 = new F();
        zzb = f10;
        AbstractC2704j1.v(F.class, f10);
    }

    private F() {
    }

    public static F F() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i11 == 2) {
            return AbstractC2704j1.s(zzb, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0004\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b\u0005\u001b\u0006\u001a\u0007Л\bဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", C2747s0.class, "zzi", L.class, "zzj", "zzk", C2718m0.class, "zzl"});
        }
        if (i11 == 3) {
            return new F();
        }
        if (i11 == 4) {
            return new E(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzm = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final C2728o0 D() {
        C2728o0 c2728o0 = this.zze;
        return c2728o0 == null ? C2728o0.E() : c2728o0;
    }

    public final String G() {
        return this.zzf;
    }

    public final String I() {
        return this.zzg;
    }

    public final List J() {
        return this.zzk;
    }

    public final List K() {
        return this.zzi;
    }

    public final List L() {
        return this.zzh;
    }

    public final List P() {
        return this.zzj;
    }
}
