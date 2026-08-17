package V6;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f14146a = new n();

    public final n a() {
        return this.f14146a;
    }

    public final void b() {
        if (!e()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    public final void c(Exception exc) {
        if (!f(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }

    public final void d(Object obj) {
        if (!g(obj)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }

    public final boolean e() {
        return this.f14146a.E();
    }

    public final boolean f(Exception exc) {
        return this.f14146a.F(exc);
    }

    public final boolean g(Object obj) {
        return this.f14146a.G(obj);
    }
}
