package com.airbnb.android.react.lottie;

import R3.C1363j;
import R3.C1364k;
import R3.a0;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import androidx.core.view.Z;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.C2262k0;
import com.facebook.react.uimanager.C2270o0;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f27481a = new g();

    public static final class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f27482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1363j f27483b;

        a(boolean z10, C1363j c1363j) {
            this.f27482a = z10;
            this.f27483b = c1363j;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v10) {
            Intrinsics.checkNotNullParameter(v10, "v");
            C1363j c1363j = (C1363j) v10;
            if (this.f27482a) {
                this.f27483b.u();
            } else {
                this.f27483b.v();
            }
            c1363j.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v10) {
            Intrinsics.checkNotNullParameter(v10, "v");
            ((C1363j) v10).removeOnAttachStateChangeListener(this);
        }
    }

    private g() {
    }

    public static final void A(float f10, h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.m(Float.valueOf(f10));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    public static final void B(String str, h viewManager) {
        a0 a0Var;
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        if (str == null) {
            a0Var = null;
        } else {
            int iHashCode = str.hashCode();
            if (iHashCode != 165298699) {
                if (iHashCode != 899536360) {
                    if (iHashCode == 2101957031 && str.equals("SOFTWARE")) {
                        a0Var = a0.SOFTWARE;
                    } else {
                        a0Var = null;
                    }
                } else if (str.equals("HARDWARE")) {
                    a0Var = a0.HARDWARE;
                } else {
                    a0Var = null;
                }
            } else if (str.equals("AUTOMATIC")) {
                a0Var = a0.AUTOMATIC;
            } else {
                a0Var = null;
            }
        }
        viewManager.n(a0Var);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    public static final void C(String str, h viewManager) {
        ImageView.ScaleType scaleType;
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        if (str == null) {
            scaleType = null;
        } else {
            int iHashCode = str.hashCode();
            if (iHashCode != -1364013995) {
                if (iHashCode != 94852023) {
                    if (iHashCode == 951526612 && str.equals("contain")) {
                        scaleType = ImageView.ScaleType.FIT_CENTER;
                    } else {
                        scaleType = null;
                    }
                } else if (str.equals("cover")) {
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                } else {
                    scaleType = null;
                }
            } else if (str.equals("center")) {
                scaleType = ImageView.ScaleType.CENTER_INSIDE;
            } else {
                scaleType = null;
            }
        }
        viewManager.o(scaleType);
    }

    public static final void D(String str, h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.p(str);
        viewManager.a();
    }

    public static final void E(String str, h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.c(str);
        viewManager.a();
    }

    public static final void F(String str, h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        if (str != null && !StringsKt.U(str, ".", false, 2, null)) {
            str = str + ".json";
        }
        viewManager.d(str);
        viewManager.a();
    }

    public static final void G(String str, h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.e(str);
        viewManager.a();
    }

    public static final void H(double d10, h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.q(Float.valueOf((float) d10));
    }

    public static final void I(ReadableArray readableArray, h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.r(readableArray);
    }

    public static final C1363j e(C2262k0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C1363j c1363j = new C1363j(context);
        c1363j.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        return c1363j;
    }

    public static final Map f() {
        return p312r6.d.e("topAnimationFinish", p312r6.d.c("registrationName", "onAnimationFinish"), "topAnimationFailure", p312r6.d.c("registrationName", "onAnimationFailure"), "topAnimationLoaded", p312r6.d.c("registrationName", "onAnimationLoaded"));
    }

    public static final Map g() {
        return p312r6.d.a().b("VERSION", 1).a();
    }

    public static final void h(C1363j view) {
        Intrinsics.checkNotNullParameter(view, "view");
        new Handler(Looper.getMainLooper()).post(new f(view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(C1363j c1363j) {
        if (Z.Q(c1363j)) {
            c1363j.t();
        }
    }

    public static final void j(C1363j view, int i10, int i11) {
        Intrinsics.checkNotNullParameter(view, "view");
        new Handler(Looper.getMainLooper()).post(new e((i10 == -1 || i11 == -1) ? false : true, i10, i11, view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(boolean z10, int i10, int i11, C1363j c1363j) {
        if (!z10) {
            C1364k composition = c1363j.getComposition();
            Integer numValueOf = composition != null ? Integer.valueOf((int) composition.p()) : null;
            C1364k composition2 = c1363j.getComposition();
            Integer numValueOf2 = composition2 != null ? Integer.valueOf((int) composition2.f()) : null;
            int minFrame = (int) c1363j.getMinFrame();
            int maxFrame = (int) c1363j.getMaxFrame();
            if (numValueOf != null && numValueOf2 != null && (minFrame != numValueOf.intValue() || maxFrame != numValueOf2.intValue())) {
                c1363j.C(numValueOf.intValue(), numValueOf2.intValue());
            }
        } else if (i10 > i11) {
            c1363j.C(i11, i10);
            if (c1363j.getSpeed() > 0.0f) {
                c1363j.w();
            }
        } else {
            c1363j.C(i10, i11);
            if (c1363j.getSpeed() < 0.0f) {
                c1363j.w();
            }
        }
        if (!Z.Q(c1363j)) {
            c1363j.addOnAttachStateChangeListener(new a(z10, c1363j));
        } else if (z10) {
            c1363j.u();
        } else {
            c1363j.v();
        }
    }

    public static final void l(C1363j view) {
        Intrinsics.checkNotNullParameter(view, "view");
        new Handler(Looper.getMainLooper()).post(new c(view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(C1363j c1363j) {
        if (Z.Q(c1363j)) {
            c1363j.l();
            c1363j.setProgress(0.0f);
        }
    }

    public static final void n(C1363j view) {
        Intrinsics.checkNotNullParameter(view, "view");
        new Handler(Looper.getMainLooper()).post(new d(view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(C1363j c1363j) {
        if (Z.Q(c1363j)) {
            c1363j.v();
        }
    }

    public static final void p(C1363j view, Throwable error) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(error, "error");
        Context context = view.getContext();
        Intrinsics.d(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        C2262k0 c2262k0 = (C2262k0) context;
        EventDispatcher eventDispatcherC = C2270o0.c(c2262k0, view.getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.d(new j(c2262k0.c(), view.getId(), error));
        }
    }

    public static final void q(C1363j view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.d(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        C2262k0 c2262k0 = (C2262k0) context;
        EventDispatcher eventDispatcherC = C2270o0.c(c2262k0, view.getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.d(new l(c2262k0.c(), view.getId()));
        }
    }

    public static final void r(C1363j view, boolean z10) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.d(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        C2262k0 c2262k0 = (C2262k0) context;
        EventDispatcher eventDispatcherC = C2270o0.c(c2262k0, view.getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.d(new k(c2262k0.c(), view.getId(), z10));
        }
    }

    public static final void s(boolean z10, h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.f(Boolean.valueOf(z10));
    }

    public static final void t(C1363j view, boolean z10) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setCacheComposition(z10);
    }

    public static final void u(ReadableArray readableArray, h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.g(readableArray);
    }

    public static final void v(boolean z10, h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.h(Boolean.valueOf(z10));
    }

    public static final void w(boolean z10, h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.i(Boolean.valueOf(z10));
    }

    public static final void x(boolean z10, h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.k(z10 ? 2 : 1);
    }

    public static final void y(String str, h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.j(str);
    }

    public static final void z(boolean z10, h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.l(Boolean.valueOf(z10));
    }
}
