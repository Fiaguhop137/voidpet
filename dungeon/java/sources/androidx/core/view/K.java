package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class K implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f23143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewTreeObserver f23144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f23145c;

    private K(View view, Runnable runnable) {
        this.f23143a = view;
        this.f23144b = view.getViewTreeObserver();
        this.f23145c = runnable;
    }

    public static K a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        K k10 = new K(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(k10);
        view.addOnAttachStateChangeListener(k10);
        return k10;
    }

    public void b() {
        if (this.f23144b.isAlive()) {
            this.f23144b.removeOnPreDrawListener(this);
        } else {
            this.f23143a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f23143a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f23145c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f23144b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
