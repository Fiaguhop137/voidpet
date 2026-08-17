package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.Z;

/* JADX INFO: loaded from: classes2.dex */
abstract class d extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Runnable f36133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    OverScroller f36134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f36135f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f36136g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f36137h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f36138i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private VelocityTracker f36139j;

    private class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CoordinatorLayout f36140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f36141b;

        a(CoordinatorLayout coordinatorLayout, View view) {
            this.f36140a = coordinatorLayout;
            this.f36141b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f36141b == null || (overScroller = d.this.f36134e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                d.this.N(this.f36140a, this.f36141b);
                return;
            }
            d dVar = d.this;
            dVar.P(this.f36140a, this.f36141b, dVar.f36134e.getCurrY());
            Z.e0(this.f36141b, this);
        }
    }

    public d() {
        this.f36136g = -1;
        this.f36138i = -1;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36136g = -1;
        this.f36138i = -1;
    }

    private void I() {
        if (this.f36139j == null) {
            this.f36139j = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x008b A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z10;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker velocityTracker3 = this.f36139j;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.f36139j.computeCurrentVelocity(1000);
                J(coordinatorLayout, view, -L(view), 0, this.f36139j.getYVelocity(this.f36136g));
                z10 = true;
            }
            this.f36135f = false;
            this.f36136g = -1;
            velocityTracker = this.f36139j;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f36139j = null;
            }
            velocityTracker2 = this.f36139j;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (this.f36135f) {
            }
        }
        if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f36136g);
            if (iFindPointerIndex == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            int i10 = this.f36137h - y10;
            this.f36137h = y10;
            O(coordinatorLayout, view, i10, K(view), 0);
        } else if (actionMasked != 3) {
            if (actionMasked == 6) {
                int i11 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                this.f36136g = motionEvent.getPointerId(i11);
                this.f36137h = (int) (motionEvent.getY(i11) + 0.5f);
            }
        }
        z10 = false;
        velocityTracker2 = this.f36139j;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return !this.f36135f || z10;
        z10 = false;
        this.f36135f = false;
        this.f36136g = -1;
        velocityTracker = this.f36139j;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f36139j = null;
        }
        velocityTracker2 = this.f36139j;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f36135f) {
        }
    }

    abstract boolean H(View view);

    final boolean J(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, float f10) {
        Runnable runnable = this.f36133d;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.f36133d = null;
        }
        if (this.f36134e == null) {
            this.f36134e = new OverScroller(view.getContext());
        }
        this.f36134e.fling(0, E(), 0, Math.round(f10), 0, 0, i10, i11);
        if (!this.f36134e.computeScrollOffset()) {
            N(coordinatorLayout, view);
            return false;
        }
        a aVar = new a(coordinatorLayout, view);
        this.f36133d = aVar;
        Z.e0(view, aVar);
        return true;
    }

    abstract int K(View view);

    abstract int L(View view);

    abstract int M();

    abstract void N(CoordinatorLayout coordinatorLayout, View view);

    final int O(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        return Q(coordinatorLayout, view, M() - i10, i11, i12);
    }

    int P(CoordinatorLayout coordinatorLayout, View view, int i10) {
        return Q(coordinatorLayout, view, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    abstract int Q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f36138i < 0) {
            this.f36138i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f36135f) {
            int i10 = this.f36136g;
            if (i10 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y10 - this.f36137h) > this.f36138i) {
                this.f36137h = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f36136g = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            boolean z10 = H(view) && coordinatorLayout.C(view, x10, y11);
            this.f36135f = z10;
            if (z10) {
                this.f36137h = y11;
                this.f36136g = motionEvent.getPointerId(0);
                I();
                OverScroller overScroller = this.f36134e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f36134e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f36139j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }
}
