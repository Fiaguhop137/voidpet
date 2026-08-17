package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* JADX INFO: renamed from: androidx.appcompat.widget.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1822j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CompoundButton f21019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f21020b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f21021c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f21022d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f21023e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f21024f;

    C1822j(CompoundButton compoundButton) {
        this.f21019a = compoundButton;
    }

    void a() {
        Drawable drawableA = androidx.core.widget.c.a(this.f21019a);
        if (drawableA != null) {
            if (this.f21022d || this.f21023e) {
                Drawable drawableMutate = p038c1.a.r(drawableA).mutate();
                if (this.f21022d) {
                    p038c1.a.o(drawableMutate, this.f21020b);
                }
                if (this.f21023e) {
                    p038c1.a.p(drawableMutate, this.f21021c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f21019a.getDrawableState());
                }
                this.f21019a.setButtonDrawable(drawableMutate);
            }
        }
    }

    ColorStateList b() {
        return this.f21020b;
    }

    PorterDuff.Mode c() {
        return this.f21021c;
    }

    void d(AttributeSet attributeSet, int i10) {
        int iN;
        int iN2;
        h0 h0VarV = h0.v(this.f21019a.getContext(), attributeSet, p144i.j.f43346U0, i10, 0);
        CompoundButton compoundButton = this.f21019a;
        androidx.core.view.Z.k0(compoundButton, compoundButton.getContext(), p144i.j.f43346U0, attributeSet, h0VarV.r(), i10, 0);
        try {
            if (h0VarV.s(p144i.j.f43354W0) && (iN2 = h0VarV.n(p144i.j.f43354W0, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.f21019a;
                    compoundButton2.setButtonDrawable(p161j.a.b(compoundButton2.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                    if (h0VarV.s(p144i.j.f43350V0)) {
                        CompoundButton compoundButton3 = this.f21019a;
                        compoundButton3.setButtonDrawable(p161j.a.b(compoundButton3.getContext(), iN));
                    }
                }
            } else if (h0VarV.s(p144i.j.f43350V0) && (iN = h0VarV.n(p144i.j.f43350V0, 0)) != 0) {
                CompoundButton compoundButton4 = this.f21019a;
                compoundButton4.setButtonDrawable(p161j.a.b(compoundButton4.getContext(), iN));
            }
            if (h0VarV.s(p144i.j.f43358X0)) {
                androidx.core.widget.c.d(this.f21019a, h0VarV.c(p144i.j.f43358X0));
            }
            if (h0VarV.s(p144i.j.f43362Y0)) {
                androidx.core.widget.c.e(this.f21019a, O.e(h0VarV.k(p144i.j.f43362Y0, -1), null));
            }
        } finally {
            h0VarV.x();
        }
    }

    void e() {
        if (this.f21024f) {
            this.f21024f = false;
        } else {
            this.f21024f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f21020b = colorStateList;
        this.f21022d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.f21021c = mode;
        this.f21023e = true;
        a();
    }
}
