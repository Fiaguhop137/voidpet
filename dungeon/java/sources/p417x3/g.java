package p417x3;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f57391a = new f();

    public f a() {
        return this.f57391a;
    }

    public void b() {
        if (!e()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    public void c(Exception exc) {
        if (!f(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }

    public void d(Object obj) {
        if (!g(obj)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }

    public boolean e() {
        return this.f57391a.p();
    }

    public boolean f(Exception exc) {
        return this.f57391a.q(exc);
    }

    public boolean g(Object obj) {
        return this.f57391a.r(obj);
    }
}
