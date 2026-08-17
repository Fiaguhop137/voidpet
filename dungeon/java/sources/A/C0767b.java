package A;

import kotlin.collections.AbstractC3952n;

/* JADX INFO: renamed from: A.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0767b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0767b f35a = new C0767b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d f36b = new i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final d f37c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final k f38d = new j();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final k f39e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final e f40f = new C0000b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final e f41g = new h();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final e f42h = new g();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final e f43i = new f();

    /* JADX INFO: renamed from: A.b$a */
    public static final class a implements k {
        a() {
        }

        @Override // A.C0767b.k
        public void b(O0.d dVar, int i10, int[] iArr, int[] iArr2) {
            C0767b.f35a.f(i10, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Bottom";
        }
    }

    /* JADX INFO: renamed from: A.b$b, reason: collision with other inner class name */
    public static final class C0000b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f44a = O0.h.o(0);

        C0000b() {
        }

        @Override // A.C0767b.d, A.C0767b.k
        public float a() {
            return this.f44a;
        }

        @Override // A.C0767b.k
        public void b(O0.d dVar, int i10, int[] iArr, int[] iArr2) {
            C0767b.f35a.d(i10, iArr, iArr2, false);
        }

        @Override // A.C0767b.d
        public void c(O0.d dVar, int i10, int[] iArr, O0.t tVar, int[] iArr2) {
            if (tVar == O0.t.Ltr) {
                C0767b.f35a.d(i10, iArr, iArr2, false);
            } else {
                C0767b.f35a.d(i10, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Center";
        }
    }

    /* JADX INFO: renamed from: A.b$c */
    public static final class c implements d {
        c() {
        }

        @Override // A.C0767b.d
        public void c(O0.d dVar, int i10, int[] iArr, O0.t tVar, int[] iArr2) {
            if (tVar == O0.t.Ltr) {
                C0767b.f35a.f(i10, iArr, iArr2, false);
            } else {
                C0767b.f35a.e(iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#End";
        }
    }

    /* JADX INFO: renamed from: A.b$d */
    public interface d {
        default float a() {
            return O0.h.o(0);
        }

        void c(O0.d dVar, int i10, int[] iArr, O0.t tVar, int[] iArr2);
    }

    /* JADX INFO: renamed from: A.b$e */
    public interface e extends d, k {
    }

    /* JADX INFO: renamed from: A.b$f */
    public static final class f implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f45a = O0.h.o(0);

        f() {
        }

        @Override // A.C0767b.d, A.C0767b.k
        public float a() {
            return this.f45a;
        }

        @Override // A.C0767b.k
        public void b(O0.d dVar, int i10, int[] iArr, int[] iArr2) {
            C0767b.f35a.g(i10, iArr, iArr2, false);
        }

        @Override // A.C0767b.d
        public void c(O0.d dVar, int i10, int[] iArr, O0.t tVar, int[] iArr2) {
            if (tVar == O0.t.Ltr) {
                C0767b.f35a.g(i10, iArr, iArr2, false);
            } else {
                C0767b.f35a.g(i10, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    /* JADX INFO: renamed from: A.b$g */
    public static final class g implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f46a = O0.h.o(0);

        g() {
        }

        @Override // A.C0767b.d, A.C0767b.k
        public float a() {
            return this.f46a;
        }

        @Override // A.C0767b.k
        public void b(O0.d dVar, int i10, int[] iArr, int[] iArr2) {
            C0767b.f35a.h(i10, iArr, iArr2, false);
        }

        @Override // A.C0767b.d
        public void c(O0.d dVar, int i10, int[] iArr, O0.t tVar, int[] iArr2) {
            if (tVar == O0.t.Ltr) {
                C0767b.f35a.h(i10, iArr, iArr2, false);
            } else {
                C0767b.f35a.h(i10, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    /* JADX INFO: renamed from: A.b$h */
    public static final class h implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f47a = O0.h.o(0);

        h() {
        }

        @Override // A.C0767b.d, A.C0767b.k
        public float a() {
            return this.f47a;
        }

        @Override // A.C0767b.k
        public void b(O0.d dVar, int i10, int[] iArr, int[] iArr2) {
            C0767b.f35a.i(i10, iArr, iArr2, false);
        }

        @Override // A.C0767b.d
        public void c(O0.d dVar, int i10, int[] iArr, O0.t tVar, int[] iArr2) {
            if (tVar == O0.t.Ltr) {
                C0767b.f35a.i(i10, iArr, iArr2, false);
            } else {
                C0767b.f35a.i(i10, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    /* JADX INFO: renamed from: A.b$i */
    public static final class i implements d {
        i() {
        }

        @Override // A.C0767b.d
        public void c(O0.d dVar, int i10, int[] iArr, O0.t tVar, int[] iArr2) {
            if (tVar == O0.t.Ltr) {
                C0767b.f35a.e(iArr, iArr2, false);
            } else {
                C0767b.f35a.f(i10, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Start";
        }
    }

    /* JADX INFO: renamed from: A.b$j */
    public static final class j implements k {
        j() {
        }

        @Override // A.C0767b.k
        public void b(O0.d dVar, int i10, int[] iArr, int[] iArr2) {
            C0767b.f35a.e(iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Top";
        }
    }

    /* JADX INFO: renamed from: A.b$k */
    public interface k {
        default float a() {
            return O0.h.o(0);
        }

        void b(O0.d dVar, int i10, int[] iArr, int[] iArr2);
    }

    private C0767b() {
    }

    public final e a() {
        return f40f;
    }

    public final d b() {
        return f36b;
    }

    public final k c() {
        return f38d;
    }

    public final void d(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float f10 = (i10 - i12) / 2;
        if (!z10) {
            int length = iArr.length;
            int i14 = 0;
            while (i11 < length) {
                int i15 = iArr[i11];
                iArr2[i14] = Math.round(f10);
                f10 += i15;
                i11++;
                i14++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i16 = iArr[length2];
            iArr2[length2] = Math.round(f10);
            f10 += i16;
        }
    }

    public final void e(int[] iArr, int[] iArr2, boolean z10) {
        int i10 = 0;
        if (!z10) {
            int length = iArr.length;
            int i11 = 0;
            int i12 = 0;
            while (i10 < length) {
                int i13 = iArr[i10];
                iArr2[i11] = i12;
                i12 += i13;
                i10++;
                i11++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i14 = iArr[length2];
            iArr2[length2] = i10;
            i10 += i14;
        }
    }

    public final void f(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        int i14 = i10 - i12;
        if (!z10) {
            int length = iArr.length;
            int i15 = 0;
            while (i11 < length) {
                int i16 = iArr[i11];
                iArr2[i15] = i14;
                i14 += i16;
                i11++;
                i15++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i17 = iArr[length2];
            iArr2[length2] = i14;
            i14 += i17;
        }
    }

    public final void g(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float length = !(iArr.length == 0) ? (i10 - i12) / iArr.length : 0.0f;
        float f10 = length / 2;
        if (z10) {
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i14 = iArr[length2];
                iArr2[length2] = Math.round(f10);
                f10 += i14 + length;
            }
            return;
        }
        int length3 = iArr.length;
        int i15 = 0;
        while (i11 < length3) {
            int i16 = iArr[i11];
            iArr2[i15] = Math.round(f10);
            f10 += i16 + length;
            i11++;
            i15++;
        }
    }

    public final void h(int i10, int[] iArr, int[] iArr2, boolean z10) {
        if (iArr.length == 0) {
            return;
        }
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float fMax = (i10 - i12) / Math.max(AbstractC3952n.V(iArr), 1);
        float f10 = (z10 && iArr.length == 1) ? fMax : 0.0f;
        if (z10) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i14 = iArr[length];
                iArr2[length] = Math.round(f10);
                f10 += i14 + fMax;
            }
            return;
        }
        int length2 = iArr.length;
        int i15 = 0;
        while (i11 < length2) {
            int i16 = iArr[i11];
            iArr2[i15] = Math.round(f10);
            f10 += i16 + fMax;
            i11++;
            i15++;
        }
    }

    public final void i(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float length = (i10 - i12) / (iArr.length + 1);
        if (z10) {
            float f10 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i14 = iArr[length2];
                iArr2[length2] = Math.round(f10);
                f10 += i14 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f11 = length;
        int i15 = 0;
        while (i11 < length3) {
            int i16 = iArr[i11];
            iArr2[i15] = Math.round(f11);
            f11 += i16 + length;
            i11++;
            i15++;
        }
    }
}
