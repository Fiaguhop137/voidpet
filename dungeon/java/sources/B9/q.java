package B9;

/* JADX INFO: loaded from: classes2.dex */
final class q extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f618a;

    q(Object obj) {
        this.f618a = obj;
    }

    @Override // B9.k
    public Object b() {
        return this.f618a;
    }

    @Override // B9.k
    public boolean c() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f618a.equals(((q) obj).f618a);
        }
        return false;
    }

    public int hashCode() {
        return this.f618a.hashCode() + 1502476572;
    }

    public String toString() {
        return "Optional.of(" + this.f618a + ")";
    }
}
