package com.facebook.react;

import android.app.Application;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.common.LifecycleState;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Application f29367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private I f29368b;

    class a implements p312r6.i {
        a() {
        }

        @Override // p312r6.i
        public p312r6.h e(String str) {
            return null;
        }
    }

    static {
        p348t6.b.a("ReactNativeHost", p348t6.a.ERROR);
    }

    protected O(Application application) {
        this.f29367a = application;
    }

    public static /* synthetic */ UIManager a(ReactApplicationContext reactApplicationContext) {
        return null;
    }

    public boolean b() {
        return false;
    }

    public synchronized I c() {
        try {
            if (this.f29368b == null) {
                ReactMarker.logMarker(ReactMarkerConstants.INIT_REACT_RUNTIME_START);
                ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_START);
                this.f29368b = createReactInstanceManager();
                ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_END);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f29368b;
    }

    protected I createReactInstanceManager() {
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_START);
        L baseReactInstanceManagerBuilder = getBaseReactInstanceManagerBuilder();
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_END);
        return baseReactInstanceManagerBuilder.b();
    }

    public boolean d() {
        return true;
    }

    public p312r6.i e() {
        return new a();
    }

    public abstract boolean f();

    public synchronized boolean g() {
        return this.f29368b != null;
    }

    protected final Application getApplication() {
        return this.f29367a;
    }

    protected L getBaseReactInstanceManagerBuilder() {
        L lO = I.v().d(this.f29367a).m(getJSMainModuleName()).v(f()).h(getDevSupportManagerFactory()).g(getDevLoadingViewManager()).s(d()).t(e()).l(getJSExceptionHandler()).o(b());
        getRedBoxHandler();
        L lP = lO.r(null).n(getJavaScriptExecutorFactory()).u(getUIManagerProvider()).i(LifecycleState.BEFORE_CREATE).q(getReactPackageTurboModuleManagerDelegateBuilder()).f(getChoreographerProvider()).p(getPausedInDebuggerOverlayManager());
        Iterator<P> it = getPackages().iterator();
        while (it.hasNext()) {
            lP.a(it.next());
        }
        String jSBundleFile = getJSBundleFile();
        if (jSBundleFile != null) {
            lP.j(jSBundleFile);
            return lP;
        }
        lP.e((String) p240n6.a.c(getBundleAssetName()));
        return lP;
    }

    protected String getBundleAssetName() {
        return "index.android.bundle";
    }

    protected C6.b getChoreographerProvider() {
        return null;
    }

    protected p456z6.c getDevLoadingViewManager() {
        return null;
    }

    protected com.facebook.react.devsupport.S getDevSupportManagerFactory() {
        return null;
    }

    protected String getJSBundleFile() {
        return null;
    }

    protected JSExceptionHandler getJSExceptionHandler() {
        return null;
    }

    protected String getJSMainModuleName() {
        return "index.android";
    }

    protected JavaScriptExecutorFactory getJavaScriptExecutorFactory() {
        return null;
    }

    protected abstract List<P> getPackages();

    protected p456z6.h getPausedInDebuggerOverlayManager() {
        return null;
    }

    protected V.a getReactPackageTurboModuleManagerDelegateBuilder() {
        return null;
    }

    protected p456z6.i getRedBoxHandler() {
        return null;
    }

    protected UIManagerProvider getUIManagerProvider() {
        return new N();
    }
}
