package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public abstract class S implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f20634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final View f20637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f20638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Runnable f20639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f20640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f20641h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int[] f20642i = new int[2];

    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = S.this.f20637d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            S.this.e();
        }
    }

    public S(View view) {
        this.f20637d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f20634a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f20635b = tapTimeout;
        this.f20636c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f20639f;
        if (runnable != null) {
            this.f20637d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f20638e;
        if (runnable2 != null) {
            this.f20637d.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        P p10;
        View view = this.f20637d;
        p233n.e eVarB = b();
        if (eVarB != null && eVarB.a() && (p10 = (P) eVarB.o()) != null && p10.isShown()) {
            MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            i(view, motionEventObtainNoHistory);
            j(p10, motionEventObtainNoHistory);
            boolean zE = p10.e(motionEventObtainNoHistory, this.f20641h);
            motionEventObtainNoHistory.recycle();
            int actionMasked = motionEvent.getActionMasked();
            boolean z10 = (actionMasked == 1 || actionMasked == 3) ? false : true;
            if (zE && z10) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    private boolean g(MotionEvent motionEvent) {
        View view = this.f20637d;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f20641h = motionEvent.getPointerId(0);
            if (this.f20638e == null) {
                this.f20638e = new a();
            }
            view.postDelayed(this.f20638e, this.f20635b);
            if (this.f20639f == null) {
                this.f20639f = new b();
            }
            view.postDelayed(this.f20639f, this.f20636c);
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f20641h);
            if (iFindPointerIndex >= 0 && !h(view, motionEvent.getX(iFindPointerIndex), motionEvent.getY(iFindPointerIndex), this.f20634a)) {
                a();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
        } else if (actionMasked == 3) {
            a();
        }
        return false;
    }

    private static boolean h(View view, float f10, float f11, float f12) {
        float f13 = -f12;
        return f10 >= f13 && f11 >= f13 && f10 < ((float) (view.getRight() - view.getLeft())) + f12 && f11 < ((float) (view.getBottom() - view.getTop())) + f12;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f20642i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f20642i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    public abstract p233n.e b();

    protected abstract boolean c();

    protected boolean d() {
        p233n.e eVarB = b();
        if (eVarB == null || !eVarB.a()) {
            return true;
        }
        eVarB.dismiss();
        return true;
    }

    void e() {
        a();
        View view = this.f20637d;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f20640g = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = this.f20640g;
        if (z11) {
            z10 = f(motionEvent) || !d();
        } else {
            z10 = g(motionEvent) && c();
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f20637d.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f20640g = z10;
        return z10 || z11;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f20640g = false;
        this.f20641h = -1;
        Runnable runnable = this.f20638e;
        if (runnable != null) {
            this.f20637d.removeCallbacks(runnable);
        }
    }
}
