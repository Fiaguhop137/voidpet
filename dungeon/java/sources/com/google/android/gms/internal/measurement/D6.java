package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class D6 implements C6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC2559o4 f32493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC2559o4 f32494b;

    static {
        C2505i4 c2505i4B = new C2505i4(AbstractC2460d4.a("com.google.android.gms.measurement")).a().b();
        c2505i4B.d("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        c2505i4B.d("measurement.set_default_event_parameters_with_backfill.service", true);
        c2505i4B.c("measurement.id.set_default_event_parameters.fix_service_request_ordering", 0L);
        f32493a = c2505i4B.d("measurement.set_default_event_parameters.fix_app_update_logging", true);
        f32494b = c2505i4B.d("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        c2505i4B.d("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }

    @Override // com.google.android.gms.internal.measurement.C6
    public final boolean zza() {
        return ((Boolean) f32493a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.C6
    public final boolean zzb() {
        return ((Boolean) f32494b.d()).booleanValue();
    }
}
