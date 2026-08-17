package L2;

import U1.F;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f extends L2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6290a;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f6292b;

        private b(int i10, long j10) {
            this.f6291a = i10;
            this.f6292b = j10;
        }

        /* synthetic */ b(int i10, long j10, a aVar) {
            this(i10, j10);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f6293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f6294b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f6295c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f6296d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f6297e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List f6298f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f6299g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f6300h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f6301i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f6302j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f6303k;

        private c(long j10, boolean z10, boolean z11, boolean z12, List list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f6293a = j10;
            this.f6294b = z10;
            this.f6295c = z11;
            this.f6296d = z12;
            this.f6298f = Collections.unmodifiableList(list);
            this.f6297e = j11;
            this.f6299g = z13;
            this.f6300h = j12;
            this.f6301i = i10;
            this.f6302j = i11;
            this.f6303k = i12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c b(F f10) {
            ArrayList arrayList;
            boolean z10;
            boolean z11;
            long j10;
            boolean z12;
            long j11;
            int i10;
            int i11;
            int iL;
            boolean z13;
            long jN;
            long jN2 = f10.N();
            boolean z14 = true;
            if ((f10.L() & 128) == 0) {
                z14 = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (z14) {
                arrayList = arrayList2;
                z10 = false;
                z11 = false;
                j10 = -9223372036854775807L;
                z12 = false;
                j11 = -9223372036854775807L;
                i10 = 0;
                i11 = 0;
                iL = 0;
            } else {
                int iL2 = f10.L();
                boolean z15 = (iL2 & 128) != 0;
                boolean z16 = (iL2 & 64) != 0 ? z14 : false;
                boolean z17 = (iL2 & 32) != 0 ? z14 : false;
                long jN3 = z16 ? f10.N() : -9223372036854775807L;
                if (!z16) {
                    int iL3 = f10.L();
                    ArrayList arrayList3 = new ArrayList(iL3);
                    int i12 = 0;
                    while (i12 < iL3) {
                        arrayList3.add(new b(f10.L(), f10.N(), null));
                        i12++;
                        iL3 = iL3;
                    }
                    arrayList2 = arrayList3;
                }
                if (z17) {
                    long jL = f10.L();
                    boolean z18 = (128 & jL) != 0;
                    jN = ((((jL & 1) << 32) | f10.N()) * 1000) / 90;
                    z13 = z18;
                } else {
                    z13 = false;
                    jN = -9223372036854775807L;
                }
                int iT = f10.T();
                int iL4 = f10.L();
                boolean z19 = z15;
                z12 = z13;
                z10 = z19;
                iL = f10.L();
                long j12 = jN3;
                i10 = iT;
                i11 = iL4;
                long j13 = jN;
                arrayList = arrayList2;
                z11 = z16;
                j10 = j12;
                j11 = j13;
            }
            return new c(jN2, z14, z10, z11, arrayList, j10, z12, j11, i10, i11, iL);
        }
    }

    private f(List list) {
        this.f6290a = Collections.unmodifiableList(list);
    }

    static f d(F f10) {
        int iL = f10.L();
        ArrayList arrayList = new ArrayList(iL);
        for (int i10 = 0; i10 < iL; i10++) {
            arrayList.add(c.b(f10));
        }
        return new f(arrayList);
    }
}
