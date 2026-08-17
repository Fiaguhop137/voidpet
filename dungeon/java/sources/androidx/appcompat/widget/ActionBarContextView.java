package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.C1913j0;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends AbstractC1813a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CharSequence f20471i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f20472j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View f20473k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f20474l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f20475m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private LinearLayout f20476n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private TextView f20477o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private TextView f20478p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f20479q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f20480r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f20481s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f20482t;

    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.view.b f20483a;

        a(androidx.appcompat.view.b bVar) {
            this.f20483a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f20483a.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p144i.a.f43079g);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        h0 h0VarV = h0.v(context, attributeSet, p144i.j.f43489y, i10, 0);
        setBackground(h0VarV.g(p144i.j.f43494z));
        this.f20479q = h0VarV.n(p144i.j.f43262D, 0);
        this.f20480r = h0VarV.n(p144i.j.f43257C, 0);
        this.f20865e = h0VarV.m(p144i.j.f43252B, 0);
        this.f20482t = h0VarV.n(p144i.j.f43247A, p144i.g.f43212d);
        h0VarV.x();
    }

    private void i() {
        if (this.f20476n == null) {
            LayoutInflater.from(getContext()).inflate(p144i.g.f43209a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f20476n = linearLayout;
            this.f20477o = (TextView) linearLayout.findViewById(p144i.f.f43188f);
            this.f20478p = (TextView) this.f20476n.findViewById(p144i.f.f43187e);
            if (this.f20479q != 0) {
                this.f20477o.setTextAppearance(getContext(), this.f20479q);
            }
            if (this.f20480r != 0) {
                this.f20478p.setTextAppearance(getContext(), this.f20480r);
            }
        }
        this.f20477o.setText(this.f20471i);
        this.f20478p.setText(this.f20472j);
        boolean zIsEmpty = TextUtils.isEmpty(this.f20471i);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f20472j);
        this.f20478p.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f20476n.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f20476n.getParent() == null) {
            addView(this.f20476n);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC1813a
    public /* bridge */ /* synthetic */ C1913j0 f(int i10, long j10) {
        return super.f(i10, j10);
    }

    public void g() {
        if (this.f20473k == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbstractC1813a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC1813a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f20472j;
    }

    public CharSequence getTitle() {
        return this.f20471i;
    }

    public void h(androidx.appcompat.view.b bVar) {
        View view = this.f20473k;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f20482t, (ViewGroup) this, false);
            this.f20473k = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f20473k);
        }
        View viewFindViewById = this.f20473k.findViewById(p144i.f.f43192j);
        this.f20474l = viewFindViewById;
        viewFindViewById.setOnClickListener(new a(bVar));
        androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) bVar.e();
        C1815c c1815c = this.f20864d;
        if (c1815c != null) {
            c1815c.A();
        }
        C1815c c1815c2 = new C1815c(getContext());
        this.f20864d = c1815c2;
        c1815c2.L(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.c(this.f20864d, this.f20862b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f20864d.q(this);
        this.f20863c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f20863c, layoutParams);
    }

    public boolean j() {
        return this.f20481s;
    }

    public void k() {
        removeAllViews();
        this.f20475m = null;
        this.f20863c = null;
        this.f20864d = null;
        View view = this.f20474l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        C1815c c1815c = this.f20864d;
        if (c1815c != null) {
            return c1815c.M();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1815c c1815c = this.f20864d;
        if (c1815c != null) {
            c1815c.D();
            this.f20864d.E();
        }
    }

    @Override // androidx.appcompat.widget.AbstractC1813a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean zB = s0.b(this);
        int paddingRight = zB ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f20473k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f20473k.getLayoutParams();
            int i14 = zB ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = zB ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iD = AbstractC1813a.d(paddingRight, i14, zB);
            paddingRight = AbstractC1813a.d(iD + e(this.f20473k, iD, paddingTop, paddingTop2, zB), i15, zB);
        }
        int iE = paddingRight;
        LinearLayout linearLayout = this.f20476n;
        if (linearLayout != null && this.f20475m == null && linearLayout.getVisibility() != 8) {
            iE += e(this.f20476n, iE, paddingTop, paddingTop2, zB);
        }
        View view2 = this.f20475m;
        if (view2 != null) {
            e(view2, iE, paddingTop, paddingTop2, zB);
        }
        int paddingLeft = zB ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f20863c;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zB);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = this.f20865e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i11);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f20473k;
        if (view != null) {
            int iC = c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f20473k.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f20863c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f20863c, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f20476n;
        if (linearLayout != null && this.f20475m == null) {
            if (this.f20481s) {
                this.f20476n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f20476n.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.f20476n.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f20475m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = i12 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i12 >= 0) {
                paddingLeft = Math.min(i12, paddingLeft);
            }
            int i14 = layoutParams.height;
            int i15 = i14 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i14 >= 0) {
                iMin = Math.min(i14, iMin);
            }
            this.f20475m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i13), View.MeasureSpec.makeMeasureSpec(iMin, i15));
        }
        if (this.f20865e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            int measuredHeight = getChildAt(i17).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i16) {
                i16 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i16);
    }

    @Override // androidx.appcompat.widget.AbstractC1813a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbstractC1813a
    public void setContentHeight(int i10) {
        this.f20865e = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f20475m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f20475m = view;
        if (view != null && (linearLayout = this.f20476n) != null) {
            removeView(linearLayout);
            this.f20476n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f20472j = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f20471i = charSequence;
        i();
        androidx.core.view.Z.p0(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f20481s) {
            requestLayout();
        }
        this.f20481s = z10;
    }

    @Override // androidx.appcompat.widget.AbstractC1813a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
