package G0;

/* JADX INFO: renamed from: G0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1016l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3780b;

    public C1016l(int i10, int i11) {
        this.f3779a = i10;
        this.f3780b = i11;
        if (i10 >= 0 && i11 >= 0) {
            return;
        }
        H0.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1016l)) {
            return false;
        }
        C1016l c1016l = (C1016l) obj;
        return this.f3779a == c1016l.f3779a && this.f3780b == c1016l.f3780b;
    }

    public int hashCode() {
        return (this.f3779a * 31) + this.f3780b;
    }

    public String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.f3779a + ", lengthAfterCursor=" + this.f3780b + ')';
    }
}
