package Pf;

import java.io.IOException;

/* JADX INFO: renamed from: Pf.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1327s extends AbstractC1333y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final L f9158b = new a(C1327s.class, 7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1315l f9159a;

    /* JADX INFO: renamed from: Pf.s$a */
    static class a extends L {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // Pf.L
        AbstractC1333y c(B b10) {
            return new C1327s((AbstractC1315l) AbstractC1315l.f9141b.c(b10));
        }

        @Override // Pf.L
        AbstractC1333y d(C1320n0 c1320n0) {
            return new C1327s((AbstractC1315l) AbstractC1315l.f9141b.d(c1320n0));
        }
    }

    public C1327s(AbstractC1315l abstractC1315l) {
        if (abstractC1315l == null) {
            throw new NullPointerException("'baseGraphicString' cannot be null");
        }
        this.f9159a = abstractC1315l;
    }

    static C1327s w(byte[] bArr) {
        return new C1327s(AbstractC1315l.w(bArr));
    }

    @Override // Pf.AbstractC1333y, Pf.r
    public int hashCode() {
        return ~this.f9159a.hashCode();
    }

    @Override // Pf.AbstractC1333y
    boolean j(AbstractC1333y abstractC1333y) {
        if (abstractC1333y instanceof C1327s) {
            return this.f9159a.j(((C1327s) abstractC1333y).f9159a);
        }
        return false;
    }

    @Override // Pf.AbstractC1333y
    void k(C1331w c1331w, boolean z10) throws IOException {
        c1331w.s(z10, 7);
        this.f9159a.k(c1331w, false);
    }

    @Override // Pf.AbstractC1333y
    boolean l() {
        return false;
    }

    @Override // Pf.AbstractC1333y
    int p(boolean z10) {
        return this.f9159a.p(z10);
    }

    @Override // Pf.AbstractC1333y
    AbstractC1333y t() {
        AbstractC1315l abstractC1315l = (AbstractC1315l) this.f9159a.t();
        return abstractC1315l == this.f9159a ? this : new C1327s(abstractC1315l);
    }

    @Override // Pf.AbstractC1333y
    AbstractC1333y v() {
        AbstractC1315l abstractC1315l = (AbstractC1315l) this.f9159a.v();
        return abstractC1315l == this.f9159a ? this : new C1327s(abstractC1315l);
    }
}
