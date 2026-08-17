package Tf;

import Pf.AbstractC1295b;
import Pf.AbstractC1333y;
import Pf.B;
import Pf.C1302e0;
import Pf.C1303f;
import Pf.InterfaceC1301e;
import Pf.r;
import Pf.r0;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class b extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f12591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AbstractC1295b f12592b;

    public b(B b10) {
        if (b10.size() == 2) {
            Enumeration enumerationB = b10.B();
            this.f12591a = a.k(enumerationB.nextElement());
            this.f12592b = AbstractC1295b.A(enumerationB.nextElement());
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + b10.size());
        }
    }

    public b(a aVar, InterfaceC1301e interfaceC1301e) {
        this.f12592b = new C1302e0(interfaceC1301e);
        this.f12591a = aVar;
    }

    public b(a aVar, byte[] bArr) {
        this.f12592b = new C1302e0(bArr);
        this.f12591a = aVar;
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

    @Override // Pf.r, Pf.InterfaceC1301e
    public AbstractC1333y g() {
        C1303f c1303f = new C1303f(2);
        c1303f.a(this.f12591a);
        c1303f.a(this.f12592b);
        return new r0(c1303f);
    }

    public a j() {
        return this.f12591a;
    }

    public AbstractC1295b l() {
        return this.f12592b;
    }

    public AbstractC1333y n() {
        return AbstractC1333y.s(this.f12592b.B());
    }
}
