package S;

import kotlin.collections.AbstractC3952n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: S.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1435o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f11386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f11387b = r.b(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f11388c = new int[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f11389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11390e;

    public C1435o() {
        int[] iArr = new int[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            iArr[i10] = i11;
            i10 = i11;
        }
        this.f11389d = iArr;
    }

    private final int b() {
        int length = this.f11389d.length;
        if (this.f11390e >= length) {
            int i10 = length * 2;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                iArr[i11] = i12;
                i11 = i12;
            }
            AbstractC3952n.o(this.f11389d, iArr, 0, 0, 0, 14, null);
            this.f11389d = iArr;
        }
        int i13 = this.f11390e;
        this.f11390e = this.f11389d[i13];
        return i13;
    }

    private final void c(int i10) {
        int length = this.f11387b.length;
        if (i10 <= length) {
            return;
        }
        int i11 = length * 2;
        long[] jArrB = r.b(i11);
        int[] iArr = new int[i11];
        AbstractC3952n.p(this.f11387b, jArrB, 0, 0, 0, 12, null);
        AbstractC3952n.o(this.f11388c, iArr, 0, 0, 0, 14, null);
        this.f11387b = jArrB;
        this.f11388c = iArr;
    }

    private final void d(int i10) {
        this.f11389d[i10] = this.f11390e;
        this.f11390e = i10;
    }

    private final void g(int i10) {
        long[] jArr = this.f11387b;
        int i11 = this.f11386a >> 1;
        while (i10 < i11) {
            int i12 = (i10 + 1) << 1;
            int i13 = i12 - 1;
            if (i12 >= this.f11386a || Intrinsics.f(jArr[i12], jArr[i13]) >= 0) {
                if (Intrinsics.f(jArr[i13], jArr[i10]) >= 0) {
                    return;
                }
                i(i13, i10);
                i10 = i13;
            } else {
                if (Intrinsics.f(jArr[i12], jArr[i10]) >= 0) {
                    return;
                }
                i(i12, i10);
                i10 = i12;
            }
        }
    }

    private final void h(int i10) {
        long[] jArr = this.f11387b;
        long j10 = jArr[i10];
        while (i10 > 0) {
            int i11 = ((i10 + 1) >> 1) - 1;
            if (Intrinsics.f(jArr[i11], j10) <= 0) {
                return;
            }
            i(i11, i10);
            i10 = i11;
        }
    }

    private final void i(int i10, int i11) {
        long[] jArr = this.f11387b;
        int[] iArr = this.f11388c;
        int[] iArr2 = this.f11389d;
        long j10 = jArr[i10];
        jArr[i10] = jArr[i11];
        jArr[i11] = j10;
        int i12 = iArr[i10];
        int i13 = iArr[i11];
        iArr[i10] = i13;
        iArr[i11] = i12;
        iArr2[i13] = i10;
        iArr2[i12] = i11;
    }

    public final int a(long j10) {
        c(this.f11386a + 1);
        int i10 = this.f11386a;
        this.f11386a = i10 + 1;
        int iB = b();
        this.f11387b[i10] = j10;
        this.f11388c[i10] = iB;
        this.f11389d[iB] = i10;
        h(i10);
        return iB;
    }

    public final long e(long j10) {
        return this.f11386a > 0 ? this.f11387b[0] : j10;
    }

    public final void f(int i10) {
        int i11 = this.f11389d[i10];
        i(i11, this.f11386a - 1);
        this.f11386a--;
        h(i11);
        g(i11);
        d(i10);
    }
}
