package p088ef;

/* JADX INFO: renamed from: ef.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3290i0 extends G0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3286g0 f40840e;

    public C3290i0(InterfaceC3286g0 interfaceC3286g0) {
        this.f40840e = interfaceC3286g0;
    }

    @Override // p088ef.G0
    public boolean v() {
        return false;
    }

    @Override // p088ef.G0
    public void w(Throwable th) {
        this.f40840e.dispose();
    }
}
