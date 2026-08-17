package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.protobuf.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3145k extends AbstractC3141g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f37965c = Logger.getLogger(AbstractC3145k.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f37966d = z0.I();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    C3146l f37967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f37968b;

    /* JADX INFO: renamed from: com.google.protobuf.k$b */
    private static abstract class b extends AbstractC3145k {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final byte[] f37969e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f37970f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f37971g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f37972h;

        b(int i10) {
            super(null);
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.f37969e = bArr;
            this.f37970f = bArr.length;
        }

        final void Y0(byte b10) {
            byte[] bArr = this.f37969e;
            int i10 = this.f37971g;
            this.f37971g = i10 + 1;
            bArr[i10] = b10;
            this.f37972h++;
        }

        final void Z0(int i10) {
            byte[] bArr = this.f37969e;
            int i11 = this.f37971g;
            int i12 = i11 + 1;
            this.f37971g = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f37971g = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f37971g = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f37971g = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
            this.f37972h += 4;
        }

        final void a1(long j10) {
            byte[] bArr = this.f37969e;
            int i10 = this.f37971g;
            int i11 = i10 + 1;
            this.f37971g = i11;
            bArr[i10] = (byte) (j10 & 255);
            int i12 = i10 + 2;
            this.f37971g = i12;
            bArr[i11] = (byte) ((j10 >> 8) & 255);
            int i13 = i10 + 3;
            this.f37971g = i13;
            bArr[i12] = (byte) ((j10 >> 16) & 255);
            int i14 = i10 + 4;
            this.f37971g = i14;
            bArr[i13] = (byte) (255 & (j10 >> 24));
            int i15 = i10 + 5;
            this.f37971g = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f37971g = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f37971g = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f37971g = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            this.f37972h += 8;
        }

        final void b1(int i10) {
            if (i10 >= 0) {
                d1(i10);
            } else {
                e1(i10);
            }
        }

        final void c1(int i10, int i11) {
            d1(C0.c(i10, i11));
        }

        final void d1(int i10) {
            if (!AbstractC3145k.f37966d) {
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.f37969e;
                    int i11 = this.f37971g;
                    this.f37971g = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | 128);
                    this.f37972h++;
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f37969e;
                int i12 = this.f37971g;
                this.f37971g = i12 + 1;
                bArr2[i12] = (byte) i10;
                this.f37972h++;
                return;
            }
            long j10 = this.f37971g;
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.f37969e;
                int i13 = this.f37971g;
                this.f37971g = i13 + 1;
                z0.O(bArr3, i13, (byte) ((i10 & 127) | 128));
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f37969e;
            int i14 = this.f37971g;
            this.f37971g = i14 + 1;
            z0.O(bArr4, i14, (byte) i10);
            this.f37972h += (int) (((long) this.f37971g) - j10);
        }

        final void e1(long j10) {
            if (!AbstractC3145k.f37966d) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f37969e;
                    int i10 = this.f37971g;
                    this.f37971g = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                    this.f37972h++;
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f37969e;
                int i11 = this.f37971g;
                this.f37971g = i11 + 1;
                bArr2[i11] = (byte) j10;
                this.f37972h++;
                return;
            }
            long j11 = this.f37971g;
            while ((j10 & (-128)) != 0) {
                byte[] bArr3 = this.f37969e;
                int i12 = this.f37971g;
                this.f37971g = i12 + 1;
                z0.O(bArr3, i12, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f37969e;
            int i13 = this.f37971g;
            this.f37971g = i13 + 1;
            z0.O(bArr4, i13, (byte) j10);
            this.f37972h += (int) (((long) this.f37971g) - j11);
        }

        @Override // com.google.protobuf.AbstractC3145k
        public final int f0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.k$c */
    private static class c extends AbstractC3145k {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final byte[] f37973e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f37974f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f37975g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f37976h;

        c(byte[] bArr, int i10, int i11) {
            super(null);
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.f37973e = bArr;
            this.f37974f = i10;
            this.f37976h = i10;
            this.f37975g = i12;
        }

        @Override // com.google.protobuf.AbstractC3145k
        public final void B0(int i10, int i11) throws d {
            T0(i10, 0);
            C0(i11);
        }

        @Override // com.google.protobuf.AbstractC3145k
        public final void C0(int i10) throws d {
            if (i10 >= 0) {
                V0(i10);
            } else {
                X0(i10);
            }
        }

        @Override // com.google.protobuf.AbstractC3145k
        final void F0(int i10, T t10, n0 n0Var) throws d {
            T0(i10, 2);
            V0(((AbstractC3131a) t10).getSerializedSize(n0Var));
            n0Var.h(t10, this.f37967a);
        }

        @Override // com.google.protobuf.AbstractC3145k
        public final void G0(T t10) throws d {
            V0(t10.getSerializedSize());
            t10.writeTo(this);
        }

        @Override // com.google.protobuf.AbstractC3145k
        public final void H0(int i10, T t10) throws d {
            T0(1, 3);
            U0(2, i10);
            a1(3, t10);
            T0(1, 4);
        }

        @Override // com.google.protobuf.AbstractC3145k
        public final void I0(int i10, AbstractC3142h abstractC3142h) throws d {
            T0(1, 3);
            U0(2, i10);
            l0(3, abstractC3142h);
            T0(1, 4);
        }

        @Override // com.google.protobuf.AbstractC3145k
        public final void R0(int i10, String str) throws d {
            T0(i10, 2);
            S0(str);
        }

        @Override // com.google.protobuf.AbstractC3145k
        public final void S0(String str) throws d {
            int i10 = this.f37976h;
            try {
                int iU = AbstractC3145k.U(str.length() * 3);
                int iU2 = AbstractC3145k.U(str.length());
                if (iU2 != iU) {
                    V0(A0.j(str));
                    this.f37976h = A0.i(str, this.f37973e, this.f37976h, f0());
                    return;
                }
                int i11 = i10 + iU2;
                this.f37976h = i11;
                int i12 = A0.i(str, this.f37973e, i11, f0());
                this.f37976h = i10;
                V0((i12 - i10) - iU2);
                this.f37976h = i12;
            } catch (A0.d e10) {
                this.f37976h = i10;
                a0(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new d(e11);
            }
        }

        @Override // com.google.protobuf.AbstractC3145k
        public final void T0(int i10, int i11) throws d {
            V0(C0.c(i10, i11));
        }

        @Override // com.google.protobuf.AbstractC3145k
        public final void U0(int i10, int i11) throws d {
            T0(i10, 0);
            V0(i11);
        }

        @Override // com.google.protobuf.AbstractC3145k
        public final void V0(int i10) throws d {
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f37973e;
                    int i11 = this.f37976h;
                    this.f37976h = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37976h), Integer.valueOf(this.f37975g), 1), e10);
                }
            }
            byte[] bArr2 = this.f37973e;
            int i12 = this.f37976h;
            this.f37976h = i12 + 1;
            bArr2[i12] = (byte) i10;
        }

        @Override // com.google.protobuf.AbstractC3145k
        public final void W0(int i10, long j10) throws d {
            T0(i10, 0);
            X0(j10);
        }

        @Override // com.google.protobuf.AbstractC3145k
        public final void X0(long j10) throws d {
            if (AbstractC3145k.f37966d && f0() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f37973e;
                    int i10 = this.f37976h;
                    this.f37976h = i10 + 1;
                    z0.O(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f37973e;
                int i11 = this.f37976h;
                this.f37976h = i11 + 1;
                z0.O(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f37973e;
                    int i12 = this.f37976h;
                    this.f37976h = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37976h), Integer.valueOf(this.f37975g), 1), e10);
                }
            }
            byte[] bArr4 = this.f37973e;
            int i13 = this.f37976h;
            this.f37976h = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        public final void Y0(ByteBuffer byteBuffer) throws d {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f37973e, this.f37976h, iRemaining);
                this.f37976h += iRemaining;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37976h), Integer.valueOf(this.f37975g), Integer.valueOf(iRemaining)), e10);
            }
        }

        @Override // com.google.protobuf.AbstractC3145k
        public void Z() {
        }

        public final void Z0(byte[] bArr, int i10, int i11) throws d {
            try {
                System.arraycopy(bArr, i10, this.f37973e, this.f37976h, i11);
                this.f37976h += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37976h), Integer.valueOf(this.f37975g), Integer.valueOf(i11)), e10);
            }
        }

        @Override // com.google.protobuf.AbstractC3141g
        public final void a(ByteBuffer byteBuffer) throws d {
            Y0(byteBuffer);
        }

        public final void a1(int i10, T t10) throws d {
            T0(i10, 2);
            G0(t10);
        }

        @Override // com.google.protobuf.AbstractC3145k, com.google.protobuf.AbstractC3141g
        public final void b(byte[] bArr, int i10, int i11) throws d {
            Z0(bArr, i10, i11);
        }

        @Override // com.google.protobuf.AbstractC3145k
        public final int f0() {
            return this.f37975g - this.f37976h;
        }

        @Override // com.google.protobuf.AbstractC3145k
        public final void g0(byte b10) throws d {
            try {
                byte[] bArr = this.f37973e;
                int i10 = this.f37976h;
                this.f37976h = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37976h), Integer.valueOf(this.f37975g), 1), e10);
            }
        }

        @Override // com.google.protobuf.AbstractC3145k
        public final void h0(int i10, boolean z10) throws d {
            T0(i10, 0);
            g0(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.AbstractC3145k
        public final void k0(byte[] bArr, int i10, int i11) throws d {
            V0(i11);
            Z0(bArr, i10, i11);
        }

        @Override // com.google.protobuf.AbstractC3145k
        public final void l0(int i10, AbstractC3142h abstractC3142h) throws d {
            T0(i10, 2);
            m0(abstractC3142h);
        }

        @Override // com.google.protobuf.AbstractC3145k
        public final void m0(AbstractC3142h abstractC3142h) throws d {
            V0(abstractC3142h.size());
            abstractC3142h.H(this);
        }

        @Override // com.google.protobuf.AbstractC3145k
        public final void r0(int i10, int i11) throws d {
            T0(i10, 5);
            s0(i11);
        }

        @Override // com.google.protobuf.AbstractC3145k
        public final void s0(int i10) throws d {
            try {
                byte[] bArr = this.f37973e;
                int i11 = this.f37976h;
                int i12 = i11 + 1;
                this.f37976h = i12;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i11 + 2;
                this.f37976h = i13;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i11 + 3;
                this.f37976h = i14;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f37976h = i11 + 4;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37976h), Integer.valueOf(this.f37975g), 1), e10);
            }
        }

        @Override // com.google.protobuf.AbstractC3145k
        public final void t0(int i10, long j10) throws d {
            T0(i10, 1);
            u0(j10);
        }

        @Override // com.google.protobuf.AbstractC3145k
        public final void u0(long j10) throws d {
            try {
                byte[] bArr = this.f37973e;
                int i10 = this.f37976h;
                int i11 = i10 + 1;
                this.f37976h = i11;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i10 + 2;
                this.f37976h = i12;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i10 + 3;
                this.f37976h = i13;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i10 + 4;
                this.f37976h = i14;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i10 + 5;
                this.f37976h = i15;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i10 + 6;
                this.f37976h = i16;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i10 + 7;
                this.f37976h = i17;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f37976h = i10 + 8;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37976h), Integer.valueOf(this.f37975g), 1), e10);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.k$d */
    public static class d extends IOException {
        d(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }

        d(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.k$e */
    private static final class e extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final OutputStream f37977i;

        e(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f37977i = outputStream;
        }

        private void f1() throws IOException {
            this.f37977i.write(this.f37969e, 0, this.f37971g);
            this.f37971g = 0;
        }

        private void g1(int i10) throws IOException {
            if (this.f37970f - this.f37971g < i10) {
                f1();
            }
        }

        @Override // com.google.protobuf.AbstractC3145k
        public void B0(int i10, int i11) throws IOException {
            g1(20);
            c1(i10, 0);
            b1(i11);
        }

        @Override // com.google.protobuf.AbstractC3145k
        public void C0(int i10) throws IOException {
            if (i10 >= 0) {
                V0(i10);
            } else {
                X0(i10);
            }
        }

        @Override // com.google.protobuf.AbstractC3145k
        void F0(int i10, T t10, n0 n0Var) throws IOException {
            T0(i10, 2);
            k1(t10, n0Var);
        }

        @Override // com.google.protobuf.AbstractC3145k
        public void G0(T t10) throws IOException {
            V0(t10.getSerializedSize());
            t10.writeTo(this);
        }

        @Override // com.google.protobuf.AbstractC3145k
        public void H0(int i10, T t10) throws IOException {
            T0(1, 3);
            U0(2, i10);
            j1(3, t10);
            T0(1, 4);
        }

        @Override // com.google.protobuf.AbstractC3145k
        public void I0(int i10, AbstractC3142h abstractC3142h) throws IOException {
            T0(1, 3);
            U0(2, i10);
            l0(3, abstractC3142h);
            T0(1, 4);
        }

        @Override // com.google.protobuf.AbstractC3145k
        public void R0(int i10, String str) throws IOException {
            T0(i10, 2);
            S0(str);
        }

        @Override // com.google.protobuf.AbstractC3145k
        public void S0(String str) throws IOException {
            int iJ;
            try {
                int length = str.length() * 3;
                int iU = AbstractC3145k.U(length);
                int i10 = iU + length;
                int i11 = this.f37970f;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int i12 = A0.i(str, bArr, 0, length);
                    V0(i12);
                    b(bArr, 0, i12);
                    return;
                }
                if (i10 > i11 - this.f37971g) {
                    f1();
                }
                int iU2 = AbstractC3145k.U(str.length());
                int i13 = this.f37971g;
                try {
                    if (iU2 == iU) {
                        int i14 = i13 + iU2;
                        this.f37971g = i14;
                        int i15 = A0.i(str, this.f37969e, i14, this.f37970f - i14);
                        this.f37971g = i13;
                        iJ = (i15 - i13) - iU2;
                        d1(iJ);
                        this.f37971g = i15;
                    } else {
                        iJ = A0.j(str);
                        d1(iJ);
                        this.f37971g = A0.i(str, this.f37969e, this.f37971g, iJ);
                    }
                    this.f37972h += iJ;
                } catch (A0.d e10) {
                    this.f37972h -= this.f37971g - i13;
                    this.f37971g = i13;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new d(e11);
                }
            } catch (A0.d e12) {
                a0(str, e12);
            }
        }

        @Override // com.google.protobuf.AbstractC3145k
        public void T0(int i10, int i11) throws IOException {
            V0(C0.c(i10, i11));
        }

        @Override // com.google.protobuf.AbstractC3145k
        public void U0(int i10, int i11) throws IOException {
            g1(20);
            c1(i10, 0);
            d1(i11);
        }

        @Override // com.google.protobuf.AbstractC3145k
        public void V0(int i10) throws IOException {
            g1(5);
            d1(i10);
        }

        @Override // com.google.protobuf.AbstractC3145k
        public void W0(int i10, long j10) throws IOException {
            g1(20);
            c1(i10, 0);
            e1(j10);
        }

        @Override // com.google.protobuf.AbstractC3145k
        public void X0(long j10) throws IOException {
            g1(10);
            e1(j10);
        }

        @Override // com.google.protobuf.AbstractC3145k
        public void Z() throws IOException {
            if (this.f37971g > 0) {
                f1();
            }
        }

        @Override // com.google.protobuf.AbstractC3141g
        public void a(ByteBuffer byteBuffer) throws IOException {
            h1(byteBuffer);
        }

        @Override // com.google.protobuf.AbstractC3145k, com.google.protobuf.AbstractC3141g
        public void b(byte[] bArr, int i10, int i11) throws IOException {
            i1(bArr, i10, i11);
        }

        @Override // com.google.protobuf.AbstractC3145k
        public void g0(byte b10) throws IOException {
            if (this.f37971g == this.f37970f) {
                f1();
            }
            Y0(b10);
        }

        @Override // com.google.protobuf.AbstractC3145k
        public void h0(int i10, boolean z10) throws IOException {
            g1(11);
            c1(i10, 0);
            Y0(z10 ? (byte) 1 : (byte) 0);
        }

        public void h1(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i10 = this.f37970f;
            int i11 = this.f37971g;
            if (i10 - i11 >= iRemaining) {
                byteBuffer.get(this.f37969e, i11, iRemaining);
                this.f37971g += iRemaining;
                this.f37972h += iRemaining;
                return;
            }
            int i12 = i10 - i11;
            byteBuffer.get(this.f37969e, i11, i12);
            int i13 = iRemaining - i12;
            this.f37971g = this.f37970f;
            this.f37972h += i12;
            f1();
            while (true) {
                int i14 = this.f37970f;
                if (i13 <= i14) {
                    byteBuffer.get(this.f37969e, 0, i13);
                    this.f37971g = i13;
                    this.f37972h += i13;
                    return;
                } else {
                    byteBuffer.get(this.f37969e, 0, i14);
                    this.f37977i.write(this.f37969e, 0, this.f37970f);
                    int i15 = this.f37970f;
                    i13 -= i15;
                    this.f37972h += i15;
                }
            }
        }

        public void i1(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f37970f;
            int i13 = this.f37971g;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.f37969e, i13, i11);
                this.f37971g += i11;
                this.f37972h += i11;
                return;
            }
            int i14 = i12 - i13;
            System.arraycopy(bArr, i10, this.f37969e, i13, i14);
            int i15 = i10 + i14;
            int i16 = i11 - i14;
            this.f37971g = this.f37970f;
            this.f37972h += i14;
            f1();
            if (i16 <= this.f37970f) {
                System.arraycopy(bArr, i15, this.f37969e, 0, i16);
                this.f37971g = i16;
            } else {
                this.f37977i.write(bArr, i15, i16);
            }
            this.f37972h += i16;
        }

        public void j1(int i10, T t10) throws IOException {
            T0(i10, 2);
            G0(t10);
        }

        @Override // com.google.protobuf.AbstractC3145k
        public void k0(byte[] bArr, int i10, int i11) throws IOException {
            V0(i11);
            i1(bArr, i10, i11);
        }

        void k1(T t10, n0 n0Var) throws IOException {
            V0(((AbstractC3131a) t10).getSerializedSize(n0Var));
            n0Var.h(t10, this.f37967a);
        }

        @Override // com.google.protobuf.AbstractC3145k
        public void l0(int i10, AbstractC3142h abstractC3142h) throws IOException {
            T0(i10, 2);
            m0(abstractC3142h);
        }

        @Override // com.google.protobuf.AbstractC3145k
        public void m0(AbstractC3142h abstractC3142h) throws IOException {
            V0(abstractC3142h.size());
            abstractC3142h.H(this);
        }

        @Override // com.google.protobuf.AbstractC3145k
        public void r0(int i10, int i11) throws IOException {
            g1(14);
            c1(i10, 5);
            Z0(i11);
        }

        @Override // com.google.protobuf.AbstractC3145k
        public void s0(int i10) throws IOException {
            g1(4);
            Z0(i10);
        }

        @Override // com.google.protobuf.AbstractC3145k
        public void t0(int i10, long j10) throws IOException {
            g1(18);
            c1(i10, 1);
            a1(j10);
        }

        @Override // com.google.protobuf.AbstractC3145k
        public void u0(long j10) throws IOException {
            g1(8);
            a1(j10);
        }
    }

    private AbstractC3145k() {
    }

    /* synthetic */ AbstractC3145k(a aVar) {
        this();
    }

    static int A(int i10) {
        return U(i10) + i10;
    }

    public static int B(int i10, T t10) {
        return (S(1) * 2) + T(2, i10) + C(3, t10);
    }

    public static int C(int i10, T t10) {
        return S(i10) + E(t10);
    }

    static int D(int i10, T t10, n0 n0Var) {
        return S(i10) + F(t10, n0Var);
    }

    public static int E(T t10) {
        return A(t10.getSerializedSize());
    }

    static int F(T t10, n0 n0Var) {
        return A(((AbstractC3131a) t10).getSerializedSize(n0Var));
    }

    static int G(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int H(int i10, AbstractC3142h abstractC3142h) {
        return (S(1) * 2) + T(2, i10) + h(3, abstractC3142h);
    }

    public static int I(int i10, int i11) {
        return S(i10) + J(i11);
    }

    public static int J(int i10) {
        return 4;
    }

    public static int K(int i10, long j10) {
        return S(i10) + L(j10);
    }

    public static int L(long j10) {
        return 8;
    }

    public static int M(int i10, int i11) {
        return S(i10) + N(i11);
    }

    public static int N(int i10) {
        return U(X(i10));
    }

    public static int O(int i10, long j10) {
        return S(i10) + P(j10);
    }

    public static int P(long j10) {
        return W(Y(j10));
    }

    public static int Q(int i10, String str) {
        return S(i10) + R(str);
    }

    public static int R(String str) {
        int length;
        try {
            length = A0.j(str);
        } catch (A0.d unused) {
            length = str.getBytes(A.f37676b).length;
        }
        return A(length);
    }

    public static int S(int i10) {
        return U(C0.c(i10, 0));
    }

    public static int T(int i10, int i11) {
        return S(i10) + U(i11);
    }

    public static int U(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int V(int i10, long j10) {
        return S(i10) + W(j10);
    }

    public static int W(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static int X(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long Y(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static AbstractC3145k c0(OutputStream outputStream, int i10) {
        return new e(outputStream, i10);
    }

    public static AbstractC3145k d0(byte[] bArr) {
        return e0(bArr, 0, bArr.length);
    }

    public static int e(int i10, boolean z10) {
        return S(i10) + f(z10);
    }

    public static AbstractC3145k e0(byte[] bArr, int i10, int i11) {
        return new c(bArr, i10, i11);
    }

    public static int f(boolean z10) {
        return 1;
    }

    public static int g(byte[] bArr) {
        return A(bArr.length);
    }

    public static int h(int i10, AbstractC3142h abstractC3142h) {
        return S(i10) + i(abstractC3142h);
    }

    public static int i(AbstractC3142h abstractC3142h) {
        return A(abstractC3142h.size());
    }

    public static int j(int i10, double d10) {
        return S(i10) + k(d10);
    }

    public static int k(double d10) {
        return 8;
    }

    public static int l(int i10, int i11) {
        return S(i10) + m(i11);
    }

    public static int m(int i10) {
        return x(i10);
    }

    public static int n(int i10, int i11) {
        return S(i10) + o(i11);
    }

    public static int o(int i10) {
        return 4;
    }

    public static int p(int i10, long j10) {
        return S(i10) + q(j10);
    }

    public static int q(long j10) {
        return 8;
    }

    public static int r(int i10, float f10) {
        return S(i10) + s(f10);
    }

    public static int s(float f10) {
        return 4;
    }

    static int t(int i10, T t10, n0 n0Var) {
        return (S(i10) * 2) + v(t10, n0Var);
    }

    public static int u(T t10) {
        return t10.getSerializedSize();
    }

    static int v(T t10, n0 n0Var) {
        return ((AbstractC3131a) t10).getSerializedSize(n0Var);
    }

    public static int w(int i10, int i11) {
        return S(i10) + x(i11);
    }

    public static int x(int i10) {
        if (i10 >= 0) {
            return U(i10);
        }
        return 10;
    }

    public static int y(int i10, long j10) {
        return S(i10) + z(j10);
    }

    public static int z(long j10) {
        return W(j10);
    }

    final void A0(T t10, n0 n0Var) {
        n0Var.h(t10, this.f37967a);
    }

    public abstract void B0(int i10, int i11);

    public abstract void C0(int i10);

    public final void D0(int i10, long j10) {
        W0(i10, j10);
    }

    public final void E0(long j10) {
        X0(j10);
    }

    abstract void F0(int i10, T t10, n0 n0Var);

    public abstract void G0(T t10);

    public abstract void H0(int i10, T t10);

    public abstract void I0(int i10, AbstractC3142h abstractC3142h);

    public final void J0(int i10, int i11) {
        r0(i10, i11);
    }

    public final void K0(int i10) {
        s0(i10);
    }

    public final void L0(int i10, long j10) {
        t0(i10, j10);
    }

    public final void M0(long j10) {
        u0(j10);
    }

    public final void N0(int i10, int i11) {
        U0(i10, X(i11));
    }

    public final void O0(int i10) {
        V0(X(i10));
    }

    public final void P0(int i10, long j10) {
        W0(i10, Y(j10));
    }

    public final void Q0(long j10) {
        X0(Y(j10));
    }

    public abstract void R0(int i10, String str);

    public abstract void S0(String str);

    public abstract void T0(int i10, int i11);

    public abstract void U0(int i10, int i11);

    public abstract void V0(int i10);

    public abstract void W0(int i10, long j10);

    public abstract void X0(long j10);

    public abstract void Z();

    final void a0(String str, A0.d dVar) throws d {
        f37965c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(A.f37676b);
        try {
            V0(bytes.length);
            b(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new d(e10);
        }
    }

    @Override // com.google.protobuf.AbstractC3141g
    public abstract void b(byte[] bArr, int i10, int i11);

    boolean b0() {
        return this.f37968b;
    }

    public final void d() {
        if (f0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract int f0();

    public abstract void g0(byte b10);

    public abstract void h0(int i10, boolean z10);

    public final void i0(boolean z10) {
        g0(z10 ? (byte) 1 : (byte) 0);
    }

    public final void j0(byte[] bArr) {
        k0(bArr, 0, bArr.length);
    }

    abstract void k0(byte[] bArr, int i10, int i11);

    public abstract void l0(int i10, AbstractC3142h abstractC3142h);

    public abstract void m0(AbstractC3142h abstractC3142h);

    public final void n0(int i10, double d10) {
        t0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void o0(double d10) {
        u0(Double.doubleToRawLongBits(d10));
    }

    public final void p0(int i10, int i11) {
        B0(i10, i11);
    }

    public final void q0(int i10) {
        C0(i10);
    }

    public abstract void r0(int i10, int i11);

    public abstract void s0(int i10);

    public abstract void t0(int i10, long j10);

    public abstract void u0(long j10);

    public final void v0(int i10, float f10) {
        r0(i10, Float.floatToRawIntBits(f10));
    }

    public final void w0(float f10) {
        s0(Float.floatToRawIntBits(f10));
    }

    public final void x0(int i10, T t10) {
        T0(i10, 3);
        z0(t10);
        T0(i10, 4);
    }

    final void y0(int i10, T t10, n0 n0Var) {
        T0(i10, 3);
        A0(t10, n0Var);
        T0(i10, 4);
    }

    public final void z0(T t10) {
        t10.writeTo(this);
    }
}
