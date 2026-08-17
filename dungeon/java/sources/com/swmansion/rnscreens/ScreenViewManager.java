package com.swmansion.rnscreens;

import Ad.InterfaceC0791a;
import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.B0;
import com.facebook.react.uimanager.C2262k0;
import com.facebook.react.uimanager.InterfaceC2260j0;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p134h7.C3509y;
import p134h7.InterfaceC3510z;

/* JADX INFO: loaded from: classes2.dex */
@G6.a(name = "RNSScreen")
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 d2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001eB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b%\u0010&J\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0011\u0010\u001bJ!\u0010(\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b(\u0010)J!\u0010+\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b+\u0010)J\u001f\u0010.\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,H\u0017¢\u0006\u0004\b.\u0010/J!\u00100\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b0\u0010)J!\u00102\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u00101\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b2\u0010)J!\u00104\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u00103\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b4\u0010)J!\u00106\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u00105\u001a\u0004\u0018\u00010\u0016H\u0017¢\u0006\u0004\b6\u00107J!\u00109\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u00108\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b9\u0010)J\u001f\u0010;\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010:\u001a\u00020,H\u0017¢\u0006\u0004\b;\u0010/J\u001f\u0010=\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010<\u001a\u00020,H\u0017¢\u0006\u0004\b=\u0010/J!\u0010?\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010>\u001a\u0004\u0018\u00010\u0016H\u0017¢\u0006\u0004\b?\u00107J\u001f\u0010A\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010@\u001a\u00020,H\u0017¢\u0006\u0004\bA\u0010/J\u001f\u0010C\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010B\u001a\u00020,H\u0017¢\u0006\u0004\bC\u0010/J\u001f\u0010E\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010D\u001a\u00020,H\u0017¢\u0006\u0004\bE\u0010/J!\u0010G\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020\u0016H\u0017¢\u0006\u0004\bG\u0010\u001bJ!\u0010H\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020,H\u0016¢\u0006\u0004\bH\u0010/J!\u0010I\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020,H\u0016¢\u0006\u0004\bI\u0010/J!\u0010J\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020\u0016H\u0016¢\u0006\u0004\bJ\u0010\u001bJ!\u0010K\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020,H\u0016¢\u0006\u0004\bK\u0010/J!\u0010L\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020,H\u0016¢\u0006\u0004\bL\u0010/J#\u0010N\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010F\u001a\u0004\u0018\u00010MH\u0016¢\u0006\u0004\bN\u0010OJ!\u0010P\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020,H\u0016¢\u0006\u0004\bP\u0010/J!\u0010Q\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020,H\u0016¢\u0006\u0004\bQ\u0010/J#\u0010R\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010F\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bR\u0010)J!\u0010T\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010F\u001a\u0004\u0018\u00010SH\u0017¢\u0006\u0004\bT\u0010UJ\u001f\u0010V\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u0016H\u0017¢\u0006\u0004\bV\u0010\u001bJ\u001f\u0010W\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010F\u001a\u00020,H\u0017¢\u0006\u0004\bW\u0010/J\u001f\u0010X\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u000eH\u0017¢\u0006\u0004\bX\u0010\u0012J\u001f\u0010Y\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010F\u001a\u00020,H\u0017¢\u0006\u0004\bY\u0010/J\u001f\u0010Z\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u0016H\u0017¢\u0006\u0004\bZ\u0010\u001bJ!\u0010[\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010F\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b[\u0010)J\u001b\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\"0\\H\u0016¢\u0006\u0004\b]\u0010^J\u0015\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00020_H\u0014¢\u0006\u0004\b`\u0010aR\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010c¨\u0006f"}, d2 = {"Lcom/swmansion/rnscreens/ScreenViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/t;", "Lh7/z;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/k0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/k0;)Lcom/swmansion/rnscreens/t;", "view", "", "activityState", "", "setActivityState", "(Lcom/swmansion/rnscreens/t;F)V", "parent", "Landroid/view/View;", "child", "", "index", "addView", "(Lcom/swmansion/rnscreens/t;Landroid/view/View;I)V", "removeViewAt", "(Lcom/swmansion/rnscreens/t;I)V", "removeView", "(Lcom/swmansion/rnscreens/t;Landroid/view/View;)V", "Lcom/facebook/react/uimanager/X;", "props", "Lcom/facebook/react/uimanager/j0;", "stateWrapper", "", "updateState", "(Lcom/swmansion/rnscreens/t;Lcom/facebook/react/uimanager/X;Lcom/facebook/react/uimanager/j0;)Ljava/lang/Object;", "onAfterUpdateTransaction", "(Lcom/swmansion/rnscreens/t;)V", "presentation", "setStackPresentation", "(Lcom/swmansion/rnscreens/t;Ljava/lang/String;)V", "animation", "setStackAnimation", "", "gestureEnabled", "setGestureEnabled", "(Lcom/swmansion/rnscreens/t;Z)V", "setReplaceAnimation", "screenOrientation", "setScreenOrientation", "statusBarAnimation", "setStatusBarAnimation", "statusBarColor", "setStatusBarColor", "(Lcom/swmansion/rnscreens/t;Ljava/lang/Integer;)V", "statusBarStyle", "setStatusBarStyle", "statusBarTranslucent", "setStatusBarTranslucent", "statusBarHidden", "setStatusBarHidden", "navigationBarColor", "setNavigationBarColor", "navigationBarTranslucent", "setNavigationBarTranslucent", "navigationBarHidden", "setNavigationBarHidden", "nativeBackButtonDismissalEnabled", "setNativeBackButtonDismissalEnabled", "value", "setSheetElevation", "setFullScreenSwipeEnabled", "setFullScreenSwipeShadowEnabled", "setTransitionDuration", "setHideKeyboardOnSwipe", "setCustomAnimationOnSwipe", "Lcom/facebook/react/bridge/ReadableMap;", "setGestureResponseDistance", "(Lcom/swmansion/rnscreens/t;Lcom/facebook/react/bridge/ReadableMap;)V", "setHomeIndicatorHidden", "setPreventNativeDismiss", "setSwipeDirection", "Lcom/facebook/react/bridge/ReadableArray;", "setSheetAllowedDetents", "(Lcom/swmansion/rnscreens/t;Lcom/facebook/react/bridge/ReadableArray;)V", "setSheetLargestUndimmedDetent", "setSheetGrabberVisible", "setSheetCornerRadius", "setSheetExpandsWhenScrolledToEdge", "setSheetInitialDetent", "setScreenId", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "Lcom/facebook/react/uimanager/B0;", "getDelegate", "()Lcom/facebook/react/uimanager/B0;", "delegate", "Lcom/facebook/react/uimanager/B0;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ScreenViewManager extends ViewGroupManager<C3208t> implements InterfaceC3510z {

    @NotNull
    public static final String REACT_CLASS = "RNSScreen";

    @NotNull
    private final B0 delegate;

    public ScreenViewManager() {
        super(null, 1, null);
        this.delegate = new C3509y(this);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(@NotNull C3208t parent, @NotNull View child, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (child instanceof C3211w) {
            parent.u((C3211w) child);
        } else if (child instanceof C3213y) {
            parent.setFooter((C3213y) child);
        }
        super.addView(parent, child, index);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public C3208t createViewInstance(@NotNull C2262k0 reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new C3208t(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    protected B0 getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return kotlin.collections.N.m(Ad.v.a("topDismissed", kotlin.collections.N.k(Ad.v.a("registrationName", "onDismissed"))), Ad.v.a("topWillAppear", kotlin.collections.N.k(Ad.v.a("registrationName", "onWillAppear"))), Ad.v.a("topAppear", kotlin.collections.N.k(Ad.v.a("registrationName", "onAppear"))), Ad.v.a("topWillDisappear", kotlin.collections.N.k(Ad.v.a("registrationName", "onWillDisappear"))), Ad.v.a("topDisappear", kotlin.collections.N.k(Ad.v.a("registrationName", "onDisappear"))), Ad.v.a("topHeaderHeightChange", kotlin.collections.N.k(Ad.v.a("registrationName", "onHeaderHeightChange"))), Ad.v.a("topHeaderBackButtonClicked", kotlin.collections.N.k(Ad.v.a("registrationName", "onHeaderBackButtonClicked"))), Ad.v.a("topTransitionProgress", kotlin.collections.N.k(Ad.v.a("registrationName", "onTransitionProgress"))), Ad.v.a("topSheetDetentChanged", kotlin.collections.N.k(Ad.v.a("registrationName", "onSheetDetentChanged"))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "RNSScreen";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NotNull C3208t view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction(view);
        view.r();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC2273q
    public /* bridge */ /* synthetic */ void removeAllViews(@NotNull View view) {
        super.removeAllViews(view);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(@NotNull C3208t parent, @NotNull View view) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(view, "view");
        super.removeView(parent, view);
        if (view instanceof C3213y) {
            parent.setFooter(null);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(@NotNull C3208t parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (parent.getChildAt(index) instanceof C3213y) {
            parent.setFooter(null);
        }
        super.removeViewAt(parent, index);
    }

    @Override // p134h7.InterfaceC3510z
    public void setActivityState(@NotNull C3208t view, float activityState) {
        Intrinsics.checkNotNullParameter(view, "view");
        setActivityState(view, (int) activityState);
    }

    @Y6.a(name = "activityState")
    public final void setActivityState(@NotNull C3208t view, int activityState) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (activityState == -1) {
            return;
        }
        if (activityState == 0) {
            view.setActivityState(C3208t.a.INACTIVE);
        } else if (activityState == 1) {
            view.setActivityState(C3208t.a.TRANSITIONING_OR_BELOW_TOP);
        } else {
            if (activityState != 2) {
                return;
            }
            view.setActivityState(C3208t.a.ON_TOP);
        }
    }

    @Override // p134h7.InterfaceC3510z
    public void setCustomAnimationOnSwipe(@Nullable C3208t view, boolean value) {
    }

    @Override // p134h7.InterfaceC3510z
    public void setFullScreenSwipeEnabled(@Nullable C3208t view, boolean value) {
    }

    @Override // p134h7.InterfaceC3510z
    public void setFullScreenSwipeShadowEnabled(@Nullable C3208t view, boolean value) {
    }

    @Override // p134h7.InterfaceC3510z
    @Y6.a(defaultBoolean = true, name = "gestureEnabled")
    public void setGestureEnabled(@NotNull C3208t view, boolean gestureEnabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setGestureEnabled(gestureEnabled);
    }

    @Override // p134h7.InterfaceC3510z
    public void setGestureResponseDistance(@Nullable C3208t view, @Nullable ReadableMap value) {
    }

    @Override // p134h7.InterfaceC3510z
    public void setHideKeyboardOnSwipe(@Nullable C3208t view, boolean value) {
    }

    @Override // p134h7.InterfaceC3510z
    public void setHomeIndicatorHidden(@Nullable C3208t view, boolean value) {
    }

    @Override // p134h7.InterfaceC3510z
    @Y6.a(name = "nativeBackButtonDismissalEnabled")
    public void setNativeBackButtonDismissalEnabled(@NotNull C3208t view, boolean nativeBackButtonDismissalEnabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setNativeBackButtonDismissalEnabled(nativeBackButtonDismissalEnabled);
    }

    @Override // p134h7.InterfaceC3510z
    @InterfaceC0791a
    @Y6.a(customType = "Color", name = "navigationBarColor")
    public void setNavigationBarColor(@NotNull C3208t view, @Nullable Integer navigationBarColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setNavigationBarColor(navigationBarColor);
    }

    @Override // p134h7.InterfaceC3510z
    @Y6.a(name = "navigationBarHidden")
    public void setNavigationBarHidden(@NotNull C3208t view, boolean navigationBarHidden) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setNavigationBarHidden(Boolean.valueOf(navigationBarHidden));
    }

    @Override // p134h7.InterfaceC3510z
    @InterfaceC0791a
    @Y6.a(name = "navigationBarTranslucent")
    public void setNavigationBarTranslucent(@NotNull C3208t view, boolean navigationBarTranslucent) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setNavigationBarTranslucent(Boolean.valueOf(navigationBarTranslucent));
    }

    @Override // p134h7.InterfaceC3510z
    public void setPreventNativeDismiss(@Nullable C3208t view, boolean value) {
    }

    @Override // p134h7.InterfaceC3510z
    @Y6.a(name = "replaceAnimation")
    public void setReplaceAnimation(@NotNull C3208t view, @Nullable String animation) {
        C3208t.c cVar;
        Intrinsics.checkNotNullParameter(view, "view");
        if (animation == null || Intrinsics.b(animation, "pop")) {
            cVar = C3208t.c.POP;
        } else {
            if (!Intrinsics.b(animation, "push")) {
                throw new JSApplicationIllegalArgumentException("Unknown replace animation type " + animation);
            }
            cVar = C3208t.c.PUSH;
        }
        view.setReplaceAnimation(cVar);
    }

    @Override // p134h7.InterfaceC3510z
    public void setScreenId(@NotNull C3208t view, @Nullable String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (value == null || value.length() == 0) {
            value = null;
        }
        view.setScreenId(value);
    }

    @Override // p134h7.InterfaceC3510z
    @Y6.a(name = "screenOrientation")
    public void setScreenOrientation(@NotNull C3208t view, @Nullable String screenOrientation) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setScreenOrientation(screenOrientation);
    }

    @Override // p134h7.InterfaceC3510z
    @Y6.a(name = "sheetAllowedDetents")
    public void setSheetAllowedDetents(@NotNull C3208t view, @Nullable ReadableArray value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.getSheetDetents().clear();
        if (value == null || value.size() == 0) {
            view.getSheetDetents().add(Double.valueOf(1.0d));
        } else {
            kotlin.sequences.k.U(kotlin.sequences.k.N(CollectionsKt.Z(kotlin.ranges.b.f48377d.a(0, value.size() - 1, 1)), new a0(value)), view.getSheetDetents());
        }
    }

    @Override // p134h7.InterfaceC3510z
    @Y6.a(name = "sheetCornerRadius")
    public void setSheetCornerRadius(@NotNull C3208t view, float value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSheetCornerRadius(value);
    }

    @Override // p134h7.InterfaceC3510z
    @Y6.a(name = "sheetElevation")
    public void setSheetElevation(@Nullable C3208t view, int value) {
        if (view != null) {
            view.setSheetElevation(value);
        }
    }

    @Override // p134h7.InterfaceC3510z
    @Y6.a(name = "sheetExpandsWhenScrolledToEdge")
    public void setSheetExpandsWhenScrolledToEdge(@NotNull C3208t view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSheetExpandsWhenScrolledToEdge(value);
    }

    @Override // p134h7.InterfaceC3510z
    @Y6.a(name = "sheetGrabberVisible")
    public void setSheetGrabberVisible(@NotNull C3208t view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSheetGrabberVisible(value);
    }

    @Override // p134h7.InterfaceC3510z
    @Y6.a(name = "sheetInitialDetent")
    public void setSheetInitialDetent(@NotNull C3208t view, int value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSheetInitialDetentIndex(value);
    }

    @Override // p134h7.InterfaceC3510z
    @Y6.a(name = "sheetLargestUndimmedDetent")
    public void setSheetLargestUndimmedDetent(@NotNull C3208t view, int value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (-1 > value || value >= 3) {
            throw new IllegalStateException("[RNScreens] sheetLargestUndimmedDetent on Android supports values between -1 and 2");
        }
        view.setSheetLargestUndimmedDetentIndex(value);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r4.equals("default") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r4.equals("flip") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0083, code lost:
    
        if (r4.equals("simple_push") != false) goto L42;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p134h7.InterfaceC3510z
    @Y6.a(name = "stackAnimation")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStackAnimation(@org.jetbrains.annotations.NotNull com.swmansion.rnscreens.C3208t r3, @org.jetbrains.annotations.Nullable java.lang.String r4) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenViewManager.setStackAnimation(com.swmansion.rnscreens.t, java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r4.equals("fullScreenModal") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r4.equals("containedTransparentModal") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r4.equals("pageSheet") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        if (r4.equals("containedModal") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (r4.equals("modal") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        r4 = com.swmansion.rnscreens.C3208t.e.MODAL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        if (r4.equals("transparentModal") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        r4 = com.swmansion.rnscreens.C3208t.e.TRANSPARENT_MODAL;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p134h7.InterfaceC3510z
    @Y6.a(name = "stackPresentation")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStackPresentation(@org.jetbrains.annotations.NotNull com.swmansion.rnscreens.C3208t r3, @org.jetbrains.annotations.Nullable java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            if (r4 == 0) goto L62
            int r0 = r4.hashCode()
            switch(r0) {
                case -76271493: goto L54;
                case 3452698: goto L49;
                case 104069805: goto L3e;
                case 438078970: goto L35;
                case 872434704: goto L2c;
                case 955284238: goto L23;
                case 1171936146: goto L1a;
                case 1798290171: goto Lf;
                default: goto Le;
            }
        Le:
            goto L62
        Lf:
            java.lang.String r0 = "formSheet"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L62
            com.swmansion.rnscreens.t$e r4 = com.swmansion.rnscreens.C3208t.e.FORM_SHEET
            goto L5e
        L1a:
            java.lang.String r0 = "fullScreenModal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L62
            goto L46
        L23:
            java.lang.String r0 = "containedTransparentModal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L62
            goto L5c
        L2c:
            java.lang.String r0 = "pageSheet"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L62
            goto L46
        L35:
            java.lang.String r0 = "containedModal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L62
            goto L46
        L3e:
            java.lang.String r0 = "modal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L62
        L46:
            com.swmansion.rnscreens.t$e r4 = com.swmansion.rnscreens.C3208t.e.MODAL
            goto L5e
        L49:
            java.lang.String r0 = "push"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L62
            com.swmansion.rnscreens.t$e r4 = com.swmansion.rnscreens.C3208t.e.PUSH
            goto L5e
        L54:
            java.lang.String r0 = "transparentModal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L62
        L5c:
            com.swmansion.rnscreens.t$e r4 = com.swmansion.rnscreens.C3208t.e.TRANSPARENT_MODAL
        L5e:
            r3.setStackPresentation(r4)
            return
        L62:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r3 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown presentation type "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenViewManager.setStackPresentation(com.swmansion.rnscreens.t, java.lang.String):void");
    }

    @Override // p134h7.InterfaceC3510z
    @Y6.a(name = "statusBarAnimation")
    public void setStatusBarAnimation(@NotNull C3208t view, @Nullable String statusBarAnimation) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStatusBarAnimated(Boolean.valueOf((statusBarAnimation == null || Intrinsics.b("none", statusBarAnimation)) ? false : true));
    }

    @Override // p134h7.InterfaceC3510z
    @InterfaceC0791a
    @Y6.a(customType = "Color", name = "statusBarColor")
    public void setStatusBarColor(@NotNull C3208t view, @Nullable Integer statusBarColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStatusBarColor(statusBarColor);
    }

    @Override // p134h7.InterfaceC3510z
    @Y6.a(name = "statusBarHidden")
    public void setStatusBarHidden(@NotNull C3208t view, boolean statusBarHidden) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStatusBarHidden(Boolean.valueOf(statusBarHidden));
    }

    @Override // p134h7.InterfaceC3510z
    @Y6.a(name = "statusBarStyle")
    public void setStatusBarStyle(@NotNull C3208t view, @Nullable String statusBarStyle) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStatusBarStyle(statusBarStyle);
    }

    @Override // p134h7.InterfaceC3510z
    @InterfaceC0791a
    @Y6.a(name = "statusBarTranslucent")
    public void setStatusBarTranslucent(@NotNull C3208t view, boolean statusBarTranslucent) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStatusBarTranslucent(Boolean.valueOf(statusBarTranslucent));
    }

    @Override // p134h7.InterfaceC3510z
    public void setSwipeDirection(@Nullable C3208t view, @Nullable String value) {
    }

    @Override // p134h7.InterfaceC3510z
    public void setTransitionDuration(@Nullable C3208t view, int value) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Object updateState(@NotNull C3208t view, @Nullable com.facebook.react.uimanager.X props, @Nullable InterfaceC2260j0 stateWrapper) {
        Intrinsics.checkNotNullParameter(view, "view");
        return super.updateState(view, props, stateWrapper);
    }
}
