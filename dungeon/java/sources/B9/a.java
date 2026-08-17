package B9;

/* JADX INFO: loaded from: classes2.dex */
final class a extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final a f596a = new a();

    private a() {
    }

    static k e() {
        return f596a;
    }

    @Override // B9.k
    public Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // B9.k
    public boolean c() {
        return false;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
