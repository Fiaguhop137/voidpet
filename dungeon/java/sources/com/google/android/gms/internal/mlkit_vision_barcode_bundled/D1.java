package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes2.dex */
final class D1 implements J1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final J1[] f33291a;

    D1(J1... j1Arr) {
        this.f33291a = j1Arr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J1
    public final I1 a(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            J1 j10 = this.f33291a[i10];
            if (j10.b(cls)) {
                return j10.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J1
    public final boolean b(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f33291a[i10].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
