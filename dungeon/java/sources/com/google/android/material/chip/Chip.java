package com.google.android.material.chip;

import Y8.i;
import Y8.j;
import Y8.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.C1819g;
import androidx.core.view.Z;
import com.google.android.material.internal.m;
import com.google.android.material.internal.p;
import java.util.List;
import p217m1.B;
import p243n9.d;
import p243n9.f;
import p297q9.h;
import p297q9.n;

/* JADX INFO: loaded from: classes2.dex */
public class Chip extends C1819g implements com.google.android.material.chip.a.InterfaceC0399a, n, Checkable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f36415w = j.f17212q;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Rect f36416x = new Rect();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int[] f36417y = {16842913};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int[] f36418z = {16842911};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.material.chip.a f36419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InsetDrawable f36420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private RippleDrawable f36421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View.OnClickListener f36422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f36423i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f36424j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f36425k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f36426l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f36427m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f36428n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f36429o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f36430p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private CharSequence f36431q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final c f36432r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f36433s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Rect f36434t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final RectF f36435u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final f f36436v;

    class a extends f {
        a() {
        }

        @Override // p243n9.f
        public void a(int i10) {
        }

        @Override // p243n9.f
        public void b(Typeface typeface, boolean z10) {
            Chip chip = Chip.this;
            chip.setText(chip.f36419e.J2() ? Chip.this.f36419e.e1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f36419e != null) {
                Chip.this.f36419e.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    private class c extends p343t1.a {
        c(Chip chip) {
            super(chip);
        }

        @Override // p343t1.a
        protected int B(float f10, float f11) {
            return (Chip.this.n() && Chip.this.getCloseIconTouchBounds().contains(f10, f11)) ? 1 : 0;
        }

        @Override // p343t1.a
        protected void C(List list) {
            list.add(0);
            if (Chip.this.n() && Chip.this.s() && Chip.this.f36422h != null) {
                list.add(1);
            }
        }

        @Override // p343t1.a
        protected boolean J(int i10, int i11, Bundle bundle) {
            if (i11 != 16) {
                return false;
            }
            if (i10 == 0) {
                return Chip.this.performClick();
            }
            if (i10 == 1) {
                return Chip.this.t();
            }
            return false;
        }

        @Override // p343t1.a
        protected void M(B b10) {
            b10.x0(Chip.this.r());
            b10.A0(Chip.this.isClickable());
            b10.z0(Chip.this.getAccessibilityClassName());
            b10.i1(Chip.this.getText());
        }

        @Override // p343t1.a
        protected void N(int i10, B b10) {
            if (i10 != 1) {
                b10.D0("");
                b10.v0(Chip.f36416x);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                b10.D0(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                b10.D0(Chip.this.getContext().getString(i.f17183n, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            b10.v0(Chip.this.getCloseIconTouchBoundsInt());
            b10.b(B.a.f48962i);
            b10.H0(Chip.this.isEnabled());
        }

        @Override // p343t1.a
        protected void O(int i10, boolean z10) {
            if (i10 == 1) {
                Chip.this.f36427m = z10;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Y8.a.f16990g);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f36415w;
        super(p351t9.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f36434t = new Rect();
        this.f36435u = new RectF();
        this.f36436v = new a();
        Context context2 = getContext();
        C(attributeSet);
        com.google.android.material.chip.a aVarS0 = com.google.android.material.chip.a.s0(context2, attributeSet, i10, i11);
        o(context2, attributeSet, i10);
        setChipDrawable(aVarS0);
        aVarS0.V(Z.u(this));
        TypedArray typedArrayI = m.i(context2, attributeSet, k.f17374R0, i10, i11, new int[0]);
        boolean zHasValue = typedArrayI.hasValue(k.f17240C1);
        typedArrayI.recycle();
        this.f36432r = new c(this);
        x();
        if (!zHasValue) {
            p();
        }
        setChecked(this.f36424j);
        setText(aVarS0.e1());
        setEllipsize(aVarS0.Y0());
        B();
        if (!this.f36419e.J2()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        A();
        if (v()) {
            setMinHeight(this.f36430p);
        }
        this.f36429o = Z.z(this);
        super.setOnCheckedChangeListener(new p100f9.a(this));
    }

    private void A() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f36419e) == null) {
            return;
        }
        int iG0 = (int) (aVar.G0() + this.f36419e.g1() + this.f36419e.n0());
        int iL0 = (int) (this.f36419e.L0() + this.f36419e.h1() + this.f36419e.j0());
        if (this.f36420f != null) {
            Rect rect = new Rect();
            this.f36420f.getPadding(rect);
            iL0 += rect.left;
            iG0 += rect.right;
        }
        Z.B0(this, iL0, getPaddingTop(), iG0, getPaddingBottom());
    }

    private void B() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.n(getContext(), paint, this.f36436v);
        }
    }

    private void C(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        }
    }

    public static /* synthetic */ void b(Chip chip, CompoundButton compoundButton, boolean z10) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f36423i;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public RectF getCloseIconTouchBounds() {
        this.f36435u.setEmpty();
        if (n() && this.f36422h != null) {
            this.f36419e.V0(this.f36435u);
        }
        return this.f36435u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f36434t.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f36434t;
    }

    private d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            return aVar.f1();
        }
        return null;
    }

    private void j(com.google.android.material.chip.a aVar) {
        aVar.m2(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    private int[] k() {
        ?? IsEnabled = isEnabled();
        int i10 = IsEnabled;
        if (this.f36427m) {
            i10 = IsEnabled + 1;
        }
        int i11 = i10;
        if (this.f36426l) {
            i11 = i10 + 1;
        }
        int i12 = i11;
        if (this.f36425k) {
            i12 = i11 + 1;
        }
        int i13 = i12;
        if (isChecked()) {
            i13 = i12 + 1;
        }
        int[] iArr = new int[i13];
        int i14 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i14 = 1;
        }
        if (this.f36427m) {
            iArr[i14] = 16842908;
            i14++;
        }
        if (this.f36426l) {
            iArr[i14] = 16843623;
            i14++;
        }
        if (this.f36425k) {
            iArr[i14] = 16842919;
            i14++;
        }
        if (isChecked()) {
            iArr[i14] = 16842913;
        }
        return iArr;
    }

    private void m() {
        if (getBackgroundDrawable() == this.f36420f && this.f36419e.getCallback() == null) {
            this.f36419e.setCallback(this.f36420f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        com.google.android.material.chip.a aVar = this.f36419e;
        return (aVar == null || aVar.O0() == null) ? false : true;
    }

    private void o(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayI = m.i(context, attributeSet, k.f17374R0, i10, f36415w, new int[0]);
        this.f36428n = typedArrayI.getBoolean(k.f17668x1, false);
        this.f36430p = (int) Math.ceil(typedArrayI.getDimension(k.f17560l1, (float) Math.ceil(p.c(getContext(), 48))));
        typedArrayI.recycle();
    }

    private void p() {
        setOutlineProvider(new b());
    }

    private void q(int i10, int i11, int i12, int i13) {
        this.f36420f = new InsetDrawable((Drawable) this.f36419e, i10, i11, i12, i13);
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f36426l != z10) {
            this.f36426l = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f36425k != z10) {
            this.f36425k = z10;
            refreshDrawableState();
        }
    }

    private void u() {
        if (this.f36420f != null) {
            this.f36420f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            y();
        }
    }

    private void w(com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.m2(null);
        }
    }

    private void x() {
        if (n() && s() && this.f36422h != null) {
            Z.m0(this, this.f36432r);
            this.f36433s = true;
        } else {
            Z.m0(this, null);
            this.f36433s = false;
        }
    }

    private void y() {
        if (p261o9.b.f50462a) {
            z();
            return;
        }
        this.f36419e.I2(true);
        Z.q0(this, getBackgroundDrawable());
        A();
        m();
    }

    private void z() {
        this.f36421g = new RippleDrawable(p261o9.b.d(this.f36419e.c1()), getBackgroundDrawable(), null);
        this.f36419e.I2(false);
        Z.q0(this, this.f36421g);
        A();
    }

    @Override // com.google.android.material.chip.a.InterfaceC0399a
    public void a() {
        l(this.f36430p);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.f36433s) {
            return this.f36432r.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f36433s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f36432r.w(keyEvent) || this.f36432r.A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.C1819g, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f36419e;
        if ((aVar == null || !aVar.m1()) ? false : this.f36419e.i2(k())) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f36431q)) {
            return this.f36431q;
        }
        if (!r()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f36420f;
        return insetDrawable == null ? this.f36419e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            return aVar.C0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            return aVar.D0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            return aVar.E0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            return Math.max(0.0f, aVar.F0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f36419e;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            return aVar.G0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            return aVar.H0();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            return aVar.I0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            return aVar.J0();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            return aVar.K0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            return aVar.L0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            return aVar.M0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            return aVar.N0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            return aVar.O0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            return aVar.P0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            return aVar.Q0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            return aVar.R0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            return aVar.S0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            return aVar.U0();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            return aVar.Y0();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.f36433s && (this.f36432r.A() == 1 || this.f36432r.x() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public Z8.c getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            return aVar.Z0();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            return aVar.a1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            return aVar.b1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            return aVar.c1();
        }
        return null;
    }

    @NonNull
    public p297q9.k getShapeAppearanceModel() {
        return this.f36419e.B();
    }

    public Z8.c getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            return aVar.d1();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            return aVar.g1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            return aVar.h1();
        }
        return 0.0f;
    }

    public boolean l(int i10) {
        this.f36430p = i10;
        if (!v()) {
            if (this.f36420f != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int iMax = Math.max(0, i10 - this.f36419e.getIntrinsicHeight());
        int iMax2 = Math.max(0, i10 - this.f36419e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.f36420f != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int i11 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i12 = iMax > 0 ? iMax / 2 : 0;
        if (this.f36420f != null) {
            Rect rect = new Rect();
            this.f36420f.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                y();
                return true;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        q(i11, i12, i11, i12);
        y();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.f(this, this.f36419e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f36417y);
        }
        if (r()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f36418z);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.f36433s) {
            this.f36432r.I(z10, i10, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i10);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f36429o != i10) {
            this.f36429o = i10;
            A();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.f36425k) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z10 = true;
                }
                z10 = false;
            } else {
                if (this.f36425k) {
                    t();
                    z10 = true;
                }
                setCloseIconPressed(false);
            }
            z10 = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z10 = true;
        } else {
            z10 = false;
        }
        return z10 || super.onTouchEvent(motionEvent);
    }

    public boolean r() {
        com.google.android.material.chip.a aVar = this.f36419e;
        return aVar != null && aVar.l1();
    }

    public boolean s() {
        com.google.android.material.chip.a aVar = this.f36419e;
        return aVar != null && aVar.n1();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f36431q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f36421g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.C1819g, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f36421g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.C1819g, android.view.View
    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.u1(z10);
        }
    }

    public void setCheckableResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.v1(i10);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar == null) {
            this.f36424j = z10;
        } else if (aVar.l1()) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.w1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.x1(i10);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.y1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.z1(i10);
        }
    }

    public void setCheckedIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.A1(i10);
        }
    }

    public void setCheckedIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.B1(z10);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.C1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.D1(i10);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.E1(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.F1(i10);
        }
    }

    public void setChipDrawable(@NonNull com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f36419e;
        if (aVar2 != aVar) {
            w(aVar2);
            this.f36419e = aVar;
            aVar.x2(false);
            j(this.f36419e);
            l(this.f36430p);
        }
    }

    public void setChipEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.G1(f10);
        }
    }

    public void setChipEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.H1(i10);
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.I1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.J1(i10);
        }
    }

    public void setChipIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.K1(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.L1(i10);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.M1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.N1(i10);
        }
    }

    public void setChipIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.O1(i10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.P1(z10);
        }
    }

    public void setChipMinHeight(float f10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.Q1(f10);
        }
    }

    public void setChipMinHeightResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.R1(i10);
        }
    }

    public void setChipStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.S1(f10);
        }
    }

    public void setChipStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.T1(i10);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.U1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.V1(i10);
        }
    }

    public void setChipStrokeWidth(float f10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.W1(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.X1(i10);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.Z1(drawable);
        }
        x();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.a2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.b2(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.c2(i10);
        }
    }

    public void setCloseIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.d2(i10);
        }
        x();
    }

    public void setCloseIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.e2(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.f2(i10);
        }
    }

    public void setCloseIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.g2(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.h2(i10);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.j2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.k2(i10);
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    public void setCloseIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.l2(z10);
        }
        x();
    }

    @Override // androidx.appcompat.widget.C1819g, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.C1819g, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.V(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f36419e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.n2(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f36428n = z10;
        l(this.f36430p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(Z8.c cVar) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.o2(cVar);
        }
    }

    public void setHideMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.p2(i10);
        }
    }

    public void setIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.q2(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.r2(i10);
        }
    }

    public void setIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.s2(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.t2(i10);
        }
    }

    public void setInternalOnCheckedChangeListener(com.google.android.material.internal.f fVar) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f36419e == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.u2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i10);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f36423i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f36422h = onClickListener;
        x();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.v2(colorStateList);
        }
        if (this.f36419e.j1()) {
            return;
        }
        z();
    }

    public void setRippleColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.w2(i10);
            if (this.f36419e.j1()) {
                return;
            }
            z();
        }
    }

    @Override // p297q9.n
    public void setShapeAppearanceModel(@NonNull p297q9.k kVar) {
        this.f36419e.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(Z8.c cVar) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.y2(cVar);
        }
    }

    public void setShowMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.z2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (!z10) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z10);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.J2() ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f36419e;
        if (aVar2 != null) {
            aVar2.A2(charSequence);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.C2(i10);
        }
        B();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.C2(i10);
        }
        B();
    }

    public void setTextAppearance(d dVar) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.B2(dVar);
        }
        B();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.D2(f10);
        }
    }

    public void setTextEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.E2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.F2(TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics()));
        }
        B();
    }

    public void setTextStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.G2(f10);
        }
    }

    public void setTextStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36419e;
        if (aVar != null) {
            aVar.H2(i10);
        }
    }

    public boolean t() {
        boolean z10 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f36422h;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z10 = true;
        }
        if (this.f36433s) {
            this.f36432r.U(1, 1);
        }
        return z10;
    }

    public boolean v() {
        return this.f36428n;
    }
}
