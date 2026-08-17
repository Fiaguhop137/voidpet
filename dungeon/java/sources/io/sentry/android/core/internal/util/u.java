package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import io.sentry.android.core.C3636g0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class u implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f45068a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f45069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f45070c;

    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnDrawListener(u.this);
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    private u(View view, Runnable runnable) {
        this.f45069b = new AtomicReference(view);
        this.f45070c = runnable;
    }

    public static /* synthetic */ void a(u uVar, View view) {
        uVar.getClass();
        view.getViewTreeObserver().removeOnDrawListener(uVar);
    }

    public static /* synthetic */ void b(Window window, Window.Callback callback, Runnable runnable, C3636g0 c3636g0) {
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView != null) {
            window.setCallback(callback);
            e(viewPeekDecorView, runnable, c3636g0);
        }
    }

    private static boolean c(View view) {
        return view.getViewTreeObserver().isAlive() && view.isAttachedToWindow();
    }

    public static void d(Activity activity, Runnable runnable, C3636g0 c3636g0) {
        Window window = activity.getWindow();
        if (window != null) {
            View viewPeekDecorView = window.peekDecorView();
            if (viewPeekDecorView != null) {
                e(viewPeekDecorView, runnable, c3636g0);
            } else {
                Window.Callback callback = window.getCallback();
                window.setCallback(new io.sentry.android.core.performance.i(callback != null ? callback : new io.sentry.android.core.internal.gestures.b(), new s(window, callback, runnable, c3636g0)));
            }
        }
    }

    public static void e(View view, Runnable runnable, C3636g0 c3636g0) {
        u uVar = new u(view, runnable);
        if (c3636g0.d() >= 26 || c(view)) {
            view.getViewTreeObserver().addOnDrawListener(uVar);
        } else {
            view.addOnAttachStateChangeListener(uVar.new a());
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        View view = (View) this.f45069b.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new t(this, view));
        this.f45068a.postAtFrontOfQueue(this.f45070c);
    }
}
