package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2805d3 extends F1 implements InterfaceC2804d2 {
    private static final C2805d3 zzb;
    private int zzd;
    private int zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzs;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";

    static {
        C2805d3 c2805d3 = new C2805d3();
        zzb = c2805d3;
        F1.f(C2805d3.class, c2805d3);
    }

    private C2805d3() {
    }

    static /* synthetic */ void C(C2805d3 c2805d3, long j10) {
        c2805d3.zzd |= 512;
        c2805d3.zzn = 846465066L;
    }

    static /* synthetic */ void D(C2805d3 c2805d3, String str) {
        str.getClass();
        c2805d3.zzd |= 4;
        c2805d3.zzg = str;
    }

    static /* synthetic */ void E(C2805d3 c2805d3, String str) {
        str.getClass();
        c2805d3.zzd |= 1024;
        c2805d3.zzo = str;
    }

    static /* synthetic */ void F(C2805d3 c2805d3, String str) {
        str.getClass();
        c2805d3.zzd |= 8192;
        c2805d3.zzr = str;
    }

    static /* synthetic */ void G(C2805d3 c2805d3, String str) {
        str.getClass();
        c2805d3.zzd |= 4096;
        c2805d3.zzq = str;
    }

    static /* synthetic */ void H(C2805d3 c2805d3, String str) {
        str.getClass();
        c2805d3.zzd |= 2048;
        c2805d3.zzp = str;
    }

    static /* synthetic */ void I(C2805d3 c2805d3, int i10) {
        c2805d3.zzd |= 16384;
        c2805d3.zzs = i10;
    }

    static /* synthetic */ void J(C2805d3 c2805d3, boolean z10) {
        c2805d3.zzd |= 64;
        c2805d3.zzk = z10;
    }

    static /* synthetic */ void K(C2805d3 c2805d3, String str) {
        str.getClass();
        c2805d3.zzd |= 1;
        c2805d3.zze = str;
    }

    static /* synthetic */ void L(C2805d3 c2805d3, String str) {
        c2805d3.zzd |= 2;
        c2805d3.zzf = str;
    }

    public static C2795b3 M() {
        return (C2795b3) zzb.q();
    }

    static /* synthetic */ void O(C2805d3 c2805d3, int i10) {
        c2805d3.zzd |= 128;
        c2805d3.zzl = i10;
    }

    static /* synthetic */ void P(C2805d3 c2805d3, int i10) {
        c2805d3.zzd |= 256;
        c2805d3.zzm = i10;
    }

    static /* synthetic */ void Q(C2805d3 c2805d3, int i10) {
        c2805d3.zzd |= 8;
        c2805d3.zzh = i10;
    }

    static /* synthetic */ void R(C2805d3 c2805d3, long j10) {
        c2805d3.zzd |= 16;
        c2805d3.zzi = j10;
    }

    static /* synthetic */ void S(C2805d3 c2805d3, long j10) {
        c2805d3.zzd |= 32;
        c2805d3.zzj = j10;
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    protected final Object m(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return F1.A(zzb, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဈ\u0001\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nဂ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fင\u000e", new Object[]{"zzd", "zze", "zzg", "zzh", "zzi", "zzf", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i11 == 3) {
            return new C2805d3();
        }
        if (i11 == 4) {
            return new C2795b3(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
