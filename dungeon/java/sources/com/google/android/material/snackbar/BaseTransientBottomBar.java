package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.Z;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.p;
import p297q9.g;
import p297q9.k;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseTransientBottomBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final TimeInterpolator f36921a = Z8.a.f18802b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final TimeInterpolator f36922b = Z8.a.f18801a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final TimeInterpolator f36923c = Z8.a.f18804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f36925e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f36926f = {Y8.a.f16973U};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f36927g = BaseTransientBottomBar.class.getSimpleName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Handler f36924d = new Handler(Looper.getMainLooper(), new a());

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final b f36928k = new b(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean F(View view) {
            return this.f36928k.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f36928k.b(coordinatorLayout, view, motionEvent);
            return super.k(coordinatorLayout, view, motionEvent);
        }
    }

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                android.support.v4.media.session.b.a(message.obj);
                throw null;
            }
            if (i10 != 1) {
                return false;
            }
            android.support.v4.media.session.b.a(message.obj);
            throw null;
        }
    }

    public static class b {
        public b(SwipeDismissBehavior swipeDismissBehavior) {
            swipeDismissBehavior.L(0.1f);
            swipeDismissBehavior.K(0.6f);
            swipeDismissBehavior.M(0);
        }

        public boolean a(View view) {
            return view instanceof c;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.C(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.a.b().e(null);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.a.b().f(null);
            }
        }
    }

    protected static class c extends FrameLayout {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final View.OnTouchListener f36929k = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        k f36930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f36931b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f36932c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f36933d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f36934e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f36935f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ColorStateList f36936g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private PorterDuff.Mode f36937h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Rect f36938i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f36939j;

        class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected c(Context context, AttributeSet attributeSet) {
            super(p351t9.a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, Y8.k.f17343N5);
            if (typedArrayObtainStyledAttributes.hasValue(Y8.k.f17406U5)) {
                Z.u0(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(Y8.k.f17406U5, 0));
            }
            this.f36931b = typedArrayObtainStyledAttributes.getInt(Y8.k.f17370Q5, 0);
            if (typedArrayObtainStyledAttributes.hasValue(Y8.k.f17424W5) || typedArrayObtainStyledAttributes.hasValue(Y8.k.f17433X5)) {
                this.f36930a = k.e(context2, attributeSet, 0, 0).m();
            }
            this.f36932c = typedArrayObtainStyledAttributes.getFloat(Y8.k.f17379R5, 1.0f);
            setBackgroundTintList(p243n9.c.a(context2, typedArrayObtainStyledAttributes, Y8.k.f17388S5));
            setBackgroundTintMode(p.h(typedArrayObtainStyledAttributes.getInt(Y8.k.f17397T5, -1), PorterDuff.Mode.SRC_IN));
            this.f36933d = typedArrayObtainStyledAttributes.getFloat(Y8.k.f17361P5, 1.0f);
            this.f36934e = typedArrayObtainStyledAttributes.getDimensionPixelSize(Y8.k.f17352O5, -1);
            this.f36935f = typedArrayObtainStyledAttributes.getDimensionPixelSize(Y8.k.f17415V5, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f36929k);
            setFocusable(true);
            if (getBackground() == null) {
                Z.q0(this, a());
            }
        }

        private Drawable a() {
            int iK = p118g9.a.k(this, Y8.a.f17002s, Y8.a.f16996m, getBackgroundOverlayColorAlpha());
            k kVar = this.f36930a;
            Drawable drawableD = kVar != null ? BaseTransientBottomBar.d(iK, kVar) : BaseTransientBottomBar.c(iK, getResources());
            if (this.f36936g == null) {
                return p038c1.a.r(drawableD);
            }
            Drawable drawableR = p038c1.a.r(drawableD);
            p038c1.a.o(drawableR, this.f36936g);
            return drawableR;
        }

        private void b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f36938i = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar) {
        }

        float getActionTextColorAlpha() {
            return this.f36933d;
        }

        int getAnimationMode() {
            return this.f36931b;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f36932c;
        }

        int getMaxInlineActionWidth() {
            return this.f36935f;
        }

        int getMaxWidth() {
            return this.f36934e;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            Z.j0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (this.f36934e > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = this.f36934e;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        void setAnimationMode(int i10) {
            this.f36931b = i10;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f36936g != null) {
                drawable = p038c1.a.r(drawable.mutate());
                p038c1.a.o(drawable, this.f36936g);
                p038c1.a.p(drawable, this.f36937h);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f36936g = colorStateList;
            if (getBackground() != null) {
                Drawable drawableR = p038c1.a.r(getBackground().mutate());
                p038c1.a.o(drawableR, colorStateList);
                p038c1.a.p(drawableR, this.f36937h);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f36937h = mode;
            if (getBackground() != null) {
                Drawable drawableR = p038c1.a.r(getBackground().mutate());
                p038c1.a.p(drawableR, mode);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f36939j || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            b((ViewGroup.MarginLayoutParams) layoutParams);
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f36929k);
            super.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GradientDrawable c(int i10, Resources resources) {
        float dimension = resources.getDimension(Y8.c.f17066l0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static g d(int i10, k kVar) {
        g gVar = new g(kVar);
        gVar.W(ColorStateList.valueOf(i10));
        return gVar;
    }
}
