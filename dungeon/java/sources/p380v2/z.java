package p380v2;

/* JADX INFO: loaded from: classes.dex */
public abstract class z implements InterfaceC4254q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4254q f56164a;

    public z(InterfaceC4254q interfaceC4254q) {
        this.f56164a = interfaceC4254q;
    }

    @Override // p380v2.InterfaceC4254q
    public int a(int i10) {
        return this.f56164a.a(i10);
    }

    @Override // p380v2.InterfaceC4254q
    public boolean b(int i10, boolean z10) {
        return this.f56164a.b(i10, z10);
    }

    @Override // p380v2.InterfaceC4254q
    public boolean c(byte[] bArr, int i10, int i11, boolean z10) {
        return this.f56164a.c(bArr, i10, i11, z10);
    }

    @Override // p380v2.InterfaceC4254q
    public void d() {
        this.f56164a.d();
    }

    @Override // p380v2.InterfaceC4254q
    public boolean g(byte[] bArr, int i10, int i11, boolean z10) {
        return this.f56164a.g(bArr, i10, i11, z10);
    }

    @Override // p380v2.InterfaceC4254q
    public long getLength() {
        return this.f56164a.getLength();
    }

    @Override // p380v2.InterfaceC4254q
    public long getPosition() {
        return this.f56164a.getPosition();
    }

    @Override // p380v2.InterfaceC4254q
    public long h() {
        return this.f56164a.h();
    }

    @Override // p380v2.InterfaceC4254q
    public void i(int i10) {
        this.f56164a.i(i10);
    }

    @Override // p380v2.InterfaceC4254q
    public int k(byte[] bArr, int i10, int i11) {
        return this.f56164a.k(bArr, i10, i11);
    }

    @Override // p380v2.InterfaceC4254q
    public void l(int i10) {
        this.f56164a.l(i10);
    }

    @Override // p380v2.InterfaceC4254q
    public boolean n(int i10, boolean z10) {
        return this.f56164a.n(i10, z10);
    }

    @Override // p380v2.InterfaceC4254q
    public void o(byte[] bArr, int i10, int i11) {
        this.f56164a.o(bArr, i10, i11);
    }

    @Override // p380v2.InterfaceC4254q, R1.InterfaceC1350j
    public int read(byte[] bArr, int i10, int i11) {
        return this.f56164a.read(bArr, i10, i11);
    }

    @Override // p380v2.InterfaceC4254q
    public void readFully(byte[] bArr, int i10, int i11) {
        this.f56164a.readFully(bArr, i10, i11);
    }
}
