package Pf;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class G extends AbstractC1333y implements InterfaceC1301e, L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f9055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f9056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f9057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final InterfaceC1301e f9058d;

    G(int i10, int i11, int i12, InterfaceC1301e interfaceC1301e) {
        if (interfaceC1301e == null) {
            throw new NullPointerException("'obj' cannot be null");
        }
        if (i11 == 0 || (i11 & 192) != i11) {
            throw new IllegalArgumentException("invalid tag class: " + i11);
        }
        this.f9055a = i10;
        this.f9056b = i11;
        this.f9057c = i12;
        this.f9058d = interfaceC1301e;
    }

    protected G(boolean z10, int i10, int i11, InterfaceC1301e interfaceC1301e) {
        this(z10 ? 1 : 2, i10, i11, interfaceC1301e);
    }

    protected G(boolean z10, int i10, InterfaceC1301e interfaceC1301e) {
        this(z10, 128, i10, interfaceC1301e);
    }

    static AbstractC1333y A(int i10, int i11, byte[] bArr) {
        return new I0(4, i10, i11, new C1320n0(bArr));
    }

    public static G D(Object obj) {
        if (obj == null || (obj instanceof G)) {
            return (G) obj;
        }
        if (obj instanceof InterfaceC1301e) {
            AbstractC1333y abstractC1333yG = ((InterfaceC1301e) obj).g();
            if (abstractC1333yG instanceof G) {
                return (G) abstractC1333yG;
            }
        } else if (obj instanceof byte[]) {
            try {
                return w(AbstractC1333y.s((byte[]) obj));
            } catch (IOException e10) {
                throw new IllegalArgumentException("failed to construct tagged object from byte[]: " + e10.getMessage());
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    private static G w(AbstractC1333y abstractC1333y) {
        if (abstractC1333y instanceof G) {
            return (G) abstractC1333y;
        }
        throw new IllegalStateException("unexpected object: " + abstractC1333y.getClass().getName());
    }

    static AbstractC1333y x(int i10, int i11, C1303f c1303f) {
        return c1303f.f() == 1 ? new I0(3, i10, i11, c1303f.d(0)) : new I0(4, i10, i11, C0.a(c1303f));
    }

    static AbstractC1333y y(int i10, int i11, C1303f c1303f) {
        return c1303f.f() == 1 ? new Z(3, i10, i11, c1303f.d(0)) : new Z(4, i10, i11, S.a(c1303f));
    }

    AbstractC1333y B(boolean z10, L l10) {
        if (z10) {
            if (H()) {
                return l10.a(this.f9058d.g());
            }
            throw new IllegalStateException("object explicit - implicit expected.");
        }
        if (1 == this.f9055a) {
            throw new IllegalStateException("object explicit - implicit expected.");
        }
        AbstractC1333y abstractC1333yG = this.f9058d.g();
        int i10 = this.f9055a;
        if (i10 == 3) {
            return l10.c(I(abstractC1333yG));
        }
        if (i10 != 4) {
            return l10.a(abstractC1333yG);
        }
        return abstractC1333yG instanceof B ? l10.c((B) abstractC1333yG) : l10.d((C1320n0) abstractC1333yG);
    }

    public r C() {
        if (!H()) {
            throw new IllegalStateException("object implicit - explicit expected.");
        }
        InterfaceC1301e interfaceC1301e = this.f9058d;
        return interfaceC1301e instanceof r ? (r) interfaceC1301e : interfaceC1301e.g();
    }

    public int E() {
        return this.f9056b;
    }

    public int F() {
        return this.f9057c;
    }

    public boolean G(int i10) {
        return this.f9056b == i10;
    }

    public boolean H() {
        int i10 = this.f9055a;
        return i10 == 1 || i10 == 3;
    }

    abstract B I(AbstractC1333y abstractC1333y);

    @Override // Pf.L0
    public final AbstractC1333y e() {
        return this;
    }

    @Override // Pf.AbstractC1333y, Pf.r
    public int hashCode() {
        return (((this.f9056b * 7919) ^ this.f9057c) ^ (H() ? 15 : 240)) ^ this.f9058d.g().hashCode();
    }

    @Override // Pf.AbstractC1333y
    final boolean j(AbstractC1333y abstractC1333y) {
        if (!(abstractC1333y instanceof G)) {
            return false;
        }
        G g10 = (G) abstractC1333y;
        if (this.f9057c != g10.f9057c || this.f9056b != g10.f9056b) {
            return false;
        }
        if (this.f9055a != g10.f9055a && H() != g10.H()) {
            return false;
        }
        AbstractC1333y abstractC1333yG = this.f9058d.g();
        AbstractC1333y abstractC1333yG2 = g10.f9058d.g();
        if (abstractC1333yG == abstractC1333yG2) {
            return true;
        }
        if (H()) {
            return abstractC1333yG.j(abstractC1333yG2);
        }
        try {
            return Ug.a.b(getEncoded(), g10.getEncoded());
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // Pf.AbstractC1333y
    AbstractC1333y t() {
        return new u0(this.f9055a, this.f9056b, this.f9057c, this.f9058d);
    }

    public String toString() {
        return M.e(this.f9056b, this.f9057c) + this.f9058d;
    }

    @Override // Pf.AbstractC1333y
    AbstractC1333y v() {
        return new I0(this.f9055a, this.f9056b, this.f9057c, this.f9058d);
    }
}
