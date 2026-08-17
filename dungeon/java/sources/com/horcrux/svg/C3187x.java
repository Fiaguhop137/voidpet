package com.horcrux.svg;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* JADX INFO: renamed from: com.horcrux.svg.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C3187x {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final C3187x f38522p = new C3187x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final double f38523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f38524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final e0 f38525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ReadableMap f38526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    g0 f38527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f38528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final String f38529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final String f38530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final f0 f38531i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final h0 f38532j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final i0 f38533k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final double f38534l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final double f38535m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final double f38536n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final boolean f38537o;

    /* JADX INFO: renamed from: com.horcrux.svg.x$a */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final g0[] f38538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int[] f38539b;

        static {
            g0 g0Var = g0.w100;
            g0 g0Var2 = g0.w200;
            g0 g0Var3 = g0.w300;
            g0 g0Var4 = g0.Normal;
            g0 g0Var5 = g0.w500;
            g0 g0Var6 = g0.w600;
            g0 g0Var7 = g0.Bold;
            g0 g0Var8 = g0.w800;
            g0 g0Var9 = g0.w900;
            f38538a = new g0[]{g0Var, g0Var, g0Var2, g0Var3, g0Var4, g0Var5, g0Var6, g0Var7, g0Var8, g0Var9, g0Var9};
            f38539b = new int[]{400, 700, 100, 200, 300, 400, 500, 600, 700, 800, 900};
        }

        private static int a(int i10) {
            if (i10 < 350) {
                return 400;
            }
            if (i10 < 550) {
                return 700;
            }
            if (i10 < 900) {
                return 900;
            }
            return i10;
        }

        static int b(g0 g0Var, C3187x c3187x) {
            if (g0Var == g0.Bolder) {
                return a(c3187x.f38528f);
            }
            return g0Var == g0.Lighter ? c(c3187x.f38528f) : f38539b[g0Var.ordinal()];
        }

        private static int c(int i10) {
            if (i10 < 100) {
                return i10;
            }
            if (i10 < 550) {
                return 100;
            }
            return i10 < 750 ? 400 : 700;
        }

        static g0 d(int i10) {
            return f38538a[Math.round(i10 / 100.0f)];
        }
    }

    private C3187x() {
        this.f38526d = null;
        this.f38524b = "";
        this.f38525c = e0.normal;
        this.f38527e = g0.Normal;
        this.f38528f = 400;
        this.f38529g = "";
        this.f38530h = "";
        this.f38531i = f0.normal;
        this.f38532j = h0.start;
        this.f38533k = i0.None;
        this.f38537o = false;
        this.f38534l = 0.0d;
        this.f38523a = 12.0d;
        this.f38535m = 0.0d;
        this.f38536n = 0.0d;
    }

    C3187x(ReadableMap readableMap, C3187x c3187x, double d10) {
        double d11 = c3187x.f38523a;
        if (readableMap.hasKey("fontSize")) {
            this.f38523a = c(readableMap, "fontSize", 1.0d, d11, d11);
        } else {
            this.f38523a = d11;
        }
        if (!readableMap.hasKey("fontWeight")) {
            b(c3187x);
        } else if (readableMap.getType("fontWeight") == ReadableType.Number) {
            a(c3187x, readableMap.getDouble("fontWeight"));
        } else {
            String string = readableMap.getString("fontWeight");
            if (g0.h(string)) {
                int iB = a.b(g0.g(string), c3187x);
                this.f38528f = iB;
                this.f38527e = a.d(iB);
            } else if (string != null) {
                a(c3187x, Double.parseDouble(string));
            } else {
                b(c3187x);
            }
        }
        this.f38526d = readableMap.hasKey("fontData") ? readableMap.getMap("fontData") : c3187x.f38526d;
        this.f38524b = readableMap.hasKey("fontFamily") ? readableMap.getString("fontFamily") : c3187x.f38524b;
        this.f38525c = readableMap.hasKey("fontStyle") ? e0.valueOf(readableMap.getString("fontStyle")) : c3187x.f38525c;
        this.f38529g = readableMap.hasKey("fontFeatureSettings") ? readableMap.getString("fontFeatureSettings") : c3187x.f38529g;
        this.f38530h = readableMap.hasKey("fontVariationSettings") ? readableMap.getString("fontVariationSettings") : c3187x.f38530h;
        this.f38531i = readableMap.hasKey("fontVariantLigatures") ? f0.valueOf(readableMap.getString("fontVariantLigatures")) : c3187x.f38531i;
        this.f38532j = readableMap.hasKey("textAnchor") ? h0.valueOf(readableMap.getString("textAnchor")) : c3187x.f38532j;
        this.f38533k = readableMap.hasKey("textDecoration") ? i0.g(readableMap.getString("textDecoration")) : c3187x.f38533k;
        boolean zHasKey = readableMap.hasKey("kerning");
        this.f38537o = zHasKey || c3187x.f38537o;
        this.f38534l = zHasKey ? c(readableMap, "kerning", d10, this.f38523a, 0.0d) : c3187x.f38534l;
        this.f38535m = readableMap.hasKey("wordSpacing") ? c(readableMap, "wordSpacing", d10, this.f38523a, 0.0d) : c3187x.f38535m;
        this.f38536n = readableMap.hasKey("letterSpacing") ? c(readableMap, "letterSpacing", d10, this.f38523a, 0.0d) : c3187x.f38536n;
    }

    private void a(C3187x c3187x, double d10) {
        long jRound = Math.round(d10);
        if (jRound < 1 || jRound > 1000) {
            b(c3187x);
            return;
        }
        int i10 = (int) jRound;
        this.f38528f = i10;
        this.f38527e = a.d(i10);
    }

    private void b(C3187x c3187x) {
        this.f38528f = c3187x.f38528f;
        this.f38527e = c3187x.f38527e;
    }

    private double c(ReadableMap readableMap, String str, double d10, double d11, double d12) {
        return readableMap.getType(str) == ReadableType.Number ? readableMap.getDouble(str) : M.b(readableMap.getString(str), d12, d10, d11);
    }
}
