package p058d3;

import R1.z;
import U1.AbstractC1459a;
import U1.AbstractC1477t;
import U1.F;
import U1.S;
import android.util.Pair;
import p380v2.I;
import p380v2.InterfaceC4253p;
import p380v2.InterfaceC4254q;
import p380v2.O;
import p380v2.T;
import p380v2.r;
import p380v2.u;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC4253p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final u f39733h = new p058d3.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f39734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private O f39735b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC0438b f39738e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39736c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f39737d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f39739f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f39740g = -1;

    private static final class a implements InterfaceC0438b {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int[] f39741m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int[] f39742n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f39743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final O f39744b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final p058d3.c f39745c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f39746d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final byte[] f39747e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final F f39748f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f39749g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final R1.r f39750h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f39751i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f39752j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f39753k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f39754l;

        public a(r rVar, O o10, p058d3.c cVar) throws z {
            this.f39743a = rVar;
            this.f39744b = o10;
            this.f39745c = cVar;
            int iMax = Math.max(1, cVar.f39765c / 10);
            this.f39749g = iMax;
            F f10 = new F(cVar.f39769g);
            f10.D();
            int iD = f10.D();
            this.f39746d = iD;
            int i10 = cVar.f39764b;
            int i11 = (((cVar.f39767e - (i10 * 4)) * 8) / (cVar.f39768f * i10)) + 1;
            if (iD == i11) {
                int iK = S.k(iMax, iD);
                this.f39747e = new byte[cVar.f39767e * iK];
                this.f39748f = new F(iK * h(iD, i10));
                int i12 = ((cVar.f39765c * cVar.f39767e) * 8) / iD;
                this.f39750h = new R1.r.b().y0("audio/raw").S(i12).t0(i12).o0(h(iMax, i10)).T(cVar.f39764b).z0(cVar.f39765c).s0(2).P();
                return;
            }
            throw z.a("Expected frames per block: " + i11 + "; got: " + iD, null);
        }

        private void d(byte[] bArr, int i10, F f10) {
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < this.f39745c.f39764b; i12++) {
                    e(bArr, i11, i12, f10.f());
                }
            }
            int iG = g(this.f39746d * i10);
            f10.a0(0);
            f10.Z(iG);
        }

        private void e(byte[] bArr, int i10, int i11, byte[] bArr2) {
            p058d3.c cVar = this.f39745c;
            int i12 = cVar.f39767e;
            int i13 = cVar.f39764b;
            int i14 = (i10 * i12) + (i11 * 4);
            int i15 = (i13 * 4) + i14;
            int i16 = (i12 / i13) - 4;
            int iO = (short) (((bArr[i14 + 1] & 255) << 8) | (bArr[i14] & 255));
            int iMin = Math.min(bArr[i14 + 2] & 255, 88);
            int i17 = f39742n[iMin];
            int i18 = ((i10 * this.f39746d * i13) + i11) * 2;
            bArr2[i18] = (byte) (iO & 255);
            bArr2[i18 + 1] = (byte) (iO >> 8);
            for (int i19 = 0; i19 < i16 * 2; i19++) {
                byte b10 = bArr[((i19 / 8) * i13 * 4) + i15 + ((i19 / 2) % 4)];
                int i20 = i19 % 2 == 0 ? b10 & 15 : (b10 & 255) >> 4;
                int i21 = ((((i20 & 7) * 2) + 1) * i17) >> 3;
                if ((i20 & 8) != 0) {
                    i21 = -i21;
                }
                iO = S.o(iO + i21, -32768, 32767);
                i18 += i13 * 2;
                bArr2[i18] = (byte) (iO & 255);
                bArr2[i18 + 1] = (byte) (iO >> 8);
                int i22 = iMin + f39741m[i20];
                int[] iArr = f39742n;
                iMin = S.o(i22, 0, iArr.length - 1);
                i17 = iArr[iMin];
            }
        }

        private int f(int i10) {
            return i10 / (this.f39745c.f39764b * 2);
        }

        private int g(int i10) {
            return h(i10, this.f39745c.f39764b);
        }

        private static int h(int i10, int i11) {
            return i10 * 2 * i11;
        }

        private void i(int i10) {
            long jA1 = this.f39752j + S.a1(this.f39754l, 1000000L, this.f39745c.f39765c);
            int iG = g(i10);
            this.f39744b.c(jA1, 1, iG, this.f39753k - iG, null);
            this.f39754l += (long) i10;
            this.f39753k -= iG;
        }

        @Override // p058d3.b.InterfaceC0438b
        public void a(int i10, long j10) {
            e eVar = new e(this.f39745c, this.f39746d, i10, j10);
            this.f39743a.p(eVar);
            this.f39744b.b(this.f39750h);
            this.f39744b.d(eVar.m());
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0038 A[LOOP:0: B:6:0x001e->B:12:0x0038, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:23:0x003e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:25:0x001b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0020  */
        /* JADX WARN: Code duplicated, block: B:9:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:4:0x001b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p058d3.b.InterfaceC0438b
        public boolean b(p380v2.InterfaceC4254q r7, long r8) {
            /*
                r6 = this;
                int r0 = r6.f39749g
                int r1 = r6.f39753k
                int r1 = r6.f(r1)
                int r0 = r0 - r1
                int r1 = r6.f39746d
                int r0 = U1.S.k(r0, r1)
                d3.c r1 = r6.f39745c
                int r1 = r1.f39767e
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L1d
            L1b:
                r1 = r2
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L3e
                int r3 = r6.f39751i
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f39747e
                int r5 = r6.f39751i
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.f39751i
                int r4 = r4 + r3
                r6.f39751i = r4
                goto L1e
            L3e:
                int r7 = r6.f39751i
                d3.c r8 = r6.f39745c
                int r8 = r8.f39767e
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.f39747e
                U1.F r9 = r6.f39748f
                r6.d(r8, r7, r9)
                int r8 = r6.f39751i
                d3.c r9 = r6.f39745c
                int r9 = r9.f39767e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f39751i = r8
                U1.F r7 = r6.f39748f
                int r7 = r7.j()
                v2.O r8 = r6.f39744b
                U1.F r9 = r6.f39748f
                r8.f(r9, r7)
                int r8 = r6.f39753k
                int r8 = r8 + r7
                r6.f39753k = r8
                int r7 = r6.f(r8)
                int r8 = r6.f39749g
                if (r7 < r8) goto L75
                r6.i(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.f39753k
                int r7 = r6.f(r7)
                if (r7 <= 0) goto L82
                r6.i(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: d3.b.a.b(v2.q, long):boolean");
        }

        @Override // p058d3.b.InterfaceC0438b
        public void c(long j10) {
            this.f39751i = 0;
            this.f39752j = j10;
            this.f39753k = 0;
            this.f39754l = 0L;
        }
    }

    /* JADX INFO: renamed from: d3.b$b, reason: collision with other inner class name */
    private interface InterfaceC0438b {
        void a(int i10, long j10);

        boolean b(InterfaceC4254q interfaceC4254q, long j10);

        void c(long j10);
    }

    private static final class c implements InterfaceC0438b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f39755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final O f39756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final p058d3.c f39757c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final R1.r f39758d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f39759e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f39760f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f39761g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f39762h;

        public c(r rVar, O o10, p058d3.c cVar, String str, int i10) throws z {
            this.f39755a = rVar;
            this.f39756b = o10;
            this.f39757c = cVar;
            int i11 = (cVar.f39764b * cVar.f39768f) / 8;
            if (cVar.f39767e == i11) {
                int i12 = cVar.f39765c;
                int i13 = i12 * i11 * 8;
                int iMax = Math.max(i11, (i12 * i11) / 10);
                this.f39759e = iMax;
                this.f39758d = new R1.r.b().W("audio/wav").y0(str).S(i13).t0(i13).o0(iMax).T(cVar.f39764b).z0(cVar.f39765c).s0(i10).P();
                return;
            }
            throw z.a("Expected block size: " + i11 + "; got: " + cVar.f39767e, null);
        }

        @Override // p058d3.b.InterfaceC0438b
        public void a(int i10, long j10) {
            e eVar = new e(this.f39757c, 1, i10, j10);
            this.f39755a.p(eVar);
            this.f39756b.b(this.f39758d);
            this.f39756b.d(eVar.m());
        }

        @Override // p058d3.b.InterfaceC0438b
        public boolean b(InterfaceC4254q interfaceC4254q, long j10) {
            int i10;
            int i11;
            long j11 = j10;
            while (j11 > 0 && (i10 = this.f39761g) < (i11 = this.f39759e)) {
                int iA = this.f39756b.a(interfaceC4254q, (int) Math.min(i11 - i10, j11), true);
                if (iA == -1) {
                    j11 = 0;
                } else {
                    this.f39761g += iA;
                    j11 -= (long) iA;
                }
            }
            p058d3.c cVar = this.f39757c;
            int i12 = cVar.f39767e;
            int i13 = this.f39761g / i12;
            if (i13 > 0) {
                long jA1 = this.f39760f + S.a1(this.f39762h, 1000000L, cVar.f39765c);
                int i14 = i13 * i12;
                int i15 = this.f39761g - i14;
                this.f39756b.c(jA1, 1, i14, i15, null);
                this.f39762h += (long) i13;
                this.f39761g = i15;
            }
            return j11 <= 0;
        }

        @Override // p058d3.b.InterfaceC0438b
        public void c(long j10) {
            this.f39760f = j10;
            this.f39761g = 0;
            this.f39762h = 0L;
        }
    }

    public static /* synthetic */ InterfaceC4253p[] c() {
        return new InterfaceC4253p[]{new b()};
    }

    private void d() {
        AbstractC1459a.i(this.f39735b);
        S.i(this.f39734a);
    }

    private void e(InterfaceC4254q interfaceC4254q) throws z {
        AbstractC1459a.g(interfaceC4254q.getPosition() == 0);
        int i10 = this.f39739f;
        if (i10 != -1) {
            interfaceC4254q.l(i10);
            this.f39736c = 4;
        } else {
            if (!d.a(interfaceC4254q)) {
                throw z.a("Unsupported or unrecognized wav file type.", null);
            }
            interfaceC4254q.l((int) (interfaceC4254q.h() - interfaceC4254q.getPosition()));
            this.f39736c = 1;
        }
    }

    private void h(InterfaceC4254q interfaceC4254q) throws z {
        p058d3.c cVarB = d.b(interfaceC4254q);
        int i10 = cVarB.f39763a;
        if (i10 == 17) {
            this.f39738e = new a(this.f39734a, this.f39735b, cVarB);
        } else if (i10 == 6) {
            this.f39738e = new c(this.f39734a, this.f39735b, cVarB, "audio/g711-alaw", -1);
        } else if (i10 == 7) {
            this.f39738e = new c(this.f39734a, this.f39735b, cVarB, "audio/g711-mlaw", -1);
        } else {
            int iA = T.a(i10, cVarB.f39768f);
            if (iA == 0) {
                throw z.d("Unsupported WAV format type: " + cVarB.f39763a);
            }
            this.f39738e = new c(this.f39734a, this.f39735b, cVarB, "audio/raw", iA);
        }
        this.f39736c = 3;
    }

    private void i(InterfaceC4254q interfaceC4254q) {
        this.f39737d = d.c(interfaceC4254q);
        this.f39736c = 2;
    }

    private int l(InterfaceC4254q interfaceC4254q) {
        AbstractC1459a.g(this.f39740g != -1);
        return ((InterfaceC0438b) AbstractC1459a.e(this.f39738e)).b(interfaceC4254q, this.f39740g - interfaceC4254q.getPosition()) ? -1 : 0;
    }

    private void m(InterfaceC4254q interfaceC4254q) throws z {
        Pair pairE = d.e(interfaceC4254q);
        this.f39739f = ((Long) pairE.first).intValue();
        long jLongValue = ((Long) pairE.second).longValue();
        long j10 = this.f39737d;
        if (j10 != -1 && jLongValue == 4294967295L) {
            jLongValue = j10;
        }
        this.f39740g = ((long) this.f39739f) + jLongValue;
        long length = interfaceC4254q.getLength();
        if (length != -1 && this.f39740g > length) {
            AbstractC1477t.h("WavExtractor", "Data exceeds input length: " + this.f39740g + ", " + length);
            this.f39740g = length;
        }
        ((InterfaceC0438b) AbstractC1459a.e(this.f39738e)).a(this.f39739f, this.f39740g);
        this.f39736c = 4;
    }

    @Override // p380v2.InterfaceC4253p
    public void a(long j10, long j11) {
        this.f39736c = j10 == 0 ? 0 : 4;
        InterfaceC0438b interfaceC0438b = this.f39738e;
        if (interfaceC0438b != null) {
            interfaceC0438b.c(j11);
        }
    }

    @Override // p380v2.InterfaceC4253p
    public void b(r rVar) {
        this.f39734a = rVar;
        this.f39735b = rVar.f(0, 1);
        rVar.t();
    }

    @Override // p380v2.InterfaceC4253p
    public boolean f(InterfaceC4254q interfaceC4254q) {
        return d.a(interfaceC4254q);
    }

    @Override // p380v2.InterfaceC4253p
    public int j(InterfaceC4254q interfaceC4254q, I i10) throws z {
        d();
        int i11 = this.f39736c;
        if (i11 == 0) {
            e(interfaceC4254q);
            return 0;
        }
        if (i11 == 1) {
            i(interfaceC4254q);
            return 0;
        }
        if (i11 == 2) {
            h(interfaceC4254q);
            return 0;
        }
        if (i11 == 3) {
            m(interfaceC4254q);
            return 0;
        }
        if (i11 == 4) {
            return l(interfaceC4254q);
        }
        throw new IllegalStateException();
    }

    @Override // p380v2.InterfaceC4253p
    public void release() {
    }
}
