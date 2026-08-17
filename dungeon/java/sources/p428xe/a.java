package p428xe;

import Be.f;
import Be.g;
import Be.i;
import Be.j;
import Be.k;
import Be.p;
import Be.q;
import Be.r;
import Be.y;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p374ue.m;
import p374ue.o;
import p374ue.t;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i.f f57576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i.f f57577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i.f f57578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i.f f57579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i.f f57580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i.f f57581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i.f f57582g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i.f f57583h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final i.f f57584i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final i.f f57585j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final i.f f57586k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final i.f f57587l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final i.f f57588m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final i.f f57589n;

    public static final class b extends i implements q {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final b f57590h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static r f57591i = new C0746a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Be.d f57592b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f57593c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f57594d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f57595e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f57596f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f57597g;

        /* JADX INFO: renamed from: xe.a$b$a, reason: collision with other inner class name */
        static class C0746a extends Be.b {
            C0746a() {
            }

            @Override // Be.r
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public b c(Be.e eVar, g gVar) {
                return new b(eVar, gVar, null);
            }
        }

        /* JADX INFO: renamed from: xe.a$b$b, reason: collision with other inner class name */
        public static final class C0747b extends i.b implements q {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f57598b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f57599c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f57600d;

            private C0747b() {
                n();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static C0747b m() {
                return new C0747b();
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
                b bVar = new b(this, (C0745a) null);
                int i10 = this.f57598b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                bVar.f57594d = this.f57599c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                bVar.f57595e = this.f57600d;
                bVar.f57593c = i11;
                return bVar;
            }

            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public C0747b clone() {
                return m().e(j());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // Be.p.a
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public C0747b T0(Be.e eVar, g gVar) throws Throwable {
                b bVar = null;
                try {
                    try {
                        b bVar2 = (b) b.f57591i.c(eVar, gVar);
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
            public C0747b e(b bVar) {
                if (bVar == b.p()) {
                    return this;
                }
                if (bVar.t()) {
                    r(bVar.r());
                }
                if (bVar.s()) {
                    q(bVar.q());
                }
                f(d().c(bVar.f57592b));
                return this;
            }

            public C0747b q(int i10) {
                this.f57598b |= 2;
                this.f57600d = i10;
                return this;
            }

            public C0747b r(int i10) {
                this.f57598b |= 1;
                this.f57599c = i10;
                return this;
            }
        }

        static {
            b bVar = new b(true);
            f57590h = bVar;
            bVar.u();
        }

        private b(Be.e eVar, g gVar) {
            this.f57596f = (byte) -1;
            this.f57597g = -1;
            u();
            Be.d.b bVarP = Be.d.p();
            f fVarI = f.I(bVarP, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iJ = eVar.J();
                        if (iJ != 0) {
                            if (iJ == 8) {
                                this.f57593c |= 1;
                                this.f57594d = eVar.r();
                            } else if (iJ == 16) {
                                this.f57593c |= 2;
                                this.f57595e = eVar.r();
                            } else if (!j(eVar, fVarI, gVar, iJ)) {
                            }
                        }
                        z10 = true;
                    } catch (Throwable th) {
                        try {
                            fVarI.H();
                        } catch (IOException unused) {
                        } finally {
                            this.f57592b = bVarP.d();
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
            try {
                fVarI.H();
            } catch (IOException unused2) {
            } finally {
                this.f57592b = bVarP.d();
            }
            g();
        }

        /* synthetic */ b(Be.e eVar, g gVar, C0745a c0745a) {
            this(eVar, gVar);
        }

        private b(i.b bVar) {
            super(bVar);
            this.f57596f = (byte) -1;
            this.f57597g = -1;
            this.f57592b = bVar.d();
        }

        /* synthetic */ b(i.b bVar, C0745a c0745a) {
            this(bVar);
        }

        private b(boolean z10) {
            this.f57596f = (byte) -1;
            this.f57597g = -1;
            this.f57592b = Be.d.f710a;
        }

        public static b p() {
            return f57590h;
        }

        private void u() {
            this.f57594d = 0;
            this.f57595e = 0;
        }

        public static C0747b v() {
            return C0747b.m();
        }

        public static C0747b w(b bVar) {
            return v().e(bVar);
        }

        @Override // Be.p
        public void b(f fVar) throws IOException {
            getSerializedSize();
            if ((this.f57593c & 1) == 1) {
                fVar.Z(1, this.f57594d);
            }
            if ((this.f57593c & 2) == 2) {
                fVar.Z(2, this.f57595e);
            }
            fVar.h0(this.f57592b);
        }

        @Override // Be.p
        public int getSerializedSize() {
            int i10 = this.f57597g;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f57593c & 1) == 1 ? f.o(1, this.f57594d) : 0;
            if ((this.f57593c & 2) == 2) {
                iO += f.o(2, this.f57595e);
            }
            int size = iO + this.f57592b.size();
            this.f57597g = size;
            return size;
        }

        @Override // Be.q
        public final boolean isInitialized() {
            byte b10 = this.f57596f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f57596f = (byte) 1;
            return true;
        }

        public int q() {
            return this.f57595e;
        }

        public int r() {
            return this.f57594d;
        }

        public boolean s() {
            return (this.f57593c & 2) == 2;
        }

        public boolean t() {
            return (this.f57593c & 1) == 1;
        }

        @Override // Be.p
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public C0747b newBuilderForType() {
            return v();
        }

        @Override // Be.p
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public C0747b toBuilder() {
            return w(this);
        }
    }

    public static final class c extends i implements q {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final c f57601h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static r f57602i = new C0748a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Be.d f57603b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f57604c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f57605d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f57606e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f57607f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f57608g;

        /* JADX INFO: renamed from: xe.a$c$a, reason: collision with other inner class name */
        static class C0748a extends Be.b {
            C0748a() {
            }

            @Override // Be.r
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public c c(Be.e eVar, g gVar) {
                return new c(eVar, gVar, null);
            }
        }

        public static final class b extends i.b implements q {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f57609b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f57610c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f57611d;

            private b() {
                n();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b m() {
                return new b();
            }

            private void n() {
            }

            @Override // Be.p.a
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public c build() {
                c cVarJ = j();
                if (cVarJ.isInitialized()) {
                    return cVarJ;
                }
                throw Be.a.AbstractC0017a.c(cVarJ);
            }

            public c j() {
                c cVar = new c(this, (C0745a) null);
                int i10 = this.f57609b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                cVar.f57605d = this.f57610c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                cVar.f57606e = this.f57611d;
                cVar.f57604c = i11;
                return cVar;
            }

            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public b clone() {
                return m().e(j());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // Be.p.a
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public b T0(Be.e eVar, g gVar) throws Throwable {
                c cVar = null;
                try {
                    try {
                        c cVar2 = (c) c.f57602i.c(eVar, gVar);
                        if (cVar2 != null) {
                            e(cVar2);
                        }
                        return this;
                    } catch (k e10) {
                        c cVar3 = (c) e10.a();
                        try {
                            throw e10;
                        } catch (Throwable th) {
                            th = th;
                            cVar = cVar3;
                            if (cVar != null) {
                                e(cVar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cVar != null) {
                        e(cVar);
                    }
                    throw th;
                }
            }

            @Override // Be.i.b
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public b e(c cVar) {
                if (cVar == c.p()) {
                    return this;
                }
                if (cVar.t()) {
                    r(cVar.r());
                }
                if (cVar.s()) {
                    q(cVar.q());
                }
                f(d().c(cVar.f57603b));
                return this;
            }

            public b q(int i10) {
                this.f57609b |= 2;
                this.f57611d = i10;
                return this;
            }

            public b r(int i10) {
                this.f57609b |= 1;
                this.f57610c = i10;
                return this;
            }
        }

        static {
            c cVar = new c(true);
            f57601h = cVar;
            cVar.u();
        }

        private c(Be.e eVar, g gVar) {
            this.f57607f = (byte) -1;
            this.f57608g = -1;
            u();
            Be.d.b bVarP = Be.d.p();
            f fVarI = f.I(bVarP, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iJ = eVar.J();
                        if (iJ != 0) {
                            if (iJ == 8) {
                                this.f57604c |= 1;
                                this.f57605d = eVar.r();
                            } else if (iJ == 16) {
                                this.f57604c |= 2;
                                this.f57606e = eVar.r();
                            } else if (!j(eVar, fVarI, gVar, iJ)) {
                            }
                        }
                        z10 = true;
                    } catch (Throwable th) {
                        try {
                            fVarI.H();
                        } catch (IOException unused) {
                        } finally {
                            this.f57603b = bVarP.d();
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
            try {
                fVarI.H();
            } catch (IOException unused2) {
            } finally {
                this.f57603b = bVarP.d();
            }
            g();
        }

        /* synthetic */ c(Be.e eVar, g gVar, C0745a c0745a) {
            this(eVar, gVar);
        }

        private c(i.b bVar) {
            super(bVar);
            this.f57607f = (byte) -1;
            this.f57608g = -1;
            this.f57603b = bVar.d();
        }

        /* synthetic */ c(i.b bVar, C0745a c0745a) {
            this(bVar);
        }

        private c(boolean z10) {
            this.f57607f = (byte) -1;
            this.f57608g = -1;
            this.f57603b = Be.d.f710a;
        }

        public static c p() {
            return f57601h;
        }

        private void u() {
            this.f57605d = 0;
            this.f57606e = 0;
        }

        public static b v() {
            return b.m();
        }

        public static b w(c cVar) {
            return v().e(cVar);
        }

        @Override // Be.p
        public void b(f fVar) throws IOException {
            getSerializedSize();
            if ((this.f57604c & 1) == 1) {
                fVar.Z(1, this.f57605d);
            }
            if ((this.f57604c & 2) == 2) {
                fVar.Z(2, this.f57606e);
            }
            fVar.h0(this.f57603b);
        }

        @Override // Be.p
        public int getSerializedSize() {
            int i10 = this.f57608g;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f57604c & 1) == 1 ? f.o(1, this.f57605d) : 0;
            if ((this.f57604c & 2) == 2) {
                iO += f.o(2, this.f57606e);
            }
            int size = iO + this.f57603b.size();
            this.f57608g = size;
            return size;
        }

        @Override // Be.q
        public final boolean isInitialized() {
            byte b10 = this.f57607f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f57607f = (byte) 1;
            return true;
        }

        public int q() {
            return this.f57606e;
        }

        public int r() {
            return this.f57605d;
        }

        public boolean s() {
            return (this.f57604c & 2) == 2;
        }

        public boolean t() {
            return (this.f57604c & 1) == 1;
        }

        @Override // Be.p
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return v();
        }

        @Override // Be.p
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public b toBuilder() {
            return w(this);
        }
    }

    public static final class d extends i implements q {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final d f57612k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static r f57613l = new C0749a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Be.d f57614b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f57615c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private b f57616d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f57617e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private c f57618f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private c f57619g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private c f57620h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private byte f57621i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f57622j;

        /* JADX INFO: renamed from: xe.a$d$a, reason: collision with other inner class name */
        static class C0749a extends Be.b {
            C0749a() {
            }

            @Override // Be.r
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public d c(Be.e eVar, g gVar) {
                return new d(eVar, gVar, null);
            }
        }

        public static final class b extends i.b implements q {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f57623b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private b f57624c = b.p();

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private c f57625d = c.p();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private c f57626e = c.p();

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private c f57627f = c.p();

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private c f57628g = c.p();

            private b() {
                n();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b m() {
                return new b();
            }

            private void n() {
            }

            @Override // Be.p.a
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public d build() {
                d dVarJ = j();
                if (dVarJ.isInitialized()) {
                    return dVarJ;
                }
                throw Be.a.AbstractC0017a.c(dVarJ);
            }

            public d j() {
                d dVar = new d(this, (C0745a) null);
                int i10 = this.f57623b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                dVar.f57616d = this.f57624c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                dVar.f57617e = this.f57625d;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                dVar.f57618f = this.f57626e;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                dVar.f57619g = this.f57627f;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                dVar.f57620h = this.f57628g;
                dVar.f57615c = i11;
                return dVar;
            }

            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public b clone() {
                return m().e(j());
            }

            public b o(c cVar) {
                if ((this.f57623b & 16) != 16 || this.f57628g == c.p()) {
                    this.f57628g = cVar;
                } else {
                    this.f57628g = c.w(this.f57628g).e(cVar).j();
                }
                this.f57623b |= 16;
                return this;
            }

            public b p(b bVar) {
                if ((this.f57623b & 1) != 1 || this.f57624c == b.p()) {
                    this.f57624c = bVar;
                } else {
                    this.f57624c = b.w(this.f57624c).e(bVar).j();
                }
                this.f57623b |= 1;
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // Be.p.a
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public b T0(Be.e eVar, g gVar) throws Throwable {
                d dVar = null;
                try {
                    try {
                        d dVar2 = (d) d.f57613l.c(eVar, gVar);
                        if (dVar2 != null) {
                            e(dVar2);
                        }
                        return this;
                    } catch (k e10) {
                        d dVar3 = (d) e10.a();
                        try {
                            throw e10;
                        } catch (Throwable th) {
                            th = th;
                            dVar = dVar3;
                            if (dVar != null) {
                                e(dVar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (dVar != null) {
                        e(dVar);
                    }
                    throw th;
                }
            }

            @Override // Be.i.b
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public b e(d dVar) {
                if (dVar == d.s()) {
                    return this;
                }
                if (dVar.z()) {
                    p(dVar.u());
                }
                if (dVar.C()) {
                    v(dVar.x());
                }
                if (dVar.A()) {
                    s(dVar.v());
                }
                if (dVar.B()) {
                    u(dVar.w());
                }
                if (dVar.y()) {
                    o(dVar.t());
                }
                f(d().c(dVar.f57614b));
                return this;
            }

            public b s(c cVar) {
                if ((this.f57623b & 4) != 4 || this.f57626e == c.p()) {
                    this.f57626e = cVar;
                } else {
                    this.f57626e = c.w(this.f57626e).e(cVar).j();
                }
                this.f57623b |= 4;
                return this;
            }

            public b u(c cVar) {
                if ((this.f57623b & 8) != 8 || this.f57627f == c.p()) {
                    this.f57627f = cVar;
                } else {
                    this.f57627f = c.w(this.f57627f).e(cVar).j();
                }
                this.f57623b |= 8;
                return this;
            }

            public b v(c cVar) {
                if ((this.f57623b & 2) != 2 || this.f57625d == c.p()) {
                    this.f57625d = cVar;
                } else {
                    this.f57625d = c.w(this.f57625d).e(cVar).j();
                }
                this.f57623b |= 2;
                return this;
            }
        }

        static {
            d dVar = new d(true);
            f57612k = dVar;
            dVar.D();
        }

        private d(Be.e eVar, g gVar) {
            this.f57621i = (byte) -1;
            this.f57622j = -1;
            D();
            Be.d.b bVarP = Be.d.p();
            f fVarI = f.I(bVarP, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iJ = eVar.J();
                        if (iJ != 0) {
                            if (iJ == 10) {
                                b.C0747b builder = (this.f57615c & 1) == 1 ? this.f57616d.toBuilder() : null;
                                b bVar = (b) eVar.t(b.f57591i, gVar);
                                this.f57616d = bVar;
                                if (builder != null) {
                                    builder.e(bVar);
                                    this.f57616d = builder.j();
                                }
                                this.f57615c |= 1;
                            } else if (iJ == 18) {
                                c.b builder2 = (this.f57615c & 2) == 2 ? this.f57617e.toBuilder() : null;
                                c cVar = (c) eVar.t(c.f57602i, gVar);
                                this.f57617e = cVar;
                                if (builder2 != null) {
                                    builder2.e(cVar);
                                    this.f57617e = builder2.j();
                                }
                                this.f57615c |= 2;
                            } else if (iJ == 26) {
                                c.b builder3 = (this.f57615c & 4) == 4 ? this.f57618f.toBuilder() : null;
                                c cVar2 = (c) eVar.t(c.f57602i, gVar);
                                this.f57618f = cVar2;
                                if (builder3 != null) {
                                    builder3.e(cVar2);
                                    this.f57618f = builder3.j();
                                }
                                this.f57615c |= 4;
                            } else if (iJ == 34) {
                                c.b builder4 = (this.f57615c & 8) == 8 ? this.f57619g.toBuilder() : null;
                                c cVar3 = (c) eVar.t(c.f57602i, gVar);
                                this.f57619g = cVar3;
                                if (builder4 != null) {
                                    builder4.e(cVar3);
                                    this.f57619g = builder4.j();
                                }
                                this.f57615c |= 8;
                            } else if (iJ == 42) {
                                c.b builder5 = (this.f57615c & 16) == 16 ? this.f57620h.toBuilder() : null;
                                c cVar4 = (c) eVar.t(c.f57602i, gVar);
                                this.f57620h = cVar4;
                                if (builder5 != null) {
                                    builder5.e(cVar4);
                                    this.f57620h = builder5.j();
                                }
                                this.f57615c |= 16;
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
                    try {
                        fVarI.H();
                    } catch (IOException unused) {
                    } finally {
                        this.f57614b = bVarP.d();
                    }
                    g();
                    throw th;
                }
            }
            try {
                fVarI.H();
            } catch (IOException unused2) {
            } finally {
                this.f57614b = bVarP.d();
            }
            g();
        }

        /* synthetic */ d(Be.e eVar, g gVar, C0745a c0745a) {
            this(eVar, gVar);
        }

        private d(i.b bVar) {
            super(bVar);
            this.f57621i = (byte) -1;
            this.f57622j = -1;
            this.f57614b = bVar.d();
        }

        /* synthetic */ d(i.b bVar, C0745a c0745a) {
            this(bVar);
        }

        private d(boolean z10) {
            this.f57621i = (byte) -1;
            this.f57622j = -1;
            this.f57614b = Be.d.f710a;
        }

        private void D() {
            this.f57616d = b.p();
            this.f57617e = c.p();
            this.f57618f = c.p();
            this.f57619g = c.p();
            this.f57620h = c.p();
        }

        public static b E() {
            return b.m();
        }

        public static b F(d dVar) {
            return E().e(dVar);
        }

        public static d s() {
            return f57612k;
        }

        public boolean A() {
            return (this.f57615c & 4) == 4;
        }

        public boolean B() {
            return (this.f57615c & 8) == 8;
        }

        public boolean C() {
            return (this.f57615c & 2) == 2;
        }

        @Override // Be.p
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return E();
        }

        @Override // Be.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public b toBuilder() {
            return F(this);
        }

        @Override // Be.p
        public void b(f fVar) throws IOException {
            getSerializedSize();
            if ((this.f57615c & 1) == 1) {
                fVar.c0(1, this.f57616d);
            }
            if ((this.f57615c & 2) == 2) {
                fVar.c0(2, this.f57617e);
            }
            if ((this.f57615c & 4) == 4) {
                fVar.c0(3, this.f57618f);
            }
            if ((this.f57615c & 8) == 8) {
                fVar.c0(4, this.f57619g);
            }
            if ((this.f57615c & 16) == 16) {
                fVar.c0(5, this.f57620h);
            }
            fVar.h0(this.f57614b);
        }

        @Override // Be.p
        public int getSerializedSize() {
            int i10 = this.f57622j;
            if (i10 != -1) {
                return i10;
            }
            int iR = (this.f57615c & 1) == 1 ? f.r(1, this.f57616d) : 0;
            if ((this.f57615c & 2) == 2) {
                iR += f.r(2, this.f57617e);
            }
            if ((this.f57615c & 4) == 4) {
                iR += f.r(3, this.f57618f);
            }
            if ((this.f57615c & 8) == 8) {
                iR += f.r(4, this.f57619g);
            }
            if ((this.f57615c & 16) == 16) {
                iR += f.r(5, this.f57620h);
            }
            int size = iR + this.f57614b.size();
            this.f57622j = size;
            return size;
        }

        @Override // Be.q
        public final boolean isInitialized() {
            byte b10 = this.f57621i;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f57621i = (byte) 1;
            return true;
        }

        public c t() {
            return this.f57620h;
        }

        public b u() {
            return this.f57616d;
        }

        public c v() {
            return this.f57618f;
        }

        public c w() {
            return this.f57619g;
        }

        public c x() {
            return this.f57617e;
        }

        public boolean y() {
            return (this.f57615c & 16) == 16;
        }

        public boolean z() {
            return (this.f57615c & 1) == 1;
        }
    }

    public static final class e extends i implements q {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final e f57629h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static r f57630i = new C0750a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Be.d f57631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f57632c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List f57633d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f57634e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f57635f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f57636g;

        /* JADX INFO: renamed from: xe.a$e$a, reason: collision with other inner class name */
        static class C0750a extends Be.b {
            C0750a() {
            }

            @Override // Be.r
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public e c(Be.e eVar, g gVar) {
                return new e(eVar, gVar, null);
            }
        }

        public static final class b extends i.b implements q {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f57637b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private List f57638c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private List f57639d;

            private b() {
                List list = Collections.EMPTY_LIST;
                this.f57638c = list;
                this.f57639d = list;
                p();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b m() {
                return new b();
            }

            private void n() {
                if ((this.f57637b & 2) != 2) {
                    this.f57639d = new ArrayList(this.f57639d);
                    this.f57637b |= 2;
                }
            }

            private void o() {
                if ((this.f57637b & 1) != 1) {
                    this.f57638c = new ArrayList(this.f57638c);
                    this.f57637b |= 1;
                }
            }

            private void p() {
            }

            @Override // Be.p.a
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public e build() {
                e eVarJ = j();
                if (eVarJ.isInitialized()) {
                    return eVarJ;
                }
                throw Be.a.AbstractC0017a.c(eVarJ);
            }

            public e j() {
                e eVar = new e(this, (C0745a) null);
                if ((this.f57637b & 1) == 1) {
                    this.f57638c = Collections.unmodifiableList(this.f57638c);
                    this.f57637b &= -2;
                }
                eVar.f57632c = this.f57638c;
                if ((this.f57637b & 2) == 2) {
                    this.f57639d = Collections.unmodifiableList(this.f57639d);
                    this.f57637b &= -3;
                }
                eVar.f57633d = this.f57639d;
                return eVar;
            }

            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public b clone() {
                return m().e(j());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // Be.p.a
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public b T0(Be.e eVar, g gVar) throws Throwable {
                e eVar2 = null;
                try {
                    try {
                        e eVar3 = (e) e.f57630i.c(eVar, gVar);
                        if (eVar3 != null) {
                            e(eVar3);
                        }
                        return this;
                    } catch (k e10) {
                        e eVar4 = (e) e10.a();
                        try {
                            throw e10;
                        } catch (Throwable th) {
                            th = th;
                            eVar2 = eVar4;
                            if (eVar2 != null) {
                                e(eVar2);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (eVar2 != null) {
                        e(eVar2);
                    }
                    throw th;
                }
            }

            @Override // Be.i.b
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public b e(e eVar) {
                if (eVar == e.q()) {
                    return this;
                }
                if (!eVar.f57632c.isEmpty()) {
                    if (this.f57638c.isEmpty()) {
                        this.f57638c = eVar.f57632c;
                        this.f57637b &= -2;
                    } else {
                        o();
                        this.f57638c.addAll(eVar.f57632c);
                    }
                }
                if (!eVar.f57633d.isEmpty()) {
                    if (this.f57639d.isEmpty()) {
                        this.f57639d = eVar.f57633d;
                        this.f57637b &= -3;
                    } else {
                        n();
                        this.f57639d.addAll(eVar.f57633d);
                    }
                }
                f(d().c(eVar.f57631b));
                return this;
            }
        }

        public static final class c extends i implements q {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private static final c f57640n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public static r f57641o = new C0751a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Be.d f57642b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f57643c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f57644d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f57645e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private Object f57646f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private EnumC0752c f57647g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private List f57648h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private int f57649i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private List f57650j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private int f57651k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private byte f57652l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private int f57653m;

            /* JADX INFO: renamed from: xe.a$e$c$a, reason: collision with other inner class name */
            static class C0751a extends Be.b {
                C0751a() {
                }

                @Override // Be.r
                /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
                public c c(Be.e eVar, g gVar) {
                    return new c(eVar, gVar, null);
                }
            }

            public static final class b extends i.b implements q {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private int f57654b;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private int f57656d;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private List f57659g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private List f57660h;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private int f57655c = 1;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private Object f57657e = "";

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private EnumC0752c f57658f = EnumC0752c.NONE;

                private b() {
                    List list = Collections.EMPTY_LIST;
                    this.f57659g = list;
                    this.f57660h = list;
                    p();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static b m() {
                    return new b();
                }

                private void n() {
                    if ((this.f57654b & 32) != 32) {
                        this.f57660h = new ArrayList(this.f57660h);
                        this.f57654b |= 32;
                    }
                }

                private void o() {
                    if ((this.f57654b & 16) != 16) {
                        this.f57659g = new ArrayList(this.f57659g);
                        this.f57654b |= 16;
                    }
                }

                private void p() {
                }

                @Override // Be.p.a
                /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
                public c build() {
                    c cVarJ = j();
                    if (cVarJ.isInitialized()) {
                        return cVarJ;
                    }
                    throw Be.a.AbstractC0017a.c(cVarJ);
                }

                public c j() {
                    c cVar = new c(this, (C0745a) null);
                    int i10 = this.f57654b;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    cVar.f57644d = this.f57655c;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    cVar.f57645e = this.f57656d;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    cVar.f57646f = this.f57657e;
                    if ((i10 & 8) == 8) {
                        i11 |= 8;
                    }
                    cVar.f57647g = this.f57658f;
                    if ((this.f57654b & 16) == 16) {
                        this.f57659g = Collections.unmodifiableList(this.f57659g);
                        this.f57654b &= -17;
                    }
                    cVar.f57648h = this.f57659g;
                    if ((this.f57654b & 32) == 32) {
                        this.f57660h = Collections.unmodifiableList(this.f57660h);
                        this.f57654b &= -33;
                    }
                    cVar.f57650j = this.f57660h;
                    cVar.f57643c = i11;
                    return cVar;
                }

                /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
                public b clone() {
                    return m().e(j());
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // Be.p.a
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public b T0(Be.e eVar, g gVar) throws Throwable {
                    c cVar = null;
                    try {
                        try {
                            c cVar2 = (c) c.f57641o.c(eVar, gVar);
                            if (cVar2 != null) {
                                e(cVar2);
                            }
                            return this;
                        } catch (k e10) {
                            c cVar3 = (c) e10.a();
                            try {
                                throw e10;
                            } catch (Throwable th) {
                                th = th;
                                cVar = cVar3;
                                if (cVar != null) {
                                    e(cVar);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (cVar != null) {
                            e(cVar);
                        }
                        throw th;
                    }
                }

                @Override // Be.i.b
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public b e(c cVar) {
                    if (cVar == c.w()) {
                        return this;
                    }
                    if (cVar.I()) {
                        v(cVar.z());
                    }
                    if (cVar.H()) {
                        u(cVar.y());
                    }
                    if (cVar.J()) {
                        this.f57654b |= 4;
                        this.f57657e = cVar.f57646f;
                    }
                    if (cVar.G()) {
                        s(cVar.x());
                    }
                    if (!cVar.f57648h.isEmpty()) {
                        if (this.f57659g.isEmpty()) {
                            this.f57659g = cVar.f57648h;
                            this.f57654b &= -17;
                        } else {
                            o();
                            this.f57659g.addAll(cVar.f57648h);
                        }
                    }
                    if (!cVar.f57650j.isEmpty()) {
                        if (this.f57660h.isEmpty()) {
                            this.f57660h = cVar.f57650j;
                            this.f57654b &= -33;
                        } else {
                            n();
                            this.f57660h.addAll(cVar.f57650j);
                        }
                    }
                    f(d().c(cVar.f57642b));
                    return this;
                }

                public b s(EnumC0752c enumC0752c) {
                    enumC0752c.getClass();
                    this.f57654b |= 8;
                    this.f57658f = enumC0752c;
                    return this;
                }

                public b u(int i10) {
                    this.f57654b |= 2;
                    this.f57656d = i10;
                    return this;
                }

                public b v(int i10) {
                    this.f57654b |= 1;
                    this.f57655c = i10;
                    return this;
                }
            }

            /* JADX INFO: renamed from: xe.a$e$c$c, reason: collision with other inner class name */
            public enum EnumC0752c implements j.a {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);


                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static j.b f57664e = new C0753a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final int f57666a;

                /* JADX INFO: renamed from: xe.a$e$c$c$a, reason: collision with other inner class name */
                static class C0753a implements j.b {
                    C0753a() {
                    }

                    @Override // Be.j.b
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public EnumC0752c a(int i10) {
                        return EnumC0752c.e(i10);
                    }
                }

                EnumC0752c(int i10, int i11) {
                    this.f57666a = i11;
                }

                public static EnumC0752c e(int i10) {
                    if (i10 == 0) {
                        return NONE;
                    }
                    if (i10 == 1) {
                        return INTERNAL_TO_CLASS_ID;
                    }
                    if (i10 != 2) {
                        return null;
                    }
                    return DESC_TO_CLASS_ID;
                }

                @Override // Be.j.a
                public final int getNumber() {
                    return this.f57666a;
                }
            }

            static {
                c cVar = new c(true);
                f57640n = cVar;
                cVar.K();
            }

            private c(Be.e eVar, g gVar) {
                this.f57649i = -1;
                this.f57651k = -1;
                this.f57652l = (byte) -1;
                this.f57653m = -1;
                K();
                Be.d.b bVarP = Be.d.p();
                f fVarI = f.I(bVarP, 1);
                boolean z10 = false;
                int i10 = 0;
                while (!z10) {
                    try {
                        try {
                            int iJ = eVar.J();
                            if (iJ != 0) {
                                if (iJ == 8) {
                                    this.f57643c |= 1;
                                    this.f57644d = eVar.r();
                                } else if (iJ == 16) {
                                    this.f57643c |= 2;
                                    this.f57645e = eVar.r();
                                } else if (iJ == 24) {
                                    int iM = eVar.m();
                                    EnumC0752c enumC0752cE = EnumC0752c.e(iM);
                                    if (enumC0752cE == null) {
                                        fVarI.n0(iJ);
                                        fVarI.n0(iM);
                                    } else {
                                        this.f57643c |= 8;
                                        this.f57647g = enumC0752cE;
                                    }
                                } else if (iJ == 32) {
                                    if ((i10 & 16) != 16) {
                                        this.f57648h = new ArrayList();
                                        i10 |= 16;
                                    }
                                    this.f57648h.add(Integer.valueOf(eVar.r()));
                                } else if (iJ == 34) {
                                    int i11 = eVar.i(eVar.z());
                                    if ((i10 & 16) != 16 && eVar.e() > 0) {
                                        this.f57648h = new ArrayList();
                                        i10 |= 16;
                                    }
                                    while (eVar.e() > 0) {
                                        this.f57648h.add(Integer.valueOf(eVar.r()));
                                    }
                                    eVar.h(i11);
                                } else if (iJ == 40) {
                                    if ((i10 & 32) != 32) {
                                        this.f57650j = new ArrayList();
                                        i10 |= 32;
                                    }
                                    this.f57650j.add(Integer.valueOf(eVar.r()));
                                } else if (iJ == 42) {
                                    int i12 = eVar.i(eVar.z());
                                    if ((i10 & 32) != 32 && eVar.e() > 0) {
                                        this.f57650j = new ArrayList();
                                        i10 |= 32;
                                    }
                                    while (eVar.e() > 0) {
                                        this.f57650j.add(Integer.valueOf(eVar.r()));
                                    }
                                    eVar.h(i12);
                                } else if (iJ == 50) {
                                    Be.d dVarK = eVar.k();
                                    this.f57643c |= 4;
                                    this.f57646f = dVarK;
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
                        if ((i10 & 16) == 16) {
                            this.f57648h = Collections.unmodifiableList(this.f57648h);
                        }
                        if ((i10 & 32) == 32) {
                            this.f57650j = Collections.unmodifiableList(this.f57650j);
                        }
                        try {
                            fVarI.H();
                        } catch (IOException unused) {
                        } finally {
                            this.f57642b = bVarP.d();
                        }
                        g();
                        throw th;
                    }
                }
                if ((i10 & 16) == 16) {
                    this.f57648h = Collections.unmodifiableList(this.f57648h);
                }
                if ((i10 & 32) == 32) {
                    this.f57650j = Collections.unmodifiableList(this.f57650j);
                }
                try {
                    fVarI.H();
                } catch (IOException unused2) {
                } finally {
                    this.f57642b = bVarP.d();
                }
                g();
            }

            /* synthetic */ c(Be.e eVar, g gVar, C0745a c0745a) {
                this(eVar, gVar);
            }

            private c(i.b bVar) {
                super(bVar);
                this.f57649i = -1;
                this.f57651k = -1;
                this.f57652l = (byte) -1;
                this.f57653m = -1;
                this.f57642b = bVar.d();
            }

            /* synthetic */ c(i.b bVar, C0745a c0745a) {
                this(bVar);
            }

            private c(boolean z10) {
                this.f57649i = -1;
                this.f57651k = -1;
                this.f57652l = (byte) -1;
                this.f57653m = -1;
                this.f57642b = Be.d.f710a;
            }

            private void K() {
                this.f57644d = 1;
                this.f57645e = 0;
                this.f57646f = "";
                this.f57647g = EnumC0752c.NONE;
                List list = Collections.EMPTY_LIST;
                this.f57648h = list;
                this.f57650j = list;
            }

            public static b L() {
                return b.m();
            }

            public static b M(c cVar) {
                return L().e(cVar);
            }

            public static c w() {
                return f57640n;
            }

            public int A() {
                return this.f57650j.size();
            }

            public List B() {
                return this.f57650j;
            }

            public String C() {
                Object obj = this.f57646f;
                if (obj instanceof String) {
                    return (String) obj;
                }
                Be.d dVar = (Be.d) obj;
                String strX = dVar.x();
                if (dVar.o()) {
                    this.f57646f = strX;
                }
                return strX;
            }

            public Be.d D() {
                Object obj = this.f57646f;
                if (!(obj instanceof String)) {
                    return (Be.d) obj;
                }
                Be.d dVarI = Be.d.i((String) obj);
                this.f57646f = dVarI;
                return dVarI;
            }

            public int E() {
                return this.f57648h.size();
            }

            public List F() {
                return this.f57648h;
            }

            public boolean G() {
                return (this.f57643c & 8) == 8;
            }

            public boolean H() {
                return (this.f57643c & 2) == 2;
            }

            public boolean I() {
                return (this.f57643c & 1) == 1;
            }

            public boolean J() {
                return (this.f57643c & 4) == 4;
            }

            @Override // Be.p
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public b newBuilderForType() {
                return L();
            }

            @Override // Be.p
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public b toBuilder() {
                return M(this);
            }

            @Override // Be.p
            public void b(f fVar) throws IOException {
                getSerializedSize();
                if ((this.f57643c & 1) == 1) {
                    fVar.Z(1, this.f57644d);
                }
                if ((this.f57643c & 2) == 2) {
                    fVar.Z(2, this.f57645e);
                }
                if ((this.f57643c & 8) == 8) {
                    fVar.R(3, this.f57647g.getNumber());
                }
                if (F().size() > 0) {
                    fVar.n0(34);
                    fVar.n0(this.f57649i);
                }
                for (int i10 = 0; i10 < this.f57648h.size(); i10++) {
                    fVar.a0(((Integer) this.f57648h.get(i10)).intValue());
                }
                if (B().size() > 0) {
                    fVar.n0(42);
                    fVar.n0(this.f57651k);
                }
                for (int i11 = 0; i11 < this.f57650j.size(); i11++) {
                    fVar.a0(((Integer) this.f57650j.get(i11)).intValue());
                }
                if ((this.f57643c & 4) == 4) {
                    fVar.N(6, D());
                }
                fVar.h0(this.f57642b);
            }

            @Override // Be.p
            public int getSerializedSize() {
                int i10 = this.f57653m;
                if (i10 != -1) {
                    return i10;
                }
                int iO = (this.f57643c & 1) == 1 ? f.o(1, this.f57644d) : 0;
                if ((this.f57643c & 2) == 2) {
                    iO += f.o(2, this.f57645e);
                }
                if ((this.f57643c & 8) == 8) {
                    iO += f.h(3, this.f57647g.getNumber());
                }
                int iP = 0;
                for (int i11 = 0; i11 < this.f57648h.size(); i11++) {
                    iP += f.p(((Integer) this.f57648h.get(i11)).intValue());
                }
                int iP2 = iO + iP;
                if (!F().isEmpty()) {
                    iP2 = iP2 + 1 + f.p(iP);
                }
                this.f57649i = iP;
                int iP3 = 0;
                for (int i12 = 0; i12 < this.f57650j.size(); i12++) {
                    iP3 += f.p(((Integer) this.f57650j.get(i12)).intValue());
                }
                int iD = iP2 + iP3;
                if (!B().isEmpty()) {
                    iD = iD + 1 + f.p(iP3);
                }
                this.f57651k = iP3;
                if ((this.f57643c & 4) == 4) {
                    iD += f.d(6, D());
                }
                int size = iD + this.f57642b.size();
                this.f57653m = size;
                return size;
            }

            @Override // Be.q
            public final boolean isInitialized() {
                byte b10 = this.f57652l;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f57652l = (byte) 1;
                return true;
            }

            public EnumC0752c x() {
                return this.f57647g;
            }

            public int y() {
                return this.f57645e;
            }

            public int z() {
                return this.f57644d;
            }
        }

        static {
            e eVar = new e(true);
            f57629h = eVar;
            eVar.t();
        }

        private e(Be.e eVar, g gVar) {
            this.f57634e = -1;
            this.f57635f = (byte) -1;
            this.f57636g = -1;
            t();
            Be.d.b bVarP = Be.d.p();
            f fVarI = f.I(bVarP, 1);
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        int iJ = eVar.J();
                        if (iJ != 0) {
                            if (iJ == 10) {
                                if ((i10 & 1) != 1) {
                                    this.f57632c = new ArrayList();
                                    i10 |= 1;
                                }
                                this.f57632c.add(eVar.t(c.f57641o, gVar));
                            } else if (iJ == 40) {
                                if ((i10 & 2) != 2) {
                                    this.f57633d = new ArrayList();
                                    i10 |= 2;
                                }
                                this.f57633d.add(Integer.valueOf(eVar.r()));
                            } else if (iJ == 42) {
                                int i11 = eVar.i(eVar.z());
                                if ((i10 & 2) != 2 && eVar.e() > 0) {
                                    this.f57633d = new ArrayList();
                                    i10 |= 2;
                                }
                                while (eVar.e() > 0) {
                                    this.f57633d.add(Integer.valueOf(eVar.r()));
                                }
                                eVar.h(i11);
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
                    if ((i10 & 1) == 1) {
                        this.f57632c = Collections.unmodifiableList(this.f57632c);
                    }
                    if ((i10 & 2) == 2) {
                        this.f57633d = Collections.unmodifiableList(this.f57633d);
                    }
                    try {
                        fVarI.H();
                    } catch (IOException unused) {
                    } finally {
                        this.f57631b = bVarP.d();
                    }
                    g();
                    throw th;
                }
            }
            if ((i10 & 1) == 1) {
                this.f57632c = Collections.unmodifiableList(this.f57632c);
            }
            if ((i10 & 2) == 2) {
                this.f57633d = Collections.unmodifiableList(this.f57633d);
            }
            try {
                fVarI.H();
            } catch (IOException unused2) {
            } finally {
                this.f57631b = bVarP.d();
            }
            g();
        }

        /* synthetic */ e(Be.e eVar, g gVar, C0745a c0745a) {
            this(eVar, gVar);
        }

        private e(i.b bVar) {
            super(bVar);
            this.f57634e = -1;
            this.f57635f = (byte) -1;
            this.f57636g = -1;
            this.f57631b = bVar.d();
        }

        /* synthetic */ e(i.b bVar, C0745a c0745a) {
            this(bVar);
        }

        private e(boolean z10) {
            this.f57634e = -1;
            this.f57635f = (byte) -1;
            this.f57636g = -1;
            this.f57631b = Be.d.f710a;
        }

        public static e q() {
            return f57629h;
        }

        private void t() {
            List list = Collections.EMPTY_LIST;
            this.f57632c = list;
            this.f57633d = list;
        }

        public static b u() {
            return b.m();
        }

        public static b v(e eVar) {
            return u().e(eVar);
        }

        public static e x(InputStream inputStream, g gVar) {
            return (e) f57630i.b(inputStream, gVar);
        }

        @Override // Be.p
        public void b(f fVar) throws IOException {
            getSerializedSize();
            for (int i10 = 0; i10 < this.f57632c.size(); i10++) {
                fVar.c0(1, (p) this.f57632c.get(i10));
            }
            if (r().size() > 0) {
                fVar.n0(42);
                fVar.n0(this.f57634e);
            }
            for (int i11 = 0; i11 < this.f57633d.size(); i11++) {
                fVar.a0(((Integer) this.f57633d.get(i11)).intValue());
            }
            fVar.h0(this.f57631b);
        }

        @Override // Be.p
        public int getSerializedSize() {
            int i10 = this.f57636g;
            if (i10 != -1) {
                return i10;
            }
            int iR = 0;
            for (int i11 = 0; i11 < this.f57632c.size(); i11++) {
                iR += f.r(1, (p) this.f57632c.get(i11));
            }
            int iP = 0;
            for (int i12 = 0; i12 < this.f57633d.size(); i12++) {
                iP += f.p(((Integer) this.f57633d.get(i12)).intValue());
            }
            int iP2 = iR + iP;
            if (!r().isEmpty()) {
                iP2 = iP2 + 1 + f.p(iP);
            }
            this.f57634e = iP;
            int size = iP2 + this.f57631b.size();
            this.f57636g = size;
            return size;
        }

        @Override // Be.q
        public final boolean isInitialized() {
            byte b10 = this.f57635f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f57635f = (byte) 1;
            return true;
        }

        public List r() {
            return this.f57633d;
        }

        public List s() {
            return this.f57632c;
        }

        @Override // Be.p
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return u();
        }

        @Override // Be.p
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public b toBuilder() {
            return v(this);
        }
    }

    static {
        p374ue.e eVarF = p374ue.e.F();
        c cVarP = c.p();
        c cVarP2 = c.p();
        y.b bVar = y.b.f826m;
        f57576a = i.i(eVarF, cVarP, cVarP2, null, 100, bVar, c.class);
        f57577b = i.i(p374ue.j.Y(), c.p(), c.p(), null, 100, bVar, c.class);
        p374ue.j jVarY = p374ue.j.Y();
        y.b bVar2 = y.b.f820g;
        f57578c = i.i(jVarY, 0, null, null, 101, bVar2, Integer.class);
        f57579d = i.i(o.W(), d.s(), d.s(), null, 100, bVar, d.class);
        f57580e = i.i(o.W(), 0, null, null, 101, bVar2, Integer.class);
        f57581f = i.h(p374ue.r.R(), p374ue.b.t(), null, 100, bVar, false, p374ue.b.class);
        f57582g = i.i(p374ue.r.R(), Boolean.FALSE, null, null, 101, y.b.f823j, Boolean.class);
        f57583h = i.h(t.E(), p374ue.b.t(), null, 100, bVar, false, p374ue.b.class);
        f57584i = i.i(p374ue.c.w0(), 0, null, null, 101, bVar2, Integer.class);
        f57585j = i.h(p374ue.c.w0(), o.W(), null, 102, bVar, false, o.class);
        f57586k = i.i(p374ue.c.w0(), 0, null, null, 103, bVar2, Integer.class);
        f57587l = i.i(p374ue.c.w0(), 0, null, null, 104, bVar2, Integer.class);
        f57588m = i.i(m.E(), 0, null, null, 101, bVar2, Integer.class);
        f57589n = i.h(m.E(), o.W(), null, 102, bVar, false, o.class);
    }

    public static void a(g gVar) {
        gVar.a(f57576a);
        gVar.a(f57577b);
        gVar.a(f57578c);
        gVar.a(f57579d);
        gVar.a(f57580e);
        gVar.a(f57581f);
        gVar.a(f57582g);
        gVar.a(f57583h);
        gVar.a(f57584i);
        gVar.a(f57585j);
        gVar.a(f57586k);
        gVar.a(f57587l);
        gVar.a(f57588m);
        gVar.a(f57589n);
    }
}
