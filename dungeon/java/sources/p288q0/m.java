package p288q0;

import p019b0.g;

/* JADX INFO: loaded from: classes.dex */
public interface m {
    static /* synthetic */ g X(m mVar, m mVar2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return mVar.K(mVar2, z10);
    }

    g K(m mVar, boolean z10);

    long T(long j10);

    long a0(m mVar, long j10);

    boolean e();

    m e0();

    long g();

    long g0(m mVar, long j10, boolean z10);

    long k0(long j10);

    long z(long j10);
}
