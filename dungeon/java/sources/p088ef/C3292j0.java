package p088ef;

/* JADX INFO: renamed from: ef.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3292j0 implements InterfaceC3317w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f40841a;

    public C3292j0(boolean z10) {
        this.f40841a = z10;
    }

    @Override // p088ef.InterfaceC3317w0
    public boolean a() {
        return this.f40841a;
    }

    @Override // p088ef.InterfaceC3317w0
    public M0 b() {
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        sb2.append(a() ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}
