package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2613u5 implements C5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5[] f33152a;

    C2613u5(C5... c5Arr) {
        this.f33152a = c5Arr;
    }

    @Override // com.google.android.gms.internal.measurement.C5
    public final boolean a(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f33152a[i10].a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.C5
    public final B5 b(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            C5 c10 = this.f33152a[i10];
            if (c10.a(cls)) {
                return c10.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
