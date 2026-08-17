package p374ue;

import Be.d;
import Be.e;
import Be.f;
import Be.g;
import Be.i;
import Be.k;
import Be.p;
import Be.q;
import Be.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends i implements q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final x f55617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static r f55618g = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f55619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f55620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte f55621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f55622e;

    static class a extends Be.b {
        a() {
        }

        @Override // Be.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public x c(e eVar, g gVar) {
            return new x(eVar, gVar, null);
        }
    }

    public static final class b extends i.b implements q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f55623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f55624c = Collections.EMPTY_LIST;

        private b() {
            o();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b m() {
            return new b();
        }

        private void n() {
            if ((this.f55623b & 1) != 1) {
                this.f55624c = new ArrayList(this.f55624c);
                this.f55623b |= 1;
            }
        }

        private void o() {
        }

        @Override // Be.p.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public x build() {
            x xVarJ = j();
            if (xVarJ.isInitialized()) {
                return xVarJ;
            }
            throw Be.a.AbstractC0017a.c(xVarJ);
        }

        public x j() {
            x xVar = new x(this, (p374ue.a) null);
            if ((this.f55623b & 1) == 1) {
                this.f55624c = Collections.unmodifiableList(this.f55624c);
                this.f55623b &= -2;
            }
            xVar.f55620c = this.f55624c;
            return xVar;
        }

        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return m().e(j());
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // Be.p.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public b T0(e eVar, g gVar) throws Throwable {
            x xVar = null;
            try {
                try {
                    x xVar2 = (x) x.f55618g.c(eVar, gVar);
                    if (xVar2 != null) {
                        e(xVar2);
                    }
                    return this;
                } catch (k e10) {
                    x xVar3 = (x) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        xVar = xVar3;
                        if (xVar != null) {
                            e(xVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (xVar != null) {
                    e(xVar);
                }
                throw th;
            }
        }

        @Override // Be.i.b
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public b e(x xVar) {
            if (xVar == x.o()) {
                return this;
            }
            if (!xVar.f55620c.isEmpty()) {
                if (this.f55624c.isEmpty()) {
                    this.f55624c = xVar.f55620c;
                    this.f55623b &= -2;
                } else {
                    n();
                    this.f55624c.addAll(xVar.f55620c);
                }
            }
            f(d().c(xVar.f55619b));
            return this;
        }
    }

    static {
        x xVar = new x(true);
        f55617f = xVar;
        xVar.r();
    }

    private x(e eVar, g gVar) {
        this.f55621d = (byte) -1;
        this.f55622e = -1;
        r();
        d.b bVarP = d.p();
        f fVarI = f.I(bVarP, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iJ = eVar.J();
                    if (iJ != 0) {
                        if (iJ == 10) {
                            if (!z11) {
                                this.f55620c = new ArrayList();
                                z11 = true;
                            }
                            this.f55620c.add(eVar.t(w.f55587m, gVar));
                        } else if (!j(eVar, fVarI, gVar, iJ)) {
                        }
                    }
                    z10 = true;
                } catch (k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new k(e11.getMessage()).i(this);
                }
            } catch (Throwable th) {
                if (z11) {
                    this.f55620c = Collections.unmodifiableList(this.f55620c);
                }
                try {
                    fVarI.H();
                } catch (IOException unused) {
                } finally {
                    this.f55619b = bVarP.d();
                }
                g();
                throw th;
            }
        }
        if (z11) {
            this.f55620c = Collections.unmodifiableList(this.f55620c);
        }
        try {
            fVarI.H();
        } catch (IOException unused2) {
        } finally {
            this.f55619b = bVarP.d();
        }
        g();
    }

    /* synthetic */ x(e eVar, g gVar, p374ue.a aVar) {
        this(eVar, gVar);
    }

    private x(i.b bVar) {
        super(bVar);
        this.f55621d = (byte) -1;
        this.f55622e = -1;
        this.f55619b = bVar.d();
    }

    /* synthetic */ x(i.b bVar, p374ue.a aVar) {
        this(bVar);
    }

    private x(boolean z10) {
        this.f55621d = (byte) -1;
        this.f55622e = -1;
        this.f55619b = d.f710a;
    }

    public static x o() {
        return f55617f;
    }

    private void r() {
        this.f55620c = Collections.EMPTY_LIST;
    }

    public static b s() {
        return b.m();
    }

    public static b t(x xVar) {
        return s().e(xVar);
    }

    @Override // Be.p
    public void b(f fVar) throws IOException {
        getSerializedSize();
        for (int i10 = 0; i10 < this.f55620c.size(); i10++) {
            fVar.c0(1, (p) this.f55620c.get(i10));
        }
        fVar.h0(this.f55619b);
    }

    @Override // Be.p
    public int getSerializedSize() {
        int i10 = this.f55622e;
        if (i10 != -1) {
            return i10;
        }
        int iR = 0;
        for (int i11 = 0; i11 < this.f55620c.size(); i11++) {
            iR += f.r(1, (p) this.f55620c.get(i11));
        }
        int size = iR + this.f55619b.size();
        this.f55622e = size;
        return size;
    }

    @Override // Be.q
    public final boolean isInitialized() {
        byte b10 = this.f55621d;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f55621d = (byte) 1;
        return true;
    }

    public int p() {
        return this.f55620c.size();
    }

    public List q() {
        return this.f55620c;
    }

    @Override // Be.p
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return s();
    }

    @Override // Be.p
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        return t(this);
    }
}
