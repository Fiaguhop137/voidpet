package X6;

import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C0208a f15302c = new C0208a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile int f15303a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewParent f15304b;

    /* JADX INFO: renamed from: X6.a$a, reason: collision with other inner class name */
    private static final class C0208a {
        private C0208a() {
        }

        public /* synthetic */ C0208a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void c() {
        ViewParent viewParent = this.f15304b;
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(false);
        }
        this.f15304b = null;
    }

    @Override // X6.b
    public boolean a(ViewGroup view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(event, "event");
        int i10 = this.f15303a;
        return (i10 == -1 || event.getAction() == 1 || view.getId() != i10) ? false : true;
    }

    public final void b() {
        this.f15303a = -1;
        c();
    }

    public final void d(int i10, ViewParent viewParent) {
        this.f15303a = i10;
        c();
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(true);
            this.f15304b = viewParent;
        }
    }
}
