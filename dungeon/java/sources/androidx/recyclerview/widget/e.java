package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class e implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final ThreadLocal f25296e = new ThreadLocal();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static Comparator f25297f = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f25299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f25300c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList f25298a = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList f25301d = new ArrayList();

    static class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f25309d;
            if ((recyclerView == null) != (cVar2.f25309d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z10 = cVar.f25306a;
            if (z10 != cVar2.f25306a) {
                return z10 ? -1 : 1;
            }
            int i10 = cVar2.f25307b - cVar.f25307b;
            if (i10 != 0) {
                return i10;
            }
            int i11 = cVar.f25308c - cVar2.f25308c;
            if (i11 != 0) {
                return i11;
            }
            return 0;
        }
    }

    static class b implements RecyclerView.o.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f25303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int[] f25304c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f25305d;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o.c
        public void a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i11 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i12 = this.f25305d;
            int i13 = i12 * 2;
            int[] iArr = this.f25304c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f25304c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i13 >= iArr.length) {
                int[] iArr3 = new int[i12 * 4];
                this.f25304c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f25304c;
            iArr4[i13] = i10;
            iArr4[i13 + 1] = i11;
            this.f25305d++;
        }

        void b() {
            int[] iArr = this.f25304c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f25305d = 0;
        }

        void c(RecyclerView recyclerView, boolean z10) {
            this.f25305d = 0;
            int[] iArr = this.f25304c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o oVar = recyclerView.f24992m;
            if (recyclerView.f24990l == null || oVar == null || !oVar.y0()) {
                return;
            }
            if (z10) {
                if (!recyclerView.f24974d.p()) {
                    oVar.u(recyclerView.f24990l.c(), this);
                }
            } else if (!recyclerView.l0()) {
                oVar.t(this.f25302a, this.f25303b, recyclerView.f24981g0, this);
            }
            int i10 = this.f25305d;
            if (i10 > oVar.f25072m) {
                oVar.f25072m = i10;
                oVar.f25073n = z10;
                recyclerView.f24970b.K();
            }
        }

        boolean d(int i10) {
            if (this.f25304c != null) {
                int i11 = this.f25305d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f25304c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int i10, int i11) {
            this.f25302a = i10;
            this.f25303b = i11;
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f25306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f25307b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f25308c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RecyclerView f25309d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f25310e;

        c() {
        }

        public void a() {
            this.f25306a = false;
            this.f25307b = 0;
            this.f25308c = 0;
            this.f25309d = null;
            this.f25310e = 0;
        }
    }

    e() {
    }

    private void b() {
        c cVar;
        int size = this.f25298a.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView = (RecyclerView) this.f25298a.get(i11);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f24979f0.c(recyclerView, false);
                i10 += recyclerView.f24979f0.f25305d;
            }
        }
        this.f25301d.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f25298a.get(i13);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f24979f0;
                int iAbs = Math.abs(bVar.f25302a) + Math.abs(bVar.f25303b);
                for (int i14 = 0; i14 < bVar.f25305d * 2; i14 += 2) {
                    if (i12 >= this.f25301d.size()) {
                        cVar = new c();
                        this.f25301d.add(cVar);
                    } else {
                        cVar = (c) this.f25301d.get(i12);
                    }
                    int[] iArr = bVar.f25304c;
                    int i15 = iArr[i14 + 1];
                    cVar.f25306a = i15 <= iAbs;
                    cVar.f25307b = iAbs;
                    cVar.f25308c = i15;
                    cVar.f25309d = recyclerView2;
                    cVar.f25310e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f25301d, f25297f);
    }

    private void c(c cVar, long j10) {
        RecyclerView.C cI = i(cVar.f25309d, cVar.f25310e, cVar.f25306a ? Long.MAX_VALUE : j10);
        if (cI == null || cI.f25025b == null || !cI.s() || cI.t()) {
            return;
        }
        h((RecyclerView) cI.f25025b.get(), j10);
    }

    private void d(long j10) {
        for (int i10 = 0; i10 < this.f25301d.size(); i10++) {
            c cVar = (c) this.f25301d.get(i10);
            if (cVar.f25309d == null) {
                return;
            }
            c(cVar, j10);
            cVar.a();
        }
    }

    static boolean e(RecyclerView recyclerView, int i10) {
        int iJ = recyclerView.f24976e.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            RecyclerView.C cF0 = RecyclerView.f0(recyclerView.f24976e.i(i11));
            if (cF0.f25026c == i10 && !cF0.t()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j10) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.f24947C && recyclerView.f24976e.j() != 0) {
            recyclerView.T0();
        }
        b bVar = recyclerView.f24979f0;
        bVar.c(recyclerView, true);
        if (bVar.f25305d != 0) {
            try {
                p128h1.n.a("RV Nested Prefetch");
                recyclerView.f24981g0.f(recyclerView.f24990l);
                for (int i10 = 0; i10 < bVar.f25305d * 2; i10 += 2) {
                    i(recyclerView, bVar.f25304c[i10], j10);
                }
                p128h1.n.b();
            } catch (Throwable th) {
                p128h1.n.b();
                throw th;
            }
        }
    }

    private RecyclerView.C i(RecyclerView recyclerView, int i10, long j10) {
        if (e(recyclerView, i10)) {
            return null;
        }
        RecyclerView.u uVar = recyclerView.f24970b;
        try {
            recyclerView.F0();
            RecyclerView.C cI = uVar.I(i10, false, j10);
            if (cI != null) {
                if (!cI.s() || cI.t()) {
                    uVar.a(cI, false);
                } else {
                    uVar.B(cI.f25024a);
                }
            }
            return cI;
        } finally {
            recyclerView.H0(false);
        }
    }

    public void a(RecyclerView recyclerView) {
        this.f25298a.add(recyclerView);
    }

    void f(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow() && this.f25299b == 0) {
            this.f25299b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f24979f0.e(i10, i11);
    }

    void g(long j10) {
        b();
        d(j10);
    }

    public void j(RecyclerView recyclerView) {
        this.f25298a.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            p128h1.n.a("RV Prefetch");
            if (!this.f25298a.isEmpty()) {
                int size = this.f25298a.size();
                long jMax = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = (RecyclerView) this.f25298a.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f25300c);
                }
            }
        } finally {
            this.f25299b = 0L;
            p128h1.n.b();
        }
    }
}
