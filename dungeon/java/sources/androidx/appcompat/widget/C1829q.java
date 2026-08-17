package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: renamed from: androidx.appcompat.widget.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1829q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImageView f21086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f0 f21087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f0 f21088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f0 f21089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21090e = 0;

    public C1829q(ImageView imageView) {
        this.f21086a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f21089d == null) {
            this.f21089d = new f0();
        }
        f0 f0Var = this.f21089d;
        f0Var.a();
        ColorStateList colorStateListA = androidx.core.widget.e.a(this.f21086a);
        if (colorStateListA != null) {
            f0Var.f20999d = true;
            f0Var.f20996a = colorStateListA;
        }
        PorterDuff.Mode modeB = androidx.core.widget.e.b(this.f21086a);
        if (modeB != null) {
            f0Var.f20998c = true;
            f0Var.f20997b = modeB;
        }
        if (!f0Var.f20999d && !f0Var.f20998c) {
            return false;
        }
        C1823k.i(drawable, f0Var, this.f21086a.getDrawableState());
        return true;
    }

    private boolean l() {
        return this.f21087b != null;
    }

    void b() {
        if (this.f21086a.getDrawable() != null) {
            this.f21086a.getDrawable().setLevel(this.f21090e);
        }
    }

    void c() {
        Drawable drawable = this.f21086a.getDrawable();
        if (drawable != null) {
            O.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            f0 f0Var = this.f21088c;
            if (f0Var != null) {
                C1823k.i(drawable, f0Var, this.f21086a.getDrawableState());
                return;
            }
            f0 f0Var2 = this.f21087b;
            if (f0Var2 != null) {
                C1823k.i(drawable, f0Var2, this.f21086a.getDrawableState());
            }
        }
    }

    ColorStateList d() {
        f0 f0Var = this.f21088c;
        if (f0Var != null) {
            return f0Var.f20996a;
        }
        return null;
    }

    PorterDuff.Mode e() {
        f0 f0Var = this.f21088c;
        if (f0Var != null) {
            return f0Var.f20997b;
        }
        return null;
    }

    boolean f() {
        return !(this.f21086a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i10) {
        int iN;
        h0 h0VarV = h0.v(this.f21086a.getContext(), attributeSet, p144i.j.f43322P, i10, 0);
        ImageView imageView = this.f21086a;
        androidx.core.view.Z.k0(imageView, imageView.getContext(), p144i.j.f43322P, attributeSet, h0VarV.r(), i10, 0);
        try {
            Drawable drawable = this.f21086a.getDrawable();
            if (drawable == null && (iN = h0VarV.n(p144i.j.f43327Q, -1)) != -1 && (drawable = p161j.a.b(this.f21086a.getContext(), iN)) != null) {
                this.f21086a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                O.b(drawable);
            }
            if (h0VarV.s(p144i.j.f43332R)) {
                androidx.core.widget.e.c(this.f21086a, h0VarV.c(p144i.j.f43332R));
            }
            if (h0VarV.s(p144i.j.f43337S)) {
                androidx.core.widget.e.d(this.f21086a, O.e(h0VarV.k(p144i.j.f43337S, -1), null));
            }
        } finally {
            h0VarV.x();
        }
    }

    void h(Drawable drawable) {
        this.f21090e = drawable.getLevel();
    }

    public void i(int i10) {
        if (i10 != 0) {
            Drawable drawableB = p161j.a.b(this.f21086a.getContext(), i10);
            if (drawableB != null) {
                O.b(drawableB);
            }
            this.f21086a.setImageDrawable(drawableB);
        } else {
            this.f21086a.setImageDrawable(null);
        }
        c();
    }

    void j(ColorStateList colorStateList) {
        if (this.f21088c == null) {
            this.f21088c = new f0();
        }
        f0 f0Var = this.f21088c;
        f0Var.f20996a = colorStateList;
        f0Var.f20999d = true;
        c();
    }

    void k(PorterDuff.Mode mode) {
        if (this.f21088c == null) {
            this.f21088c = new f0();
        }
        f0 f0Var = this.f21088c;
        f0Var.f20997b = mode;
        f0Var.f20998c = true;
        c();
    }
}
