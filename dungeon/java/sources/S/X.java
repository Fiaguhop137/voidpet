package S;

/* JADX INFO: loaded from: classes.dex */
public abstract class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f11332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private X f11333b;

    public X(long j10) {
        this.f11332a = j10;
    }

    public abstract void c(X x10);

    public abstract X d(long j10);

    public final X e() {
        return this.f11333b;
    }

    public final long f() {
        return this.f11332a;
    }

    public final void g(X x10) {
        this.f11333b = x10;
    }

    public final void h(long j10) {
        this.f11332a = j10;
    }
}
