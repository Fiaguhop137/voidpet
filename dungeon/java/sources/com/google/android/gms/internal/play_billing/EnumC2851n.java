package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
enum EnumC2851n {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11),
    NETWORK_ERROR(12);


    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final N f34782q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f34784a;

    static {
        M m10 = new M();
        for (EnumC2851n enumC2851n : values()) {
            m10.a(Integer.valueOf(enumC2851n.f34784a), enumC2851n);
        }
        f34782q = m10.b();
    }

    EnumC2851n(int i10) {
        this.f34784a = i10;
    }

    static EnumC2851n e(int i10) {
        N n10 = f34782q;
        Integer numValueOf = Integer.valueOf(i10);
        return !n10.containsKey(numValueOf) ? RESPONSE_CODE_UNSPECIFIED : (EnumC2851n) n10.get(numValueOf);
    }
}
