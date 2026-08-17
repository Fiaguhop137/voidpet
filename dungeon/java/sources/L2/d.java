package L2;

import U1.F;
import U1.K;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d extends L2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f6280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f6281h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f6282i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f6283j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f6284k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f6285l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f6286m;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f6288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f6289c;

        private b(int i10, long j10, long j11) {
            this.f6287a = i10;
            this.f6288b = j10;
            this.f6289c = j11;
        }

        /* synthetic */ b(int i10, long j10, long j11, a aVar) {
            this(i10, j10, j11);
        }
    }

    private d(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f6274a = j10;
        this.f6275b = z10;
        this.f6276c = z11;
        this.f6277d = z12;
        this.f6278e = z13;
        this.f6279f = j11;
        this.f6280g = j12;
        this.f6281h = Collections.unmodifiableList(list);
        this.f6282i = z14;
        this.f6283j = j13;
        this.f6284k = i10;
        this.f6285l = i11;
        this.f6286m = i12;
    }

    static d d(F f10, long j10, K k10) {
        List list;
        long j11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int iL;
        int iL2;
        boolean z14;
        long jN = f10.N();
        boolean z15 = (f10.L() & 128) != 0;
        List list2 = Collections.EMPTY_LIST;
        long jN2 = -9223372036854775807L;
        if (z15) {
            list = list2;
            j11 = -9223372036854775807L;
            z10 = false;
            z11 = false;
            z12 = false;
            z13 = false;
            i10 = 0;
            iL = 0;
            iL2 = 0;
        } else {
            int iL3 = f10.L();
            boolean z16 = (iL3 & 128) != 0;
            boolean z17 = (iL3 & 64) != 0;
            boolean z18 = (iL3 & 32) != 0;
            boolean z19 = (iL3 & 16) != 0;
            long jE = (!z17 || z19) ? -9223372036854775807L : g.e(f10, j10);
            if (!z17) {
                int iL4 = f10.L();
                ArrayList arrayList = new ArrayList(iL4);
                int i11 = 0;
                while (i11 < iL4) {
                    int iL5 = f10.L();
                    long jE2 = !z19 ? g.e(f10, j10) : -9223372036854775807L;
                    arrayList.add(new b(iL5, jE2, k10.b(jE2), null));
                    i11++;
                    iL4 = iL4;
                }
                list2 = arrayList;
            }
            if (z18) {
                long jL = f10.L();
                boolean z20 = (128 & jL) != 0;
                jN2 = ((((jL & 1) << 32) | f10.N()) * 1000) / 90;
                z14 = z20;
            } else {
                z14 = false;
            }
            int iT = f10.T();
            long j12 = jE;
            j11 = jN2;
            jN2 = j12;
            iL = f10.L();
            iL2 = f10.L();
            i10 = iT;
            z13 = z14;
            z10 = z16;
            z11 = z17;
            list = list2;
            z12 = z19;
        }
        return new d(jN, z15, z10, z11, z12, jN2, k10.b(jN2), list, z13, j11, i10, iL, iL2);
    }

    @Override // L2.b
    public String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.f6279f + ", programSplicePlaybackPositionUs= " + this.f6280g + " }";
    }
}
