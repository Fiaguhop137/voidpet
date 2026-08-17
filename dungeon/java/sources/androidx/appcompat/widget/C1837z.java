package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: renamed from: androidx.appcompat.widget.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1837z extends C1832u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SeekBar f21121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f21122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ColorStateList f21123f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f21124g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f21125h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f21126i;

    C1837z(SeekBar seekBar) {
        super(seekBar);
        this.f21123f = null;
        this.f21124g = null;
        this.f21125h = false;
        this.f21126i = false;
        this.f21121d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f21122e;
        if (drawable != null) {
            if (this.f21125h || this.f21126i) {
                Drawable drawableR = p038c1.a.r(drawable.mutate());
                this.f21122e = drawableR;
                if (this.f21125h) {
                    p038c1.a.o(drawableR, this.f21123f);
                }
                if (this.f21126i) {
                    p038c1.a.p(this.f21122e, this.f21124g);
                }
                if (this.f21122e.isStateful()) {
                    this.f21122e.setState(this.f21121d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.C1832u
    void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        h0 h0VarV = h0.v(this.f21121d.getContext(), attributeSet, p144i.j.f43341T, i10, 0);
        SeekBar seekBar = this.f21121d;
        androidx.core.view.Z.k0(seekBar, seekBar.getContext(), p144i.j.f43341T, attributeSet, h0VarV.r(), i10, 0);
        Drawable drawableH = h0VarV.h(p144i.j.f43345U);
        if (drawableH != null) {
            this.f21121d.setThumb(drawableH);
        }
        j(h0VarV.g(p144i.j.f43349V));
        if (h0VarV.s(p144i.j.f43357X)) {
            this.f21124g = O.e(h0VarV.k(p144i.j.f43357X, -1), this.f21124g);
            this.f21126i = true;
        }
        if (h0VarV.s(p144i.j.f43353W)) {
            this.f21123f = h0VarV.c(p144i.j.f43353W);
            this.f21125h = true;
        }
        h0VarV.x();
        f();
    }

    void g(Canvas canvas) {
        if (this.f21122e != null) {
            int max = this.f21121d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f21122e.getIntrinsicWidth();
                int intrinsicHeight = this.f21122e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f21122e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f21121d.getWidth() - this.f21121d.getPaddingLeft()) - this.f21121d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f21121d.getPaddingLeft(), this.f21121d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f21122e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    void h() {
        Drawable drawable = this.f21122e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f21121d.getDrawableState())) {
            this.f21121d.invalidateDrawable(drawable);
        }
    }

    void i() {
        Drawable drawable = this.f21122e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f21122e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f21122e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f21121d);
            p038c1.a.m(drawable, this.f21121d.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.f21121d.getDrawableState());
            }
            f();
        }
        this.f21121d.invalidate();
    }
}
