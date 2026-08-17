package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class H7 implements G7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC2559o4 f32531a;

    static {
        C2505i4 c2505i4B = new C2505i4(AbstractC2460d4.a("com.google.android.gms.measurement")).a().b();
        f32531a = c2505i4B.d("measurement.tcf.consent_fix", true);
        c2505i4B.d("measurement.tcf.client", true);
        c2505i4B.d("measurement.tcf.empty_pref_fix", true);
    }

    @Override // com.google.android.gms.internal.measurement.G7
    public final boolean zza() {
        return ((Boolean) f32531a.d()).booleanValue();
    }
}
