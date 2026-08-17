package com.facebook.react.devsupport;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.view.C0;
import com.facebook.react.AbstractC2236p;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class r0 implements p312r6.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f29733e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p456z6.e f29734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final U f29735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Dialog f29736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p0 f29737d;

    public static final class a {

        /* JADX INFO: renamed from: com.facebook.react.devsupport.r0$a$a, reason: collision with other inner class name */
        public static final class C0379a implements LifecycleEventListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f29738a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ReactContext f29739b;

            C0379a(Runnable runnable, ReactContext reactContext) {
                this.f29738a = runnable;
                this.f29739b = reactContext;
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostDestroy() {
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostPause() {
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostResume() {
                this.f29738a.run();
                this.f29739b.removeLifecycleEventListener(this);
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(ReactContext reactContext, Runnable runnable) {
            reactContext.addLifecycleEventListener(new C0379a(runnable, reactContext));
        }
    }

    public static final class b extends Dialog {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r0 f29740a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Activity activity, r0 r0Var, int i10) {
            super(activity, i10);
            this.f29740a = r0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C0 b(int i10, View view, C0 windowInsetsCompat) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(windowInsetsCompat, "windowInsetsCompat");
            p020b1.d dVarF = windowInsetsCompat.f(i10);
            Intrinsics.checkNotNullExpressionValue(dVarF, "getInsets(...)");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ((FrameLayout.LayoutParams) layoutParams).setMargins(dVarF.f25865a, dVarF.f25866b, dVarF.f25867c, dVarF.f25868d);
            return C0.f23104b;
        }

        @Override // android.app.Dialog
        protected void onCreate(Bundle bundle) {
            Window window = getWindow();
            if (window == null) {
                throw new IllegalStateException("Required value was null.");
            }
            window.setBackgroundDrawable(new ColorDrawable(-16777216));
            int i10 = C0.p.i() | C0.p.c();
            p0 p0Var = this.f29740a.f29737d;
            if (p0Var == null) {
                throw new IllegalStateException("Required value was null.");
            }
            androidx.core.view.Z.A0(p0Var, new s0(i10));
        }

        @Override // android.app.Dialog, android.view.KeyEvent.Callback
        public boolean onKeyUp(int i10, KeyEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            if (i10 == 82) {
                this.f29740a.f29734a.C();
                return true;
            }
            if (this.f29740a.f29735b.b(i10, getCurrentFocus())) {
                this.f29740a.f29734a.z();
            }
            return super.onKeyUp(i10, event);
        }
    }

    public r0(p456z6.e devSupportManager) {
        Intrinsics.checkNotNullParameter(devSupportManager, "devSupportManager");
        this.f29734a = devSupportManager;
        this.f29735b = new U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(r0 r0Var) {
        r0Var.c();
    }

    @Override // p312r6.h
    public boolean a() {
        Dialog dialog = this.f29736c;
        return dialog != null && dialog.isShowing();
    }

    @Override // p312r6.h
    public void b() {
        try {
            Dialog dialog = this.f29736c;
            if (dialog != null) {
                dialog.dismiss();
            }
        } catch (IllegalArgumentException e10) {
            W4.a.n("ReactNative", "RedBoxDialogSurfaceDelegate: error while dismissing dialog: ", e10);
        }
        f();
        this.f29736c = null;
    }

    @Override // p312r6.h
    public void c() {
        String strL = this.f29734a.l();
        Activity activityA = this.f29734a.a();
        if (activityA == null || activityA.isFinishing()) {
            ReactContext reactContextI = this.f29734a.i();
            if (reactContextI != null) {
                f29733e.b(reactContextI, new q0(this));
                return;
            }
            if (strL == null) {
                strL = "N/A";
            }
            W4.a.m("ReactNative", "Unable to launch redbox because react activity and react context is not available, here is the error that redbox would've displayed: " + strL);
            return;
        }
        p0 p0Var = this.f29737d;
        if ((p0Var != null ? p0Var.getContext() : null) != activityA) {
            e("RedBox");
        }
        p0 p0Var2 = this.f29737d;
        if (p0Var2 != null) {
            p0Var2.g();
        }
        if (this.f29736c == null) {
            b bVar = new b(activityA, this, AbstractC2236p.f30054c);
            bVar.requestWindowFeature(1);
            p0 p0Var3 = this.f29737d;
            if (p0Var3 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            bVar.setContentView(p0Var3);
            this.f29736c = bVar;
        }
        Dialog dialog = this.f29736c;
        if (dialog != null) {
            dialog.show();
        }
    }

    @Override // p312r6.h
    public boolean d() {
        return this.f29737d != null;
    }

    @Override // p312r6.h
    public void e(String appKey) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        this.f29734a.v();
        Activity activityA = this.f29734a.a();
        if (activityA != null && !activityA.isFinishing()) {
            p0 p0Var = new p0(activityA, this.f29734a, null);
            p0Var.d();
            this.f29737d = p0Var;
            return;
        }
        String strL = this.f29734a.l();
        if (strL == null) {
            strL = "N/A";
        }
        W4.a.m("ReactNative", "Unable to launch redbox because react activity is not available, here is the error that redbox would've displayed: " + strL);
    }

    @Override // p312r6.h
    public void f() {
        this.f29737d = null;
    }
}
