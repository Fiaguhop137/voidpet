package Y1;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f16796a;

    public final void o(int i10) {
        this.f16796a = i10 | this.f16796a;
    }

    public void p() {
        this.f16796a = 0;
    }

    protected final boolean r(int i10) {
        return (this.f16796a & i10) == i10;
    }

    public final boolean s() {
        return r(268435456);
    }

    public final boolean t() {
        return r(4);
    }

    public final boolean u() {
        return r(134217728);
    }

    public final boolean v() {
        return r(1);
    }

    public final boolean w() {
        return r(536870912);
    }

    public final boolean x() {
        return r(67108864);
    }

    public final void y(int i10) {
        this.f16796a = i10;
    }
}
