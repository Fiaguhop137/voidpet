package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2933d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T8.u f35382a;

    C2933d1(T8.u uVar) {
        this.f35382a = uVar;
    }

    static C2933d1 c(String str) {
        return new C2933d1((TextUtils.isEmpty(str) || str.length() > 1) ? T8.u.UNINITIALIZED : E3.j(str.charAt(0)));
    }

    final T8.u a() {
        return this.f35382a;
    }

    final String b() {
        return String.valueOf(E3.m(this.f35382a));
    }
}
