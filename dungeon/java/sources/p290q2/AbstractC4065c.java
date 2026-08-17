package p290q2;

import R1.G;
import R1.r;
import U1.AbstractC1459a;
import U1.S;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: q2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4065c implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final G f51253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f51254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int[] f51255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f51256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r[] f51257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long[] f51258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f51259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f51260h;

    public AbstractC4065c(G g10, int... iArr) {
        this(g10, iArr, 0);
    }

    public AbstractC4065c(G g10, int[] iArr, int i10) {
        AbstractC1459a.g(iArr.length > 0);
        this.f51256d = i10;
        this.f51253a = (G) AbstractC1459a.e(g10);
        int length = iArr.length;
        this.f51254b = length;
        this.f51257e = new r[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f51257e[i11] = g10.a(iArr[i11]);
        }
        Arrays.sort(this.f51257e, new C4064b());
        this.f51255c = new int[this.f51254b];
        int i12 = 0;
        while (true) {
            int i13 = this.f51254b;
            if (i12 >= i13) {
                this.f51258f = new long[i13];
                this.f51260h = false;
                return;
            } else {
                this.f51255c[i12] = g10.b(this.f51257e[i12]);
                i12++;
            }
        }
    }

    public static /* synthetic */ int t(r rVar, r rVar2) {
        return rVar2.f10272j - rVar.f10272j;
    }

    @Override // p290q2.y
    public boolean a(int i10, long j10) {
        return this.f51258f[i10] > j10;
    }

    @Override // p290q2.C
    public final r c(int i10) {
        return this.f51257e[i10];
    }

    @Override // p290q2.C
    public final int d(int i10) {
        return this.f51255c[i10];
    }

    @Override // p290q2.y
    public void disable() {
    }

    @Override // p290q2.y
    public void enable() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC4065c abstractC4065c = (AbstractC4065c) obj;
            if (this.f51253a.equals(abstractC4065c.f51253a) && Arrays.equals(this.f51255c, abstractC4065c.f51255c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p290q2.y
    public boolean f(int i10, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zA = a(i10, jElapsedRealtime);
        int i11 = 0;
        while (i11 < this.f51254b && !zA) {
            zA = (i11 == i10 || a(i11, jElapsedRealtime)) ? false : true;
            i11++;
        }
        if (!zA) {
            return false;
        }
        long[] jArr = this.f51258f;
        jArr[i10] = Math.max(jArr[i10], S.c(jElapsedRealtime, j10, Long.MAX_VALUE));
        return true;
    }

    @Override // p290q2.y
    public void g(float f10) {
    }

    public int hashCode() {
        if (this.f51259g == 0) {
            this.f51259g = (System.identityHashCode(this.f51253a) * 31) + Arrays.hashCode(this.f51255c);
        }
        return this.f51259g;
    }

    @Override // p290q2.C
    public final int j(int i10) {
        for (int i11 = 0; i11 < this.f51254b; i11++) {
            if (this.f51255c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // p290q2.C
    public final G k() {
        return this.f51253a;
    }

    @Override // p290q2.C
    public final int length() {
        return this.f51255c.length;
    }

    @Override // p290q2.y
    public void m(boolean z10) {
        this.f51260h = z10;
    }

    @Override // p290q2.y
    public int n(long j10, List list) {
        return list.size();
    }

    @Override // p290q2.y
    public final int o() {
        return this.f51255c[b()];
    }

    @Override // p290q2.y
    public final r p() {
        return this.f51257e[b()];
    }

    @Override // p290q2.C
    public final int r(r rVar) {
        for (int i10 = 0; i10 < this.f51254b; i10++) {
            if (this.f51257e[i10] == rVar) {
                return i10;
            }
        }
        return -1;
    }
}
