package com.applovin.impl;

/* JADX INFO: loaded from: classes.dex */
public final class o2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o2 f28237c = new o2("com.applovin.sdk.launch_count", Long.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o2 f28238d = new o2("com.applovin.sdk.last_launch_timestamp", Long.class);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o2 f28239e = new o2("com.applovin.sdk.install_date", Long.class);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o2 f28240f = new o2("com.applovin.sdk.device_test_group", String.class);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o2 f28241g = new o2("com.applovin.sdk.compliance.has_user_consent", Boolean.class);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o2 f28242h = new o2("com.applovin.sdk.compliance.is_do_not_sell", Boolean.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f28244b;

    public o2(String str, Class cls) {
        this.f28243a = str;
        this.f28244b = cls;
    }

    public final String toString() {
        return "Key{name='" + this.f28243a + "', type=" + this.f28244b + '}';
    }
}
