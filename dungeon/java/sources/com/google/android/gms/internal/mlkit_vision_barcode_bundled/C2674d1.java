package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2674d1 implements J1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C2674d1 f33474a = new C2674d1();

    private C2674d1() {
    }

    public static C2674d1 c() {
        return f33474a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J1
    public final I1 a(Class cls) {
        if (!AbstractC2704j1.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (I1) AbstractC2704j1.h(cls.asSubclass(AbstractC2704j1.class)).C(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J1
    public final boolean b(Class cls) {
        return AbstractC2704j1.class.isAssignableFrom(cls);
    }
}
