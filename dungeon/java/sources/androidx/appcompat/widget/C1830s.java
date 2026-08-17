package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* JADX INFO: renamed from: androidx.appcompat.widget.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1830s extends MultiAutoCompleteTextView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f21103d = {16843126};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1817e f21104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C f21105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1825m f21106c;

    public C1830s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p144i.a.f43085m);
    }

    public C1830s(Context context, AttributeSet attributeSet, int i10) {
        super(e0.b(context), attributeSet, i10);
        d0.a(this, getContext());
        h0 h0VarV = h0.v(getContext(), attributeSet, f21103d, i10, 0);
        if (h0VarV.s(0)) {
            setDropDownBackgroundDrawable(h0VarV.g(0));
        }
        h0VarV.x();
        C1817e c1817e = new C1817e(this);
        this.f21104a = c1817e;
        c1817e.e(attributeSet, i10);
        C c10 = new C(this);
        this.f21105b = c10;
        c10.m(attributeSet, i10);
        c10.b();
        C1825m c1825m = new C1825m(this);
        this.f21106c = c1825m;
        c1825m.c(attributeSet, i10);
        a(c1825m);
    }

    void a(C1825m c1825m) {
        KeyListener keyListener = getKeyListener();
        if (c1825m.b(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerA = c1825m.a(keyListener);
            if (keyListenerA == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerA);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1817e c1817e = this.f21104a;
        if (c1817e != null) {
            c1817e.b();
        }
        C c10 = this.f21105b;
        if (c10 != null) {
            c10.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1817e c1817e = this.f21104a;
        if (c1817e != null) {
            return c1817e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1817e c1817e = this.f21104a;
        if (c1817e != null) {
            return c1817e.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f21105b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f21105b.k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f21106c.d(AbstractC1827o.a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1817e c1817e = this.f21104a;
        if (c1817e != null) {
            c1817e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1817e c1817e = this.f21104a;
        if (c1817e != null) {
            c1817e.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f21105b;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f21105b;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(p161j.a.b(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f21106c.e(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f21106c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1817e c1817e = this.f21104a;
        if (c1817e != null) {
            c1817e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1817e c1817e = this.f21104a;
        if (c1817e != null) {
            c1817e.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f21105b.w(colorStateList);
        this.f21105b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f21105b.x(mode);
        this.f21105b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C c10 = this.f21105b;
        if (c10 != null) {
            c10.q(context, i10);
        }
    }
}
