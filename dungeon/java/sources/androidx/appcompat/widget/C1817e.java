package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: androidx.appcompat.widget.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1817e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f20983a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f0 f20986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f0 f20987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f0 f20988f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20985c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1823k f20984b = C1823k.b();

    C1817e(View view) {
        this.f20983a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f20988f == null) {
            this.f20988f = new f0();
        }
        f0 f0Var = this.f20988f;
        f0Var.a();
        ColorStateList colorStateListR = androidx.core.view.Z.r(this.f20983a);
        if (colorStateListR != null) {
            f0Var.f20999d = true;
            f0Var.f20996a = colorStateListR;
        }
        PorterDuff.Mode modeS = androidx.core.view.Z.s(this.f20983a);
        if (modeS != null) {
            f0Var.f20998c = true;
            f0Var.f20997b = modeS;
        }
        if (!f0Var.f20999d && !f0Var.f20998c) {
            return false;
        }
        C1823k.i(drawable, f0Var, this.f20983a.getDrawableState());
        return true;
    }

    private boolean k() {
        return this.f20986d != null;
    }

    void b() {
        Drawable background = this.f20983a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            f0 f0Var = this.f20987e;
            if (f0Var != null) {
                C1823k.i(background, f0Var, this.f20983a.getDrawableState());
                return;
            }
            f0 f0Var2 = this.f20986d;
            if (f0Var2 != null) {
                C1823k.i(background, f0Var2, this.f20983a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        f0 f0Var = this.f20987e;
        if (f0Var != null) {
            return f0Var.f20996a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        f0 f0Var = this.f20987e;
        if (f0Var != null) {
            return f0Var.f20997b;
        }
        return null;
    }

    void e(AttributeSet attributeSet, int i10) {
        h0 h0VarV = h0.v(this.f20983a.getContext(), attributeSet, p144i.j.f43301K3, i10, 0);
        View view = this.f20983a;
        androidx.core.view.Z.k0(view, view.getContext(), p144i.j.f43301K3, attributeSet, h0VarV.r(), i10, 0);
        try {
            if (h0VarV.s(p144i.j.f43306L3)) {
                this.f20985c = h0VarV.n(p144i.j.f43306L3, -1);
                ColorStateList colorStateListF = this.f20984b.f(this.f20983a.getContext(), this.f20985c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            if (h0VarV.s(p144i.j.f43311M3)) {
                androidx.core.view.Z.r0(this.f20983a, h0VarV.c(p144i.j.f43311M3));
            }
            if (h0VarV.s(p144i.j.f43316N3)) {
                androidx.core.view.Z.s0(this.f20983a, O.e(h0VarV.k(p144i.j.f43316N3, -1), null));
            }
        } finally {
            h0VarV.x();
        }
    }

    void f(Drawable drawable) {
        this.f20985c = -1;
        h(null);
        b();
    }

    void g(int i10) {
        this.f20985c = i10;
        C1823k c1823k = this.f20984b;
        h(c1823k != null ? c1823k.f(this.f20983a.getContext(), i10) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f20986d == null) {
                this.f20986d = new f0();
            }
            f0 f0Var = this.f20986d;
            f0Var.f20996a = colorStateList;
            f0Var.f20999d = true;
        } else {
            this.f20986d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.f20987e == null) {
            this.f20987e = new f0();
        }
        f0 f0Var = this.f20987e;
        f0Var.f20996a = colorStateList;
        f0Var.f20999d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.f20987e == null) {
            this.f20987e = new f0();
        }
        f0 f0Var = this.f20987e;
        f0Var.f20997b = mode;
        f0Var.f20998c = true;
        b();
    }
}
