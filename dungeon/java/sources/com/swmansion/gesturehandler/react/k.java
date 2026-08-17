package com.swmansion.gesturehandler.react;

import Ia.AbstractC1098d;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.C2262k0;
import com.facebook.react.uimanager.InterfaceC2252f0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f38889g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactContext f38890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Ia.i f38891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC1098d f38892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ViewGroup f38893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f38894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f38895f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ViewGroup b(ViewGroup viewGroup) {
            UiThreadUtil.assertOnUiThread();
            ViewParent parent = viewGroup;
            while (parent != null && !(parent instanceof InterfaceC2252f0)) {
                parent = parent.getParent();
            }
            if (parent != null) {
                return (ViewGroup) parent;
            }
            throw new IllegalStateException(("View " + viewGroup + " has not been mounted under ReactRootView").toString());
        }
    }

    public final class b extends AbstractC1098d {
        public b(int i10) {
            I0(i10);
        }

        private final void U0(MotionEvent motionEvent) {
            Ia.i iVarP;
            if (S() == 0 && (!k.this.f38894e || (iVarP = P()) == null || !iVarP.v())) {
                p();
                k.this.f38894e = false;
            }
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 10) {
                B();
            }
        }

        @Override // Ia.AbstractC1098d
        protected void j0() {
            k.this.f38894e = true;
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setAction(3);
            if (k.this.f() instanceof InterfaceC2252f0) {
                InterfaceC2252f0 interfaceC2252f0 = (InterfaceC2252f0) k.this.f();
                ViewGroup viewGroupF = k.this.f();
                Intrinsics.c(motionEventObtain);
                interfaceC2252f0.a(viewGroupF, motionEventObtain);
            }
            motionEventObtain.recycle();
        }

        @Override // Ia.AbstractC1098d
        protected void l0(MotionEvent event, MotionEvent sourceEvent) {
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
            U0(event);
        }

        @Override // Ia.AbstractC1098d
        protected void m0(MotionEvent event, MotionEvent sourceEvent) {
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
            U0(event);
        }
    }

    public k(ReactContext context, ViewGroup wrappedView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(wrappedView, "wrappedView");
        this.f38890a = context;
        UiThreadUtil.assertOnUiThread();
        int id2 = wrappedView.getId();
        NativeModule nativeModule = context.getNativeModule((Class<NativeModule>) RNGestureHandlerModule.class);
        Intrinsics.c(nativeModule);
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) nativeModule;
        i registry = rNGestureHandlerModule.getRegistry();
        ViewGroup viewGroupB = f38889g.b(wrappedView);
        this.f38893d = viewGroupB;
        Log.i("ReactNative", "[GESTURE HANDLER] Initialize gesture handler for root view " + viewGroupB);
        Ia.i iVar = new Ia.i(wrappedView, registry, new o(), viewGroupB);
        iVar.F(0.1f);
        this.f38891b = iVar;
        b bVar = new b(-id2);
        this.f38892c = bVar;
        registry.j(bVar);
        registry.c(bVar.T(), id2, 3);
        rNGestureHandlerModule.registerRootHelper(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(k kVar) {
        kVar.k();
    }

    private final void k() {
        AbstractC1098d abstractC1098d = this.f38892c;
        if (abstractC1098d == null || abstractC1098d.S() != 2) {
            return;
        }
        abstractC1098d.k();
        abstractC1098d.B();
    }

    public final void d(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Ia.i iVar = this.f38891b;
        if (iVar != null) {
            iVar.f(view);
        }
    }

    public final boolean e(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f38895f = true;
        Ia.i iVar = this.f38891b;
        Intrinsics.c(iVar);
        iVar.B(event);
        this.f38895f = false;
        return this.f38894e;
    }

    public final ViewGroup f() {
        return this.f38893d;
    }

    public final void g(int i10, boolean z10) {
        if (z10) {
            UiThreadUtil.runOnUiThread(new j(this));
        }
    }

    public final void i() {
        if (this.f38891b == null || this.f38895f) {
            return;
        }
        k();
    }

    public final void j() {
        Log.i("ReactNative", "[GESTURE HANDLER] Tearing down gesture handler registered for root view " + this.f38893d);
        ReactContext reactContext = this.f38890a;
        Intrinsics.d(reactContext, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        NativeModule nativeModule = ((C2262k0) reactContext).b().getNativeModule((Class<NativeModule>) RNGestureHandlerModule.class);
        Intrinsics.c(nativeModule);
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) nativeModule;
        i registry = rNGestureHandlerModule.getRegistry();
        AbstractC1098d abstractC1098d = this.f38892c;
        Intrinsics.c(abstractC1098d);
        registry.g(abstractC1098d.T());
        rNGestureHandlerModule.unregisterRootHelper(this);
    }
}
