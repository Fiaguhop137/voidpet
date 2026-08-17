package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class G6 implements F6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC2559o4 f32506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC2559o4 f32507b;

    static {
        C2505i4 c2505i4B = new C2505i4(AbstractC2460d4.a("com.google.android.gms.measurement")).a().b();
        f32506a = c2505i4B.d("measurement.set_default_event_parameters_propagate_clear.client.dev", true);
        f32507b = c2505i4B.d("measurement.set_default_event_parameters_propagate_clear.service", true);
    }

    @Override // com.google.android.gms.internal.measurement.F6
    public final boolean zza() {
        return ((Boolean) f32506a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.F6
    public final boolean zzb() {
        return ((Boolean) f32507b.d()).booleanValue();
    }
}
