package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f34464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f34465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f34466c;

    L(Object obj, Object obj2, Object obj3) {
        this.f34464a = obj;
        this.f34465b = obj2;
        this.f34466c = obj3;
    }

    final IllegalArgumentException a() {
        Object obj = this.f34466c;
        Object obj2 = this.f34465b;
        Object obj3 = this.f34464a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + "=" + String.valueOf(obj2) + " and " + String.valueOf(obj3) + "=" + String.valueOf(obj));
    }
}
