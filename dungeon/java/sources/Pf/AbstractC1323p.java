package Pf;

/* JADX INFO: renamed from: Pf.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1323p extends AbstractC1333y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final L f9154a = new a(AbstractC1323p.class, 5);

    /* JADX INFO: renamed from: Pf.p$a */
    static class a extends L {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // Pf.L
        AbstractC1333y d(C1320n0 c1320n0) {
            return AbstractC1323p.w(c1320n0.A());
        }
    }

    AbstractC1323p() {
    }

    static AbstractC1323p w(byte[] bArr) {
        if (bArr.length == 0) {
            return C1316l0.f9143b;
        }
        throw new IllegalStateException("malformed NULL encoding encountered");
    }

    @Override // Pf.AbstractC1333y, Pf.r
    public int hashCode() {
        return -1;
    }

    @Override // Pf.AbstractC1333y
    boolean j(AbstractC1333y abstractC1333y) {
        return abstractC1333y instanceof AbstractC1323p;
    }

    public String toString() {
        return "NULL";
    }
}
