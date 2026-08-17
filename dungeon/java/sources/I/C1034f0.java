package I;

import java.util.Iterator;

/* JADX INFO: renamed from: I.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1034f0 implements Iterator, Nd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D1 f4639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f4640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f4641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f4642d;

    public C1034f0(D1 d10, int i10, int i11) {
        this.f4639a = d10;
        this.f4640b = i11;
        this.f4641c = i10;
        this.f4642d = d10.x();
        if (d10.y()) {
            F1.u();
        }
    }

    private final void b() {
        if (this.f4639a.x() != this.f4642d) {
            F1.u();
        }
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public U.k next() {
        b();
        int i10 = this.f4641c;
        this.f4641c = F1.o(this.f4639a.q(), i10) + i10;
        return new E1(this.f4639a, i10, this.f4642d);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f4641c < this.f4640b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
