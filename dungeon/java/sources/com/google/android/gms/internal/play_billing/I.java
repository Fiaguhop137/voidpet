package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
final class I extends E {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final K f34445c;

    I(K k10, int i10) {
        super(k10.size(), i10);
        this.f34445c = k10;
    }

    @Override // com.google.android.gms.internal.play_billing.E
    protected final Object a(int i10) {
        return this.f34445c.get(i10);
    }
}
