package Xf;

/* JADX INFO: loaded from: classes3.dex */
public class e extends c {
    public e() {
        this(Vf.d.ANY);
    }

    public e(Vf.d dVar) {
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
        q();
        return 48;
    }

    @Override // Vf.j
    public String c() {
        return "SHA-384";
    }

    @Override // Vf.j
    public int d() {
        return 48;
    }

    @Override // Xf.c
    public void q() {
        super.q();
        this.f16498f = -3766243637369397544L;
        this.f16499g = 7105036623409894663L;
        this.f16500h = -7973340178411365097L;
        this.f16501i = 1526699215303891257L;
        this.f16502j = 7436329637833083697L;
        this.f16503k = -8163818279084223215L;
        this.f16504l = -2662702644619276377L;
        this.f16505m = 5167115440072839076L;
    }

    protected Vf.c r() {
        return i.a(this, 256, this.f16493a);
    }
}
