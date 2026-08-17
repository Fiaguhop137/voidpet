package com.facebook.react.views.switchview;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.B0;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C2262k0;
import com.facebook.react.uimanager.C2270o0;
import com.facebook.react.uimanager.H;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.yoga.p;
import com.facebook.yoga.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p134h7.C3479g;
import p134h7.InterfaceC3481h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u0000 I2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00020\u0004:\u0001JB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\bH\u0017¢\u0006\u0004\b\u001e\u0010\fJ\u001f\u0010 \u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\bH\u0017¢\u0006\u0004\b \u0010\fJ\u001f\u0010\"\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\bH\u0017¢\u0006\u0004\b\"\u0010\fJ\u001f\u0010#\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b#\u0010\fJ!\u0010%\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0004\b%\u0010&J!\u0010'\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0004\b'\u0010&J!\u0010(\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0004\b(\u0010&J!\u0010)\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0004\b)\u0010&J!\u0010*\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0004\b*\u0010&J\u001f\u0010+\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010\fJ\u001f\u0010-\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¢\u0006\u0004\b-\u0010.J\u001f\u00102\u001a\u00020\n2\u0006\u0010/\u001a\u00020\u00022\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\b\u0012\u0004\u0012\u00020\u000204H\u0014¢\u0006\u0004\b5\u00106J_\u0010E\u001a\u00020D2\u0006\u0010\u0016\u001a\u0002072\b\u00109\u001a\u0004\u0018\u0001082\b\u0010:\u001a\u0004\u0018\u0001082\b\u0010;\u001a\u0004\u0018\u0001082\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020<2\u0006\u0010A\u001a\u00020>2\b\u0010C\u001a\u0004\u0018\u00010BH\u0016¢\u0006\u0004\bE\u0010FR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006K"}, d2 = {"Lcom/facebook/react/views/switchview/ReactSwitchManager;", "Lcom/facebook/react/uimanager/BaseViewManager;", "Lcom/facebook/react/views/switchview/a;", "Lcom/facebook/react/views/switchview/d;", "Lh7/h;", "<init>", "()V", "view", "", "value", "", "setValueInternal", "(Lcom/facebook/react/views/switchview/a;Z)V", "", "getName", "()Ljava/lang/String;", "createShadowNodeInstance", "()Lcom/facebook/react/views/switchview/d;", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "Lcom/facebook/react/uimanager/k0;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/k0;)Lcom/facebook/react/views/switchview/a;", "", "backgroundColor", "setBackgroundColor", "(Lcom/facebook/react/views/switchview/a;I)V", "disabled", "setDisabled", "enabled", "setEnabled", "on", "setOn", "setValue", "color", "setThumbTintColor", "(Lcom/facebook/react/views/switchview/a;Ljava/lang/Integer;)V", "setThumbColor", "setTrackColorForFalse", "setTrackColorForTrue", "setTrackTintColor", "setNativeValue", "reactContext", "addEventEmitters", "(Lcom/facebook/react/uimanager/k0;Lcom/facebook/react/views/switchview/a;)V", "root", "", "extraData", "updateExtraData", "(Lcom/facebook/react/views/switchview/a;Ljava/lang/Object;)V", "Lcom/facebook/react/uimanager/B0;", "getDelegate", "()Lcom/facebook/react/uimanager/B0;", "Landroid/content/Context;", "Lcom/facebook/react/bridge/ReadableMap;", "localData", "props", "state", "", "width", "Lcom/facebook/yoga/p;", "widthMode", "height", "heightMode", "", "attachmentsPositions", "", "measure", "(Landroid/content/Context;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;[F)J", "delegate", "Lcom/facebook/react/uimanager/B0;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactSwitchManager extends BaseViewManager<a, d> implements InterfaceC3481h {

    @NotNull
    private static final CompoundButton.OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER = new c();

    @NotNull
    public static final String REACT_CLASS = "AndroidSwitch";

    @NotNull
    private final B0 delegate = new C3479g(this);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ON_CHECKED_CHANGE_LISTENER$lambda$2(CompoundButton buttonView, boolean z10) {
        Intrinsics.checkNotNullParameter(buttonView, "buttonView");
        Context context = buttonView.getContext();
        Intrinsics.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int id2 = buttonView.getId();
        EventDispatcher eventDispatcherC = C2270o0.c(reactContext, id2);
        if (eventDispatcherC != null) {
            eventDispatcherC.d(new b(C2270o0.e(reactContext), id2, z10));
        }
    }

    private final void setValueInternal(a view, boolean value) {
        view.setOnCheckedChangeListener(null);
        view.setOn(value);
        view.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(@NotNull C2262k0 reactContext, @NotNull a view) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public d createShadowNodeInstance() {
        return new d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public a createViewInstance(@NotNull C2262k0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        a aVar = new a(context);
        aVar.setShowText(false);
        return aVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    protected B0 getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "AndroidSwitch";
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public Class<d> getShadowNodeClass() {
        return d.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(@NotNull Context context, @Nullable ReadableMap localData, @Nullable ReadableMap props, @Nullable ReadableMap state, float width, @NotNull p widthMode, float height, @NotNull p heightMode, @Nullable float[] attachmentsPositions) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(widthMode, "widthMode");
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        a aVar = new a(context);
        aVar.setShowText(false);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        aVar.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        return q.a(H.g(aVar.getMeasuredWidth()), H.g(aVar.getMeasuredHeight()));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setBackgroundColor(@NotNull a view, int backgroundColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBackgroundColor(backgroundColor);
    }

    @Override // p134h7.InterfaceC3481h
    @Y6.a(defaultBoolean = false, name = "disabled")
    public void setDisabled(@NotNull a view, boolean disabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setEnabled(!disabled);
    }

    @Override // p134h7.InterfaceC3481h
    @Y6.a(defaultBoolean = true, name = "enabled")
    public void setEnabled(@NotNull a view, boolean enabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setEnabled(enabled);
    }

    @Override // p134h7.InterfaceC3481h
    public void setNativeValue(@NotNull a view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        setValueInternal(view, value);
    }

    @Override // p134h7.InterfaceC3481h
    @Y6.a(name = "on")
    public void setOn(@NotNull a view, boolean on) {
        Intrinsics.checkNotNullParameter(view, "view");
        setValueInternal(view, on);
    }

    @Override // p134h7.InterfaceC3481h
    @Y6.a(customType = "Color", name = "thumbColor")
    public void setThumbColor(@NotNull a view, @Nullable Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setThumbColor(color);
    }

    @Override // p134h7.InterfaceC3481h
    @Y6.a(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(@NotNull a view, @Nullable Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        setThumbColor(view, color);
    }

    @Override // p134h7.InterfaceC3481h
    @Y6.a(customType = "Color", name = "trackColorForFalse")
    public void setTrackColorForFalse(@NotNull a view, @Nullable Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTrackColorForFalse(color);
    }

    @Override // p134h7.InterfaceC3481h
    @Y6.a(customType = "Color", name = "trackColorForTrue")
    public void setTrackColorForTrue(@NotNull a view, @Nullable Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTrackColorForTrue(color);
    }

    @Override // p134h7.InterfaceC3481h
    @Y6.a(customType = "Color", name = "trackTintColor")
    public void setTrackTintColor(@NotNull a view, @Nullable Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTrackColor(color);
    }

    @Override // p134h7.InterfaceC3481h
    @Y6.a(name = "value")
    public void setValue(@NotNull a view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        setValueInternal(view, value);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(@NotNull a root, @NotNull Object extraData) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
    }
}
