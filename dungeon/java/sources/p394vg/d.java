package p394vg;

import Ug.a;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes3.dex */
class d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private short[][][] f56369A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private short[][][] f56370B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j f56372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f56373c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f56375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f56376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f56377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte[] f56378h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private byte[] f56379i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private short[][] f56380j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private short[][] f56381k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private short[][] f56382l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private short[][] f56383m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private short[][] f56384n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private short[][][] f56385o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private short[][][] f56386p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private short[][][] f56387q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private short[][][] f56388r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private short[][][] f56389s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private short[][][] f56390t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private short[][][] f56391u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private short[][][] f56392v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private short[][][] f56393w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private short[][][] f56394x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private short[][][] f56395y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private short[][][] f56396z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    a f56374d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SecureRandom f56371a = null;

    public d(f fVar, byte[] bArr, byte[] bArr2) {
        this.f56373c = fVar;
        this.f56372b = fVar.i();
        this.f56379i = bArr;
        this.f56378h = bArr2;
        this.f56375e = this.f56373c.h();
        this.f56376f = this.f56373c.f();
        this.f56377g = this.f56373c.g();
    }

    private void a() {
        this.f56385o = i.b(this.f56392v);
        this.f56386p = new short[this.f56376f][][];
        for (int i10 = 0; i10 < this.f56376f; i10++) {
            this.f56386p[i10] = this.f56374d.b(this.f56392v[i10]);
            short[][][] sArr = this.f56386p;
            sArr[i10] = this.f56374d.c(sArr[i10], this.f56381k);
            short[][][] sArr2 = this.f56386p;
            sArr2[i10] = this.f56374d.a(sArr2[i10], this.f56393w[i10]);
        }
        int i11 = this.f56377g;
        this.f56388r = new short[i11][][];
        this.f56389s = new short[i11][][];
        this.f56390t = new short[i11][][];
        this.f56391u = new short[i11][][];
        this.f56387q = i.b(this.f56394x);
        for (int i12 = 0; i12 < this.f56377g; i12++) {
            short[][] sArrB = this.f56374d.b(this.f56394x[i12]);
            this.f56388r[i12] = this.f56374d.c(sArrB, this.f56381k);
            short[][][] sArr3 = this.f56388r;
            sArr3[i12] = this.f56374d.a(sArr3[i12], this.f56395y[i12]);
            this.f56389s[i12] = this.f56374d.c(sArrB, this.f56384n);
            short[][] sArrC = this.f56374d.c(this.f56395y[i12], this.f56383m);
            short[][][] sArr4 = this.f56389s;
            sArr4[i12] = this.f56374d.a(sArr4[i12], sArrC);
            short[][][] sArr5 = this.f56389s;
            sArr5[i12] = this.f56374d.a(sArr5[i12], this.f56396z[i12]);
            short[][] sArrA = this.f56374d.a(this.f56374d.c(this.f56394x[i12], this.f56381k), this.f56395y[i12]);
            short[][] sArrF = this.f56374d.f(this.f56381k);
            this.f56390t[i12] = this.f56374d.c(sArrF, sArrA);
            short[][][] sArr6 = this.f56390t;
            sArr6[i12] = this.f56374d.a(sArr6[i12], this.f56369A[i12]);
            short[][][] sArr7 = this.f56390t;
            sArr7[i12] = this.f56374d.e(sArr7[i12]);
            this.f56391u[i12] = this.f56374d.c(sArrF, this.f56389s[i12]);
            a aVar = this.f56374d;
            short[][] sArrC2 = aVar.c(aVar.f(this.f56395y[i12]), this.f56384n);
            short[][][] sArr8 = this.f56391u;
            sArr8[i12] = this.f56374d.a(sArr8[i12], sArrC2);
            short[][] sArrC3 = this.f56374d.c(this.f56374d.b(this.f56369A[i12]), this.f56383m);
            short[][][] sArr9 = this.f56391u;
            sArr9[i12] = this.f56374d.a(sArr9[i12], sArrC3);
            short[][][] sArr10 = this.f56391u;
            sArr10[i12] = this.f56374d.a(sArr10[i12], this.f56370B[i12]);
        }
    }

    private void b() {
        this.f56384n = this.f56374d.a(this.f56374d.c(this.f56381k, this.f56383m), this.f56382l);
    }

    private void c() {
        c cVar = new c(this.f56378h, this.f56373c.a());
        c cVar2 = new c(this.f56379i, this.f56373c.a());
        f(cVar);
        b();
        e(cVar2);
        this.f56392v = this.f56374d.d(this.f56380j, this.f56394x, this.f56392v);
        this.f56393w = this.f56374d.d(this.f56380j, this.f56395y, this.f56393w);
        a();
    }

    private void e(SecureRandom secureRandom) {
        int i10 = this.f56376f;
        int i11 = this.f56375e;
        this.f56392v = i.c(secureRandom, i10, i11, i11, true);
        int i12 = this.f56376f;
        this.f56393w = i.c(secureRandom, i12, this.f56375e, i12, false);
        int i13 = this.f56377g;
        int i14 = this.f56375e;
        this.f56394x = i.c(secureRandom, i13, i14, i14, true);
        this.f56395y = i.c(secureRandom, this.f56377g, this.f56375e, this.f56376f, false);
        int i15 = this.f56377g;
        this.f56396z = i.c(secureRandom, i15, this.f56375e, i15, false);
        int i16 = this.f56377g;
        int i17 = this.f56376f;
        this.f56369A = i.c(secureRandom, i16, i17, i17, true);
        int i18 = this.f56377g;
        this.f56370B = i.c(secureRandom, i18, this.f56376f, i18, false);
    }

    private void f(SecureRandom secureRandom) {
        this.f56380j = i.d(secureRandom, this.f56376f, this.f56377g);
        this.f56381k = i.d(secureRandom, this.f56375e, this.f56376f);
        this.f56382l = i.d(secureRandom, this.f56375e, this.f56377g);
        this.f56383m = i.d(secureRandom, this.f56376f, this.f56377g);
    }

    g d() {
        this.f56378h = a.e(this.f56378h);
        this.f56379i = a.e(this.f56379i);
        c();
        return new g(this.f56373c, this.f56378h, this.f56380j, this.f56381k, this.f56383m, this.f56384n, this.f56385o, this.f56386p, this.f56387q, this.f56388r, this.f56389s, this.f56390t, this.f56391u, null);
    }
}
