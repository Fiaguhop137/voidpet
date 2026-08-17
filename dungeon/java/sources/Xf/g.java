package Xf;

/* JADX INFO: loaded from: classes3.dex */
public class g extends c {
    public g() {
        this(Vf.d.ANY);
    }

    public g(Vf.d dVar) {
        super(dVar);
        Vf.g.a(r());
        q();
    }

    @Override // Vf.j
    public int a(byte[] bArr, int i10) {
        m();
        Ug.f.h(this.f16498f, bArr, i10);
        Ug.f.h(this.f16499g, bArr, i10 + 8);
        Ug.f.h(this.f16500h, bArr, i10 + 16);
        Ug.f.h(this.f16501i, bArr, i10 + 24);
        Ug.f.h(this.f16502j, bArr, i10 + 32);
        Ug.f.h(this.f16503k, bArr, i10 + 40);
        Ug.f.h(this.f16504l, bArr, i10 + 48);
        Ug.f.h(this.f16505m, bArr, i10 + 56);
        q();
        return 64;
    }

    @Override // Vf.j
    public String c() {
        return "SHA-512";
    }

    @Override // Vf.j
    public int d() {
        return 64;
    }

    @Override // Xf.c
    public void q() {
        super.q();
        this.f16498f = 7640891576956012808L;
        this.f16499g = -4942790177534073029L;
        this.f16500h = 4354685564936845355L;
        this.f16501i = -6534734903238641935L;
        this.f16502j = 5840696475078001361L;
        this.f16503k = -7276294671716946913L;
        this.f16504l = 2270897969802886507L;
        this.f16505m = 6620516959819538809L;
    }

    protected Vf.c r() {
        return i.a(this, 256, this.f16493a);
    }
}
