package I;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class b2 implements U.k, Iterable, Nd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D1 f4603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f4604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC1040h0 f4605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a2 f4606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f4607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Iterable f4608f = this;

    public b2(D1 d10, int i10, AbstractC1040h0 abstractC1040h0, a2 a2Var) {
        this.f4603a = d10;
        this.f4604b = i10;
        this.f4605c = abstractC1040h0;
        this.f4606d = a2Var;
        this.f4607e = Integer.valueOf(abstractC1040h0.f());
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new Z1(this.f4603a, this.f4604b, this.f4605c, this.f4606d);
    }
}
