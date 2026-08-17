package com.facebook.react.uimanager;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A f30142a = new A();

    public static class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final C0386a f30143f = new C0386a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double[] f30144a = new double[4];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double[] f30145b = new double[3];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double[] f30146c = new double[3];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public double[] f30147d = new double[3];

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public double[] f30148e = new double[3];

        /* JADX INFO: renamed from: com.facebook.react.uimanager.A$a$a, reason: collision with other inner class name */
        private static final class C0386a {
            private C0386a() {
            }

            public /* synthetic */ C0386a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void b(double[] dArr) {
                int length = dArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    dArr[i10] = 0.0d;
                }
            }
        }

        public final void a() {
            C0386a c0386a = f30143f;
            c0386a.b(this.f30144a);
            c0386a.b(this.f30145b);
            c0386a.b(this.f30146c);
            c0386a.b(this.f30147d);
            c0386a.b(this.f30148e);
        }
    }

    private A() {
    }

    public static final void a(double[] m10, double d10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        m10[11] = ((double) (-1)) / d10;
    }

    public static final void b(double[] m10, double d10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        m10[5] = Math.cos(d10);
        m10[6] = Math.sin(d10);
        m10[9] = -Math.sin(d10);
        m10[10] = Math.cos(d10);
    }

    public static final void c(double[] m10, double d10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        m10[0] = Math.cos(d10);
        m10[2] = -Math.sin(d10);
        m10[8] = Math.sin(d10);
        m10[10] = Math.cos(d10);
    }

    public static final void d(double[] m10, double d10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        m10[0] = Math.cos(d10);
        m10[1] = Math.sin(d10);
        m10[4] = -Math.sin(d10);
        m10[5] = Math.cos(d10);
    }

    public static final void e(double[] m10, double d10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        m10[0] = d10;
    }

    public static final void f(double[] m10, double d10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        m10[5] = d10;
    }

    public static final void g(double[] m10, double d10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        m10[4] = Math.tan(d10);
    }

    public static final void h(double[] m10, double d10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        m10[1] = Math.tan(d10);
    }

    public static final void i(double[] m10, double d10, double d11) {
        Intrinsics.checkNotNullParameter(m10, "m");
        m10[12] = d10;
        m10[13] = d11;
    }

    public static final void j(double[] m10, double d10, double d11, double d12) {
        Intrinsics.checkNotNullParameter(m10, "m");
        m10[12] = d10;
        m10[13] = d11;
        m10[14] = d12;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00d0 A[LOOP:3: B:36:0x00ce->B:37:0x00d0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x00df A[LOOP:4: B:39:0x00dd->B:40:0x00df, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ea A[LOOP:5: B:42:0x00e8->B:43:0x00ea, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x018f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0193 A[LOOP:6: B:47:0x0191->B:48:0x0193, LOOP_END] */
    public static final void k(double[] transformMatrix, a ctx) {
        char c10;
        int i10;
        double[][] dArr;
        int i11;
        int i12;
        double[] dArrY;
        int i13;
        Intrinsics.checkNotNullParameter(transformMatrix, "transformMatrix");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        p240n6.a.a(transformMatrix.length == 16);
        double[] dArr2 = ctx.f30144a;
        double[] dArr3 = ctx.f30145b;
        double[] dArr4 = ctx.f30146c;
        double[] dArr5 = ctx.f30147d;
        double[] dArr6 = ctx.f30148e;
        if (f30142a.o(transformMatrix[15])) {
            return;
        }
        double[][] dArr7 = new double[4][];
        for (int i14 = 0; i14 < 4; i14++) {
            dArr7[i14] = new double[4];
        }
        double[] dArr8 = new double[16];
        for (int i15 = 0; i15 < 4; i15++) {
            for (int i16 = 0; i16 < 4; i16++) {
                int i17 = (i15 * 4) + i16;
                double d10 = transformMatrix[i17] / transformMatrix[15];
                dArr7[i15][i16] = d10;
                if (i16 == 3) {
                    d10 = 0.0d;
                }
                dArr8[i17] = d10;
            }
        }
        dArr8[15] = 1.0d;
        A a10 = f30142a;
        if (a10.o(m(dArr8))) {
            return;
        }
        if (a10.o(dArr7[0][3])) {
            c10 = 2;
            if (a10.o(dArr7[1][3]) && a10.o(dArr7[2][3])) {
                dArr2[2] = 0.0d;
                dArr2[1] = 0.0d;
                dArr2[0] = 0.0d;
                dArr2[3] = 1.0d;
            }
            for (i10 = 0; i10 < 3; i10++) {
                dArr5[i10] = dArr7[3][i10];
            }
            dArr = new double[3][];
            for (i11 = 0; i11 < 3; i11++) {
                dArr[i11] = new double[3];
            }
            for (i12 = 0; i12 < 3; i12++) {
                double[] dArr9 = dArr[i12];
                double[] dArr10 = dArr7[i12];
                dArr9[0] = dArr10[0];
                dArr9[1] = dArr10[1];
                dArr9[c10] = dArr10[c10];
            }
            double dX = x(dArr[0]);
            dArr3[0] = dX;
            double[] dArrY2 = y(dArr[0], dX);
            dArr[0] = dArrY2;
            double dW = w(dArrY2, dArr[1]);
            dArr4[0] = dW;
            double[] dArrU = u(dArr[1], dArr[0], 1.0d, -dW);
            dArr[1] = dArrU;
            double dX2 = x(dArrU);
            dArr3[1] = dX2;
            dArr[1] = y(dArr[1], dX2);
            dArr4[0] = dArr4[0] / dArr3[1];
            double dW2 = w(dArr[0], dArr[c10]);
            dArr4[1] = dW2;
            double[] dArrU2 = u(dArr[c10], dArr[0], 1.0d, -dW2);
            dArr[c10] = dArrU2;
            double dW3 = w(dArr[1], dArrU2);
            dArr4[c10] = dW3;
            double[] dArrU3 = u(dArr[c10], dArr[1], 1.0d, -dW3);
            dArr[c10] = dArrU3;
            double dX3 = x(dArrU3);
            dArr3[c10] = dX3;
            dArrY = y(dArr[c10], dX3);
            dArr[c10] = dArrY;
            double d11 = dArr4[1];
            double d12 = dArr3[c10];
            dArr4[1] = d11 / d12;
            dArr4[c10] = dArr4[c10] / d12;
            if (w(dArr[0], v(dArr[1], dArrY)) < 0.0d) {
                for (i13 = 0; i13 < 3; i13++) {
                    dArr3[i13] = dArr3[i13] * (-1.0d);
                    double[] dArr11 = dArr[i13];
                    dArr11[0] = dArr11[0] * (-1.0d);
                    dArr11[1] = dArr11[1] * (-1.0d);
                    dArr11[c10] = dArr11[c10] * (-1.0d);
                }
            }
            double[] dArr12 = dArr[c10];
            dArr6[0] = s((-Math.atan2(dArr12[1], dArr12[c10])) * 57.29577951308232d);
            double[] dArr13 = dArr[c10];
            double d13 = -dArr13[0];
            double d14 = dArr13[1];
            double d15 = dArr13[c10];
            dArr6[1] = s((-Math.atan2(d13, Math.sqrt((d14 * d14) + (d15 * d15)))) * 57.29577951308232d);
            dArr6[c10] = s((-Math.atan2(dArr[1][0], dArr[0][0])) * 57.29577951308232d);
        }
        c10 = 2;
        double d16 = dArr7[0][3];
        double d17 = dArr7[1][3];
        double d18 = dArr7[c10][3];
        double d19 = dArr7[3][3];
        double[] dArr14 = new double[4];
        dArr14[0] = d16;
        dArr14[1] = d17;
        dArr14[c10] = d18;
        dArr14[3] = d19;
        q(dArr14, t(n(dArr8)), dArr2);
        while (i10 < 3) {
            dArr5[i10] = dArr7[3][i10];
        }
        dArr = new double[3][];
        while (i11 < 3) {
            dArr[i11] = new double[3];
        }
        while (i12 < 3) {
            double[] dArr15 = dArr[i12];
            double[] dArr16 = dArr7[i12];
            dArr15[0] = dArr16[0];
            dArr15[1] = dArr16[1];
            dArr15[c10] = dArr16[c10];
        }
        double dX4 = x(dArr[0]);
        dArr3[0] = dX4;
        double[] dArrY3 = y(dArr[0], dX4);
        dArr[0] = dArrY3;
        double dW4 = w(dArrY3, dArr[1]);
        dArr4[0] = dW4;
        double[] dArrU4 = u(dArr[1], dArr[0], 1.0d, -dW4);
        dArr[1] = dArrU4;
        double dX5 = x(dArrU4);
        dArr3[1] = dX5;
        dArr[1] = y(dArr[1], dX5);
        dArr4[0] = dArr4[0] / dArr3[1];
        double dW5 = w(dArr[0], dArr[c10]);
        dArr4[1] = dW5;
        double[] dArrU5 = u(dArr[c10], dArr[0], 1.0d, -dW5);
        dArr[c10] = dArrU5;
        double dW6 = w(dArr[1], dArrU5);
        dArr4[c10] = dW6;
        double[] dArrU6 = u(dArr[c10], dArr[1], 1.0d, -dW6);
        dArr[c10] = dArrU6;
        double dX6 = x(dArrU6);
        dArr3[c10] = dX6;
        dArrY = y(dArr[c10], dX6);
        dArr[c10] = dArrY;
        double d110 = dArr4[1];
        double d111 = dArr3[c10];
        dArr4[1] = d110 / d111;
        dArr4[c10] = dArr4[c10] / d111;
        if (w(dArr[0], v(dArr[1], dArrY)) < 0.0d) {
            while (i13 < 3) {
                dArr3[i13] = dArr3[i13] * (-1.0d);
                double[] dArr17 = dArr[i13];
                dArr17[0] = dArr17[0] * (-1.0d);
                dArr17[1] = dArr17[1] * (-1.0d);
                dArr17[c10] = dArr17[c10] * (-1.0d);
            }
        }
        double[] dArr18 = dArr[c10];
        dArr6[0] = s((-Math.atan2(dArr18[1], dArr18[c10])) * 57.29577951308232d);
        double[] dArr19 = dArr[c10];
        double d112 = -dArr19[0];
        double d113 = dArr19[1];
        double d114 = dArr19[c10];
        dArr6[1] = s((-Math.atan2(d112, Math.sqrt((d113 * d113) + (d114 * d114)))) * 57.29577951308232d);
        dArr6[c10] = s((-Math.atan2(dArr[1][0], dArr[0][0])) * 57.29577951308232d);
    }

    public static final double l(double d10) {
        return (d10 * 3.141592653589793d) / ((double) 180);
    }

    public static final double m(double[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        double d10 = matrix[0];
        double d11 = matrix[1];
        double d12 = matrix[2];
        double d13 = matrix[3];
        double d14 = matrix[4];
        double d15 = matrix[5];
        double d16 = matrix[6];
        double d17 = matrix[7];
        double d18 = matrix[8];
        double d19 = matrix[9];
        double d20 = matrix[10];
        double d21 = matrix[11];
        double d22 = matrix[12];
        double d23 = matrix[13];
        double d24 = matrix[14];
        double d25 = matrix[15];
        double d26 = d13 * d16;
        double d27 = d12 * d17;
        double d28 = d13 * d15;
        double d29 = d11 * d17;
        double d30 = d12 * d15;
        double d31 = d11 * d16;
        double d32 = d13 * d14;
        double d33 = d17 * d10;
        double d34 = d12 * d14;
        double d35 = d16 * d10;
        double d36 = d11 * d14;
        double d37 = d10 * d15;
        return ((((((((((((((((((((((((d26 * d19) * d22) - ((d27 * d19) * d22)) - ((d28 * d20) * d22)) + ((d29 * d20) * d22)) + ((d30 * d21) * d22)) - ((d31 * d21) * d22)) - ((d26 * d18) * d23)) + ((d27 * d18) * d23)) + ((d32 * d20) * d23)) - ((d33 * d20) * d23)) - ((d34 * d21) * d23)) + ((d35 * d21) * d23)) + ((d28 * d18) * d24)) - ((d29 * d18) * d24)) - ((d32 * d19) * d24)) + ((d33 * d19) * d24)) + ((d36 * d21) * d24)) - ((d21 * d37) * d24)) - ((d30 * d18) * d25)) + ((d31 * d18) * d25)) + ((d34 * d19) * d25)) - ((d35 * d19) * d25)) - ((d36 * d20) * d25)) + (d37 * d20 * d25);
    }

    public static final double[] n(double[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        double dM = m(matrix);
        if (f30142a.o(dM)) {
            return matrix;
        }
        double d10 = matrix[0];
        double d11 = matrix[1];
        double d12 = matrix[2];
        double d13 = matrix[3];
        double d14 = matrix[4];
        double d15 = matrix[5];
        double d16 = matrix[6];
        double d17 = matrix[7];
        double d18 = matrix[8];
        double d19 = matrix[9];
        double d20 = matrix[10];
        double d21 = matrix[11];
        double d22 = matrix[12];
        double d23 = matrix[13];
        double d24 = matrix[14];
        double d25 = matrix[15];
        double d26 = d16 * d21;
        double d27 = d17 * d20;
        double d28 = d17 * d19;
        double d29 = d15 * d21;
        double d30 = d16 * d19;
        double d31 = d15 * d20;
        double d32 = d13 * d20;
        double d33 = d12 * d21;
        double d34 = d13 * d19;
        double d35 = d11 * d21;
        double d36 = d12 * d19;
        double d37 = d11 * d20;
        double d38 = d12 * d17;
        double d39 = d13 * d16;
        double d40 = d13 * d15;
        double d41 = d11 * d17;
        double d42 = d12 * d15;
        double d43 = d11 * d16;
        double d44 = (d27 * d22) - (d26 * d22);
        double d45 = d17 * d18;
        double d46 = d14 * d21;
        double d47 = d16 * d18;
        double d48 = d14 * d20;
        double d49 = (d33 * d22) - (d32 * d22);
        double d50 = d13 * d18;
        double d51 = d10 * d21;
        double d52 = d12 * d18;
        double d53 = d10 * d20;
        double d54 = d13 * d14;
        double d55 = d17 * d10;
        double d56 = d12 * d14;
        double d57 = d16 * d10;
        double d58 = (((d29 * d22) - (d28 * d22)) + (d45 * d23)) - (d46 * d23);
        double d59 = d15 * d18;
        double d60 = d14 * d19;
        double d61 = (((d34 * d22) - (d35 * d22)) - (d50 * d23)) + (d51 * d23);
        double d62 = d11 * d18;
        double d63 = d10 * d19;
        double d64 = d11 * d14;
        double d65 = d10 * d15;
        return new double[]{((((((d26 * d23) - (d27 * d23)) + (d28 * d24)) - (d29 * d24)) - (d30 * d25)) + (d31 * d25)) / dM, ((((((d32 * d23) - (d33 * d23)) - (d34 * d24)) + (d35 * d24)) + (d36 * d25)) - (d37 * d25)) / dM, ((((((d38 * d23) - (d39 * d23)) + (d40 * d24)) - (d41 * d24)) - (d42 * d25)) + (d43 * d25)) / dM, ((((((d39 * d19) - (d38 * d19)) - (d40 * d20)) + (d41 * d20)) + (d42 * d21)) - (d43 * d21)) / dM, ((((d44 - (d45 * d24)) + (d46 * d24)) + (d47 * d25)) - (d48 * d25)) / dM, ((((d49 + (d50 * d24)) - (d51 * d24)) - (d52 * d25)) + (d53 * d25)) / dM, ((((((d39 * d22) - (d38 * d22)) - (d54 * d24)) + (d55 * d24)) + (d56 * d25)) - (d57 * d25)) / dM, ((((((d38 * d18) - (d39 * d18)) + (d54 * d20)) - (d55 * d20)) - (d56 * d21)) + (d57 * d21)) / dM, ((d58 - (d59 * d25)) + (d60 * d25)) / dM, ((d61 + (d62 * d25)) - (d63 * d25)) / dM, ((((((d41 * d22) - (d40 * d22)) + (d54 * d23)) - (d55 * d23)) - (d64 * d25)) + (d25 * d65)) / dM, ((((((d40 * d18) - (d41 * d18)) - (d54 * d19)) + (d55 * d19)) + (d64 * d21)) - (d21 * d65)) / dM, ((((((d30 * d22) - (d31 * d22)) - (d47 * d23)) + (d48 * d23)) + (d59 * d24)) - (d60 * d24)) / dM, ((((((d37 * d22) - (d36 * d22)) + (d52 * d23)) - (d53 * d23)) - (d62 * d24)) + (d63 * d24)) / dM, ((((((d42 * d22) - (d22 * d43)) - (d56 * d23)) + (d23 * d57)) + (d64 * d24)) - (d24 * d65)) / dM, ((((((d43 * d18) - (d42 * d18)) + (d56 * d19)) - (d57 * d19)) - (d64 * d20)) + (d65 * d20)) / dM};
    }

    private final boolean o(double d10) {
        return !Double.isNaN(d10) && Math.abs(d10) < 1.0E-5d;
    }

    public static final void p(double[] out, double[] a10, double[] b10) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        double d10 = a10[0];
        double d11 = a10[1];
        double d12 = a10[2];
        double d13 = a10[3];
        double d14 = a10[4];
        double d15 = a10[5];
        double d16 = a10[6];
        double d17 = a10[7];
        double d18 = a10[8];
        double d19 = a10[9];
        double d20 = a10[10];
        double d21 = a10[11];
        double d22 = a10[12];
        double d23 = a10[13];
        double d24 = a10[14];
        double d25 = a10[15];
        double d26 = b10[0];
        double d27 = b10[1];
        double d28 = b10[2];
        double d29 = b10[3];
        out[0] = (d26 * d10) + (d27 * d14) + (d28 * d18) + (d29 * d22);
        out[1] = (d26 * d11) + (d27 * d15) + (d28 * d19) + (d29 * d23);
        out[2] = (d26 * d12) + (d27 * d16) + (d28 * d20) + (d29 * d24);
        out[3] = (d26 * d13) + (d27 * d17) + (d28 * d21) + (d29 * d25);
        double d30 = b10[4];
        double d31 = b10[5];
        double d32 = b10[6];
        double d33 = b10[7];
        out[4] = (d30 * d10) + (d31 * d14) + (d32 * d18) + (d33 * d22);
        out[5] = (d30 * d11) + (d31 * d15) + (d32 * d19) + (d33 * d23);
        out[6] = (d30 * d12) + (d31 * d16) + (d32 * d20) + (d33 * d24);
        out[7] = (d30 * d13) + (d31 * d17) + (d32 * d21) + (d33 * d25);
        double d34 = b10[8];
        double d35 = b10[9];
        double d36 = b10[10];
        double d37 = b10[11];
        out[8] = (d34 * d10) + (d35 * d14) + (d36 * d18) + (d37 * d22);
        out[9] = (d34 * d11) + (d35 * d15) + (d36 * d19) + (d37 * d23);
        out[10] = (d34 * d12) + (d35 * d16) + (d36 * d20) + (d37 * d24);
        out[11] = (d34 * d13) + (d35 * d17) + (d36 * d21) + (d37 * d25);
        double d38 = b10[12];
        double d39 = b10[13];
        double d40 = b10[14];
        double d41 = b10[15];
        out[12] = (d10 * d38) + (d14 * d39) + (d18 * d40) + (d22 * d41);
        out[13] = (d11 * d38) + (d15 * d39) + (d19 * d40) + (d23 * d41);
        out[14] = (d12 * d38) + (d16 * d39) + (d20 * d40) + (d24 * d41);
        out[15] = (d38 * d13) + (d39 * d17) + (d40 * d21) + (d41 * d25);
    }

    public static final void q(double[] v10, double[] m10, double[] result) {
        Intrinsics.checkNotNullParameter(v10, "v");
        Intrinsics.checkNotNullParameter(m10, "m");
        Intrinsics.checkNotNullParameter(result, "result");
        double d10 = v10[0];
        double d11 = v10[1];
        double d12 = v10[2];
        double d13 = v10[3];
        result[0] = (m10[0] * d10) + (m10[4] * d11) + (m10[8] * d12) + (m10[12] * d13);
        result[1] = (m10[1] * d10) + (m10[5] * d11) + (m10[9] * d12) + (m10[13] * d13);
        result[2] = (m10[2] * d10) + (m10[6] * d11) + (m10[10] * d12) + (m10[14] * d13);
        result[3] = (d10 * m10[3]) + (d11 * m10[7]) + (d12 * m10[11]) + (d13 * m10[15]);
    }

    public static final void r(double[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        matrix[14] = 0.0d;
        matrix[13] = 0.0d;
        matrix[12] = 0.0d;
        matrix[11] = 0.0d;
        matrix[9] = 0.0d;
        matrix[8] = 0.0d;
        matrix[7] = 0.0d;
        matrix[6] = 0.0d;
        matrix[4] = 0.0d;
        matrix[3] = 0.0d;
        matrix[2] = 0.0d;
        matrix[1] = 0.0d;
        matrix[15] = 1.0d;
        matrix[10] = 1.0d;
        matrix[5] = 1.0d;
        matrix[0] = 1.0d;
    }

    public static final double s(double d10) {
        return Math.round(d10 * 1000.0d) * 0.001d;
    }

    public static final double[] t(double[] m10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        return new double[]{m10[0], m10[4], m10[8], m10[12], m10[1], m10[5], m10[9], m10[13], m10[2], m10[6], m10[10], m10[14], m10[3], m10[7], m10[11], m10[15]};
    }

    public static final double[] u(double[] a10, double[] b10, double d10, double d11) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new double[]{(a10[0] * d10) + (b10[0] * d11), (a10[1] * d10) + (b10[1] * d11), (d10 * a10[2]) + (d11 * b10[2])};
    }

    public static final double[] v(double[] a10, double[] b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        double d10 = a10[1];
        double d11 = b10[2];
        double d12 = a10[2];
        double d13 = b10[1];
        double d14 = b10[0];
        double d15 = a10[0];
        return new double[]{(d10 * d11) - (d12 * d13), (d12 * d14) - (d11 * d15), (d15 * d13) - (d10 * d14)};
    }

    public static final double w(double[] a10, double[] b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return (a10[0] * b10[0]) + (a10[1] * b10[1]) + (a10[2] * b10[2]);
    }

    public static final double x(double[] a10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        double d10 = a10[0];
        double d11 = a10[1];
        double d12 = (d10 * d10) + (d11 * d11);
        double d13 = a10[2];
        return Math.sqrt(d12 + (d13 * d13));
    }

    public static final double[] y(double[] vector, double d10) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        double d11 = 1;
        if (f30142a.o(d10)) {
            d10 = x(vector);
        }
        double d12 = d11 / d10;
        return new double[]{vector[0] * d12, vector[1] * d12, vector[2] * d12};
    }
}
