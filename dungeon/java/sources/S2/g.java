package S2;

import C9.AbstractC0876t;
import C9.AbstractC0879w;
import C9.J;
import U1.AbstractC1459a;
import U1.AbstractC1477t;
import U1.S;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class g implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final J f11505c = J.c().d(new f());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0876t f11506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f11507b;

    /* JADX WARN: Code duplicated, block: B:24:0x00b0  */
    public g(List list) {
        if (list.size() == 1) {
            e eVar = (e) AbstractC0879w.g(list);
            long jC = c(eVar.f11502b);
            if (eVar.f11503c == -9223372036854775807L) {
                this.f11506a = AbstractC0876t.x(eVar.f11501a);
                this.f11507b = new long[]{jC};
                return;
            } else {
                this.f11506a = AbstractC0876t.y(eVar.f11501a, AbstractC0876t.w());
                this.f11507b = new long[]{jC, eVar.f11503c + jC};
                return;
            }
        }
        long[] jArr = new long[list.size() * 2];
        this.f11507b = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        AbstractC0876t abstractC0876tE = AbstractC0876t.E(f11505c, list);
        int i10 = 0;
        for (int i11 = 0; i11 < abstractC0876tE.size(); i11++) {
            e eVar2 = (e) abstractC0876tE.get(i11);
            long jC2 = c(eVar2.f11502b);
            long j10 = eVar2.f11503c + jC2;
            if (i10 != 0) {
                int i12 = i10 - 1;
                long j11 = this.f11507b[i12];
                if (j11 < jC2) {
                    this.f11507b[i10] = jC2;
                    arrayList.add(eVar2.f11501a);
                    i10++;
                } else if (j11 == jC2 && ((AbstractC0876t) arrayList.get(i12)).isEmpty()) {
                    arrayList.set(i12, eVar2.f11501a);
                } else {
                    AbstractC1477t.h("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                    this.f11507b[i12] = jC2;
                    arrayList.set(i12, eVar2.f11501a);
                }
            } else {
                this.f11507b[i10] = jC2;
                arrayList.add(eVar2.f11501a);
                i10++;
            }
            if (eVar2.f11503c != -9223372036854775807L) {
                this.f11507b[i10] = j10;
                arrayList.add(AbstractC0876t.w());
                i10++;
            }
        }
        this.f11506a = AbstractC0876t.p(arrayList);
    }

    private static long c(long j10) {
        if (j10 == -9223372036854775807L) {
            return 0L;
        }
        return j10;
    }

    @Override // S2.k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC0876t g(long j10) {
        int iH = S.h(this.f11507b, j10, true, false);
        return iH == -1 ? AbstractC0876t.w() : (AbstractC0876t) this.f11506a.get(iH);
    }

    @Override // S2.k
    public int e(long j10) {
        int iD = S.d(this.f11507b, j10, false, false);
        if (iD < this.f11506a.size()) {
            return iD;
        }
        return -1;
    }

    @Override // S2.k
    public long h(int i10) {
        AbstractC1459a.a(i10 < this.f11506a.size());
        return this.f11507b[i10];
    }

    @Override // S2.k
    public int i() {
        return this.f11506a.size();
    }
}
