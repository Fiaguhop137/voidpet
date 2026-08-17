package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1951g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile int f23446f = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f23447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f23448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f23449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    C1952h f23450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23451e;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$b */
    private static final class b extends AbstractC1951g {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final byte[] f23452g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f23453h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f23454i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f23455j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f23456k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f23457l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f23458m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f23459n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f23460o;

        private b(byte[] bArr, int i10, int i11, boolean z10) {
            super(null);
            this.f23460o = Integer.MAX_VALUE;
            this.f23452g = bArr;
            this.f23454i = i11 + i10;
            this.f23456k = i10;
            this.f23457l = i10;
            this.f23453h = z10;
        }

        /* synthetic */ b(byte[] bArr, int i10, int i11, boolean z10, a aVar) {
            this(bArr, i10, i11, z10);
        }

        private void O() {
            int i10 = this.f23454i + this.f23455j;
            this.f23454i = i10;
            int i11 = i10 - this.f23457l;
            int i12 = this.f23460o;
            if (i11 <= i12) {
                this.f23455j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f23455j = i13;
            this.f23454i = i10 - i13;
        }

        private void Q() throws C1965v {
            if (this.f23454i - this.f23456k >= 10) {
                R();
            } else {
                S();
            }
        }

        private void R() throws C1965v {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f23452g;
                int i11 = this.f23456k;
                this.f23456k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw C1965v.f();
        }

        private void S() throws C1965v {
            for (int i10 = 0; i10 < 10; i10++) {
                if (H() >= 0) {
                    return;
                }
            }
            throw C1965v.f();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public String A() throws C1965v {
            int iL = L();
            if (iL > 0) {
                int i10 = this.f23454i;
                int i11 = this.f23456k;
                if (iL <= i10 - i11) {
                    String str = new String(this.f23452g, i11, iL, AbstractC1964u.f23651b);
                    this.f23456k += iL;
                    return str;
                }
            }
            if (iL == 0) {
                return "";
            }
            if (iL < 0) {
                throw C1965v.g();
            }
            throw C1965v.m();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public String B() throws C1965v {
            int iL = L();
            if (iL > 0) {
                int i10 = this.f23454i;
                int i11 = this.f23456k;
                if (iL <= i10 - i11) {
                    String strA = l0.a(this.f23452g, i11, iL);
                    this.f23456k += iL;
                    return strA;
                }
            }
            if (iL == 0) {
                return "";
            }
            if (iL <= 0) {
                throw C1965v.g();
            }
            throw C1965v.m();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public int C() throws C1965v {
            if (f()) {
                this.f23458m = 0;
                return 0;
            }
            int iL = L();
            this.f23458m = iL;
            if (m0.a(iL) != 0) {
                return this.f23458m;
            }
            throw C1965v.c();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public int D() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public long E() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public boolean F(int i10) throws C1965v {
            int iB = m0.b(i10);
            if (iB == 0) {
                Q();
                return true;
            }
            if (iB == 1) {
                P(8);
                return true;
            }
            if (iB == 2) {
                P(L());
                return true;
            }
            if (iB == 3) {
                G();
                a(m0.c(m0.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw C1965v.e();
            }
            P(4);
            return true;
        }

        public byte H() throws C1965v {
            int i10 = this.f23456k;
            if (i10 == this.f23454i) {
                throw C1965v.m();
            }
            byte[] bArr = this.f23452g;
            this.f23456k = i10 + 1;
            return bArr[i10];
        }

        public byte[] I(int i10) throws C1965v {
            if (i10 > 0) {
                int i11 = this.f23454i;
                int i12 = this.f23456k;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f23456k = i13;
                    return Arrays.copyOfRange(this.f23452g, i12, i13);
                }
            }
            if (i10 > 0) {
                throw C1965v.m();
            }
            if (i10 == 0) {
                return AbstractC1964u.f23653d;
            }
            throw C1965v.g();
        }

        public int J() throws C1965v {
            int i10 = this.f23456k;
            if (this.f23454i - i10 < 4) {
                throw C1965v.m();
            }
            byte[] bArr = this.f23452g;
            this.f23456k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long K() throws C1965v {
            int i10 = this.f23456k;
            if (this.f23454i - i10 < 8) {
                throw C1965v.m();
            }
            byte[] bArr = this.f23452g;
            this.f23456k = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        public int L() {
            int i10;
            int i11 = this.f23456k;
            int i12 = this.f23454i;
            if (i12 != i11) {
                byte[] bArr = this.f23452g;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f23456k = i13;
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
                    this.f23456k = i14;
                    return i10;
                }
            }
            return (int) N();
        }

        public long M() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f23456k;
            int i11 = this.f23454i;
            if (i11 != i10) {
                byte[] bArr = this.f23452g;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f23456k = i12;
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
                    this.f23456k = i13;
                    return j10;
                }
            }
            return N();
        }

        long N() throws C1965v {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bH = H();
                j10 |= ((long) (bH & 127)) << i10;
                if ((bH & 128) == 0) {
                    return j10;
                }
            }
            throw C1965v.f();
        }

        public void P(int i10) throws C1965v {
            if (i10 >= 0) {
                int i11 = this.f23454i;
                int i12 = this.f23456k;
                if (i10 <= i11 - i12) {
                    this.f23456k = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw C1965v.m();
            }
            throw C1965v.g();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public void a(int i10) throws C1965v {
            if (this.f23458m != i10) {
                throw C1965v.b();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public int e() {
            return this.f23456k - this.f23457l;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public boolean f() {
            return this.f23456k == this.f23454i;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public void l(int i10) {
            this.f23460o = i10;
            O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public int m(int i10) throws C1965v {
            if (i10 < 0) {
                throw C1965v.g();
            }
            int iE = i10 + e();
            if (iE < 0) {
                throw C1965v.h();
            }
            int i11 = this.f23460o;
            if (iE > i11) {
                throw C1965v.m();
            }
            this.f23460o = iE;
            O();
            return i11;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public boolean n() {
            return M() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public AbstractC1950f o() {
            int iL = L();
            if (iL > 0) {
                int i10 = this.f23454i;
                int i11 = this.f23456k;
                if (iL <= i10 - i11) {
                    AbstractC1950f abstractC1950fX = (this.f23453h && this.f23459n) ? AbstractC1950f.x(this.f23452g, i11, iL) : AbstractC1950f.i(this.f23452g, i11, iL);
                    this.f23456k += iL;
                    return abstractC1950fX;
                }
            }
            return iL == 0 ? AbstractC1950f.f23435b : AbstractC1950f.w(I(iL));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public double p() {
            return Double.longBitsToDouble(K());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public int q() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public int r() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public long s() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public float t() {
            return Float.intBitsToFloat(J());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public int u() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public long v() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public int w() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public long x() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public int y() {
            return AbstractC1951g.c(L());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public long z() {
            return AbstractC1951g.d(M());
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$c */
    private static final class c extends AbstractC1951g {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final InputStream f23461g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final byte[] f23462h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f23463i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f23464j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f23465k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f23466l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f23467m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f23468n;

        private c(InputStream inputStream, int i10) {
            super(null);
            this.f23468n = Integer.MAX_VALUE;
            AbstractC1964u.b(inputStream, "input");
            this.f23461g = inputStream;
            this.f23462h = new byte[i10];
            this.f23463i = 0;
            this.f23465k = 0;
            this.f23467m = 0;
        }

        /* synthetic */ c(InputStream inputStream, int i10, a aVar) {
            this(inputStream, i10);
        }

        private static int H(InputStream inputStream) throws C1965v {
            try {
                return inputStream.available();
            } catch (C1965v e10) {
                e10.j();
                throw e10;
            }
        }

        private static int I(InputStream inputStream, byte[] bArr, int i10, int i11) throws C1965v {
            try {
                return inputStream.read(bArr, i10, i11);
            } catch (C1965v e10) {
                e10.j();
                throw e10;
            }
        }

        private AbstractC1950f J(int i10) throws IOException {
            byte[] bArrM = M(i10);
            if (bArrM != null) {
                return AbstractC1950f.h(bArrM);
            }
            int i11 = this.f23465k;
            int i12 = this.f23463i;
            int length = i12 - i11;
            this.f23467m += i12;
            this.f23465k = 0;
            this.f23463i = 0;
            List<byte[]> listN = N(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f23462h, i11, bArr, 0, length);
            for (byte[] bArr2 : listN) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return AbstractC1950f.w(bArr);
        }

        private byte[] L(int i10, boolean z10) throws IOException {
            byte[] bArrM = M(i10);
            if (bArrM != null) {
                return z10 ? (byte[]) bArrM.clone() : bArrM;
            }
            int i11 = this.f23465k;
            int i12 = this.f23463i;
            int length = i12 - i11;
            this.f23467m += i12;
            this.f23465k = 0;
            this.f23463i = 0;
            List<byte[]> listN = N(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f23462h, i11, bArr, 0, length);
            for (byte[] bArr2 : listN) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] M(int i10) throws C1965v {
            if (i10 == 0) {
                return AbstractC1964u.f23653d;
            }
            if (i10 < 0) {
                throw C1965v.g();
            }
            int i11 = this.f23467m;
            int i12 = this.f23465k;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f23449c > 0) {
                throw C1965v.l();
            }
            int i14 = this.f23468n;
            if (i13 > i14) {
                W((i14 - i11) - i12);
                throw C1965v.m();
            }
            int i15 = this.f23463i - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096 && i16 > H(this.f23461g)) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f23462h, this.f23465k, bArr, 0, i15);
            this.f23467m += this.f23463i;
            this.f23465k = 0;
            this.f23463i = 0;
            while (i15 < i10) {
                int I10 = I(this.f23461g, bArr, i15, i10 - i15);
                if (I10 == -1) {
                    throw C1965v.m();
                }
                this.f23467m += I10;
                i15 += I10;
            }
            return bArr;
        }

        private List N(int i10) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int iMin = Math.min(i10, 4096);
                byte[] bArr = new byte[iMin];
                int i11 = 0;
                while (i11 < iMin) {
                    int i12 = this.f23461g.read(bArr, i11, iMin - i11);
                    if (i12 == -1) {
                        throw C1965v.m();
                    }
                    this.f23467m += i12;
                    i11 += i12;
                }
                i10 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void T() {
            int i10 = this.f23463i + this.f23464j;
            this.f23463i = i10;
            int i11 = this.f23467m + i10;
            int i12 = this.f23468n;
            if (i11 <= i12) {
                this.f23464j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f23464j = i13;
            this.f23463i = i10 - i13;
        }

        private void U(int i10) throws C1965v {
            if (b0(i10)) {
                return;
            }
            if (i10 <= (this.f23449c - this.f23467m) - this.f23465k) {
                throw C1965v.m();
            }
            throw C1965v.l();
        }

        private static long V(InputStream inputStream, long j10) throws C1965v {
            try {
                return inputStream.skip(j10);
            } catch (C1965v e10) {
                e10.j();
                throw e10;
            }
        }

        private void X(int i10) throws C1965v {
            if (i10 < 0) {
                throw C1965v.g();
            }
            int i11 = this.f23467m;
            int i12 = this.f23465k;
            int i13 = i11 + i12 + i10;
            int i14 = this.f23468n;
            if (i13 > i14) {
                W((i14 - i11) - i12);
                throw C1965v.m();
            }
            this.f23467m = i11 + i12;
            int i15 = this.f23463i - i12;
            this.f23463i = 0;
            this.f23465k = 0;
            while (i15 < i10) {
                try {
                    long j10 = i10 - i15;
                    long jV = V(this.f23461g, j10);
                    if (jV < 0 || jV > j10) {
                        throw new IllegalStateException(this.f23461g.getClass() + "#skip returned invalid result: " + jV + "\nThe InputStream implementation is buggy.");
                    }
                    if (jV == 0) {
                        break;
                    } else {
                        i15 += (int) jV;
                    }
                } catch (Throwable th) {
                    this.f23467m += i15;
                    T();
                    throw th;
                }
            }
            this.f23467m += i15;
            T();
            if (i15 >= i10) {
                return;
            }
            int i16 = this.f23463i;
            int i17 = i16 - this.f23465k;
            this.f23465k = i16;
            U(1);
            while (true) {
                int i18 = i10 - i17;
                int i19 = this.f23463i;
                if (i18 <= i19) {
                    this.f23465k = i18;
                    return;
                } else {
                    i17 += i19;
                    this.f23465k = i19;
                    U(1);
                }
            }
        }

        private void Y() throws C1965v {
            if (this.f23463i - this.f23465k >= 10) {
                Z();
            } else {
                a0();
            }
        }

        private void Z() throws C1965v {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f23462h;
                int i11 = this.f23465k;
                this.f23465k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw C1965v.f();
        }

        private void a0() throws C1965v {
            for (int i10 = 0; i10 < 10; i10++) {
                if (K() >= 0) {
                    return;
                }
            }
            throw C1965v.f();
        }

        private boolean b0(int i10) throws C1965v {
            int i11 = this.f23465k;
            int i12 = i11 + i10;
            int i13 = this.f23463i;
            if (i12 <= i13) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i14 = this.f23449c;
            int i15 = this.f23467m;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f23468n) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f23462h;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f23467m += i11;
                this.f23463i -= i11;
                this.f23465k = 0;
            }
            InputStream inputStream = this.f23461g;
            byte[] bArr2 = this.f23462h;
            int i16 = this.f23463i;
            int I10 = I(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.f23449c - this.f23467m) - i16));
            if (I10 == 0 || I10 < -1 || I10 > this.f23462h.length) {
                throw new IllegalStateException(this.f23461g.getClass() + "#read(byte[]) returned invalid result: " + I10 + "\nThe InputStream implementation is buggy.");
            }
            if (I10 <= 0) {
                return false;
            }
            this.f23463i += I10;
            T();
            if (this.f23463i >= i10) {
                return true;
            }
            return b0(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public String A() throws C1965v {
            int iQ = Q();
            if (iQ > 0) {
                int i10 = this.f23463i;
                int i11 = this.f23465k;
                if (iQ <= i10 - i11) {
                    String str = new String(this.f23462h, i11, iQ, AbstractC1964u.f23651b);
                    this.f23465k += iQ;
                    return str;
                }
            }
            if (iQ == 0) {
                return "";
            }
            if (iQ < 0) {
                throw C1965v.g();
            }
            if (iQ > this.f23463i) {
                return new String(L(iQ, false), AbstractC1964u.f23651b);
            }
            U(iQ);
            String str2 = new String(this.f23462h, this.f23465k, iQ, AbstractC1964u.f23651b);
            this.f23465k += iQ;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public String B() throws IOException {
            byte[] bArrL;
            int iQ = Q();
            int i10 = this.f23465k;
            int i11 = this.f23463i;
            if (iQ <= i11 - i10 && iQ > 0) {
                bArrL = this.f23462h;
                this.f23465k = i10 + iQ;
            } else {
                if (iQ == 0) {
                    return "";
                }
                if (iQ < 0) {
                    throw C1965v.g();
                }
                i10 = 0;
                if (iQ <= i11) {
                    U(iQ);
                    bArrL = this.f23462h;
                    this.f23465k = iQ;
                } else {
                    bArrL = L(iQ, false);
                }
            }
            return l0.a(bArrL, i10, iQ);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public int C() throws C1965v {
            if (f()) {
                this.f23466l = 0;
                return 0;
            }
            int iQ = Q();
            this.f23466l = iQ;
            if (m0.a(iQ) != 0) {
                return this.f23466l;
            }
            throw C1965v.c();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public int D() {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public long E() {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public boolean F(int i10) throws C1965v {
            int iB = m0.b(i10);
            if (iB == 0) {
                Y();
                return true;
            }
            if (iB == 1) {
                W(8);
                return true;
            }
            if (iB == 2) {
                W(Q());
                return true;
            }
            if (iB == 3) {
                G();
                a(m0.c(m0.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw C1965v.e();
            }
            W(4);
            return true;
        }

        public byte K() throws C1965v {
            if (this.f23465k == this.f23463i) {
                U(1);
            }
            byte[] bArr = this.f23462h;
            int i10 = this.f23465k;
            this.f23465k = i10 + 1;
            return bArr[i10];
        }

        public int O() throws C1965v {
            int i10 = this.f23465k;
            if (this.f23463i - i10 < 4) {
                U(4);
                i10 = this.f23465k;
            }
            byte[] bArr = this.f23462h;
            this.f23465k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long P() throws C1965v {
            int i10 = this.f23465k;
            if (this.f23463i - i10 < 8) {
                U(8);
                i10 = this.f23465k;
            }
            byte[] bArr = this.f23462h;
            this.f23465k = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        public int Q() {
            int i10;
            int i11 = this.f23465k;
            int i12 = this.f23463i;
            if (i12 != i11) {
                byte[] bArr = this.f23462h;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f23465k = i13;
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
                    this.f23465k = i14;
                    return i10;
                }
            }
            return (int) S();
        }

        public long R() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f23465k;
            int i11 = this.f23463i;
            if (i11 != i10) {
                byte[] bArr = this.f23462h;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f23465k = i12;
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
                    this.f23465k = i13;
                    return j10;
                }
            }
            return S();
        }

        long S() throws C1965v {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bK = K();
                j10 |= ((long) (bK & 127)) << i10;
                if ((bK & 128) == 0) {
                    return j10;
                }
            }
            throw C1965v.f();
        }

        public void W(int i10) throws C1965v {
            int i11 = this.f23463i;
            int i12 = this.f23465k;
            if (i10 > i11 - i12 || i10 < 0) {
                X(i10);
            } else {
                this.f23465k = i12 + i10;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public void a(int i10) throws C1965v {
            if (this.f23466l != i10) {
                throw C1965v.b();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public int e() {
            return this.f23467m + this.f23465k;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public boolean f() {
            return this.f23465k == this.f23463i && !b0(1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public void l(int i10) {
            this.f23468n = i10;
            T();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public int m(int i10) throws C1965v {
            if (i10 < 0) {
                throw C1965v.g();
            }
            int i11 = i10 + this.f23467m + this.f23465k;
            if (i11 < 0) {
                throw C1965v.h();
            }
            int i12 = this.f23468n;
            if (i11 > i12) {
                throw C1965v.m();
            }
            this.f23468n = i11;
            T();
            return i12;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public boolean n() {
            return R() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public AbstractC1950f o() throws C1965v {
            int iQ = Q();
            int i10 = this.f23463i;
            int i11 = this.f23465k;
            if (iQ <= i10 - i11 && iQ > 0) {
                AbstractC1950f abstractC1950fI = AbstractC1950f.i(this.f23462h, i11, iQ);
                this.f23465k += iQ;
                return abstractC1950fI;
            }
            if (iQ == 0) {
                return AbstractC1950f.f23435b;
            }
            if (iQ >= 0) {
                return J(iQ);
            }
            throw C1965v.g();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public double p() {
            return Double.longBitsToDouble(P());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public int q() {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public int r() {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public long s() {
            return P();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public float t() {
            return Float.intBitsToFloat(O());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public int u() {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public long v() {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public int w() {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public long x() {
            return P();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public int y() {
            return AbstractC1951g.c(Q());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1951g
        public long z() {
            return AbstractC1951g.d(R());
        }
    }

    private AbstractC1951g() {
        this.f23448b = f23446f;
        this.f23449c = Integer.MAX_VALUE;
        this.f23451e = false;
    }

    /* synthetic */ AbstractC1951g(a aVar) {
        this();
    }

    public static int c(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long d(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static AbstractC1951g g(InputStream inputStream) {
        return h(inputStream, 4096);
    }

    public static AbstractC1951g h(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? i(AbstractC1964u.f23653d) : new c(inputStream, i10, null);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static AbstractC1951g i(byte[] bArr) {
        return j(bArr, 0, bArr.length);
    }

    public static AbstractC1951g j(byte[] bArr, int i10, int i11) {
        return k(bArr, i10, i11, false);
    }

    static AbstractC1951g k(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10, null);
        try {
            bVar.m(i11);
            return bVar;
        } catch (C1965v e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract String A();

    public abstract String B();

    public abstract int C();

    public abstract int D();

    public abstract long E();

    public abstract boolean F(int i10);

    public void G() throws C1965v {
        boolean zF;
        do {
            int iC = C();
            if (iC == 0) {
                return;
            }
            b();
            this.f23447a++;
            zF = F(iC);
            this.f23447a--;
        } while (zF);
    }

    public abstract void a(int i10);

    public void b() throws C1965v {
        if (this.f23447a >= this.f23448b) {
            throw C1965v.i();
        }
    }

    public abstract int e();

    public abstract boolean f();

    public abstract void l(int i10);

    public abstract int m(int i10);

    public abstract boolean n();

    public abstract AbstractC1950f o();

    public abstract double p();

    public abstract int q();

    public abstract int r();

    public abstract long s();

    public abstract float t();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract long x();

    public abstract int y();

    public abstract long z();
}
