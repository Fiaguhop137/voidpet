package p170j8;

/* JADX INFO: renamed from: j8.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3853s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static C3853s f47024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C3854t f47025c = new C3854t(0, false, false, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C3854t f47026a;

    private C3853s() {
    }

    public static synchronized C3853s b() {
        try {
            if (f47024b == null) {
                f47024b = new C3853s();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f47024b;
    }

    public C3854t a() {
        return this.f47026a;
    }

    public final synchronized void c(C3854t c3854t) {
        try {
            if (c3854t == null) {
                this.f47026a = f47025c;
                return;
            }
            C3854t c3854t2 = this.f47026a;
            if (c3854t2 == null || c3854t2.e4() < c3854t.e4()) {
                this.f47026a = c3854t;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
