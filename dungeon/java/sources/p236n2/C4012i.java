package p236n2;

import C9.AbstractC0876t;
import U1.AbstractC1459a;
import Z1.U0;
import java.util.List;

/* JADX INFO: renamed from: n2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4012i implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0876t f49802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f49803b;

    /* JADX INFO: renamed from: n2.i$a */
    private static final class a implements d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d0 f49804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AbstractC0876t f49805b;

        public a(d0 d0Var, List list) {
            this.f49804a = d0Var;
            this.f49805b = AbstractC0876t.p(list);
        }

        public AbstractC0876t a() {
            return this.f49805b;
        }

        @Override // p236n2.d0
        public long b() {
            return this.f49804a.b();
        }

        @Override // p236n2.d0
        public boolean c() {
            return this.f49804a.c();
        }

        @Override // p236n2.d0
        public boolean d(U0 u10) {
            return this.f49804a.d(u10);
        }

        @Override // p236n2.d0
        public long g() {
            return this.f49804a.g();
        }

        @Override // p236n2.d0
        public void h(long j10) {
            this.f49804a.h(j10);
        }
    }

    public C4012i(List list, List list2) {
        AbstractC0876t.a aVarL = AbstractC0876t.l();
        AbstractC1459a.a(list.size() == list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            aVarL.a(new a((d0) list.get(i10), (List) list2.get(i10)));
        }
        this.f49802a = aVarL.k();
        this.f49803b = -9223372036854775807L;
    }

    @Override // p236n2.d0
    public long b() {
        long jMin = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.f49802a.size(); i10++) {
            long jB = ((a) this.f49802a.get(i10)).b();
            if (jB != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jB);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // p236n2.d0
    public boolean c() {
        for (int i10 = 0; i10 < this.f49802a.size(); i10++) {
            if (((a) this.f49802a.get(i10)).c()) {
                return true;
            }
        }
        return false;
    }

    @Override // p236n2.d0
    public boolean d(U0 u10) {
        boolean zD;
        boolean z10 = false;
        do {
            long jB = b();
            if (jB == Long.MIN_VALUE) {
                return z10;
            }
            zD = false;
            for (int i10 = 0; i10 < this.f49802a.size(); i10++) {
                long jB2 = ((a) this.f49802a.get(i10)).b();
                boolean z11 = jB2 != Long.MIN_VALUE && jB2 <= u10.f18166a;
                if (jB2 == jB || z11) {
                    zD |= ((a) this.f49802a.get(i10)).d(u10);
                }
            }
            z10 |= zD;
        } while (zD);
        return z10;
    }

    @Override // p236n2.d0
    public long g() {
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.f49802a.size(); i10++) {
            a aVar = (a) this.f49802a.get(i10);
            long jG = aVar.g();
            if ((aVar.a().contains(1) || aVar.a().contains(2) || aVar.a().contains(4)) && jG != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jG);
            }
            if (jG != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jG);
            }
        }
        if (jMin != Long.MAX_VALUE) {
            this.f49803b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j10 = this.f49803b;
        return j10 != -9223372036854775807L ? j10 : jMin2;
    }

    @Override // p236n2.d0
    public void h(long j10) {
        for (int i10 = 0; i10 < this.f49802a.size(); i10++) {
            ((a) this.f49802a.get(i10)).h(j10);
        }
    }
}
