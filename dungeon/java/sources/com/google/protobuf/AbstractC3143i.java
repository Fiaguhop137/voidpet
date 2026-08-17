package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3143i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile int f37920f = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f37921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f37922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f37923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    C3144j f37924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f37925e;

    /* JADX INFO: renamed from: com.google.protobuf.i$b */
    private static final class b extends AbstractC3143i {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final byte[] f37926g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f37927h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f37928i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f37929j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f37930k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f37931l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f37932m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f37933n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f37934o;

        private b(byte[] bArr, int i10, int i11, boolean z10) {
            super(null);
            this.f37934o = Integer.MAX_VALUE;
            this.f37926g = bArr;
            this.f37928i = i11 + i10;
            this.f37930k = i10;
            this.f37931l = i10;
            this.f37927h = z10;
        }

        /* synthetic */ b(byte[] bArr, int i10, int i11, boolean z10, a aVar) {
            this(bArr, i10, i11, z10);
        }

        private void U() {
            int i10 = this.f37928i + this.f37929j;
            this.f37928i = i10;
            int i11 = i10 - this.f37931l;
            int i12 = this.f37934o;
            if (i11 <= i12) {
                this.f37929j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f37929j = i13;
            this.f37928i = i10 - i13;
        }

        private void W() throws B {
            if (this.f37928i - this.f37930k >= 10) {
                X();
            } else {
                Y();
            }
        }

        private void X() throws B {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f37926g;
                int i11 = this.f37930k;
                this.f37930k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw B.f();
        }

        private void Y() throws B {
            for (int i10 = 0; i10 < 10; i10++) {
                if (O() >= 0) {
                    return;
                }
            }
            throw B.f();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public void A(T.a aVar, C3151q c3151q) throws B {
            int iB = B();
            b();
            int iP = p(iB);
            this.f37921a++;
            aVar.h0(this, c3151q);
            a(0);
            this.f37921a--;
            if (e() != 0) {
                throw B.m();
            }
            o(iP);
        }

        @Override // com.google.protobuf.AbstractC3143i
        public int B() {
            int i10;
            int i11 = this.f37930k;
            int i12 = this.f37928i;
            if (i12 != i11) {
                byte[] bArr = this.f37926g;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f37930k = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b10;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << 14) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << 21);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b11 = bArr[i18];
                                int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i18 = i11 + 6;
                                    if (bArr[i16] < 0) {
                                        i16 = i11 + 7;
                                        if (bArr[i18] < 0) {
                                            i18 = i11 + 8;
                                            if (bArr[i16] < 0) {
                                                i16 = i11 + 9;
                                                if (bArr[i18] < 0) {
                                                    int i21 = i11 + 10;
                                                    if (bArr[i16] >= 0) {
                                                        i14 = i21;
                                                        i10 = i20;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i20;
                                }
                                i10 = i20;
                            }
                            i14 = i18;
                        }
                        i14 = i16;
                    }
                    this.f37930k = i14;
                    return i10;
                }
            }
            return (int) T();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public int D() {
            return Q();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public long E() {
            return R();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public int F() {
            return AbstractC3143i.c(B());
        }

        @Override // com.google.protobuf.AbstractC3143i
        public long G() {
            return AbstractC3143i.d(S());
        }

        @Override // com.google.protobuf.AbstractC3143i
        public String H() throws B {
            int iB = B();
            if (iB > 0) {
                int i10 = this.f37928i;
                int i11 = this.f37930k;
                if (iB <= i10 - i11) {
                    String str = new String(this.f37926g, i11, iB, A.f37676b);
                    this.f37930k += iB;
                    return str;
                }
            }
            if (iB == 0) {
                return "";
            }
            if (iB < 0) {
                throw B.g();
            }
            throw B.m();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public String I() throws B {
            int iB = B();
            if (iB > 0) {
                int i10 = this.f37928i;
                int i11 = this.f37930k;
                if (iB <= i10 - i11) {
                    String strH = A0.h(this.f37926g, i11, iB);
                    this.f37930k += iB;
                    return strH;
                }
            }
            if (iB == 0) {
                return "";
            }
            if (iB <= 0) {
                throw B.g();
            }
            throw B.m();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public int J() throws B {
            if (g()) {
                this.f37932m = 0;
                return 0;
            }
            int iB = B();
            this.f37932m = iB;
            if (C0.a(iB) != 0) {
                return this.f37932m;
            }
            throw B.c();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public int K() {
            return B();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public long L() {
            return S();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public boolean M(int i10) throws B {
            int iB = C0.b(i10);
            if (iB == 0) {
                W();
                return true;
            }
            if (iB == 1) {
                V(8);
                return true;
            }
            if (iB == 2) {
                V(B());
                return true;
            }
            if (iB == 3) {
                N();
                a(C0.c(C0.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw B.e();
            }
            V(4);
            return true;
        }

        public byte O() throws B {
            int i10 = this.f37930k;
            if (i10 == this.f37928i) {
                throw B.m();
            }
            byte[] bArr = this.f37926g;
            this.f37930k = i10 + 1;
            return bArr[i10];
        }

        public byte[] P(int i10) throws B {
            if (i10 > 0) {
                int i11 = this.f37928i;
                int i12 = this.f37930k;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f37930k = i13;
                    return Arrays.copyOfRange(this.f37926g, i12, i13);
                }
            }
            if (i10 > 0) {
                throw B.m();
            }
            if (i10 == 0) {
                return A.f37678d;
            }
            throw B.g();
        }

        public int Q() throws B {
            int i10 = this.f37930k;
            if (this.f37928i - i10 < 4) {
                throw B.m();
            }
            byte[] bArr = this.f37926g;
            this.f37930k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long R() throws B {
            int i10 = this.f37930k;
            if (this.f37928i - i10 < 8) {
                throw B.m();
            }
            byte[] bArr = this.f37926g;
            this.f37930k = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        public long S() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f37930k;
            int i11 = this.f37928i;
            if (i11 != i10) {
                byte[] bArr = this.f37926g;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f37930k = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        j10 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << 14) ^ i14;
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                long j13 = (-2080896) ^ i18;
                                i13 = i17;
                                j10 = j13;
                            } else {
                                long j14 = i18;
                                i13 = i10 + 5;
                                long j15 = j14 ^ (((long) bArr[i17]) << 28);
                                if (j15 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    int i19 = i10 + 6;
                                    long j16 = j15 ^ (((long) bArr[i13]) << 35);
                                    if (j16 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j15 = j16 ^ (((long) bArr[i19]) << 42);
                                        if (j15 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i19 = i10 + 8;
                                            j16 = j15 ^ (((long) bArr[i13]) << 49);
                                            if (j16 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j17 = (j16 ^ (((long) bArr[i19]) << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    int i20 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i20;
                                                    }
                                                }
                                                j10 = j17;
                                            }
                                        }
                                    }
                                    j10 = j16 ^ j11;
                                    i13 = i19;
                                }
                                j10 = j15 ^ j12;
                            }
                        }
                    }
                    this.f37930k = i13;
                    return j10;
                }
            }
            return T();
        }

        long T() throws B {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bO = O();
                j10 |= ((long) (bO & 127)) << i10;
                if ((bO & 128) == 0) {
                    return j10;
                }
            }
            throw B.f();
        }

        public void V(int i10) throws B {
            if (i10 >= 0) {
                int i11 = this.f37928i;
                int i12 = this.f37930k;
                if (i10 <= i11 - i12) {
                    this.f37930k = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw B.m();
            }
            throw B.g();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public void a(int i10) throws B {
            if (this.f37932m != i10) {
                throw B.b();
            }
        }

        @Override // com.google.protobuf.AbstractC3143i
        public int e() {
            int i10 = this.f37934o;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - f();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public int f() {
            return this.f37930k - this.f37931l;
        }

        @Override // com.google.protobuf.AbstractC3143i
        public boolean g() {
            return this.f37930k == this.f37928i;
        }

        @Override // com.google.protobuf.AbstractC3143i
        public void o(int i10) {
            this.f37934o = i10;
            U();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public int p(int i10) throws B {
            if (i10 < 0) {
                throw B.g();
            }
            int iF = i10 + f();
            if (iF < 0) {
                throw B.h();
            }
            int i11 = this.f37934o;
            if (iF > i11) {
                throw B.m();
            }
            this.f37934o = iF;
            U();
            return i11;
        }

        @Override // com.google.protobuf.AbstractC3143i
        public boolean q() {
            return S() != 0;
        }

        @Override // com.google.protobuf.AbstractC3143i
        public AbstractC3142h r() {
            int iB = B();
            if (iB > 0) {
                int i10 = this.f37928i;
                int i11 = this.f37930k;
                if (iB <= i10 - i11) {
                    AbstractC3142h abstractC3142hG = (this.f37927h && this.f37933n) ? AbstractC3142h.G(this.f37926g, i11, iB) : AbstractC3142h.j(this.f37926g, i11, iB);
                    this.f37930k += iB;
                    return abstractC3142hG;
                }
            }
            return iB == 0 ? AbstractC3142h.f37908b : AbstractC3142h.F(P(iB));
        }

        @Override // com.google.protobuf.AbstractC3143i
        public double s() {
            return Double.longBitsToDouble(R());
        }

        @Override // com.google.protobuf.AbstractC3143i
        public int t() {
            return B();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public int u() {
            return Q();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public long v() {
            return R();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public float w() {
            return Float.intBitsToFloat(Q());
        }

        @Override // com.google.protobuf.AbstractC3143i
        public void x(int i10, T.a aVar, C3151q c3151q) throws B {
            b();
            this.f37921a++;
            aVar.h0(this, c3151q);
            a(C0.c(i10, 4));
            this.f37921a--;
        }

        @Override // com.google.protobuf.AbstractC3143i
        public int y() {
            return B();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public long z() {
            return S();
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.i$c */
    private static final class c extends AbstractC3143i {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final InputStream f37935g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final byte[] f37936h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f37937i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f37938j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f37939k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f37940l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f37941m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f37942n;

        private c(InputStream inputStream, int i10) {
            super(null);
            this.f37942n = Integer.MAX_VALUE;
            A.b(inputStream, "input");
            this.f37935g = inputStream;
            this.f37936h = new byte[i10];
            this.f37937i = 0;
            this.f37939k = 0;
            this.f37941m = 0;
        }

        /* synthetic */ c(InputStream inputStream, int i10, a aVar) {
            this(inputStream, i10);
        }

        private static int O(InputStream inputStream) throws B {
            try {
                return inputStream.available();
            } catch (B e10) {
                e10.j();
                throw e10;
            }
        }

        private static int P(InputStream inputStream, byte[] bArr, int i10, int i11) throws B {
            try {
                return inputStream.read(bArr, i10, i11);
            } catch (B e10) {
                e10.j();
                throw e10;
            }
        }

        private AbstractC3142h Q(int i10) throws IOException {
            byte[] bArrT = T(i10);
            if (bArrT != null) {
                return AbstractC3142h.i(bArrT);
            }
            int i11 = this.f37939k;
            int i12 = this.f37937i;
            int length = i12 - i11;
            this.f37941m += i12;
            this.f37939k = 0;
            this.f37937i = 0;
            List<byte[]> listU = U(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f37936h, i11, bArr, 0, length);
            for (byte[] bArr2 : listU) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return AbstractC3142h.F(bArr);
        }

        private byte[] S(int i10, boolean z10) throws IOException {
            byte[] bArrT = T(i10);
            if (bArrT != null) {
                return z10 ? (byte[]) bArrT.clone() : bArrT;
            }
            int i11 = this.f37939k;
            int i12 = this.f37937i;
            int length = i12 - i11;
            this.f37941m += i12;
            this.f37939k = 0;
            this.f37937i = 0;
            List<byte[]> listU = U(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f37936h, i11, bArr, 0, length);
            for (byte[] bArr2 : listU) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] T(int i10) throws B {
            if (i10 == 0) {
                return A.f37678d;
            }
            if (i10 < 0) {
                throw B.g();
            }
            int i11 = this.f37941m;
            int i12 = this.f37939k;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f37923c > 0) {
                throw B.l();
            }
            int i14 = this.f37942n;
            if (i13 > i14) {
                c0((i14 - i11) - i12);
                throw B.m();
            }
            int i15 = this.f37937i - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096 && i16 > O(this.f37935g)) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f37936h, this.f37939k, bArr, 0, i15);
            this.f37941m += this.f37937i;
            this.f37939k = 0;
            this.f37937i = 0;
            while (i15 < i10) {
                int iP = P(this.f37935g, bArr, i15, i10 - i15);
                if (iP == -1) {
                    throw B.m();
                }
                this.f37941m += iP;
                i15 += iP;
            }
            return bArr;
        }

        private List U(int i10) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int iMin = Math.min(i10, 4096);
                byte[] bArr = new byte[iMin];
                int i11 = 0;
                while (i11 < iMin) {
                    int i12 = this.f37935g.read(bArr, i11, iMin - i11);
                    if (i12 == -1) {
                        throw B.m();
                    }
                    this.f37941m += i12;
                    i11 += i12;
                }
                i10 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void Z() {
            int i10 = this.f37937i + this.f37938j;
            this.f37937i = i10;
            int i11 = this.f37941m + i10;
            int i12 = this.f37942n;
            if (i11 <= i12) {
                this.f37938j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f37938j = i13;
            this.f37937i = i10 - i13;
        }

        private void a0(int i10) throws B {
            if (h0(i10)) {
                return;
            }
            if (i10 <= (this.f37923c - this.f37941m) - this.f37939k) {
                throw B.m();
            }
            throw B.l();
        }

        private static long b0(InputStream inputStream, long j10) throws B {
            try {
                return inputStream.skip(j10);
            } catch (B e10) {
                e10.j();
                throw e10;
            }
        }

        private void d0(int i10) throws B {
            if (i10 < 0) {
                throw B.g();
            }
            int i11 = this.f37941m;
            int i12 = this.f37939k;
            int i13 = i11 + i12 + i10;
            int i14 = this.f37942n;
            if (i13 > i14) {
                c0((i14 - i11) - i12);
                throw B.m();
            }
            this.f37941m = i11 + i12;
            int i15 = this.f37937i - i12;
            this.f37937i = 0;
            this.f37939k = 0;
            while (i15 < i10) {
                try {
                    long j10 = i10 - i15;
                    long jB0 = b0(this.f37935g, j10);
                    if (jB0 < 0 || jB0 > j10) {
                        throw new IllegalStateException(this.f37935g.getClass() + "#skip returned invalid result: " + jB0 + "\nThe InputStream implementation is buggy.");
                    }
                    if (jB0 == 0) {
                        break;
                    } else {
                        i15 += (int) jB0;
                    }
                } catch (Throwable th) {
                    this.f37941m += i15;
                    Z();
                    throw th;
                }
            }
            this.f37941m += i15;
            Z();
            if (i15 >= i10) {
                return;
            }
            int i16 = this.f37937i;
            int i17 = i16 - this.f37939k;
            this.f37939k = i16;
            a0(1);
            while (true) {
                int i18 = i10 - i17;
                int i19 = this.f37937i;
                if (i18 <= i19) {
                    this.f37939k = i18;
                    return;
                } else {
                    i17 += i19;
                    this.f37939k = i19;
                    a0(1);
                }
            }
        }

        private void e0() throws B {
            if (this.f37937i - this.f37939k >= 10) {
                f0();
            } else {
                g0();
            }
        }

        private void f0() throws B {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f37936h;
                int i11 = this.f37939k;
                this.f37939k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw B.f();
        }

        private void g0() throws B {
            for (int i10 = 0; i10 < 10; i10++) {
                if (R() >= 0) {
                    return;
                }
            }
            throw B.f();
        }

        private boolean h0(int i10) throws B {
            int i11 = this.f37939k;
            int i12 = i11 + i10;
            int i13 = this.f37937i;
            if (i12 <= i13) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i14 = this.f37923c;
            int i15 = this.f37941m;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f37942n) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f37936h;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f37941m += i11;
                this.f37937i -= i11;
                this.f37939k = 0;
            }
            InputStream inputStream = this.f37935g;
            byte[] bArr2 = this.f37936h;
            int i16 = this.f37937i;
            int iP = P(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.f37923c - this.f37941m) - i16));
            if (iP == 0 || iP < -1 || iP > this.f37936h.length) {
                throw new IllegalStateException(this.f37935g.getClass() + "#read(byte[]) returned invalid result: " + iP + "\nThe InputStream implementation is buggy.");
            }
            if (iP <= 0) {
                return false;
            }
            this.f37937i += iP;
            Z();
            if (this.f37937i >= i10) {
                return true;
            }
            return h0(i10);
        }

        @Override // com.google.protobuf.AbstractC3143i
        public void A(T.a aVar, C3151q c3151q) throws B {
            int iB = B();
            b();
            int iP = p(iB);
            this.f37921a++;
            aVar.h0(this, c3151q);
            a(0);
            this.f37921a--;
            if (e() != 0) {
                throw B.m();
            }
            o(iP);
        }

        @Override // com.google.protobuf.AbstractC3143i
        public int B() {
            int i10;
            int i11 = this.f37939k;
            int i12 = this.f37937i;
            if (i12 != i11) {
                byte[] bArr = this.f37936h;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f37939k = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b10;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << 14) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << 21);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b11 = bArr[i18];
                                int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i18 = i11 + 6;
                                    if (bArr[i16] < 0) {
                                        i16 = i11 + 7;
                                        if (bArr[i18] < 0) {
                                            i18 = i11 + 8;
                                            if (bArr[i16] < 0) {
                                                i16 = i11 + 9;
                                                if (bArr[i18] < 0) {
                                                    int i21 = i11 + 10;
                                                    if (bArr[i16] >= 0) {
                                                        i14 = i21;
                                                        i10 = i20;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i20;
                                }
                                i10 = i20;
                            }
                            i14 = i18;
                        }
                        i14 = i16;
                    }
                    this.f37939k = i14;
                    return i10;
                }
            }
            return (int) Y();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public int D() {
            return V();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public long E() {
            return W();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public int F() {
            return AbstractC3143i.c(B());
        }

        @Override // com.google.protobuf.AbstractC3143i
        public long G() {
            return AbstractC3143i.d(X());
        }

        @Override // com.google.protobuf.AbstractC3143i
        public String H() throws B {
            int iB = B();
            if (iB > 0) {
                int i10 = this.f37937i;
                int i11 = this.f37939k;
                if (iB <= i10 - i11) {
                    String str = new String(this.f37936h, i11, iB, A.f37676b);
                    this.f37939k += iB;
                    return str;
                }
            }
            if (iB == 0) {
                return "";
            }
            if (iB < 0) {
                throw B.g();
            }
            if (iB > this.f37937i) {
                return new String(S(iB, false), A.f37676b);
            }
            a0(iB);
            String str2 = new String(this.f37936h, this.f37939k, iB, A.f37676b);
            this.f37939k += iB;
            return str2;
        }

        @Override // com.google.protobuf.AbstractC3143i
        public String I() throws IOException {
            byte[] bArrS;
            int iB = B();
            int i10 = this.f37939k;
            int i11 = this.f37937i;
            if (iB <= i11 - i10 && iB > 0) {
                bArrS = this.f37936h;
                this.f37939k = i10 + iB;
            } else {
                if (iB == 0) {
                    return "";
                }
                if (iB < 0) {
                    throw B.g();
                }
                i10 = 0;
                if (iB <= i11) {
                    a0(iB);
                    bArrS = this.f37936h;
                    this.f37939k = iB;
                } else {
                    bArrS = S(iB, false);
                }
            }
            return A0.h(bArrS, i10, iB);
        }

        @Override // com.google.protobuf.AbstractC3143i
        public int J() throws B {
            if (g()) {
                this.f37940l = 0;
                return 0;
            }
            int iB = B();
            this.f37940l = iB;
            if (C0.a(iB) != 0) {
                return this.f37940l;
            }
            throw B.c();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public int K() {
            return B();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public long L() {
            return X();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public boolean M(int i10) throws B {
            int iB = C0.b(i10);
            if (iB == 0) {
                e0();
                return true;
            }
            if (iB == 1) {
                c0(8);
                return true;
            }
            if (iB == 2) {
                c0(B());
                return true;
            }
            if (iB == 3) {
                N();
                a(C0.c(C0.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw B.e();
            }
            c0(4);
            return true;
        }

        public byte R() throws B {
            if (this.f37939k == this.f37937i) {
                a0(1);
            }
            byte[] bArr = this.f37936h;
            int i10 = this.f37939k;
            this.f37939k = i10 + 1;
            return bArr[i10];
        }

        public int V() throws B {
            int i10 = this.f37939k;
            if (this.f37937i - i10 < 4) {
                a0(4);
                i10 = this.f37939k;
            }
            byte[] bArr = this.f37936h;
            this.f37939k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long W() throws B {
            int i10 = this.f37939k;
            if (this.f37937i - i10 < 8) {
                a0(8);
                i10 = this.f37939k;
            }
            byte[] bArr = this.f37936h;
            this.f37939k = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        public long X() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f37939k;
            int i11 = this.f37937i;
            if (i11 != i10) {
                byte[] bArr = this.f37936h;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f37939k = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        j10 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << 14) ^ i14;
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                long j13 = (-2080896) ^ i18;
                                i13 = i17;
                                j10 = j13;
                            } else {
                                long j14 = i18;
                                i13 = i10 + 5;
                                long j15 = j14 ^ (((long) bArr[i17]) << 28);
                                if (j15 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    int i19 = i10 + 6;
                                    long j16 = j15 ^ (((long) bArr[i13]) << 35);
                                    if (j16 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j15 = j16 ^ (((long) bArr[i19]) << 42);
                                        if (j15 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i19 = i10 + 8;
                                            j16 = j15 ^ (((long) bArr[i13]) << 49);
                                            if (j16 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j17 = (j16 ^ (((long) bArr[i19]) << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    int i20 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i20;
                                                    }
                                                }
                                                j10 = j17;
                                            }
                                        }
                                    }
                                    j10 = j16 ^ j11;
                                    i13 = i19;
                                }
                                j10 = j15 ^ j12;
                            }
                        }
                    }
                    this.f37939k = i13;
                    return j10;
                }
            }
            return Y();
        }

        long Y() throws B {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bR = R();
                j10 |= ((long) (bR & 127)) << i10;
                if ((bR & 128) == 0) {
                    return j10;
                }
            }
            throw B.f();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public void a(int i10) throws B {
            if (this.f37940l != i10) {
                throw B.b();
            }
        }

        public void c0(int i10) throws B {
            int i11 = this.f37937i;
            int i12 = this.f37939k;
            if (i10 > i11 - i12 || i10 < 0) {
                d0(i10);
            } else {
                this.f37939k = i12 + i10;
            }
        }

        @Override // com.google.protobuf.AbstractC3143i
        public int e() {
            int i10 = this.f37942n;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - (this.f37941m + this.f37939k);
        }

        @Override // com.google.protobuf.AbstractC3143i
        public int f() {
            return this.f37941m + this.f37939k;
        }

        @Override // com.google.protobuf.AbstractC3143i
        public boolean g() {
            return this.f37939k == this.f37937i && !h0(1);
        }

        @Override // com.google.protobuf.AbstractC3143i
        public void o(int i10) {
            this.f37942n = i10;
            Z();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public int p(int i10) throws B {
            if (i10 < 0) {
                throw B.g();
            }
            int i11 = i10 + this.f37941m + this.f37939k;
            int i12 = this.f37942n;
            if (i11 > i12) {
                throw B.m();
            }
            this.f37942n = i11;
            Z();
            return i12;
        }

        @Override // com.google.protobuf.AbstractC3143i
        public boolean q() {
            return X() != 0;
        }

        @Override // com.google.protobuf.AbstractC3143i
        public AbstractC3142h r() throws B {
            int iB = B();
            int i10 = this.f37937i;
            int i11 = this.f37939k;
            if (iB <= i10 - i11 && iB > 0) {
                AbstractC3142h abstractC3142hJ = AbstractC3142h.j(this.f37936h, i11, iB);
                this.f37939k += iB;
                return abstractC3142hJ;
            }
            if (iB == 0) {
                return AbstractC3142h.f37908b;
            }
            if (iB >= 0) {
                return Q(iB);
            }
            throw B.g();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public double s() {
            return Double.longBitsToDouble(W());
        }

        @Override // com.google.protobuf.AbstractC3143i
        public int t() {
            return B();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public int u() {
            return V();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public long v() {
            return W();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public float w() {
            return Float.intBitsToFloat(V());
        }

        @Override // com.google.protobuf.AbstractC3143i
        public void x(int i10, T.a aVar, C3151q c3151q) throws B {
            b();
            this.f37921a++;
            aVar.h0(this, c3151q);
            a(C0.c(i10, 4));
            this.f37921a--;
        }

        @Override // com.google.protobuf.AbstractC3143i
        public int y() {
            return B();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public long z() {
            return X();
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.i$d */
    private static final class d extends AbstractC3143i {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final ByteBuffer f37943g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f37944h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final long f37945i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f37946j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f37947k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f37948l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f37949m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f37950n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f37951o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f37952p;

        private d(ByteBuffer byteBuffer, boolean z10) {
            super(null);
            this.f37952p = Integer.MAX_VALUE;
            this.f37943g = byteBuffer;
            long jK = z0.k(byteBuffer);
            this.f37945i = jK;
            this.f37946j = ((long) byteBuffer.limit()) + jK;
            long jPosition = jK + ((long) byteBuffer.position());
            this.f37947k = jPosition;
            this.f37948l = jPosition;
            this.f37944h = z10;
        }

        /* synthetic */ d(ByteBuffer byteBuffer, boolean z10, a aVar) {
            this(byteBuffer, z10);
        }

        private int O(long j10) {
            return (int) (j10 - this.f37945i);
        }

        static boolean P() {
            return z0.J();
        }

        private void V() {
            long j10 = this.f37946j + ((long) this.f37949m);
            this.f37946j = j10;
            int i10 = (int) (j10 - this.f37948l);
            int i11 = this.f37952p;
            if (i10 <= i11) {
                this.f37949m = 0;
                return;
            }
            int i12 = i10 - i11;
            this.f37949m = i12;
            this.f37946j = j10 - ((long) i12);
        }

        private int W() {
            return (int) (this.f37946j - this.f37947k);
        }

        private void Y() throws B {
            if (W() >= 10) {
                Z();
            } else {
                a0();
            }
        }

        private void Z() throws B {
            for (int i10 = 0; i10 < 10; i10++) {
                long j10 = this.f37947k;
                this.f37947k = 1 + j10;
                if (z0.w(j10) >= 0) {
                    return;
                }
            }
            throw B.f();
        }

        private void a0() throws B {
            for (int i10 = 0; i10 < 10; i10++) {
                if (Q() >= 0) {
                    return;
                }
            }
            throw B.f();
        }

        private ByteBuffer b0(long j10, long j11) {
            int iPosition = this.f37943g.position();
            int iLimit = this.f37943g.limit();
            ByteBuffer byteBuffer = this.f37943g;
            try {
                try {
                    byteBuffer.position(O(j10));
                    byteBuffer.limit(O(j11));
                    ByteBuffer byteBufferSlice = this.f37943g.slice();
                    byteBuffer.position(iPosition);
                    byteBuffer.limit(iLimit);
                    return byteBufferSlice;
                } catch (IllegalArgumentException e10) {
                    B bM = B.m();
                    bM.initCause(e10);
                    throw bM;
                }
            } catch (Throwable th) {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
                throw th;
            }
        }

        @Override // com.google.protobuf.AbstractC3143i
        public void A(T.a aVar, C3151q c3151q) throws B {
            int iB = B();
            b();
            int iP = p(iB);
            this.f37921a++;
            aVar.h0(this, c3151q);
            a(0);
            this.f37921a--;
            if (e() != 0) {
                throw B.m();
            }
            o(iP);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        
            if (com.google.protobuf.z0.w(r3) < 0) goto L34;
         */
        @Override // com.google.protobuf.AbstractC3143i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int B() {
            /*
                r9 = this;
                long r0 = r9.f37947k
                long r2 = r9.f37946j
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L8e
            La:
                r2 = 1
                long r2 = r2 + r0
                byte r4 = com.google.protobuf.z0.w(r0)
                if (r4 < 0) goto L16
                r9.f37947k = r2
                return r4
            L16:
                long r5 = r9.f37946j
                long r5 = r5 - r2
                r7 = 9
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 >= 0) goto L21
                goto L8e
            L21:
                r5 = 2
                long r5 = r5 + r0
                byte r2 = com.google.protobuf.z0.w(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r4
                if (r2 >= 0) goto L31
                r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L98
            L31:
                r3 = 3
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.z0.w(r5)
                int r5 = r5 << 14
                r2 = r2 ^ r5
                if (r2 < 0) goto L41
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            L3f:
                r5 = r3
                goto L98
            L41:
                r5 = 4
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.z0.w(r3)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L52
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L98
            L52:
                r3 = 5
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.z0.w(r5)
                int r6 = r5 << 28
                r2 = r2 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r6
                if (r5 >= 0) goto L96
                r5 = 6
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.z0.w(r3)
                if (r3 >= 0) goto L94
                r3 = 7
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.z0.w(r5)
                if (r5 >= 0) goto L96
                r5 = 8
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.z0.w(r3)
                if (r3 >= 0) goto L94
                long r3 = r0 + r7
                byte r5 = com.google.protobuf.z0.w(r5)
                if (r5 >= 0) goto L96
                r5 = 10
                long r5 = r5 + r0
                byte r0 = com.google.protobuf.z0.w(r3)
                if (r0 >= 0) goto L94
            L8e:
                long r0 = r9.U()
                int r0 = (int) r0
                return r0
            L94:
                r0 = r2
                goto L98
            L96:
                r0 = r2
                goto L3f
            L98:
                r9.f37947k = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC3143i.d.B():int");
        }

        @Override // com.google.protobuf.AbstractC3143i
        public int D() {
            return R();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public long E() {
            return S();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public int F() {
            return AbstractC3143i.c(B());
        }

        @Override // com.google.protobuf.AbstractC3143i
        public long G() {
            return AbstractC3143i.d(T());
        }

        @Override // com.google.protobuf.AbstractC3143i
        public String H() throws B {
            int iB = B();
            if (iB <= 0 || iB > W()) {
                if (iB == 0) {
                    return "";
                }
                if (iB < 0) {
                    throw B.g();
                }
                throw B.m();
            }
            byte[] bArr = new byte[iB];
            long j10 = iB;
            z0.p(this.f37947k, bArr, 0L, j10);
            String str = new String(bArr, A.f37676b);
            this.f37947k += j10;
            return str;
        }

        @Override // com.google.protobuf.AbstractC3143i
        public String I() throws B {
            int iB = B();
            if (iB > 0 && iB <= W()) {
                String strG = A0.g(this.f37943g, O(this.f37947k), iB);
                this.f37947k += (long) iB;
                return strG;
            }
            if (iB == 0) {
                return "";
            }
            if (iB <= 0) {
                throw B.g();
            }
            throw B.m();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public int J() throws B {
            if (g()) {
                this.f37950n = 0;
                return 0;
            }
            int iB = B();
            this.f37950n = iB;
            if (C0.a(iB) != 0) {
                return this.f37950n;
            }
            throw B.c();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public int K() {
            return B();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public long L() {
            return T();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public boolean M(int i10) throws B {
            int iB = C0.b(i10);
            if (iB == 0) {
                Y();
                return true;
            }
            if (iB == 1) {
                X(8);
                return true;
            }
            if (iB == 2) {
                X(B());
                return true;
            }
            if (iB == 3) {
                N();
                a(C0.c(C0.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw B.e();
            }
            X(4);
            return true;
        }

        public byte Q() throws B {
            long j10 = this.f37947k;
            if (j10 == this.f37946j) {
                throw B.m();
            }
            this.f37947k = 1 + j10;
            return z0.w(j10);
        }

        public int R() throws B {
            long j10 = this.f37947k;
            if (this.f37946j - j10 < 4) {
                throw B.m();
            }
            this.f37947k = 4 + j10;
            return ((z0.w(j10 + 3) & 255) << 24) | (z0.w(j10) & 255) | ((z0.w(1 + j10) & 255) << 8) | ((z0.w(2 + j10) & 255) << 16);
        }

        public long S() throws B {
            long j10 = this.f37947k;
            if (this.f37946j - j10 < 8) {
                throw B.m();
            }
            this.f37947k = 8 + j10;
            return ((((long) z0.w(j10 + 7)) & 255) << 56) | (((long) z0.w(j10)) & 255) | ((((long) z0.w(1 + j10)) & 255) << 8) | ((((long) z0.w(2 + j10)) & 255) << 16) | ((((long) z0.w(3 + j10)) & 255) << 24) | ((((long) z0.w(4 + j10)) & 255) << 32) | ((((long) z0.w(5 + j10)) & 255) << 40) | ((((long) z0.w(6 + j10)) & 255) << 48);
        }

        public long T() {
            long j10;
            long j11;
            long j12;
            int i10;
            long j13 = this.f37947k;
            if (this.f37946j != j13) {
                long j14 = 1 + j13;
                byte bW = z0.w(j13);
                if (bW >= 0) {
                    this.f37947k = j14;
                    return bW;
                }
                if (this.f37946j - j14 >= 9) {
                    long j15 = 2 + j13;
                    int iW = (z0.w(j14) << 7) ^ bW;
                    if (iW >= 0) {
                        long j16 = 3 + j13;
                        int iW2 = iW ^ (z0.w(j15) << 14);
                        if (iW2 >= 0) {
                            j10 = iW2 ^ 16256;
                            j15 = j16;
                        } else {
                            j15 = 4 + j13;
                            int iW3 = iW2 ^ (z0.w(j16) << 21);
                            if (iW3 < 0) {
                                i10 = (-2080896) ^ iW3;
                            } else {
                                long j17 = 5 + j13;
                                long jW = ((long) iW3) ^ (((long) z0.w(j15)) << 28);
                                if (jW >= 0) {
                                    j12 = 266354560;
                                } else {
                                    long j18 = 6 + j13;
                                    long jW2 = jW ^ (((long) z0.w(j17)) << 35);
                                    if (jW2 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        j17 = 7 + j13;
                                        jW = jW2 ^ (((long) z0.w(j18)) << 42);
                                        if (jW >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            j18 = 8 + j13;
                                            jW2 = jW ^ (((long) z0.w(j17)) << 49);
                                            if (jW2 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                long j19 = j13 + 9;
                                                long jW3 = (jW2 ^ (((long) z0.w(j18)) << 56)) ^ 71499008037633920L;
                                                if (jW3 < 0) {
                                                    long j20 = j13 + 10;
                                                    if (z0.w(j19) >= 0) {
                                                        j15 = j20;
                                                        j10 = jW3;
                                                    }
                                                } else {
                                                    j10 = jW3;
                                                    j15 = j19;
                                                }
                                            }
                                        }
                                    }
                                    j10 = j11 ^ jW2;
                                    j15 = j18;
                                }
                                j10 = j12 ^ jW;
                                j15 = j17;
                            }
                        }
                        this.f37947k = j15;
                        return j10;
                    }
                    i10 = iW ^ (-128);
                    j10 = i10;
                    this.f37947k = j15;
                    return j10;
                }
            }
            return U();
        }

        long U() throws B {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bQ = Q();
                j10 |= ((long) (bQ & 127)) << i10;
                if ((bQ & 128) == 0) {
                    return j10;
                }
            }
            throw B.f();
        }

        public void X(int i10) throws B {
            if (i10 >= 0 && i10 <= W()) {
                this.f37947k += (long) i10;
            } else {
                if (i10 >= 0) {
                    throw B.m();
                }
                throw B.g();
            }
        }

        @Override // com.google.protobuf.AbstractC3143i
        public void a(int i10) throws B {
            if (this.f37950n != i10) {
                throw B.b();
            }
        }

        @Override // com.google.protobuf.AbstractC3143i
        public int e() {
            int i10 = this.f37952p;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - f();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public int f() {
            return (int) (this.f37947k - this.f37948l);
        }

        @Override // com.google.protobuf.AbstractC3143i
        public boolean g() {
            return this.f37947k == this.f37946j;
        }

        @Override // com.google.protobuf.AbstractC3143i
        public void o(int i10) {
            this.f37952p = i10;
            V();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public int p(int i10) throws B {
            if (i10 < 0) {
                throw B.g();
            }
            int iF = i10 + f();
            int i11 = this.f37952p;
            if (iF > i11) {
                throw B.m();
            }
            this.f37952p = iF;
            V();
            return i11;
        }

        @Override // com.google.protobuf.AbstractC3143i
        public boolean q() {
            return T() != 0;
        }

        @Override // com.google.protobuf.AbstractC3143i
        public AbstractC3142h r() throws B {
            int iB = B();
            if (iB <= 0 || iB > W()) {
                if (iB == 0) {
                    return AbstractC3142h.f37908b;
                }
                if (iB < 0) {
                    throw B.g();
                }
                throw B.m();
            }
            if (this.f37944h && this.f37951o) {
                long j10 = this.f37947k;
                long j11 = iB;
                ByteBuffer byteBufferB0 = b0(j10, j10 + j11);
                this.f37947k += j11;
                return AbstractC3142h.E(byteBufferB0);
            }
            byte[] bArr = new byte[iB];
            long j12 = iB;
            z0.p(this.f37947k, bArr, 0L, j12);
            this.f37947k += j12;
            return AbstractC3142h.F(bArr);
        }

        @Override // com.google.protobuf.AbstractC3143i
        public double s() {
            return Double.longBitsToDouble(S());
        }

        @Override // com.google.protobuf.AbstractC3143i
        public int t() {
            return B();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public int u() {
            return R();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public long v() {
            return S();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public float w() {
            return Float.intBitsToFloat(R());
        }

        @Override // com.google.protobuf.AbstractC3143i
        public void x(int i10, T.a aVar, C3151q c3151q) throws B {
            b();
            this.f37921a++;
            aVar.h0(this, c3151q);
            a(C0.c(i10, 4));
            this.f37921a--;
        }

        @Override // com.google.protobuf.AbstractC3143i
        public int y() {
            return B();
        }

        @Override // com.google.protobuf.AbstractC3143i
        public long z() {
            return T();
        }
    }

    private AbstractC3143i() {
        this.f37922b = f37920f;
        this.f37923c = Integer.MAX_VALUE;
        this.f37925e = false;
    }

    /* synthetic */ AbstractC3143i(a aVar) {
        this();
    }

    public static int C(int i10, InputStream inputStream) throws IOException {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & 127;
        int i12 = 7;
        while (i12 < 32) {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw B.m();
            }
            i11 |= (i13 & 127) << i12;
            if ((i13 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        while (i12 < 64) {
            int i14 = inputStream.read();
            if (i14 == -1) {
                throw B.m();
            }
            if ((i14 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        throw B.f();
    }

    public static int c(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long d(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static AbstractC3143i h(InputStream inputStream) {
        return i(inputStream, 4096);
    }

    public static AbstractC3143i i(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? l(A.f37678d) : new c(inputStream, i10, null);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static AbstractC3143i j(ByteBuffer byteBuffer) {
        return k(byteBuffer, false);
    }

    static AbstractC3143i k(ByteBuffer byteBuffer, boolean z10) {
        if (byteBuffer.hasArray()) {
            return n(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z10);
        }
        if (byteBuffer.isDirect() && d.P()) {
            return new d(byteBuffer, z10, null);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return n(bArr, 0, iRemaining, true);
    }

    public static AbstractC3143i l(byte[] bArr) {
        return m(bArr, 0, bArr.length);
    }

    public static AbstractC3143i m(byte[] bArr, int i10, int i11) {
        return n(bArr, i10, i11, false);
    }

    static AbstractC3143i n(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10, null);
        try {
            bVar.p(i11);
            return bVar;
        } catch (B e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract void A(T.a aVar, C3151q c3151q);

    public abstract int B();

    public abstract int D();

    public abstract long E();

    public abstract int F();

    public abstract long G();

    public abstract String H();

    public abstract String I();

    public abstract int J();

    public abstract int K();

    public abstract long L();

    public abstract boolean M(int i10);

    public void N() throws B {
        boolean zM;
        do {
            int iJ = J();
            if (iJ == 0) {
                return;
            }
            b();
            this.f37921a++;
            zM = M(iJ);
            this.f37921a--;
        } while (zM);
    }

    public abstract void a(int i10);

    public void b() throws B {
        if (this.f37921a >= this.f37922b) {
            throw B.i();
        }
    }

    public abstract int e();

    public abstract int f();

    public abstract boolean g();

    public abstract void o(int i10);

    public abstract int p(int i10);

    public abstract boolean q();

    public abstract AbstractC3142h r();

    public abstract double s();

    public abstract int t();

    public abstract int u();

    public abstract long v();

    public abstract float w();

    public abstract void x(int i10, T.a aVar, C3151q c3151q);

    public abstract int y();

    public abstract long z();
}
