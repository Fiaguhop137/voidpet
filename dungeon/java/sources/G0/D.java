package G0;

/* JADX INFO: loaded from: classes.dex */
public final class D implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3725b;

    public D(int i10, int i11) {
        this.f3724a = i10;
        this.f3725b = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        return this.f3724a == d10.f3724a && this.f3725b == d10.f3725b;
    }

    public int hashCode() {
        return (this.f3724a * 31) + this.f3725b;
    }

    public String toString() {
        return "SetSelectionCommand(start=" + this.f3724a + ", end=" + this.f3725b + ')';
    }
}
