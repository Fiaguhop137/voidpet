package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
final class T1 implements Z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z1[] f34653a;

    T1(Z1... z1Arr) {
        this.f34653a = z1Arr;
    }

    @Override // com.google.android.gms.internal.play_billing.Z1
    public final Y1 a(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            Z1 z10 = this.f34653a[i10];
            if (z10.b(cls)) {
                return z10.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.Z1
    public final boolean b(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f34653a[i10].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
