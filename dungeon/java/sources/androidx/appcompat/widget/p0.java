package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.AbstractC1899c0;

/* JADX INFO: loaded from: classes.dex */
class p0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static p0 f21074k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static p0 f21075l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f21076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f21077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f21079d = new n0(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Runnable f21080e = new o0(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f21081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f21082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private q0 f21083h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f21084i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f21085j;

    private p0(View view, CharSequence charSequence) {
        this.f21076a = view;
        this.f21077b = charSequence;
        this.f21078c = AbstractC1899c0.g(ViewConfiguration.get(view.getContext()));
        c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void b() {
        this.f21076a.removeCallbacks(this.f21079d);
    }

    private void c() {
        this.f21085j = true;
    }

    private void e() {
        this.f21076a.postDelayed(this.f21079d, ViewConfiguration.getLongPressTimeout());
    }

    private static void f(p0 p0Var) {
        p0 p0Var2 = f21074k;
        if (p0Var2 != null) {
            p0Var2.b();
        }
        f21074k = p0Var;
        if (p0Var != null) {
            p0Var.e();
        }
    }

    public static void g(View view, CharSequence charSequence) {
        p0 p0Var = f21074k;
        if (p0Var != null && p0Var.f21076a == view) {
            f(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new p0(view, charSequence);
            return;
        }
        p0 p0Var2 = f21075l;
        if (p0Var2 != null && p0Var2.f21076a == view) {
            p0Var2.d();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean i(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (!this.f21085j && Math.abs(x10 - this.f21081f) <= this.f21078c && Math.abs(y10 - this.f21082g) <= this.f21078c) {
            return false;
        }
        this.f21081f = x10;
        this.f21082g = y10;
        this.f21085j = false;
        return true;
    }

    void d() {
        if (f21075l == this) {
            f21075l = null;
            q0 q0Var = this.f21083h;
            if (q0Var != null) {
                q0Var.c();
                this.f21083h = null;
                c();
                this.f21076a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f21074k == this) {
            f(null);
        }
        this.f21076a.removeCallbacks(this.f21080e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(boolean z10) {
        long longPressTimeout;
        long j10;
        long j11;
        if (this.f21076a.isAttachedToWindow()) {
            f(null);
            p0 p0Var = f21075l;
            if (p0Var != null) {
                p0Var.d();
            }
            f21075l = this;
            this.f21084i = z10;
            q0 q0Var = new q0(this.f21076a.getContext());
            this.f21083h = q0Var;
            q0Var.e(this.f21076a, this.f21081f, this.f21082g, this.f21084i, this.f21077b);
            this.f21076a.addOnAttachStateChangeListener(this);
            if (this.f21084i) {
                j11 = 2500;
            } else {
                if ((androidx.core.view.Z.K(this.f21076a) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 15000;
                }
                j11 = j10 - longPressTimeout;
            }
            this.f21076a.removeCallbacks(this.f21080e);
            this.f21076a.postDelayed(this.f21080e, j11);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f21083h != null && this.f21084i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f21076a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                d();
            }
        } else if (this.f21076a.isEnabled() && this.f21083h == null && i(motionEvent)) {
            f(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f21081f = view.getWidth() / 2;
        this.f21082g = view.getHeight() / 2;
        h(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        d();
    }
}
