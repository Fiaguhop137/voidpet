package A0;

import O0.n;
import p323s.AbstractC4115o;
import p323s.F;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F f122a = AbstractC4115o.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f123b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f127f;

    public d() {
        n.a aVar = n.f8279b;
        this.f124c = aVar.b();
        this.f125d = aVar.b();
    }

    public final void a(long j10) {
    }

    public final void b(long j10) {
        F f10 = this.f122a;
        Object[] objArr = f10.f52740c;
        long[] jArr = f10.f52738a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j11 = jArr[i10];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j11) < 128) {
                        android.support.v4.media.session.b.a(objArr[(i10 << 3) + i12]);
                    }
                    j11 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void c(int i10, long j10, long j11, long j12) {
        android.support.v4.media.session.b.a(this.f122a.b(i10));
    }

    public final long d() {
        return this.f123b;
    }

    public final F e() {
        return this.f122a;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0049 A[LOOP:0: B:8:0x0014->B:18:0x0049, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x004c A[EDGE_INSN: B:25:0x004c->B:19:0x004c BREAK  A[LOOP:0: B:8:0x0014->B:18:0x0049], SYNTHETIC] */
    public final void f(long j10) {
        if (this.f123b > j10) {
            return;
        }
        F f10 = this.f122a;
        Object[] objArr = f10.f52740c;
        long[] jArr = f10.f52738a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j11 = jArr[i10];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j11) < 128) {
                            android.support.v4.media.session.b.a(objArr[(i10 << 3) + i12]);
                        }
                        j11 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    } else if (i10 != length) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        this.f123b = Long.MAX_VALUE == Long.MAX_VALUE ? -1L : Long.MAX_VALUE;
    }

    public final boolean g(long j10, long j11, float[] fArr, int i10, int i11) {
        boolean z10;
        if (n.f(j11, this.f124c)) {
            z10 = false;
        } else {
            this.f124c = j11;
            z10 = true;
        }
        if (!n.f(j10, this.f125d)) {
            this.f125d = j10;
            z10 = true;
        }
        if (fArr != null) {
            this.f127f = fArr;
            z10 = true;
        }
        long j12 = (((long) i10) << 32) | (((long) i11) & 4294967295L);
        if (j12 == this.f126e) {
            return z10;
        }
        this.f126e = j12;
        return true;
    }
}
