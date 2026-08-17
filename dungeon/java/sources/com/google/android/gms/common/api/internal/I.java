package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.C2335d;
import p170j8.AbstractC3851p;

/* JADX INFO: loaded from: classes2.dex */
final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2309b f31758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2335d f31759b;

    /* synthetic */ I(C2309b c2309b, C2335d c2335d, H h10) {
        this.f31758a = c2309b;
        this.f31759b = c2335d;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof I)) {
            I i10 = (I) obj;
            if (AbstractC3851p.a(this.f31758a, i10.f31758a) && AbstractC3851p.a(this.f31759b, i10.f31759b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3851p.b(this.f31758a, this.f31759b);
    }

    public final String toString() {
        return AbstractC3851p.c(this).a("key", this.f31758a).a("feature", this.f31759b).toString();
    }
}
