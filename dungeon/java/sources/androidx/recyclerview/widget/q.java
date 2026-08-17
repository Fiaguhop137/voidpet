package androidx.recyclerview.widget;

import androidx.core.util.Pools$SimplePool;
import p323s.C4123x;
import p323s.f0;

/* JADX INFO: loaded from: classes.dex */
class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final f0 f25352a = new f0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final C4123x f25353b = new C4123x();

    static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static p199l1.e f25354d = new Pools$SimplePool(20);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        RecyclerView.l.b f25356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        RecyclerView.l.b f25357c;

        private a() {
        }

        static void a() {
            while (f25354d.acquire() != null) {
            }
        }

        static a b() {
            a aVar = (a) f25354d.acquire();
            return aVar == null ? new a() : aVar;
        }

        static void c(a aVar) {
            aVar.f25355a = 0;
            aVar.f25356b = null;
            aVar.f25357c = null;
            f25354d.a(aVar);
        }
    }

    interface b {
        void a(RecyclerView.C c10, RecyclerView.l.b bVar, RecyclerView.l.b bVar2);

        void b(RecyclerView.C c10);

        void c(RecyclerView.C c10, RecyclerView.l.b bVar, RecyclerView.l.b bVar2);

        void d(RecyclerView.C c10, RecyclerView.l.b bVar, RecyclerView.l.b bVar2);
    }

    q() {
    }

    private RecyclerView.l.b l(RecyclerView.C c10, int i10) {
        a aVar;
        RecyclerView.l.b bVar;
        int iD = this.f25352a.d(c10);
        if (iD >= 0 && (aVar = (a) this.f25352a.k(iD)) != null) {
            int i11 = aVar.f25355a;
            if ((i11 & i10) != 0) {
                int i12 = (~i10) & i11;
                aVar.f25355a = i12;
                if (i10 == 4) {
                    bVar = aVar.f25356b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    bVar = aVar.f25357c;
                }
                if ((i12 & 12) == 0) {
                    this.f25352a.h(iD);
                    a.c(aVar);
                }
                return bVar;
            }
        }
        return null;
    }

    void a(RecyclerView.C c10, RecyclerView.l.b bVar) {
        a aVarB = (a) this.f25352a.get(c10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f25352a.put(c10, aVarB);
        }
        aVarB.f25355a |= 2;
        aVarB.f25356b = bVar;
    }

    void b(RecyclerView.C c10) {
        a aVarB = (a) this.f25352a.get(c10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f25352a.put(c10, aVarB);
        }
        aVarB.f25355a |= 1;
    }

    void c(long j10, RecyclerView.C c10) {
        this.f25353b.j(j10, c10);
    }

    void d(RecyclerView.C c10, RecyclerView.l.b bVar) {
        a aVarB = (a) this.f25352a.get(c10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f25352a.put(c10, aVarB);
        }
        aVarB.f25357c = bVar;
        aVarB.f25355a |= 8;
    }

    void e(RecyclerView.C c10, RecyclerView.l.b bVar) {
        a aVarB = (a) this.f25352a.get(c10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f25352a.put(c10, aVarB);
        }
        aVarB.f25356b = bVar;
        aVarB.f25355a |= 4;
    }

    void f() {
        this.f25352a.clear();
        this.f25353b.b();
    }

    RecyclerView.C g(long j10) {
        return (RecyclerView.C) this.f25353b.e(j10);
    }

    boolean h(RecyclerView.C c10) {
        a aVar = (a) this.f25352a.get(c10);
        return (aVar == null || (aVar.f25355a & 1) == 0) ? false : true;
    }

    boolean i(RecyclerView.C c10) {
        a aVar = (a) this.f25352a.get(c10);
        return (aVar == null || (aVar.f25355a & 4) == 0) ? false : true;
    }

    void j() {
        a.a();
    }

    public void k(RecyclerView.C c10) {
        p(c10);
    }

    RecyclerView.l.b m(RecyclerView.C c10) {
        return l(c10, 8);
    }

    RecyclerView.l.b n(RecyclerView.C c10) {
        return l(c10, 4);
    }

    void o(b bVar) {
        for (int size = this.f25352a.size() - 1; size >= 0; size--) {
            RecyclerView.C c10 = (RecyclerView.C) this.f25352a.f(size);
            a aVar = (a) this.f25352a.h(size);
            int i10 = aVar.f25355a;
            if ((i10 & 3) == 3) {
                bVar.b(c10);
            } else if ((i10 & 1) != 0) {
                RecyclerView.l.b bVar2 = aVar.f25356b;
                if (bVar2 == null) {
                    bVar.b(c10);
                } else {
                    bVar.c(c10, bVar2, aVar.f25357c);
                }
            } else if ((i10 & 14) == 14) {
                bVar.a(c10, aVar.f25356b, aVar.f25357c);
            } else if ((i10 & 12) == 12) {
                bVar.d(c10, aVar.f25356b, aVar.f25357c);
            } else if ((i10 & 4) != 0) {
                bVar.c(c10, aVar.f25356b, null);
            } else if ((i10 & 8) != 0) {
                bVar.a(c10, aVar.f25356b, aVar.f25357c);
            }
            a.c(aVar);
        }
    }

    void p(RecyclerView.C c10) {
        a aVar = (a) this.f25352a.get(c10);
        if (aVar == null) {
            return;
        }
        aVar.f25355a &= -2;
    }

    void q(RecyclerView.C c10) {
        for (int iN = this.f25353b.n() - 1; iN >= 0; iN--) {
            if (c10 == this.f25353b.o(iN)) {
                this.f25353b.m(iN);
                break;
            }
        }
        a aVar = (a) this.f25352a.remove(c10);
        if (aVar != null) {
            a.c(aVar);
        }
    }
}
