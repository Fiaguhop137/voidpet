package p272p2;

import C9.AbstractC0876t;
import C9.J;
import U1.AbstractC1459a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class e implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final J f50728b = J.c().d(new c()).a(J.c().e().d(new d()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f50729a = new ArrayList();

    @Override // p272p2.a
    public boolean a(S2.e eVar, long j10) {
        AbstractC1459a.a(eVar.f11502b != -9223372036854775807L);
        AbstractC1459a.a(eVar.f11503c != -9223372036854775807L);
        boolean z10 = eVar.f11502b <= j10 && j10 < eVar.f11504d;
        for (int size = this.f50729a.size() - 1; size >= 0; size--) {
            if (eVar.f11502b >= ((S2.e) this.f50729a.get(size)).f11502b) {
                this.f50729a.add(size + 1, eVar);
                return z10;
            }
        }
        this.f50729a.add(0, eVar);
        return z10;
    }

    @Override // p272p2.a
    public AbstractC0876t b(long j10) {
        if (!this.f50729a.isEmpty()) {
            if (j10 >= ((S2.e) this.f50729a.get(0)).f11502b) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.f50729a.size(); i10++) {
                    S2.e eVar = (S2.e) this.f50729a.get(i10);
                    if (j10 >= eVar.f11502b && j10 < eVar.f11504d) {
                        arrayList.add(eVar);
                    }
                    if (j10 < eVar.f11502b) {
                        break;
                    }
                }
                AbstractC0876t abstractC0876tE = AbstractC0876t.E(f50728b, arrayList);
                AbstractC0876t.a aVarL = AbstractC0876t.l();
                for (int i11 = 0; i11 < abstractC0876tE.size(); i11++) {
                    aVarL.j(((S2.e) abstractC0876tE.get(i11)).f11501a);
                }
                return aVarL.k();
            }
        }
        return AbstractC0876t.w();
    }

    @Override // p272p2.a
    public long c(long j10) {
        if (this.f50729a.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j10 < ((S2.e) this.f50729a.get(0)).f11502b) {
            return -9223372036854775807L;
        }
        long jMax = ((S2.e) this.f50729a.get(0)).f11502b;
        for (int i10 = 0; i10 < this.f50729a.size(); i10++) {
            long j11 = ((S2.e) this.f50729a.get(i10)).f11502b;
            long j12 = ((S2.e) this.f50729a.get(i10)).f11504d;
            if (j12 > j10) {
                if (j11 > j10) {
                    break;
                }
                jMax = Math.max(jMax, j11);
            } else {
                jMax = Math.max(jMax, j12);
            }
        }
        return jMax;
    }

    @Override // p272p2.a
    public void clear() {
        this.f50729a.clear();
    }

    @Override // p272p2.a
    public long d(long j10) {
        long jMin = -9223372036854775807L;
        for (int i10 = 0; i10 < this.f50729a.size(); i10++) {
            long j11 = ((S2.e) this.f50729a.get(i10)).f11502b;
            long j12 = ((S2.e) this.f50729a.get(i10)).f11504d;
            if (j10 < j11) {
                if (jMin != -9223372036854775807L) {
                    jMin = Math.min(jMin, j11);
                    break;
                }
                jMin = j11;
                break;
            }
            if (j10 < j12) {
                jMin = jMin == -9223372036854775807L ? j12 : Math.min(jMin, j12);
            }
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // p272p2.a
    public void e(long j10) {
        int i10 = 0;
        while (i10 < this.f50729a.size()) {
            long j11 = ((S2.e) this.f50729a.get(i10)).f11502b;
            if (j10 > j11 && j10 > ((S2.e) this.f50729a.get(i10)).f11504d) {
                this.f50729a.remove(i10);
                i10--;
            } else if (j10 < j11) {
                return;
            }
            i10++;
        }
    }
}
