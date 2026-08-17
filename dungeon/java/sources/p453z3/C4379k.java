package p453z3;

import Ad.n;
import L3.e;
import L3.f;
import L3.g;
import Q3.E;
import Q3.p;

/* JADX INFO: renamed from: z3.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4379k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4379k f58435a = new C4379k();

    /* JADX INFO: renamed from: z3.k$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f58436a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f58436a = iArr;
        }
    }

    private C4379k() {
    }

    public static final int a(int i10, int i11, int i12, int i13, e eVar) {
        int iMin;
        int iHighestOneBit = Integer.highestOneBit(i10 / i12);
        int iHighestOneBit2 = Integer.highestOneBit(i11 / i13);
        int i14 = a.f58436a[eVar.ordinal()];
        if (i14 == 1) {
            iMin = Math.min(iHighestOneBit, iHighestOneBit2);
        } else {
            if (i14 != 2) {
                throw new n();
            }
            iMin = Math.max(iHighestOneBit, iHighestOneBit2);
        }
        return kotlin.ranges.e.e(iMin, 1);
    }

    public static final long b(int i10, int i11, f fVar, e eVar, f fVar2) {
        if (!g.b(fVar)) {
            C4379k c4379k = f58435a;
            int iF = c4379k.f(fVar.b(), eVar);
            i11 = c4379k.f(fVar.a(), eVar);
            i10 = iF;
        }
        if ((fVar2.b() instanceof L3.a.C0117a) && !E.m(i10)) {
            i10 = kotlin.ranges.e.i(i10, ((L3.a.C0117a) fVar2.b()).f());
        }
        if ((fVar2.a() instanceof L3.a.C0117a) && !E.m(i11)) {
            i11 = kotlin.ranges.e.i(i11, ((L3.a.C0117a) fVar2.a()).f());
        }
        return p.a(i10, i11);
    }

    public static final double c(double d10, double d11, double d12, double d13, e eVar) {
        double d14 = d12 / d10;
        double d15 = d13 / d11;
        int i10 = a.f58436a[eVar.ordinal()];
        if (i10 == 1) {
            return Math.max(d14, d15);
        }
        if (i10 == 2) {
            return Math.min(d14, d15);
        }
        throw new n();
    }

    public static final double d(int i10, int i11, int i12, int i13, e eVar) {
        double d10 = ((double) i12) / ((double) i10);
        double d11 = ((double) i13) / ((double) i11);
        int i14 = a.f58436a[eVar.ordinal()];
        if (i14 == 1) {
            return Math.max(d10, d11);
        }
        if (i14 == 2) {
            return Math.min(d10, d11);
        }
        throw new n();
    }

    public static final float e(float f10, float f11, float f12, float f13, e eVar) {
        float f14 = f12 / f10;
        float f15 = f13 / f11;
        int i10 = a.f58436a[eVar.ordinal()];
        if (i10 == 1) {
            return Math.max(f14, f15);
        }
        if (i10 == 2) {
            return Math.min(f14, f15);
        }
        throw new n();
    }

    private final int f(L3.a aVar, e eVar) {
        if (aVar instanceof L3.a.C0117a) {
            return ((L3.a.C0117a) aVar).f();
        }
        int i10 = a.f58436a[eVar.ordinal()];
        if (i10 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i10 == 2) {
            return Integer.MAX_VALUE;
        }
        throw new n();
    }
}
