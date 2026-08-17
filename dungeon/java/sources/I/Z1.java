package I;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class Z1 implements Iterator, Nd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D1 f4581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f4582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC1040h0 f4583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a2 f4584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f4585e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f4586f;

    public Z1(D1 d10, int i10, AbstractC1040h0 abstractC1040h0, a2 a2Var) {
        this.f4581a = d10;
        this.f4582b = i10;
        this.f4583c = abstractC1040h0;
        this.f4584d = a2Var;
        this.f4585e = d10.x();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public U.k next() {
        Object obj;
        ArrayList arrayListE = this.f4583c.e();
        if (arrayListE != null) {
            int i10 = this.f4586f;
            this.f4586f = i10 + 1;
            obj = arrayListE.get(i10);
        } else {
            obj = null;
        }
        if (obj instanceof C1021b) {
            return new E1(this.f4581a, ((C1021b) obj).a(), this.f4585e);
        }
        if (obj instanceof AbstractC1040h0) {
            return new b2(this.f4581a, this.f4582b, (AbstractC1040h0) obj, new C1070r1(this.f4584d, this.f4586f - 1));
        }
        AbstractC1083w.u("Unexpected group information structure");
        throw new Ad.g();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        ArrayList arrayListE = this.f4583c.e();
        return arrayListE != null && this.f4586f < arrayListE.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
