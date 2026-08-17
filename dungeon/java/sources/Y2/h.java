package Y2;

import S2.k;
import U1.S;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f16903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f16904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f16905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f16906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f16907e;

    public h(c cVar, Map map, Map map2, Map map3) {
        this.f16903a = cVar;
        this.f16906d = map2;
        this.f16907e = map3;
        this.f16905c = map != null ? Collections.unmodifiableMap(map) : Collections.EMPTY_MAP;
        this.f16904b = cVar.j();
    }

    @Override // S2.k
    public int e(long j10) {
        int iD = S.d(this.f16904b, j10, false, false);
        if (iD < this.f16904b.length) {
            return iD;
        }
        return -1;
    }

    @Override // S2.k
    public List g(long j10) {
        return this.f16903a.h(j10, this.f16905c, this.f16906d, this.f16907e);
    }

    @Override // S2.k
    public long h(int i10) {
        return this.f16904b[i10];
    }

    @Override // S2.k
    public int i() {
        return this.f16904b.length;
    }
}
