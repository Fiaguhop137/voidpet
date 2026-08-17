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
public final class u extends i implements q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final u f55556h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static r f55557i = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f55558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f55559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f55560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f55561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte f55562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f55563g;

    static class a extends Be.b {
        a() {
        }

        @Override // Be.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public u c(e eVar, g gVar) {
            return new u(eVar, gVar, null);
        }
    }

    public static final class b extends i.b implements q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f55564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f55565c = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f55566d = -1;

        private b() {
            o();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b m() {
            return new b();
        }

        private void n() {
            if ((this.f55564b & 1) != 1) {
                this.f55565c = new ArrayList(this.f55565c);
                this.f55564b |= 1;
            }
        }

        private void o() {
        }

        @Override // Be.p.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public u build() {
            u uVarJ = j();
            if (uVarJ.isInitialized()) {
                return uVarJ;
            }
            throw Be.a.AbstractC0017a.c(uVarJ);
        }

        public u j() {
            u uVar = new u(this, (p374ue.a) null);
            int i10 = this.f55564b;
            if ((i10 & 1) == 1) {
                this.f55565c = Collections.unmodifiableList(this.f55565c);
                this.f55564b &= -2;
            }
            uVar.f55560d = this.f55565c;
            int i11 = (i10 & 2) != 2 ? 0 : 1;
            uVar.f55561e = this.f55566d;
            uVar.f55559c = i11;
            return uVar;
        }

        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return m().e(j());
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // Be.p.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public b T0(e eVar, g gVar) throws Throwable {
            u uVar = null;
            try {
                try {
                    u uVar2 = (u) u.f55557i.c(eVar, gVar);
                    if (uVar2 != null) {
                        e(uVar2);
                    }
                    return this;
                } catch (k e10) {
                    u uVar3 = (u) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        uVar = uVar3;
                        if (uVar != null) {
                            e(uVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (uVar != null) {
                    e(uVar);
                }
                throw th;
            }
        }

        @Override // Be.i.b
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public b e(u uVar) {
            if (uVar == u.q()) {
                return this;
            }
            if (!uVar.f55560d.isEmpty()) {
                if (this.f55565c.isEmpty()) {
                    this.f55565c = uVar.f55560d;
                    this.f55564b &= -2;
                } else {
                    n();
                    this.f55565c.addAll(uVar.f55560d);
                }
            }
            if (uVar.v()) {
                r(uVar.r());
            }
            f(d().c(uVar.f55558b));
            return this;
        }

        public b r(int i10) {
            this.f55564b |= 2;
            this.f55566d = i10;
            return this;
        }
    }

    static {
        u uVar = new u(true);
        f55556h = uVar;
        uVar.w();
    }

    private u(e eVar, g gVar) {
        this.f55562f = (byte) -1;
        this.f55563g = -1;
        w();
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
                                this.f55560d = new ArrayList();
                                z11 = true;
                            }
                            this.f55560d.add(eVar.t(r.f55449v, gVar));
                        } else if (iJ == 16) {
                            this.f55559c |= 1;
                            this.f55561e = eVar.r();
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
                    this.f55560d = Collections.unmodifiableList(this.f55560d);
                }
                try {
                    fVarI.H();
                } catch (IOException unused) {
                } finally {
                    this.f55558b = bVarP.d();
                }
                g();
                throw th;
            }
        }
        if (z11) {
            this.f55560d = Collections.unmodifiableList(this.f55560d);
        }
        try {
            fVarI.H();
        } catch (IOException unused2) {
        } finally {
            this.f55558b = bVarP.d();
        }
        g();
    }

    /* synthetic */ u(e eVar, g gVar, p374ue.a aVar) {
        this(eVar, gVar);
    }

    private u(i.b bVar) {
        super(bVar);
        this.f55562f = (byte) -1;
        this.f55563g = -1;
        this.f55558b = bVar.d();
    }

    /* synthetic */ u(i.b bVar, p374ue.a aVar) {
        this(bVar);
    }

    private u(boolean z10) {
        this.f55562f = (byte) -1;
        this.f55563g = -1;
        this.f55558b = d.f710a;
    }

    public static u q() {
        return f55556h;
    }

    private void w() {
        this.f55560d = Collections.EMPTY_LIST;
        this.f55561e = -1;
    }

    public static b x() {
        return b.m();
    }

    public static b y(u uVar) {
        return x().e(uVar);
    }

    @Override // Be.p
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        return y(this);
    }

    @Override // Be.p
    public void b(f fVar) throws IOException {
        getSerializedSize();
        for (int i10 = 0; i10 < this.f55560d.size(); i10++) {
            fVar.c0(1, (p) this.f55560d.get(i10));
        }
        if ((this.f55559c & 1) == 1) {
            fVar.Z(2, this.f55561e);
        }
        fVar.h0(this.f55558b);
    }

    @Override // Be.p
    public int getSerializedSize() {
        int i10 = this.f55563g;
        if (i10 != -1) {
            return i10;
        }
        int iO = 0;
        for (int i11 = 0; i11 < this.f55560d.size(); i11++) {
            iO += f.r(1, (p) this.f55560d.get(i11));
        }
        if ((this.f55559c & 1) == 1) {
            iO += f.o(2, this.f55561e);
        }
        int size = iO + this.f55558b.size();
        this.f55563g = size;
        return size;
    }

    @Override // Be.q
    public final boolean isInitialized() {
        byte b10 = this.f55562f;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < t(); i10++) {
            if (!s(i10).isInitialized()) {
                this.f55562f = (byte) 0;
                return false;
            }
        }
        this.f55562f = (byte) 1;
        return true;
    }

    public int r() {
        return this.f55561e;
    }

    public r s(int i10) {
        return (r) this.f55560d.get(i10);
    }

    public int t() {
        return this.f55560d.size();
    }

    public List u() {
        return this.f55560d;
    }

    public boolean v() {
        return (this.f55559c & 1) == 1;
    }

    @Override // Be.p
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return x();
    }
}
