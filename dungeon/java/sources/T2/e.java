package T2;

import S2.k;
import S2.l;
import S2.p;
import S2.q;
import U1.AbstractC1459a;
import U1.S;
import Y1.g;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
abstract class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque f12091a = new ArrayDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque f12092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque f12093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f12094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f12095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f12096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f12097g;

    private static final class b extends p implements Comparable {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f12098k;

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if (t() != bVar.t()) {
                return t() ? 1 : -1;
            }
            long j10 = this.f16813f - bVar.f16813f;
            if (j10 == 0) {
                j10 = this.f12098k - bVar.f12098k;
                if (j10 == 0) {
                    return 0;
                }
            }
            return j10 > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends q {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private g.a f12099g;

        public c(g.a aVar) {
            this.f12099g = aVar;
        }

        @Override // Y1.g
        public final void z() {
            this.f12099g.a(this);
        }
    }

    public e() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f12091a.add(new b(null));
        }
        this.f12092b = new ArrayDeque();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f12092b.add(new c(new d(this)));
        }
        this.f12093c = new ArrayDeque();
        this.f12097g = -9223372036854775807L;
    }

    private void o(b bVar) {
        bVar.p();
        this.f12091a.add(bVar);
    }

    @Override // S2.l
    public void b(long j10) {
        this.f12095e = j10;
    }

    @Override // Y1.d
    public final void e(long j10) {
        this.f12097g = j10;
    }

    @Override // Y1.d
    public void flush() {
        this.f12096f = 0L;
        this.f12095e = 0L;
        while (!this.f12093c.isEmpty()) {
            o((b) S.i((b) this.f12093c.poll()));
        }
        b bVar = this.f12094d;
        if (bVar != null) {
            o(bVar);
            this.f12094d = null;
        }
    }

    protected abstract k g();

    protected abstract void h(p pVar);

    @Override // Y1.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public p f() {
        AbstractC1459a.g(this.f12094d == null);
        if (this.f12091a.isEmpty()) {
            return null;
        }
        b bVar = (b) this.f12091a.pollFirst();
        this.f12094d = bVar;
        return bVar;
    }

    @Override // Y1.d
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public q a() {
        if (this.f12092b.isEmpty()) {
            return null;
        }
        while (!this.f12093c.isEmpty() && ((b) S.i((b) this.f12093c.peek())).f16813f <= this.f12095e) {
            b bVar = (b) S.i((b) this.f12093c.poll());
            if (bVar.t()) {
                q qVar = (q) S.i((q) this.f12092b.pollFirst());
                qVar.o(4);
                o(bVar);
                return qVar;
            }
            h(bVar);
            if (m()) {
                k kVarG = g();
                q qVar2 = (q) S.i((q) this.f12092b.pollFirst());
                qVar2.A(bVar.f16813f, kVarG, Long.MAX_VALUE);
                o(bVar);
                return qVar2;
            }
            o(bVar);
        }
        return null;
    }

    protected final q k() {
        return (q) this.f12092b.pollFirst();
    }

    protected final long l() {
        return this.f12095e;
    }

    protected abstract boolean m();

    /* JADX WARN: Code duplicated, block: B:15:0x002d  */
    @Override // Y1.d
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void d(p pVar) {
        AbstractC1459a.a(pVar == this.f12094d);
        b bVar = (b) pVar;
        if (bVar.t()) {
            long j10 = this.f12096f;
            this.f12096f = 1 + j10;
            bVar.f12098k = j10;
            this.f12093c.add(bVar);
        } else {
            long j11 = bVar.f16813f;
            if (j11 != Long.MIN_VALUE) {
                long j12 = this.f12097g;
                if (j12 == -9223372036854775807L || j11 >= j12) {
                    long j13 = this.f12096f;
                    this.f12096f = 1 + j13;
                    bVar.f12098k = j13;
                    this.f12093c.add(bVar);
                } else {
                    o(bVar);
                }
            } else {
                long j14 = this.f12096f;
                this.f12096f = 1 + j14;
                bVar.f12098k = j14;
                this.f12093c.add(bVar);
            }
        }
        this.f12094d = null;
    }

    protected void p(q qVar) {
        qVar.p();
        this.f12092b.add(qVar);
    }

    @Override // Y1.d
    public void release() {
    }
}
