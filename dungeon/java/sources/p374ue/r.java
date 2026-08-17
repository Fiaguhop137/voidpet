package p374ue;

import Be.d;
import Be.e;
import Be.f;
import Be.g;
import Be.i;
import Be.j;
import Be.k;
import Be.p;
import Be.q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends i.d implements q {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final r f55448u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static Be.r f55449v = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f55450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f55451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f55452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f55453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f55454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private r f55455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f55456i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f55457j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f55458k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f55459l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f55460m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private r f55461n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f55462o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private r f55463p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f55464q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f55465r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private byte f55466s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f55467t;

    static class a extends Be.b {
        a() {
        }

        @Override // Be.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public r c(e eVar, g gVar) {
            return new r(eVar, gVar, null);
        }
    }

    public static final class b extends i implements q {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final b f55468i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static Be.r f55469j = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f55470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f55471c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f55472d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private r f55473e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f55474f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte f55475g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f55476h;

        static class a extends Be.b {
            a() {
            }

            @Override // Be.r
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public b c(e eVar, g gVar) {
                return new b(eVar, gVar, null);
            }
        }

        /* JADX INFO: renamed from: ue.r$b$b, reason: collision with other inner class name */
        public static final class C0700b extends i.b implements q {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f55477b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private c f55478c = c.INV;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private r f55479d = r.R();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f55480e;

            private C0700b() {
                n();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static C0700b m() {
                return new C0700b();
            }

            private void n() {
            }

            @Override // Be.p.a
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public b build() {
                b bVarJ = j();
                if (bVarJ.isInitialized()) {
                    return bVarJ;
                }
                throw Be.a.AbstractC0017a.c(bVarJ);
            }

            public b j() {
                b bVar = new b(this, (p374ue.a) null);
                int i10 = this.f55477b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                bVar.f55472d = this.f55478c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                bVar.f55473e = this.f55479d;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                bVar.f55474f = this.f55480e;
                bVar.f55471c = i11;
                return bVar;
            }

            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public C0700b clone() {
                return m().e(j());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // Be.p.a
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public C0700b T0(e eVar, g gVar) throws Throwable {
                b bVar = null;
                try {
                    try {
                        b bVar2 = (b) b.f55469j.c(eVar, gVar);
                        if (bVar2 != null) {
                            e(bVar2);
                        }
                        return this;
                    } catch (k e10) {
                        b bVar3 = (b) e10.a();
                        try {
                            throw e10;
                        } catch (Throwable th) {
                            th = th;
                            bVar = bVar3;
                            if (bVar != null) {
                                e(bVar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (bVar != null) {
                        e(bVar);
                    }
                    throw th;
                }
            }

            @Override // Be.i.b
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public C0700b e(b bVar) {
                if (bVar == b.q()) {
                    return this;
                }
                if (bVar.u()) {
                    r(bVar.r());
                }
                if (bVar.v()) {
                    q(bVar.s());
                }
                if (bVar.w()) {
                    s(bVar.t());
                }
                f(d().c(bVar.f55470b));
                return this;
            }

            public C0700b q(r rVar) {
                if ((this.f55477b & 2) != 2 || this.f55479d == r.R()) {
                    this.f55479d = rVar;
                } else {
                    this.f55479d = r.s0(this.f55479d).e(rVar).o();
                }
                this.f55477b |= 2;
                return this;
            }

            public C0700b r(c cVar) {
                cVar.getClass();
                this.f55477b |= 1;
                this.f55478c = cVar;
                return this;
            }

            public C0700b s(int i10) {
                this.f55477b |= 4;
                this.f55480e = i10;
                return this;
            }
        }

        public enum c implements j.a {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2),
            STAR(3, 3);


            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static j.b f55485f = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f55487a;

            static class a implements j.b {
                a() {
                }

                @Override // Be.j.b
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public c a(int i10) {
                    return c.e(i10);
                }
            }

            c(int i10, int i11) {
                this.f55487a = i11;
            }

            public static c e(int i10) {
                if (i10 == 0) {
                    return IN;
                }
                if (i10 == 1) {
                    return OUT;
                }
                if (i10 == 2) {
                    return INV;
                }
                if (i10 != 3) {
                    return null;
                }
                return STAR;
            }

            @Override // Be.j.a
            public final int getNumber() {
                return this.f55487a;
            }
        }

        static {
            b bVar = new b(true);
            f55468i = bVar;
            bVar.x();
        }

        private b(e eVar, g gVar) {
            this.f55475g = (byte) -1;
            this.f55476h = -1;
            x();
            d.b bVarP = d.p();
            f fVarI = f.I(bVarP, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        try {
                            int iJ = eVar.J();
                            if (iJ != 0) {
                                if (iJ == 8) {
                                    int iM = eVar.m();
                                    c cVarE = c.e(iM);
                                    if (cVarE == null) {
                                        fVarI.n0(iJ);
                                        fVarI.n0(iM);
                                    } else {
                                        this.f55471c |= 1;
                                        this.f55472d = cVarE;
                                    }
                                } else if (iJ == 18) {
                                    c builder = (this.f55471c & 2) == 2 ? this.f55473e.toBuilder() : null;
                                    r rVar = (r) eVar.t(r.f55449v, gVar);
                                    this.f55473e = rVar;
                                    if (builder != null) {
                                        builder.e(rVar);
                                        this.f55473e = builder.o();
                                    }
                                    this.f55471c |= 2;
                                } else if (iJ == 24) {
                                    this.f55471c |= 4;
                                    this.f55474f = eVar.r();
                                } else if (!j(eVar, fVarI, gVar, iJ)) {
                                }
                            }
                            z10 = true;
                        } catch (IOException e10) {
                            throw new k(e10.getMessage()).i(this);
                        }
                    } catch (k e11) {
                        throw e11.i(this);
                    }
                } catch (Throwable th) {
                    try {
                        fVarI.H();
                    } catch (IOException unused) {
                    } finally {
                        this.f55470b = bVarP.d();
                    }
                    g();
                    throw th;
                }
            }
            try {
                fVarI.H();
            } catch (IOException unused2) {
            } finally {
                this.f55470b = bVarP.d();
            }
            g();
        }

        /* synthetic */ b(e eVar, g gVar, p374ue.a aVar) {
            this(eVar, gVar);
        }

        private b(i.b bVar) {
            super(bVar);
            this.f55475g = (byte) -1;
            this.f55476h = -1;
            this.f55470b = bVar.d();
        }

        /* synthetic */ b(i.b bVar, p374ue.a aVar) {
            this(bVar);
        }

        private b(boolean z10) {
            this.f55475g = (byte) -1;
            this.f55476h = -1;
            this.f55470b = d.f710a;
        }

        public static b q() {
            return f55468i;
        }

        private void x() {
            this.f55472d = c.INV;
            this.f55473e = r.R();
            this.f55474f = 0;
        }

        public static C0700b y() {
            return C0700b.m();
        }

        public static C0700b z(b bVar) {
            return y().e(bVar);
        }

        @Override // Be.p
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public C0700b newBuilderForType() {
            return y();
        }

        @Override // Be.p
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public C0700b toBuilder() {
            return z(this);
        }

        @Override // Be.p
        public void b(f fVar) throws IOException {
            getSerializedSize();
            if ((this.f55471c & 1) == 1) {
                fVar.R(1, this.f55472d.getNumber());
            }
            if ((this.f55471c & 2) == 2) {
                fVar.c0(2, this.f55473e);
            }
            if ((this.f55471c & 4) == 4) {
                fVar.Z(3, this.f55474f);
            }
            fVar.h0(this.f55470b);
        }

        @Override // Be.p
        public int getSerializedSize() {
            int i10 = this.f55476h;
            if (i10 != -1) {
                return i10;
            }
            int iH = (this.f55471c & 1) == 1 ? f.h(1, this.f55472d.getNumber()) : 0;
            if ((this.f55471c & 2) == 2) {
                iH += f.r(2, this.f55473e);
            }
            if ((this.f55471c & 4) == 4) {
                iH += f.o(3, this.f55474f);
            }
            int size = iH + this.f55470b.size();
            this.f55476h = size;
            return size;
        }

        @Override // Be.q
        public final boolean isInitialized() {
            byte b10 = this.f55475g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!v() || s().isInitialized()) {
                this.f55475g = (byte) 1;
                return true;
            }
            this.f55475g = (byte) 0;
            return false;
        }

        public c r() {
            return this.f55472d;
        }

        public r s() {
            return this.f55473e;
        }

        public int t() {
            return this.f55474f;
        }

        public boolean u() {
            return (this.f55471c & 1) == 1;
        }

        public boolean v() {
            return (this.f55471c & 2) == 2;
        }

        public boolean w() {
            return (this.f55471c & 4) == 4;
        }
    }

    public static final class c extends i.c implements q {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f55488d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f55490f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f55491g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f55493i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f55494j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f55495k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f55496l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f55497m;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f55499o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f55501q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f55502r;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List f55489e = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private r f55492h = r.R();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private r f55498n = r.R();

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private r f55500p = r.R();

        private c() {
            s();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c q() {
            return new c();
        }

        private void r() {
            if ((this.f55488d & 1) != 1) {
                this.f55489e = new ArrayList(this.f55489e);
                this.f55488d |= 1;
            }
        }

        private void s() {
        }

        public c A(int i10) {
            this.f55488d |= 32;
            this.f55494j = i10;
            return this;
        }

        public c B(int i10) {
            this.f55488d |= 8192;
            this.f55502r = i10;
            return this;
        }

        public c C(int i10) {
            this.f55488d |= 4;
            this.f55491g = i10;
            return this;
        }

        public c D(int i10) {
            this.f55488d |= 16;
            this.f55493i = i10;
            return this;
        }

        public c E(boolean z10) {
            this.f55488d |= 2;
            this.f55490f = z10;
            return this;
        }

        public c F(int i10) {
            this.f55488d |= 1024;
            this.f55499o = i10;
            return this;
        }

        public c H(int i10) {
            this.f55488d |= 256;
            this.f55497m = i10;
            return this;
        }

        public c I(int i10) {
            this.f55488d |= 64;
            this.f55495k = i10;
            return this;
        }

        public c J(int i10) {
            this.f55488d |= 128;
            this.f55496l = i10;
            return this;
        }

        @Override // Be.p.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public r build() {
            r rVarO = o();
            if (rVarO.isInitialized()) {
                return rVarO;
            }
            throw Be.a.AbstractC0017a.c(rVarO);
        }

        public r o() {
            r rVar = new r(this, (p374ue.a) null);
            int i10 = this.f55488d;
            if ((i10 & 1) == 1) {
                this.f55489e = Collections.unmodifiableList(this.f55489e);
                this.f55488d &= -2;
            }
            rVar.f55452e = this.f55489e;
            int i11 = (i10 & 2) != 2 ? 0 : 1;
            rVar.f55453f = this.f55490f;
            if ((i10 & 4) == 4) {
                i11 |= 2;
            }
            rVar.f55454g = this.f55491g;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            rVar.f55455h = this.f55492h;
            if ((i10 & 16) == 16) {
                i11 |= 8;
            }
            rVar.f55456i = this.f55493i;
            if ((i10 & 32) == 32) {
                i11 |= 16;
            }
            rVar.f55457j = this.f55494j;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            rVar.f55458k = this.f55495k;
            if ((i10 & 128) == 128) {
                i11 |= 64;
            }
            rVar.f55459l = this.f55496l;
            if ((i10 & 256) == 256) {
                i11 |= 128;
            }
            rVar.f55460m = this.f55497m;
            if ((i10 & 512) == 512) {
                i11 |= 256;
            }
            rVar.f55461n = this.f55498n;
            if ((i10 & 1024) == 1024) {
                i11 |= 512;
            }
            rVar.f55462o = this.f55499o;
            if ((i10 & 2048) == 2048) {
                i11 |= 1024;
            }
            rVar.f55463p = this.f55500p;
            if ((i10 & 4096) == 4096) {
                i11 |= 2048;
            }
            rVar.f55464q = this.f55501q;
            if ((i10 & 8192) == 8192) {
                i11 |= 4096;
            }
            rVar.f55465r = this.f55502r;
            rVar.f55451d = i11;
            return rVar;
        }

        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public c clone() {
            return q().e(o());
        }

        public c u(r rVar) {
            if ((this.f55488d & 2048) != 2048 || this.f55500p == r.R()) {
                this.f55500p = rVar;
            } else {
                this.f55500p = r.s0(this.f55500p).e(rVar).o();
            }
            this.f55488d |= 2048;
            return this;
        }

        public c v(r rVar) {
            if ((this.f55488d & 8) != 8 || this.f55492h == r.R()) {
                this.f55492h = rVar;
            } else {
                this.f55492h = r.s0(this.f55492h).e(rVar).o();
            }
            this.f55488d |= 8;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // Be.p.a
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public c T0(e eVar, g gVar) throws Throwable {
            r rVar = null;
            try {
                try {
                    r rVar2 = (r) r.f55449v.c(eVar, gVar);
                    if (rVar2 != null) {
                        e(rVar2);
                    }
                    return this;
                } catch (k e10) {
                    r rVar3 = (r) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        rVar = rVar3;
                        if (rVar != null) {
                            e(rVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (rVar != null) {
                    e(rVar);
                }
                throw th;
            }
        }

        @Override // Be.i.b
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public c e(r rVar) {
            if (rVar == r.R()) {
                return this;
            }
            if (!rVar.f55452e.isEmpty()) {
                if (this.f55489e.isEmpty()) {
                    this.f55489e = rVar.f55452e;
                    this.f55488d &= -2;
                } else {
                    r();
                    this.f55489e.addAll(rVar.f55452e);
                }
            }
            if (rVar.k0()) {
                E(rVar.X());
            }
            if (rVar.h0()) {
                C(rVar.U());
            }
            if (rVar.i0()) {
                v(rVar.V());
            }
            if (rVar.j0()) {
                D(rVar.W());
            }
            if (rVar.f0()) {
                A(rVar.Q());
            }
            if (rVar.o0()) {
                I(rVar.b0());
            }
            if (rVar.p0()) {
                J(rVar.c0());
            }
            if (rVar.n0()) {
                H(rVar.a0());
            }
            if (rVar.l0()) {
                y(rVar.Y());
            }
            if (rVar.m0()) {
                F(rVar.Z());
            }
            if (rVar.d0()) {
                u(rVar.L());
            }
            if (rVar.e0()) {
                z(rVar.M());
            }
            if (rVar.g0()) {
                B(rVar.T());
            }
            l(rVar);
            f(d().c(rVar.f55450c));
            return this;
        }

        public c y(r rVar) {
            if ((this.f55488d & 512) != 512 || this.f55498n == r.R()) {
                this.f55498n = rVar;
            } else {
                this.f55498n = r.s0(this.f55498n).e(rVar).o();
            }
            this.f55488d |= 512;
            return this;
        }

        public c z(int i10) {
            this.f55488d |= 4096;
            this.f55501q = i10;
            return this;
        }
    }

    static {
        r rVar = new r(true);
        f55448u = rVar;
        rVar.q0();
    }

    private r(e eVar, g gVar) {
        c builder;
        this.f55466s = (byte) -1;
        this.f55467t = -1;
        q0();
        d.b bVarP = d.p();
        f fVarI = f.I(bVarP, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iJ = eVar.J();
                    switch (iJ) {
                        case 0:
                            break;
                        case 8:
                            this.f55451d |= 4096;
                            this.f55465r = eVar.r();
                            continue;
                        case 18:
                            if (!z11) {
                                this.f55452e = new ArrayList();
                                z11 = true;
                            }
                            this.f55452e.add(eVar.t(b.f55469j, gVar));
                            continue;
                        case 24:
                            this.f55451d |= 1;
                            this.f55453f = eVar.j();
                            continue;
                        case 32:
                            this.f55451d |= 2;
                            this.f55454g = eVar.r();
                            continue;
                        case 42:
                            builder = (this.f55451d & 4) == 4 ? this.f55455h.toBuilder() : null;
                            r rVar = (r) eVar.t(f55449v, gVar);
                            this.f55455h = rVar;
                            if (builder != null) {
                                builder.e(rVar);
                                this.f55455h = builder.o();
                            }
                            this.f55451d |= 4;
                            continue;
                        case 48:
                            this.f55451d |= 16;
                            this.f55457j = eVar.r();
                            continue;
                        case 56:
                            this.f55451d |= 32;
                            this.f55458k = eVar.r();
                            continue;
                        case 64:
                            this.f55451d |= 8;
                            this.f55456i = eVar.r();
                            continue;
                        case 72:
                            this.f55451d |= 64;
                            this.f55459l = eVar.r();
                            continue;
                        case 82:
                            builder = (this.f55451d & 256) == 256 ? this.f55461n.toBuilder() : null;
                            r rVar2 = (r) eVar.t(f55449v, gVar);
                            this.f55461n = rVar2;
                            if (builder != null) {
                                builder.e(rVar2);
                                this.f55461n = builder.o();
                            }
                            this.f55451d |= 256;
                            continue;
                        case 88:
                            this.f55451d |= 512;
                            this.f55462o = eVar.r();
                            continue;
                        case 96:
                            this.f55451d |= 128;
                            this.f55460m = eVar.r();
                            continue;
                        case 106:
                            builder = (this.f55451d & 1024) == 1024 ? this.f55463p.toBuilder() : null;
                            r rVar3 = (r) eVar.t(f55449v, gVar);
                            this.f55463p = rVar3;
                            if (builder != null) {
                                builder.e(rVar3);
                                this.f55463p = builder.o();
                            }
                            this.f55451d |= 1024;
                            continue;
                        case 112:
                            this.f55451d |= 2048;
                            this.f55464q = eVar.r();
                            continue;
                        default:
                            if (!j(eVar, fVarI, gVar, iJ)) {
                                break;
                            }
                            break;
                    }
                    z10 = true;
                } catch (Throwable th) {
                    if (z11) {
                        this.f55452e = Collections.unmodifiableList(this.f55452e);
                    }
                    try {
                        fVarI.H();
                    } catch (IOException unused) {
                    } finally {
                        this.f55450c = bVarP.d();
                    }
                    g();
                    throw th;
                }
            } catch (k e10) {
                throw e10.i(this);
            } catch (IOException e11) {
                throw new k(e11.getMessage()).i(this);
            }
        }
        if (z11) {
            this.f55452e = Collections.unmodifiableList(this.f55452e);
        }
        try {
            fVarI.H();
        } catch (IOException unused2) {
        } finally {
            this.f55450c = bVarP.d();
        }
        g();
    }

    /* synthetic */ r(e eVar, g gVar, p374ue.a aVar) {
        this(eVar, gVar);
    }

    private r(i.c cVar) {
        super(cVar);
        this.f55466s = (byte) -1;
        this.f55467t = -1;
        this.f55450c = cVar.d();
    }

    /* synthetic */ r(i.c cVar, p374ue.a aVar) {
        this(cVar);
    }

    private r(boolean z10) {
        this.f55466s = (byte) -1;
        this.f55467t = -1;
        this.f55450c = d.f710a;
    }

    public static r R() {
        return f55448u;
    }

    private void q0() {
        this.f55452e = Collections.EMPTY_LIST;
        this.f55453f = false;
        this.f55454g = 0;
        this.f55455h = R();
        this.f55456i = 0;
        this.f55457j = 0;
        this.f55458k = 0;
        this.f55459l = 0;
        this.f55460m = 0;
        this.f55461n = R();
        this.f55462o = 0;
        this.f55463p = R();
        this.f55464q = 0;
        this.f55465r = 0;
    }

    public static c r0() {
        return c.q();
    }

    public static c s0(r rVar) {
        return r0().e(rVar);
    }

    public r L() {
        return this.f55463p;
    }

    public int M() {
        return this.f55464q;
    }

    public b N(int i10) {
        return (b) this.f55452e.get(i10);
    }

    public int O() {
        return this.f55452e.size();
    }

    public List P() {
        return this.f55452e;
    }

    public int Q() {
        return this.f55457j;
    }

    @Override // Be.q
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public r getDefaultInstanceForType() {
        return f55448u;
    }

    public int T() {
        return this.f55465r;
    }

    public int U() {
        return this.f55454g;
    }

    public r V() {
        return this.f55455h;
    }

    public int W() {
        return this.f55456i;
    }

    public boolean X() {
        return this.f55453f;
    }

    public r Y() {
        return this.f55461n;
    }

    public int Z() {
        return this.f55462o;
    }

    public int a0() {
        return this.f55460m;
    }

    @Override // Be.p
    public void b(f fVar) throws IOException {
        getSerializedSize();
        i.d.a aVarS = s();
        if ((this.f55451d & 4096) == 4096) {
            fVar.Z(1, this.f55465r);
        }
        for (int i10 = 0; i10 < this.f55452e.size(); i10++) {
            fVar.c0(2, (p) this.f55452e.get(i10));
        }
        if ((this.f55451d & 1) == 1) {
            fVar.K(3, this.f55453f);
        }
        if ((this.f55451d & 2) == 2) {
            fVar.Z(4, this.f55454g);
        }
        if ((this.f55451d & 4) == 4) {
            fVar.c0(5, this.f55455h);
        }
        if ((this.f55451d & 16) == 16) {
            fVar.Z(6, this.f55457j);
        }
        if ((this.f55451d & 32) == 32) {
            fVar.Z(7, this.f55458k);
        }
        if ((this.f55451d & 8) == 8) {
            fVar.Z(8, this.f55456i);
        }
        if ((this.f55451d & 64) == 64) {
            fVar.Z(9, this.f55459l);
        }
        if ((this.f55451d & 256) == 256) {
            fVar.c0(10, this.f55461n);
        }
        if ((this.f55451d & 512) == 512) {
            fVar.Z(11, this.f55462o);
        }
        if ((this.f55451d & 128) == 128) {
            fVar.Z(12, this.f55460m);
        }
        if ((this.f55451d & 1024) == 1024) {
            fVar.c0(13, this.f55463p);
        }
        if ((this.f55451d & 2048) == 2048) {
            fVar.Z(14, this.f55464q);
        }
        aVarS.a(200, fVar);
        fVar.h0(this.f55450c);
    }

    public int b0() {
        return this.f55458k;
    }

    public int c0() {
        return this.f55459l;
    }

    public boolean d0() {
        return (this.f55451d & 1024) == 1024;
    }

    public boolean e0() {
        return (this.f55451d & 2048) == 2048;
    }

    public boolean f0() {
        return (this.f55451d & 16) == 16;
    }

    public boolean g0() {
        return (this.f55451d & 4096) == 4096;
    }

    @Override // Be.p
    public int getSerializedSize() {
        int i10 = this.f55467t;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f55451d & 4096) == 4096 ? f.o(1, this.f55465r) : 0;
        for (int i11 = 0; i11 < this.f55452e.size(); i11++) {
            iO += f.r(2, (p) this.f55452e.get(i11));
        }
        if ((this.f55451d & 1) == 1) {
            iO += f.a(3, this.f55453f);
        }
        if ((this.f55451d & 2) == 2) {
            iO += f.o(4, this.f55454g);
        }
        if ((this.f55451d & 4) == 4) {
            iO += f.r(5, this.f55455h);
        }
        if ((this.f55451d & 16) == 16) {
            iO += f.o(6, this.f55457j);
        }
        if ((this.f55451d & 32) == 32) {
            iO += f.o(7, this.f55458k);
        }
        if ((this.f55451d & 8) == 8) {
            iO += f.o(8, this.f55456i);
        }
        if ((this.f55451d & 64) == 64) {
            iO += f.o(9, this.f55459l);
        }
        if ((this.f55451d & 256) == 256) {
            iO += f.r(10, this.f55461n);
        }
        if ((this.f55451d & 512) == 512) {
            iO += f.o(11, this.f55462o);
        }
        if ((this.f55451d & 128) == 128) {
            iO += f.o(12, this.f55460m);
        }
        if ((this.f55451d & 1024) == 1024) {
            iO += f.r(13, this.f55463p);
        }
        if ((this.f55451d & 2048) == 2048) {
            iO += f.o(14, this.f55464q);
        }
        int iN = iO + n() + this.f55450c.size();
        this.f55467t = iN;
        return iN;
    }

    public boolean h0() {
        return (this.f55451d & 2) == 2;
    }

    public boolean i0() {
        return (this.f55451d & 4) == 4;
    }

    @Override // Be.q
    public final boolean isInitialized() {
        byte b10 = this.f55466s;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < O(); i10++) {
            if (!N(i10).isInitialized()) {
                this.f55466s = (byte) 0;
                return false;
            }
        }
        if (i0() && !V().isInitialized()) {
            this.f55466s = (byte) 0;
            return false;
        }
        if (l0() && !Y().isInitialized()) {
            this.f55466s = (byte) 0;
            return false;
        }
        if (d0() && !L().isInitialized()) {
            this.f55466s = (byte) 0;
            return false;
        }
        if (m()) {
            this.f55466s = (byte) 1;
            return true;
        }
        this.f55466s = (byte) 0;
        return false;
    }

    public boolean j0() {
        return (this.f55451d & 8) == 8;
    }

    public boolean k0() {
        return (this.f55451d & 1) == 1;
    }

    public boolean l0() {
        return (this.f55451d & 256) == 256;
    }

    public boolean m0() {
        return (this.f55451d & 512) == 512;
    }

    public boolean n0() {
        return (this.f55451d & 128) == 128;
    }

    public boolean o0() {
        return (this.f55451d & 32) == 32;
    }

    public boolean p0() {
        return (this.f55451d & 64) == 64;
    }

    @Override // Be.p
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public c newBuilderForType() {
        return r0();
    }

    @Override // Be.p
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public c toBuilder() {
        return s0(this);
    }
}
