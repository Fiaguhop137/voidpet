package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
final class U1 implements InterfaceC2854n2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Z1 f34655b = new S1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z1 f34656a;

    public U1() {
        C1 c1C = C1.c();
        int i10 = AbstractC2788a1.f34683a;
        T1 t10 = new T1(c1C, f34655b);
        byte[] bArr = M1.f34481b;
        this.f34656a = t10;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2854n2
    public final InterfaceC2849m2 a(Class cls) {
        int i10 = AbstractC2859o2.f34795b;
        if (!F1.class.isAssignableFrom(cls)) {
            int i11 = AbstractC2788a1.f34683a;
        }
        Y1 y1A = this.f34656a.a(cls);
        if (y1A.zzb()) {
            int i12 = AbstractC2788a1.f34683a;
            return C2819g2.j(AbstractC2859o2.t(), A1.a(), y1A.zza());
        }
        int i13 = AbstractC2788a1.f34683a;
        return C2814f2.A(cls, y1A, AbstractC2829i2.a(), R1.a(), AbstractC2859o2.t(), y1A.zzc() + (-1) != 1 ? A1.a() : null, X1.a());
    }
}
