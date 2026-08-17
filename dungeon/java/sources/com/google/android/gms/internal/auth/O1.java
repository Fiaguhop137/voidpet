package com.google.android.gms.internal.auth;

import android.util.Base64;

/* JADX INFO: loaded from: classes2.dex */
public final class O1 implements M1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M f32255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final M f32256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final M f32257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final M f32258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final M f32259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final M f32260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final M f32261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final M f32262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final M f32263i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final M f32264j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final M f32265k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final M f32266l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final M f32267m;

    static {
        I iA = new I(A.a("com.google.android.gms.auth_account")).b().a();
        f32255a = iA.c("getTokenRefactor__account_data_service_sample_percentage", 0.0d);
        f32256b = iA.e("getTokenRefactor__account_data_service_tokenAPI_usable", true);
        f32257c = iA.d("getTokenRefactor__account_manager_timeout_seconds", 20L);
        f32258d = iA.d("getTokenRefactor__android_id_shift", 0L);
        try {
            f32259e = iA.f("getTokenRefactor__blocked_packages", H1.r(Base64.decode("ChNjb20uYW5kcm9pZC52ZW5kaW5nCiBjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tZWV0aW5ncwohY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWVzc2FnaW5n", 3)), N1.f32254a);
            f32260f = iA.e("getTokenRefactor__chimera_get_token_evolved", true);
            f32261g = iA.d("getTokenRefactor__clear_token_timeout_seconds", 20L);
            f32262h = iA.d("getTokenRefactor__default_task_timeout_seconds", 20L);
            f32263i = iA.e("getTokenRefactor__gaul_accounts_api_evolved", false);
            f32264j = iA.e("getTokenRefactor__gaul_token_api_evolved", false);
            f32265k = iA.d("getTokenRefactor__get_token_timeout_seconds", 120L);
            f32266l = iA.e("getTokenRefactor__gms_account_authenticator_evolved", true);
            f32267m = iA.c("getTokenRefactor__gms_account_authenticator_sample_percentage", 0.0d);
        } catch (Exception e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // com.google.android.gms.internal.auth.M1
    public final H1 zza() {
        return (H1) f32259e.b();
    }

    @Override // com.google.android.gms.internal.auth.M1
    public final boolean zzc() {
        return ((Boolean) f32264j.b()).booleanValue();
    }
}
