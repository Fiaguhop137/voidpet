package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class O3 extends K3 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ P3 f34487h;

    O3(P3 p10) {
        Objects.requireNonNull(p10);
        this.f34487h = p10;
    }

    @Override // com.google.android.gms.internal.play_billing.K3
    protected final String a() {
        L3 l10 = (L3) this.f34487h.f34644a.get();
        if (l10 == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + String.valueOf(l10.f34473a) + "]";
    }
}
