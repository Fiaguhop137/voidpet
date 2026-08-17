package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes2.dex */
final class S0 implements InterfaceC2388l1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final X0 f32272b = new Q0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X0 f32273a;

    public S0() {
        X0 x10;
        A0 a0C = A0.c();
        try {
            x10 = (X0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            x10 = f32272b;
        }
        R0 r10 = new R0(a0C, x10);
        byte[] bArr = G0.f32219d;
        this.f32273a = r10;
    }

    private static boolean b(W0 w10) {
        return w10.zzc() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC2388l1
    public final InterfaceC2385k1 a(Class cls) {
        AbstractC2391m1.d(cls);
        W0 w0A = this.f32273a.a(cls);
        if (w0A.zzb()) {
            return C0.class.isAssignableFrom(cls) ? C2367e1.b(AbstractC2391m1.b(), AbstractC2425y0.b(), w0A.zza()) : C2367e1.b(AbstractC2391m1.a(), AbstractC2425y0.a(), w0A.zza());
        }
        if (C0.class.isAssignableFrom(cls)) {
            return b(w0A) ? C2364d1.s(cls, w0A, AbstractC2373g1.b(), P0.d(), AbstractC2391m1.b(), AbstractC2425y0.b(), V0.b()) : C2364d1.s(cls, w0A, AbstractC2373g1.b(), P0.d(), AbstractC2391m1.b(), null, V0.b());
        }
        return b(w0A) ? C2364d1.s(cls, w0A, AbstractC2373g1.a(), P0.c(), AbstractC2391m1.a(), AbstractC2425y0.a(), V0.a()) : C2364d1.s(cls, w0A, AbstractC2373g1.a(), P0.c(), AbstractC2391m1.a(), null, V0.a());
    }
}
