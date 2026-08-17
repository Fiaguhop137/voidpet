package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.T;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d extends T {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Drawable f36754p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Rect f36755q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Rect f36756r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f36757s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f36758t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f36759u;

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f36755q = new Rect();
        this.f36756r = new Rect();
        this.f36757s = 119;
        this.f36758t = true;
        this.f36759u = false;
        TypedArray typedArrayI = m.i(context, attributeSet, Y8.k.f17570m2, i10, 0, new int[0]);
        this.f36757s = typedArrayI.getInt(Y8.k.f17588o2, this.f36757s);
        Drawable drawable = typedArrayI.getDrawable(Y8.k.f17579n2);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f36758t = typedArrayI.getBoolean(Y8.k.f17597p2, true);
        typedArrayI.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f36754p;
        if (drawable != null) {
            if (this.f36759u) {
                this.f36759u = false;
                Rect rect = this.f36755q;
                Rect rect2 = this.f36756r;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f36758t) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f36757s, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f36754p;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f36754p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f36754p.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f36754p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f36757s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f36754p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.T, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f36759u = z10 | this.f36759u;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f36759u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f36754p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f36754p);
            }
            this.f36754p = drawable;
            this.f36759u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f36757s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (this.f36757s != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f36757s = i10;
            if (i10 == 119 && this.f36754p != null) {
                this.f36754p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f36754p;
    }
}
