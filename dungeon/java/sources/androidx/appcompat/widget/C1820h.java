package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: androidx.appcompat.widget.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1820h extends CheckedTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1821i f21005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1817e f21006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C f21007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C1826n f21008d;

    public C1820h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p144i.a.f43088p);
    }

    public C1820h(Context context, AttributeSet attributeSet, int i10) {
        super(e0.b(context), attributeSet, i10);
        d0.a(this, getContext());
        C c10 = new C(this);
        this.f21007c = c10;
        c10.m(attributeSet, i10);
        c10.b();
        C1817e c1817e = new C1817e(this);
        this.f21006b = c1817e;
        c1817e.e(attributeSet, i10);
        C1821i c1821i = new C1821i(this);
        this.f21005a = c1821i;
        c1821i.d(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @NonNull
    private C1826n getEmojiTextViewHelper() {
        if (this.f21008d == null) {
            this.f21008d = new C1826n(this);
        }
        return this.f21008d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C c10 = this.f21007c;
        if (c10 != null) {
            c10.b();
        }
        C1817e c1817e = this.f21006b;
        if (c1817e != null) {
            c1817e.b();
        }
        C1821i c1821i = this.f21005a;
        if (c1821i != null) {
            c1821i.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.i.q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1817e c1817e = this.f21006b;
        if (c1817e != null) {
            return c1817e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1817e c1817e = this.f21006b;
        if (c1817e != null) {
            return c1817e.d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C1821i c1821i = this.f21005a;
        if (c1821i != null) {
            return c1821i.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C1821i c1821i = this.f21005a;
        if (c1821i != null) {
            return c1821i.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f21007c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f21007c.k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return AbstractC1827o.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1817e c1817e = this.f21006b;
        if (c1817e != null) {
            c1817e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1817e c1817e = this.f21006b;
        if (c1817e != null) {
            c1817e.g(i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(p161j.a.b(getContext(), i10));
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C1821i c1821i = this.f21005a;
        if (c1821i != null) {
            c1821i.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f21007c;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f21007c;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1817e c1817e = this.f21006b;
        if (c1817e != null) {
            c1817e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1817e c1817e = this.f21006b;
        if (c1817e != null) {
            c1817e.j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C1821i c1821i = this.f21005a;
        if (c1821i != null) {
            c1821i.f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C1821i c1821i = this.f21005a;
        if (c1821i != null) {
            c1821i.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f21007c.w(colorStateList);
        this.f21007c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f21007c.x(mode);
        this.f21007c.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C c10 = this.f21007c;
        if (c10 != null) {
            c10.q(context, i10);
        }
    }
}
