package U1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f12954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f12955b;

    public u() {
        this(32);
    }

    public u(int i10) {
        this.f12955b = new long[i10];
    }

    public void a(long j10) {
        int i10 = this.f12954a;
        long[] jArr = this.f12955b;
        if (i10 == jArr.length) {
            this.f12955b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f12955b;
        int i11 = this.f12954a;
        this.f12954a = i11 + 1;
        jArr2[i11] = j10;
    }

    public void b(long[] jArr) {
        int length = this.f12954a + jArr.length;
        long[] jArr2 = this.f12955b;
        if (length > jArr2.length) {
            this.f12955b = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.f12955b, this.f12954a, jArr.length);
        this.f12954a = length;
    }

    public long c(int i10) {
        if (i10 >= 0 && i10 < this.f12954a) {
            return this.f12955b[i10];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f12954a);
    }

    public int d() {
        return this.f12954a;
    }
}
