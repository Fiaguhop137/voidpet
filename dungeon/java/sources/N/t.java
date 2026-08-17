package N;

import I.T0;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f7150e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f7151f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final t f7152g = new t(0, 0, new Object[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f7153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final P.e f7155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object[] f7156d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t a() {
            return t.f7152g;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private t f7157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f7158b;

        public b(t tVar, int i10) {
            this.f7157a = tVar;
            this.f7158b = i10;
        }

        public final t a() {
            return this.f7157a;
        }

        public final int b() {
            return this.f7158b;
        }

        public final void c(t tVar) {
            this.f7157a = tVar;
        }
    }

    public t(int i10, int i11, Object[] objArr) {
        this(i10, i11, objArr, null);
    }

    public t(int i10, int i11, Object[] objArr, P.e eVar) {
        this.f7153a = i10;
        this.f7154b = i11;
        this.f7155c = eVar;
        this.f7156d = objArr;
    }

    private final t A(int i10, f fVar) {
        fVar.n(fVar.size() - 1);
        fVar.k(W(i10));
        if (this.f7156d.length == 2) {
            return null;
        }
        if (this.f7155c != fVar.h()) {
            return new t(0, 0, x.h(this.f7156d, i10), fVar.h());
        }
        this.f7156d = x.h(this.f7156d, i10);
        return this;
    }

    private final t B(int i10, Object obj, Object obj2, P.e eVar) {
        int iN = n(i10);
        if (this.f7155c != eVar) {
            return new t(i10 | this.f7153a, this.f7154b, x.g(this.f7156d, iN, obj, obj2), eVar);
        }
        this.f7156d = x.g(this.f7156d, iN, obj, obj2);
        this.f7153a = i10 | this.f7153a;
        return this;
    }

    private final t C(int i10, int i11, int i12, Object obj, Object obj2, int i13, P.e eVar) {
        if (this.f7155c != eVar) {
            return new t(this.f7153a ^ i11, i11 | this.f7154b, d(i10, i11, i12, obj, obj2, i13, eVar), eVar);
        }
        this.f7156d = d(i10, i11, i12, obj, obj2, i13, eVar);
        this.f7153a ^= i11;
        this.f7154b |= i11;
        return this;
    }

    private final t F(t tVar, int i10, int i11, P.b bVar, f fVar) {
        if (r(i10)) {
            t tVarN = N(O(i10));
            if (tVar.r(i10)) {
                return tVarN.E(tVar.N(tVar.O(i10)), i11 + 5, bVar, fVar);
            }
            if (!tVar.q(i10)) {
                return tVarN;
            }
            int iN = tVar.n(i10);
            Object objT = tVar.t(iN);
            Object objW = tVar.W(iN);
            int size = fVar.size();
            t tVarD = tVarN.D(objT != null ? objT.hashCode() : 0, objT, objW, i11 + 5, fVar);
            if (fVar.size() == size) {
                bVar.c(bVar.a() + 1);
            }
            return tVarD;
        }
        if (!tVar.r(i10)) {
            int iN2 = n(i10);
            Object objT2 = t(iN2);
            Object objW2 = W(iN2);
            int iN3 = tVar.n(i10);
            Object objT3 = tVar.t(iN3);
            return u(objT2 != null ? objT2.hashCode() : 0, objT2, objW2, objT3 != null ? objT3.hashCode() : 0, objT3, tVar.W(iN3), i11 + 5, fVar.h());
        }
        t tVarN2 = tVar.N(tVar.O(i10));
        if (!q(i10)) {
            return tVarN2;
        }
        int iN4 = n(i10);
        Object objT4 = t(iN4);
        int i12 = i11 + 5;
        if (!tVarN2.k(objT4 != null ? objT4.hashCode() : 0, objT4, i12)) {
            return tVarN2.D(objT4 != null ? objT4.hashCode() : 0, objT4, W(iN4), i12, fVar);
        }
        bVar.c(bVar.a() + 1);
        return tVarN2;
    }

    private final t I(int i10, int i11, f fVar) {
        fVar.n(fVar.size() - 1);
        fVar.k(W(i10));
        if (this.f7156d.length == 2) {
            return null;
        }
        if (this.f7155c != fVar.h()) {
            return new t(i11 ^ this.f7153a, this.f7154b, x.h(this.f7156d, i10), fVar.h());
        }
        this.f7156d = x.h(this.f7156d, i10);
        this.f7153a ^= i11;
        return this;
    }

    private final t J(int i10, int i11, P.e eVar) {
        Object[] objArr = this.f7156d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.f7155c != eVar) {
            return new t(this.f7153a, i11 ^ this.f7154b, x.i(objArr, i10), eVar);
        }
        this.f7156d = x.i(objArr, i10);
        this.f7154b ^= i11;
        return this;
    }

    private final t K(t tVar, t tVar2, int i10, int i11, P.e eVar) {
        if (tVar2 == null) {
            return J(i10, i11, eVar);
        }
        return (this.f7155c == eVar || tVar != tVar2) ? L(i10, tVar2, eVar) : this;
    }

    private final t L(int i10, t tVar, P.e eVar) {
        Object[] objArr = this.f7156d;
        if (objArr.length == 1 && tVar.f7156d.length == 2 && tVar.f7154b == 0) {
            tVar.f7153a = this.f7154b;
            return tVar;
        }
        if (this.f7155c == eVar) {
            objArr[i10] = tVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = tVar;
        return new t(this.f7153a, this.f7154b, objArrCopyOf, eVar);
    }

    private final t M(int i10, Object obj, f fVar) {
        if (this.f7155c == fVar.h()) {
            this.f7156d[i10 + 1] = obj;
            return this;
        }
        fVar.i(fVar.f() + 1);
        Object[] objArr = this.f7156d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10 + 1] = obj;
        return new t(this.f7153a, this.f7154b, objArrCopyOf, fVar.h());
    }

    private final t R(int i10, int i11) {
        Object[] objArr = this.f7156d;
        if (objArr.length == 2) {
            return null;
        }
        return new t(i11 ^ this.f7153a, this.f7154b, x.h(objArr, i10));
    }

    private final t S(int i10, int i11) {
        Object[] objArr = this.f7156d;
        if (objArr.length == 1) {
            return null;
        }
        return new t(this.f7153a, i11 ^ this.f7154b, x.i(objArr, i10));
    }

    private final t T(t tVar, t tVar2, int i10, int i11) {
        if (tVar2 == null) {
            return S(i10, i11);
        }
        return tVar != tVar2 ? U(i10, i11, tVar2) : this;
    }

    private final t U(int i10, int i11, t tVar) {
        Object[] objArr = tVar.f7156d;
        if (objArr.length != 2 || tVar.f7154b != 0) {
            Object[] objArr2 = this.f7156d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[i10] = tVar;
            return new t(this.f7153a, this.f7154b, objArrCopyOf);
        }
        if (this.f7156d.length == 1) {
            tVar.f7153a = this.f7154b;
            return tVar;
        }
        return new t(this.f7153a ^ i11, i11 ^ this.f7154b, x.k(this.f7156d, i10, n(i11), objArr[0], objArr[1]));
    }

    private final t V(int i10, Object obj) {
        Object[] objArr = this.f7156d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10 + 1] = obj;
        return new t(this.f7153a, this.f7154b, objArrCopyOf);
    }

    private final Object W(int i10) {
        return this.f7156d[i10 + 1];
    }

    private final b b() {
        return new b(this, 1);
    }

    private final b c() {
        return new b(this, 0);
    }

    private final Object[] d(int i10, int i11, int i12, Object obj, Object obj2, int i13, P.e eVar) {
        Object objT = t(i10);
        return x.j(this.f7156d, i10, O(i11) + 1, u(objT != null ? objT.hashCode() : 0, objT, W(i10), i12, obj, obj2, i13 + 5, eVar));
    }

    private final int e() {
        if (this.f7154b == 0) {
            return this.f7156d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f7153a);
        int length = this.f7156d.length;
        for (int i10 = iBitCount * 2; i10 < length; i10++) {
            iBitCount += N(i10).e();
        }
        return iBitCount;
    }

    private final boolean f(Object obj) {
        kotlin.ranges.b bVarR = kotlin.ranges.e.r(kotlin.ranges.e.t(0, this.f7156d.length), 2);
        int iG = bVarR.g();
        int iH = bVarR.h();
        int i10 = bVarR.i();
        if ((i10 > 0 && iG <= iH) || (i10 < 0 && iH <= iG)) {
            while (!Intrinsics.b(obj, this.f7156d[iG])) {
                if (iG != iH) {
                    iG += i10;
                }
            }
            return true;
        }
        return false;
    }

    private final Object g(Object obj) {
        kotlin.ranges.b bVarR = kotlin.ranges.e.r(kotlin.ranges.e.t(0, this.f7156d.length), 2);
        int iG = bVarR.g();
        int iH = bVarR.h();
        int i10 = bVarR.i();
        if ((i10 <= 0 || iG > iH) && (i10 >= 0 || iH > iG)) {
            return null;
        }
        while (!Intrinsics.b(obj, t(iG))) {
            if (iG == iH) {
                return null;
            }
            iG += i10;
        }
        return W(iG);
    }

    private final b h(Object obj, Object obj2) {
        kotlin.ranges.b bVarR = kotlin.ranges.e.r(kotlin.ranges.e.t(0, this.f7156d.length), 2);
        int iG = bVarR.g();
        int iH = bVarR.h();
        int i10 = bVarR.i();
        if ((i10 > 0 && iG <= iH) || (i10 < 0 && iH <= iG)) {
            while (!Intrinsics.b(obj, t(iG))) {
                if (iG != iH) {
                    iG += i10;
                }
            }
            if (obj2 == W(iG)) {
                return null;
            }
            Object[] objArr = this.f7156d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iG + 1] = obj2;
            return new t(0, 0, objArrCopyOf).c();
        }
        return new t(0, 0, x.g(this.f7156d, 0, obj, obj2)).b();
    }

    private final t i(Object obj) {
        kotlin.ranges.b bVarR = kotlin.ranges.e.r(kotlin.ranges.e.t(0, this.f7156d.length), 2);
        int iG = bVarR.g();
        int iH = bVarR.h();
        int i10 = bVarR.i();
        if ((i10 > 0 && iG <= iH) || (i10 < 0 && iH <= iG)) {
            while (!Intrinsics.b(obj, t(iG))) {
                if (iG != iH) {
                    iG += i10;
                }
            }
            return j(iG);
        }
        return this;
    }

    private final t j(int i10) {
        Object[] objArr = this.f7156d;
        if (objArr.length == 2) {
            return null;
        }
        return new t(0, 0, x.h(objArr, i10));
    }

    private final boolean l(t tVar) {
        if (this == tVar) {
            return true;
        }
        if (this.f7154b != tVar.f7154b || this.f7153a != tVar.f7153a) {
            return false;
        }
        int length = this.f7156d.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.f7156d[i10] != tVar.f7156d[i10]) {
                return false;
            }
        }
        return true;
    }

    private final boolean r(int i10) {
        return (i10 & this.f7154b) != 0;
    }

    private final t s(int i10, Object obj, Object obj2) {
        return new t(i10 | this.f7153a, this.f7154b, x.g(this.f7156d, n(i10), obj, obj2));
    }

    private final Object t(int i10) {
        return this.f7156d[i10];
    }

    private final t u(int i10, Object obj, Object obj2, int i11, Object obj3, Object obj4, int i12, P.e eVar) {
        if (i12 > 30) {
            return new t(0, 0, new Object[]{obj, obj2, obj3, obj4}, eVar);
        }
        int iF = x.f(i10, i12);
        int iF2 = x.f(i11, i12);
        if (iF != iF2) {
            return new t((1 << iF) | (1 << iF2), 0, iF < iF2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, eVar);
        }
        return new t(0, 1 << iF, new Object[]{u(i10, obj, obj2, i11, obj3, obj4, i12 + 5, eVar)}, eVar);
    }

    private final t v(int i10, int i11, int i12, Object obj, Object obj2, int i13) {
        return new t(this.f7153a ^ i11, this.f7154b | i11, d(i10, i11, i12, obj, obj2, i13, null));
    }

    private final t w(Object obj, Object obj2, f fVar) {
        kotlin.ranges.b bVarR = kotlin.ranges.e.r(kotlin.ranges.e.t(0, this.f7156d.length), 2);
        int iG = bVarR.g();
        int iH = bVarR.h();
        int i10 = bVarR.i();
        if ((i10 > 0 && iG <= iH) || (i10 < 0 && iH <= iG)) {
            while (!Intrinsics.b(obj, t(iG))) {
                if (iG != iH) {
                    iG += i10;
                }
            }
            fVar.k(W(iG));
            if (this.f7155c == fVar.h()) {
                this.f7156d[iG + 1] = obj2;
                return this;
            }
            fVar.i(fVar.f() + 1);
            Object[] objArr = this.f7156d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iG + 1] = obj2;
            return new t(0, 0, objArrCopyOf, fVar.h());
        }
        fVar.n(fVar.size() + 1);
        return new t(0, 0, x.g(this.f7156d, 0, obj, obj2), fVar.h());
    }

    private final t x(t tVar, P.b bVar, P.e eVar) {
        P.a.a(this.f7154b == 0);
        P.a.a(this.f7153a == 0);
        P.a.a(tVar.f7154b == 0);
        P.a.a(tVar.f7153a == 0);
        Object[] objArr = this.f7156d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + tVar.f7156d.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        int length = this.f7156d.length;
        kotlin.ranges.b bVarR = kotlin.ranges.e.r(kotlin.ranges.e.t(0, tVar.f7156d.length), 2);
        int iG = bVarR.g();
        int iH = bVarR.h();
        int i10 = bVarR.i();
        if ((i10 > 0 && iG <= iH) || (i10 < 0 && iH <= iG)) {
            while (true) {
                if (f(tVar.f7156d[iG])) {
                    bVar.c(bVar.a() + 1);
                } else {
                    Object[] objArr2 = tVar.f7156d;
                    objArrCopyOf[length] = objArr2[iG];
                    objArrCopyOf[length + 1] = objArr2[iG + 1];
                    length += 2;
                }
                if (iG == iH) {
                    break;
                }
                iG += i10;
            }
        }
        if (length == this.f7156d.length) {
            return this;
        }
        if (length == tVar.f7156d.length) {
            return tVar;
        }
        if (length == objArrCopyOf.length) {
            return new t(0, 0, objArrCopyOf, eVar);
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
        return new t(0, 0, objArrCopyOf2, eVar);
    }

    private final t y(Object obj, f fVar) {
        kotlin.ranges.b bVarR = kotlin.ranges.e.r(kotlin.ranges.e.t(0, this.f7156d.length), 2);
        int iG = bVarR.g();
        int iH = bVarR.h();
        int i10 = bVarR.i();
        if ((i10 > 0 && iG <= iH) || (i10 < 0 && iH <= iG)) {
            while (!Intrinsics.b(obj, t(iG))) {
                if (iG != iH) {
                    iG += i10;
                }
            }
            return A(iG, fVar);
        }
        return this;
    }

    private final t z(Object obj, Object obj2, f fVar) {
        kotlin.ranges.b bVarR = kotlin.ranges.e.r(kotlin.ranges.e.t(0, this.f7156d.length), 2);
        int iG = bVarR.g();
        int iH = bVarR.h();
        int i10 = bVarR.i();
        if ((i10 > 0 && iG <= iH) || (i10 < 0 && iH <= iG)) {
            while (true) {
                if (Intrinsics.b(obj, t(iG)) && Intrinsics.b(obj2, W(iG))) {
                    return A(iG, fVar);
                }
                if (iG != iH) {
                    iG += i10;
                }
            }
        }
        return this;
    }

    public final t D(int i10, Object obj, Object obj2, int i11, f fVar) {
        f fVar2;
        t tVarD;
        int iF = 1 << x.f(i10, i11);
        if (q(iF)) {
            int iN = n(iF);
            if (Intrinsics.b(obj, t(iN))) {
                fVar.k(W(iN));
                return W(iN) == obj2 ? this : M(iN, obj2, fVar);
            }
            fVar.n(fVar.size() + 1);
            return C(iN, iF, i10, obj, obj2, i11, fVar.h());
        }
        if (!r(iF)) {
            fVar.n(fVar.size() + 1);
            return B(iF, obj, obj2, fVar.h());
        }
        int iO = O(iF);
        t tVarN = N(iO);
        if (i11 == 30) {
            tVarD = tVarN.w(obj, obj2, fVar);
            fVar2 = fVar;
        } else {
            fVar2 = fVar;
            tVarD = tVarN.D(i10, obj, obj2, i11 + 5, fVar2);
        }
        return tVarN == tVarD ? this : L(iO, tVarD, fVar2.h());
    }

    public final t E(t tVar, int i10, P.b bVar, f fVar) {
        if (this == tVar) {
            bVar.b(e());
            return this;
        }
        int i11 = i10;
        if (i11 > 30) {
            return x(tVar, bVar, fVar.h());
        }
        int i12 = this.f7154b | tVar.f7154b;
        int i13 = this.f7153a;
        int i14 = tVar.f7153a;
        int i15 = (i13 ^ i14) & (~i12);
        int i16 = i13 & i14;
        while (i16 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i16);
            if (Intrinsics.b(t(n(iLowestOneBit)), tVar.t(tVar.n(iLowestOneBit)))) {
                i15 |= iLowestOneBit;
            } else {
                i12 |= iLowestOneBit;
            }
            i16 ^= iLowestOneBit;
        }
        int i17 = 0;
        if (!((i12 & i15) == 0)) {
            T0.b("Check failed.");
        }
        t tVar2 = (Intrinsics.b(this.f7155c, fVar.h()) && this.f7153a == i15 && this.f7154b == i12) ? this : new t(i15, i12, new Object[(Integer.bitCount(i15) * 2) + Integer.bitCount(i12)]);
        int i18 = i12;
        int i19 = 0;
        while (i18 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i18);
            Object[] objArr = tVar2.f7156d;
            objArr[(objArr.length - 1) - i19] = F(tVar, iLowestOneBit2, i11, bVar, fVar);
            i19++;
            i18 ^= iLowestOneBit2;
            i11 = i10;
        }
        while (i15 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i15);
            int i20 = i17 * 2;
            if (tVar.q(iLowestOneBit3)) {
                int iN = tVar.n(iLowestOneBit3);
                tVar2.f7156d[i20] = tVar.t(iN);
                tVar2.f7156d[i20 + 1] = tVar.W(iN);
                if (q(iLowestOneBit3)) {
                    bVar.c(bVar.a() + 1);
                }
            } else {
                int iN2 = n(iLowestOneBit3);
                tVar2.f7156d[i20] = t(iN2);
                tVar2.f7156d[i20 + 1] = W(iN2);
            }
            i17++;
            i15 ^= iLowestOneBit3;
        }
        if (l(tVar2)) {
            return this;
        }
        return tVar.l(tVar2) ? tVar : tVar2;
    }

    public final t G(int i10, Object obj, int i11, f fVar) {
        int iF = 1 << x.f(i10, i11);
        if (q(iF)) {
            int iN = n(iF);
            if (Intrinsics.b(obj, t(iN))) {
                return I(iN, iF, fVar);
            }
        } else if (r(iF)) {
            int iO = O(iF);
            t tVarN = N(iO);
            return K(tVarN, i11 == 30 ? tVarN.y(obj, fVar) : tVarN.G(i10, obj, i11 + 5, fVar), iO, iF, fVar.h());
        }
        return this;
    }

    public final t H(int i10, Object obj, Object obj2, int i11, f fVar) {
        int iF = 1 << x.f(i10, i11);
        if (q(iF)) {
            int iN = n(iF);
            if (Intrinsics.b(obj, t(iN)) && Intrinsics.b(obj2, W(iN))) {
                return I(iN, iF, fVar);
            }
        } else if (r(iF)) {
            int iO = O(iF);
            t tVarN = N(iO);
            return K(tVarN, i11 == 30 ? tVarN.z(obj, obj2, fVar) : tVarN.H(i10, obj, obj2, i11 + 5, fVar), iO, iF, fVar.h());
        }
        return this;
    }

    public final t N(int i10) {
        Object obj = this.f7156d[i10];
        Intrinsics.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (t) obj;
    }

    public final int O(int i10) {
        return (this.f7156d.length - 1) - Integer.bitCount((i10 - 1) & this.f7154b);
    }

    public final b P(int i10, Object obj, Object obj2, int i11) {
        b bVarP;
        int iF = 1 << x.f(i10, i11);
        if (q(iF)) {
            int iN = n(iF);
            if (!Intrinsics.b(obj, t(iN))) {
                return v(iN, iF, i10, obj, obj2, i11).b();
            }
            if (W(iN) == obj2) {
                return null;
            }
            return V(iN, obj2).c();
        }
        if (!r(iF)) {
            return s(iF, obj, obj2).b();
        }
        int iO = O(iF);
        t tVarN = N(iO);
        if (i11 == 30) {
            bVarP = tVarN.h(obj, obj2);
            if (bVarP == null) {
                return null;
            }
        } else {
            bVarP = tVarN.P(i10, obj, obj2, i11 + 5);
            if (bVarP == null) {
                return null;
            }
        }
        bVarP.c(U(iO, iF, bVarP.a()));
        return bVarP;
    }

    public final t Q(int i10, Object obj, int i11) {
        int iF = 1 << x.f(i10, i11);
        if (q(iF)) {
            int iN = n(iF);
            if (Intrinsics.b(obj, t(iN))) {
                return R(iN, iF);
            }
        } else if (r(iF)) {
            int iO = O(iF);
            t tVarN = N(iO);
            return T(tVarN, i11 == 30 ? tVarN.i(obj) : tVarN.Q(i10, obj, i11 + 5), iO, iF);
        }
        return this;
    }

    public final boolean k(int i10, Object obj, int i11) {
        int iF = 1 << x.f(i10, i11);
        if (q(iF)) {
            return Intrinsics.b(obj, t(n(iF)));
        }
        if (!r(iF)) {
            return false;
        }
        t tVarN = N(O(iF));
        return i11 == 30 ? tVarN.f(obj) : tVarN.k(i10, obj, i11 + 5);
    }

    public final int m() {
        return Integer.bitCount(this.f7153a);
    }

    public final int n(int i10) {
        return Integer.bitCount((i10 - 1) & this.f7153a) * 2;
    }

    public final Object o(int i10, Object obj, int i11) {
        int iF = 1 << x.f(i10, i11);
        if (q(iF)) {
            int iN = n(iF);
            if (Intrinsics.b(obj, t(iN))) {
                return W(iN);
            }
            return null;
        }
        if (!r(iF)) {
            return null;
        }
        t tVarN = N(O(iF));
        return i11 == 30 ? tVarN.g(obj) : tVarN.o(i10, obj, i11 + 5);
    }

    public final Object[] p() {
        return this.f7156d;
    }

    public final boolean q(int i10) {
        return (i10 & this.f7153a) != 0;
    }
}
