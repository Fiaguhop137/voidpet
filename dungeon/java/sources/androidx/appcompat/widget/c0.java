package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class c0 extends CompoundButton {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final Property f20922S = new a(Float.class, "thumbPos");

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final int[] f20923T = {16842912};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f20924A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f20925B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f20926C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f20927D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f20928E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f20929F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f20930G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f20931H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final TextPaint f20932I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private ColorStateList f20933J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private Layout f20934K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private Layout f20935L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private TransformationMethod f20936M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    ObjectAnimator f20937N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final C f20938O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private C1826n f20939P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private b f20940Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final Rect f20941R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f20942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f20943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f20944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f20945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f20946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f20947f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ColorStateList f20948g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private PorterDuff.Mode f20949h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f20950i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f20951j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f20952k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f20953l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f20954m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f20955n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CharSequence f20956o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f20957p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private CharSequence f20958q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CharSequence f20959r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f20960s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f20961t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f20962u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f20963v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f20964w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private VelocityTracker f20965x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f20966y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    float f20967z;

    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(c0 c0Var) {
            return Float.valueOf(c0Var.f20967z);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(c0 c0Var, Float f10) {
            c0Var.setThumbPosition(f10.floatValue());
        }
    }

    static class b extends androidx.emoji2.text.f.AbstractC0290f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Reference f20968a;

        b(c0 c0Var) {
            this.f20968a = new WeakReference(c0Var);
        }

        @Override // androidx.emoji2.text.f.AbstractC0290f
        public void a(Throwable th) {
            c0 c0Var = (c0) this.f20968a.get();
            if (c0Var != null) {
                c0Var.j();
            }
        }

        @Override // androidx.emoji2.text.f.AbstractC0290f
        public void b() {
            c0 c0Var = (c0) this.f20968a.get();
            if (c0Var != null) {
                c0Var.j();
            }
        }
    }

    public c0(Context context) {
        this(context, null);
    }

    public c0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p144i.a.f43069J);
    }

    public c0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f20943b = null;
        this.f20944c = null;
        this.f20945d = false;
        this.f20946e = false;
        this.f20948g = null;
        this.f20949h = null;
        this.f20950i = false;
        this.f20951j = false;
        this.f20965x = VelocityTracker.obtain();
        this.f20931H = true;
        this.f20941R = new Rect();
        d0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f20932I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        h0 h0VarV = h0.v(context, attributeSet, p144i.j.f43265D2, i10, 0);
        androidx.core.view.Z.k0(this, context, p144i.j.f43265D2, attributeSet, h0VarV.r(), i10, 0);
        Drawable drawableG = h0VarV.g(p144i.j.f43280G2);
        this.f20942a = drawableG;
        if (drawableG != null) {
            drawableG.setCallback(this);
        }
        Drawable drawableG2 = h0VarV.g(p144i.j.f43325P2);
        this.f20947f = drawableG2;
        if (drawableG2 != null) {
            drawableG2.setCallback(this);
        }
        setTextOnInternal(h0VarV.p(p144i.j.f43270E2));
        setTextOffInternal(h0VarV.p(p144i.j.f43275F2));
        this.f20960s = h0VarV.a(p144i.j.f43285H2, true);
        this.f20952k = h0VarV.f(p144i.j.f43310M2, 0);
        this.f20953l = h0VarV.f(p144i.j.f43295J2, 0);
        this.f20954m = h0VarV.f(p144i.j.f43300K2, 0);
        this.f20955n = h0VarV.a(p144i.j.f43290I2, false);
        ColorStateList colorStateListC = h0VarV.c(p144i.j.f43315N2);
        if (colorStateListC != null) {
            this.f20943b = colorStateListC;
            this.f20945d = true;
        }
        PorterDuff.Mode modeE = O.e(h0VarV.k(p144i.j.f43320O2, -1), null);
        if (this.f20944c != modeE) {
            this.f20944c = modeE;
            this.f20946e = true;
        }
        if (this.f20945d || this.f20946e) {
            b();
        }
        ColorStateList colorStateListC2 = h0VarV.c(p144i.j.f43330Q2);
        if (colorStateListC2 != null) {
            this.f20948g = colorStateListC2;
            this.f20950i = true;
        }
        PorterDuff.Mode modeE2 = O.e(h0VarV.k(p144i.j.f43335R2, -1), null);
        if (this.f20949h != modeE2) {
            this.f20949h = modeE2;
            this.f20951j = true;
        }
        if (this.f20950i || this.f20951j) {
            c();
        }
        int iN = h0VarV.n(p144i.j.f43305L2, 0);
        if (iN != 0) {
            m(context, iN);
        }
        C c10 = new C(this);
        this.f20938O = c10;
        c10.m(attributeSet, i10);
        h0VarV.x();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f20962u = viewConfiguration.getScaledTouchSlop();
        this.f20966y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i10);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private void a(boolean z10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<c0, Float>) f20922S, z10 ? 1.0f : 0.0f);
        this.f20937N = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.f20937N.setAutoCancel(true);
        this.f20937N.start();
    }

    private void b() {
        Drawable drawable = this.f20942a;
        if (drawable != null) {
            if (this.f20945d || this.f20946e) {
                Drawable drawableMutate = p038c1.a.r(drawable).mutate();
                this.f20942a = drawableMutate;
                if (this.f20945d) {
                    p038c1.a.o(drawableMutate, this.f20943b);
                }
                if (this.f20946e) {
                    p038c1.a.p(this.f20942a, this.f20944c);
                }
                if (this.f20942a.isStateful()) {
                    this.f20942a.setState(getDrawableState());
                }
            }
        }
    }

    private void c() {
        Drawable drawable = this.f20947f;
        if (drawable != null) {
            if (this.f20950i || this.f20951j) {
                Drawable drawableMutate = p038c1.a.r(drawable).mutate();
                this.f20947f = drawableMutate;
                if (this.f20950i) {
                    p038c1.a.o(drawableMutate, this.f20948g);
                }
                if (this.f20951j) {
                    p038c1.a.p(this.f20947f, this.f20949h);
                }
                if (this.f20947f.isStateful()) {
                    this.f20947f.setState(getDrawableState());
                }
            }
        }
    }

    private void d() {
        ObjectAnimator objectAnimator = this.f20937N;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void e(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    private static float f(float f10, float f11, float f12) {
        if (f10 < f11) {
            return f11;
        }
        return f10 > f12 ? f12 : f10;
    }

    private CharSequence g(CharSequence charSequence) {
        TransformationMethod transformationMethodF = getEmojiTextViewHelper().f(this.f20936M);
        return transformationMethodF != null ? transformationMethodF.getTransformation(charSequence, this) : charSequence;
    }

    @NonNull
    private C1826n getEmojiTextViewHelper() {
        if (this.f20939P == null) {
            this.f20939P = new C1826n(this);
        }
        return this.f20939P;
    }

    private boolean getTargetCheckedState() {
        return this.f20967z > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((s0.b(this) ? 1.0f - this.f20967z : this.f20967z) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f20947f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f20941R;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f20942a;
        Rect rectD = drawable2 != null ? O.d(drawable2) : O.f20607c;
        return ((((this.f20924A - this.f20926C) - rect.left) - rect.right) - rectD.left) - rectD.right;
    }

    private boolean h(float f10, float f11) {
        if (this.f20942a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f20942a.getPadding(this.f20941R);
        int i10 = this.f20928E;
        int i11 = this.f20962u;
        int i12 = i10 - i11;
        int i13 = (this.f20927D + thumbOffset) - i11;
        int i14 = this.f20926C + i13;
        Rect rect = this.f20941R;
        return f10 > ((float) i13) && f10 < ((float) (((i14 + rect.left) + rect.right) + i11)) && f11 > ((float) i12) && f11 < ((float) (this.f20930G + i11));
    }

    private Layout i(CharSequence charSequence) {
        TextPaint textPaint = this.f20932I;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f20958q;
            if (string == null) {
                string = getResources().getString(p144i.h.f43230b);
            }
            androidx.core.view.Z.F0(this, string);
        }
    }

    private void l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f20956o;
            if (string == null) {
                string = getResources().getString(p144i.h.f43231c);
            }
            androidx.core.view.Z.F0(this, string);
        }
    }

    private void o(int i10, int i11) {
        Typeface typeface;
        if (i10 == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i10 != 2) {
            typeface = i10 != 3 ? null : Typeface.MONOSPACE;
        } else {
            typeface = Typeface.SERIF;
        }
        n(typeface, i11);
    }

    private void p() {
        if (this.f20940Q == null && this.f20939P.b() && androidx.emoji2.text.f.i()) {
            androidx.emoji2.text.f fVarC = androidx.emoji2.text.f.c();
            int iE = fVarC.e();
            if (iE == 3 || iE == 0) {
                b bVar = new b(this);
                this.f20940Q = bVar;
                fVarC.t(bVar);
            }
        }
    }

    private void q(MotionEvent motionEvent) {
        this.f20961t = 0;
        boolean targetCheckedState = true;
        boolean z10 = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z10) {
            this.f20965x.computeCurrentVelocity(1000);
            float xVelocity = this.f20965x.getXVelocity();
            if (Math.abs(xVelocity) <= this.f20966y) {
                targetCheckedState = getTargetCheckedState();
            } else if (!s0.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                targetCheckedState = false;
            }
        } else {
            targetCheckedState = zIsChecked;
        }
        if (targetCheckedState != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(targetCheckedState);
        e(motionEvent);
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f20958q = charSequence;
        this.f20959r = g(charSequence);
        this.f20935L = null;
        if (this.f20960s) {
            p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f20956o = charSequence;
        this.f20957p = g(charSequence);
        this.f20934K = null;
        if (this.f20960s) {
            p();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i10;
        int i11;
        Rect rect = this.f20941R;
        int i12 = this.f20927D;
        int i13 = this.f20928E;
        int i14 = this.f20929F;
        int i15 = this.f20930G;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f20942a;
        Rect rectD = drawable != null ? O.d(drawable) : O.f20607c;
        Drawable drawable2 = this.f20947f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i16 = rect.left;
            thumbOffset += i16;
            if (rectD != null) {
                int i17 = rectD.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = rectD.top;
                int i19 = rect.top;
                i10 = i18 > i19 ? (i18 - i19) + i13 : i13;
                int i20 = rectD.right;
                int i21 = rect.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = rectD.bottom;
                int i23 = rect.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                }
                this.f20947f.setBounds(i12, i10, i14, i11);
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f20947f.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f20942a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i24 = thumbOffset - rect.left;
            int i25 = thumbOffset + this.f20926C + rect.right;
            this.f20942a.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                p038c1.a.l(background, i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f20942a;
        if (drawable != null) {
            p038c1.a.k(drawable, f10, f11);
        }
        Drawable drawable2 = this.f20947f;
        if (drawable2 != null) {
            p038c1.a.k(drawable2, f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f20942a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f20947f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!s0.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f20924A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f20954m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (s0.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f20924A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f20954m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.i.q(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f20960s;
    }

    public boolean getSplitTrack() {
        return this.f20955n;
    }

    public int getSwitchMinWidth() {
        return this.f20953l;
    }

    public int getSwitchPadding() {
        return this.f20954m;
    }

    public CharSequence getTextOff() {
        return this.f20958q;
    }

    public CharSequence getTextOn() {
        return this.f20956o;
    }

    public Drawable getThumbDrawable() {
        return this.f20942a;
    }

    protected final float getThumbPosition() {
        return this.f20967z;
    }

    public int getThumbTextPadding() {
        return this.f20952k;
    }

    public ColorStateList getThumbTintList() {
        return this.f20943b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f20944c;
    }

    public Drawable getTrackDrawable() {
        return this.f20947f;
    }

    public ColorStateList getTrackTintList() {
        return this.f20948g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f20949h;
    }

    void j() {
        setTextOnInternal(this.f20956o);
        setTextOffInternal(this.f20958q);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f20942a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f20947f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f20937N;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f20937N.end();
        this.f20937N = null;
    }

    public void m(Context context, int i10) {
        h0 h0VarT = h0.t(context, i10, p144i.j.f43340S2);
        ColorStateList colorStateListC = h0VarT.c(p144i.j.f43356W2);
        if (colorStateListC != null) {
            this.f20933J = colorStateListC;
        } else {
            this.f20933J = getTextColors();
        }
        int iF = h0VarT.f(p144i.j.f43344T2, 0);
        if (iF != 0) {
            float f10 = iF;
            if (f10 != this.f20932I.getTextSize()) {
                this.f20932I.setTextSize(f10);
                requestLayout();
            }
        }
        o(h0VarT.k(p144i.j.f43348U2, -1), h0VarT.k(p144i.j.f43352V2, -1));
        if (h0VarT.a(p144i.j.f43378b3, false)) {
            this.f20936M = new p215m.a(getContext());
        } else {
            this.f20936M = null;
        }
        setTextOnInternal(this.f20956o);
        setTextOffInternal(this.f20958q);
        h0VarT.x();
    }

    public void n(Typeface typeface, int i10) {
        if (i10 <= 0) {
            this.f20932I.setFakeBoldText(false);
            this.f20932I.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i10) : Typeface.create(typeface, i10);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int i11 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i10;
            this.f20932I.setFakeBoldText((i11 & 1) != 0);
            this.f20932I.setTextSkewX((i11 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f20923T);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f20941R;
        Drawable drawable = this.f20947f;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.f20928E;
        int i11 = this.f20930G;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f20942a;
        if (drawable != null) {
            if (!this.f20955n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectD = O.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectD.left;
                rect.right -= rectD.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f20934K : this.f20935L;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f20933J;
            if (colorStateList != null) {
                this.f20932I.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f20932I.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i12 + i13) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f20956o : this.f20958q;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(text);
            sb2.append(' ');
            sb2.append(charSequence);
            accessibilityNodeInfo.setText(sb2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iMax;
        int width;
        int paddingLeft;
        int i14;
        int paddingTop;
        int height;
        super.onLayout(z10, i10, i11, i12, i13);
        int iMax2 = 0;
        if (this.f20942a != null) {
            Rect rect = this.f20941R;
            Drawable drawable = this.f20947f;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectD = O.d(this.f20942a);
            iMax = Math.max(0, rectD.left - rect.left);
            iMax2 = Math.max(0, rectD.right - rect.right);
        } else {
            iMax = 0;
        }
        if (s0.b(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f20924A + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f20924A) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                paddingTop = getPaddingTop();
                i14 = this.f20925B;
            } else {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.f20925B;
            }
            this.f20927D = paddingLeft;
            this.f20928E = paddingTop;
            this.f20930G = height;
            this.f20929F = width;
        }
        int paddingTop2 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
        i14 = this.f20925B;
        paddingTop = paddingTop2 - (i14 / 2);
        height = i14 + paddingTop;
        this.f20927D = paddingLeft;
        this.f20928E = paddingTop;
        this.f20930G = height;
        this.f20929F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (this.f20960s) {
            if (this.f20934K == null) {
                this.f20934K = i(this.f20957p);
            }
            if (this.f20935L == null) {
                this.f20935L = i(this.f20959r);
            }
        }
        Rect rect = this.f20941R;
        Drawable drawable = this.f20942a;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f20942a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f20942a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.f20926C = Math.max(this.f20960s ? Math.max(this.f20934K.getWidth(), this.f20935L.getWidth()) + (this.f20952k * 2) : 0, intrinsicWidth);
        Drawable drawable2 = this.f20947f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f20947f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f20942a;
        if (drawable3 != null) {
            Rect rectD = O.d(drawable3);
            iMax = Math.max(iMax, rectD.left);
            iMax2 = Math.max(iMax2, rectD.right);
        }
        int iMax3 = this.f20931H ? Math.max(this.f20953l, (this.f20926C * 2) + iMax + iMax2) : this.f20953l;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f20924A = iMax3;
        this.f20925B = iMax4;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f20956o : this.f20958q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0089  */
    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0094  */
    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f10;
        this.f20965x.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (isEnabled() && h(x10, y10)) {
                this.f20961t = 1;
                this.f20963v = x10;
                this.f20964w = y10;
            }
        } else if (actionMasked == 1) {
            if (this.f20961t == 2) {
                q(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f20961t = 0;
            this.f20965x.clear();
        } else if (actionMasked == 2) {
            int i10 = this.f20961t;
            if (i10 == 1) {
                float x11 = motionEvent.getX();
                float y11 = motionEvent.getY();
                if (Math.abs(x11 - this.f20963v) > this.f20962u || Math.abs(y11 - this.f20964w) > this.f20962u) {
                    this.f20961t = 2;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.f20963v = x11;
                    this.f20964w = y11;
                    return true;
                }
            } else if (i10 == 2) {
                float x12 = motionEvent.getX();
                int thumbScrollRange = getThumbScrollRange();
                float f11 = x12 - this.f20963v;
                if (thumbScrollRange != 0) {
                    f10 = f11 / thumbScrollRange;
                } else {
                    f10 = f11 > 0.0f ? 1.0f : -1.0f;
                }
                if (s0.b(this)) {
                    f10 = -f10;
                }
                float f12 = f(this.f20967z + f10, 0.0f, 1.0f);
                if (f12 != this.f20967z) {
                    this.f20963v = x12;
                    setThumbPosition(f12);
                }
                return true;
            }
        } else if (actionMasked == 3) {
            if (this.f20961t == 2) {
                q(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f20961t = 0;
            this.f20965x.clear();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        super.setChecked(z10);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            l();
        } else {
            k();
        }
        if (getWindowToken() != null && isLaidOut()) {
            a(zIsChecked);
        } else {
            d();
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
        setTextOnInternal(this.f20956o);
        setTextOffInternal(this.f20958q);
        requestLayout();
    }

    protected final void setEnforceSwitchWidth(boolean z10) {
        this.f20931H = z10;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.f20960s != z10) {
            this.f20960s = z10;
            requestLayout();
            if (z10) {
                p();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f20955n = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f20953l = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f20954m = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f20932I.getTypeface() == null || this.f20932I.getTypeface().equals(typeface)) && (this.f20932I.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f20932I.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        k();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f20942a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f20942a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f10) {
        this.f20967z = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(p161j.a.b(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.f20952k = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f20943b = colorStateList;
        this.f20945d = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f20944c = mode;
        this.f20946e = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f20947f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f20947f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(p161j.a.b(getContext(), i10));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f20948g = colorStateList;
        this.f20950i = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f20949h = mode;
        this.f20951j = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f20942a || drawable == this.f20947f;
    }
}
