package p324s0;

import p288q0.y;

/* JADX INFO: loaded from: classes.dex */
final class t0 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private y f53214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S f53215b;

    public t0(y yVar, S s10) {
        this.f53214a = yVar;
        this.f53215b = s10;
    }

    @Override // p324s0.p0
    public boolean G0() {
        return this.f53215b.x().e();
    }

    public final S a() {
        return this.f53215b;
    }

    public final y b() {
        return this.f53214a;
    }

    public final void c(y yVar) {
        this.f53214a = yVar;
    }
}
