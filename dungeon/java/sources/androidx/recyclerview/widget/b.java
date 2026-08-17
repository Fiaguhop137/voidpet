package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final InterfaceC0313b f25204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final a f25205b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final List f25206c = new ArrayList();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f25207a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        a f25208b;

        a() {
        }

        private void c() {
            if (this.f25208b == null) {
                this.f25208b = new a();
            }
        }

        void a(int i10) {
            if (i10 < 64) {
                this.f25207a &= ~(1 << i10);
                return;
            }
            a aVar = this.f25208b;
            if (aVar != null) {
                aVar.a(i10 - 64);
            }
        }

        int b(int i10) {
            a aVar = this.f25208b;
            if (aVar == null) {
                return i10 >= 64 ? Long.bitCount(this.f25207a) : Long.bitCount(this.f25207a & ((1 << i10) - 1));
            }
            return i10 < 64 ? Long.bitCount(this.f25207a & ((1 << i10) - 1)) : aVar.b(i10 - 64) + Long.bitCount(this.f25207a);
        }

        boolean d(int i10) {
            if (i10 < 64) {
                return (this.f25207a & (1 << i10)) != 0;
            }
            c();
            return this.f25208b.d(i10 - 64);
        }

        void e(int i10, boolean z10) {
            if (i10 >= 64) {
                c();
                this.f25208b.e(i10 - 64, z10);
                return;
            }
            long j10 = this.f25207a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f25207a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.f25208b != null) {
                c();
                this.f25208b.e(0, z11);
            }
        }

        boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.f25208b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f25207a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f25207a = j12;
            long j13 = j10 - 1;
            this.f25207a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f25208b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f25208b.f(0);
            }
            return z10;
        }

        void g() {
            this.f25207a = 0L;
            a aVar = this.f25208b;
            if (aVar != null) {
                aVar.g();
            }
        }

        void h(int i10) {
            if (i10 < 64) {
                this.f25207a |= 1 << i10;
            } else {
                c();
                this.f25208b.h(i10 - 64);
            }
        }

        public String toString() {
            if (this.f25208b == null) {
                return Long.toBinaryString(this.f25207a);
            }
            return this.f25208b.toString() + "xx" + Long.toBinaryString(this.f25207a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.b$b, reason: collision with other inner class name */
    interface InterfaceC0313b {
        View a(int i10);

        int b();

        void c(View view);

        RecyclerView.C d(View view);

        void e(int i10);

        void f(View view, int i10);

        void g();

        int h(View view);

        void i(View view);

        void j(int i10);

        void k(View view, int i10, ViewGroup.LayoutParams layoutParams);
    }

    b(InterfaceC0313b interfaceC0313b) {
        this.f25204a = interfaceC0313b;
    }

    private int h(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int iB = this.f25204a.b();
        int i11 = i10;
        while (i11 < iB) {
            int iB2 = i10 - (i11 - this.f25205b.b(i11));
            if (iB2 == 0) {
                while (this.f25205b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += iB2;
        }
        return -1;
    }

    private void l(View view) {
        this.f25206c.add(view);
        this.f25204a.c(view);
    }

    private boolean t(View view) {
        if (!this.f25206c.remove(view)) {
            return false;
        }
        this.f25204a.i(view);
        return true;
    }

    void a(View view, int i10, boolean z10) {
        int iB = i10 < 0 ? this.f25204a.b() : h(i10);
        this.f25205b.e(iB, z10);
        if (z10) {
            l(view);
        }
        this.f25204a.f(view, iB);
    }

    void b(View view, boolean z10) {
        a(view, -1, z10);
    }

    void c(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int iB = i10 < 0 ? this.f25204a.b() : h(i10);
        this.f25205b.e(iB, z10);
        if (z10) {
            l(view);
        }
        this.f25204a.k(view, iB, layoutParams);
    }

    void d(int i10) {
        int iH = h(i10);
        this.f25205b.f(iH);
        this.f25204a.e(iH);
    }

    View e(int i10) {
        int size = this.f25206c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) this.f25206c.get(i11);
            RecyclerView.C cD = this.f25204a.d(view);
            if (cD.m() == i10 && !cD.t() && !cD.v()) {
                return view;
            }
        }
        return null;
    }

    View f(int i10) {
        return this.f25204a.a(h(i10));
    }

    int g() {
        return this.f25204a.b() - this.f25206c.size();
    }

    View i(int i10) {
        return this.f25204a.a(i10);
    }

    int j() {
        return this.f25204a.b();
    }

    void k(View view) {
        int iH = this.f25204a.h(view);
        if (iH >= 0) {
            this.f25205b.h(iH);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    int m(View view) {
        int iH = this.f25204a.h(view);
        if (iH == -1 || this.f25205b.d(iH)) {
            return -1;
        }
        return iH - this.f25205b.b(iH);
    }

    boolean n(View view) {
        return this.f25206c.contains(view);
    }

    void o() {
        this.f25205b.g();
        for (int size = this.f25206c.size() - 1; size >= 0; size--) {
            this.f25204a.i((View) this.f25206c.get(size));
            this.f25206c.remove(size);
        }
        this.f25204a.g();
    }

    void p(View view) {
        int iH = this.f25204a.h(view);
        if (iH < 0) {
            return;
        }
        if (this.f25205b.f(iH)) {
            t(view);
        }
        this.f25204a.j(iH);
    }

    void q(int i10) {
        int iH = h(i10);
        View viewA = this.f25204a.a(iH);
        if (viewA == null) {
            return;
        }
        if (this.f25205b.f(iH)) {
            t(viewA);
        }
        this.f25204a.j(iH);
    }

    boolean r(View view) {
        int iH = this.f25204a.h(view);
        if (iH == -1) {
            t(view);
            return true;
        }
        if (!this.f25205b.d(iH)) {
            return false;
        }
        this.f25205b.f(iH);
        t(view);
        this.f25204a.j(iH);
        return true;
    }

    void s(View view) {
        int iH = this.f25204a.h(view);
        if (iH < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f25205b.d(iH)) {
            this.f25205b.a(iH);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f25205b.toString() + ", hidden list:" + this.f25206c.size();
    }
}
