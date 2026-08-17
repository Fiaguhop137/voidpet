package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import io.sentry.C3697e;
import io.sentry.EnumC3721i3;
import io.sentry.H;
import io.sentry.InterfaceC3619a0;
import io.sentry.InterfaceC3723j0;
import io.sentry.Y;
import io.sentry.a4;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.h4;
import io.sentry.j4;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f44939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3619a0 f44940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SentryAndroidOptions f44941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private io.sentry.internal.gestures.b f44942d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC3723j0 f44943e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f44944f = b.Unknown;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c f44945g = new c(null);

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f44946a;

        static {
            int[] iArr = new int[b.values().length];
            f44946a = iArr;
            try {
                iArr[b.Click.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44946a[b.Scroll.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44946a[b.Swipe.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44946a[b.Unknown.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private enum b {
        Click,
        Scroll,
        Swipe,
        Unknown
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b f44947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private io.sentry.internal.gestures.b f44948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f44949c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f44950d;

        private c() {
            this.f44947a = b.Unknown;
            this.f44949c = 0.0f;
            this.f44950d = 0.0f;
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String i(MotionEvent motionEvent) {
            float x10 = motionEvent.getX() - this.f44949c;
            float y10 = motionEvent.getY() - this.f44950d;
            if (Math.abs(x10) > Math.abs(y10)) {
                return x10 > 0.0f ? "right" : "left";
            }
            return y10 > 0.0f ? "down" : "up";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j() {
            this.f44948b = null;
            this.f44947a = b.Unknown;
            this.f44949c = 0.0f;
            this.f44950d = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k(io.sentry.internal.gestures.b bVar) {
            this.f44948b = bVar;
        }
    }

    public g(Activity activity, InterfaceC3619a0 interfaceC3619a0, SentryAndroidOptions sentryAndroidOptions) {
        this.f44939a = new WeakReference(activity);
        this.f44940b = interfaceC3619a0;
        this.f44941c = sentryAndroidOptions;
    }

    public static /* synthetic */ void b(g gVar, Y y10, InterfaceC3723j0 interfaceC3723j0, InterfaceC3723j0 interfaceC3723j1) {
        if (interfaceC3723j1 != null) {
            gVar.f44941c.getLogger().c(EnumC3721i3.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", interfaceC3723j0.getName());
        } else {
            gVar.getClass();
            y10.x(interfaceC3723j0);
        }
    }

    public static /* synthetic */ void d(g gVar, Y y10, InterfaceC3723j0 interfaceC3723j0) {
        if (interfaceC3723j0 == gVar.f44943e) {
            y10.B();
        }
    }

    private void e(io.sentry.internal.gestures.b bVar, b bVar2, Map map, MotionEvent motionEvent) {
        if (this.f44941c.isEnableUserInteractionBreadcrumbs()) {
            String strJ = j(bVar2);
            H h10 = new H();
            h10.l("android:motionEvent", motionEvent);
            h10.l("android:view", bVar.f());
            this.f44940b.e(C3697e.M(strJ, bVar.d(), bVar.a(), bVar.e(), map), h10);
        }
    }

    private View h(String str) {
        Activity activity = (Activity) this.f44939a.get();
        if (activity == null) {
            this.f44941c.getLogger().c(EnumC3721i3.DEBUG, "Activity is null in " + str + ". No breadcrumb captured.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            this.f44941c.getLogger().c(EnumC3721i3.DEBUG, "Window is null in " + str + ". No breadcrumb captured.", new Object[0]);
            return null;
        }
        View decorView = window.getDecorView();
        if (decorView != null) {
            return decorView;
        }
        this.f44941c.getLogger().c(EnumC3721i3.DEBUG, "DecorView is null in " + str + ". No breadcrumb captured.", new Object[0]);
        return null;
    }

    private String i(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    private static String j(b bVar) {
        int i10 = a.f44946a[bVar.ordinal()];
        if (i10 == 1) {
            return "click";
        }
        if (i10 != 2) {
            return i10 != 3 ? "unknown" : "swipe";
        }
        return "scroll";
    }

    private void l(io.sentry.internal.gestures.b bVar, b bVar2) {
        boolean z10 = bVar2 == b.Click || !(bVar2 == this.f44944f && bVar.equals(this.f44942d));
        if (!this.f44941c.isTracingEnabled() || !this.f44941c.isEnableUserInteractionTracing()) {
            if (z10) {
                if (this.f44941c.isEnableAutoTraceIdGeneration()) {
                    io.sentry.util.H.h(this.f44940b);
                }
                this.f44942d = bVar;
                this.f44944f = bVar2;
                return;
            }
            return;
        }
        Activity activity = (Activity) this.f44939a.get();
        if (activity == null) {
            this.f44941c.getLogger().c(EnumC3721i3.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
            return;
        }
        String strB = bVar.b();
        InterfaceC3723j0 interfaceC3723j0 = this.f44943e;
        if (interfaceC3723j0 != null) {
            if (!z10 && !interfaceC3723j0.a()) {
                this.f44941c.getLogger().c(EnumC3721i3.DEBUG, "The view with id: " + strB + " already has an ongoing transaction assigned. Rescheduling finish", new Object[0]);
                if (this.f44941c.getIdleTimeout() != null) {
                    this.f44943e.I();
                    return;
                }
                return;
            }
            m(a4.OK);
        }
        String str = i(activity) + "." + strB;
        String str2 = "ui.action." + j(bVar2);
        j4 j4Var = new j4();
        j4Var.v(true);
        long deadlineTimeout = this.f44941c.getDeadlineTimeout();
        j4Var.s(deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout));
        j4Var.t(this.f44941c.getIdleTimeout());
        j4Var.i(true);
        j4Var.g("auto.ui.gesture_listener." + bVar.c());
        InterfaceC3723j0 interfaceC3723j0H = this.f44940b.H(new h4(str, io.sentry.protocol.H.COMPONENT, str2), j4Var);
        this.f44940b.z(new d(this, interfaceC3723j0H));
        this.f44943e = interfaceC3723j0H;
        this.f44942d = bVar;
        this.f44944f = bVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Y y10, InterfaceC3723j0 interfaceC3723j0) {
        y10.P(new e(this, y10, interfaceC3723j0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(Y y10) {
        y10.P(new f(this, y10));
    }

    public void k(MotionEvent motionEvent) {
        View viewH = h("onUp");
        io.sentry.internal.gestures.b bVar = this.f44945g.f44948b;
        if (viewH == null || bVar == null) {
            return;
        }
        if (this.f44945g.f44947a == b.Unknown) {
            this.f44941c.getLogger().c(EnumC3721i3.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new Object[0]);
            return;
        }
        e(bVar, this.f44945g.f44947a, Collections.singletonMap("direction", this.f44945g.i(motionEvent)), motionEvent);
        l(bVar, this.f44945g.f44947a);
        this.f44945g.j();
    }

    void m(a4 a4Var) {
        InterfaceC3723j0 interfaceC3723j0 = this.f44943e;
        if (interfaceC3723j0 != null) {
            if (interfaceC3723j0.t() == null) {
                this.f44943e.i(a4Var);
            } else {
                this.f44943e.c();
            }
        }
        this.f44940b.z(new io.sentry.android.core.internal.gestures.c(this));
        this.f44943e = null;
        if (this.f44942d != null) {
            this.f44942d = null;
        }
        this.f44944f = b.Unknown;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        this.f44945g.j();
        this.f44945g.f44949c = motionEvent.getX();
        this.f44945g.f44950d = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        this.f44945g.f44947a = b.Swipe;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        View viewH = h("onScroll");
        if (viewH != null && motionEvent != null && this.f44945g.f44947a == b.Unknown) {
            io.sentry.internal.gestures.b bVarA = i.a(this.f44941c, viewH, motionEvent.getX(), motionEvent.getY(), io.sentry.internal.gestures.b.a.SCROLLABLE);
            if (bVarA == null) {
                this.f44941c.getLogger().c(EnumC3721i3.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                this.f44945g.f44947a = b.Scroll;
                return false;
            }
            this.f44941c.getLogger().c(EnumC3721i3.DEBUG, "Scroll target found: " + bVarA.b(), new Object[0]);
            this.f44945g.k(bVarA);
            this.f44945g.f44947a = b.Scroll;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        View viewH = h("onSingleTapUp");
        if (viewH != null && motionEvent != null) {
            io.sentry.internal.gestures.b bVarA = i.a(this.f44941c, viewH, motionEvent.getX(), motionEvent.getY(), io.sentry.internal.gestures.b.a.CLICKABLE);
            if (bVarA == null) {
                this.f44941c.getLogger().c(EnumC3721i3.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            b bVar = b.Click;
            e(bVarA, bVar, Collections.EMPTY_MAP, motionEvent);
            l(bVarA, bVar);
        }
        return false;
    }
}
