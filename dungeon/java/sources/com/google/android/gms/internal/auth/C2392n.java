package com.google.android.gms.internal.auth;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2392n extends K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f32429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final U f32430b;

    C2392n(Context context, U u10) {
        this.f32429a = context;
        this.f32430b = u10;
    }

    @Override // com.google.android.gms.internal.auth.K
    final Context a() {
        return this.f32429a;
    }

    @Override // com.google.android.gms.internal.auth.K
    final U b() {
        return this.f32430b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof K) {
            K k10 = (K) obj;
            if (this.f32429a.equals(k10.a()) && this.f32430b.equals(k10.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f32429a.hashCode() ^ 1000003) * 1000003) ^ this.f32430b.hashCode();
    }

    public final String toString() {
        return "FlagsContext{context=" + this.f32429a.toString() + ", hermeticFileOverrides=" + this.f32430b.toString() + "}";
    }
}
