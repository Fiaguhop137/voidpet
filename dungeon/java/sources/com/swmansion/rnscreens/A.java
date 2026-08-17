package com.swmansion.rnscreens;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.C2270o0;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\b\u0018\b\u0016\u0018\u0000 X2\u00020\u00012\u00020\u0002:\u0003UYZB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\u0004J-\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b&\u0010\"J\u000f\u0010'\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010\u0004J\u001f\u0010+\u001a\u00020\b2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u0014H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\b2\u0006\u0010\r\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\b2\u0006\u0010\r\u001a\u00020-H\u0016¢\u0006\u0004\b0\u0010/J\u000f\u00101\u001a\u00020\bH\u0016¢\u0006\u0004\b1\u0010\u0004J\u000f\u00102\u001a\u00020\bH\u0016¢\u0006\u0004\b2\u0010\u0004J\u000f\u00103\u001a\u00020\bH\u0016¢\u0006\u0004\b3\u0010\u0004J\u000f\u00104\u001a\u00020\bH\u0002¢\u0006\u0004\b4\u0010\u0004J\u000f\u00105\u001a\u00020\bH\u0002¢\u0006\u0004\b5\u0010\u0004J\u000f\u00106\u001a\u00020\bH\u0002¢\u0006\u0004\b6\u0010\u0004J\u000f\u00107\u001a\u00020\bH\u0002¢\u0006\u0004\b7\u0010\u0004J\u000f\u00108\u001a\u00020\bH\u0002¢\u0006\u0004\b8\u0010\u0004J\u0017\u0010:\u001a\u00020\b2\u0006\u00109\u001a\u00020\u0014H\u0002¢\u0006\u0004\b:\u0010;R(\u0010B\u001a\u00020\u00058\u0016@\u0016X\u0096.¢\u0006\u0018\n\u0004\b<\u0010=\u0012\u0004\bA\u0010\u0004\u001a\u0004\b>\u0010?\"\u0004\b@\u0010\u0007R \u0010H\u001a\b\u0012\u0004\u0012\u00020-0C8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0016\u0010K\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010N\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010P\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010JR\u0016\u0010R\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010JR\u0016\u0010T\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010JR\u0014\u0010W\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010V¨\u0006["}, d2 = {"Lcom/swmansion/rnscreens/A;", "Landroidx/fragment/app/i;", "Lcom/swmansion/rnscreens/B;", "<init>", "()V", "Lcom/swmansion/rnscreens/t;", "screenView", "(Lcom/swmansion/rnscreens/t;)V", "", "Y0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "H0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "o", "", "k", "()Z", "Landroid/app/Activity;", "l", "()Landroid/app/Activity;", "Lcom/facebook/react/bridge/ReactContext;", "t", "()Lcom/facebook/react/bridge/ReactContext;", "Lcom/swmansion/rnscreens/A$b;", "event", "W1", "(Lcom/swmansion/rnscreens/A$b;)Z", "e", "(Lcom/swmansion/rnscreens/A$b;)V", "fragmentWrapper", "Y1", "(Lcom/swmansion/rnscreens/A$b;Lcom/swmansion/rnscreens/B;)V", "d", "X1", "", "alpha", "closing", "d2", "(FZ)V", "Lcom/swmansion/rnscreens/v;", "n", "(Lcom/swmansion/rnscreens/v;)V", "q", "h2", "g2", "I0", "j2", "b2", "Z1", "c2", "a2", "animationEnd", "e2", "(Z)V", "d0", "Lcom/swmansion/rnscreens/t;", "j", "()Lcom/swmansion/rnscreens/t;", "i2", "getScreen$annotations", "screen", "", "e0", "Ljava/util/List;", "m", "()Ljava/util/List;", "childScreenContainers", "f0", "Z", "shouldUpdateOnResume", "g0", "F", "transitionProgress", "h0", "canDispatchWillAppear", "i0", "canDispatchAppear", "j0", "isTransitioning", "b", "()Landroidx/fragment/app/i;", "fragment", "k0", "c", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class A extends androidx.fragment.app.i implements B {

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d0, reason: collision with root package name and from kotlin metadata */
    public C3208t screen;

    /* JADX INFO: renamed from: e0, reason: collision with root package name and from kotlin metadata */
    private final List childScreenContainers;

    /* JADX INFO: renamed from: f0, reason: collision with root package name and from kotlin metadata */
    private boolean shouldUpdateOnResume;

    /* JADX INFO: renamed from: g0, reason: collision with root package name and from kotlin metadata */
    private float transitionProgress;

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    private boolean canDispatchWillAppear;

    /* JADX INFO: renamed from: i0, reason: collision with root package name and from kotlin metadata */
    private boolean canDispatchAppear;

    /* JADX INFO: renamed from: j0, reason: collision with root package name and from kotlin metadata */
    private boolean isTransitioning;

    /* JADX INFO: renamed from: com.swmansion.rnscreens.A$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final short a(float f10) {
            int i10;
            if (f10 == 0.0f) {
                i10 = 1;
            } else {
                i10 = f10 == 1.0f ? 2 : 3;
            }
            return (short) i10;
        }
    }

    public enum b {
        DID_APPEAR,
        WILL_APPEAR,
        DID_DISAPPEAR,
        WILL_DISAPPEAR;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f38959f = Gd.a.a(e());
    }

    private static final class c extends FrameLayout {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        @Override // android.view.ViewGroup, android.view.View
        public void clearFocus() {
            if (getVisibility() != 4) {
                super.clearFocus();
            }
        }
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38960a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.WILL_APPEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.DID_APPEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.WILL_DISAPPEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.DID_DISAPPEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f38960a = iArr;
        }
    }

    public A() {
        this.childScreenContainers = new ArrayList();
        this.transitionProgress = -1.0f;
        this.canDispatchWillAppear = true;
        this.canDispatchAppear = true;
        throw new IllegalStateException("Screen fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }

    public A(C3208t screenView) {
        Intrinsics.checkNotNullParameter(screenView, "screenView");
        this.childScreenContainers = new ArrayList();
        this.transitionProgress = -1.0f;
        this.canDispatchWillAppear = true;
        this.canDispatchAppear = true;
        i2(screenView);
    }

    private final void Z1() {
        Y1(b.DID_APPEAR, this);
        d2(1.0f, false);
    }

    private final void a2() {
        Y1(b.DID_DISAPPEAR, this);
        d2(1.0f, true);
    }

    private final void b2() {
        Y1(b.WILL_APPEAR, this);
        d2(0.0f, false);
    }

    private final void c2() {
        Y1(b.WILL_DISAPPEAR, this);
        d2(0.0f, true);
    }

    private final void e2(boolean animationEnd) {
        this.isTransitioning = !animationEnd;
        androidx.fragment.app.i iVarT = T();
        if (iVarT == null || ((iVarT instanceof A) && !((A) iVarT).isTransitioning)) {
            if (u0()) {
                UiThreadUtil.runOnUiThread(new RunnableC3214z(animationEnd, this));
            } else if (animationEnd) {
                a2();
            } else {
                c2();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f2(boolean z10, A a10) {
        if (z10) {
            a10.Z1();
        } else {
            a10.b2();
        }
    }

    private final void j2() {
        androidx.fragment.app.j jVarA = A();
        if (jVarA == null) {
            this.shouldUpdateOnResume = true;
        } else {
            e0.f39065a.x(j(), jVarA, t());
        }
    }

    @Override // androidx.fragment.app.i
    public View H0(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        j().setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context contextG = G();
        if (contextG == null) {
            return null;
        }
        c cVar = new c(contextG);
        cVar.addView(Ma.c.b(j()));
        return cVar;
    }

    @Override // androidx.fragment.app.i
    public void I0() {
        super.I0();
        C3210v container = j().getContainer();
        if (container == null || !container.n(j().getFragmentWrapper())) {
            Context context = j().getContext();
            if (context instanceof ReactContext) {
                int iE = C2270o0.e(context);
                EventDispatcher eventDispatcherC = C2270o0.c((ReactContext) context, j().getId());
                if (eventDispatcherC != null) {
                    eventDispatcherC.d(new La.h(iE, j().getId()));
                }
            }
        }
        getChildScreenContainers().clear();
    }

    public boolean W1(b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i10 = d.f38960a[event.ordinal()];
        if (i10 == 1) {
            return this.canDispatchWillAppear;
        }
        if (i10 == 2) {
            return this.canDispatchAppear;
        }
        if (i10 == 3) {
            return !this.canDispatchWillAppear;
        }
        if (i10 == 4) {
            return !this.canDispatchAppear;
        }
        throw new Ad.n();
    }

    public void X1() {
        Context context = j().getContext();
        Intrinsics.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int iE = C2270o0.e(reactContext);
        EventDispatcher eventDispatcherC = C2270o0.c(reactContext, j().getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.d(new La.b(iE, j().getId()));
        }
    }

    @Override // androidx.fragment.app.i
    public void Y0() {
        super.Y0();
        if (this.shouldUpdateOnResume) {
            this.shouldUpdateOnResume = false;
            e0.f39065a.x(j(), l(), t());
        }
    }

    public void Y1(b event, B fragmentWrapper) {
        com.facebook.react.uimanager.events.d kVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(fragmentWrapper, "fragmentWrapper");
        androidx.fragment.app.i iVarB = fragmentWrapper.b();
        if (iVarB instanceof U) {
            U u10 = (U) iVarB;
            if (u10.W1(event)) {
                C3208t c3208tJ = u10.j();
                fragmentWrapper.e(event);
                int iF = C2270o0.f(c3208tJ);
                int i10 = d.f38960a[event.ordinal()];
                if (i10 == 1) {
                    kVar = new La.k(iF, c3208tJ.getId());
                } else if (i10 == 2) {
                    kVar = new La.f(iF, c3208tJ.getId());
                } else if (i10 == 3) {
                    kVar = new La.l(iF, c3208tJ.getId());
                } else {
                    if (i10 != 4) {
                        throw new Ad.n();
                    }
                    kVar = new La.g(iF, c3208tJ.getId());
                }
                Context context = j().getContext();
                Intrinsics.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                EventDispatcher eventDispatcherC = C2270o0.c((ReactContext) context, j().getId());
                if (eventDispatcherC != null) {
                    eventDispatcherC.d(kVar);
                }
                fragmentWrapper.d(event);
            }
        }
    }

    @Override // com.swmansion.rnscreens.InterfaceC3198i
    public androidx.fragment.app.i b() {
        return this;
    }

    @Override // com.swmansion.rnscreens.InterfaceC3212x
    public void d(b event) {
        B fragmentWrapper;
        Intrinsics.checkNotNullParameter(event, "event");
        List childScreenContainers = getChildScreenContainers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : childScreenContainers) {
            if (((C3210v) obj).getScreenCount() > 0) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3208t topScreen = ((C3210v) it.next()).getTopScreen();
            if (topScreen != null && (fragmentWrapper = topScreen.getFragmentWrapper()) != null) {
                Y1(event, fragmentWrapper);
            }
        }
    }

    public void d2(float alpha, boolean closing) {
        if (!(this instanceof U) || this.transitionProgress == alpha) {
            return;
        }
        float fMax = Math.max(0.0f, Math.min(1.0f, alpha));
        this.transitionProgress = fMax;
        short sA = INSTANCE.a(fMax);
        U u10 = (U) this;
        C3210v container = u10.j().getContainer();
        boolean goingForward = container instanceof M ? ((M) container).getGoingForward() : false;
        Context context = u10.j().getContext();
        Intrinsics.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        EventDispatcher eventDispatcherC = C2270o0.c(reactContext, u10.j().getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.d(new La.j(C2270o0.e(reactContext), u10.j().getId(), this.transitionProgress, closing, goingForward, sA));
        }
    }

    @Override // com.swmansion.rnscreens.InterfaceC3212x
    public void e(b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i10 = d.f38960a[event.ordinal()];
        if (i10 == 1) {
            this.canDispatchWillAppear = false;
            return;
        }
        if (i10 == 2) {
            this.canDispatchAppear = false;
        } else if (i10 == 3) {
            this.canDispatchWillAppear = true;
        } else {
            if (i10 != 4) {
                throw new Ad.n();
            }
            this.canDispatchAppear = true;
        }
    }

    public void g2() {
        e2(true);
    }

    public void h2() {
        e2(false);
    }

    public void i2(C3208t c3208t) {
        Intrinsics.checkNotNullParameter(c3208t, "<set-?>");
        this.screen = c3208t;
    }

    @Override // com.swmansion.rnscreens.B
    public C3208t j() {
        C3208t c3208t = this.screen;
        if (c3208t != null) {
            return c3208t;
        }
        Intrinsics.r("screen");
        return null;
    }

    @Override // com.swmansion.rnscreens.B
    public boolean k() {
        return false;
    }

    @Override // com.swmansion.rnscreens.B
    public Activity l() {
        androidx.fragment.app.i fragment;
        androidx.fragment.app.j jVarA;
        androidx.fragment.app.j jVarA2 = A();
        if (jVarA2 != null) {
            return jVarA2;
        }
        Context context = j().getContext();
        if (context instanceof ReactContext) {
            ReactContext reactContext = (ReactContext) context;
            if (reactContext.getCurrentActivity() != null) {
                return reactContext.getCurrentActivity();
            }
        }
        for (ViewParent container = j().getContainer(); container != null; container = container.getParent()) {
            if ((container instanceof C3208t) && (fragment = ((C3208t) container).getFragment()) != null && (jVarA = fragment.A()) != null) {
                return jVarA;
            }
        }
        return null;
    }

    @Override // com.swmansion.rnscreens.B
    /* JADX INFO: renamed from: m, reason: from getter */
    public List getChildScreenContainers() {
        return this.childScreenContainers;
    }

    @Override // com.swmansion.rnscreens.B
    public void n(C3210v container) {
        Intrinsics.checkNotNullParameter(container, "container");
        getChildScreenContainers().add(container);
    }

    @Override // com.swmansion.rnscreens.B
    public void o() {
        j2();
    }

    @Override // com.swmansion.rnscreens.B
    public void q(C3210v container) {
        Intrinsics.checkNotNullParameter(container, "container");
        getChildScreenContainers().remove(container);
    }

    @Override // com.swmansion.rnscreens.B
    public ReactContext t() {
        if (G() instanceof ReactContext) {
            Context contextG = G();
            Intrinsics.d(contextG, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            return (ReactContext) contextG;
        }
        if (j().getContext() instanceof ReactContext) {
            Context context = j().getContext();
            Intrinsics.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            return (ReactContext) context;
        }
        for (ViewParent container = j().getContainer(); container != null; container = container.getParent()) {
            if (container instanceof C3208t) {
                C3208t c3208t = (C3208t) container;
                if (c3208t.getContext() instanceof ReactContext) {
                    Context context2 = c3208t.getContext();
                    Intrinsics.d(context2, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                    return (ReactContext) context2;
                }
            }
        }
        return null;
    }
}
