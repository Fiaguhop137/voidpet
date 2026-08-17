package Ia;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends AbstractC1098d {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final a f5220R = new a(null);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final com.swmansion.gesturehandler.react.o f5221S = new com.swmansion.gesturehandler.react.o();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Handler f5222O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private Runnable f5223P = new l(this);

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private z f5224Q = new z(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends AbstractC1098d.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f5225b = m.class;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f5226c = "HoverGestureHandler";

        @Override // Ia.AbstractC1098d.c
        public String d() {
            return this.f5226c;
        }

        @Override // Ia.AbstractC1098d.c
        public Class e() {
            return this.f5225b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Ia.AbstractC1098d.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public m a(Context context) {
            return new m();
        }

        @Override // Ia.AbstractC1098d.c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Ja.c c(m handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new Ja.c(handler);
        }
    }

    private final void V0() {
        int iS = S();
        if (iS == 0) {
            q();
        } else if (iS == 2) {
            D();
        } else {
            if (iS != 4) {
                return;
            }
            B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W0(m mVar) {
        mVar.V0();
    }

    private final boolean Y0(AbstractC1098d abstractC1098d) {
        View viewW = abstractC1098d.W();
        while (viewW != null) {
            if (Intrinsics.b(viewW, W())) {
                return true;
            }
            Object parent = viewW.getParent();
            viewW = parent instanceof View ? (View) parent : null;
        }
        return false;
    }

    private final Boolean Z0(View view, View view2, View view3) {
        if (Intrinsics.b(view3, view2)) {
            return Boolean.TRUE;
        }
        if (Intrinsics.b(view3, view)) {
            return Boolean.FALSE;
        }
        if (!(view3 instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view3;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            Boolean boolZ0 = Z0(view, view2, f5221S.c(viewGroup, i10));
            if (boolZ0 != null) {
                return boolZ0;
            }
        }
        return null;
    }

    static /* synthetic */ Boolean a1(m mVar, View view, View view2, View view3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            view3 = view.getRootView();
        }
        return mVar.Z0(view, view2, view3);
    }

    @Override // Ia.AbstractC1098d
    public boolean K0(AbstractC1098d handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (!(handler instanceof m) || ((m) handler).Y0(this)) {
            return super.K0(handler);
        }
        View viewW = handler.W();
        Intrinsics.c(viewW);
        View viewW2 = W();
        Intrinsics.c(viewW2);
        Boolean boolA1 = a1(this, viewW, viewW2, null, 4, null);
        Intrinsics.c(boolA1);
        return boolA1.booleanValue();
    }

    @Override // Ia.AbstractC1098d
    public boolean L0(AbstractC1098d handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (((handler instanceof m) && (Y0(handler) || ((m) handler).Y0(this))) || (handler instanceof com.swmansion.gesturehandler.react.k.b)) {
            return true;
        }
        return super.L0(handler);
    }

    @Override // Ia.AbstractC1098d
    public boolean M0(AbstractC1098d handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if ((handler instanceof m) && !Y0(handler) && !((m) handler).Y0(this)) {
            View viewW = W();
            Intrinsics.c(viewW);
            View viewW2 = handler.W();
            Intrinsics.c(viewW2);
            Boolean boolA1 = a1(this, viewW, viewW2, null, 4, null);
            if (boolA1 != null) {
                return boolA1.booleanValue();
            }
        }
        return super.M0(handler);
    }

    public final z X0() {
        return this.f5224Q;
    }

    @Override // Ia.AbstractC1098d
    protected void l0(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (event.getAction() == 0) {
            Handler handler = this.f5222O;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f5222O = null;
            return;
        }
        if (event.getAction() != 1 || f0()) {
            return;
        }
        V0();
    }

    @Override // Ia.AbstractC1098d
    protected void m0(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (event.getAction() == 10) {
            if (this.f5222O == null) {
                this.f5222O = new Handler(Looper.getMainLooper());
            }
            Handler handler = this.f5222O;
            Intrinsics.c(handler);
            handler.postDelayed(this.f5223P, 4L);
            return;
        }
        if (!f0()) {
            V0();
            return;
        }
        if (S() == 4 && event.getToolType(0) == 2) {
            this.f5224Q = z.f5355f.a(event);
            return;
        }
        if (S() == 0) {
            if (event.getAction() == 7 || event.getAction() == 9) {
                p();
                k();
            }
        }
    }

    @Override // Ia.AbstractC1098d
    protected void o0() {
        super.o0();
        this.f5224Q = new z(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);
    }
}
