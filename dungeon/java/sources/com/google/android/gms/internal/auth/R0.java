package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes2.dex */
final class R0 implements X0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X0[] f32271a;

    R0(X0... x0Arr) {
        this.f32271a = x0Arr;
    }

    @Override // com.google.android.gms.internal.auth.X0
    public final W0 a(Class cls) {
        X0[] x0Arr = this.f32271a;
        for (int i10 = 0; i10 < 2; i10++) {
            X0 x10 = x0Arr[i10];
            if (x10.b(cls)) {
                return x10.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.auth.X0
    public final boolean b(Class cls) {
        X0[] x0Arr = this.f32271a;
        for (int i10 = 0; i10 < 2; i10++) {
            if (x0Arr[i10].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
