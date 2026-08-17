package p254o2;

import R1.r;
import U1.AbstractC1459a;
import W1.f;
import W1.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f50403j;

    public m(f fVar, j jVar, r rVar, int i10, Object obj, long j10, long j11, long j12) {
        super(fVar, jVar, 1, rVar, i10, obj, j10, j11);
        AbstractC1459a.e(rVar);
        this.f50403j = j12;
    }

    public long g() {
        long j10 = this.f50403j;
        if (j10 != -1) {
            return j10 + 1;
        }
        return -1L;
    }

    public abstract boolean h();
}
