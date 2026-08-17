package com.facebook.react.uimanager;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class J0 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f30318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final K0 f30319b;

    public J0(K0 viewManagerResolver) {
        Intrinsics.checkNotNullParameter(viewManagerResolver, "viewManagerResolver");
        this.f30318a = new LinkedHashMap();
        this.f30319b = viewManagerResolver;
    }

    public J0(List viewManagerList) {
        Intrinsics.checkNotNullParameter(viewManagerList, "viewManagerList");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.e(kotlin.collections.N.e(CollectionsKt.w(viewManagerList, 10)), 16));
        for (Object obj : viewManagerList) {
            linkedHashMap.put(((ViewManager) obj).getName(), obj);
        }
        this.f30318a = kotlin.collections.N.v(linkedHashMap);
        this.f30319b = null;
    }

    private final ViewManager h(String str) {
        K0 k10 = this.f30319b;
        ViewManager viewManagerB = k10 != null ? k10.b(str) : null;
        if (viewManagerB != null) {
            this.f30318a.put(str, viewManagerB);
        }
        return viewManagerB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ViewManager) it.next()).invalidate();
        }
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(List list, int i10) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ViewManager) it.next()).onSurfaceStopped(i10);
        }
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ViewManager) it.next()).trimMemory();
        }
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(Function0 function0) {
        function0.invoke();
    }

    public final synchronized ViewManager g(String className) {
        try {
            Intrinsics.checkNotNullParameter(className, "className");
            ViewManager viewManager = (ViewManager) this.f30318a.get(className);
            if (viewManager != null) {
                return viewManager;
            }
            String str = "RCT" + className;
            ViewManager viewManager2 = (ViewManager) this.f30318a.get(str);
            if (viewManager2 != null) {
                return viewManager2;
            }
            if (this.f30319b == null) {
                throw new C2275s("No ViewManager found for class " + className);
            }
            ViewManager viewManagerH = h(className);
            if (viewManagerH != null) {
                return viewManagerH;
            }
            ViewManager viewManagerH2 = h(str);
            if (viewManagerH2 != null) {
                return viewManagerH2;
            }
            throw new C2275s("Can't find ViewManager '" + className + "' nor '" + str + "' in ViewManagerRegistry, existing names are: " + this.f30319b.a());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ViewManager i(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        ViewManager viewManager = (ViewManager) this.f30318a.get(className);
        if (viewManager != null) {
            return viewManager;
        }
        return this.f30319b != null ? h(className) : null;
    }

    public final void j() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f30318a.values());
        }
        D0 d10 = new D0(arrayList);
        if (UiThreadUtil.isOnUiThread()) {
            d10.invoke();
        } else {
            UiThreadUtil.runOnUiThread(new E0(d10));
        }
    }

    public final void m(int i10) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f30318a.values());
        }
        H0 h10 = new H0(arrayList, i10);
        if (UiThreadUtil.isOnUiThread()) {
            h10.invoke();
        } else {
            UiThreadUtil.runOnUiThread(new I0(h10));
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(40);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f30318a.values());
        }
        F0 f10 = new F0(arrayList);
        if (UiThreadUtil.isOnUiThread()) {
            f10.invoke();
        } else {
            UiThreadUtil.runOnUiThread(new G0(f10));
        }
    }
}
