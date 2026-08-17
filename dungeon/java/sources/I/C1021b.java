package I;

/* JADX INFO: renamed from: I.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1021b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f4601a;

    public C1021b(int i10) {
        this.f4601a = i10;
    }

    public final int a() {
        return this.f4601a;
    }

    public final boolean b() {
        return this.f4601a != Integer.MIN_VALUE;
    }

    public final void c(int i10) {
        this.f4601a = i10;
    }

    public final int d(D1 d10) {
        return d10.c(this);
    }

    public final int e(G1 g10) {
        return g10.C(this);
    }

    public String toString() {
        return super.toString() + "{ location = " + this.f4601a + " }";
    }
}
