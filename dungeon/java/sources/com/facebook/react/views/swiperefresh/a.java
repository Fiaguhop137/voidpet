package com.facebook.react.views.swiperefresh;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.H;
import com.facebook.react.uimanager.events.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends androidx.swiperefreshlayout.widget.c {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final C0392a f30956b0 = new C0392a(null);

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f30957R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f30958S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private float f30959T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final int f30960U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private float f30961V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private boolean f30962W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f30963a0;

    /* JADX INFO: renamed from: com.facebook.react.views.swiperefresh.a$a, reason: collision with other inner class name */
    private static final class C0392a {
        private C0392a() {
        }

        public /* synthetic */ C0392a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f30960U = ViewConfiguration.get(reactContext).getScaledTouchSlop();
    }

    private final boolean B(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f30961V = motionEvent.getX();
            this.f30962W = false;
        } else if (action == 2) {
            float fAbs = Math.abs(motionEvent.getX() - this.f30961V);
            if (this.f30962W || fAbs > this.f30960U) {
                this.f30962W = true;
                return false;
            }
        }
        return true;
    }

    @Override // androidx.swiperefreshlayout.widget.c
    public boolean c() {
        View childAt = getChildAt(0);
        return childAt != null ? childAt.canScrollVertically(-1) : super.c();
    }

    @Override // androidx.swiperefreshlayout.widget.c, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (!B(ev) || !super.onInterceptTouchEvent(ev)) {
            return false;
        }
        p.b(this, ev);
        this.f30963a0 = true;
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    @Override // androidx.swiperefreshlayout.widget.c, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f30957R) {
            return;
        }
        this.f30957R = true;
        setProgressViewOffset(this.f30959T);
        setRefreshing(this.f30958S);
    }

    @Override // androidx.swiperefreshlayout.widget.c, android.view.View
    public boolean onTouchEvent(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (ev.getActionMasked() == 1 && this.f30963a0) {
            p.a(this, ev);
            this.f30963a0 = false;
        }
        return super.onTouchEvent(ev);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public final void setProgressViewOffset(float f10) {
        this.f30959T = f10;
        if (this.f30957R) {
            int progressCircleDiameter = getProgressCircleDiameter();
            s(false, Math.round(H.i(f10)) - progressCircleDiameter, Math.round(H.i(f10 + 64.0f)) - progressCircleDiameter);
        }
    }

    @Override // androidx.swiperefreshlayout.widget.c
    public void setRefreshing(boolean z10) {
        this.f30958S = z10;
        if (this.f30957R) {
            super.setRefreshing(z10);
        }
    }
}
