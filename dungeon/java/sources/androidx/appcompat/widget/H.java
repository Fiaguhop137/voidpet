package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class H extends ToggleButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1817e f20602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C f20603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C1826n f20604c;

    public H(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    public H(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        d0.a(this, getContext());
        C1817e c1817e = new C1817e(this);
        this.f20602a = c1817e;
        c1817e.e(attributeSet, i10);
        C c10 = new C(this);
        this.f20603b = c10;
        c10.m(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @NonNull
    private C1826n getEmojiTextViewHelper() {
        if (this.f20604c == null) {
            this.f20604c = new C1826n(this);
        }
        return this.f20604c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1817e c1817e = this.f20602a;
        if (c1817e != null) {
            c1817e.b();
        }
        C c10 = this.f20603b;
        if (c10 != null) {
            c10.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1817e c1817e = this.f20602a;
        if (c1817e != null) {
            return c1817e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1817e c1817e = this.f20602a;
        if (c1817e != null) {
            return c1817e.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f20603b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f20603b.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1817e c1817e = this.f20602a;
        if (c1817e != null) {
            c1817e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1817e c1817e = this.f20602a;
        if (c1817e != null) {
            c1817e.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f20603b;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f20603b;
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
        C1817e c1817e = this.f20602a;
        if (c1817e != null) {
            c1817e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1817e c1817e = this.f20602a;
        if (c1817e != null) {
            c1817e.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f20603b.w(colorStateList);
        this.f20603b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f20603b.x(mode);
        this.f20603b.b();
    }
}
