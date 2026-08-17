package com.horcrux.svg;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
class N {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ArrayList f38237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f38238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static L f38239f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static L f38240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static L f38241h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static L f38242i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f38243j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    O f38244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    L f38245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    double f38246c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f38247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f38248b;

        static {
            int[] iArr = new int[EnumC3170g.values().length];
            f38248b = iArr;
            try {
                iArr[EnumC3170g.kCGPathElementAddCurveToPoint.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38248b[EnumC3170g.kCGPathElementAddQuadCurveToPoint.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38248b[EnumC3170g.kCGPathElementMoveToPoint.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38248b[EnumC3170g.kCGPathElementAddLineToPoint.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38248b[EnumC3170g.kCGPathElementCloseSubpath.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[O.values().length];
            f38247a = iArr2;
            try {
                iArr2[O.kStartMarker.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f38247a[O.kMidMarker.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f38247a[O.kEndMarker.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private N(O o10, L l10, double d10) {
        this.f38244a = o10;
        this.f38245b = l10;
        this.f38246c = d10;
    }

    private static double a(double d10, double d11) {
        if (Math.abs(d10 - d11) > 180.0d) {
            d10 += 360.0d;
        }
        return (d10 + d11) / 2.0d;
    }

    private static void b(S s10, L l10, L l11, L l12) {
        s10.f38271a = k(l11, l10);
        s10.f38272b = k(l12, l11);
        if (i(s10.f38271a)) {
            s10.f38271a = s10.f38272b;
        } else if (i(s10.f38272b)) {
            s10.f38272b = s10.f38271a;
        }
    }

    private static double c(O o10) {
        double dJ = j(f(f38241h));
        double dJ2 = j(f(f38242i));
        int i10 = a.f38247a[o10.ordinal()];
        if (i10 == 1) {
            return f38243j ? dJ2 + 180.0d : dJ2;
        }
        if (i10 == 2) {
            return a(dJ, dJ2);
        }
        if (i10 != 3) {
            return 0.0d;
        }
        return dJ;
    }

    private static S d(H h10) {
        S s10 = new S();
        L[] lArr = h10.f38205b;
        int i10 = a.f38248b[h10.f38204a.ordinal()];
        if (i10 == 1) {
            s10.f38273c = lArr[2];
            s10.f38271a = k(lArr[0], f38239f);
            s10.f38272b = k(lArr[2], lArr[1]);
            if (i(s10.f38271a)) {
                b(s10, lArr[0], lArr[1], lArr[2]);
                return s10;
            }
            if (i(s10.f38272b)) {
                b(s10, f38239f, lArr[0], lArr[1]);
            }
        } else {
            if (i10 == 2) {
                L l10 = lArr[1];
                s10.f38273c = l10;
                b(s10, f38239f, lArr[0], l10);
                return s10;
            }
            if (i10 == 3 || i10 == 4) {
                L l11 = lArr[0];
                s10.f38273c = l11;
                s10.f38271a = k(l11, f38239f);
                s10.f38272b = k(s10.f38273c, f38239f);
                return s10;
            }
            if (i10 == 5) {
                L l12 = f38240g;
                s10.f38273c = l12;
                s10.f38271a = k(l12, f38239f);
                s10.f38272b = k(s10.f38273c, f38239f);
                return s10;
            }
        }
        return s10;
    }

    private static void e() {
        O o10 = O.kEndMarker;
        f38237d.add(new N(o10, f38239f, c(o10)));
    }

    private static double f(L l10) {
        return Math.atan2(l10.f38235b, l10.f38234a);
    }

    private static void g(H h10) {
        S sD = d(h10);
        f38242i = sD.f38271a;
        int i10 = f38238e;
        if (i10 > 0) {
            O o10 = i10 == 1 ? O.kStartMarker : O.kMidMarker;
            f38237d.add(new N(o10, f38239f, c(o10)));
        }
        f38241h = sD.f38272b;
        f38239f = sD.f38273c;
        EnumC3170g enumC3170g = h10.f38204a;
        if (enumC3170g == EnumC3170g.kCGPathElementMoveToPoint) {
            f38240g = h10.f38205b[0];
        } else if (enumC3170g == EnumC3170g.kCGPathElementCloseSubpath) {
            f38240g = new L(0.0d, 0.0d);
        }
        f38238e++;
    }

    static ArrayList h(ArrayList arrayList) {
        f38237d = new ArrayList();
        f38238e = 0;
        f38239f = new L(0.0d, 0.0d);
        f38240g = new L(0.0d, 0.0d);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g((H) it.next());
        }
        e();
        return f38237d;
    }

    private static boolean i(L l10) {
        return l10.f38234a == 0.0d && l10.f38235b == 0.0d;
    }

    private static double j(double d10) {
        return d10 * 57.29577951308232d;
    }

    private static L k(L l10, L l11) {
        return new L(l11.f38234a - l10.f38234a, l11.f38235b - l10.f38235b);
    }
}
