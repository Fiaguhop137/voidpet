package R1;

import U1.AbstractC1459a;
import U1.S;
import android.net.Uri;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: R1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1341a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1341a f10098g = new C1341a(null, new C0160a[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final C0160a f10099h = new C0160a(0).h(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f10100i = S.z0(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f10101j = S.z0(2);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f10102k = S.z0(3);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f10103l = S.z0(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C0160a[] f10109f;

    /* JADX INFO: renamed from: R1.a$a, reason: collision with other inner class name */
    public static final class C0160a {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f10110l = S.z0(0);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f10111m = S.z0(1);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f10112n = S.z0(2);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f10113o = S.z0(3);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final String f10114p = S.z0(4);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f10115q = S.z0(5);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final String f10116r = S.z0(6);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final String f10117s = S.z0(7);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        static final String f10118t = S.z0(8);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        static final String f10119u = S.z0(9);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        static final String f10120v = S.z0(10);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f10121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10122b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f10123c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Uri[] f10124d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final u[] f10125e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[] f10126f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long[] f10127g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String[] f10128h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f10129i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f10130j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f10131k;

        public C0160a(long j10) {
            this(j10, -1, -1, new int[0], new u[0], new long[0], 0L, false, new String[0], false);
        }

        private C0160a(long j10, int i10, int i11, int[] iArr, u[] uVarArr, long[] jArr, long j11, boolean z10, String[] strArr, boolean z11) {
            int i12 = 0;
            AbstractC1459a.a(iArr.length == uVarArr.length);
            this.f10121a = j10;
            this.f10122b = i10;
            this.f10123c = i11;
            this.f10126f = iArr;
            this.f10125e = uVarArr;
            this.f10127g = jArr;
            this.f10129i = j11;
            this.f10130j = z10;
            this.f10124d = new Uri[uVarArr.length];
            while (true) {
                Uri[] uriArr = this.f10124d;
                if (i12 >= uriArr.length) {
                    this.f10128h = strArr;
                    this.f10131k = z11;
                    return;
                } else {
                    u uVar = uVarArr[i12];
                    uriArr[i12] = uVar == null ? null : ((u.h) AbstractC1459a.e(uVar.f10345b)).f10440a;
                    i12++;
                }
            }
        }

        private static long[] a(long[] jArr, int i10) {
            int length = jArr.length;
            int iMax = Math.max(i10, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, -9223372036854775807L);
            return jArrCopyOf;
        }

        private static int[] b(int[] iArr, int i10) {
            int length = iArr.length;
            int iMax = Math.max(i10, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        public int c() {
            return d(-1);
        }

        public int d(int i10) {
            int i11;
            int i12 = i10 + 1;
            while (true) {
                int[] iArr = this.f10126f;
                if (i12 >= iArr.length || this.f10130j || (i11 = iArr[i12]) == 0 || i11 == 1) {
                    break;
                }
                i12++;
            }
            return i12;
        }

        public boolean e() {
            if (this.f10122b == -1) {
                return true;
            }
            for (int i10 = 0; i10 < this.f10122b; i10++) {
                int i11 = this.f10126f[i10];
                if (i11 == 0 || i11 == 1) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C0160a.class == obj.getClass()) {
                C0160a c0160a = (C0160a) obj;
                if (this.f10121a == c0160a.f10121a && this.f10122b == c0160a.f10122b && this.f10123c == c0160a.f10123c && Arrays.equals(this.f10125e, c0160a.f10125e) && Arrays.equals(this.f10126f, c0160a.f10126f) && Arrays.equals(this.f10127g, c0160a.f10127g) && this.f10129i == c0160a.f10129i && this.f10130j == c0160a.f10130j && Arrays.equals(this.f10128h, c0160a.f10128h) && this.f10131k == c0160a.f10131k) {
                    return true;
                }
            }
            return false;
        }

        public boolean f() {
            return this.f10131k && this.f10121a == Long.MIN_VALUE && this.f10122b == -1;
        }

        public boolean g() {
            return this.f10122b == -1 || c() < this.f10122b;
        }

        public C0160a h(int i10) {
            int[] iArrB = b(this.f10126f, i10);
            long[] jArrA = a(this.f10127g, i10);
            return new C0160a(this.f10121a, i10, this.f10123c, iArrB, (u[]) Arrays.copyOf(this.f10125e, i10), jArrA, this.f10129i, this.f10130j, (String[]) Arrays.copyOf(this.f10128h, i10), this.f10131k);
        }

        public int hashCode() {
            int i10 = ((this.f10122b * 31) + this.f10123c) * 31;
            long j10 = this.f10121a;
            int iHashCode = (((((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f10125e)) * 31) + Arrays.hashCode(this.f10126f)) * 31) + Arrays.hashCode(this.f10127g)) * 31;
            long j11 = this.f10129i;
            return ((((((iHashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f10130j ? 1 : 0)) * 31) + Arrays.hashCode(this.f10128h)) * 31) + (this.f10131k ? 1 : 0);
        }
    }

    private C1341a(Object obj, C0160a[] c0160aArr, long j10, long j11, int i10) {
        this.f10104a = obj;
        this.f10106c = j10;
        this.f10107d = j11;
        this.f10105b = c0160aArr.length + i10;
        this.f10109f = c0160aArr;
        this.f10108e = i10;
    }

    private boolean e(long j10, long j11, int i10) {
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        C0160a c0160aA = a(i10);
        long j12 = c0160aA.f10121a;
        if (j12 == Long.MIN_VALUE) {
            return j11 == -9223372036854775807L || c0160aA.f() || j10 < j11;
        }
        return j10 < j12;
    }

    public C0160a a(int i10) {
        int i11 = this.f10108e;
        return i10 < i11 ? f10099h : this.f10109f[i10 - i11];
    }

    public int b(long j10, long j11) {
        if (j10 != Long.MIN_VALUE && (j11 == -9223372036854775807L || j10 < j11)) {
            int i10 = this.f10108e;
            while (i10 < this.f10105b && ((a(i10).f10121a != Long.MIN_VALUE && a(i10).f10121a <= j10) || !a(i10).g())) {
                i10++;
            }
            if (i10 < this.f10105b && (j11 == -9223372036854775807L || a(i10).f10121a <= j11)) {
                return i10;
            }
        }
        return -1;
    }

    public int c(long j10, long j11) {
        int i10 = this.f10105b - 1;
        int i11 = i10 - (d(i10) ? 1 : 0);
        while (i11 >= 0) {
            long j12 = j10;
            long j13 = j11;
            if (!e(j12, j13, i11)) {
                break;
            }
            i11--;
            j10 = j12;
            j11 = j13;
        }
        if (i11 < 0 || !a(i11).e()) {
            return -1;
        }
        return i11;
    }

    public boolean d(int i10) {
        return i10 == this.f10105b - 1 && a(i10).f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1341a.class == obj.getClass()) {
            C1341a c1341a = (C1341a) obj;
            if (Objects.equals(this.f10104a, c1341a.f10104a) && this.f10105b == c1341a.f10105b && this.f10106c == c1341a.f10106c && this.f10107d == c1341a.f10107d && this.f10108e == c1341a.f10108e && Arrays.equals(this.f10109f, c1341a.f10109f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f10105b * 31;
        Object obj = this.f10104a;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f10106c)) * 31) + ((int) this.f10107d)) * 31) + this.f10108e) * 31) + Arrays.hashCode(this.f10109f);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adsId=");
        sb2.append(this.f10104a);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f10106c);
        sb2.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f10109f.length; i10++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f10109f[i10].f10121a);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < this.f10109f[i10].f10126f.length; i11++) {
                sb2.append("ad(state=");
                int i12 = this.f10109f[i10].f10126f[i11];
                if (i12 == 0) {
                    sb2.append('_');
                } else if (i12 == 1) {
                    sb2.append('R');
                } else if (i12 == 2) {
                    sb2.append('S');
                } else if (i12 == 3) {
                    sb2.append('P');
                } else if (i12 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(this.f10109f[i10].f10127g[i11]);
                sb2.append(')');
                if (i11 < this.f10109f[i10].f10126f.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < this.f10109f.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }
}
