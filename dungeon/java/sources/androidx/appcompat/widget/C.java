package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f20548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f0 f20549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f0 f20550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f0 f20551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f0 f20552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f0 f20553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f0 f20554g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private f0 f20555h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final E f20556i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f20557j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f20558k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Typeface f20559l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f20560m;

    class a extends a1.k.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f20561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f20562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f20563c;

        a(int i10, int i11, WeakReference weakReference) {
            this.f20561a = i10;
            this.f20562b = i11;
            this.f20563c = weakReference;
        }

        @Override // a1.k.e
        public void f(int i10) {
        }

        @Override // a1.k.e
        public void g(Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f20561a) != -1) {
                typeface = e.a(typeface, i10, (this.f20562b & 2) != 0);
            }
            C.this.n(this.f20563c, typeface);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f20565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Typeface f20566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f20567c;

        b(TextView textView, Typeface typeface, int i10) {
            this.f20565a = textView;
            this.f20566b = typeface;
            this.f20567c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20565a.setTypeface(this.f20566b, this.f20567c);
        }
    }

    static class c {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    static class d {
        static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    static class e {
        static Typeface a(Typeface typeface, int i10, boolean z10) {
            return Typeface.create(typeface, i10, z10);
        }
    }

    C(TextView textView) {
        this.f20548a = textView;
        this.f20556i = new E(textView);
    }

    private void B(int i10, float f10) {
        this.f20556i.t(i10, f10);
    }

    private void C(Context context, h0 h0Var) {
        String strO;
        this.f20557j = h0Var.k(p144i.j.f43352V2, this.f20557j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int iK = h0Var.k(p144i.j.f43364Y2, -1);
            this.f20558k = iK;
            if (iK != -1) {
                this.f20557j &= 2;
            }
        }
        if (!h0Var.s(p144i.j.f43360X2) && !h0Var.s(p144i.j.f43368Z2)) {
            if (h0Var.s(p144i.j.f43348U2)) {
                this.f20560m = false;
                int iK2 = h0Var.k(p144i.j.f43348U2, 1);
                if (iK2 == 1) {
                    this.f20559l = Typeface.SANS_SERIF;
                    return;
                } else if (iK2 == 2) {
                    this.f20559l = Typeface.SERIF;
                    return;
                } else {
                    if (iK2 != 3) {
                        return;
                    }
                    this.f20559l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f20559l = null;
        int i11 = h0Var.s(p144i.j.f43368Z2) ? p144i.j.f43368Z2 : p144i.j.f43360X2;
        int i12 = this.f20558k;
        int i13 = this.f20557j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceJ = h0Var.j(i11, this.f20557j, new a(i12, i13, new WeakReference(this.f20548a)));
                if (typefaceJ != null) {
                    if (i10 < 28 || this.f20558k == -1) {
                        this.f20559l = typefaceJ;
                    } else {
                        this.f20559l = e.a(Typeface.create(typefaceJ, 0), this.f20558k, (this.f20557j & 2) != 0);
                    }
                }
                this.f20560m = this.f20559l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f20559l != null || (strO = h0Var.o(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f20558k == -1) {
            this.f20559l = Typeface.create(strO, this.f20557j);
        } else {
            this.f20559l = e.a(Typeface.create(strO, 0), this.f20558k, (this.f20557j & 2) != 0);
        }
    }

    private void a(Drawable drawable, f0 f0Var) {
        if (drawable == null || f0Var == null) {
            return;
        }
        C1823k.i(drawable, f0Var, this.f20548a.getDrawableState());
    }

    private static f0 d(Context context, C1823k c1823k, int i10) {
        ColorStateList colorStateListF = c1823k.f(context, i10);
        if (colorStateListF == null) {
            return null;
        }
        f0 f0Var = new f0();
        f0Var.f20999d = true;
        f0Var.f20996a = colorStateListF;
        return f0Var;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f20548a.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.f20548a;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f20548a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.f20548a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f20548a.getCompoundDrawables();
        TextView textView2 = this.f20548a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void z() {
        f0 f0Var = this.f20555h;
        this.f20549b = f0Var;
        this.f20550c = f0Var;
        this.f20551d = f0Var;
        this.f20552e = f0Var;
        this.f20553f = f0Var;
        this.f20554g = f0Var;
    }

    void A(int i10, float f10) {
        if (s0.f21109c || l()) {
            return;
        }
        B(i10, f10);
    }

    void b() {
        if (this.f20549b != null || this.f20550c != null || this.f20551d != null || this.f20552e != null) {
            Drawable[] compoundDrawables = this.f20548a.getCompoundDrawables();
            a(compoundDrawables[0], this.f20549b);
            a(compoundDrawables[1], this.f20550c);
            a(compoundDrawables[2], this.f20551d);
            a(compoundDrawables[3], this.f20552e);
        }
        if (this.f20553f == null && this.f20554g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f20548a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f20553f);
        a(compoundDrawablesRelative[2], this.f20554g);
    }

    void c() {
        this.f20556i.a();
    }

    int e() {
        return this.f20556i.f();
    }

    int f() {
        return this.f20556i.g();
    }

    int g() {
        return this.f20556i.h();
    }

    int[] h() {
        return this.f20556i.i();
    }

    int i() {
        return this.f20556i.j();
    }

    ColorStateList j() {
        f0 f0Var = this.f20555h;
        if (f0Var != null) {
            return f0Var.f20996a;
        }
        return null;
    }

    PorterDuff.Mode k() {
        f0 f0Var = this.f20555h;
        if (f0Var != null) {
            return f0Var.f20997b;
        }
        return null;
    }

    boolean l() {
        return this.f20556i.n();
    }

    void m(AttributeSet attributeSet, int i10) {
        boolean zA;
        boolean z10;
        String strO;
        String strO2;
        boolean z11;
        int iA;
        float f10;
        Context context = this.f20548a.getContext();
        C1823k c1823kB = C1823k.b();
        h0 h0VarV = h0.v(context, attributeSet, p144i.j.f43361Y, i10, 0);
        TextView textView = this.f20548a;
        androidx.core.view.Z.k0(textView, textView.getContext(), p144i.j.f43361Y, attributeSet, h0VarV.r(), i10, 0);
        int iN = h0VarV.n(p144i.j.f43365Z, -1);
        if (h0VarV.s(p144i.j.f43380c0)) {
            this.f20549b = d(context, c1823kB, h0VarV.n(p144i.j.f43380c0, 0));
        }
        if (h0VarV.s(p144i.j.f43370a0)) {
            this.f20550c = d(context, c1823kB, h0VarV.n(p144i.j.f43370a0, 0));
        }
        if (h0VarV.s(p144i.j.f43385d0)) {
            this.f20551d = d(context, c1823kB, h0VarV.n(p144i.j.f43385d0, 0));
        }
        if (h0VarV.s(p144i.j.f43375b0)) {
            this.f20552e = d(context, c1823kB, h0VarV.n(p144i.j.f43375b0, 0));
        }
        if (h0VarV.s(p144i.j.f43390e0)) {
            this.f20553f = d(context, c1823kB, h0VarV.n(p144i.j.f43390e0, 0));
        }
        if (h0VarV.s(p144i.j.f43395f0)) {
            this.f20554g = d(context, c1823kB, h0VarV.n(p144i.j.f43395f0, 0));
        }
        h0VarV.x();
        boolean z12 = this.f20548a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (iN != -1) {
            h0 h0VarT = h0.t(context, iN, p144i.j.f43340S2);
            if (z12 || !h0VarT.s(p144i.j.f43378b3)) {
                zA = false;
                z10 = false;
            } else {
                zA = h0VarT.a(p144i.j.f43378b3, false);
                z10 = true;
            }
            C(context, h0VarT);
            int i11 = Build.VERSION.SDK_INT;
            strO2 = h0VarT.s(p144i.j.f43383c3) ? h0VarT.o(p144i.j.f43383c3) : null;
            strO = (i11 < 26 || !h0VarT.s(p144i.j.f43373a3)) ? null : h0VarT.o(p144i.j.f43373a3);
            h0VarT.x();
        } else {
            zA = false;
            z10 = false;
            strO = null;
            strO2 = null;
        }
        h0 h0VarV2 = h0.v(context, attributeSet, p144i.j.f43340S2, i10, 0);
        if (z12 || !h0VarV2.s(p144i.j.f43378b3)) {
            z11 = z10;
        } else {
            zA = h0VarV2.a(p144i.j.f43378b3, false);
            z11 = true;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (h0VarV2.s(p144i.j.f43383c3)) {
            strO2 = h0VarV2.o(p144i.j.f43383c3);
        }
        if (i12 >= 26 && h0VarV2.s(p144i.j.f43373a3)) {
            strO = h0VarV2.o(p144i.j.f43373a3);
        }
        if (i12 >= 28 && h0VarV2.s(p144i.j.f43344T2) && h0VarV2.f(p144i.j.f43344T2, -1) == 0) {
            this.f20548a.setTextSize(0, 0.0f);
        }
        C(context, h0VarV2);
        h0VarV2.x();
        if (!z12 && z11) {
            s(zA);
        }
        Typeface typeface = this.f20559l;
        if (typeface != null) {
            if (this.f20558k == -1) {
                this.f20548a.setTypeface(typeface, this.f20557j);
            } else {
                this.f20548a.setTypeface(typeface);
            }
        }
        if (strO != null) {
            d.d(this.f20548a, strO);
        }
        if (strO2 != null) {
            c.b(this.f20548a, c.a(strO2));
        }
        this.f20556i.o(attributeSet, i10);
        if (s0.f21109c && this.f20556i.j() != 0) {
            int[] iArrI = this.f20556i.i();
            if (iArrI.length > 0) {
                if (d.a(this.f20548a) != -1.0f) {
                    d.b(this.f20548a, this.f20556i.g(), this.f20556i.f(), this.f20556i.h(), 0);
                } else {
                    d.c(this.f20548a, iArrI, 0);
                }
            }
        }
        h0 h0VarU = h0.u(context, attributeSet, p144i.j.f43400g0);
        int iN2 = h0VarU.n(p144i.j.f43440o0, -1);
        Drawable drawableC = iN2 != -1 ? c1823kB.c(context, iN2) : null;
        int iN3 = h0VarU.n(p144i.j.f43465t0, -1);
        Drawable drawableC2 = iN3 != -1 ? c1823kB.c(context, iN3) : null;
        int iN4 = h0VarU.n(p144i.j.f43445p0, -1);
        Drawable drawableC3 = iN4 != -1 ? c1823kB.c(context, iN4) : null;
        int iN5 = h0VarU.n(p144i.j.f43430m0, -1);
        Drawable drawableC4 = iN5 != -1 ? c1823kB.c(context, iN5) : null;
        int iN6 = h0VarU.n(p144i.j.f43450q0, -1);
        Drawable drawableC5 = iN6 != -1 ? c1823kB.c(context, iN6) : null;
        int iN7 = h0VarU.n(p144i.j.f43435n0, -1);
        y(drawableC, drawableC2, drawableC3, drawableC4, drawableC5, iN7 != -1 ? c1823kB.c(context, iN7) : null);
        if (h0VarU.s(p144i.j.f43455r0)) {
            androidx.core.widget.i.g(this.f20548a, h0VarU.c(p144i.j.f43455r0));
        }
        if (h0VarU.s(p144i.j.f43460s0)) {
            androidx.core.widget.i.h(this.f20548a, O.e(h0VarU.k(p144i.j.f43460s0, -1), null));
        }
        int iF = h0VarU.f(p144i.j.f43475v0, -1);
        int iF2 = h0VarU.f(p144i.j.f43480w0, -1);
        if (h0VarU.s(p144i.j.f43485x0)) {
            TypedValue typedValueW = h0VarU.w(p144i.j.f43485x0);
            if (typedValueW == null || typedValueW.type != 5) {
                f10 = h0VarU.f(p144i.j.f43485x0, -1);
                iA = -1;
            } else {
                iA = p199l1.k.a(typedValueW.data);
                f10 = TypedValue.complexToFloat(typedValueW.data);
            }
        } else {
            iA = -1;
            f10 = -1.0f;
        }
        h0VarU.x();
        if (iF != -1) {
            androidx.core.widget.i.j(this.f20548a, iF);
        }
        if (iF2 != -1) {
            androidx.core.widget.i.k(this.f20548a, iF2);
        }
        if (f10 != -1.0f) {
            if (iA == -1) {
                androidx.core.widget.i.l(this.f20548a, (int) f10);
            } else {
                androidx.core.widget.i.m(this.f20548a, iA, f10);
            }
        }
    }

    void n(WeakReference weakReference, Typeface typeface) {
        if (this.f20560m) {
            this.f20559l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new b(textView, typeface, this.f20557j));
                } else {
                    textView.setTypeface(typeface, this.f20557j);
                }
            }
        }
    }

    void o(boolean z10, int i10, int i11, int i12, int i13) {
        if (s0.f21109c) {
            return;
        }
        c();
    }

    void p() {
        b();
    }

    void q(Context context, int i10) {
        String strO;
        h0 h0VarT = h0.t(context, i10, p144i.j.f43340S2);
        if (h0VarT.s(p144i.j.f43378b3)) {
            s(h0VarT.a(p144i.j.f43378b3, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (h0VarT.s(p144i.j.f43344T2) && h0VarT.f(p144i.j.f43344T2, -1) == 0) {
            this.f20548a.setTextSize(0, 0.0f);
        }
        C(context, h0VarT);
        if (i11 >= 26 && h0VarT.s(p144i.j.f43373a3) && (strO = h0VarT.o(p144i.j.f43373a3)) != null) {
            d.d(this.f20548a, strO);
        }
        h0VarT.x();
        Typeface typeface = this.f20559l;
        if (typeface != null) {
            this.f20548a.setTypeface(typeface, this.f20557j);
        }
    }

    void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        p253o1.c.f(editorInfo, textView.getText());
    }

    void s(boolean z10) {
        this.f20548a.setAllCaps(z10);
    }

    void t(int i10, int i11, int i12, int i13) {
        this.f20556i.p(i10, i11, i12, i13);
    }

    void u(int[] iArr, int i10) {
        this.f20556i.q(iArr, i10);
    }

    void v(int i10) {
        this.f20556i.r(i10);
    }

    void w(ColorStateList colorStateList) {
        if (this.f20555h == null) {
            this.f20555h = new f0();
        }
        f0 f0Var = this.f20555h;
        f0Var.f20996a = colorStateList;
        f0Var.f20999d = colorStateList != null;
        z();
    }

    void x(PorterDuff.Mode mode) {
        if (this.f20555h == null) {
            this.f20555h = new f0();
        }
        f0 f0Var = this.f20555h;
        f0Var.f20997b = mode;
        f0Var.f20998c = mode != null;
        z();
    }
}
