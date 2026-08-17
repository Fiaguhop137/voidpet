package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2481f7 implements InterfaceC2472e7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC2559o4 f32910a;

    static {
        C2505i4 c2505i4B = new C2505i4(AbstractC2460d4.a("com.google.android.gms.measurement")).a().b();
        c2505i4B.d("measurement.sdk.collection.enable_extend_user_property_size", true);
        f32910a = c2505i4B.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        c2505i4B.c("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2472e7
    public final boolean zza() {
        return ((Boolean) f32910a.d()).booleanValue();
    }
}
