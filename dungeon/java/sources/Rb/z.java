package Rb;

import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import expo.modules.kotlin.jni.JNIDeallocator;
import expo.modules.kotlin.jni.JSIContext;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f10978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f10979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s f10980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public JSIContext f10981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r f10982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final JNIDeallocator f10983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p121gc.e f10984g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p121gc.b f10985h;

    public z(d appContext, WeakReference reactContextHolder) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(reactContextHolder, "reactContextHolder");
        this.f10978a = reactContextHolder;
        this.f10979b = B.a(appContext);
        this.f10980c = new s(B.a(this));
        Wb.b bVar = new Wb.b();
        bVar.t(this);
        this.f10982e = new r(bVar);
        this.f10983f = new JNIDeallocator(false, 1, null);
        this.f10984g = new p121gc.e(this);
        this.f10985h = new p121gc.b();
    }

    private final boolean k() {
        return this.f10981d != null;
    }

    public final void a() {
        ((Wb.b) this.f10982e.g()).t(null);
        this.f10983f.b();
    }

    public final d b() {
        return (d) this.f10979b.get();
    }

    public final p121gc.b c() {
        return this.f10985h;
    }

    public final r d() {
        return this.f10982e;
    }

    public final JNIDeallocator e() {
        return this.f10983f;
    }

    public final JSIContext f() {
        JSIContext jSIContext = this.f10981d;
        if (jSIContext != null) {
            return jSIContext;
        }
        Intrinsics.r("jsiContext");
        return null;
    }

    public final WeakReference g() {
        return this.f10978a;
    }

    public final s h() {
        return this.f10980c;
    }

    public final p121gc.e i() {
        return this.f10984g;
    }

    public final void j() {
        JavaScriptContextHolder javaScriptContextHolder;
        synchronized (this) {
            if (k()) {
                p263ob.d.i(f.a(), "⚠️ JSI interop was already installed", null, 2, null);
                return;
            }
            p381v3.a.c("[ExpoModulesCore] " + (this + ".installJSIContext"));
            try {
                try {
                    l(new JSIContext());
                    ReactApplicationContext reactApplicationContext = (ReactApplicationContext) g().get();
                    if (reactApplicationContext != null && (javaScriptContextHolder = reactApplicationContext.getJavaScriptContextHolder()) != null) {
                        Long lValueOf = Long.valueOf(javaScriptContextHolder.getContext());
                        if (lValueOf.longValue() == 0) {
                            lValueOf = null;
                        }
                        if (lValueOf == null) {
                            p263ob.d.c(f.a(), "❌ Cannot install JSI interop - JS runtime pointer is null", null, 2, null);
                        } else {
                            long jLongValue = lValueOf.longValue();
                            if (reactApplicationContext.isBridgeless()) {
                                JSIContext jSIContextF = f();
                                RuntimeExecutor runtimeExecutor = reactApplicationContext.getCatalystInstance().getRuntimeExecutor();
                                Intrinsics.c(runtimeExecutor);
                                jSIContextF.d(this, jLongValue, runtimeExecutor);
                            } else {
                                JSIContext jSIContextF2 = f();
                                CallInvokerHolder jSCallInvokerHolder = reactApplicationContext.getCatalystInstance().getJSCallInvokerHolder();
                                Intrinsics.d(jSCallInvokerHolder, "null cannot be cast to non-null type com.facebook.react.turbomodule.core.CallInvokerHolderImpl");
                                jSIContextF2.c(this, jLongValue, (CallInvokerHolderImpl) jSCallInvokerHolder);
                            }
                            f.a().d("✅ JSI interop was installed");
                        }
                    }
                } catch (Throwable th) {
                    f.a().b("❌ Cannot install JSI interop: " + th, th);
                }
                Unit unit = Unit.f48228a;
                p381v3.a.f();
            } catch (Throwable th2) {
                p381v3.a.f();
                throw th2;
            }
        }
    }

    public final void l(JSIContext jSIContext) {
        Intrinsics.checkNotNullParameter(jSIContext, "<set-?>");
        this.f10981d = jSIContext;
    }
}
