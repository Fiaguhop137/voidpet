package com.swmansion.rnscreens.utils;

import Ta.g;
import Ta.h;
import Ta.i;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.jni.annotations.DoNotStrip;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.H;
import com.google.android.material.appbar.AppBarLayout;
import com.swmansion.rnscreens.X;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DoNotStrip
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u001fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\u00022\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001bR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00100\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u00101R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u00104R\u001c\u00109\u001a\b\u0012\u0004\u0012\u00020\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010:¨\u0006<"}, d2 = {"Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "", "g", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Z", "Landroid/content/Context;", "contextWithTheme", "", "f", "(Landroid/content/Context;)V", "", "fontSize", "isTitleEmpty", "", "computeDummyLayout", "(IZ)F", "Lkotlin/Function0;", "", "lazyMessage", "j", "(Lkotlin/jvm/functions/Function0;)Lcom/facebook/react/bridge/ReactApplicationContext;", "Landroid/app/Activity;", "i", "()Landroid/app/Activity;", "onHostResume", "()V", "onHostPause", "onHostDestroy", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "a", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "coordinatorLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "b", "Lcom/google/android/material/appbar/AppBarLayout;", "appBarLayout", "Landroid/view/View;", "c", "Landroid/view/View;", "dummyContentView", "Landroidx/appcompat/widget/Toolbar;", "d", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "e", "F", "defaultFontSize", "I", "defaultContentInsetStartWithNavigation", "Lcom/swmansion/rnscreens/utils/a;", "Lcom/swmansion/rnscreens/utils/a;", "cache", "Ljava/lang/ref/WeakReference;", "h", "Ljava/lang/ref/WeakReference;", "reactContextRef", "Z", "isLayoutInitialized", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScreenDummyLayoutHelper implements LifecycleEventListener {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static WeakReference f39317k = new WeakReference(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private CoordinatorLayout coordinatorLayout;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private AppBarLayout appBarLayout;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private View dummyContentView;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Toolbar toolbar;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float defaultFontSize;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int defaultContentInsetStartWithNavigation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private a cache;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private WeakReference reactContextRef;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private volatile boolean isLayoutInitialized;

    /* JADX INFO: renamed from: com.swmansion.rnscreens.utils.ScreenDummyLayoutHelper$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @DoNotStrip
        @Nullable
        public final ScreenDummyLayoutHelper getInstance() {
            return (ScreenDummyLayoutHelper) ScreenDummyLayoutHelper.f39317k.get();
        }
    }

    @DoNotStrip
    private final float computeDummyLayout(int fontSize, boolean isTitleEmpty) {
        if (!this.isLayoutInitialized && !g(j(new g()))) {
            Log.e("ScreenDummyLayoutHelper", "[RNScreens] Failed to late-init layout while computing header height. This is most likely a race-condition-bug in react-native-screens, please file an issue at https://github.com/software-mansion/react-native-screens/issues");
            return 0.0f;
        }
        if (this.cache.b(new b(fontSize, isTitleEmpty))) {
            return this.cache.a();
        }
        View decorView = i().getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        int width = decorView.getWidth();
        int height = decorView.getHeight();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(width, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(height, 1073741824);
        AppBarLayout appBarLayout = null;
        if (isTitleEmpty) {
            Toolbar toolbar = this.toolbar;
            if (toolbar == null) {
                Intrinsics.r("toolbar");
                toolbar = null;
            }
            toolbar.setTitle("");
            Toolbar toolbar2 = this.toolbar;
            if (toolbar2 == null) {
                Intrinsics.r("toolbar");
                toolbar2 = null;
            }
            toolbar2.setContentInsetStartWithNavigation(0);
        } else {
            Toolbar toolbar3 = this.toolbar;
            if (toolbar3 == null) {
                Intrinsics.r("toolbar");
                toolbar3 = null;
            }
            toolbar3.setTitle("FontSize123!#$");
            Toolbar toolbar4 = this.toolbar;
            if (toolbar4 == null) {
                Intrinsics.r("toolbar");
                toolbar4 = null;
            }
            toolbar4.setContentInsetStartWithNavigation(this.defaultContentInsetStartWithNavigation);
        }
        X.a aVar = X.f39001B;
        Toolbar toolbar5 = this.toolbar;
        if (toolbar5 == null) {
            Intrinsics.r("toolbar");
            toolbar5 = null;
        }
        TextView textViewA = aVar.a(toolbar5);
        if (textViewA != null) {
            textViewA.setTextSize(fontSize != -1 ? fontSize : this.defaultFontSize);
        }
        CoordinatorLayout coordinatorLayout = this.coordinatorLayout;
        if (coordinatorLayout == null) {
            Intrinsics.r("coordinatorLayout");
            coordinatorLayout = null;
        }
        coordinatorLayout.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        CoordinatorLayout coordinatorLayout2 = this.coordinatorLayout;
        if (coordinatorLayout2 == null) {
            Intrinsics.r("coordinatorLayout");
            coordinatorLayout2 = null;
        }
        coordinatorLayout2.layout(0, 0, width, height);
        AppBarLayout appBarLayout2 = this.appBarLayout;
        if (appBarLayout2 == null) {
            Intrinsics.r("appBarLayout");
        } else {
            appBarLayout = appBarLayout2;
        }
        float fG = H.g(appBarLayout.getHeight());
        this.cache = new a(new b(fontSize, isTitleEmpty), fG);
        return fG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object e() {
        return "[RNScreens] Context was null-ed before dummy layout was initialized";
    }

    private final void f(Context contextWithTheme) {
        this.coordinatorLayout = new CoordinatorLayout(contextWithTheme);
        AppBarLayout appBarLayout = new AppBarLayout(contextWithTheme);
        appBarLayout.setLayoutParams(new CoordinatorLayout.f(-1, -2));
        this.appBarLayout = appBarLayout;
        Toolbar toolbar = new Toolbar(contextWithTheme);
        toolbar.setTitle("FontSize123!#$");
        AppBarLayout.d dVar = new AppBarLayout.d(-1, -2);
        dVar.g(0);
        toolbar.setLayoutParams(dVar);
        this.toolbar = toolbar;
        TextView textViewA = X.f39001B.a(toolbar);
        Intrinsics.c(textViewA);
        this.defaultFontSize = textViewA.getTextSize();
        Toolbar toolbar2 = this.toolbar;
        View view = null;
        if (toolbar2 == null) {
            Intrinsics.r("toolbar");
            toolbar2 = null;
        }
        this.defaultContentInsetStartWithNavigation = toolbar2.getContentInsetStartWithNavigation();
        AppBarLayout appBarLayout2 = this.appBarLayout;
        if (appBarLayout2 == null) {
            Intrinsics.r("appBarLayout");
            appBarLayout2 = null;
        }
        Toolbar toolbar3 = this.toolbar;
        if (toolbar3 == null) {
            Intrinsics.r("toolbar");
            toolbar3 = null;
        }
        appBarLayout2.addView(toolbar3);
        View view2 = new View(contextWithTheme);
        view2.setLayoutParams(new CoordinatorLayout.f(-1, -1));
        this.dummyContentView = view2;
        CoordinatorLayout coordinatorLayout = this.coordinatorLayout;
        if (coordinatorLayout == null) {
            Intrinsics.r("coordinatorLayout");
            coordinatorLayout = null;
        }
        AppBarLayout appBarLayout3 = this.appBarLayout;
        if (appBarLayout3 == null) {
            Intrinsics.r("appBarLayout");
            appBarLayout3 = null;
        }
        coordinatorLayout.addView(appBarLayout3);
        View view3 = this.dummyContentView;
        if (view3 == null) {
            Intrinsics.r("dummyContentView");
        } else {
            view = view3;
        }
        coordinatorLayout.addView(view);
        this.isLayoutInitialized = true;
    }

    private final boolean g(ReactApplicationContext reactContext) {
        if (this.isLayoutInitialized) {
            return true;
        }
        if (!reactContext.hasCurrentActivity()) {
            return false;
        }
        Activity currentActivity = reactContext.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalArgumentException("[RNScreens] Attempt to use context detached from activity. This could happen only due to race-condition.");
        }
        synchronized (this) {
            if (this.isLayoutInitialized) {
                return true;
            }
            f(currentActivity);
            Unit unit = Unit.f48228a;
            return true;
        }
    }

    @DoNotStrip
    @Nullable
    public static final ScreenDummyLayoutHelper getInstance() {
        return INSTANCE.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object h() {
        return "[RNScreens] ReactContext missing in onHostResume! This should not happen.";
    }

    private final Activity i() {
        Activity currentActivity = k(this, null, 1, null).getCurrentActivity();
        if (currentActivity != null) {
            return currentActivity;
        }
        throw new IllegalArgumentException("[RNScreens] Attempt to use context detached from activity");
    }

    private final ReactApplicationContext j(Function0 lazyMessage) {
        Object obj = this.reactContextRef.get();
        if (lazyMessage == null) {
            lazyMessage = new i();
        }
        if (obj != null) {
            return (ReactApplicationContext) obj;
        }
        throw new IllegalArgumentException(lazyMessage.invoke().toString());
    }

    static /* synthetic */ ReactApplicationContext k(ScreenDummyLayoutHelper screenDummyLayoutHelper, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function0 = null;
        }
        return screenDummyLayoutHelper.j(function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object l() {
        return "[RNScreens] Attempt to require missing react context";
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        ReactApplicationContext reactApplicationContext = (ReactApplicationContext) this.reactContextRef.get();
        if (reactApplicationContext != null) {
            reactApplicationContext.removeLifecycleEventListener(this);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        ReactApplicationContext reactApplicationContextJ = j(new h());
        if (g(reactApplicationContextJ)) {
            reactApplicationContextJ.removeLifecycleEventListener(this);
        } else {
            Log.w("ScreenDummyLayoutHelper", "[RNScreens] Failed to initialise dummy layout in onHostResume.");
        }
    }
}
