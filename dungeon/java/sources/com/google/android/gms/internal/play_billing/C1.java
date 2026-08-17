package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
final class C1 implements Z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C1 f34430a = new C1();

    private C1() {
    }

    public static C1 c() {
        return f34430a;
    }

    @Override // com.google.android.gms.internal.play_billing.Z1
    public final Y1 a(Class cls) {
        if (!F1.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (Y1) F1.s(cls.asSubclass(F1.class)).m(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.Z1
    public final boolean b(Class cls) {
        return F1.class.isAssignableFrom(cls);
    }
}
