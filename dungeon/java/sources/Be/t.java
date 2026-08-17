package Be;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/* JADX INFO: loaded from: classes3.dex */
class t extends Be.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f776h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Be.d f778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Be.d f779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f782g;

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Stack f783a;

        private b() {
            this.f783a = new Stack();
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Be.d b(Be.d dVar, Be.d dVar2) {
            c(dVar);
            c(dVar2);
            Be.d tVar = (Be.d) this.f783a.pop();
            while (!this.f783a.isEmpty()) {
                tVar = new t((Be.d) this.f783a.pop(), tVar, null);
            }
            return tVar;
        }

        private void c(Be.d dVar) {
            if (dVar.n()) {
                e(dVar);
                return;
            }
            if (dVar instanceof t) {
                t tVar = (t) dVar;
                c(tVar.f778c);
                c(tVar.f779d);
            } else {
                String strValueOf = String.valueOf(dVar.getClass());
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 49);
                sb2.append("Has a new type of ByteString been created? Found ");
                sb2.append(strValueOf);
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        private int d(int i10) {
            int iBinarySearch = Arrays.binarySearch(t.f776h, i10);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        private void e(Be.d dVar) {
            int iD = d(dVar.size());
            int i10 = t.f776h[iD + 1];
            if (this.f783a.isEmpty() || ((Be.d) this.f783a.peek()).size() >= i10) {
                this.f783a.push(dVar);
                return;
            }
            int i11 = t.f776h[iD];
            Be.d tVar = (Be.d) this.f783a.pop();
            while (!this.f783a.isEmpty() && ((Be.d) this.f783a.peek()).size() < i11) {
                tVar = new t((Be.d) this.f783a.pop(), tVar, null);
            }
            t tVar2 = new t(tVar, dVar, null);
            while (!this.f783a.isEmpty()) {
                if (((Be.d) this.f783a.peek()).size() >= t.f776h[d(tVar2.size()) + 1]) {
                    break;
                } else {
                    tVar2 = new t((Be.d) this.f783a.pop(), tVar2, null);
                }
            }
            this.f783a.push(tVar2);
        }
    }

    private static class c implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Stack f784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private o f785b;

        private c(Be.d dVar) {
            this.f784a = new Stack();
            this.f785b = a(dVar);
        }

        /* synthetic */ c(Be.d dVar, a aVar) {
            this(dVar);
        }

        private o a(Be.d dVar) {
            while (dVar instanceof t) {
                t tVar = (t) dVar;
                this.f784a.push(tVar);
                dVar = tVar.f778c;
            }
            return (o) dVar;
        }

        private o b() {
            while (!this.f784a.isEmpty()) {
                o oVarA = a(((t) this.f784a.pop()).f779d);
                if (!oVarA.isEmpty()) {
                    return oVarA;
                }
            }
            return null;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public o next() {
            o oVar = this.f785b;
            if (oVar == null) {
                throw new NoSuchElementException();
            }
            this.f785b = b();
            return oVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f785b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private class d implements Be.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Be.d.a f787b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f788c;

        private d() {
            c cVar = new c(t.this, null);
            this.f786a = cVar;
            this.f787b = cVar.next().iterator();
            this.f788c = t.this.size();
        }

        /* synthetic */ d(t tVar, a aVar) {
            this();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(e());
        }

        @Override // Be.d.a
        public byte e() {
            if (!this.f787b.hasNext()) {
                this.f787b = this.f786a.next().iterator();
            }
            this.f788c--;
            return this.f787b.e();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f788c > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        int i11 = 1;
        while (i10 > 0) {
            arrayList.add(Integer.valueOf(i10));
            int i12 = i11 + i10;
            i11 = i10;
            i10 = i12;
        }
        arrayList.add(Integer.MAX_VALUE);
        f776h = new int[arrayList.size()];
        int i13 = 0;
        while (true) {
            int[] iArr = f776h;
            if (i13 >= iArr.length) {
                return;
            }
            iArr[i13] = ((Integer) arrayList.get(i13)).intValue();
            i13++;
        }
    }

    private t(Be.d dVar, Be.d dVar2) {
        this.f782g = 0;
        this.f778c = dVar;
        this.f779d = dVar2;
        int size = dVar.size();
        this.f780e = size;
        this.f777b = size + dVar2.size();
        this.f781f = Math.max(dVar.l(), dVar2.l()) + 1;
    }

    /* synthetic */ t(Be.d dVar, Be.d dVar2, a aVar) {
        this(dVar, dVar2);
    }

    static Be.d E(Be.d dVar, Be.d dVar2) {
        t tVar = dVar instanceof t ? (t) dVar : null;
        if (dVar2.size() == 0) {
            return dVar;
        }
        if (dVar.size() == 0) {
            return dVar2;
        }
        int size = dVar.size() + dVar2.size();
        if (size < 128) {
            return F(dVar, dVar2);
        }
        if (tVar != null && tVar.f779d.size() + dVar2.size() < 128) {
            return new t(tVar.f778c, F(tVar.f779d, dVar2));
        }
        if (tVar == null || tVar.f778c.l() <= tVar.f779d.l() || tVar.l() <= dVar2.l()) {
            return size >= f776h[Math.max(dVar.l(), dVar2.l()) + 1] ? new t(dVar, dVar2) : new b(null).b(dVar, dVar2);
        }
        return new t(tVar.f778c, new t(tVar.f779d, dVar2));
    }

    private static o F(Be.d dVar, Be.d dVar2) {
        int size = dVar.size();
        int size2 = dVar2.size();
        byte[] bArr = new byte[size + size2];
        dVar.j(bArr, 0, 0, size);
        dVar2.j(bArr, 0, size, size2);
        return new o(bArr);
    }

    private boolean G(Be.d dVar) {
        c cVar = new c(this, null);
        o oVar = (o) cVar.next();
        c cVar2 = new c(dVar, null);
        o oVar2 = (o) cVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size = oVar.size() - i10;
            int size2 = oVar2.size() - i11;
            int iMin = Math.min(size, size2);
            if (!(i10 == 0 ? oVar.B(oVar2, i11, iMin) : oVar2.B(oVar, i10, iMin))) {
                return false;
            }
            i12 += iMin;
            int i13 = this.f777b;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                oVar = (o) cVar.next();
                i10 = 0;
            } else {
                i10 += iMin;
            }
            if (iMin == size2) {
                oVar2 = (o) cVar2.next();
                i11 = 0;
            } else {
                i11 += iMin;
            }
        }
    }

    @Override // Be.d
    void A(OutputStream outputStream, int i10, int i11) {
        int i12 = i10 + i11;
        int i13 = this.f780e;
        if (i12 <= i13) {
            this.f778c.A(outputStream, i10, i11);
        } else {
            if (i10 >= i13) {
                this.f779d.A(outputStream, i10 - i13, i11);
                return;
            }
            int i14 = i13 - i10;
            this.f778c.A(outputStream, i10, i14);
            this.f779d.A(outputStream, 0, i11 - i14);
        }
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public Be.d.a iterator() {
        return new d(this, null);
    }

    public boolean equals(Object obj) {
        int iT;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Be.d)) {
            return false;
        }
        Be.d dVar = (Be.d) obj;
        if (this.f777b != dVar.size()) {
            return false;
        }
        if (this.f777b == 0) {
            return true;
        }
        if (this.f782g == 0 || (iT = dVar.t()) == 0 || this.f782g == iT) {
            return G(dVar);
        }
        return false;
    }

    public int hashCode() {
        int iQ = this.f782g;
        if (iQ == 0) {
            int i10 = this.f777b;
            iQ = q(i10, 0, i10);
            if (iQ == 0) {
                iQ = 1;
            }
            this.f782g = iQ;
        }
        return iQ;
    }

    @Override // Be.d
    protected void k(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.f780e;
        if (i13 <= i14) {
            this.f778c.k(bArr, i10, i11, i12);
        } else {
            if (i10 >= i14) {
                this.f779d.k(bArr, i10 - i14, i11, i12);
                return;
            }
            int i15 = i14 - i10;
            this.f778c.k(bArr, i10, i11, i15);
            this.f779d.k(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    @Override // Be.d
    protected int l() {
        return this.f781f;
    }

    @Override // Be.d
    protected boolean n() {
        return this.f777b >= f776h[this.f781f];
    }

    @Override // Be.d
    public boolean o() {
        int iS = this.f778c.s(0, 0, this.f780e);
        Be.d dVar = this.f779d;
        return dVar.s(iS, 0, dVar.size()) == 0;
    }

    @Override // Be.d
    protected int q(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f780e;
        if (i13 <= i14) {
            return this.f778c.q(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f779d.q(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f779d.q(this.f778c.q(i10, i11, i15), 0, i12 - i15);
    }

    @Override // Be.d
    protected int s(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f780e;
        if (i13 <= i14) {
            return this.f778c.s(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f779d.s(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f779d.s(this.f778c.s(i10, i11, i15), 0, i12 - i15);
    }

    @Override // Be.d
    public int size() {
        return this.f777b;
    }

    @Override // Be.d
    protected int t() {
        return this.f782g;
    }

    @Override // Be.d
    public String w(String str) {
        return new String(v(), str);
    }
}
