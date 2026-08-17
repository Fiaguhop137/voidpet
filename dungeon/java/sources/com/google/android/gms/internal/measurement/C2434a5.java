package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2434a5 implements C5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C2434a5 f32857a = new C2434a5();

    private C2434a5() {
    }

    public static C2434a5 c() {
        return f32857a;
    }

    @Override // com.google.android.gms.internal.measurement.C5
    public final boolean a(Class cls) {
        return AbstractC2461d5.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.measurement.C5
    public final B5 b(Class cls) {
        if (!AbstractC2461d5.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (B5) AbstractC2461d5.r(cls.asSubclass(AbstractC2461d5.class)).B(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }
}
