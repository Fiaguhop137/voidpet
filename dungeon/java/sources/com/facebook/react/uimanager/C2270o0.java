package com.facebook.react.uimanager;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.EditText;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.events.EventDispatcher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.react.uimanager.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2270o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2270o0 f30541a = new C2270o0();

    private C2270o0() {
    }

    public static final float[] a(Context context) {
        EditText editText = new EditText(context);
        return new float[]{H.g(androidx.core.view.Z.E(editText)), H.g(androidx.core.view.Z.D(editText)), H.g(editText.getPaddingTop()), H.g(editText.getPaddingBottom())};
    }

    public static final EventDispatcher b(ReactContext context, int i10) {
        Object objB;
        Intrinsics.checkNotNullParameter(context, "context");
        if (context.isBridgeless()) {
            if (context instanceof C2262k0) {
                objB = context;
                objB = ((C2262k0) context).b();
            }
            objB = context;
            Intrinsics.d(objB, "null cannot be cast to non-null type com.facebook.react.uimanager.events.EventDispatcherProvider");
            return ((com.facebook.react.uimanager.events.j) objB).getEventDispatcher();
        }
        UIManager uIManagerH = h(context, i10, false);
        if (uIManagerH == null) {
            ReactSoftExceptionLogger.logSoftException("UIManagerHelper", new ReactNoCrashSoftException("Unable to find UIManager for UIManagerType " + i10));
            return null;
        }
        EventDispatcher eventDispatcher = uIManagerH.getEventDispatcher();
        if (eventDispatcher == null) {
            ReactSoftExceptionLogger.logSoftException("UIManagerHelper", new IllegalStateException("Cannot get EventDispatcher for UIManagerType " + i10));
        }
        return eventDispatcher;
    }

    public static final EventDispatcher c(ReactContext context, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        EventDispatcher eventDispatcherB = b(context, Z6.a.a(i10));
        if (eventDispatcherB == null) {
            ReactSoftExceptionLogger.logSoftException("UIManagerHelper", new IllegalStateException("Cannot get EventDispatcher for reactTag " + i10));
        }
        return eventDispatcherB;
    }

    public static final ReactContext d(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        if (!(context instanceof ReactContext) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        Intrinsics.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        return (ReactContext) context;
    }

    public static final int e(Context context) {
        if (context instanceof C2262k0) {
            return ((C2262k0) context).c();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int f(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view instanceof T) {
            T t10 = (T) view;
            if (t10.getUIManagerType() == 2) {
                return t10.getRootViewTag();
            }
            return -1;
        }
        int id2 = view.getId();
        if (Z6.a.a(id2) == 1) {
            return -1;
        }
        Context context = view.getContext();
        if (!(context instanceof C2262k0) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        int iE = e(context);
        if (iE == -1) {
            ReactSoftExceptionLogger.logSoftException("UIManagerHelper", new IllegalStateException("Fabric View [" + id2 + "] does not have SurfaceId associated with it"));
        }
        return iE;
    }

    public static final UIManager g(ReactContext context, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        return h(context, i10, true);
    }

    private static final UIManager h(ReactContext reactContext, int i10, boolean z10) {
        if (p384v6.a.f56281f || reactContext.isBridgeless()) {
            UIManager fabricUIManager = reactContext.getFabricUIManager();
            if (fabricUIManager != null) {
                return fabricUIManager;
            }
            ReactSoftExceptionLogger.logSoftException("UIManagerHelper", new ReactNoCrashSoftException("Cannot get UIManager because the instance hasn't been initialized yet."));
            return null;
        }
        p348t6.b.a("UIManagerHelper.getUIManager(context, uiManagerType)", p348t6.a.ERROR);
        if (!reactContext.hasCatalystInstance()) {
            ReactSoftExceptionLogger.logSoftException("UIManagerHelper", new ReactNoCrashSoftException("Cannot get UIManager because the context doesn't contain a CatalystInstance."));
            return null;
        }
        if (!reactContext.hasActiveReactInstance()) {
            ReactSoftExceptionLogger.logSoftException("UIManagerHelper", new ReactNoCrashSoftException("Cannot get UIManager because the context doesn't contain an active CatalystInstance."));
            if (z10) {
                return null;
            }
        }
        CatalystInstance catalystInstance = reactContext.getCatalystInstance();
        Intrinsics.checkNotNullExpressionValue(catalystInstance, "getCatalystInstance(...)");
        try {
            return i10 == 2 ? reactContext.getFabricUIManager() : (UIManager) catalystInstance.getNativeModule(UIManagerModule.class);
        } catch (IllegalArgumentException unused) {
            ReactSoftExceptionLogger.logSoftException("UIManagerHelper", new ReactNoCrashSoftException("Cannot get UIManager for UIManagerType: " + i10));
            return (UIManager) catalystInstance.getNativeModule(UIManagerModule.class);
        }
    }

    public static final UIManager i(ReactContext context, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        return g(context, Z6.a.a(i10));
    }
}
