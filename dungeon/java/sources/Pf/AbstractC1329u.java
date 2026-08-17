package Pf;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: Pf.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1329u extends AbstractC1333y implements InterfaceC1330v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final L f9167b = new a(AbstractC1329u.class, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final byte[] f9168c = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    byte[] f9169a;

    /* JADX INFO: renamed from: Pf.u$a */
    static class a extends L {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // Pf.L
        AbstractC1333y c(B b10) {
            return b10.E();
        }

        @Override // Pf.L
        AbstractC1333y d(C1320n0 c1320n0) {
            return c1320n0;
        }
    }

    public AbstractC1329u(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        this.f9169a = bArr;
    }

    static AbstractC1329u w(byte[] bArr) {
        return new C1320n0(bArr);
    }

    public static AbstractC1329u x(G g10, boolean z10) {
        return (AbstractC1329u) f9167b.e(g10, z10);
    }

    public static AbstractC1329u y(Object obj) {
        if (obj == null || (obj instanceof AbstractC1329u)) {
            return (AbstractC1329u) obj;
        }
        if (obj instanceof InterfaceC1301e) {
            AbstractC1333y abstractC1333yG = ((InterfaceC1301e) obj).g();
            if (abstractC1333yG instanceof AbstractC1329u) {
                return (AbstractC1329u) abstractC1333yG;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (AbstractC1329u) f9167b.b((byte[]) obj);
            } catch (IOException e10) {
                throw new IllegalArgumentException("failed to construct OCTET STRING from byte[]: " + e10.getMessage());
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public byte[] A() {
        return this.f9169a;
    }

    @Override // Pf.InterfaceC1330v
    public InputStream a() {
        return new ByteArrayInputStream(this.f9169a);
    }

    @Override // Pf.L0
    public AbstractC1333y e() {
        return g();
    }

    @Override // Pf.AbstractC1333y, Pf.r
    public int hashCode() {
        return Ug.a.n(A());
    }

    @Override // Pf.AbstractC1333y
    boolean j(AbstractC1333y abstractC1333y) {
        if (abstractC1333y instanceof AbstractC1329u) {
            return Ug.a.b(this.f9169a, ((AbstractC1329u) abstractC1333y).f9169a);
        }
        return false;
    }

    @Override // Pf.AbstractC1333y
    AbstractC1333y t() {
        return new C1320n0(this.f9169a);
    }

    public String toString() {
        return "#" + Ug.h.b(Vg.c.b(this.f9169a));
    }

    @Override // Pf.AbstractC1333y
    AbstractC1333y v() {
        return new C1320n0(this.f9169a);
    }
}
