package I;

/* JADX INFO: renamed from: I.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1049k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1029d1 f4672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f4673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f4674c;

    public C1049k0(C1029d1 c1029d1, int i10, Object obj) {
        this.f4672a = c1029d1;
        this.f4673b = i10;
        this.f4674c = obj;
    }

    public final Object a() {
        return this.f4674c;
    }

    public final int b() {
        return this.f4673b;
    }

    public final C1029d1 c() {
        return this.f4672a;
    }

    public final boolean d() {
        return this.f4672a.x(this.f4674c);
    }

    public final void e(Object obj) {
        this.f4674c = obj;
    }

    public final void f(int i10) {
        this.f4673b = i10;
    }
}
