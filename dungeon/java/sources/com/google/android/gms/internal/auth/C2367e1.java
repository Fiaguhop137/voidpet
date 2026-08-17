package com.google.android.gms.internal.auth;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2367e1 implements InterfaceC2385k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z0 f32325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC2400p1 f32326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC2419w0 f32327c;

    private C2367e1(AbstractC2400p1 abstractC2400p1, AbstractC2419w0 abstractC2419w0, Z0 z10) {
        this.f32326b = abstractC2400p1;
        this.f32327c = abstractC2419w0;
        this.f32325a = z10;
    }

    static C2367e1 b(AbstractC2400p1 abstractC2400p1, AbstractC2419w0 abstractC2419w0, Z0 z10) {
        return new C2367e1(abstractC2400p1, abstractC2419w0, z10);
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC2385k1
    public final Object a() {
        Z0 z10 = this.f32325a;
        return z10 instanceof C0 ? ((C0) z10).e() : ((B0) ((C0) z10).o(5, null, null)).a();
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC2385k1
    public final int c(Object obj) {
        return this.f32326b.a(obj).hashCode();
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC2385k1
    public final void e(Object obj) {
        this.f32326b.c(obj);
        this.f32327c.b(obj);
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC2385k1
    public final boolean f(Object obj, Object obj2) {
        return this.f32326b.a(obj).equals(this.f32326b.a(obj2));
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC2385k1
    public final void g(Object obj, byte[] bArr, int i10, int i11, C2366e0 c2366e0) {
        C0 c10 = (C0) obj;
        if (c10.zzc == C2405r1.a()) {
            c10.zzc = C2405r1.d();
        }
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC2385k1
    public final void h(Object obj, Object obj2) {
        AbstractC2391m1.c(this.f32326b, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC2385k1
    public final boolean i(Object obj) {
        this.f32327c.a(obj);
        throw null;
    }
}
