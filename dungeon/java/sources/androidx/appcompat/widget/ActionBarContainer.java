package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f20461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f20462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f20463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f20464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Drawable f20465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Drawable f20466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Drawable f20467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f20468h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f20469i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f20470j;

    private static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C1814b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p144i.j.f43369a);
        this.f20465e = typedArrayObtainStyledAttributes.getDrawable(p144i.j.f43374b);
        this.f20466f = typedArrayObtainStyledAttributes.getDrawable(p144i.j.f43384d);
        this.f20470j = typedArrayObtainStyledAttributes.getDimensionPixelSize(p144i.j.f43414j, -1);
        boolean z10 = true;
        if (getId() == p144i.f.f43174I) {
            this.f20468h = true;
            this.f20467g = typedArrayObtainStyledAttributes.getDrawable(p144i.j.f43379c);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f20468h ? this.f20465e != null || this.f20466f != null : this.f20467g != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f20465e;
        if (drawable != null && drawable.isStateful()) {
            this.f20465e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f20466f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f20466f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f20467g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f20467g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f20462b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f20465e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f20466f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f20467g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f20463c = findViewById(p144i.f.f43183a);
        this.f20464d = findViewById(p144i.f.f43189g);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f20461a || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[PHI: r1
      0x0049: PHI (r1v8 boolean) = (r1v1 boolean), (r1v1 boolean), (r1v0 boolean) binds: [B:31:0x00a6, B:33:0x00aa, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Drawable drawable;
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.f20462b;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i14 = layoutParams.bottomMargin;
            view.layout(i10, measuredHeight2 - i14, i12, measuredHeight - i14);
        }
        if (this.f20468h) {
            Drawable drawable2 = this.f20467g;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z11 = z12;
            }
        } else {
            if (this.f20465e != null) {
                if (this.f20463c.getVisibility() == 0) {
                    this.f20465e.setBounds(this.f20463c.getLeft(), this.f20463c.getTop(), this.f20463c.getRight(), this.f20463c.getBottom());
                } else {
                    View view2 = this.f20464d;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f20465e.setBounds(0, 0, 0, 0);
                    } else {
                        this.f20465e.setBounds(this.f20464d.getLeft(), this.f20464d.getTop(), this.f20464d.getRight(), this.f20464d.getBottom());
                    }
                }
                z12 = true;
            }
            this.f20469i = z13;
            if (!z13 || (drawable = this.f20466f) == null) {
                z11 = z12;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z11) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int iA;
        int i12;
        if (this.f20463c == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f20470j) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f20463c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        View view = this.f20462b;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (b(this.f20463c)) {
            iA = !b(this.f20464d) ? a(this.f20464d) : 0;
        } else {
            iA = a(this.f20463c);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(iA + a(this.f20462b), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i11) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f20465e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f20465e);
        }
        this.f20465e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f20463c;
            if (view != null) {
                this.f20465e.setBounds(view.getLeft(), this.f20463c.getTop(), this.f20463c.getRight(), this.f20463c.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f20468h ? !(this.f20465e != null || this.f20466f != null) : this.f20467g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f20467g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f20467g);
        }
        this.f20467g = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f20468h && (drawable2 = this.f20467g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f20468h ? !(this.f20465e != null || this.f20466f != null) : this.f20467g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f20466f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f20466f);
        }
        this.f20466f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f20469i && (drawable2 = this.f20466f) != null) {
                drawable2.setBounds(this.f20462b.getLeft(), this.f20462b.getTop(), this.f20462b.getRight(), this.f20462b.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f20468h ? !(this.f20465e != null || this.f20466f != null) : this.f20467g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setTabContainer(a0 a0Var) {
        View view = this.f20462b;
        if (view != null) {
            removeView(view);
        }
        this.f20462b = a0Var;
    }

    public void setTransitioning(boolean z10) {
        this.f20461a = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f20465e;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f20466f;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f20467g;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.f20465e && !this.f20468h) {
            return true;
        }
        if (drawable == this.f20466f && this.f20469i) {
            return true;
        }
        return (drawable == this.f20467g && this.f20468h) || super.verifyDrawable(drawable);
    }
}
