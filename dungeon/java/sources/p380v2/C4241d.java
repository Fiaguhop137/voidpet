package p380v2;

import R1.z;
import U1.AbstractC1467i;
import U1.F;
import V1.h;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: v2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4241d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f56049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f56050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f56051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f56052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f56053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f56054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f56055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f56056h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f56057i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f56058j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f56059k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f56060l;

    private C4241d(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, String str) {
        this.f56049a = list;
        this.f56050b = i10;
        this.f56051c = i11;
        this.f56052d = i12;
        this.f56053e = i13;
        this.f56054f = i14;
        this.f56055g = i15;
        this.f56056h = i16;
        this.f56057i = i17;
        this.f56058j = i18;
        this.f56059k = f10;
        this.f56060l = str;
    }

    private static byte[] a(F f10) {
        int iT = f10.T();
        int iG = f10.g();
        f10.b0(iT);
        return AbstractC1467i.j(f10.f(), iG, iT);
    }

    public static C4241d b(F f10) {
        String strF;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f11;
        int i16;
        int i17;
        try {
            f10.b0(4);
            int iL = (f10.L() & 3) + 1;
            if (iL == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iL2 = f10.L() & 31;
            for (int i18 = 0; i18 < iL2; i18++) {
                arrayList.add(a(f10));
            }
            int iL3 = f10.L();
            for (int i19 = 0; i19 < iL3; i19++) {
                arrayList.add(a(f10));
            }
            if (iL2 > 0) {
                h.m mVarC = h.C((byte[]) arrayList.get(0), h.f13920a.length, ((byte[]) arrayList.get(0)).length);
                int i20 = mVarC.f13987f;
                int i21 = mVarC.f13988g;
                int i22 = mVarC.f13990i + 8;
                int i23 = mVarC.f13991j + 8;
                int i24 = mVarC.f13998q;
                int i25 = mVarC.f13999r;
                int i26 = mVarC.f14000s;
                int i27 = mVarC.f14001t;
                float f12 = mVarC.f13989h;
                strF = AbstractC1467i.f(mVarC.f13982a, mVarC.f13983b, mVarC.f13984c);
                i14 = i26;
                i15 = i27;
                f11 = f12;
                i13 = i23;
                i16 = i24;
                i17 = i25;
                i10 = i20;
                i11 = i21;
                i12 = i22;
            } else {
                strF = null;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                i15 = 16;
                f11 = 1.0f;
                i16 = -1;
                i17 = -1;
            }
            return new C4241d(arrayList, iL, i10, i11, i12, i13, i16, i17, i14, i15, f11, strF);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw z.a("Error parsing AVC config", e10);
        }
    }
}
