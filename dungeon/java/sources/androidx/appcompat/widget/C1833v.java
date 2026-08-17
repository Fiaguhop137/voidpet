package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: androidx.appcompat.widget.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1833v extends RadioButton implements androidx.core.widget.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1822j f21115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1817e f21116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C f21117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C1826n f21118d;

    public C1833v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p144i.a.f43064E);
    }

    public C1833v(Context context, AttributeSet attributeSet, int i10) {
        super(e0.b(context), attributeSet, i10);
        d0.a(this, getContext());
        C1822j c1822j = new C1822j(this);
        this.f21115a = c1822j;
        c1822j.d(attributeSet, i10);
        C1817e c1817e = new C1817e(this);
        this.f21116b = c1817e;
        c1817e.e(attributeSet, i10);
        C c10 = new C(this);
        this.f21117c = c10;
        c10.m(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @NonNull
    private C1826n getEmojiTextViewHelper() {
        if (this.f21118d == null) {
            this.f21118d = new C1826n(this);
        }
        return this.f21118d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1817e c1817e = this.f21116b;
        if (c1817e != null) {
            c1817e.b();
        }
        C c10 = this.f21117c;
        if (c10 != null) {
            c10.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1817e c1817e = this.f21116b;
        if (c1817e != null) {
            return c1817e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1817e c1817e = this.f21116b;
        if (c1817e != null) {
            return c1817e.d();
        }
        return null;
    }

    @Override // androidx.core.widget.k
    public ColorStateList getSupportButtonTintList() {
        C1822j c1822j = this.f21115a;
        if (c1822j != null) {
            return c1822j.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C1822j c1822j = this.f21115a;
        if (c1822j != null) {
            return c1822j.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f21117c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f21117c.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1817e c1817e = this.f21116b;
        if (c1817e != null) {
            c1817e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1817e c1817e = this.f21116b;
        if (c1817e != null) {
            c1817e.g(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(p161j.a.b(getContext(), i10));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C1822j c1822j = this.f21115a;
        if (c1822j != null) {
            c1822j.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f21117c;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f21117c;
        if (c10 != null) {
            c10.p();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1817e c1817e = this.f21116b;
        if (c1817e != null) {
            c1817e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1817e c1817e = this.f21116b;
        if (c1817e != null) {
            c1817e.j(mode);
        }
    }

    @Override // androidx.core.widget.k
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C1822j c1822j = this.f21115a;
        if (c1822j != null) {
            c1822j.f(colorStateList);
        }
    }

    @Override // androidx.core.widget.k
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C1822j c1822j = this.f21115a;
        if (c1822j != null) {
            c1822j.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f21117c.w(colorStateList);
        this.f21117c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f21117c.x(mode);
        this.f21117c.b();
    }
}
