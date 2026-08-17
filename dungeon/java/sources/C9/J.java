package C9;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class J implements Comparator {
    protected J() {
    }

    public static J b(Comparator comparator) {
        return comparator instanceof J ? (J) comparator : new C0869l(comparator);
    }

    public static J c() {
        return G.f1487a;
    }

    public J a(Comparator comparator) {
        return new C0871n(this, (Comparator) B9.n.j(comparator));
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public J d(B9.f fVar) {
        return new C0864g(fVar, this);
    }

    public J e() {
        return new P(this);
    }
}
