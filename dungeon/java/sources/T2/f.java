package T2;

import S2.k;
import U1.AbstractC1459a;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class f implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f12100a;

    public f(List list) {
        this.f12100a = list;
    }

    @Override // S2.k
    public int e(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // S2.k
    public List g(long j10) {
        return j10 >= 0 ? this.f12100a : Collections.EMPTY_LIST;
    }

    @Override // S2.k
    public long h(int i10) {
        AbstractC1459a.a(i10 == 0);
        return 0L;
    }

    @Override // S2.k
    public int i() {
        return 1;
    }
}
