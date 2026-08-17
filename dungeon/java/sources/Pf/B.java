package Pf;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class B extends AbstractC1333y implements Iterable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final L f9037b = new a(B.class, 16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    InterfaceC1301e[] f9038a;

    static class a extends L {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // Pf.L
        AbstractC1333y c(B b10) {
            return b10;
        }
    }

    class b implements Enumeration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f9039a = 0;

        b() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f9039a < B.this.f9038a.length;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            int i10 = this.f9039a;
            InterfaceC1301e[] interfaceC1301eArr = B.this.f9038a;
            if (i10 >= interfaceC1301eArr.length) {
                throw new NoSuchElementException();
            }
            this.f9039a = i10 + 1;
            return interfaceC1301eArr[i10];
        }
    }

    protected B() {
        this.f9038a = C1303f.f9121d;
    }

    protected B(InterfaceC1301e interfaceC1301e) {
        if (interfaceC1301e == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        this.f9038a = new InterfaceC1301e[]{interfaceC1301e};
    }

    protected B(C1303f c1303f) {
        if (c1303f == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        this.f9038a = c1303f.g();
    }

    B(InterfaceC1301e[] interfaceC1301eArr, boolean z10) {
        this.f9038a = z10 ? C1303f.b(interfaceC1301eArr) : interfaceC1301eArr;
    }

    public static B y(Object obj) {
        if (obj == null || (obj instanceof B)) {
            return (B) obj;
        }
        if (obj instanceof InterfaceC1301e) {
            AbstractC1333y abstractC1333yG = ((InterfaceC1301e) obj).g();
            if (abstractC1333yG instanceof B) {
                return (B) abstractC1333yG;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (B) f9037b.b((byte[]) obj);
            } catch (IOException e10) {
                throw new IllegalArgumentException("failed to construct sequence from byte[]: " + e10.getMessage());
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    public InterfaceC1301e A(int i10) {
        return this.f9038a[i10];
    }

    public Enumeration B() {
        return new b();
    }

    abstract AbstractC1295b C();

    abstract AbstractC1309i D();

    abstract AbstractC1329u E();

    abstract C F();

    InterfaceC1301e[] G() {
        return this.f9038a;
    }

    @Override // Pf.AbstractC1333y, Pf.r
    public int hashCode() {
        int length = this.f9038a.length;
        int iHashCode = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return iHashCode;
            }
            iHashCode = (iHashCode * 257) ^ this.f9038a[length].g().hashCode();
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new Ug.a.C0190a(this.f9038a);
    }

    @Override // Pf.AbstractC1333y
    boolean j(AbstractC1333y abstractC1333y) {
        if (!(abstractC1333y instanceof B)) {
            return false;
        }
        B b10 = (B) abstractC1333y;
        int size = size();
        if (b10.size() != size) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC1333y abstractC1333yG = this.f9038a[i10].g();
            AbstractC1333y abstractC1333yG2 = b10.f9038a[i10].g();
            if (abstractC1333yG != abstractC1333yG2 && !abstractC1333yG.j(abstractC1333yG2)) {
                return false;
            }
        }
        return true;
    }

    @Override // Pf.AbstractC1333y
    boolean l() {
        return true;
    }

    public int size() {
        return this.f9038a.length;
    }

    @Override // Pf.AbstractC1333y
    AbstractC1333y t() {
        return new r0(this.f9038a, false);
    }

    public String toString() {
        int size = size();
        if (size == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        int i10 = 0;
        while (true) {
            stringBuffer.append(this.f9038a[i10]);
            i10++;
            if (i10 >= size) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    @Override // Pf.AbstractC1333y
    AbstractC1333y v() {
        return new E0(this.f9038a, false);
    }

    AbstractC1295b[] w() {
        int size = size();
        AbstractC1295b[] abstractC1295bArr = new AbstractC1295b[size];
        for (int i10 = 0; i10 < size; i10++) {
            abstractC1295bArr[i10] = AbstractC1295b.A(this.f9038a[i10]);
        }
        return abstractC1295bArr;
    }

    AbstractC1329u[] x() {
        int size = size();
        AbstractC1329u[] abstractC1329uArr = new AbstractC1329u[size];
        for (int i10 = 0; i10 < size; i10++) {
            abstractC1329uArr[i10] = AbstractC1329u.y(this.f9038a[i10]);
        }
        return abstractC1329uArr;
    }
}
