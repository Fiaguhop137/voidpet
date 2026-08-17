package Ba;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.M1;

/* JADX INFO: renamed from: Ba.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0804h extends AbstractC2704j1 implements M1 {
    private static final C0804h zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private byte zzg = 2;

    static {
        C0804h c0804h = new C0804h();
        zzb = c0804h;
        AbstractC2704j1.v(C0804h.class, c0804h);
    }

    private C0804h() {
    }

    public static C0803g F() {
        return (C0803g) zzb.e();
    }

    static /* synthetic */ void I(C0804h c0804h, int i10) {
        c0804h.zzd |= 1;
        c0804h.zze = i10;
    }

    static /* synthetic */ void J(C0804h c0804h, int i10) {
        c0804h.zzd |= 2;
        c0804h.zzf = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i11 == 2) {
            return AbstractC2704j1.s(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C0804h();
        }
        if (i11 == 4) {
            return new C0803g(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final int D() {
        return this.zze;
    }

    public final int E() {
        return this.zzf;
    }
}
