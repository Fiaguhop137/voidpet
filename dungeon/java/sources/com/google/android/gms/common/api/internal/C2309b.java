package com.google.android.gms.common.api.internal;

import p170j8.AbstractC3851p;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2309b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p135h8.a f31798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h8.a.d f31799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f31800d;

    private C2309b(p135h8.a aVar, h8.a.d dVar, String str) {
        this.f31798b = aVar;
        this.f31799c = dVar;
        this.f31800d = str;
        this.f31797a = AbstractC3851p.b(aVar, dVar, str);
    }

    public static C2309b a(p135h8.a aVar, h8.a.d dVar, String str) {
        return new C2309b(aVar, dVar, str);
    }

    public final String b() {
        return this.f31798b.c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2309b)) {
            return false;
        }
        C2309b c2309b = (C2309b) obj;
        return AbstractC3851p.a(this.f31798b, c2309b.f31798b) && AbstractC3851p.a(this.f31799c, c2309b.f31799c) && AbstractC3851p.a(this.f31800d, c2309b.f31800d);
    }

    public final int hashCode() {
        return this.f31797a;
    }
}
