package U1;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f12956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f12957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long[] f12959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f12960e;

    public v() {
        this(16);
    }

    public v(int i10) {
        AbstractC1459a.a(i10 >= 0 && i10 <= 1073741824);
        i10 = i10 == 0 ? 1 : i10;
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f12956a = 0;
        this.f12957b = -1;
        this.f12958c = 0;
        long[] jArr = new long[i10];
        this.f12959d = jArr;
        this.f12960e = jArr.length - 1;
    }

    private void c() {
        long[] jArr = this.f12959d;
        int length = jArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        long[] jArr2 = new long[length];
        int length2 = jArr.length;
        int i10 = this.f12956a;
        int i11 = length2 - i10;
        System.arraycopy(jArr, i10, jArr2, 0, i11);
        System.arraycopy(this.f12959d, 0, jArr2, i11, i10);
        this.f12956a = 0;
        this.f12957b = this.f12958c - 1;
        this.f12959d = jArr2;
        this.f12960e = jArr2.length - 1;
    }

    public void a(long j10) {
        if (this.f12958c == this.f12959d.length) {
            c();
        }
        int i10 = (this.f12957b + 1) & this.f12960e;
        this.f12957b = i10;
        this.f12959d[i10] = j10;
        this.f12958c++;
    }

    public void b() {
        this.f12956a = 0;
        this.f12957b = -1;
        this.f12958c = 0;
    }

    public long d() {
        if (this.f12958c != 0) {
            return this.f12959d[this.f12956a];
        }
        throw new NoSuchElementException();
    }

    public boolean e() {
        return this.f12958c == 0;
    }

    public long f() {
        int i10 = this.f12958c;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f12959d;
        int i11 = this.f12956a;
        long j10 = jArr[i11];
        this.f12956a = this.f12960e & (i11 + 1);
        this.f12958c = i10 - 1;
        return j10;
    }
}
