package Ba;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2739q1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.M1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.U0;
import java.util.List;

/* JADX INFO: renamed from: Ba.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0797a extends AbstractC2704j1 implements M1 {
    private static final C0797a zzb;
    private int zzd;
    private int zzf;
    private byte zzi = 2;
    private InterfaceC2739q1 zze = AbstractC2704j1.p();
    private String zzg = "";
    private I0 zzh = I0.f33335b;

    static {
        C0797a c0797a = new C0797a();
        zzb = c0797a;
        AbstractC2704j1.v(C0797a.class, c0797a);
    }

    private C0797a() {
    }

    public static C0797a E(byte[] bArr, U0 u10) {
        return (C0797a) AbstractC2704j1.l(zzb, bArr, u10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i11 == 2) {
            return AbstractC2704j1.s(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Л\u0002ᴌ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", s.class, "zzf", C0807k.f640a, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C0797a();
        }
        if (i11 == 4) {
            return new x(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final List F() {
        return this.zze;
    }
}
