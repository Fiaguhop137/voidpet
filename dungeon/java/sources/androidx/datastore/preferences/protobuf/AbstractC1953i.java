package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1953i extends AbstractC1949e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f23476c = Logger.getLogger(AbstractC1953i.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f23477d = k0.B();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    C1954j f23478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23479b;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i$b */
    private static abstract class b extends AbstractC1953i {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final byte[] f23480e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f23481f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f23482g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f23483h;

        b(int i10) {
            super(null);
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.f23480e = bArr;
            this.f23481f = bArr.length;
        }

        final void R0(byte b10) {
            byte[] bArr = this.f23480e;
            int i10 = this.f23482g;
            this.f23482g = i10 + 1;
            bArr[i10] = b10;
            this.f23483h++;
        }

        final void S0(int i10) {
            byte[] bArr = this.f23480e;
            int i11 = this.f23482g;
            int i12 = i11 + 1;
            this.f23482g = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f23482g = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f23482g = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f23482g = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
            this.f23483h += 4;
        }

        final void T0(long j10) {
            byte[] bArr = this.f23480e;
            int i10 = this.f23482g;
            int i11 = i10 + 1;
            this.f23482g = i11;
            bArr[i10] = (byte) (j10 & 255);
            int i12 = i10 + 2;
            this.f23482g = i12;
            bArr[i11] = (byte) ((j10 >> 8) & 255);
            int i13 = i10 + 3;
            this.f23482g = i13;
            bArr[i12] = (byte) ((j10 >> 16) & 255);
            int i14 = i10 + 4;
            this.f23482g = i14;
            bArr[i13] = (byte) (255 & (j10 >> 24));
            int i15 = i10 + 5;
            this.f23482g = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f23482g = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f23482g = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f23482g = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            this.f23483h += 8;
        }

        final void U0(int i10) {
            if (i10 >= 0) {
                W0(i10);
            } else {
                X0(i10);
            }
        }

        final void V0(int i10, int i11) {
            W0(m0.c(i10, i11));
        }

        final void W0(int i10) {
            if (!AbstractC1953i.f23477d) {
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.f23480e;
                    int i11 = this.f23482g;
                    this.f23482g = i11 + 1;
                    bArr[i11] = (byte) ((i10 | 128) & 255);
                    this.f23483h++;
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f23480e;
                int i12 = this.f23482g;
                this.f23482g = i12 + 1;
                bArr2[i12] = (byte) i10;
                this.f23483h++;
                return;
            }
            long j10 = this.f23482g;
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.f23480e;
                int i13 = this.f23482g;
                this.f23482g = i13 + 1;
                k0.H(bArr3, i13, (byte) ((i10 | 128) & 255));
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f23480e;
            int i14 = this.f23482g;
            this.f23482g = i14 + 1;
            k0.H(bArr4, i14, (byte) i10);
            this.f23483h += (int) (((long) this.f23482g) - j10);
        }

        final void X0(long j10) {
            if (!AbstractC1953i.f23477d) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f23480e;
                    int i10 = this.f23482g;
                    this.f23482g = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) | 128) & 255);
                    this.f23483h++;
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f23480e;
                int i11 = this.f23482g;
                this.f23482g = i11 + 1;
                bArr2[i11] = (byte) j10;
                this.f23483h++;
                return;
            }
            long j11 = this.f23482g;
            while ((j10 & (-128)) != 0) {
                byte[] bArr3 = this.f23480e;
                int i12 = this.f23482g;
                this.f23482g = i12 + 1;
                k0.H(bArr3, i12, (byte) ((((int) j10) | 128) & 255));
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f23480e;
            int i13 = this.f23482g;
            this.f23482g = i13 + 1;
            k0.H(bArr4, i13, (byte) j10);
            this.f23483h += (int) (((long) this.f23482g) - j11);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i$c */
    public static class c extends IOException {
        c(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i$d */
    private static final class d extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final OutputStream f23484i;

        d(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f23484i = outputStream;
        }

        private void Y0() throws IOException {
            this.f23484i.write(this.f23480e, 0, this.f23482g);
            this.f23482g = 0;
        }

        private void Z0(int i10) throws IOException {
            if (this.f23481f - this.f23482g < i10) {
                Y0();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1953i
        public void A0(int i10, K k10) throws IOException {
            M0(1, 3);
            N0(2, i10);
            b1(3, k10);
            M0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1953i
        public void B0(int i10, AbstractC1950f abstractC1950f) throws IOException {
            M0(1, 3);
            N0(2, i10);
            e0(3, abstractC1950f);
            M0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1953i
        public void K0(int i10, String str) throws IOException {
            M0(i10, 2);
            L0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1953i
        public void L0(String str) throws IOException {
            int iC;
            try {
                int length = str.length() * 3;
                int iQ = AbstractC1953i.Q(length);
                int i10 = iQ + length;
                int i11 = this.f23481f;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int iB = l0.b(str, bArr, 0, length);
                    O0(iB);
                    a(bArr, 0, iB);
                    return;
                }
                if (i10 > i11 - this.f23482g) {
                    Y0();
                }
                int iQ2 = AbstractC1953i.Q(str.length());
                int i12 = this.f23482g;
                try {
                    if (iQ2 == iQ) {
                        int i13 = i12 + iQ2;
                        this.f23482g = i13;
                        int iB2 = l0.b(str, this.f23480e, i13, this.f23481f - i13);
                        this.f23482g = i12;
                        iC = (iB2 - i12) - iQ2;
                        W0(iC);
                        this.f23482g = iB2;
                    } else {
                        iC = l0.c(str);
                        W0(iC);
                        this.f23482g = l0.b(str, this.f23480e, this.f23482g, iC);
                    }
                    this.f23483h += iC;
                } catch (l0.d e10) {
                    this.f23483h -= this.f23482g - i12;
                    this.f23482g = i12;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new c(e11);
                }
            } catch (l0.d e12) {
                W(str, e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1953i
        public void M0(int i10, int i11) throws IOException {
            O0(m0.c(i10, i11));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1953i
        public void N0(int i10, int i11) throws IOException {
            Z0(20);
            V0(i10, 0);
            W0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1953i
        public void O0(int i10) throws IOException {
            Z0(5);
            W0(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1953i
        public void P0(int i10, long j10) throws IOException {
            Z0(20);
            V0(i10, 0);
            X0(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1953i
        public void Q0(long j10) throws IOException {
            Z0(10);
            X0(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1953i
        public void V() throws IOException {
            if (this.f23482g > 0) {
                Y0();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1953i
        public void Z(byte b10) throws IOException {
            if (this.f23482g == this.f23481f) {
                Y0();
            }
            R0(b10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1953i, androidx.datastore.preferences.protobuf.AbstractC1949e
        public void a(byte[] bArr, int i10, int i11) throws IOException {
            a1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1953i
        public void a0(int i10, boolean z10) throws IOException {
            Z0(11);
            V0(i10, 0);
            R0(z10 ? (byte) 1 : (byte) 0);
        }

        public void a1(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f23481f;
            int i13 = this.f23482g;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.f23480e, i13, i11);
                this.f23482g += i11;
                this.f23483h += i11;
                return;
            }
            int i14 = i12 - i13;
            System.arraycopy(bArr, i10, this.f23480e, i13, i14);
            int i15 = i10 + i14;
            int i16 = i11 - i14;
            this.f23482g = this.f23481f;
            this.f23483h += i14;
            Y0();
            if (i16 <= this.f23481f) {
                System.arraycopy(bArr, i15, this.f23480e, 0, i16);
                this.f23482g = i16;
            } else {
                this.f23484i.write(bArr, i15, i16);
            }
            this.f23483h += i16;
        }

        public void b1(int i10, K k10) throws IOException {
            M0(i10, 2);
            z0(k10);
        }

        void c1(K k10, a0 a0Var) throws IOException {
            O0(((AbstractC1945a) k10).c(a0Var));
            a0Var.i(k10, this.f23478a);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1953i
        public void d0(byte[] bArr, int i10, int i11) throws IOException {
            O0(i11);
            a1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1953i
        public void e0(int i10, AbstractC1950f abstractC1950f) throws IOException {
            M0(i10, 2);
            f0(abstractC1950f);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1953i
        public void f0(AbstractC1950f abstractC1950f) throws IOException {
            O0(abstractC1950f.size());
            abstractC1950f.y(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1953i
        public void k0(int i10, int i11) throws IOException {
            Z0(14);
            V0(i10, 5);
            S0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1953i
        public void l0(int i10) throws IOException {
            Z0(4);
            S0(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1953i
        public void m0(int i10, long j10) throws IOException {
            Z0(18);
            V0(i10, 1);
            T0(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1953i
        public void n0(long j10) throws IOException {
            Z0(8);
            T0(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1953i
        public void u0(int i10, int i11) throws IOException {
            Z0(20);
            V0(i10, 0);
            U0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1953i
        public void v0(int i10) throws IOException {
            if (i10 >= 0) {
                O0(i10);
            } else {
                Q0(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1953i
        void y0(int i10, K k10, a0 a0Var) throws IOException {
            M0(i10, 2);
            c1(k10, a0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1953i
        public void z0(K k10) throws IOException {
            O0(k10.getSerializedSize());
            k10.b(this);
        }
    }

    private AbstractC1953i() {
    }

    /* synthetic */ AbstractC1953i(a aVar) {
        this();
    }

    public static int A(K k10) {
        return y(k10.getSerializedSize());
    }

    static int B(K k10, a0 a0Var) {
        return y(((AbstractC1945a) k10).c(a0Var));
    }

    static int C(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int D(int i10, AbstractC1950f abstractC1950f) {
        return (O(1) * 2) + P(2, i10) + f(3, abstractC1950f);
    }

    public static int E(int i10, int i11) {
        return O(i10) + F(i11);
    }

    public static int F(int i10) {
        return 4;
    }

    public static int G(int i10, long j10) {
        return O(i10) + H(j10);
    }

    public static int H(long j10) {
        return 8;
    }

    public static int I(int i10, int i11) {
        return O(i10) + J(i11);
    }

    public static int J(int i10) {
        return Q(T(i10));
    }

    public static int K(int i10, long j10) {
        return O(i10) + L(j10);
    }

    public static int L(long j10) {
        return S(U(j10));
    }

    public static int M(int i10, String str) {
        return O(i10) + N(str);
    }

    public static int N(String str) {
        int length;
        try {
            length = l0.c(str);
        } catch (l0.d unused) {
            length = str.getBytes(AbstractC1964u.f23651b).length;
        }
        return y(length);
    }

    public static int O(int i10) {
        return Q(m0.c(i10, 0));
    }

    public static int P(int i10, int i11) {
        return O(i10) + Q(i11);
    }

    public static int Q(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int R(int i10, long j10) {
        return O(i10) + S(j10);
    }

    public static int S(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int T(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long U(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static AbstractC1953i Y(OutputStream outputStream, int i10) {
        return new d(outputStream, i10);
    }

    public static int c(int i10, boolean z10) {
        return O(i10) + d(z10);
    }

    public static int d(boolean z10) {
        return 1;
    }

    public static int e(byte[] bArr) {
        return y(bArr.length);
    }

    public static int f(int i10, AbstractC1950f abstractC1950f) {
        return O(i10) + g(abstractC1950f);
    }

    public static int g(AbstractC1950f abstractC1950f) {
        return y(abstractC1950f.size());
    }

    public static int h(int i10, double d10) {
        return O(i10) + i(d10);
    }

    public static int i(double d10) {
        return 8;
    }

    public static int j(int i10, int i11) {
        return O(i10) + k(i11);
    }

    public static int k(int i10) {
        return v(i10);
    }

    public static int l(int i10, int i11) {
        return O(i10) + m(i11);
    }

    public static int m(int i10) {
        return 4;
    }

    public static int n(int i10, long j10) {
        return O(i10) + o(j10);
    }

    public static int o(long j10) {
        return 8;
    }

    public static int p(int i10, float f10) {
        return O(i10) + q(f10);
    }

    public static int q(float f10) {
        return 4;
    }

    static int r(int i10, K k10, a0 a0Var) {
        return (O(i10) * 2) + t(k10, a0Var);
    }

    public static int s(K k10) {
        return k10.getSerializedSize();
    }

    static int t(K k10, a0 a0Var) {
        return ((AbstractC1945a) k10).c(a0Var);
    }

    public static int u(int i10, int i11) {
        return O(i10) + v(i11);
    }

    public static int v(int i10) {
        return S(i10);
    }

    public static int w(int i10, long j10) {
        return O(i10) + x(j10);
    }

    public static int x(long j10) {
        return S(j10);
    }

    static int y(int i10) {
        return Q(i10) + i10;
    }

    static int z(int i10, K k10, a0 a0Var) {
        return O(i10) + B(k10, a0Var);
    }

    public abstract void A0(int i10, K k10);

    public abstract void B0(int i10, AbstractC1950f abstractC1950f);

    public final void C0(int i10, int i11) {
        k0(i10, i11);
    }

    public final void D0(int i10) {
        l0(i10);
    }

    public final void E0(int i10, long j10) {
        m0(i10, j10);
    }

    public final void F0(long j10) {
        n0(j10);
    }

    public final void G0(int i10, int i11) {
        N0(i10, T(i11));
    }

    public final void H0(int i10) {
        O0(T(i10));
    }

    public final void I0(int i10, long j10) {
        P0(i10, U(j10));
    }

    public final void J0(long j10) {
        Q0(U(j10));
    }

    public abstract void K0(int i10, String str);

    public abstract void L0(String str);

    public abstract void M0(int i10, int i11);

    public abstract void N0(int i10, int i11);

    public abstract void O0(int i10);

    public abstract void P0(int i10, long j10);

    public abstract void Q0(long j10);

    public abstract void V();

    final void W(String str, l0.d dVar) throws c {
        f23476c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(AbstractC1964u.f23651b);
        try {
            O0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new c(e10);
        }
    }

    boolean X() {
        return this.f23479b;
    }

    public abstract void Z(byte b10);

    @Override // androidx.datastore.preferences.protobuf.AbstractC1949e
    public abstract void a(byte[] bArr, int i10, int i11);

    public abstract void a0(int i10, boolean z10);

    public final void b0(boolean z10) {
        Z(z10 ? (byte) 1 : (byte) 0);
    }

    public final void c0(byte[] bArr) {
        d0(bArr, 0, bArr.length);
    }

    abstract void d0(byte[] bArr, int i10, int i11);

    public abstract void e0(int i10, AbstractC1950f abstractC1950f);

    public abstract void f0(AbstractC1950f abstractC1950f);

    public final void g0(int i10, double d10) {
        m0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void h0(double d10) {
        n0(Double.doubleToRawLongBits(d10));
    }

    public final void i0(int i10, int i11) {
        u0(i10, i11);
    }

    public final void j0(int i10) {
        v0(i10);
    }

    public abstract void k0(int i10, int i11);

    public abstract void l0(int i10);

    public abstract void m0(int i10, long j10);

    public abstract void n0(long j10);

    public final void o0(int i10, float f10) {
        k0(i10, Float.floatToRawIntBits(f10));
    }

    public final void p0(float f10) {
        l0(Float.floatToRawIntBits(f10));
    }

    public final void q0(int i10, K k10) {
        M0(i10, 3);
        s0(k10);
        M0(i10, 4);
    }

    final void r0(int i10, K k10, a0 a0Var) {
        M0(i10, 3);
        t0(k10, a0Var);
        M0(i10, 4);
    }

    public final void s0(K k10) {
        k10.b(this);
    }

    final void t0(K k10, a0 a0Var) {
        a0Var.i(k10, this.f23478a);
    }

    public abstract void u0(int i10, int i11);

    public abstract void v0(int i10);

    public final void w0(int i10, long j10) {
        P0(i10, j10);
    }

    public final void x0(long j10) {
        Q0(j10);
    }

    abstract void y0(int i10, K k10, a0 a0Var);

    public abstract void z0(K k10);
}
