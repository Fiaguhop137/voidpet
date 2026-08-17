package p272p2;

import C9.AbstractC0876t;
import C9.AbstractC0879w;
import S2.e;
import U1.AbstractC1459a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f50730a = new ArrayList();

    private int f(long j10) {
        for (int i10 = 0; i10 < this.f50730a.size(); i10++) {
            if (j10 < ((e) this.f50730a.get(i10)).f11502b) {
                return i10;
            }
        }
        return this.f50730a.size();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // p272p2.a
    public boolean a(e eVar, long j10) {
        boolean z10;
        AbstractC1459a.a(eVar.f11502b != -9223372036854775807L);
        if (eVar.f11502b <= j10) {
            long j11 = eVar.f11504d;
            if (j11 == -9223372036854775807L || j10 < j11) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        for (int size = this.f50730a.size() - 1; size >= 0; size--) {
            if (eVar.f11502b >= ((e) this.f50730a.get(size)).f11502b) {
                this.f50730a.add(size + 1, eVar);
                return z10;
            }
            if (((e) this.f50730a.get(size)).f11502b <= j10) {
                z10 = false;
            }
        }
        this.f50730a.add(0, eVar);
        return z10;
    }

    @Override // p272p2.a
    public AbstractC0876t b(long j10) {
        int iF = f(j10);
        if (iF == 0) {
            return AbstractC0876t.w();
        }
        e eVar = (e) this.f50730a.get(iF - 1);
        long j11 = eVar.f11504d;
        return (j11 == -9223372036854775807L || j10 < j11) ? eVar.f11501a : AbstractC0876t.w();
    }

    @Override // p272p2.a
    public long c(long j10) {
        if (this.f50730a.isEmpty() || j10 < ((e) this.f50730a.get(0)).f11502b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < this.f50730a.size(); i10++) {
            long j11 = ((e) this.f50730a.get(i10)).f11502b;
            if (j10 == j11) {
                return j11;
            }
            if (j10 < j11) {
                e eVar = (e) this.f50730a.get(i10 - 1);
                long j12 = eVar.f11504d;
                return (j12 == -9223372036854775807L || j12 > j10) ? eVar.f11502b : j12;
            }
        }
        e eVar2 = (e) AbstractC0879w.d(this.f50730a);
        long j13 = eVar2.f11504d;
        return (j13 == -9223372036854775807L || j10 < j13) ? eVar2.f11502b : j13;
    }

    @Override // p272p2.a
    public void clear() {
        this.f50730a.clear();
    }

    @Override // p272p2.a
    public long d(long j10) {
        if (this.f50730a.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j10 < ((e) this.f50730a.get(0)).f11502b) {
            return ((e) this.f50730a.get(0)).f11502b;
        }
        for (int i10 = 1; i10 < this.f50730a.size(); i10++) {
            e eVar = (e) this.f50730a.get(i10);
            if (j10 < eVar.f11502b) {
                long j11 = ((e) this.f50730a.get(i10 - 1)).f11504d;
                return (j11 == -9223372036854775807L || j11 <= j10 || j11 >= eVar.f11502b) ? eVar.f11502b : j11;
            }
        }
        long j12 = ((e) AbstractC0879w.d(this.f50730a)).f11504d;
        if (j12 == -9223372036854775807L || j10 >= j12) {
            return Long.MIN_VALUE;
        }
        return j12;
    }

    @Override // p272p2.a
    public void e(long j10) {
        int iF = f(j10);
        if (iF == 0) {
            return;
        }
        long j11 = ((e) this.f50730a.get(iF - 1)).f11504d;
        if (j11 == -9223372036854775807L || j11 >= j10) {
            iF--;
        }
        this.f50730a.subList(0, iF).clear();
    }
}
