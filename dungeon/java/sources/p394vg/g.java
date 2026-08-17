package p394vg;

import Ug.a;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
public class g extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final byte[] f56414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final short[][] f56415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final short[][] f56416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final short[][] f56417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final short[][] f56418h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final short[][][] f56419i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final short[][][] f56420j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final short[][][] f56421k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final short[][][] f56422l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final short[][][] f56423m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final short[][][] f56424n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final short[][][] f56425o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final byte[] f56426p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private byte[] f56427q;

    public g(f fVar, byte[] bArr) {
        super(true, fVar);
        if (fVar.i() == j.COMPRESSED) {
            byte[] bArrK = a.k(bArr, 0, fVar.b());
            this.f56426p = bArrK;
            byte[] bArrK2 = a.k(bArr, fVar.b(), fVar.b() + fVar.c());
            this.f56414d = bArrK2;
            g gVarD = new d(fVar, bArrK, bArrK2).d();
            this.f56427q = gVarD.f56427q;
            this.f56415e = gVarD.f56415e;
            this.f56416f = gVarD.f56416f;
            this.f56417g = gVarD.f56417g;
            this.f56418h = gVarD.f56418h;
            this.f56419i = gVarD.f56419i;
            this.f56420j = gVarD.f56420j;
            this.f56421k = gVarD.f56421k;
            this.f56422l = gVarD.f56422l;
            this.f56423m = gVarD.f56423m;
            this.f56424n = gVarD.f56424n;
            this.f56425o = gVarD.f56425o;
            return;
        }
        int iH = fVar.h();
        int iF = fVar.f();
        int iG = fVar.g();
        Class cls = Short.TYPE;
        short[][] sArr = (short[][]) Array.newInstance((Class<?>) cls, iF, iG);
        this.f56415e = sArr;
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) cls, iH, iF);
        this.f56416f = sArr2;
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) cls, iH, iG);
        this.f56418h = sArr3;
        short[][] sArr4 = (short[][]) Array.newInstance((Class<?>) cls, iF, iG);
        this.f56417g = sArr4;
        short[][][] sArr5 = (short[][][]) Array.newInstance((Class<?>) cls, iF, iH, iH);
        this.f56419i = sArr5;
        short[][][] sArr6 = (short[][][]) Array.newInstance((Class<?>) cls, iF, iH, iF);
        this.f56420j = sArr6;
        short[][][] sArr7 = (short[][][]) Array.newInstance((Class<?>) cls, iG, iH, iH);
        this.f56421k = sArr7;
        short[][][] sArr8 = (short[][][]) Array.newInstance((Class<?>) cls, iG, iH, iF);
        this.f56422l = sArr8;
        short[][][] sArr9 = (short[][][]) Array.newInstance((Class<?>) cls, iG, iH, iG);
        this.f56423m = sArr9;
        short[][][] sArr10 = (short[][][]) Array.newInstance((Class<?>) cls, iG, iF, iF);
        this.f56424n = sArr10;
        short[][][] sArr11 = (short[][][]) Array.newInstance((Class<?>) cls, iG, iF, iG);
        this.f56425o = sArr11;
        this.f56426p = null;
        byte[] bArrK3 = a.k(bArr, 0, fVar.c());
        this.f56414d = bArrK3;
        int length = bArrK3.length;
        int iH2 = length + i.h(sArr, bArr, length);
        int iH3 = iH2 + i.h(sArr2, bArr, iH2);
        int iH4 = iH3 + i.h(sArr3, bArr, iH3);
        int iH5 = iH4 + i.h(sArr4, bArr, iH4);
        int i10 = iH5 + i.i(sArr5, bArr, iH5, true);
        int i11 = i10 + i.i(sArr6, bArr, i10, false);
        int i12 = i11 + i.i(sArr7, bArr, i11, true);
        int i13 = i12 + i.i(sArr8, bArr, i12, false);
        int i14 = i13 + i.i(sArr9, bArr, i13, false);
        int i15 = i14 + i.i(sArr10, bArr, i14, true);
        this.f56427q = a.k(bArr, i15 + i.i(sArr11, bArr, i15, false), bArr.length);
    }

    g(f fVar, byte[] bArr, short[][] sArr, short[][] sArr2, short[][] sArr3, short[][] sArr4, short[][][] sArr5, short[][][] sArr6, short[][][] sArr7, short[][][] sArr8, short[][][] sArr9, short[][][] sArr10, short[][][] sArr11, byte[] bArr2) {
        super(true, fVar);
        this.f56426p = null;
        this.f56427q = bArr2;
        this.f56414d = (byte[]) bArr.clone();
        this.f56415e = i.a(sArr);
        this.f56416f = i.a(sArr2);
        this.f56417g = i.a(sArr3);
        this.f56418h = i.a(sArr4);
        this.f56419i = i.b(sArr5);
        this.f56420j = i.b(sArr6);
        this.f56421k = i.b(sArr7);
        this.f56422l = i.b(sArr8);
        this.f56423m = i.b(sArr9);
        this.f56424n = i.b(sArr10);
        this.f56425o = i.b(sArr11);
    }

    public byte[] c() {
        return b().i() == j.COMPRESSED ? a.g(this.f56426p, this.f56414d) : a.g(a.g(a.g(a.g(a.g(a.g(a.g(a.g(a.g(a.g(a.g(this.f56414d, i.e(this.f56415e)), i.e(this.f56416f)), i.e(this.f56418h)), i.e(this.f56417g)), i.f(this.f56419i, true)), i.f(this.f56420j, false)), i.f(this.f56421k, true)), i.f(this.f56422l, false)), i.f(this.f56423m, false)), i.f(this.f56424n, true)), i.f(this.f56425o, false));
    }

    public byte[] getEncoded() {
        return b().i() == j.COMPRESSED ? a.g(this.f56426p, this.f56414d) : a.g(c(), this.f56427q);
    }
}
