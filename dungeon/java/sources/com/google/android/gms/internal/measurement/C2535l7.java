package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2535l7 implements InterfaceC2526k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC2559o4 f32994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC2559o4 f32995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC2559o4 f32996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC2559o4 f32997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC2559o4 f32998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC2559o4 f32999f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AbstractC2559o4 f33000g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AbstractC2559o4 f33001h;

    static {
        C2505i4 c2505i4B = new C2505i4(AbstractC2460d4.a("com.google.android.gms.measurement")).a().b();
        c2505i4B.d("measurement.rb.attribution.ad_campaign_info", true);
        c2505i4B.d("measurement.rb.attribution.service.bundle_on_backgrounded", true);
        f32994a = c2505i4B.d("measurement.rb.attribution.client2", true);
        f32995b = c2505i4B.d("measurement.rb.attribution.followup1.service", false);
        c2505i4B.d("measurement.rb.attribution.client.get_trigger_uris_async", true);
        f32996c = c2505i4B.d("measurement.rb.attribution.service.trigger_uris_high_priority", true);
        c2505i4B.d("measurement.rb.attribution.index_out_of_bounds_fix", true);
        f32997d = c2505i4B.d("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true);
        f32998e = c2505i4B.d("measurement.rb.attribution.retry_disposition", false);
        f32999f = c2505i4B.d("measurement.rb.attribution.service", true);
        f33000g = c2505i4B.d("measurement.rb.attribution.enable_trigger_redaction", true);
        f33001h = c2505i4B.d("measurement.rb.attribution.uuid_generation", true);
        c2505i4B.c("measurement.id.rb.attribution.retry_disposition", 0L);
        c2505i4B.d("measurement.rb.attribution.improved_retry", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2526k7
    public final boolean a() {
        return ((Boolean) f32996c.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2526k7
    public final boolean b() {
        return ((Boolean) f32997d.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2526k7
    public final boolean c() {
        return ((Boolean) f32998e.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2526k7
    public final boolean d() {
        return ((Boolean) f32999f.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2526k7
    public final boolean e() {
        return ((Boolean) f33000g.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2526k7
    public final boolean h() {
        return ((Boolean) f33001h.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2526k7
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2526k7
    public final boolean zzb() {
        return ((Boolean) f32994a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2526k7
    public final boolean zzc() {
        return ((Boolean) f32995b.d()).booleanValue();
    }
}
