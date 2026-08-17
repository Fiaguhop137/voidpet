package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class D extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1817e f20577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C f20578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B f20579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C1826n f20580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f20581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f20582f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Future f20583g;

    private interface a {
        void a(int[] iArr, int i10);

        void b(int i10);

        int c();

        int d();

        void e(int i10, float f10);

        int[] f();

        TextClassifier g();

        int h();

        void i(TextClassifier textClassifier);

        void j(int i10, int i11, int i12, int i13);

        void k(int i10);

        int l();

        void m(int i10);
    }

    class b implements a {
        b() {
        }

        @Override // androidx.appcompat.widget.D.a
        public void a(int[] iArr, int i10) {
            D.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        @Override // androidx.appcompat.widget.D.a
        public void b(int i10) {
        }

        @Override // androidx.appcompat.widget.D.a
        public int c() {
            return D.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.D.a
        public int d() {
            return D.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.D.a
        public void e(int i10, float f10) {
        }

        @Override // androidx.appcompat.widget.D.a
        public int[] f() {
            return D.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.D.a
        public TextClassifier g() {
            return D.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.D.a
        public int h() {
            return D.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.D.a
        public void i(TextClassifier textClassifier) {
            D.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.widget.D.a
        public void j(int i10, int i11, int i12, int i13) {
            D.super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        @Override // androidx.appcompat.widget.D.a
        public void k(int i10) {
        }

        @Override // androidx.appcompat.widget.D.a
        public int l() {
            return D.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.D.a
        public void m(int i10) {
            D.super.setAutoSizeTextTypeWithDefaults(i10);
        }
    }

    class c extends b {
        c() {
            super();
        }

        @Override // androidx.appcompat.widget.D.b, androidx.appcompat.widget.D.a
        public void b(int i10) {
            D.super.setLastBaselineToBottomHeight(i10);
        }

        @Override // androidx.appcompat.widget.D.b, androidx.appcompat.widget.D.a
        public void k(int i10) {
            D.super.setFirstBaselineToTopHeight(i10);
        }
    }

    class d extends c {
        d() {
            super();
        }

        @Override // androidx.appcompat.widget.D.b, androidx.appcompat.widget.D.a
        public void e(int i10, float f10) {
            D.super.setLineHeight(i10, f10);
        }
    }

    public D(Context context) {
        this(context, null);
    }

    public D(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public D(Context context, AttributeSet attributeSet, int i10) {
        super(e0.b(context), attributeSet, i10);
        this.f20581e = false;
        this.f20582f = null;
        d0.a(this, getContext());
        C1817e c1817e = new C1817e(this);
        this.f20577a = c1817e;
        c1817e.e(attributeSet, i10);
        C c10 = new C(this);
        this.f20578b = c10;
        c10.m(attributeSet, i10);
        c10.b();
        this.f20579c = new B(this);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @NonNull
    private C1826n getEmojiTextViewHelper() {
        if (this.f20580d == null) {
            this.f20580d = new C1826n(this);
        }
        return this.f20580d;
    }

    private void r() {
        Future future = this.f20583g;
        if (future != null) {
            try {
                this.f20583g = null;
                android.support.v4.media.session.b.a(future.get());
                androidx.core.widget.i.n(this, null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1817e c1817e = this.f20577a;
        if (c1817e != null) {
            c1817e.b();
        }
        C c10 = this.f20578b;
        if (c10 != null) {
            c10.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (s0.f21109c) {
            return getSuperCaller().h();
        }
        C c10 = this.f20578b;
        if (c10 != null) {
            return c10.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (s0.f21109c) {
            return getSuperCaller().d();
        }
        C c10 = this.f20578b;
        if (c10 != null) {
            return c10.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (s0.f21109c) {
            return getSuperCaller().l();
        }
        C c10 = this.f20578b;
        if (c10 != null) {
            return c10.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (s0.f21109c) {
            return getSuperCaller().f();
        }
        C c10 = this.f20578b;
        return c10 != null ? c10.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (s0.f21109c) {
            return getSuperCaller().c() == 1 ? 1 : 0;
        }
        C c10 = this.f20578b;
        if (c10 != null) {
            return c10.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.i.q(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.i.b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.i.c(this);
    }

    a getSuperCaller() {
        if (this.f20582f == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.f20582f = new d();
            } else if (i10 >= 28) {
                this.f20582f = new c();
            } else if (i10 >= 26) {
                this.f20582f = new b();
            }
        }
        return this.f20582f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1817e c1817e = this.f20577a;
        if (c1817e != null) {
            return c1817e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1817e c1817e = this.f20577a;
        if (c1817e != null) {
            return c1817e.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f20578b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f20578b.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        r();
        return super.getText();
    }

    @Override // android.widget.TextView
    @NonNull
    public TextClassifier getTextClassifier() {
        B b10;
        return (Build.VERSION.SDK_INT >= 28 || (b10 = this.f20579c) == null) ? getSuperCaller().g() : b10.a();
    }

    @NonNull
    public k1.l.a getTextMetricsParamsCompat() {
        return androidx.core.widget.i.f(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f20578b.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        return AbstractC1827o.a(inputConnectionOnCreateInputConnection, editorInfo, this);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        C c10 = this.f20578b;
        if (c10 != null) {
            c10.o(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        r();
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        C c10 = this.f20578b;
        if (c10 == null || s0.f21109c || !c10.l()) {
            return;
        }
        this.f20578b.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (s0.f21109c) {
            getSuperCaller().j(i10, i11, i12, i13);
            return;
        }
        C c10 = this.f20578b;
        if (c10 != null) {
            c10.t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (s0.f21109c) {
            getSuperCaller().a(iArr, i10);
            return;
        }
        C c10 = this.f20578b;
        if (c10 != null) {
            c10.u(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (s0.f21109c) {
            getSuperCaller().m(i10);
            return;
        }
        C c10 = this.f20578b;
        if (c10 != null) {
            c10.v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1817e c1817e = this.f20577a;
        if (c1817e != null) {
            c1817e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1817e c1817e = this.f20577a;
        if (c1817e != null) {
            c1817e.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f20578b;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f20578b;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? p161j.a.b(context, i10) : null, i11 != 0 ? p161j.a.b(context, i11) : null, i12 != 0 ? p161j.a.b(context, i12) : null, i13 != 0 ? p161j.a.b(context, i13) : null);
        C c10 = this.f20578b;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f20578b;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? p161j.a.b(context, i10) : null, i11 != 0 ? p161j.a.b(context, i11) : null, i12 != 0 ? p161j.a.b(context, i12) : null, i13 != 0 ? p161j.a.b(context, i13) : null);
        C c10 = this.f20578b;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f20578b;
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

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().k(i10);
        } else {
            androidx.core.widget.i.j(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i10);
        } else {
            androidx.core.widget.i.k(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        androidx.core.widget.i.l(this, i10);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10, float f10) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().e(i10, f10);
        } else {
            androidx.core.widget.i.m(this, i10, f10);
        }
    }

    public void setPrecomputedText(@NonNull p181k1.l lVar) {
        androidx.core.widget.i.n(this, lVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1817e c1817e = this.f20577a;
        if (c1817e != null) {
            c1817e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1817e c1817e = this.f20577a;
        if (c1817e != null) {
            c1817e.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f20578b.w(colorStateList);
        this.f20578b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f20578b.x(mode);
        this.f20578b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C c10 = this.f20578b;
        if (c10 != null) {
            c10.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        B b10;
        if (Build.VERSION.SDK_INT >= 28 || (b10 = this.f20579c) == null) {
            getSuperCaller().i(textClassifier);
        } else {
            b10.b(textClassifier);
        }
    }

    public void setTextFuture(Future<p181k1.l> future) {
        this.f20583g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@NonNull k1.l.a aVar) {
        androidx.core.widget.i.p(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (s0.f21109c) {
            super.setTextSize(i10, f10);
            return;
        }
        C c10 = this.f20578b;
        if (c10 != null) {
            c10.A(i10, f10);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i10) {
        if (this.f20581e) {
            return;
        }
        Typeface typefaceA = (typeface == null || i10 <= 0) ? null : p020b1.u.a(getContext(), typeface, i10);
        this.f20581e = true;
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.f20581e = false;
        }
    }
}
