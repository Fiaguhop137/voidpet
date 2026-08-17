package C9;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
final class O extends J implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final O f1512a = new O();

    private O() {
    }

    @Override // C9.J
    public J e() {
        return J.c();
    }

    @Override // C9.J, java.util.Comparator
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        B9.n.j(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
