package P2;

import C9.AbstractC0876t;
import R1.C1349i;
import R1.y;
import R1.z;
import U1.AbstractC1459a;
import U1.AbstractC1467i;
import U1.AbstractC1477t;
import U1.E;
import U1.F;
import U1.S;
import android.util.Pair;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p380v2.AbstractC4255s;
import p380v2.B;
import p380v2.C;
import p380v2.C4241d;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f8590a = S.u0("OpusHead");

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f8591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f8592b;

        public a(long j10, long j11) {
            this.f8591a = j10;
            this.f8592b = j11;
        }

        static /* synthetic */ long a(a aVar) {
            return aVar.f8592b;
        }

        static /* synthetic */ long b(a aVar) {
            return aVar.f8591a;
        }
    }

    /* JADX INFO: renamed from: P2.b$b, reason: collision with other inner class name */
    private static final class C0146b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8594b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8595c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f8596d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f8597e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final F f8598f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final F f8599g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f8600h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f8601i;

        public C0146b(F f10, F f11, boolean z10) throws z {
            this.f8599g = f10;
            this.f8598f = f11;
            this.f8597e = z10;
            f11.a0(12);
            this.f8593a = f11.P();
            f10.a0(12);
            this.f8601i = f10.P();
            AbstractC4255s.a(f10.u() == 1, "first_chunk must be 1");
            this.f8594b = -1;
        }

        public boolean a() {
            int i10 = this.f8594b + 1;
            this.f8594b = i10;
            if (i10 == this.f8593a) {
                return false;
            }
            this.f8596d = this.f8597e ? this.f8598f.S() : this.f8598f.N();
            if (this.f8594b == this.f8600h) {
                this.f8595c = this.f8599g.P();
                this.f8599g.b0(4);
                int i11 = this.f8601i - 1;
                this.f8601i = i11;
                this.f8600h = i11 > 0 ? this.f8599g.P() - 1 : -1;
            }
            return true;
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f8603b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f8604c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f8605d;

        public c(String str, byte[] bArr, long j10, long j11) {
            this.f8602a = str;
            this.f8603b = bArr;
            this.f8604c = j10;
            this.f8605d = j11;
        }

        static /* synthetic */ String a(c cVar) {
            return cVar.f8602a;
        }

        static /* synthetic */ long b(c cVar) {
            return cVar.f8605d;
        }

        static /* synthetic */ long c(c cVar) {
            return cVar.f8604c;
        }

        static /* synthetic */ byte[] d(c cVar) {
            return cVar.f8603b;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f8606a;

        public d(g gVar) {
            this.f8606a = gVar;
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f8607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f8608b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f8609c;

        public e(long j10, long j11, String str) {
            this.f8607a = j10;
            this.f8608b = j11;
            this.f8609c = str;
        }
    }

    private interface f {
        int a();

        int b();

        int c();
    }

    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f8610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f8611b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f8612c;

        public g(boolean z10, boolean z11, boolean z12) {
            this.f8610a = z10;
            this.f8611b = z11;
            this.f8612c = z12;
        }
    }

    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u[] f8613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public R1.r f8614b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8615c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f8616d = 0;

        public h(int i10) {
            this.f8613a = new u[i10];
        }
    }

    static final class i implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f8617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f8618b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final F f8619c;

        public i(V1.e.c cVar, R1.r rVar) {
            F f10 = cVar.f13914b;
            this.f8619c = f10;
            f10.a0(12);
            int iP = f10.P();
            if ("audio/raw".equals(rVar.f10277o)) {
                int iL0 = S.l0(rVar.f10254I, rVar.f10252G);
                if (iP == 0 || iP % iL0 != 0) {
                    AbstractC1477t.h("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iL0 + ", stsz sample size: " + iP);
                    iP = iL0;
                }
            }
            this.f8617a = iP == 0 ? -1 : iP;
            this.f8618b = f10.P();
        }

        @Override // P2.b.f
        public int a() {
            int i10 = this.f8617a;
            return i10 == -1 ? this.f8619c.P() : i10;
        }

        @Override // P2.b.f
        public int b() {
            return this.f8617a;
        }

        @Override // P2.b.f
        public int c() {
            return this.f8618b;
        }
    }

    static final class j implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final F f8620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f8621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f8622c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f8623d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f8624e;

        public j(V1.e.c cVar) {
            F f10 = cVar.f13914b;
            this.f8620a = f10;
            f10.a0(12);
            this.f8622c = f10.P() & 255;
            this.f8621b = f10.P();
        }

        @Override // P2.b.f
        public int a() {
            int i10 = this.f8622c;
            if (i10 == 8) {
                return this.f8620a.L();
            }
            if (i10 == 16) {
                return this.f8620a.T();
            }
            int i11 = this.f8623d;
            this.f8623d = i11 + 1;
            if (i11 % 2 != 0) {
                return this.f8624e & 15;
            }
            int iL = this.f8620a.L();
            this.f8624e = iL;
            return (iL & 240) >> 4;
        }

        @Override // P2.b.f
        public int b() {
            return -1;
        }

        @Override // P2.b.f
        public int c() {
            return this.f8621b;
        }
    }

    private static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f8625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f8626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f8627c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f8628d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f8629e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f8630f;

        public k(int i10, long j10, int i11, int i12, int i13, int i14) {
            this.f8625a = i10;
            this.f8626b = j10;
            this.f8627c = i11;
            this.f8628d = i12;
            this.f8629e = i13;
            this.f8630f = i14;
        }
    }

    static final class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f8631a;

        public l(d dVar) {
            this.f8631a = dVar;
        }

        public boolean b() {
            d dVar = this.f8631a;
            return dVar != null && dVar.f8606a.f8610a && this.f8631a.f8606a.f8611b;
        }
    }

    private static u A(F f10, int i10, int i11, String str) {
        int i12;
        int i13;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            f10.a0(i14);
            int iU = f10.u();
            if (f10.u() == 1952804451) {
                int iQ = q(f10.u());
                f10.b0(1);
                if (iQ == 0) {
                    f10.b0(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int iL = f10.L();
                    i12 = iL & 15;
                    i13 = (iL & 240) >> 4;
                }
                boolean z10 = f10.L() == 1;
                int iL2 = f10.L();
                byte[] bArr2 = new byte[16];
                f10.q(bArr2, 0, 16);
                if (z10 && iL2 == 0) {
                    int iL3 = f10.L();
                    bArr = new byte[iL3];
                    f10.q(bArr, 0, iL3);
                }
                return new u(z10, str, iL2, bArr2, i13, i12, bArr);
            }
            i14 += iU;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r22v10, types: [int[]] */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2, types: [int] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r8v10, types: [int] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    public static w B(t tVar, V1.e.b bVar, B b10) throws z {
        f jVar;
        boolean z10;
        int iP;
        int iP2;
        int iP3;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        boolean z12;
        long[] jArr;
        int[] iArr2;
        long j10;
        long j11;
        int i14;
        long[] jArr2;
        int[] iArr3;
        int[] iArr4;
        ?? r10;
        int[] iArr5;
        boolean z13;
        int[] iArr6;
        int i15;
        boolean z14;
        int i16;
        t tVarA = tVar;
        V1.e.c cVarE = bVar.e(1937011578);
        if (cVarE != null) {
            jVar = new i(cVarE, tVarA.f8766g);
        } else {
            V1.e.c cVarE2 = bVar.e(1937013298);
            if (cVarE2 == null) {
                throw z.a("Track has no sample table size information", null);
            }
            jVar = new j(cVarE2);
        }
        int iC = jVar.c();
        if (iC == 0) {
            return new w(tVarA, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        if (tVarA.f8761b == 2) {
            long j12 = tVarA.f8765f;
            if (j12 > 0) {
                tVarA = tVarA.a(tVarA.f8766g.b().f0(iC / (j12 / 1000000.0f)).P());
            }
        }
        V1.e.c cVarE3 = bVar.e(1937007471);
        if (cVarE3 == null) {
            cVarE3 = (V1.e.c) AbstractC1459a.e(bVar.e(1668232756));
            z10 = true;
        } else {
            z10 = false;
        }
        F f10 = cVarE3.f13914b;
        F f11 = ((V1.e.c) AbstractC1459a.e(bVar.e(1937011555))).f13914b;
        F f12 = ((V1.e.c) AbstractC1459a.e(bVar.e(1937011827))).f13914b;
        V1.e.c cVarE4 = bVar.e(1937011571);
        F f13 = cVarE4 != null ? cVarE4.f13914b : null;
        V1.e.c cVarE5 = bVar.e(1668576371);
        F f14 = cVarE5 != null ? cVarE5.f13914b : null;
        C0146b c0146b = new C0146b(f11, f10, z10);
        f12.a0(12);
        int iP4 = f12.P() - 1;
        int iP5 = f12.P();
        int iP6 = f12.P();
        if (f14 != null) {
            f14.a0(12);
            iP = f14.P();
        } else {
            iP = 0;
        }
        if (f13 != null) {
            f13.a0(12);
            iP3 = f13.P();
            if (iP3 > 0) {
                iP2 = f13.P() - 1;
                z11 = false;
            } else {
                iP2 = -1;
                z11 = false;
                f13 = null;
            }
        } else {
            iP2 = -1;
            iP3 = 0;
            z11 = false;
        }
        int iB = jVar.b();
        String str = tVarA.f8766g.f10277o;
        if ((iB == -1 || !(("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && iP4 == 0 && iP == 0 && iP3 == 0)) ? z11 ? 1 : 0 : true) {
            int i17 = c0146b.f8593a;
            long[] jArr3 = new long[i17];
            int[] iArr7 = new int[i17];
            while (c0146b.a()) {
                int i18 = c0146b.f8594b;
                jArr3[i18] = c0146b.f8596d;
                iArr7[i18] = c0146b.f8595c;
            }
            P2.d.b bVarA = P2.d.a(iB, jArr3, iArr7, iP6);
            long[] jArr4 = bVarA.f8636a;
            int[] iArr8 = bVarA.f8637b;
            int i19 = bVarA.f8638c;
            long[] jArr5 = bVarA.f8639d;
            int[] iArr9 = bVarA.f8640e;
            long j13 = bVarA.f8641f;
            j11 = bVarA.f8642g;
            j10 = j13;
            i10 = 1;
            jArr = jArr5;
            iArr2 = iArr9;
            i14 = i19;
            iArr3 = iArr8;
            jArr2 = jArr4;
        } else {
            long[] jArr6 = new long[iC];
            int[] iArr10 = new int[iC];
            long[] jArrCopyOf = new long[iC];
            i10 = 1;
            int[] iArrCopyOf = new int[iC];
            F f15 = f14;
            f fVar = jVar;
            int iU = iP6;
            F f16 = f13;
            long j14 = 0;
            long j15 = 0;
            int i20 = iP;
            int iP7 = iP2;
            int i21 = z11 ? 1 : 0;
            int iU2 = i21;
            int i22 = iU2 == true ? 1 : 0;
            int i23 = i22;
            int iP8 = iP5;
            long j16 = 0;
            int i24 = iP4;
            int i25 = iP3;
            int i26 = i23 == true ? 1 : 0;
            while (true) {
                if (i21 >= iC) {
                    boolean z15 = iC == true ? 1 : 0;
                    i11 = i24;
                    i12 = iP8;
                    iArr = iArr10;
                    i13 = i22;
                    break;
                }
                long j17 = j15;
                int i27 = i22;
                boolean zA = true;
                while (i27 == 0) {
                    zA = c0146b.a();
                    if (!zA) {
                        break;
                    }
                    int i28 = i24;
                    long j18 = c0146b.f8596d;
                    i27 = c0146b.f8595c;
                    j17 = j18;
                    i24 = i28;
                    iP8 = iP8;
                    iC = iC == true ? 1 : 0;
                }
                int i29 = iC;
                i11 = i24;
                i12 = iP8;
                if (!zA) {
                    AbstractC1477t.h("BoxParsers", "Unexpected end of chunk data");
                    long[] jArrCopyOf2 = Arrays.copyOf(jArr6, i21);
                    int[] iArrCopyOf2 = Arrays.copyOf(iArr10, i21);
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i21);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i21);
                    jArr6 = jArrCopyOf2;
                    iArr = iArrCopyOf2;
                    iC = i21;
                    i13 = i27;
                    break;
                }
                if (f15 != null) {
                    int iP9 = i23 == true ? 1 : 0;
                    while (iP9 == 0 && i20 > 0) {
                        iP9 = f15.P();
                        iU2 = f15.u();
                        i20--;
                    }
                    i23 = iP9 - 1;
                }
                jArr6[i21] = j17;
                int iA = fVar.a();
                iArr10[i21] = iA;
                j16 += (long) iA;
                if (iA > i26) {
                    i26 = iA;
                }
                jArrCopyOf[i21] = j14 + ((long) iU2);
                iArrCopyOf[i21] = f16 == null ? 1 : z11 ? 1 : 0;
                if (i21 == iP7) {
                    iArrCopyOf[i21] = 1;
                    i25--;
                    if (i25 > 0) {
                        iP7 = ((F) AbstractC1459a.e(f16)).P() - 1;
                    }
                }
                j14 += (long) iU;
                iP8 = i12 - 1;
                if (iP8 != 0 || i11 <= 0) {
                    i24 = i11;
                } else {
                    i24 = i11 - 1;
                    iP8 = f12.P();
                    iU = f12.u();
                }
                long j19 = j17 + ((long) iArr10[i21]);
                i22 = i27 - 1;
                i21++;
                j15 = j19;
                iC = i29 == true ? 1 : 0;
            }
            long j20 = j14 + ((long) iU2);
            if (f15 == null) {
                z12 = true;
                break;
            }
            while (true) {
                if (i20 <= 0) {
                    z12 = true;
                    break;
                }
                if (f15.P() != 0) {
                    z12 = z11 ? 1 : 0;
                    break;
                }
                f15.u();
                i20--;
            }
            if (i25 != 0 || i12 != 0 || i13 != 0 || i11 != 0 || i23 != 0 || !z12) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Inconsistent stbl box for track ");
                sb2.append(tVarA.f8760a);
                sb2.append(": remainingSynchronizationSamples ");
                sb2.append(i25);
                sb2.append(", remainingSamplesAtTimestampDelta ");
                sb2.append(i12);
                sb2.append(", remainingSamplesInChunk ");
                sb2.append(i13);
                sb2.append(", remainingTimestampDeltaChanges ");
                sb2.append(i11);
                sb2.append(", remainingSamplesAtTimestampOffset ");
                sb2.append(i23 == true ? 1 : 0 ? 1 : 0);
                sb2.append(!z12 ? ", ctts invalid" : "");
                AbstractC1477t.h("BoxParsers", sb2.toString());
            }
            jArr = jArrCopyOf;
            iArr2 = iArrCopyOf;
            j10 = j20;
            j11 = j16;
            i14 = i26 == true ? 1 : 0;
            jArr2 = jArr6;
            iArr3 = iArr;
        }
        long j21 = tVarA.f8765f;
        if (j21 > 0) {
            long jD1 = S.d1(j11 * 8, 1000000L, j21, RoundingMode.HALF_DOWN);
            if (jD1 > 0 && jD1 < 2147483647L) {
                tVarA = tVarA.a(tVarA.f8766g.b().S((int) jD1).P());
            }
        }
        t tVarA2 = tVarA;
        long jA1 = S.a1(j10, 1000000L, tVarA2.f8762c);
        long[] jArr7 = tVarA2.f8768i;
        if (jArr7 == null) {
            S.c1(jArr, 1000000L, tVarA2.f8762c);
            return new w(tVarA2, jArr2, iArr3, i14 == true ? 1 : 0, jArr, iArr2, jA1);
        }
        int[] iArr11 = iArr2;
        int i30 = i10;
        if (jArr7.length == i30 && tVarA2.f8761b == i30 && jArr.length >= 2) {
            long j22 = ((long[]) AbstractC1459a.e(tVarA2.f8769j))[z11 ? 1 : 0];
            long jA2 = j22 + S.a1(tVarA2.f8768i[z11 ? 1 : 0], tVarA2.f8762c, tVarA2.f8763d);
            if (b(jArr, j10, j22, jA2)) {
                long jA3 = S.a1(j22 - jArr[z11 ? 1 : 0], tVarA2.f8766g.f10253H, tVarA2.f8762c);
                long jA4 = S.a1(j10 - jA2, tVarA2.f8766g.f10253H, tVarA2.f8762c);
                if ((jA3 != 0 || jA4 != 0) && jA3 <= 2147483647L && jA4 <= 2147483647L) {
                    b10.f55932a = (int) jA3;
                    b10.f55933b = (int) jA4;
                    S.c1(jArr, 1000000L, tVarA2.f8762c);
                    return new w(tVarA2, jArr2, iArr3, i14 == true ? 1 : 0, jArr, iArr11, S.a1(tVarA2.f8768i[z11 ? 1 : 0], 1000000L, tVarA2.f8763d));
                }
            }
        }
        long[] jArr8 = tVarA2.f8768i;
        if (jArr8.length == 1 && jArr8[z11 ? 1 : 0] == 0) {
            long j23 = ((long[]) AbstractC1459a.e(tVarA2.f8769j))[z11 ? 1 : 0];
            for (int i31 = z11 ? 1 : 0; i31 < jArr.length; i31++) {
                jArr[i31] = S.a1(jArr[i31] - j23, 1000000L, tVarA2.f8762c);
            }
            return new w(tVarA2, jArr2, iArr3, i14 == true ? 1 : 0, jArr, iArr11, S.a1(j10 - j23, 1000000L, tVarA2.f8762c));
        }
        boolean z16 = tVarA2.f8761b == 1 ? true : z11 ? 1 : 0;
        int[] iArr12 = new int[jArr8.length];
        int[] iArr13 = new int[jArr8.length];
        long[] jArr9 = (long[]) AbstractC1459a.e(tVarA2.f8769j);
        int i32 = z11 ? 1 : 0;
        int i33 = i32;
        int i34 = i33 == true ? 1 : 0;
        int i35 = i34;
        while (true) {
            long[] jArr10 = tVarA2.f8768i;
            iArr4 = iArr13;
            if (i32 >= jArr10.length) {
                break;
            }
            int i36 = i32;
            int i37 = i33;
            long j24 = jArr9[i36 == true ? 1 : 0];
            if (j24 != -1) {
                long jA5 = S.a1(jArr10[i36 == true ? 1 : 0], tVarA2.f8762c, tVarA2.f8763d);
                i15 = i36 == true ? 1 : 0;
                iArr12[i15 == true ? 1 : 0] = S.h(jArr, j24, true, true);
                long j25 = j24 + jA5;
                z14 = z11;
                iArr4[i15 == true ? 1 : 0] = S.d(jArr, j25, z16, z14);
                int i38 = iArr12[i15 == true ? 1 : 0];
                while (true) {
                    i16 = iArr12[i15 == true ? 1 : 0];
                    if (i16 < 0 || (iArr11[i16] & 1) != 0) {
                        break;
                    }
                    iArr12[i15 == true ? 1 : 0] = i16 - 1;
                }
                if (i16 < 0) {
                    iArr12[i15 == true ? 1 : 0] = i38;
                    while (true) {
                        int i39 = iArr12[i15 == true ? 1 : 0];
                        if (i39 >= iArr4[i15 == true ? 1 : 0] || (iArr11[i39] & 1) != 0) {
                            break;
                        }
                        iArr12[i15 == true ? 1 : 0] = i39 + 1;
                    }
                }
                if (tVarA2.f8761b == 2 && iArr12[i15 == true ? 1 : 0] != iArr4[i15 == true ? 1 : 0]) {
                    while (true) {
                        int i40 = iArr4[i15 == true ? 1 : 0];
                        if (i40 >= jArr.length - 1 || jArr[i40 + 1] > j25) {
                            break;
                        }
                        iArr4[i15 == true ? 1 : 0] = i40 + 1;
                    }
                }
                int i41 = iArr4[i15 == true ? 1 : 0];
                int i42 = iArr12[i15 == true ? 1 : 0];
                i34 += i41 - i42;
                i33 = (i37 == true ? 1 : 0) | (i35 != i42 ? 1 : z14 ? 1 : 0);
                i35 = i41;
            } else {
                i15 = i36 == true ? 1 : 0;
                z14 = z11;
                i33 = i37 == true ? 1 : 0;
            }
            i32 = i15 + 1;
            z11 = z14;
            iArr3 = iArr3;
            iArr13 = iArr4;
            i14 = i14;
        }
        ?? r15 = iArr3;
        int i43 = i14;
        boolean z17 = z11;
        boolean z18 = (i33 == true ? 1 : 0) | (i34 != iC ? true : z17);
        long[] jArr11 = z18 != 0 ? new long[i34] : jArr2;
        if (z18 != 0) {
            iArr6 = new int[i34];
        } else {
            r10 = r15;
        }
        boolean z19 = z18 != 0 ? z17 : i43 == true ? 1 : 0;
        if (z18 != 0) {
            r10 = iArr6;
            r10 = iArr6;
            iArr5 = new int[i34];
        } else {
            r10 = iArr6;
            r10 = iArr6;
            iArr5 = iArr11;
        }
        long[] jArr12 = new long[i34];
        ?? r23 = z19;
        boolean z20 = z17;
        int i44 = z20 ? 1 : 0;
        long j26 = 0;
        boolean z21 = z18;
        boolean z22 = z20;
        for (?? r11 = z17; r11 < tVarA2.f8768i.length; r11++) {
            long j27 = tVarA2.f8769j[r11];
            int i45 = iArr12[r11];
            int i46 = iArr4[r11];
            boolean z23 = z21;
            if (z21 != 0) {
                int i47 = i46 - i45;
                System.arraycopy(jArr2, i45, jArr11, i44, i47);
                System.arraycopy(r15, i45, r10, i44, i47);
                System.arraycopy(iArr11, i45, iArr5, i44, i47);
            }
            ?? r12 = r23;
            boolean z24 = z22;
            while (i45 < i46) {
                long[] jArr13 = jArr11;
                int[] iArr14 = iArr12;
                long jA6 = S.a1(j26, 1000000L, tVarA2.f8763d);
                long jA7 = S.a1(jArr[i45] - j27, 1000000L, tVarA2.f8762c);
                if (jA7 < 0) {
                    z13 = z24;
                    z13 = true;
                }
                z13 = z24;
                jArr12[i44] = jA6 + jA7;
                if (z23 != 0 && r10[i44] > r12) {
                    r12 = r15[i45];
                }
                i44++;
                i45++;
                iArr12 = iArr14;
                jArr11 = jArr13;
                r12 = r12;
                z24 = z13;
            }
            j26 += tVarA2.f8768i[r11];
            r23 = r12;
            jArr11 = jArr11;
            z21 = z23;
            z22 = z24;
        }
        long[] jArr14 = jArr11;
        long jA8 = S.a1(j26, 1000000L, tVarA2.f8763d);
        if (z22) {
            tVarA2 = tVarA2.a(tVarA2.f8766g.b().g0(true).P());
        }
        return new w(tVarA2, jArr14, r10, r23, jArr12, iArr5, jA8);
    }

    private static d C(F f10, int i10, int i11) throws z {
        f10.a0(i10 + 8);
        int iG = f10.g();
        while (iG - i10 < i11) {
            f10.a0(iG);
            int iU = f10.u();
            AbstractC4255s.a(iU > 0, "childAtomSize must be positive");
            if (f10.u() == 1937011305) {
                f10.b0(4);
                int iL = f10.L();
                return new d(new g((iL & 1) == 1, (iL & 2) == 2, (iL & 8) == 8));
            }
            iG += iU;
        }
        return null;
    }

    private static h D(F f10, k kVar, String str, R1.n nVar, boolean z10) throws z {
        f10.a0(12);
        int iU = f10.u();
        h hVar = new h(iU);
        for (int i10 = 0; i10 < iU; i10++) {
            int iG = f10.g();
            int iU2 = f10.u();
            AbstractC4255s.a(iU2 > 0, "childAtomSize must be positive");
            int iU3 = f10.u();
            if (iU3 == 1635148593 || iU3 == 1635148595 || iU3 == 1701733238 || iU3 == 1831958048 || iU3 == 1836070006 || iU3 == 1752589105 || iU3 == 1751479857 || iU3 == 1932670515 || iU3 == 1211250227 || iU3 == 1748121139 || iU3 == 1987063864 || iU3 == 1987063865 || iU3 == 1635135537 || iU3 == 1685479798 || iU3 == 1685479729 || iU3 == 1685481573 || iU3 == 1685481521 || iU3 == 1634760241) {
                L(f10, iU3, iG, iU2, kVar.f8625a, str, kVar.f8628d, nVar, hVar, i10);
            } else if (iU3 == 1836069985 || iU3 == 1701733217 || iU3 == 1633889587 || iU3 == 1700998451 || iU3 == 1633889588 || iU3 == 1835823201 || iU3 == 1685353315 || iU3 == 1685353317 || iU3 == 1685353320 || iU3 == 1685353324 || iU3 == 1685353336 || iU3 == 1935764850 || iU3 == 1935767394 || iU3 == 1819304813 || iU3 == 1936684916 || iU3 == 1953984371 || iU3 == 778924082 || iU3 == 778924083 || iU3 == 1835557169 || iU3 == 1835560241 || iU3 == 1634492771 || iU3 == 1634492791 || iU3 == 1970037111 || iU3 == 1332770163 || iU3 == 1716281667 || iU3 == 1767992678 || iU3 == 1768973165 || iU3 == 1718641517) {
                i(f10, iU3, iG, iU2, kVar.f8625a, str, z10, nVar, hVar, i10);
            } else if (iU3 == 1414810956 || iU3 == 1954034535 || iU3 == 2004251764 || iU3 == 1937010800 || iU3 == 1664495672 || iU3 == 1836070003) {
                h hVar2 = hVar;
                E(f10, iU3, iG, iU2, kVar, str, hVar2);
                hVar = hVar2;
            } else if (iU3 == 1835365492) {
                v(f10, iU3, iG, kVar.f8625a, hVar);
            } else if (iU3 == 1667329389) {
                hVar.f8614b = new R1.r.b().i0(kVar.f8625a).y0("application/x-camera-motion").P();
            }
            f10.a0(iG + iU2);
        }
        return hVar;
    }

    private static void E(F f10, int i10, int i11, int i12, k kVar, String str, h hVar) {
        f10.a0(i11 + 16);
        String str2 = "application/ttml+xml";
        AbstractC0876t abstractC0876tX = null;
        long j10 = Long.MAX_VALUE;
        if (i10 != 1414810956) {
            if (i10 == 1954034535) {
                int i13 = i12 - 16;
                byte[] bArr = new byte[i13];
                f10.q(bArr, 0, i13);
                abstractC0876tX = AbstractC0876t.x(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i10 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i10 == 1937010800) {
                j10 = 0;
            } else if (i10 == 1664495672) {
                hVar.f8616d = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                if (i10 != 1836070003) {
                    throw new IllegalStateException();
                }
                int iG = f10.g();
                f10.b0(4);
                if (f10.u() == 1702061171) {
                    c cVarN = n(f10, iG);
                    if (cVarN.f8603b == null || cVarN.f8603b.length != 64) {
                        return;
                    }
                    abstractC0876tX = AbstractC0876t.x(S.u0(d(cVarN.f8603b, kVar.f8629e, kVar.f8630f)));
                    str2 = "application/vobsub";
                } else {
                    str2 = null;
                }
            }
        }
        if (str2 != null) {
            hVar.f8614b = new R1.r.b().i0(kVar.f8625a).y0(str2).n0(str).C0(j10).k0(abstractC0876tX).P();
        }
    }

    private static k F(F f10) {
        long j10;
        f10.a0(8);
        int iQ = q(f10.u());
        f10.b0(iQ == 0 ? 8 : 16);
        int iU = f10.u();
        f10.b0(4);
        int iG = f10.g();
        int i10 = iQ == 0 ? 4 : 8;
        int i11 = 0;
        while (true) {
            j10 = -9223372036854775807L;
            if (i11 >= i10) {
                f10.b0(i10);
                break;
            }
            if (f10.f()[iG + i11] != -1) {
                long jN = iQ == 0 ? f10.N() : f10.S();
                if (jN == 0) {
                    break;
                }
                j10 = jN;
                break;
            }
            i11++;
        }
        f10.b0(10);
        int i12 = 0;
        long j11 = j10;
        int iT = f10.T();
        f10.b0(4);
        int iU2 = f10.u();
        int iU3 = f10.u();
        f10.b0(4);
        int iU4 = f10.u();
        int iU5 = f10.u();
        if (iU2 == 0 && iU3 == 65536 && ((iU4 == -65536 || iU4 == 65536) && iU5 == 0)) {
            i12 = 90;
        } else if (iU2 == 0 && iU3 == -65536 && ((iU4 == 65536 || iU4 == -65536) && iU5 == 0)) {
            i12 = 270;
        } else if ((iU2 == -65536 || iU2 == 65536) && iU3 == 0 && iU4 == 0 && iU5 == -65536) {
            i12 = 180;
        }
        int i13 = i12;
        f10.b0(16);
        short sH = f10.H();
        f10.b0(2);
        return new k(iU, j11, iT, i13, sH, f10.H());
    }

    public static t G(V1.e.b bVar, V1.e.c cVar, long j10, R1.n nVar, boolean z10, boolean z11) throws z {
        long[] jArr;
        long[] jArr2;
        R1.r rVarP;
        V1.e.b bVarD;
        Pair pairM;
        V1.e.b bVar2 = (V1.e.b) AbstractC1459a.e(bVar.d(1835297121));
        int iF = f(r(((V1.e.c) AbstractC1459a.e(bVar2.e(1751411826))).f13914b));
        if (iF == -1) {
            return null;
        }
        k kVarF = F(((V1.e.c) AbstractC1459a.e(bVar.e(1953196132))).f13914b);
        long j11 = j10 == -9223372036854775807L ? kVarF.f8626b : j10;
        long j12 = w(cVar.f13914b).f13919c;
        long jA1 = j11 != -9223372036854775807L ? S.a1(j11, 1000000L, j12) : -9223372036854775807L;
        V1.e.b bVar3 = (V1.e.b) AbstractC1459a.e(((V1.e.b) AbstractC1459a.e(bVar2.d(1835626086))).d(1937007212));
        e eVarT = t(((V1.e.c) AbstractC1459a.e(bVar2.e(1835296868))).f13914b);
        V1.e.c cVarE = bVar3.e(1937011556);
        if (cVarE == null) {
            throw z.a("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        h hVarD = D(cVarE.f13914b, kVarF, eVarT.f8609c, nVar, z11);
        if (z10 || (bVarD = bVar.d(1701082227)) == null || (pairM = m(bVarD)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) pairM.first;
            jArr2 = (long[]) pairM.second;
            jArr = jArr3;
        }
        if (hVarD.f8614b == null) {
            return null;
        }
        if (kVarF.f8627c != 0) {
            V1.d dVar = new V1.d(kVarF.f8627c);
            R1.r.b bVarB = hVarD.f8614b.b();
            R1.x xVar = hVarD.f8614b.f10274l;
            rVarP = bVarB.r0(xVar != null ? xVar.a(dVar) : new R1.x(dVar)).P();
        } else {
            rVarP = hVarD.f8614b;
        }
        return new t(kVarF.f8625a, iF, eVarT.f8607a, j12, jA1, eVarT.f8608b, rVarP, hVarD.f8616d, hVarD.f8613a, hVarD.f8615c, jArr, jArr2);
    }

    public static List H(V1.e.b bVar, B b10, long j10, R1.n nVar, boolean z10, boolean z11, B9.f fVar) {
        t tVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < bVar.f13913d.size(); i10++) {
            V1.e.b bVar2 = (V1.e.b) bVar.f13913d.get(i10);
            if (bVar2.f13910a == 1953653099 && (tVar = (t) fVar.apply(G(bVar2, (V1.e.c) AbstractC1459a.e(bVar.e(1836476516)), j10, nVar, z10, z11))) != null) {
                arrayList.add(B(tVar, (V1.e.b) AbstractC1459a.e(((V1.e.b) AbstractC1459a.e(((V1.e.b) AbstractC1459a.e(bVar2.d(1835297121))).d(1835626086))).d(1937007212)), b10));
            }
        }
        return arrayList;
    }

    public static R1.x I(V1.e.c cVar) {
        F f10 = cVar.f13914b;
        f10.a0(8);
        R1.x xVar = new R1.x(new R1.x.a[0]);
        while (f10.a() >= 8) {
            int iG = f10.g();
            int iU = f10.u();
            int iU2 = f10.u();
            if (iU2 == 1835365473) {
                f10.a0(iG);
                xVar = xVar.b(J(f10, iG + iU));
            } else if (iU2 == 1936553057) {
                f10.a0(iG);
                xVar = xVar.b(r.b(f10, iG + iU));
            } else if (iU2 == -1451722374) {
                xVar = xVar.b(M(f10));
            }
            f10.a0(iG + iU);
        }
        return xVar;
    }

    private static R1.x J(F f10, int i10) {
        f10.b0(8);
        g(f10);
        while (f10.g() < i10) {
            int iG = f10.g();
            int iU = f10.u();
            if (f10.u() == 1768715124) {
                f10.a0(iG);
                return s(f10, iG + iU);
            }
            f10.a0(iG + iU);
        }
        return null;
    }

    static l K(F f10, int i10, int i11) throws z {
        f10.a0(i10 + 8);
        int iG = f10.g();
        d dVarC = null;
        while (iG - i10 < i11) {
            f10.a0(iG);
            int iU = f10.u();
            AbstractC4255s.a(iU > 0, "childAtomSize must be positive");
            if (f10.u() == 1702454643) {
                dVarC = C(f10, iG, iU);
            }
            iG += iU;
        }
        if (dVarC == null) {
            return null;
        }
        return new l(dVarC);
    }

    private static void L(F f10, int i10, int i11, int i12, int i13, String str, int i14, R1.n nVar, h hVar, int i15) throws z {
        String str2;
        int i16;
        String str3;
        int iJ;
        int i17;
        V1.h.k kVar;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22 = i11;
        int i23 = i12;
        R1.n nVarK = nVar;
        h hVar2 = hVar;
        f10.a0(i22 + 16);
        f10.b0(16);
        int iT = f10.T();
        int iT2 = f10.T();
        f10.b0(50);
        int iG = f10.g();
        int iIntValue = i10;
        if (iIntValue == 1701733238) {
            Pair pairZ = z(f10, i22, i23);
            if (pairZ != null) {
                iIntValue = ((Integer) pairZ.first).intValue();
                nVarK = nVarK == null ? null : nVarK.k(((u) pairZ.second).f8773b);
                hVar2.f8613a[i15] = (u) pairZ.second;
            }
            f10.a0(iG);
        }
        String str4 = "video/3gpp";
        if (iIntValue == 1831958048) {
            str2 = "video/mpeg";
        } else {
            str2 = iIntValue == 1211250227 ? "video/3gpp" : null;
        }
        float fX = 1.0f;
        int i24 = 8;
        int i25 = 8;
        ByteBuffer byteBufferA = null;
        List listK = null;
        String str5 = null;
        byte[] bArrY = null;
        int i26 = -1;
        int i27 = -1;
        int i28 = -1;
        int i29 = -1;
        int i30 = -1;
        int i31 = -1;
        int i32 = -1;
        int iK = -1;
        a aVarK = null;
        c cVarN = null;
        V1.h.k kVar2 = null;
        boolean z10 = false;
        while (iG - i22 < i23) {
            f10.a0(iG);
            int iG2 = f10.g();
            int iU = f10.u();
            if (iU == 0 && f10.g() - i11 == i23) {
                break;
            }
            AbstractC4255s.a(iU > 0, "childAtomSize must be positive");
            int iU2 = f10.u();
            if (iU2 == 1635148611) {
                AbstractC4255s.a(str2 == null, null);
                f10.a0(iG2 + 8);
                C4241d c4241dB = C4241d.b(f10);
                List list = c4241dB.f56049a;
                hVar2.f8615c = c4241dB.f56050b;
                if (!z10) {
                    fX = c4241dB.f56059k;
                }
                String str6 = c4241dB.f56060l;
                int i33 = c4241dB.f56058j;
                int i34 = c4241dB.f56055g;
                int i35 = c4241dB.f56056h;
                listK = list;
                int i36 = c4241dB.f56057i;
                int i37 = c4241dB.f56053e;
                V1.h.k kVar3 = kVar2;
                nVarK = nVarK;
                kVar = kVar3;
                i25 = c4241dB.f56054f;
                i16 = iG;
                iIntValue = iIntValue;
                str3 = str4;
                iJ = i34;
                i17 = i35;
                iK = i36;
                i24 = i37;
                str5 = str6;
                str2 = "video/avc";
                i27 = i33;
            } else {
                i16 = iG;
                if (iU2 == 1752589123) {
                    AbstractC4255s.a(str2 == null, null);
                    f10.a0(iG2 + 8);
                    C cA = C.a(f10);
                    List list2 = cA.f55934a;
                    hVar2.f8615c = cA.f55935b;
                    if (!z10) {
                        fX = cA.f55947n;
                    }
                    int i38 = cA.f55948o;
                    int i39 = cA.f55936c;
                    String str7 = cA.f55949p;
                    int i40 = cA.f55946m;
                    listK = list2;
                    if (i40 != -1) {
                        i26 = i40;
                    }
                    int i41 = cA.f55939f;
                    int i42 = cA.f55940g;
                    int i43 = cA.f55943j;
                    int i44 = cA.f55944k;
                    int i45 = cA.f55945l;
                    i30 = i42;
                    i24 = cA.f55941h;
                    i25 = cA.f55942i;
                    nVarK = nVarK;
                    iIntValue = iIntValue;
                    str3 = str4;
                    iJ = i43;
                    i17 = i44;
                    iK = i45;
                    kVar = cA.f55950q;
                    i27 = i38;
                    i28 = i39;
                    i29 = i41;
                    str2 = "video/hevc";
                    str5 = str7;
                } else {
                    str3 = str4;
                    if (iU2 == 1818785347) {
                        AbstractC4255s.a("video/hevc".equals(str2), "lhvC must follow hvcC atom");
                        V1.h.k kVar4 = kVar2;
                        AbstractC4255s.a(kVar4 != null && kVar4.f13975b.size() >= 2, "must have at least two layers");
                        f10.a0(iG2 + 8);
                        C c10 = C.c(f10, (V1.h.k) AbstractC1459a.e(kVar4));
                        AbstractC4255s.a(hVar2.f8615c == c10.f55935b, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                        int i46 = c10.f55943j;
                        int i47 = i31;
                        if (i46 != -1) {
                            AbstractC4255s.a(i47 == i46, "colorSpace must be the same for both views");
                        }
                        int i48 = c10.f55944k;
                        int i49 = i32;
                        if (i48 != -1) {
                            AbstractC4255s.a(i49 == i48, "colorRange must be the same for both views");
                        }
                        int i50 = c10.f55945l;
                        if (i50 != -1) {
                            int i51 = iK;
                            i21 = i51;
                            AbstractC4255s.a(i51 == i50, "colorTransfer must be the same for both views");
                        } else {
                            i21 = iK;
                        }
                        AbstractC4255s.a(i24 == c10.f55941h, "bitdepthLuma must be the same for both views");
                        AbstractC4255s.a(i25 == c10.f55942i, "bitdepthChroma must be the same for both views");
                        List listK2 = listK;
                        if (listK2 != null) {
                            listK2 = AbstractC0876t.l().j(listK2).j(c10.f55934a).k();
                        } else {
                            AbstractC4255s.a(false, "initializationData must be already set from hvcC atom");
                        }
                        str2 = "video/mv-hevc";
                        i17 = i49;
                        iJ = i47;
                        iK = i21;
                        str5 = c10.f55949p;
                        kVar = kVar4;
                        listK = listK2;
                    } else {
                        List listK3 = listK;
                        iJ = i31;
                        i17 = i32;
                        int i52 = iK;
                        V1.h.k kVar5 = kVar2;
                        if (iU2 == 1986361461) {
                            l lVarK = K(f10, iG2, iU);
                            if (lVarK == null || lVarK.f8631a == null) {
                                i20 = i26;
                                i26 = i20;
                            } else if (kVar5 == null || kVar5.f13975b.size() < 2) {
                                i20 = i26;
                                if (i20 == -1) {
                                    i26 = lVarK.f8631a.f8606a.f8612c ? 5 : 4;
                                } else {
                                    i26 = i20;
                                }
                            } else {
                                AbstractC4255s.a(lVarK.b(), "both eye views must be marked as available");
                                AbstractC4255s.a(!lVarK.f8631a.f8606a.f8612c, "for MV-HEVC, eye_views_reversed must be set to false");
                                i20 = i26;
                                i26 = i20;
                            }
                            listK = listK3;
                            iK = i52;
                            kVar = kVar5;
                        } else {
                            int i53 = i26;
                            kVar = kVar5;
                            if (iU2 == 1685480259 || iU2 == 1685485123 || iU2 == 1685485379) {
                                nVarK = nVarK;
                                iIntValue = iIntValue;
                                i18 = i53;
                                i25 = i25;
                                float f11 = fX;
                                int i54 = i24;
                                i19 = i52;
                                int i55 = iU - 8;
                                byte[] bArr = new byte[i55];
                                f10.q(bArr, 0, i55);
                                if (listK3 != null) {
                                    listK = AbstractC0876t.l().j(listK3).a(bArr).k();
                                } else {
                                    AbstractC4255s.a(false, "initializationData must already be set from hvcC or avcC atom");
                                    listK = listK3;
                                }
                                f10.a0(iG2 + 8);
                                V1.a aVarA = V1.a.a(f10);
                                if (aVarA != null) {
                                    str2 = "video/dolby-vision";
                                    str5 = aVarA.f13904c;
                                }
                                iJ = iJ;
                                i24 = i54;
                                fX = f11;
                            } else if (iU2 == 1987076931) {
                                AbstractC4255s.a(str2 == null, null);
                                String str8 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                f10.a0(iG2 + 12);
                                byte bL = (byte) f10.L();
                                byte bL2 = (byte) f10.L();
                                int iL = f10.L();
                                i24 = iL >> 4;
                                iIntValue = iIntValue;
                                byte b10 = (byte) ((iL >> 1) & 7);
                                if (str8.equals("video/x-vnd.on2.vp9")) {
                                    listK3 = AbstractC1467i.k(bL, bL2, (byte) i24, b10);
                                }
                                boolean z11 = (iL & 1) != 0;
                                int iL2 = f10.L();
                                int iL3 = f10.L();
                                int iJ2 = C1349i.j(iL2);
                                int i56 = z11 ? 1 : 2;
                                iK = C1349i.k(iL3);
                                str2 = str8;
                                nVarK = nVarK;
                                i17 = i56;
                                kVar = kVar;
                                iJ = iJ2;
                                listK = listK3;
                                i26 = i53;
                                i25 = i24;
                            } else {
                                iIntValue = iIntValue;
                                if (iU2 == 1635135811) {
                                    int i57 = iU - 8;
                                    byte[] bArr2 = new byte[i57];
                                    f10.q(bArr2, 0, i57);
                                    listK = AbstractC0876t.x(bArr2);
                                    f10.a0(iG2 + 8);
                                    C1349i c1349iJ = j(f10);
                                    int i58 = c1349iJ.f10173e;
                                    int i59 = c1349iJ.f10174f;
                                    int i60 = c1349iJ.f10169a;
                                    int i61 = c1349iJ.f10170b;
                                    iK = c1349iJ.f10171c;
                                    i24 = i58;
                                    i25 = i59;
                                    iJ = i60;
                                    i17 = i61;
                                    str2 = "video/av01";
                                } else if (iU2 == 1668050025) {
                                    if (byteBufferA == null) {
                                        byteBufferA = a();
                                    }
                                    ByteBuffer byteBuffer = byteBufferA;
                                    byteBuffer.position(21);
                                    byteBuffer.putShort(f10.H());
                                    byteBuffer.putShort(f10.H());
                                    byteBufferA = byteBuffer;
                                    listK = listK3;
                                    i25 = i25;
                                    iK = i52;
                                } else if (iU2 == 1835295606) {
                                    if (byteBufferA == null) {
                                        byteBufferA = a();
                                    }
                                    ByteBuffer byteBuffer2 = byteBufferA;
                                    short sH = f10.H();
                                    short sH2 = f10.H();
                                    short sH3 = f10.H();
                                    short sH4 = f10.H();
                                    i25 = i25;
                                    short sH5 = f10.H();
                                    int i62 = i24;
                                    short sH6 = f10.H();
                                    nVarK = nVarK;
                                    short sH7 = f10.H();
                                    short sH8 = f10.H();
                                    long jN = f10.N();
                                    long jN2 = f10.N();
                                    byteBuffer2.position(1);
                                    byteBuffer2.putShort(sH5);
                                    byteBuffer2.putShort(sH6);
                                    byteBuffer2.putShort(sH);
                                    byteBuffer2.putShort(sH2);
                                    byteBuffer2.putShort(sH3);
                                    byteBuffer2.putShort(sH4);
                                    byteBuffer2.putShort(sH7);
                                    byteBuffer2.putShort(sH8);
                                    byteBuffer2.putShort((short) (jN / 10000));
                                    byteBuffer2.putShort((short) (jN2 / 10000));
                                    byteBufferA = byteBuffer2;
                                    listK = listK3;
                                    kVar = kVar;
                                    i24 = i62;
                                    iK = i52;
                                    i26 = i53;
                                    fX = fX;
                                } else {
                                    nVarK = nVarK;
                                    i18 = i53;
                                    i25 = i25;
                                    float f12 = fX;
                                    i24 = i24;
                                    if (iU2 == 1681012275) {
                                        AbstractC4255s.a(str2 == null, null);
                                        listK = listK3;
                                        str2 = str3;
                                    } else if (iU2 == 1702061171) {
                                        AbstractC4255s.a(str2 == null, null);
                                        cVarN = n(f10, iG2);
                                        String str9 = cVarN.f8602a;
                                        byte[] bArr3 = cVarN.f8603b;
                                        listK = bArr3 != null ? AbstractC0876t.x(bArr3) : listK3;
                                        str2 = str9;
                                    } else {
                                        if (iU2 == 1651798644) {
                                            aVarK = k(f10, iG2);
                                        } else if (iU2 == 1885434736) {
                                            fX = x(f10, iG2);
                                            listK = listK3;
                                            kVar = kVar;
                                            i24 = i24;
                                            iK = i52;
                                            i26 = i18;
                                            z10 = true;
                                        } else if (iU2 == 1937126244) {
                                            bArrY = y(f10, iG2, iU);
                                        } else if (iU2 == 1936995172) {
                                            int iL4 = f10.L();
                                            f10.b0(3);
                                            if (iL4 == 0) {
                                                int iL5 = f10.L();
                                                if (iL5 == 0) {
                                                    i18 = 0;
                                                } else if (iL5 == 1) {
                                                    i18 = 1;
                                                } else if (iL5 == 2) {
                                                    i18 = 2;
                                                } else if (iL5 == 3) {
                                                    i18 = 3;
                                                }
                                            }
                                        } else if (iU2 == 1634760259) {
                                            int i63 = iU - 12;
                                            byte[] bArr4 = new byte[i63];
                                            f10.a0(iG2 + 12);
                                            f10.q(bArr4, 0, i63);
                                            listK = AbstractC0876t.x(bArr4);
                                            C1349i c1349iH = h(new F(bArr4));
                                            int i64 = c1349iH.f10173e;
                                            int i65 = c1349iH.f10174f;
                                            int i66 = c1349iH.f10169a;
                                            int i67 = c1349iH.f10170b;
                                            iK = c1349iH.f10171c;
                                            i24 = i64;
                                            i25 = i65;
                                            iJ = i66;
                                            i17 = i67;
                                            str2 = "video/apv";
                                            kVar = kVar;
                                            i26 = i18;
                                            fX = f12;
                                        } else {
                                            if (iU2 == 1668246642) {
                                                i19 = i52;
                                                if (iJ == -1 && i19 == -1) {
                                                    int iU3 = f10.u();
                                                    if (iU3 == 1852009592 || iU3 == 1852009571) {
                                                        int iT3 = f10.T();
                                                        int iT4 = f10.T();
                                                        f10.b0(2);
                                                        boolean z12 = iU == 19 && (f10.L() & 128) != 0;
                                                        iJ = C1349i.j(iT3);
                                                        listK = listK3;
                                                        i17 = z12 ? 1 : 2;
                                                        kVar = kVar;
                                                        i24 = i24;
                                                        i26 = i18;
                                                        fX = f12;
                                                        iK = C1349i.k(iT4);
                                                    } else {
                                                        AbstractC1477t.h("BoxParsers", "Unsupported color type: " + V1.e.a(iU3));
                                                    }
                                                }
                                            } else {
                                                i19 = i52;
                                            }
                                            listK = listK3;
                                            iJ = iJ;
                                            i24 = i24;
                                            fX = f12;
                                        }
                                        listK = listK3;
                                    }
                                    iK = i52;
                                    i26 = i18;
                                    fX = f12;
                                }
                                i26 = i53;
                            }
                            iK = i19;
                            kVar = kVar;
                            i26 = i18;
                        }
                    }
                }
            }
            iG = i16 + iU;
            R1.n nVar2 = nVarK;
            kVar2 = kVar;
            nVarK = nVar2;
            i22 = i11;
            i23 = i12;
            hVar2 = hVar;
            i25 = i25;
            iIntValue = iIntValue;
            str4 = str3;
            i31 = iJ;
            i32 = i17;
        }
        R1.n nVar3 = nVarK;
        float f13 = fX;
        List list3 = listK;
        int i68 = i26;
        int i69 = i31;
        int i70 = i32;
        int i71 = iK;
        int i72 = i25;
        int i73 = i24;
        if (str2 == null) {
            return;
        }
        R1.r.b bVarV = new R1.r.b().i0(i13).y0(str2).U(str5).F0(iT).h0(iT2).b0(i29).a0(i30).u0(f13).x0(i14).v0(bArrY).B0(i68).k0(list3).p0(i27).q0(i28).c0(nVar3).n0(str).V(new C1349i.b().d(i69).c(i70).e(i71).f(byteBufferA != null ? byteBufferA.array() : null).g(i73).b(i72).a());
        if (aVarK != null) {
            bVarV.S(F9.f.n(aVarK.f8591a)).t0(F9.f.n(aVarK.f8592b));
        } else if (cVarN != null) {
            bVarV.S(F9.f.n(cVarN.f8604c)).t0(F9.f.n(cVarN.f8605d));
        }
        hVar.f8614b = bVarV.P();
    }

    private static R1.x M(F f10) {
        short sH = f10.H();
        f10.b0(2);
        String strI = f10.I(sH);
        int iMax = Math.max(strI.lastIndexOf(43), strI.lastIndexOf(45));
        try {
            return new R1.x(new V1.f(Float.parseFloat(strI.substring(0, iMax)), Float.parseFloat(strI.substring(iMax, strI.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static int N(int i10) {
        int i11 = (i10 >> 16) & 255;
        int i12 = ((i10 >> 8) & 255) - 128;
        int i13 = (i10 & 255) - 128;
        return S.o(i11 + ((i13 * 17790) / 10000), 0, 255) | (S.o(((i12 * 14075) / 10000) + i11, 0, 255) << 16) | (S.o((i11 - ((i13 * 3455) / 10000)) - ((i12 * 7169) / 10000), 0, 255) << 8);
    }

    private static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static boolean b(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        return jArr[0] <= j11 && j11 < jArr[S.o(4, 0, length)] && jArr[S.o(jArr.length - 4, 0, length)] < j12 && j12 <= j10;
    }

    private static int c(F f10, int i10, int i11, int i12) throws z {
        int iG = f10.g();
        AbstractC4255s.a(iG >= i11, null);
        while (iG - i11 < i12) {
            f10.a0(iG);
            int iU = f10.u();
            AbstractC4255s.a(iU > 0, "childAtomSize must be positive");
            if (f10.u() == i10) {
                return iG;
            }
            iG += iU;
        }
        return -1;
    }

    private static String d(byte[] bArr, int i10, int i11) {
        AbstractC1459a.g(bArr.length == 64);
        ArrayList arrayList = new ArrayList(16);
        for (int i12 = 0; i12 < bArr.length - 3; i12 += 4) {
            arrayList.add(String.format("%06x", Integer.valueOf(N(F9.f.i(bArr[i12], bArr[i12 + 1], bArr[i12 + 2], bArr[i12 + 3])))));
        }
        return "size: " + i10 + "x" + i11 + "\npalette: " + B9.g.g(", ").d(arrayList) + "\n";
    }

    private static String e(int i10) {
        char[] cArr = {(char) (((i10 >> 10) & 31) + 96), (char) (((i10 >> 5) & 31) + 96), (char) ((i10 & 31) + 96)};
        for (int i11 = 0; i11 < 3; i11++) {
            char c10 = cArr[i11];
            if (c10 < 'a' || c10 > 'z') {
                return null;
            }
        }
        return new String(cArr);
    }

    private static int f(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 == 1952807028 || i10 == 1935832172 || i10 == 1937072756 || i10 == 1668047728 || i10 == 1937072752) {
            return 3;
        }
        return i10 == 1835365473 ? 5 : -1;
    }

    public static void g(F f10) {
        int iG = f10.g();
        f10.b0(4);
        if (f10.u() != 1751411826) {
            iG += 4;
        }
        f10.a0(iG);
    }

    private static C1349i h(F f10) {
        C1349i.b bVar = new C1349i.b();
        E e10 = new E(f10.f());
        e10.p(f10.g() * 8);
        e10.s(1);
        int iH = e10.h(8);
        for (int i10 = 0; i10 < iH; i10++) {
            e10.s(1);
            int iH2 = e10.h(8);
            for (int i11 = 0; i11 < iH2; i11++) {
                e10.r(6);
                boolean zG = e10.g();
                e10.q();
                e10.s(11);
                e10.r(4);
                int iH3 = e10.h(4) + 8;
                bVar.g(iH3);
                bVar.b(iH3);
                e10.s(1);
                if (zG) {
                    int iH4 = e10.h(8);
                    int iH5 = e10.h(8);
                    e10.s(1);
                    bVar.d(C1349i.j(iH4)).c(e10.g() ? 1 : 2).e(C1349i.k(iH5));
                }
            }
        }
        return bVar.a();
    }

    /* JADX WARN: Failed to calculate best type for var: r0v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v2 ??, new type: R1.r$b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v3 ??, new type: R1.r$b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v4 ??, new type: R1.r$b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v5 ??, new type: R1.r$b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v6 ??, new type: R1.r$b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v7 ??, new type: R1.r$b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v51 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v51 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v27 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v27 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v29 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v29 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v31 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v31 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v2 ??, new type: byte
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    private static void i(U1.F r26, int r27, int r28, int r29, int r30, java.lang.String r31, boolean r32, R1.n r33, P2.b.h r34, int r35) throws R1.z {
        /*
            Method dump skipped, instruction units count: 1296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.b.i(U1.F, int, int, int, int, java.lang.String, boolean, R1.n, P2.b$h, int):void");
    }

    private static C1349i j(F f10) {
        C1349i.b bVar = new C1349i.b();
        E e10 = new E(f10.f());
        e10.p(f10.g() * 8);
        e10.s(1);
        int iH = e10.h(3);
        e10.r(6);
        boolean zG = e10.g();
        boolean zG2 = e10.g();
        if (iH == 2 && zG) {
            bVar.g(zG2 ? 12 : 10);
            bVar.b(zG2 ? 12 : 10);
        } else if (iH <= 2) {
            bVar.g(zG ? 10 : 8);
            bVar.b(zG ? 10 : 8);
        }
        e10.r(13);
        e10.q();
        int iH2 = e10.h(4);
        if (iH2 != 1) {
            AbstractC1477t.f("BoxParsers", "Unsupported obu_type: " + iH2);
            return bVar.a();
        }
        if (e10.g()) {
            AbstractC1477t.f("BoxParsers", "Unsupported obu_extension_flag");
            return bVar.a();
        }
        boolean zG3 = e10.g();
        e10.q();
        if (zG3 && e10.h(8) > 127) {
            AbstractC1477t.f("BoxParsers", "Excessive obu_size");
            return bVar.a();
        }
        int iH3 = e10.h(3);
        e10.q();
        if (e10.g()) {
            AbstractC1477t.f("BoxParsers", "Unsupported reduced_still_picture_header");
            return bVar.a();
        }
        if (e10.g()) {
            AbstractC1477t.f("BoxParsers", "Unsupported timing_info_present_flag");
            return bVar.a();
        }
        if (e10.g()) {
            AbstractC1477t.f("BoxParsers", "Unsupported initial_display_delay_present_flag");
            return bVar.a();
        }
        int iH4 = e10.h(5);
        boolean z10 = false;
        for (int i10 = 0; i10 <= iH4; i10++) {
            e10.r(12);
            if (e10.h(5) > 7) {
                e10.q();
            }
        }
        int iH5 = e10.h(4);
        int iH6 = e10.h(4);
        e10.r(iH5 + 1);
        e10.r(iH6 + 1);
        if (e10.g()) {
            e10.r(7);
        }
        e10.r(7);
        boolean zG4 = e10.g();
        if (zG4) {
            e10.r(2);
        }
        if ((e10.g() ? 2 : e10.h(1)) > 0 && !e10.g()) {
            e10.r(1);
        }
        if (zG4) {
            e10.r(3);
        }
        e10.r(3);
        boolean zG5 = e10.g();
        if (iH3 == 2 && zG5) {
            e10.q();
        }
        if (iH3 != 1 && e10.g()) {
            z10 = true;
        }
        if (e10.g()) {
            int iH7 = e10.h(8);
            int iH8 = e10.h(8);
            bVar.d(C1349i.j(iH7)).c(((z10 || iH7 != 1 || iH8 != 13 || e10.h(8) != 0) ? e10.h(1) : 1) != 1 ? 2 : 1).e(C1349i.k(iH8));
        }
        return bVar.a();
    }

    private static a k(F f10, int i10) {
        f10.a0(i10 + 8);
        f10.b0(4);
        return new a(f10.N(), f10.N());
    }

    static Pair l(F f10, int i10, int i11) throws z {
        int i12 = i10 + 8;
        int i13 = -1;
        int i14 = 0;
        String strI = null;
        Integer numValueOf = null;
        while (i12 - i10 < i11) {
            f10.a0(i12);
            int iU = f10.u();
            int iU2 = f10.u();
            if (iU2 == 1718775137) {
                numValueOf = Integer.valueOf(f10.u());
            } else if (iU2 == 1935894637) {
                f10.b0(4);
                strI = f10.I(4);
            } else if (iU2 == 1935894633) {
                i13 = i12;
                i14 = iU;
            }
            i12 += iU;
        }
        if (!"cenc".equals(strI) && !"cbc1".equals(strI) && !"cens".equals(strI) && !"cbcs".equals(strI)) {
            return null;
        }
        AbstractC4255s.a(numValueOf != null, "frma atom is mandatory");
        AbstractC4255s.a(i13 != -1, "schi atom is mandatory");
        u uVarA = A(f10, i13, i14, strI);
        AbstractC4255s.a(uVarA != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (u) S.i(uVarA));
    }

    private static Pair m(V1.e.b bVar) {
        V1.e.c cVarE = bVar.e(1701606260);
        if (cVarE == null) {
            return null;
        }
        F f10 = cVarE.f13914b;
        f10.a0(8);
        int iQ = q(f10.u());
        int iP = f10.P();
        long[] jArr = new long[iP];
        long[] jArr2 = new long[iP];
        for (int i10 = 0; i10 < iP; i10++) {
            jArr[i10] = iQ == 1 ? f10.S() : f10.N();
            jArr2[i10] = iQ == 1 ? f10.E() : f10.u();
            if (f10.H() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            f10.b0(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static c n(F f10, int i10) {
        f10.a0(i10 + 12);
        f10.b0(1);
        o(f10);
        f10.b0(2);
        int iL = f10.L();
        if ((iL & 128) != 0) {
            f10.b0(2);
        }
        if ((iL & 64) != 0) {
            f10.b0(f10.L());
        }
        if ((iL & 32) != 0) {
            f10.b0(2);
        }
        f10.b0(1);
        o(f10);
        String strH = y.h(f10.L());
        if ("audio/mpeg".equals(strH) || "audio/vnd.dts".equals(strH) || "audio/vnd.dts.hd".equals(strH)) {
            return new c(strH, null, -1L, -1L);
        }
        f10.b0(4);
        long jN = f10.N();
        long jN2 = f10.N();
        f10.b0(1);
        int iO = o(f10);
        long j10 = jN2;
        byte[] bArr = new byte[iO];
        f10.q(bArr, 0, iO);
        if (j10 <= 0) {
            j10 = -1;
        }
        return new c(strH, bArr, j10, jN > 0 ? jN : -1L);
    }

    private static int o(F f10) {
        int iL = f10.L();
        int i10 = iL & 127;
        while ((iL & 128) == 128) {
            iL = f10.L();
            i10 = (i10 << 7) | (iL & 127);
        }
        return i10;
    }

    public static int p(int i10) {
        return i10 & 16777215;
    }

    public static int q(int i10) {
        return (i10 >> 24) & 255;
    }

    private static int r(F f10) {
        f10.a0(16);
        return f10.u();
    }

    private static R1.x s(F f10, int i10) {
        f10.b0(8);
        ArrayList arrayList = new ArrayList();
        while (f10.g() < i10) {
            R1.x.a aVarD = P2.j.d(f10);
            if (aVarD != null) {
                arrayList.add(aVarD);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new R1.x(arrayList);
    }

    private static e t(F f10) {
        long j10;
        f10.a0(8);
        int iQ = q(f10.u());
        f10.b0(iQ == 0 ? 8 : 16);
        long jN = f10.N();
        int iG = f10.g();
        int i10 = iQ == 0 ? 4 : 8;
        int i11 = 0;
        while (true) {
            j10 = -9223372036854775807L;
            if (i11 >= i10) {
                f10.b0(i10);
                break;
            }
            if (f10.f()[iG + i11] != -1) {
                long jN2 = iQ == 0 ? f10.N() : f10.S();
                if (jN2 == 0) {
                    break;
                }
                long jA1 = S.a1(jN2, 1000000L, jN);
                jN = jN;
                j10 = jA1;
                break;
            }
            i11++;
        }
        return new e(jN, j10, e(f10.T()));
    }

    public static R1.x u(V1.e.b bVar) {
        V1.e.c cVarE = bVar.e(1751411826);
        V1.e.c cVarE2 = bVar.e(1801812339);
        V1.e.c cVarE3 = bVar.e(1768715124);
        if (cVarE == null || cVarE2 == null || cVarE3 == null || r(cVarE.f13914b) != 1835299937) {
            return null;
        }
        F f10 = cVarE2.f13914b;
        f10.a0(12);
        int iU = f10.u();
        String[] strArr = new String[iU];
        for (int i10 = 0; i10 < iU; i10++) {
            int iU2 = f10.u();
            f10.b0(4);
            strArr[i10] = f10.I(iU2 - 8);
        }
        F f11 = cVarE3.f13914b;
        f11.a0(8);
        ArrayList arrayList = new ArrayList();
        while (f11.a() > 8) {
            int iG = f11.g();
            int iU3 = f11.u();
            int iU4 = f11.u() - 1;
            if (iU4 < 0 || iU4 >= iU) {
                AbstractC1477t.h("BoxParsers", "Skipped metadata with unknown key index: " + iU4);
            } else {
                V1.c cVarI = P2.j.i(f11, iG + iU3, strArr[iU4]);
                if (cVarI != null) {
                    arrayList.add(cVarI);
                }
            }
            f11.a0(iG + iU3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new R1.x(arrayList);
    }

    private static void v(F f10, int i10, int i11, int i12, h hVar) {
        f10.a0(i11 + 16);
        if (i10 == 1835365492) {
            f10.F();
            String strF = f10.F();
            if (strF != null) {
                hVar.f8614b = new R1.r.b().i0(i12).y0(strF).P();
            }
        }
    }

    public static V1.g w(F f10) {
        long jE;
        long jE2;
        f10.a0(8);
        if (q(f10.u()) == 0) {
            jE = f10.N();
            jE2 = f10.N();
        } else {
            jE = f10.E();
            jE2 = f10.E();
        }
        return new V1.g(jE, jE2, f10.N());
    }

    private static float x(F f10, int i10) {
        f10.a0(i10 + 8);
        return f10.P() / f10.P();
    }

    private static byte[] y(F f10, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            f10.a0(i12);
            int iU = f10.u();
            if (f10.u() == 1886547818) {
                return Arrays.copyOfRange(f10.f(), i12, iU + i12);
            }
            i12 += iU;
        }
        return null;
    }

    private static Pair z(F f10, int i10, int i11) throws z {
        Pair pairL;
        int iG = f10.g();
        while (iG - i10 < i11) {
            f10.a0(iG);
            int iU = f10.u();
            AbstractC4255s.a(iU > 0, "childAtomSize must be positive");
            if (f10.u() == 1936289382 && (pairL = l(f10, iG, iU)) != null) {
                return pairL;
            }
            iG += iU;
        }
        return null;
    }
}
