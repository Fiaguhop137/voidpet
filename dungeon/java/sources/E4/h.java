package E4;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p436y4.t;

/* JADX INFO: loaded from: classes.dex */
final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Set f2644a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile boolean f2645b;

    class a implements ViewTreeObserver.OnDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f2646a;

        /* JADX INFO: renamed from: E4.h$a$a, reason: collision with other inner class name */
        class RunnableC0054a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnDrawListener f2648a;

            RunnableC0054a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.f2648a = onDrawListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                t.b().h();
                h.this.f2645b = true;
                h.b(a.this.f2646a, this.f2648a);
                h.this.f2644a.clear();
            }
        }

        a(View view) {
            this.f2646a = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            L4.l.v(new RunnableC0054a(this));
        }
    }

    h() {
    }

    static void b(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
    }

    @Override // E4.i
    public void a(Activity activity) {
        if (!this.f2645b && this.f2644a.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new a(decorView));
        }
    }
}
