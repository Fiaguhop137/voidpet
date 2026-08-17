package com.facebook.react.views.text;

import android.graphics.Color;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C2275s;
import com.facebook.react.uimanager.C2279w;
import com.facebook.react.uimanager.E;
import com.facebook.react.uimanager.H;
import com.facebook.react.uimanager.J;
import com.facebook.react.uimanager.V;
import com.facebook.react.uimanager.W;
import com.facebook.yoga.YogaValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d extends C2279w {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    protected p f30993A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    protected t f30994B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    protected boolean f30995C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    protected int f30996D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected boolean f30997E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    protected int f30998F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    protected J.d f30999G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    protected J.e f31000H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    protected int f31001I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    protected int f31002J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    protected int f31003K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    protected int f31004L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    protected int f31005M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    protected float f31006N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    protected float f31007O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    protected float f31008P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    protected int f31009Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    protected boolean f31010R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    protected boolean f31011S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    protected boolean f31012T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    protected boolean f31013U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    protected float f31014V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    protected int f31015W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    protected int f31016X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    protected String f31017Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    protected String f31018Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    protected boolean f31019a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    protected Map f31020b0;

    public d() {
        this(null);
    }

    public d(p pVar) {
        this.f30995C = false;
        this.f30997E = false;
        this.f30999G = null;
        this.f31000H = null;
        this.f31001I = -1;
        this.f31002J = 0;
        this.f31003K = 1;
        this.f31004L = 0;
        this.f31005M = 0;
        this.f31006N = 0.0f;
        this.f31007O = 0.0f;
        this.f31008P = 0.0f;
        this.f31009Q = 1426063360;
        this.f31010R = false;
        this.f31011S = false;
        this.f31012T = true;
        this.f31013U = false;
        this.f31014V = 0.0f;
        this.f31015W = -1;
        this.f31016X = -1;
        this.f31017Y = null;
        this.f31018Z = null;
        this.f31019a0 = false;
        this.f30994B = new t();
        this.f30993A = pVar;
    }

    private static void v1(d dVar, SpannableStringBuilder spannableStringBuilder, List list, t tVar, boolean z10, Map map, int i10) {
        float fD0;
        float fG;
        t tVarA = tVar != null ? tVar.a(dVar.f30994B) : dVar.f30994B;
        int iB = dVar.b();
        for (int i11 = 0; i11 < iB; i11++) {
            W wA = dVar.a(i11);
            if (wA instanceof f) {
                String strU1 = ((f) wA).u1();
                if (strU1 != null) {
                    spannableStringBuilder.append((CharSequence) v.g(strU1, tVarA.f31125f));
                }
            } else if (wA instanceof d) {
                v1((d) wA, spannableStringBuilder, list, tVarA, z10, map, spannableStringBuilder.length());
            } else if (wA instanceof p205l7.a) {
                spannableStringBuilder.append("0");
                list.add(new p223m7.n(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), ((p205l7.a) wA).v1()));
            } else {
                if (!z10) {
                    throw new C2275s("Unexpected view type nested under a <Text> or <TextInput> node: " + wA.getClass());
                }
                int iM = wA.M();
                YogaValue yogaValueR = wA.r();
                YogaValue yogaValueK = wA.K();
                com.facebook.yoga.w wVar = yogaValueR.f31423b;
                com.facebook.yoga.w wVar2 = com.facebook.yoga.w.POINT;
                if (wVar == wVar2 && yogaValueK.f31423b == wVar2) {
                    fD0 = yogaValueR.f31422a;
                    fG = yogaValueK.f31422a;
                } else {
                    wA.O();
                    fD0 = wA.d0();
                    fG = wA.g();
                }
                spannableStringBuilder.append("0");
                list.add(new p223m7.n(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), new p223m7.q(iM, (int) fD0, (int) fG)));
                ((Map) p240n6.a.c(map)).put(Integer.valueOf(iM), wA);
            }
            wA.c();
        }
        int length = spannableStringBuilder.length();
        if (length >= i10) {
            if (dVar.f30995C) {
                list.add(new p223m7.n(i10, length, new p223m7.g(dVar.f30996D)));
            }
            if (dVar.f30997E) {
                list.add(new p223m7.n(i10, length, new p223m7.e(dVar.f30998F)));
            }
            J.e eVar = dVar.f31000H;
            if (eVar == null ? dVar.f30999G == J.d.LINK : eVar == J.e.LINK) {
                list.add(new p223m7.n(i10, length, new p223m7.f(dVar.M())));
            }
            float fD = tVarA.d();
            if (!Float.isNaN(fD) && (tVar == null || tVar.d() != fD)) {
                list.add(new p223m7.n(i10, length, new p223m7.a(fD)));
            }
            int iC = tVarA.c();
            if (tVar == null || tVar.c() != iC) {
                list.add(new p223m7.n(i10, length, new p223m7.d(iC)));
            }
            if (dVar.f31015W != -1 || dVar.f31016X != -1 || dVar.f31017Y != null) {
                list.add(new p223m7.n(i10, length, new p223m7.c(dVar.f31015W, dVar.f31016X, dVar.f31018Z, dVar.f31017Y, dVar.S().getAssets())));
            }
            if (dVar.f31010R) {
                list.add(new p223m7.n(i10, length, new p223m7.m()));
            }
            if (dVar.f31011S) {
                list.add(new p223m7.n(i10, length, new p223m7.j()));
            }
            if ((dVar.f31006N != 0.0f || dVar.f31007O != 0.0f || dVar.f31008P != 0.0f) && Color.alpha(dVar.f31009Q) != 0) {
                list.add(new p223m7.n(i10, length, new p223m7.o(dVar.f31006N, dVar.f31007O, dVar.f31008P, dVar.f31009Q)));
            }
            float fE = tVarA.e();
            if (!Float.isNaN(fE) && (tVar == null || tVar.e() != fE)) {
                list.add(new p223m7.n(i10, length, new p223m7.b(fE)));
            }
            list.add(new p223m7.n(i10, length, new p223m7.k(dVar.M())));
        }
    }

    @Y6.a(name = "accessibilityRole")
    public void setAccessibilityRole(String str) {
        if (P()) {
            this.f30999G = J.d.h(str);
            x0();
        }
    }

    @Y6.a(name = "adjustsFontSizeToFit")
    public void setAdjustFontSizeToFit(boolean z10) {
        if (z10 != this.f31013U) {
            this.f31013U = z10;
            x0();
        }
    }

    @Y6.a(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(boolean z10) {
        if (z10 != this.f30994B.b()) {
            this.f30994B.h(z10);
            x0();
        }
    }

    @Y6.a(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(Integer num) {
        if (P()) {
            if (num != null) {
                this.f30997E = true;
                this.f30998F = num.intValue();
            }
            x0();
        }
    }

    @Y6.a(customType = "Color", name = "color")
    public void setColor(Integer num) {
        if (num != null) {
            this.f30995C = true;
            this.f30996D = num.intValue();
        }
        x0();
    }

    @Y6.a(name = "fontFamily")
    public void setFontFamily(String str) {
        this.f31017Y = str;
        x0();
    }

    @Y6.a(defaultFloat = Float.NaN, name = "fontSize")
    public void setFontSize(float f10) {
        this.f30994B.i(f10);
        x0();
    }

    @Y6.a(name = "fontStyle")
    public void setFontStyle(String str) {
        int iB = q.b(str);
        if (iB != this.f31015W) {
            this.f31015W = iB;
            x0();
        }
    }

    @Y6.a(name = "fontVariant")
    public void setFontVariant(ReadableArray readableArray) {
        String strC = q.c(readableArray);
        if (TextUtils.equals(strC, this.f31018Z)) {
            return;
        }
        this.f31018Z = strC;
        x0();
    }

    @Y6.a(name = "fontWeight")
    public void setFontWeight(String str) {
        int iD = q.d(str);
        if (iD != this.f31016X) {
            this.f31016X = iD;
            x0();
        }
    }

    @Y6.a(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(boolean z10) {
        this.f31012T = z10;
    }

    @Y6.a(defaultFloat = 0.0f, name = "letterSpacing")
    public void setLetterSpacing(float f10) {
        this.f30994B.k(f10);
        x0();
    }

    @Y6.a(defaultFloat = Float.NaN, name = "lineHeight")
    public void setLineHeight(float f10) {
        this.f30994B.l(f10);
        x0();
    }

    @Y6.a(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(float f10) {
        if (f10 != this.f30994B.g()) {
            this.f30994B.m(f10);
            x0();
        }
    }

    @Y6.a(name = "minimumFontScale")
    public void setMinimumFontScale(float f10) {
        if (f10 != this.f31014V) {
            this.f31014V = f10;
            x0();
        }
    }

    @Y6.a(defaultInt = -1, name = "numberOfLines")
    public void setNumberOfLines(int i10) {
        if (i10 == 0) {
            i10 = -1;
        }
        this.f31001I = i10;
        x0();
    }

    @Y6.a(name = "role")
    public void setRole(String str) {
        if (P()) {
            this.f31000H = J.e.g(str);
            x0();
        }
    }

    @Y6.a(name = "textAlign")
    public void setTextAlign(String str) {
        if ("justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f31005M = 1;
            }
            this.f31002J = 3;
        } else {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f31005M = 0;
            }
            if (str == null || "auto".equals(str)) {
                this.f31002J = 0;
            } else if ("left".equals(str)) {
                this.f31002J = 3;
            } else if ("right".equals(str)) {
                this.f31002J = 5;
            } else if ("center".equals(str)) {
                this.f31002J = 1;
            } else {
                W4.a.I("ReactNative", "Invalid textAlign: " + str);
                this.f31002J = 0;
            }
        }
        x0();
    }

    @Y6.a(name = "textBreakStrategy")
    public void setTextBreakStrategy(String str) {
        if (str == null || "highQuality".equals(str)) {
            this.f31003K = 1;
        } else if ("simple".equals(str)) {
            this.f31003K = 0;
        } else if ("balanced".equals(str)) {
            this.f31003K = 2;
        } else {
            W4.a.I("ReactNative", "Invalid textBreakStrategy: " + str);
            this.f31003K = 1;
        }
        x0();
    }

    @Y6.a(name = "textDecorationLine")
    public void setTextDecorationLine(String str) {
        this.f31010R = false;
        this.f31011S = false;
        if (str != null) {
            for (String str2 : str.split(" ")) {
                if ("underline".equals(str2)) {
                    this.f31010R = true;
                } else if ("line-through".equals(str2)) {
                    this.f31011S = true;
                }
            }
        }
        x0();
    }

    @Y6.a(customType = "Color", defaultInt = 1426063360, name = "textShadowColor")
    public void setTextShadowColor(int i10) {
        if (i10 != this.f31009Q) {
            this.f31009Q = i10;
            x0();
        }
    }

    @Y6.a(name = "textShadowOffset")
    public void setTextShadowOffset(ReadableMap readableMap) {
        this.f31006N = 0.0f;
        this.f31007O = 0.0f;
        if (readableMap != null) {
            if (readableMap.hasKey("width") && !readableMap.isNull("width")) {
                this.f31006N = H.h(readableMap.getDouble("width"));
            }
            if (readableMap.hasKey("height") && !readableMap.isNull("height")) {
                this.f31007O = H.h(readableMap.getDouble("height"));
            }
        }
        x0();
    }

    @Y6.a(defaultInt = 1, name = "textShadowRadius")
    public void setTextShadowRadius(float f10) {
        if (f10 != this.f31008P) {
            this.f31008P = f10;
            x0();
        }
    }

    @Y6.a(name = "textTransform")
    public void setTextTransform(String str) {
        v vVar = v.UNSET;
        if (str != null) {
            if ("none".equals(str)) {
                vVar = v.NONE;
            } else if ("uppercase".equals(str)) {
                vVar = v.UPPERCASE;
            } else if ("lowercase".equals(str)) {
                vVar = v.LOWERCASE;
            } else if ("capitalize".equals(str)) {
                vVar = v.CAPITALIZE;
            } else {
                W4.a.I("ReactNative", "Invalid textTransform: " + str);
            }
        }
        this.f30994B.f31125f = vVar;
        x0();
    }

    protected Spannable w1(d dVar, String str, boolean z10, E e10) {
        int iB;
        p240n6.a.b((z10 && e10 == null) ? false : true, "nativeViewHierarchyOptimizer is required when inline views are supported");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        HashMap map = z10 ? new HashMap() : null;
        if (str != null) {
            spannableStringBuilder.append((CharSequence) v.g(str, dVar.f30994B.f31125f));
        }
        v1(dVar, spannableStringBuilder, arrayList, null, z10, map, 0);
        dVar.f31019a0 = false;
        dVar.f31020b0 = map;
        float f10 = Float.NaN;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            p223m7.n nVar = (p223m7.n) arrayList.get((arrayList.size() - i10) - 1);
            p223m7.i iVar = nVar.f49170c;
            boolean z11 = iVar instanceof p223m7.p;
            if (z11 || (iVar instanceof p223m7.q)) {
                if (z11) {
                    iB = ((p223m7.p) iVar).b();
                    dVar.f31019a0 = true;
                } else {
                    p223m7.q qVar = (p223m7.q) iVar;
                    int iA = qVar.a();
                    V v10 = (V) ((Map) p240n6.a.c(map)).get(Integer.valueOf(qVar.b()));
                    p240n6.a.c(v10);
                    p240n6.a.c(e10);
                    e10.h(v10);
                    v10.w(dVar);
                    iB = iA;
                }
                if (Float.isNaN(f10) || iB > f10) {
                    f10 = iB;
                }
            }
            nVar.a(spannableStringBuilder, i10);
        }
        dVar.f30994B.j(f10);
        p pVar = this.f30993A;
        if (pVar != null) {
            pVar.onPostProcessSpannable(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }
}
