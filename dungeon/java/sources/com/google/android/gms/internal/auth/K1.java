package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes2.dex */
public final class K1 implements J1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M f32234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final M f32235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final M f32236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final M f32237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final M f32238e;

    static {
        I iA = new I(A.a("com.google.android.gms.auth_account")).b().a();
        f32234a = iA.e("Aang__create_auth_exception_with_pending_intent", false);
        f32235b = iA.e("Aang__enable_add_account_restrictions", false);
        f32236c = iA.e("Aang__log_missing_gaia_id_event", true);
        f32237d = iA.e("Aang__log_obfuscated_gaiaid_status", true);
        f32238e = iA.e("Aang__switch_clear_token_to_aang", false);
    }

    @Override // com.google.android.gms.internal.auth.J1
    public final boolean zza() {
        return ((Boolean) f32234a.b()).booleanValue();
    }
}
