package com.horcrux.svg;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
abstract class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static float f38206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f38207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f38208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f38209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Path f38210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static ArrayList f38211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static float f38212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static float f38213h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static float f38214i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static float f38215j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static float f38216k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static float f38217l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static boolean f38218m;

    private static void A(float f10, float f11, float f12, float f13) {
        float f14 = (f38212g * 2.0f) - f38214i;
        float f15 = (f38213h * 2.0f) - f38215j;
        f38214i = f10;
        f38215j = f11;
        e(f14, f15, f10, f11, f12, f13);
    }

    private static void B(float f10, float f11) {
        C(f10 + f38212g, f11 + f38213h);
    }

    private static void C(float f10, float f11) {
        u((f38212g * 2.0f) - f38214i, (f38213h * 2.0f) - f38215j, f10, f11);
    }

    private static void a(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
        b(f10, f11, f12, z10, z11, f13 + f38212g, f14 + f38213h);
    }

    private static void b(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
        float f15;
        float f16;
        float f17;
        float f18;
        float f19 = f38212g;
        float f20 = f38213h;
        if (f11 == 0.0f) {
            f15 = f10 == 0.0f ? f14 - f20 : f10;
        } else {
            f15 = f11;
        }
        float fAbs = Math.abs(f15);
        float fAbs2 = Math.abs(f10 == 0.0f ? f13 - f19 : f10);
        if (fAbs2 == 0.0f || fAbs == 0.0f || (f13 == f19 && f14 == f20)) {
            l(f13, f14);
            return;
        }
        float radians = (float) Math.toRadians(f12);
        double d10 = radians;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        float f21 = f13 - f19;
        float f22 = f14 - f20;
        float f23 = ((fCos * f21) / 2.0f) + ((fSin * f22) / 2.0f);
        float f24 = -fSin;
        float f25 = ((f24 * f21) / 2.0f) + ((fCos * f22) / 2.0f);
        float f26 = fAbs2 * fAbs2;
        float f27 = f26 * fAbs * fAbs;
        float f28 = fAbs * fAbs * f23 * f23;
        float f29 = f26 * f25 * f25;
        float f30 = (f27 - f29) - f28;
        if (f30 < 0.0f) {
            float fSqrt = (float) Math.sqrt(1.0f - (f30 / f27));
            fAbs2 *= fSqrt;
            f18 = fAbs * fSqrt;
            f17 = f21 / 2.0f;
            f16 = f22 / 2.0f;
        } else {
            float fSqrt2 = (float) Math.sqrt(f30 / (f29 + f28));
            if (z10 == z11) {
                fSqrt2 = -fSqrt2;
            }
            float f31 = (((-fSqrt2) * f25) * fAbs2) / fAbs;
            float f32 = ((fSqrt2 * f23) * fAbs) / fAbs2;
            f16 = (f22 / 2.0f) + (f31 * fSin) + (f32 * fCos);
            f17 = ((fCos * f31) - (fSin * f32)) + (f21 / 2.0f);
            f18 = fAbs;
        }
        float f33 = fCos / fAbs2;
        float f34 = fSin / fAbs2;
        float f35 = f24 / f18;
        float f36 = fCos / f18;
        float f37 = -f17;
        float f38 = -f16;
        float f39 = f17;
        float fAtan2 = (float) Math.atan2((f35 * f37) + (f36 * f38), (f37 * f33) + (f34 * f38));
        float f40 = f21 - f39;
        float f41 = f22 - f16;
        float fAtan3 = (float) Math.atan2((f35 * f40) + (f36 * f41), (f33 * f40) + (f34 * f41));
        float f42 = f39 + f19;
        float f43 = f16 + f20;
        float f44 = f21 + f19;
        float f45 = f22 + f20;
        w();
        f38214i = f44;
        f38212g = f44;
        f38215j = f45;
        f38213h = f45;
        if (fAbs2 != f18 || radians != 0) {
            c(f42, f43, fAbs2, f18, fAtan2, fAtan3, z11, radians);
            return;
        }
        float degrees = (float) Math.toDegrees(fAtan2);
        float fAbs3 = Math.abs((degrees - ((float) Math.toDegrees(fAtan3))) % 360.0f);
        if (!z10 ? fAbs3 > 180.0f : fAbs3 < 180.0f) {
            fAbs3 = 360.0f - fAbs3;
        }
        if (!z11) {
            fAbs3 = -fAbs3;
        }
        float f46 = f38206a;
        f38210e.arcTo(new RectF((f42 - fAbs2) * f46, (f43 - fAbs2) * f46, (f42 + fAbs2) * f46, (f43 + fAbs2) * f46), degrees, fAbs3);
        f38211f.add(new H(EnumC3170g.kCGPathElementAddCurveToPoint, new L[]{new L(f44, f45)}));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0067 A[LOOP:0: B:12:0x0065->B:13:0x0067, LOOP_END] */
    private static void c(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, float f16) {
        double d10;
        int iCeil;
        float f17;
        float fTan;
        float fCos;
        float fSin;
        int i10;
        float f18 = f14;
        double d11 = f16;
        float fCos2 = (float) Math.cos(d11);
        float fSin2 = (float) Math.sin(d11);
        float f19 = fCos2 * f12;
        float f20 = (-fSin2) * f13;
        float f21 = fSin2 * f12;
        float f22 = fCos2 * f13;
        float f23 = f15 - f18;
        if (f23 >= 0.0f || !z10) {
            if (f23 > 0.0f && !z10) {
                d10 = ((double) f23) - 6.283185307179586d;
            }
            iCeil = (int) Math.ceil(Math.abs(v(((double) f23) / 1.5707963267948966d)));
            f17 = f23 / iCeil;
            fTan = (float) (Math.tan(f17 / 4.0f) * 1.3333333333333333d);
            double d12 = f18;
            fCos = (float) Math.cos(d12);
            fSin = (float) Math.sin(d12);
            i10 = 0;
            while (i10 < iCeil) {
                float f24 = fCos - (fTan * fSin);
                float f25 = fSin + (fCos * fTan);
                float f26 = f18 + f17;
                double d13 = f26;
                float fCos3 = (float) Math.cos(d13);
                float fSin3 = (float) Math.sin(d13);
                float f27 = (fTan * fSin3) + fCos3;
                float f28 = fSin3 - (fTan * fCos3);
                float f29 = f10 + (f19 * f24) + (f20 * f25);
                float f30 = f11 + (f24 * f21) + (f25 * f22);
                float f31 = f10 + (f19 * f27) + (f20 * f28);
                float f32 = f11 + (f27 * f21) + (f28 * f22);
                float f33 = f10 + (f19 * fCos3) + (f20 * fSin3);
                float f34 = f11 + (f21 * fCos3) + (f22 * fSin3);
                Path path = f38210e;
                float f35 = f38206a;
                path.cubicTo(f29 * f35, f30 * f35, f31 * f35, f32 * f35, f33 * f35, f35 * f34);
                float f36 = f17;
                f38211f.add(new H(EnumC3170g.kCGPathElementAddCurveToPoint, new L[]{new L(f29, f30), new L(f31, f32), new L(f33, f34)}));
                i10++;
                f18 = f26;
                f22 = f22;
                f17 = f36;
                f21 = f21;
                fSin = fSin3;
                f19 = f19;
                f20 = f20;
                iCeil = iCeil;
                fCos = fCos3;
            }
        }
        d10 = ((double) f23) + 6.283185307179586d;
        f23 = (float) d10;
        iCeil = (int) Math.ceil(Math.abs(v(((double) f23) / 1.5707963267948966d)));
        f17 = f23 / iCeil;
        fTan = (float) (Math.tan(f17 / 4.0f) * 1.3333333333333333d);
        double d14 = f18;
        fCos = (float) Math.cos(d14);
        fSin = (float) Math.sin(d14);
        i10 = 0;
        while (i10 < iCeil) {
            float f210 = fCos - (fTan * fSin);
            float f211 = fSin + (fCos * fTan);
            float f212 = f18 + f17;
            double d15 = f212;
            float fCos4 = (float) Math.cos(d15);
            float fSin4 = (float) Math.sin(d15);
            float f213 = (fTan * fSin4) + fCos4;
            float f214 = fSin4 - (fTan * fCos4);
            float f215 = f10 + (f19 * f210) + (f20 * f211);
            float f37 = f11 + (f210 * f21) + (f211 * f22);
            float f38 = f10 + (f19 * f213) + (f20 * f214);
            float f39 = f11 + (f213 * f21) + (f214 * f22);
            float f310 = f10 + (f19 * fCos4) + (f20 * fSin4);
            float f311 = f11 + (f21 * fCos4) + (f22 * fSin4);
            Path path2 = f38210e;
            float f312 = f38206a;
            path2.cubicTo(f215 * f312, f37 * f312, f38 * f312, f39 * f312, f310 * f312, f312 * f311);
            float f313 = f17;
            f38211f.add(new H(EnumC3170g.kCGPathElementAddCurveToPoint, new L[]{new L(f215, f37), new L(f38, f39), new L(f310, f311)}));
            i10++;
            f18 = f212;
            f22 = f22;
            f17 = f313;
            f21 = f21;
            fSin = fSin4;
            f19 = f19;
            f20 = f20;
            iCeil = iCeil;
            fCos = fCos4;
        }
    }

    private static void d() {
        if (f38218m) {
            f38212g = f38216k;
            f38213h = f38217l;
            f38218m = false;
            f38210e.close();
            f38211f.add(new H(EnumC3170g.kCGPathElementCloseSubpath, new L[]{new L(f38212g, f38213h)}));
        }
    }

    private static void e(float f10, float f11, float f12, float f13, float f14, float f15) {
        w();
        f38212g = f14;
        f38213h = f15;
        Path path = f38210e;
        float f16 = f38206a;
        path.cubicTo(f10 * f16, f11 * f16, f12 * f16, f13 * f16, f14 * f16, f16 * f15);
        f38211f.add(new H(EnumC3170g.kCGPathElementAddCurveToPoint, new L[]{new L(f10, f11), new L(f12, f13), new L(f14, f15)}));
    }

    private static void f(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f38212g;
        float f17 = f38213h;
        g(f10 + f16, f11 + f17, f12 + f16, f13 + f17, f14 + f16, f15 + f17);
    }

    private static void g(float f10, float f11, float f12, float f13, float f14, float f15) {
        f38214i = f12;
        f38215j = f13;
        e(f10, f11, f12, f13, f14, f15);
    }

    private static boolean h(char c10) {
        return Character.isUpperCase(c10);
    }

    private static boolean i(char c10) {
        switch (c10) {
            case 'A':
            case 'C':
            case 'H':
            case 'L':
            case 'M':
            case 'Q':
            case 'S':
            case 'T':
            case 'V':
            case 'Z':
            case 'a':
            case 'c':
            case 'h':
            case 'l':
            case 'm':
            case 'q':
            case 's':
            case 't':
            case 'v':
            case 'z':
                return true;
            default:
                return false;
        }
    }

    private static boolean j(char c10) {
        return (c10 >= '0' && c10 <= '9') || c10 == '.' || c10 == '-' || c10 == '+';
    }

    private static void k(float f10, float f11) {
        l(f10 + f38212g, f11 + f38213h);
    }

    private static void l(float f10, float f11) {
        w();
        f38212g = f10;
        f38214i = f10;
        f38213h = f11;
        f38215j = f11;
        Path path = f38210e;
        float f12 = f38206a;
        path.lineTo(f10 * f12, f12 * f11);
        f38211f.add(new H(EnumC3170g.kCGPathElementAddLineToPoint, new L[]{new L(f10, f11)}));
    }

    private static void m(float f10, float f11) {
        n(f10 + f38212g, f11 + f38213h);
    }

    private static void n(float f10, float f11) {
        f38212g = f10;
        f38214i = f10;
        f38216k = f10;
        f38213h = f11;
        f38215j = f11;
        f38217l = f11;
        Path path = f38210e;
        float f12 = f38206a;
        path.moveTo(f10 * f12, f12 * f11);
        f38211f.add(new H(EnumC3170g.kCGPathElementMoveToPoint, new L[]{new L(f10, f11)}));
    }

    static Path o(String str) {
        f38211f = new ArrayList();
        Path path = new Path();
        f38210e = path;
        if (str == null) {
            return path;
        }
        f38208c = str.length();
        f38209d = str;
        f38207b = 0;
        f38212g = 0.0f;
        f38213h = 0.0f;
        f38214i = 0.0f;
        f38215j = 0.0f;
        f38216k = 0.0f;
        f38217l = 0.0f;
        f38218m = false;
        char c10 = ' ';
        while (f38207b < f38208c) {
            y();
            int i10 = f38207b;
            if (i10 >= f38208c) {
                return f38210e;
            }
            boolean z10 = true;
            boolean z11 = c10 != ' ';
            char cCharAt = f38209d.charAt(i10);
            if (!z11 && cCharAt != 'M' && cCharAt != 'm') {
                throw new IllegalArgumentException(String.format("Unexpected character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt), Integer.valueOf(f38207b), f38209d));
            }
            if (i(cCharAt)) {
                f38207b++;
                z10 = false;
                c10 = cCharAt;
            } else {
                if (!j(cCharAt) || !z11) {
                    throw new IllegalArgumentException(String.format("Unexpected character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt), Integer.valueOf(f38207b), f38209d));
                }
                if (c10 == 'Z' || c10 == 'z') {
                    throw new IllegalArgumentException(String.format("Unexpected number after 'z' (s=%s)", f38209d));
                }
                if (c10 == 'M' || c10 == 'm') {
                    c10 = h(c10) ? 'L' : 'l';
                } else {
                    z10 = false;
                }
            }
            boolean zH = h(c10);
            switch (c10) {
                case 'A':
                    b(q(), q(), q(), p(), p(), q(), q());
                    break;
                case 'C':
                    g(q(), q(), q(), q(), q(), q());
                    break;
                case 'H':
                    l(q(), f38213h);
                    break;
                case 'L':
                    l(q(), q());
                    break;
                case 'M':
                    n(q(), q());
                    break;
                case 'Q':
                    u(q(), q(), q(), q());
                    break;
                case 'S':
                    A(q(), q(), q(), q());
                    break;
                case 'T':
                    C(q(), q());
                    break;
                case 'V':
                    l(f38212g, q());
                    break;
                case 'Z':
                case 'z':
                    d();
                    break;
                case 'a':
                    a(q(), q(), q(), p(), p(), q(), q());
                    break;
                case 'c':
                    f(q(), q(), q(), q(), q(), q());
                    break;
                case 'h':
                    k(q(), 0.0f);
                    break;
                case 'l':
                    k(q(), q());
                    break;
                case 'm':
                    m(q(), q());
                    break;
                case 'q':
                    t(q(), q(), q(), q());
                    break;
                case 's':
                    z(q(), q(), q(), q());
                    break;
                case 't':
                    B(q(), q());
                    break;
                case 'v':
                    k(0.0f, q());
                    break;
                default:
                    throw new IllegalArgumentException(String.format("Unexpected comand '%c' (s=%s)", Character.valueOf(c10), f38209d));
            }
            if (z10) {
                c10 = zH ? 'M' : 'm';
            }
        }
        return f38210e;
    }

    private static boolean p() {
        y();
        char cCharAt = f38209d.charAt(f38207b);
        if (cCharAt != '0' && cCharAt != '1') {
            throw new Error(String.format("Unexpected flag '%c' (i=%d, s=%s)", Character.valueOf(cCharAt), Integer.valueOf(f38207b), f38209d));
        }
        int i10 = f38207b + 1;
        f38207b = i10;
        if (i10 < f38208c && f38209d.charAt(i10) == ',') {
            f38207b++;
        }
        y();
        return cCharAt == '1';
    }

    private static float q() {
        if (f38207b == f38208c) {
            throw new Error(String.format("Unexpected end (s=%s)", f38209d));
        }
        float fS = s();
        y();
        r();
        return fS;
    }

    private static void r() {
        int i10 = f38207b;
        if (i10 >= f38208c || f38209d.charAt(i10) != ',') {
            return;
        }
        f38207b++;
    }

    private static float s() {
        char cCharAt;
        y();
        int i10 = f38207b;
        if (i10 == f38208c) {
            throw new Error(String.format("Unexpected end (s=%s)", f38209d));
        }
        char cCharAt2 = f38209d.charAt(i10);
        if (cCharAt2 == '-' || cCharAt2 == '+') {
            int i11 = f38207b + 1;
            f38207b = i11;
            cCharAt2 = f38209d.charAt(i11);
        }
        if (cCharAt2 >= '0' && cCharAt2 <= '9') {
            x();
            int i12 = f38207b;
            if (i12 < f38208c) {
                cCharAt2 = f38209d.charAt(i12);
            }
        } else if (cCharAt2 != '.') {
            throw new IllegalArgumentException(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt2), Integer.valueOf(f38207b), f38209d));
        }
        if (cCharAt2 == '.') {
            f38207b++;
            x();
            int i13 = f38207b;
            if (i13 < f38208c) {
                cCharAt2 = f38209d.charAt(i13);
            }
        }
        if (cCharAt2 == 'e' || cCharAt2 == 'E') {
            int i14 = f38207b;
            if (i14 + 1 < f38208c && (cCharAt = f38209d.charAt(i14 + 1)) != 'm' && cCharAt != 'x') {
                int i15 = f38207b + 1;
                f38207b = i15;
                char cCharAt3 = f38209d.charAt(i15);
                if (cCharAt3 == '+' || cCharAt3 == '-') {
                    f38207b++;
                    x();
                } else {
                    if (cCharAt3 < '0' || cCharAt3 > '9') {
                        throw new IllegalArgumentException(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt3), Integer.valueOf(f38207b), f38209d));
                    }
                    x();
                }
            }
        }
        String strSubstring = f38209d.substring(i10, f38207b);
        float f10 = Float.parseFloat(strSubstring);
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            throw new IllegalArgumentException(String.format("Invalid number '%s' (start=%d, i=%d, s=%s)", strSubstring, Integer.valueOf(i10), Integer.valueOf(f38207b), f38209d));
        }
        return f10;
    }

    private static void t(float f10, float f11, float f12, float f13) {
        float f14 = f38212g;
        float f15 = f38213h;
        u(f10 + f14, f11 + f15, f12 + f14, f13 + f15);
    }

    private static void u(float f10, float f11, float f12, float f13) {
        f38214i = f10;
        f38215j = f11;
        float f14 = f10 * 2.0f;
        float f15 = f11 * 2.0f;
        e((f38212g + f14) / 3.0f, (f38213h + f15) / 3.0f, (f12 + f14) / 3.0f, (f13 + f15) / 3.0f, f12, f13);
    }

    private static double v(double d10) {
        double dPow = Math.pow(10.0d, 4.0d);
        return Math.round(d10 * dPow) / dPow;
    }

    private static void w() {
        if (f38218m) {
            return;
        }
        f38216k = f38212g;
        f38217l = f38213h;
        f38218m = true;
    }

    private static void x() {
        while (true) {
            int i10 = f38207b;
            if (i10 >= f38208c || !Character.isDigit(f38209d.charAt(i10))) {
                return;
            } else {
                f38207b++;
            }
        }
    }

    private static void y() {
        while (true) {
            int i10 = f38207b;
            if (i10 >= f38208c || !Character.isWhitespace(f38209d.charAt(i10))) {
                return;
            } else {
                f38207b++;
            }
        }
    }

    private static void z(float f10, float f11, float f12, float f13) {
        float f14 = f38212g;
        float f15 = f38213h;
        A(f10 + f14, f11 + f15, f12 + f14, f13 + f15);
    }
}
