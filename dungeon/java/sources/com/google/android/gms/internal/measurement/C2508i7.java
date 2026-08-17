package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2508i7 implements InterfaceC2499h7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC2559o4 f32947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC2559o4 f32948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC2559o4 f32949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC2559o4 f32950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC2559o4 f32951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC2559o4 f32952f;

    static {
        C2505i4 c2505i4B = new C2505i4(AbstractC2460d4.a("com.google.android.gms.measurement")).a().b();
        f32947a = c2505i4B.d("measurement.test.boolean_flag", false);
        f32948b = c2505i4B.c("measurement.test.cached_long_flag", -1L);
        f32949c = c2505i4B.e("measurement.test.double_flag", -3.0d);
        f32950d = c2505i4B.c("measurement.test.int_flag", -2L);
        f32951e = c2505i4B.c("measurement.test.long_flag", -1L);
        f32952f = c2505i4B.f("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2499h7
    public final long a() {
        return ((Long) f32950d.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2499h7
    public final long b() {
        return ((Long) f32951e.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2499h7
    public final String c() {
        return (String) f32952f.d();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2499h7
    public final boolean zza() {
        return ((Boolean) f32947a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2499h7
    public final long zzb() {
        return ((Long) f32948b.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2499h7
    public final double zzc() {
        return ((Double) f32949c.d()).doubleValue();
    }
}
