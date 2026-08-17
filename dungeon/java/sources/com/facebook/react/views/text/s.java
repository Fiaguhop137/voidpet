package com.facebook.react.views.text;

import android.os.Build;
import android.text.TextUtils;
import com.facebook.react.uimanager.H;
import com.facebook.react.uimanager.J;
import com.facebook.react.uimanager.X;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class s {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final int f31087F = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f31097e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f31099g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected float f31093a = Float.NaN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f31094b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f31095c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected float f31096d = Float.NaN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected boolean f31098f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected float f31100h = Float.NaN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f31101i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f31102j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected float f31103k = -1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected float f31104l = -1.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected float f31105m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int f31106n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected int f31107o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected v f31108p = v.NONE;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected float f31109q = 0.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected float f31110r = 0.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected float f31111s = 0.0f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected int f31112t = 1426063360;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f31113u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected boolean f31114v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected boolean f31115w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected J.d f31116x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected J.e f31117y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected int f31118z = -1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    protected int f31088A = -1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    protected String f31089B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    protected String f31090C = null;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    protected boolean f31091D = false;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected float f31092E = Float.NaN;

    private s() {
    }

    private void C(String str) {
        if (str == null) {
            this.f31116x = null;
        } else {
            this.f31116x = J.d.h(str);
        }
    }

    private void D(boolean z10) {
        if (z10 != this.f31095c) {
            this.f31095c = z10;
            H(this.f31103k);
            N(this.f31104l);
        }
    }

    private void E(Integer num) {
        this.f31098f = num != null;
        if (num != null) {
            this.f31099g = num.intValue();
        }
    }

    private void F(Integer num) {
        this.f31094b = num != null;
        if (num != null) {
            this.f31097e = num.intValue();
        }
    }

    private void G(String str) {
        this.f31089B = str;
    }

    private void H(float f10) {
        this.f31103k = f10;
        if (f10 != -1.0f) {
            f10 = (float) (this.f31095c ? Math.ceil(H.l(f10, this.f31096d)) : Math.ceil(H.i(f10)));
        }
        this.f31102j = (int) f10;
    }

    private void I(String str) {
        this.f31118z = q.b(str);
    }

    private void J(com.facebook.react.common.mapbuffer.a aVar) {
        if (aVar == null || aVar.getCount() == 0) {
            this.f31090C = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = aVar.iterator();
        while (it.hasNext()) {
            String strB = ((com.facebook.react.common.mapbuffer.a.c) it.next()).b();
            if (strB != null) {
                switch (strB) {
                    case "stylistic-thirteen":
                        arrayList.add("'ss13'");
                        break;
                    case "stylistic-fifteen":
                        arrayList.add("'ss15'");
                        break;
                    case "stylistic-eighteen":
                        arrayList.add("'ss18'");
                        break;
                    case "proportional-nums":
                        arrayList.add("'pnum'");
                        break;
                    case "lining-nums":
                        arrayList.add("'lnum'");
                        break;
                    case "tabular-nums":
                        arrayList.add("'tnum'");
                        break;
                    case "oldstyle-nums":
                        arrayList.add("'onum'");
                        break;
                    case "stylistic-eight":
                        arrayList.add("'ss08'");
                        break;
                    case "stylistic-seven":
                        arrayList.add("'ss07'");
                        break;
                    case "stylistic-three":
                        arrayList.add("'ss03'");
                        break;
                    case "stylistic-eleven":
                        arrayList.add("'ss11'");
                        break;
                    case "stylistic-five":
                        arrayList.add("'ss05'");
                        break;
                    case "stylistic-four":
                        arrayList.add("'ss04'");
                        break;
                    case "stylistic-nine":
                        arrayList.add("'ss09'");
                        break;
                    case "stylistic-one":
                        arrayList.add("'ss01'");
                        break;
                    case "stylistic-six":
                        arrayList.add("'ss06'");
                        break;
                    case "stylistic-ten":
                        arrayList.add("'ss10'");
                        break;
                    case "stylistic-two":
                        arrayList.add("'ss02'");
                        break;
                    case "stylistic-sixteen":
                        arrayList.add("'ss16'");
                        break;
                    case "stylistic-twelve":
                        arrayList.add("'ss12'");
                        break;
                    case "stylistic-twenty":
                        arrayList.add("'ss20'");
                        break;
                    case "small-caps":
                        arrayList.add("'smcp'");
                        break;
                    case "stylistic-nineteen":
                        arrayList.add("'ss19'");
                        break;
                    case "stylistic-fourteen":
                        arrayList.add("'ss14'");
                        break;
                    case "stylistic-seventeen":
                        arrayList.add("'ss17'");
                        break;
                }
            }
        }
        this.f31090C = TextUtils.join(", ", arrayList);
    }

    private void K(String str) {
        this.f31088A = q.d(str);
    }

    private void L(String str) {
        this.f31107o = n(str);
    }

    private void M(float f10) {
        this.f31105m = f10;
    }

    private void N(float f10) {
        this.f31104l = f10;
        if (f10 == -1.0f) {
            this.f31093a = Float.NaN;
        } else {
            this.f31093a = this.f31095c ? H.k(f10) : H.i(f10);
        }
    }

    private void O(float f10) {
        if (f10 != this.f31096d) {
            this.f31096d = f10;
            H(this.f31103k);
            N(this.f31104l);
        }
    }

    private void P(float f10) {
        this.f31100h = f10;
    }

    private void Q(J.e eVar) {
        this.f31117y = eVar;
    }

    private void R(String str) {
        this.f31113u = false;
        this.f31114v = false;
        if (str != null) {
            for (String str2 : str.split("-")) {
                if ("underline".equals(str2)) {
                    this.f31113u = true;
                } else if ("strikethrough".equals(str2)) {
                    this.f31114v = true;
                }
            }
        }
    }

    private void S(int i10) {
        if (i10 != this.f31112t) {
            this.f31112t = i10;
        }
    }

    private void T(float f10) {
        this.f31109q = H.i(f10);
    }

    private void U(float f10) {
        this.f31110r = H.i(f10);
    }

    private void V(float f10) {
        if (f10 != this.f31111s) {
            this.f31111s = f10;
        }
    }

    private void W(String str) {
        if (str == null || "none".equals(str)) {
            this.f31108p = v.NONE;
            return;
        }
        if ("uppercase".equals(str)) {
            this.f31108p = v.UPPERCASE;
            return;
        }
        if ("lowercase".equals(str)) {
            this.f31108p = v.LOWERCASE;
            return;
        }
        if ("capitalize".equals(str)) {
            this.f31108p = v.CAPITALIZE;
            return;
        }
        W4.a.I("ReactNative", "Invalid textTransform: " + str);
        this.f31108p = v.NONE;
    }

    public static s a(com.facebook.react.common.mapbuffer.a aVar) {
        s sVar = new s();
        Iterator it = aVar.iterator();
        while (it.hasNext()) {
            com.facebook.react.common.mapbuffer.a.c cVar = (com.facebook.react.common.mapbuffer.a.c) it.next();
            switch (cVar.getKey()) {
                case 0:
                    sVar.F(Integer.valueOf(cVar.f()));
                    break;
                case 1:
                    sVar.E(Integer.valueOf(cVar.f()));
                    break;
                case 2:
                    sVar.P((float) cVar.a());
                    break;
                case 3:
                    sVar.G(cVar.b());
                    break;
                case 4:
                    sVar.H((float) cVar.a());
                    break;
                case 6:
                    sVar.K(cVar.b());
                    break;
                case 7:
                    sVar.I(cVar.b());
                    break;
                case 8:
                    sVar.J(cVar.c());
                    break;
                case 9:
                    sVar.D(cVar.d());
                    break;
                case 10:
                    sVar.M((float) cVar.a());
                    break;
                case 11:
                    sVar.N((float) cVar.a());
                    break;
                case 15:
                    sVar.R(cVar.b());
                    break;
                case 18:
                    sVar.V((float) cVar.a());
                    break;
                case 19:
                    sVar.S(cVar.f());
                    break;
                case 20:
                    sVar.T((float) cVar.a());
                    break;
                case 21:
                    sVar.U((float) cVar.a());
                    break;
                case 23:
                    sVar.L(cVar.b());
                    break;
                case 24:
                    sVar.C(cVar.b());
                    break;
                case 26:
                    sVar.Q(J.e.values()[cVar.f()]);
                    break;
                case 27:
                    sVar.W(cVar.b());
                    break;
                case 29:
                    sVar.O((float) cVar.a());
                    break;
            }
        }
        return sVar;
    }

    public static TextUtils.TruncateAt g(String str) {
        if (str != null) {
            switch (str) {
                case "middle":
                    return TextUtils.TruncateAt.MIDDLE;
                case "clip":
                    return null;
                case "head":
                    return TextUtils.TruncateAt.START;
                case "tail":
                    return TextUtils.TruncateAt.END;
            }
        }
        return null;
    }

    public static int l(String str) {
        if (str == null) {
            return 0;
        }
        if (str.equals("normal")) {
            return 1;
        }
        return !str.equals("none") ? 2 : 0;
    }

    public static int m(X x10, int i10) {
        if (!x10.c("textAlign")) {
            return i10;
        }
        if (!"justify".equals(x10.b("textAlign")) || Build.VERSION.SDK_INT < 26) {
            return f31087F;
        }
        return 1;
    }

    public static int n(String str) {
        if (str != null && !"undefined".equals(str)) {
            if ("rtl".equals(str)) {
                return 1;
            }
            if ("ltr".equals(str)) {
                return 0;
            }
            W4.a.I("ReactNative", "Invalid layoutDirection: " + str);
        }
        return -1;
    }

    public static int r(X x10, boolean z10, int i10) {
        if (!x10.c("textAlign")) {
            return i10;
        }
        String strB = x10.b("textAlign");
        if ("justify".equals(strB)) {
            return 3;
        }
        if (strB != null && !"auto".equals(strB)) {
            if ("left".equals(strB)) {
                return z10 ? 5 : 3;
            }
            if ("right".equals(strB)) {
                return z10 ? 3 : 5;
            }
            if ("center".equals(strB)) {
                return 1;
            }
            W4.a.I("ReactNative", "Invalid textAlign: " + strB);
        }
        return 0;
    }

    public static int s(String str) {
        if (str == null) {
            return 1;
        }
        if (str.equals("balanced")) {
            return 2;
        }
        return !str.equals("simple") ? 1 : 0;
    }

    public boolean A() {
        return this.f31114v;
    }

    public boolean B() {
        return this.f31113u;
    }

    public J.d b() {
        return this.f31116x;
    }

    public int c() {
        return this.f31099g;
    }

    public int d() {
        return this.f31097e;
    }

    public int e() {
        return this.f31102j;
    }

    public float f() {
        if (!Float.isNaN(this.f31093a) && !Float.isNaN(this.f31092E)) {
            float f10 = this.f31092E;
            if (f10 > this.f31093a) {
                return f10;
            }
        }
        return this.f31093a;
    }

    public String h() {
        return this.f31089B;
    }

    public String i() {
        return this.f31090C;
    }

    public int j() {
        return this.f31118z;
    }

    public int k() {
        return this.f31088A;
    }

    public float o() {
        float fK = this.f31095c ? H.k(this.f31105m) : H.i(this.f31105m);
        int i10 = this.f31102j;
        if (i10 > 0) {
            return fK / i10;
        }
        throw new IllegalArgumentException("FontSize should be a positive value. Current value: " + this.f31102j);
    }

    public float p() {
        return this.f31100h;
    }

    public J.e q() {
        return this.f31117y;
    }

    public int t() {
        return this.f31112t;
    }

    public float u() {
        return this.f31109q;
    }

    public float v() {
        return this.f31110r;
    }

    public float w() {
        return this.f31111s;
    }

    public v x() {
        return this.f31108p;
    }

    public boolean y() {
        return this.f31098f;
    }

    public boolean z() {
        return this.f31094b;
    }
}
