package p254o2;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f50323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f50324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f50325d;

    public b(long j10, long j11) {
        this.f50323b = j10;
        this.f50324c = j11;
        f();
    }

    protected final void c() {
        long j10 = this.f50325d;
        if (j10 < this.f50323b || j10 > this.f50324c) {
            throw new NoSuchElementException();
        }
    }

    protected final long d() {
        return this.f50325d;
    }

    public boolean e() {
        return this.f50325d > this.f50324c;
    }

    public void f() {
        this.f50325d = this.f50323b - 1;
    }

    @Override // p254o2.n
    public boolean next() {
        this.f50325d++;
        return !e();
    }
}
