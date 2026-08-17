package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class P6 implements O6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC2559o4 f32694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC2559o4 f32695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC2559o4 f32696c;

    static {
        C2505i4 c2505i4B = new C2505i4(AbstractC2460d4.a("com.google.android.gms.measurement")).a().b();
        c2505i4B.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f32694a = c2505i4B.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        f32695b = c2505i4B.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f32696c = c2505i4B.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.O6
    public final boolean a() {
        return ((Boolean) f32696c.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.O6
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.O6
    public final boolean zzb() {
        return ((Boolean) f32694a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.O6
    public final boolean zzc() {
        return ((Boolean) f32695b.d()).booleanValue();
    }
}
