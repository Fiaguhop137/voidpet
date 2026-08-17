package p380v2;

import R1.z;
import U1.AbstractC1467i;
import U1.F;
import V1.h;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f55934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f55937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f55938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f55939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f55940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f55941h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f55942i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f55943j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f55944k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f55945l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f55946m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f55947n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f55948o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f55949p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h.k f55950q;

    private C(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, float f10, int i22, String str, h.k kVar) {
        this.f55934a = list;
        this.f55935b = i10;
        this.f55936c = i11;
        this.f55937d = i12;
        this.f55938e = i13;
        this.f55939f = i14;
        this.f55940g = i15;
        this.f55941h = i16;
        this.f55942i = i17;
        this.f55943j = i18;
        this.f55944k = i19;
        this.f55945l = i20;
        this.f55946m = i21;
        this.f55947n = f10;
        this.f55948o = i22;
        this.f55949p = str;
        this.f55950q = kVar;
    }

    public static C a(F f10) {
        return b(f10, false, null);
    }

    private static C b(F f10, boolean z10, h.k kVar) throws z {
        boolean z11;
        int i10;
        h.g gVarT;
        try {
            if (z10) {
                f10.b0(4);
            } else {
                f10.b0(21);
            }
            int iL = f10.L() & 3;
            int iL2 = f10.L();
            int iG = f10.g();
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                z11 = true;
                if (i12 >= iL2) {
                    break;
                }
                f10.b0(1);
                int iT = f10.T();
                for (int i14 = 0; i14 < iT; i14++) {
                    int iT2 = f10.T();
                    i13 += iT2 + 4;
                    f10.b0(iT2);
                }
                i12++;
            }
            f10.a0(iG);
            byte[] bArr = new byte[i13];
            h.k kVar2 = kVar;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            int i24 = -1;
            int i25 = -1;
            int i26 = -1;
            float f11 = 1.0f;
            String strH = null;
            int i27 = 0;
            int i28 = 0;
            while (i27 < iL2) {
                int iL3 = f10.L() & 63;
                int iT3 = f10.T();
                int i29 = i11;
                h.k kVarY = kVar2;
                while (i29 < iT3) {
                    int iT4 = f10.T();
                    boolean z12 = z11;
                    byte[] bArr2 = h.f13920a;
                    int i30 = iL;
                    System.arraycopy(bArr2, i11, bArr, i28, bArr2.length);
                    int length = i28 + bArr2.length;
                    System.arraycopy(f10.f(), f10.g(), bArr, length, iT4);
                    if (iL3 == 32 && i29 == 0) {
                        kVarY = h.y(bArr, length, length + iT4);
                        i10 = iL2;
                    } else {
                        if (iL3 == 33 && i29 == 0) {
                            h.C0192h c0192hU = h.u(bArr, length, length + iT4, kVarY);
                            i15 = c0192hU.f13954b + 1;
                            i16 = c0192hU.f13960h;
                            int i31 = c0192hU.f13961i;
                            int i32 = c0192hU.f13962j;
                            i10 = iL2;
                            int i33 = c0192hU.f13963k;
                            i20 = c0192hU.f13957e + 8;
                            i21 = c0192hU.f13958f + 8;
                            int i34 = c0192hU.f13966n;
                            int i35 = c0192hU.f13967o;
                            int i36 = c0192hU.f13968p;
                            float f12 = c0192hU.f13964l;
                            int i37 = c0192hU.f13965m;
                            h.c cVar = c0192hU.f13955c;
                            if (cVar != null) {
                                strH = AbstractC1467i.h(cVar.f13929a, cVar.f13930b, cVar.f13931c, cVar.f13932d, cVar.f13933e, cVar.f13934f);
                            }
                            f11 = f12;
                            i26 = i37;
                            i23 = i35;
                            i24 = i36;
                            i19 = i33;
                            i22 = i34;
                            i18 = i32;
                            i17 = i31;
                        } else {
                            i10 = iL2;
                            if (iL3 == 39 && i29 == 0 && (gVarT = h.t(bArr, length, length + iT4)) != null && kVarY != null) {
                                i11 = 0;
                                i25 = gVarT.f13947d == ((h.a) kVarY.f13975b.get(0)).f13925b ? 4 : 5;
                            }
                        }
                        i11 = 0;
                    }
                    i28 = length + iT4;
                    f10.b0(iT4);
                    i29++;
                    z11 = z12;
                    iL = i30;
                    iL2 = i10;
                }
                i27++;
                kVar2 = kVarY;
            }
            return new C(i13 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iL + 1, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, f11, i26, strH, kVar2);
        } catch (ArrayIndexOutOfBoundsException e10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error parsing");
            sb2.append(z10 ? "L-HEVC config" : "HEVC config");
            throw z.a(sb2.toString(), e10);
        }
    }

    public static C c(F f10, h.k kVar) {
        return b(f10, true, kVar);
    }
}
