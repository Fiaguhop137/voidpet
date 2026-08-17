package p193kd;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.react.bridge.DefaultJSExceptionHandler;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.devsupport.t0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p265od.b;
import p265od.g;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f48046i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f48047j = e.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f48048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f48049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HandlerThread f48050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler f48051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WeakReference f48052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private DefaultJSExceptionHandler f48053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f48054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ReactMarker.MarkerListener f48055h;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public e(g logger, boolean z10) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f48048a = logger;
        this.f48049b = z10;
        this.f48050c = new HandlerThread("expo-updates-error-recovery");
        this.f48055h = new p193kd.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(e eVar, ReactMarkerConstants name, String str, int i10) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (name == ReactMarkerConstants.CONTENT_APPEARED) {
            eVar.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(e eVar) throws IllegalAccessException, NoSuchFieldException {
        eVar.u();
    }

    private final void m() {
        ReactMarker.addListener(this.f48055h);
    }

    private final void n(p456z6.e eVar) throws IllegalAccessException, NoSuchFieldException {
        if (this.f48049b) {
            q();
        } else {
            o(eVar);
        }
    }

    private final void o(p456z6.e eVar) throws IllegalAccessException, NoSuchFieldException {
        if (!(eVar instanceof t0)) {
            g.e(this.f48048a, "Unexpected type of ReactInstanceManager.DevSupportManager. expo-updates error recovery will not behave properly.", null, 2, null);
            return;
        }
        b bVar = new b(this);
        Field declaredField = eVar.getClass().getDeclaredField("defaultJSExceptionHandler");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(eVar);
        declaredField.set(eVar, bVar);
        Intrinsics.d(obj, "null cannot be cast to non-null type com.facebook.react.bridge.DefaultJSExceptionHandler");
        this.f48053f = (DefaultJSExceptionHandler) obj;
        this.f48052e = new WeakReference(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(e eVar, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        eVar.i(e10);
    }

    private final void q() {
        this.f48054g = true;
    }

    private final void t() {
        ReactMarker.removeListener(this.f48055h);
    }

    private final void u() throws IllegalAccessException, NoSuchFieldException {
        if (this.f48049b) {
            x();
        } else {
            v();
        }
    }

    private final void v() throws IllegalAccessException, NoSuchFieldException {
        p456z6.e eVar;
        WeakReference weakReference = this.f48052e;
        if (weakReference != null && (eVar = (p456z6.e) weakReference.get()) != null) {
            if (!(eVar instanceof t0)) {
                g.e(this.f48048a, "Unexpected type of ReactInstanceManager.DevSupportManager. expo-updates could not unregister its error handler", null, 2, null);
                return;
            } else {
                if (this.f48053f == null) {
                    return;
                }
                Field declaredField = eVar.getClass().getDeclaredField("defaultJSExceptionHandler");
                declaredField.setAccessible(true);
                declaredField.set(eVar, this.f48053f);
                this.f48052e = null;
            }
        }
        f().postDelayed(new d(this), 10000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(e eVar) {
        eVar.f48050c.quitSafely();
    }

    private final void x() {
        this.f48054g = false;
    }

    public final Handler f() {
        Handler handler = this.f48051d;
        if (handler != null) {
            return handler;
        }
        Intrinsics.r("handler");
        return null;
    }

    public final void g() {
        f().sendMessage(f().obtainMessage(1));
        t();
        f().postDelayed(new c(this), 10000L);
    }

    public final void i(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f48048a.f("ErrorRecovery: exception encountered: " + exception.getLocalizedMessage(), exception, b.Unknown);
        f().sendMessage(f().obtainMessage(0, exception));
    }

    public final void j(f delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        if (this.f48051d == null) {
            this.f48050c.start();
            Looper looper = this.f48050c.getLooper();
            Intrinsics.checkNotNullExpressionValue(looper, "getLooper(...)");
            r(new h(looper, delegate, this.f48048a));
        }
    }

    public final void k(f.a newStatus) {
        Intrinsics.checkNotNullParameter(newStatus, "newStatus");
        g.k(this.f48048a, "ErrorRecovery: remote load status changed: " + newStatus, null, 2, null);
        f().sendMessage(f().obtainMessage(2, newStatus));
    }

    public final void l(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (this.f48054g) {
            i(exception);
        }
    }

    public final void r(Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "<set-?>");
        this.f48051d = handler;
    }

    public final void s(p456z6.e devSupportManager) throws IllegalAccessException, NoSuchFieldException {
        Intrinsics.checkNotNullParameter(devSupportManager, "devSupportManager");
        m();
        n(devSupportManager);
    }
}
