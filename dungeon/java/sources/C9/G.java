package C9;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
final class G extends J implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final G f1487a = new G();

    private G() {
    }

    @Override // C9.J
    public J e() {
        return O.f1512a;
    }

    @Override // C9.J, java.util.Comparator
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        B9.n.j(comparable);
        B9.n.j(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
