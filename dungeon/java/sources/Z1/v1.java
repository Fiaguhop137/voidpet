package Z1;

/* JADX INFO: loaded from: classes.dex */
public final class v1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v1 f18492c = new v1(0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18494b;

    public v1(int i10, boolean z10) {
        this.f18493a = i10;
        this.f18494b = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v1.class == obj.getClass()) {
            v1 v1Var = (v1) obj;
            if (this.f18493a == v1Var.f18493a && this.f18494b == v1Var.f18494b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f18493a << 1) + (this.f18494b ? 1 : 0);
    }
}
