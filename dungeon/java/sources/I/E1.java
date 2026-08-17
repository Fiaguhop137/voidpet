package I;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class E1 implements U.k, Iterable, Nd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D1 f4452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f4453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f4454c;

    public E1(D1 d10, int i10, int i11) {
        this.f4452a = d10;
        this.f4453b = i10;
        this.f4454c = i11;
    }

    private final void a() {
        if (this.f4452a.x() != this.f4454c) {
            F1.u();
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a();
        this.f4452a.G(this.f4453b);
        D1 d10 = this.f4452a;
        int i10 = this.f4453b;
        return new C1034f0(d10, i10 + 1, i10 + F1.o(d10.q(), this.f4453b));
    }
}
