package p359u;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class A implements InterfaceC4226z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f54771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f54772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f54773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final K f54774d;

    public A(float f10, float f11, float f12) {
        this.f54771a = f10;
        this.f54772b = f11;
        this.f54773c = f12;
        K k10 = new K(1.0f);
        k10.c(f10);
        k10.e(f11);
        this.f54774d = k10;
    }

    public /* synthetic */ A(float f10, float f11, float f12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1500.0f : f11, (i10 & 4) != 0 ? 0.01f : f12);
    }

    @Override // p359u.InterfaceC4226z
    public float b(float f10, float f11, float f12) {
        return 0.0f;
    }

    @Override // p359u.InterfaceC4226z
    public float c(long j10, float f10, float f11, float f12) {
        this.f54774d.d(f11);
        return Float.intBitsToFloat((int) (this.f54774d.f(f10, f12, j10 / 1000000) >> 32));
    }

    @Override // p359u.InterfaceC4226z
    public float d(long j10, float f10, float f11, float f12) {
        this.f54774d.d(f11);
        return Float.intBitsToFloat((int) (this.f54774d.f(f10, f12, j10 / 1000000) & 4294967295L));
    }

    @Override // p359u.InterfaceC4226z
    public long e(float f10, float f11, float f12) {
        float fB = this.f54774d.b();
        float fA = this.f54774d.a();
        float f13 = f10 - f11;
        float f14 = this.f54773c;
        return J.b(fB, fA, f12 / f14, f13 / f14, 1.0f) * 1000000;
    }
}
