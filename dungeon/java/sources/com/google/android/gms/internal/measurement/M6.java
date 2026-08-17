package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class M6 implements L6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC2559o4 f32578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC2559o4 f32579b;

    static {
        C2505i4 c2505i4B = new C2505i4(AbstractC2460d4.a("com.google.android.gms.measurement")).a().b();
        c2505i4B.d("measurement.collection.event_safelist", true);
        f32578a = c2505i4B.d("measurement.service.store_null_safelist", true);
        f32579b = c2505i4B.d("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.L6
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.L6
    public final boolean zzb() {
        return ((Boolean) f32578a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.L6
    public final boolean zzc() {
        return ((Boolean) f32579b.d()).booleanValue();
    }
}
