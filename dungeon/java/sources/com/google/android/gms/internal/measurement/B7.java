package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class B7 implements A7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC2559o4 f32488a;

    static {
        C2505i4 c2505i4B = new C2505i4(AbstractC2460d4.a("com.google.android.gms.measurement")).a().b();
        f32488a = c2505i4B.d("measurement.client.sessions.enable_fix_background_engagement", false);
        c2505i4B.d("measurement.client.sessions.enable_pause_engagement_in_background", true);
        c2505i4B.c("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.A7
    public final boolean zza() {
        return ((Boolean) f32488a.d()).booleanValue();
    }
}
