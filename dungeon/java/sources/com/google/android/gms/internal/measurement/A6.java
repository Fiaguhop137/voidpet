package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class A6 implements InterfaceC2656z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC2559o4 f32479a;

    static {
        C2505i4 c2505i4B = new C2505i4(AbstractC2460d4.a("com.google.android.gms.measurement")).a().b();
        c2505i4B.d("measurement.client.3p_consent_state_v1", true);
        f32479a = c2505i4B.c("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2656z6
    public final long zza() {
        return ((Long) f32479a.d()).longValue();
    }
}
