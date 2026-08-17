package p088ef;

/* JADX INFO: renamed from: ef.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3288h0 implements InterfaceC3297m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3286g0 f40837a;

    public C3288h0(InterfaceC3286g0 interfaceC3286g0) {
        this.f40837a = interfaceC3286g0;
    }

    @Override // p088ef.InterfaceC3297m
    public void a(Throwable th) {
        this.f40837a.dispose();
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f40837a + ']';
    }
}
