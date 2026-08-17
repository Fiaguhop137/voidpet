package Sf;

import Pf.AbstractC1295b;
import Pf.AbstractC1329u;
import Pf.AbstractC1333y;
import Pf.B;
import Pf.C;
import Pf.C1302e0;
import Pf.C1303f;
import Pf.C1320n0;
import Pf.C1321o;
import Pf.G;
import Pf.InterfaceC1301e;
import Pf.r;
import Pf.r0;
import Pf.u0;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class b extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C1321o f11804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Tf.a f11805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AbstractC1329u f11806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C f11807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AbstractC1295b f11808e;

    private b(B b10) {
        Enumeration enumerationB = b10.B();
        C1321o c1321oY = C1321o.y(enumerationB.nextElement());
        this.f11804a = c1321oY;
        int iO = o(c1321oY);
        this.f11805b = Tf.a.k(enumerationB.nextElement());
        this.f11806c = AbstractC1329u.y(enumerationB.nextElement());
        int i10 = -1;
        while (enumerationB.hasMoreElements()) {
            G g10 = (G) enumerationB.nextElement();
            int iF = g10.F();
            if (iF <= i10) {
                throw new IllegalArgumentException("invalid optional field in private key info");
            }
            if (iF == 0) {
                this.f11807d = C.x(g10, false);
            } else {
                if (iF != 1) {
                    throw new IllegalArgumentException("unknown optional field in private key info");
                }
                if (iO < 1) {
                    throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                }
                this.f11808e = AbstractC1295b.y(g10, false);
            }
            i10 = iF;
        }
    }

    public b(Tf.a aVar, InterfaceC1301e interfaceC1301e) {
        this(aVar, interfaceC1301e, null, null);
    }

    public b(Tf.a aVar, InterfaceC1301e interfaceC1301e, C c10) {
        this(aVar, interfaceC1301e, c10, null);
    }

    public b(Tf.a aVar, InterfaceC1301e interfaceC1301e, C c10, byte[] bArr) {
        this.f11804a = new C1321o(bArr != null ? Ug.b.f13699b : Ug.b.f13698a);
        this.f11805b = aVar;
        this.f11806c = new C1320n0(interfaceC1301e);
        this.f11807d = c10;
        this.f11808e = bArr == null ? null : new C1302e0(bArr);
    }

    public static b k(Object obj) {
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj != null) {
            return new b(B.y(obj));
        }
        return null;
    }

    private static int o(C1321o c1321o) {
        int iD = c1321o.D();
        if (iD < 0 || iD > 1) {
            throw new IllegalArgumentException("invalid version for private key info");
        }
        return iD;
    }

    @Override // Pf.r, Pf.InterfaceC1301e
    public AbstractC1333y g() {
        C1303f c1303f = new C1303f(5);
        c1303f.a(this.f11804a);
        c1303f.a(this.f11805b);
        c1303f.a(this.f11806c);
        C c10 = this.f11807d;
        if (c10 != null) {
            c1303f.a(new u0(false, 0, c10));
        }
        AbstractC1295b abstractC1295b = this.f11808e;
        if (abstractC1295b != null) {
            c1303f.a(new u0(false, 1, abstractC1295b));
        }
        return new r0(c1303f);
    }

    public C j() {
        return this.f11807d;
    }

    public Tf.a l() {
        return this.f11805b;
    }

    public AbstractC1295b n() {
        return this.f11808e;
    }

    public InterfaceC1301e p() {
        return AbstractC1333y.s(this.f11806c.A());
    }
}
