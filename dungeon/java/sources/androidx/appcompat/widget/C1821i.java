package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

/* JADX INFO: renamed from: androidx.appcompat.widget.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1821i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CheckedTextView f21012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f21013b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f21014c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f21015d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f21016e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f21017f;

    C1821i(CheckedTextView checkedTextView) {
        this.f21012a = checkedTextView;
    }

    void a() {
        Drawable drawableA = androidx.core.widget.b.a(this.f21012a);
        if (drawableA != null) {
            if (this.f21015d || this.f21016e) {
                Drawable drawableMutate = p038c1.a.r(drawableA).mutate();
                if (this.f21015d) {
                    p038c1.a.o(drawableMutate, this.f21013b);
                }
                if (this.f21016e) {
                    p038c1.a.p(drawableMutate, this.f21014c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f21012a.getDrawableState());
                }
                this.f21012a.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    ColorStateList b() {
        return this.f21013b;
    }

    PorterDuff.Mode c() {
        return this.f21014c;
    }

    void d(AttributeSet attributeSet, int i10) {
        int iN;
        int iN2;
        h0 h0VarV = h0.v(this.f21012a.getContext(), attributeSet, p144i.j.f43323P0, i10, 0);
        CheckedTextView checkedTextView = this.f21012a;
        androidx.core.view.Z.k0(checkedTextView, checkedTextView.getContext(), p144i.j.f43323P0, attributeSet, h0VarV.r(), i10, 0);
        try {
            if (h0VarV.s(p144i.j.f43333R0) && (iN2 = h0VarV.n(p144i.j.f43333R0, 0)) != 0) {
                try {
                    CheckedTextView checkedTextView2 = this.f21012a;
                    checkedTextView2.setCheckMarkDrawable(p161j.a.b(checkedTextView2.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                    if (h0VarV.s(p144i.j.f43328Q0)) {
                        CheckedTextView checkedTextView3 = this.f21012a;
                        checkedTextView3.setCheckMarkDrawable(p161j.a.b(checkedTextView3.getContext(), iN));
                    }
                }
            } else if (h0VarV.s(p144i.j.f43328Q0) && (iN = h0VarV.n(p144i.j.f43328Q0, 0)) != 0) {
                CheckedTextView checkedTextView4 = this.f21012a;
                checkedTextView4.setCheckMarkDrawable(p161j.a.b(checkedTextView4.getContext(), iN));
            }
            if (h0VarV.s(p144i.j.f43338S0)) {
                androidx.core.widget.b.b(this.f21012a, h0VarV.c(p144i.j.f43338S0));
            }
            if (h0VarV.s(p144i.j.f43342T0)) {
                androidx.core.widget.b.c(this.f21012a, O.e(h0VarV.k(p144i.j.f43342T0, -1), null));
            }
        } finally {
            h0VarV.x();
        }
    }

    void e() {
        if (this.f21017f) {
            this.f21017f = false;
        } else {
            this.f21017f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f21013b = colorStateList;
        this.f21015d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.f21014c = mode;
        this.f21016e = true;
        a();
    }
}
