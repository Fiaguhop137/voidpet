package U1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f12866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f12867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f12869d;

    public J() {
        this(10);
    }

    public J(int i10) {
        this.f12866a = new long[i10];
        this.f12867b = f(i10);
    }

    private void b(long j10, Object obj) {
        int i10 = this.f12868c;
        int i11 = this.f12869d;
        Object[] objArr = this.f12867b;
        int length = (i10 + i11) % objArr.length;
        this.f12866a[length] = j10;
        objArr[length] = obj;
        this.f12869d = i11 + 1;
    }

    private void d(long j10) {
        int i10 = this.f12869d;
        if (i10 > 0) {
            if (j10 <= this.f12866a[((this.f12868c + i10) - 1) % this.f12867b.length]) {
                c();
            }
        }
    }

    private void e() {
        int length = this.f12867b.length;
        if (this.f12869d < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        Object[] objArrF = f(i10);
        int i11 = this.f12868c;
        int i12 = length - i11;
        System.arraycopy(this.f12866a, i11, jArr, 0, i12);
        System.arraycopy(this.f12867b, this.f12868c, objArrF, 0, i12);
        int i13 = this.f12868c;
        if (i13 > 0) {
            System.arraycopy(this.f12866a, 0, jArr, i12, i13);
            System.arraycopy(this.f12867b, 0, objArrF, i12, this.f12868c);
        }
        this.f12866a = jArr;
        this.f12867b = objArrF;
        this.f12868c = 0;
    }

    private static Object[] f(int i10) {
        return new Object[i10];
    }

    private Object g(long j10, boolean z10) {
        Object objJ = null;
        long j11 = Long.MAX_VALUE;
        while (this.f12869d > 0) {
            long j12 = j10 - this.f12866a[this.f12868c];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            objJ = j();
            j11 = j12;
        }
        return objJ;
    }

    private Object j() {
        AbstractC1459a.g(this.f12869d > 0);
        Object[] objArr = this.f12867b;
        int i10 = this.f12868c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f12868c = (i10 + 1) % objArr.length;
        this.f12869d--;
        return obj;
    }

    public synchronized void a(long j10, Object obj) {
        d(j10);
        e();
        b(j10, obj);
    }

    public synchronized void c() {
        this.f12868c = 0;
        this.f12869d = 0;
        Arrays.fill(this.f12867b, (Object) null);
    }

    public synchronized Object h() {
        return this.f12869d == 0 ? null : j();
    }

    public synchronized Object i(long j10) {
        return g(j10, true);
    }

    public synchronized int k() {
        return this.f12869d;
    }
}
