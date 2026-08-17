package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class Z6 implements Y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC2559o4 f32852a;

    static {
        C2505i4 c2505i4B = new C2505i4(AbstractC2460d4.a("com.google.android.gms.measurement")).a().b();
        c2505i4B.d("measurement.gbraid_campaign.gbraid.client", true);
        f32852a = c2505i4B.d("measurement.gbraid_campaign.stop_lgclid", false);
    }

    @Override // com.google.android.gms.internal.measurement.Y6
    public final boolean zza() {
        return ((Boolean) f32852a.d()).booleanValue();
    }
}
