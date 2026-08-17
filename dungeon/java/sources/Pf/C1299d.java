package Pf;

import java.io.IOException;

/* JADX INFO: renamed from: Pf.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1299d extends AbstractC1333y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final L f9117b = new a(C1299d.class, 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1299d f9118c = new C1299d((byte) 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1299d f9119d = new C1299d((byte) -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte f9120a;

    /* JADX INFO: renamed from: Pf.d$a */
    static class a extends L {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // Pf.L
        AbstractC1333y d(C1320n0 c1320n0) {
            return C1299d.w(c1320n0.A());
        }
    }

    private C1299d(byte b10) {
        this.f9120a = b10;
    }

    static C1299d w(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
        }
        byte b10 = bArr[0];
        if (b10 != -1) {
            return b10 != 0 ? new C1299d(b10) : f9118c;
        }
        return f9119d;
    }

    @Override // Pf.AbstractC1333y, Pf.r
    public int hashCode() {
        return x() ? 1 : 0;
    }

    @Override // Pf.AbstractC1333y
    boolean j(AbstractC1333y abstractC1333y) {
        return (abstractC1333y instanceof C1299d) && x() == ((C1299d) abstractC1333y).x();
    }

    @Override // Pf.AbstractC1333y
    void k(C1331w c1331w, boolean z10) throws IOException {
        c1331w.m(z10, 1, this.f9120a);
    }

    @Override // Pf.AbstractC1333y
    boolean l() {
        return false;
    }

    @Override // Pf.AbstractC1333y
    int p(boolean z10) {
        return C1331w.g(z10, 1);
    }

    @Override // Pf.AbstractC1333y
    AbstractC1333y t() {
        return x() ? f9119d : f9118c;
    }

    public String toString() {
        return x() ? "TRUE" : "FALSE";
    }

    public boolean x() {
        return this.f9120a != 0;
    }
}
