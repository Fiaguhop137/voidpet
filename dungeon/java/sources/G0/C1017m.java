package G0;

/* JADX INFO: renamed from: G0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1017m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3782b;

    public C1017m(int i10, int i11) {
        this.f3781a = i10;
        this.f3782b = i11;
        if (i10 >= 0 && i11 >= 0) {
            return;
        }
        H0.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1017m)) {
            return false;
        }
        C1017m c1017m = (C1017m) obj;
        return this.f3781a == c1017m.f3781a && this.f3782b == c1017m.f3782b;
    }

    public int hashCode() {
        return (this.f3781a * 31) + this.f3782b;
    }

    public String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.f3781a + ", lengthAfterCursor=" + this.f3782b + ')';
    }
}
