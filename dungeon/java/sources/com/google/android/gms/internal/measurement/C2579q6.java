package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2579q6 implements InterfaceC2570p6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC2559o4 f33102a;

    static {
        C2505i4 c2505i4B = new C2505i4(AbstractC2460d4.a("com.google.android.gms.measurement")).a().b();
        f33102a = c2505i4B.d("measurement.service.ad_impression.convert_value_to_double", true);
        c2505i4B.d("measurement.service.separate_public_internal_event_blacklisting", true);
        c2505i4B.d("measurement.service.ad_impression", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2570p6
    public final boolean zza() {
        return ((Boolean) f33102a.d()).booleanValue();
    }
}
