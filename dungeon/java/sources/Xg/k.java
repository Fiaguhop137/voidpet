package Xg;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
final class k {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    byte[] f16561A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    int f16562B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    int f16563C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    int f16564D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    int f16565E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    int f16566F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    int f16567G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    byte[] f16568H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    int f16569I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    int f16570J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    int f16571K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    int f16572L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    int f16573M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    int f16574N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f16575O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    int f16576P;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    int f16581U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    int f16582V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    int f16583W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    int f16584X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    int f16585Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    byte[] f16586Z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f16588b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    byte[] f16590d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f16593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f16594h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f16595i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f16596j;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    int f16609w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    int f16610x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    int f16611y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    byte[] f16612z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f16587a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final a f16589c = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int[] f16591e = new int[3240];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int[] f16592f = new int[3240];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final h f16597k = new h();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final h f16598l = new h();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final h f16599m = new h();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final int[] f16600n = new int[3];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final int[] f16601o = new int[3];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final int[] f16602p = new int[6];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final int[] f16603q = {16, 15, 11, 4};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f16604r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f16605s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f16606t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f16607u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f16608v = 0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    int f16577Q = 0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    long f16578R = 0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    byte[] f16579S = new byte[0];

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    int f16580T = 0;

    k() {
    }

    static void a(k kVar) throws IOException {
        int i10 = kVar.f16587a;
        if (i10 == 0) {
            throw new IllegalStateException("State MUST be initialized");
        }
        if (i10 == 11) {
            return;
        }
        kVar.f16587a = 11;
        a.b(kVar.f16589c);
    }

    private static int b(a aVar) {
        if (a.i(aVar, 1) == 0) {
            return 16;
        }
        int i10 = a.i(aVar, 3);
        if (i10 != 0) {
            return i10 + 17;
        }
        int i11 = a.i(aVar, 3);
        if (i11 != 0) {
            return i11 + 8;
        }
        return 17;
    }

    static void c(k kVar, InputStream inputStream) {
        if (kVar.f16587a != 0) {
            throw new IllegalStateException("State MUST be uninitialized");
        }
        a.e(kVar.f16589c, inputStream);
        int iB = b(kVar.f16589c);
        if (iB == 9) {
            throw new c("Invalid 'windowBits' code");
        }
        int i10 = 1 << iB;
        kVar.f16576P = i10;
        kVar.f16575O = i10 - 16;
        kVar.f16587a = 1;
    }
}
