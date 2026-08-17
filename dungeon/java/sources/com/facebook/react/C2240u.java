package com.facebook.react;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.views.view.WindowUtilKt;
import java.util.Objects;

/* JADX INFO: renamed from: com.facebook.react.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2240u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f30136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private M6.g f30138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Callback f30139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C2298y f30140e;

    /* JADX INFO: renamed from: com.facebook.react.u$a */
    class a extends C2298y {
        a(Activity activity, O o10, String str, Bundle bundle, boolean z10) {
            super(activity, o10, str, bundle, z10);
        }

        @Override // com.facebook.react.C2298y
        protected Y b() {
            Y yCreateRootView = C2240u.this.createRootView();
            return yCreateRootView == null ? super.b() : yCreateRootView;
        }
    }

    @Deprecated
    public C2240u(Activity activity, String str) {
        this.f30136a = activity;
        this.f30137b = str;
    }

    public C2240u(AbstractActivityC2237q abstractActivityC2237q, String str) {
        this.f30136a = abstractActivityC2237q;
        this.f30137b = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        Window window;
        String mainComponentName = getMainComponentName();
        Bundle bundleComposeLaunchOptions = composeLaunchOptions();
        Activity activity = this.f30136a;
        if (activity != null && (window = activity.getWindow()) != null) {
            if (WindowUtilKt.isEdgeToEdgeFeatureFlagOn()) {
                WindowUtilKt.enableEdgeToEdge(window);
            }
            if (Build.VERSION.SDK_INT >= 26 && isWideColorGamutEnabled()) {
                window.setColorMode(1);
            }
        }
        if (D6.e.a()) {
            this.f30140e = new C2298y(getPlainActivity(), getReactHost(), mainComponentName, bundleComposeLaunchOptions);
        } else {
            this.f30140e = new a(getPlainActivity(), getReactNativeHost(), mainComponentName, bundleComposeLaunchOptions, isFabricEnabled());
        }
        if (mainComponentName != null) {
            loadApp(mainComponentName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(int i10, String[] strArr, int[] iArr, Object[] objArr) {
        M6.g gVar = this.f30138c;
        if (gVar == null || !gVar.onRequestPermissionsResult(i10, strArr, iArr)) {
            return;
        }
        this.f30138c = null;
    }

    protected Bundle composeLaunchOptions() {
        return getLaunchOptions();
    }

    protected Y createRootView() {
        return null;
    }

    protected Context getContext() {
        return (Context) p240n6.a.c(this.f30136a);
    }

    public ReactContext getCurrentReactContext() {
        C2298y c2298y = this.f30140e;
        Objects.requireNonNull(c2298y);
        return c2298y.c();
    }

    protected Bundle getLaunchOptions() {
        return null;
    }

    public String getMainComponentName() {
        return this.f30137b;
    }

    protected Activity getPlainActivity() {
        return (Activity) getContext();
    }

    protected AbstractActivityC2237q getReactActivity() {
        return (AbstractActivityC2237q) getContext();
    }

    protected C2298y getReactDelegate() {
        return this.f30140e;
    }

    public InterfaceC2299z getReactHost() {
        return ((InterfaceC2296w) getPlainActivity().getApplication()).b();
    }

    public I getReactInstanceManager() {
        C2298y c2298y = this.f30140e;
        Objects.requireNonNull(c2298y);
        return c2298y.e();
    }

    @Deprecated
    protected O getReactNativeHost() {
        return ((InterfaceC2296w) getPlainActivity().getApplication()).a();
    }

    protected boolean isFabricEnabled() {
        return D6.e.b();
    }

    protected boolean isWideColorGamutEnabled() {
        return false;
    }

    protected void loadApp(String str) {
        C2298y c2298y = this.f30140e;
        Objects.requireNonNull(c2298y);
        Objects.requireNonNull(str);
        c2298y.g(str);
        getPlainActivity().setContentView(this.f30140e.f());
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
        C2298y c2298y = this.f30140e;
        Objects.requireNonNull(c2298y);
        c2298y.h(i10, i11, intent, true);
    }

    public boolean onBackPressed() {
        C2298y c2298y = this.f30140e;
        Objects.requireNonNull(c2298y);
        return c2298y.i();
    }

    public void onConfigurationChanged(Configuration configuration) {
        C2298y c2298y = this.f30140e;
        Objects.requireNonNull(c2298y);
        c2298y.j(configuration);
    }

    public void onCreate(Bundle bundle) {
        p295q7.a.o(0L, "ReactActivityDelegate.onCreate::init", new RunnableC2238s(this));
    }

    public void onDestroy() {
        C2298y c2298y = this.f30140e;
        Objects.requireNonNull(c2298y);
        c2298y.k();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        C2298y c2298y = this.f30140e;
        Objects.requireNonNull(c2298y);
        return c2298y.n(i10, keyEvent);
    }

    public boolean onKeyLongPress(int i10, KeyEvent keyEvent) {
        C2298y c2298y = this.f30140e;
        Objects.requireNonNull(c2298y);
        return c2298y.o(i10);
    }

    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        C2298y c2298y = this.f30140e;
        Objects.requireNonNull(c2298y);
        return c2298y.w(i10, keyEvent);
    }

    public boolean onNewIntent(Intent intent) {
        C2298y c2298y = this.f30140e;
        Objects.requireNonNull(c2298y);
        Objects.requireNonNull(intent);
        return c2298y.p(intent);
    }

    public void onPause() {
        C2298y c2298y = this.f30140e;
        Objects.requireNonNull(c2298y);
        c2298y.l();
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        LifecycleState lifecycleStateG;
        C2239t c2239t = new C2239t(this, i10, strArr, iArr);
        if (isFabricEnabled()) {
            InterfaceC2299z reactHost = getReactHost();
            lifecycleStateG = reactHost != null ? reactHost.p() : LifecycleState.BEFORE_CREATE;
        } else {
            O reactNativeHost = getReactNativeHost();
            lifecycleStateG = !reactNativeHost.g() ? LifecycleState.BEFORE_CREATE : reactNativeHost.c().G();
        }
        if (lifecycleStateG == LifecycleState.RESUMED) {
            c2239t.invoke(new Object[0]);
        } else {
            this.f30139d = c2239t;
        }
    }

    public void onResume() {
        C2298y c2298y = this.f30140e;
        Objects.requireNonNull(c2298y);
        c2298y.m();
        Callback callback = this.f30139d;
        if (callback != null) {
            callback.invoke(new Object[0]);
            this.f30139d = null;
        }
    }

    public void onUserLeaveHint() {
        C2298y c2298y = this.f30140e;
        Objects.requireNonNull(c2298y);
        c2298y.q();
    }

    public void onWindowFocusChanged(boolean z10) {
        C2298y c2298y = this.f30140e;
        Objects.requireNonNull(c2298y);
        c2298y.r(z10);
    }

    public void requestPermissions(String[] strArr, int i10, M6.g gVar) {
        this.f30138c = gVar;
        getPlainActivity().requestPermissions(strArr, i10);
    }

    public void setReactRootView(Y y10) {
        C2298y c2298y = this.f30140e;
        Objects.requireNonNull(c2298y);
        c2298y.u(y10);
    }

    public void setReactSurface(B6.a aVar) {
        C2298y c2298y = this.f30140e;
        Objects.requireNonNull(c2298y);
        c2298y.v(aVar);
    }
}
