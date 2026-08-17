package p394vg;

import Ug.a;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
public class h extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    short[][][] f56428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    byte[] f56429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    short[][][] f56430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    short[][][] f56431g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    short[][][] f56432h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    short[][][] f56433i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    short[][][] f56434j;

    public h(f fVar, byte[] bArr) {
        super(false, fVar);
        int iD = fVar.d();
        int iE = fVar.e();
        j jVarI = b().i();
        j jVar = j.CLASSIC;
        Class cls = Short.TYPE;
        if (jVarI != jVar) {
            this.f56429e = a.k(bArr, 0, fVar.b());
            this.f56430f = (short[][][]) Array.newInstance((Class<?>) cls, fVar.f(), fVar.h(), fVar.g());
            this.f56431g = (short[][][]) Array.newInstance((Class<?>) cls, fVar.f(), fVar.f(), fVar.f());
            this.f56432h = (short[][][]) Array.newInstance((Class<?>) cls, fVar.f(), fVar.f(), fVar.g());
            this.f56433i = (short[][][]) Array.newInstance((Class<?>) cls, fVar.f(), fVar.g(), fVar.g());
            this.f56434j = (short[][][]) Array.newInstance((Class<?>) cls, fVar.g(), fVar.g(), fVar.g());
            int iB = fVar.b();
            int i10 = iB + i.i(this.f56430f, bArr, iB, false);
            int i11 = i10 + i.i(this.f56431g, bArr, i10, true);
            int i12 = i11 + i.i(this.f56432h, bArr, i11, false);
            int i13 = i12 + i.i(this.f56433i, bArr, i12, true);
            if (i13 + i.i(this.f56434j, bArr, i13, true) != bArr.length) {
                throw new IllegalArgumentException("unparsed data in key encoding");
            }
            return;
        }
        this.f56428d = (short[][][]) Array.newInstance((Class<?>) cls, iD, iE, iE);
        int i14 = 0;
        for (int i15 = 0; i15 < iE; i15++) {
            for (int i16 = 0; i16 < iE; i16++) {
                for (int i17 = 0; i17 < iD; i17++) {
                    short[][][] sArr = this.f56428d;
                    if (i15 > i16) {
                        sArr[i17][i15][i16] = 0;
                    } else {
                        sArr[i17][i15][i16] = (short) (bArr[i14] & 255);
                        i14++;
                    }
                }
            }
        }
    }

    public byte[] getEncoded() {
        return b().i() != j.CLASSIC ? a.g(a.g(a.g(a.g(a.g(this.f56429e, i.f(this.f56430f, false)), i.f(this.f56431g, true)), i.f(this.f56432h, false)), i.f(this.f56433i, true)), i.f(this.f56434j, true)) : i.f(this.f56428d, true);
    }
}
