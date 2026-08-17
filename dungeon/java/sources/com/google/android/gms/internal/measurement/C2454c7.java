package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2454c7 implements InterfaceC2445b7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC2559o4 f32884a;

    static {
        C2505i4 c2505i4B = new C2505i4(AbstractC2460d4.a("com.google.android.gms.measurement")).a().b();
        c2505i4B.d("measurement.gmscore_feature_tracking", true);
        f32884a = c2505i4B.d("measurement.gmscore_client_telemetry", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2445b7
    public final boolean zza() {
        return ((Boolean) f32884a.d()).booleanValue();
    }
}
