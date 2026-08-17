package Pf;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: Pf.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1333y extends r {
    AbstractC1333y() {
    }

    public static AbstractC1333y s(byte[] bArr) throws IOException {
        C1319n c1319n = new C1319n(bArr);
        try {
            AbstractC1333y abstractC1333yI = c1319n.i();
            if (c1319n.available() == 0) {
                return abstractC1333yI;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    @Override // Pf.r
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC1301e) && j(((InterfaceC1301e) obj).g());
    }

    @Override // Pf.r, Pf.InterfaceC1301e
    public final AbstractC1333y g() {
        return this;
    }

    @Override // Pf.r
    public abstract int hashCode();

    abstract boolean j(AbstractC1333y abstractC1333y);

    abstract void k(C1331w c1331w, boolean z10);

    abstract boolean l();

    public void n(OutputStream outputStream) {
        C1331w c1331wA = C1331w.a(outputStream);
        c1331wA.u(this, true);
        c1331wA.c();
    }

    public void o(OutputStream outputStream, String str) {
        C1331w c1331wB = C1331w.b(outputStream, str);
        c1331wB.u(this, true);
        c1331wB.c();
    }

    abstract int p(boolean z10);

    public final boolean q(AbstractC1333y abstractC1333y) {
        return this == abstractC1333y || j(abstractC1333y);
    }

    AbstractC1333y t() {
        return this;
    }

    AbstractC1333y v() {
        return this;
    }
}
