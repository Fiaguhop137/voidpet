package androidx.recyclerview.widget;

import androidx.core.util.Pools$SimplePool;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class a implements h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p199l1.e f25192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList f25193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayList f25194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final InterfaceC0312a f25195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Runnable f25196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f25197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final h f25198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f25199h;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    interface InterfaceC0312a {
        void a(int i10, int i11);

        void b(b bVar);

        void c(b bVar);

        void d(int i10, int i11);

        void e(int i10, int i11, Object obj);

        RecyclerView.C f(int i10);

        void g(int i10, int i11);

        void h(int i10, int i11);
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f25201b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f25202c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f25203d;

        b(int i10, int i11, int i12, Object obj) {
            this.f25200a = i10;
            this.f25201b = i11;
            this.f25203d = i12;
            this.f25202c = obj;
        }

        String a() {
            int i10 = this.f25200a;
            if (i10 == 1) {
                return "add";
            }
            if (i10 == 2) {
                return "rm";
            }
            if (i10 != 4) {
                return i10 != 8 ? "??" : "mv";
            }
            return "up";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f25200a;
            if (i10 != bVar.f25200a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f25203d - this.f25201b) == 1 && this.f25203d == bVar.f25201b && this.f25201b == bVar.f25203d) {
                return true;
            }
            if (this.f25203d != bVar.f25203d || this.f25201b != bVar.f25201b) {
                return false;
            }
            Object obj2 = this.f25202c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f25202c)) {
                    return false;
                }
            } else if (bVar.f25202c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f25200a * 31) + this.f25201b) * 31) + this.f25203d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f25201b + "c:" + this.f25203d + ",p:" + this.f25202c + "]";
        }
    }

    a(InterfaceC0312a interfaceC0312a) {
        this(interfaceC0312a, false);
    }

    a(InterfaceC0312a interfaceC0312a, boolean z10) {
        this.f25192a = new Pools$SimplePool(30);
        this.f25193b = new ArrayList();
        this.f25194c = new ArrayList();
        this.f25199h = 0;
        this.f25195d = interfaceC0312a;
        this.f25197f = z10;
        this.f25198g = new h(this);
    }

    private void c(b bVar) {
        r(bVar);
    }

    private void d(b bVar) {
        r(bVar);
    }

    private void f(b bVar) {
        boolean z10;
        byte b10;
        int i10 = bVar.f25201b;
        int i11 = bVar.f25203d + i10;
        byte b11 = -1;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.f25195d.f(i12) != null || h(i12)) {
                if (b11 == 0) {
                    k(a(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                b10 = 1;
            } else {
                if (b11 == 1) {
                    r(a(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                b10 = 0;
            }
            if (z10) {
                i12 -= i13;
                i11 -= i13;
                i13 = 1;
            } else {
                i13++;
            }
            i12++;
            b11 = b10;
        }
        if (i13 != bVar.f25203d) {
            b(bVar);
            bVar = a(2, i10, i13, null);
        }
        if (b11 == 0) {
            k(bVar);
        } else {
            r(bVar);
        }
    }

    private void g(b bVar) {
        int i10 = bVar.f25201b;
        int i11 = bVar.f25203d + i10;
        int i12 = 0;
        byte b10 = -1;
        int i13 = i10;
        while (i10 < i11) {
            if (this.f25195d.f(i10) != null || h(i10)) {
                if (b10 == 0) {
                    k(a(4, i13, i12, bVar.f25202c));
                    i13 = i10;
                    i12 = 0;
                }
                b10 = 1;
            } else {
                if (b10 == 1) {
                    r(a(4, i13, i12, bVar.f25202c));
                    i13 = i10;
                    i12 = 0;
                }
                b10 = 0;
            }
            i12++;
            i10++;
        }
        if (i12 != bVar.f25203d) {
            Object obj = bVar.f25202c;
            b(bVar);
            bVar = a(4, i13, i12, obj);
        }
        if (b10 == 0) {
            k(bVar);
        } else {
            r(bVar);
        }
    }

    private boolean h(int i10) {
        int size = this.f25194c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) this.f25194c.get(i11);
            int i12 = bVar.f25200a;
            if (i12 == 8) {
                if (n(bVar.f25203d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f25201b;
                int i14 = bVar.f25203d + i13;
                while (i13 < i14) {
                    if (n(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i10;
        int i11 = bVar.f25200a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iV = v(bVar.f25201b, i11);
        int i12 = bVar.f25201b;
        int i13 = bVar.f25200a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f25203d; i15++) {
            int iV2 = v(bVar.f25201b + (i10 * i15), bVar.f25200a);
            int i16 = bVar.f25200a;
            if (i16 == 2 ? iV2 != iV : !(i16 == 4 && iV2 == iV + 1)) {
                b bVarA = a(i16, iV, i14, bVar.f25202c);
                l(bVarA, i12);
                b(bVarA);
                if (bVar.f25200a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                iV = iV2;
            } else {
                i14++;
            }
        }
        Object obj = bVar.f25202c;
        b(bVar);
        if (i14 > 0) {
            b bVarA2 = a(bVar.f25200a, iV, i14, obj);
            l(bVarA2, i12);
            b(bVarA2);
        }
    }

    private void r(b bVar) {
        this.f25194c.add(bVar);
        int i10 = bVar.f25200a;
        if (i10 == 1) {
            this.f25195d.g(bVar.f25201b, bVar.f25203d);
            return;
        }
        if (i10 == 2) {
            this.f25195d.d(bVar.f25201b, bVar.f25203d);
            return;
        }
        if (i10 == 4) {
            this.f25195d.e(bVar.f25201b, bVar.f25203d, bVar.f25202c);
        } else {
            if (i10 == 8) {
                this.f25195d.a(bVar.f25201b, bVar.f25203d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int v(int i10, int i11) {
        int i12;
        int i13;
        for (int size = this.f25194c.size() - 1; size >= 0; size--) {
            b bVar = (b) this.f25194c.get(size);
            int i14 = bVar.f25200a;
            if (i14 == 8) {
                int i15 = bVar.f25201b;
                int i16 = bVar.f25203d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            bVar.f25201b = i15 + 1;
                            bVar.f25203d = i16 + 1;
                        } else if (i11 == 2) {
                            bVar.f25201b = i15 - 1;
                            bVar.f25203d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        bVar.f25203d = i16 + 1;
                    } else if (i11 == 2) {
                        bVar.f25203d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        bVar.f25201b = i15 + 1;
                    } else if (i11 == 2) {
                        bVar.f25201b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = bVar.f25201b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= bVar.f25203d;
                    } else if (i14 == 2) {
                        i10 += bVar.f25203d;
                    }
                } else if (i11 == 1) {
                    bVar.f25201b = i17 + 1;
                } else if (i11 == 2) {
                    bVar.f25201b = i17 - 1;
                }
            }
        }
        for (int size2 = this.f25194c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = (b) this.f25194c.get(size2);
            if (bVar2.f25200a == 8) {
                int i18 = bVar2.f25203d;
                if (i18 == bVar2.f25201b || i18 < 0) {
                    this.f25194c.remove(size2);
                    b(bVar2);
                }
            } else if (bVar2.f25203d <= 0) {
                this.f25194c.remove(size2);
                b(bVar2);
            }
        }
        return i10;
    }

    @Override // androidx.recyclerview.widget.h.a
    public b a(int i10, int i11, int i12, Object obj) {
        b bVar = (b) this.f25192a.acquire();
        if (bVar == null) {
            return new b(i10, i11, i12, obj);
        }
        bVar.f25200a = i10;
        bVar.f25201b = i11;
        bVar.f25203d = i12;
        bVar.f25202c = obj;
        return bVar;
    }

    @Override // androidx.recyclerview.widget.h.a
    public void b(b bVar) {
        if (this.f25197f) {
            return;
        }
        bVar.f25202c = null;
        this.f25192a.a(bVar);
    }

    public int e(int i10) {
        int size = this.f25193b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) this.f25193b.get(i11);
            int i12 = bVar.f25200a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f25201b;
                    if (i13 <= i10) {
                        int i14 = bVar.f25203d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f25201b;
                    if (i15 == i10) {
                        i10 = bVar.f25203d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f25203d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f25201b <= i10) {
                i10 += bVar.f25203d;
            }
        }
        return i10;
    }

    void i() {
        int size = this.f25194c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f25195d.c((b) this.f25194c.get(i10));
        }
        t(this.f25194c);
        this.f25199h = 0;
    }

    void j() {
        i();
        int size = this.f25193b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) this.f25193b.get(i10);
            int i11 = bVar.f25200a;
            if (i11 == 1) {
                this.f25195d.c(bVar);
                this.f25195d.g(bVar.f25201b, bVar.f25203d);
            } else if (i11 == 2) {
                this.f25195d.c(bVar);
                this.f25195d.h(bVar.f25201b, bVar.f25203d);
            } else if (i11 == 4) {
                this.f25195d.c(bVar);
                this.f25195d.e(bVar.f25201b, bVar.f25203d, bVar.f25202c);
            } else if (i11 == 8) {
                this.f25195d.c(bVar);
                this.f25195d.a(bVar.f25201b, bVar.f25203d);
            }
            Runnable runnable = this.f25196e;
            if (runnable != null) {
                runnable.run();
            }
        }
        t(this.f25193b);
        this.f25199h = 0;
    }

    void l(b bVar, int i10) {
        this.f25195d.b(bVar);
        int i11 = bVar.f25200a;
        if (i11 == 2) {
            this.f25195d.h(i10, bVar.f25203d);
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f25195d.e(i10, bVar.f25203d, bVar.f25202c);
        }
    }

    int m(int i10) {
        return n(i10, 0);
    }

    int n(int i10, int i11) {
        int size = this.f25194c.size();
        while (i11 < size) {
            b bVar = (b) this.f25194c.get(i11);
            int i12 = bVar.f25200a;
            if (i12 == 8) {
                int i13 = bVar.f25201b;
                if (i13 == i10) {
                    i10 = bVar.f25203d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f25203d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f25201b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f25203d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f25203d;
                }
            }
            i11++;
        }
        return i10;
    }

    boolean o(int i10) {
        return (i10 & this.f25199h) != 0;
    }

    boolean p() {
        return this.f25193b.size() > 0;
    }

    boolean q() {
        return (this.f25194c.isEmpty() || this.f25193b.isEmpty()) ? false : true;
    }

    void s() {
        this.f25198g.b(this.f25193b);
        int size = this.f25193b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) this.f25193b.get(i10);
            int i11 = bVar.f25200a;
            if (i11 == 1) {
                c(bVar);
            } else if (i11 == 2) {
                f(bVar);
            } else if (i11 == 4) {
                g(bVar);
            } else if (i11 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f25196e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f25193b.clear();
    }

    void t(List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            b((b) list.get(i10));
        }
        list.clear();
    }

    void u() {
        t(this.f25193b);
        t(this.f25194c);
        this.f25199h = 0;
    }
}
