package com.swmansion.gesturehandler.react;

import Ia.AbstractC1098d;
import android.util.Log;
import com.facebook.react.Y;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.soloader.SoLoader;
import com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@G6.a(name = "RNGestureHandlerModule")
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b\u0007\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0001JB\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\u0010\u001a\u00020\u000f\"\b\b\u0000\u0010\b*\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0012\u001a\u00020\u000f\"\b\b\u0000\u0010\b*\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0082 ¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010 \u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b \u0010!J'\u0010$\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001eH\u0017¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020*H\u0017¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000fH\u0017¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u000fH\u0017¢\u0006\u0004\b0\u0010/J\u001f\u00102\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000bH\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020*H\u0017¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000fH\u0016¢\u0006\u0004\b6\u0010/J\u0015\u00108\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u0019¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u0019¢\u0006\u0004\b:\u00109R\u0017\u0010<\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00190F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006K"}, d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule;", "Lcom/swmansion/gesturehandler/NativeRNGestureHandlerModuleSpec;", "LGa/a;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "LIa/d;", "T", "", "handlerName", "", "handlerTag", "Lcom/facebook/react/bridge/ReadableMap;", "config", "", "createGestureHandlerHelper", "(Ljava/lang/String;ILcom/facebook/react/bridge/ReadableMap;)V", "updateGestureHandlerHelper", "(ILcom/facebook/react/bridge/ReadableMap;)V", "", "jsiPtr", "decorateRuntime", "(J)V", "viewTag", "Lcom/swmansion/gesturehandler/react/k;", "findRootHelperForViewAncestor", "(I)Lcom/swmansion/gesturehandler/react/k;", "getName", "()Ljava/lang/String;", "", "handlerTagDouble", "createGestureHandler", "(Ljava/lang/String;DLcom/facebook/react/bridge/ReadableMap;)V", "viewTagDouble", "actionTypeDouble", "attachGestureHandler", "(DDD)V", "updateGestureHandler", "(DLcom/facebook/react/bridge/ReadableMap;)V", "dropGestureHandler", "(D)V", "", "blockNativeResponder", "handleSetJSResponder", "(DZ)V", "handleClearJSResponder", "()V", "flushOperations", "newState", "setGestureHandlerState", "(II)V", "install", "()Z", "invalidate", "root", "registerRootHelper", "(Lcom/swmansion/gesturehandler/react/k;)V", "unregisterRootHelper", "Lcom/swmansion/gesturehandler/react/i;", "registry", "Lcom/swmansion/gesturehandler/react/i;", "getRegistry", "()Lcom/swmansion/gesturehandler/react/i;", "Lcom/swmansion/gesturehandler/react/d;", "eventDispatcher", "Lcom/swmansion/gesturehandler/react/d;", "Lcom/swmansion/gesturehandler/react/f;", "interactionManager", "Lcom/swmansion/gesturehandler/react/f;", "", "roots", "Ljava/util/List;", "Companion", "a", "react-native-gesture-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RNGestureHandlerModule extends NativeRNGestureHandlerModuleSpec implements Ga.a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String NAME = "RNGestureHandlerModule";

    @NotNull
    private final d eventDispatcher;

    @NotNull
    private final f interactionManager;

    @NotNull
    private final i registry;

    @NotNull
    private final List<k> roots;

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public RNGestureHandlerModule(@Nullable ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.registry = new i();
        ReactApplicationContext reactApplicationContext2 = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext2, "getReactApplicationContext(...)");
        this.eventDispatcher = new d(reactApplicationContext2);
        this.interactionManager = new f();
        this.roots = new ArrayList();
    }

    private final <T extends AbstractC1098d> void createGestureHandlerHelper(String handlerName, int handlerTag, ReadableMap config) {
        if (this.registry.h(handlerTag) != null) {
            throw new IllegalStateException("Handler with tag " + handlerTag + " already exists. Please ensure that no Gesture instance is used across multiple GestureDetectors.");
        }
        AbstractC1098d.c cVarB = e.f38877a.b(handlerName);
        if (cVarB == null) {
            throw new JSApplicationIllegalArgumentException("Invalid handler name " + handlerName);
        }
        AbstractC1098d abstractC1098dB = cVarB.b(getReactApplicationContext(), handlerTag);
        abstractC1098dB.E0(this.eventDispatcher);
        this.registry.j(abstractC1098dB);
        this.interactionManager.e(abstractC1098dB, config);
        cVarB.f(abstractC1098dB, config);
    }

    private final native void decorateRuntime(long jsiPtr);

    private final k findRootHelperForViewAncestor(int viewTag) {
        k kVar;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        int iResolveRootTagFromReactTag = a.b(reactApplicationContext).resolveRootTagFromReactTag(viewTag);
        Object obj = null;
        if (iResolveRootTagFromReactTag < 1) {
            return null;
        }
        synchronized (this.roots) {
            try {
                for (Object obj2 : this.roots) {
                    k kVar2 = (k) obj2;
                    if ((kVar2.f() instanceof Y) && ((Y) kVar2.f()).getRootViewTag() == iResolveRootTagFromReactTag) {
                        obj = obj2;
                        break;
                    }
                }
                kVar = (k) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void install$lambda$1(RNGestureHandlerModule rNGestureHandlerModule) {
        try {
            SoLoader.t("gesturehandler");
            JavaScriptContextHolder javaScriptContextHolder = rNGestureHandlerModule.getReactApplicationContext().getJavaScriptContextHolder();
            Intrinsics.c(javaScriptContextHolder);
            rNGestureHandlerModule.decorateRuntime(javaScriptContextHolder.getContext());
        } catch (Exception unused) {
            Log.w("[RNGestureHandler]", "Could not install JSI bindings.");
        }
    }

    private final <T extends AbstractC1098d> void updateGestureHandlerHelper(int handlerTag, ReadableMap config) {
        AbstractC1098d.c cVarA;
        AbstractC1098d abstractC1098dH = this.registry.h(handlerTag);
        if (abstractC1098dH == null || (cVarA = e.f38877a.a(abstractC1098dH)) == null) {
            return;
        }
        this.interactionManager.g(handlerTag);
        this.interactionManager.e(abstractC1098dH, config);
        cVarA.f(abstractC1098dH, config);
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void attachGestureHandler(double handlerTagDouble, double viewTagDouble, double actionTypeDouble) {
        int i10 = (int) handlerTagDouble;
        if (this.registry.c(i10, (int) viewTagDouble, (int) actionTypeDouble)) {
            return;
        }
        throw new JSApplicationIllegalArgumentException("Handler with tag " + i10 + " does not exists");
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void createGestureHandler(@NotNull String handlerName, double handlerTagDouble, @NotNull ReadableMap config) {
        Intrinsics.checkNotNullParameter(handlerName, "handlerName");
        Intrinsics.checkNotNullParameter(config, "config");
        createGestureHandlerHelper(handlerName, (int) handlerTagDouble, config);
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void dropGestureHandler(double handlerTagDouble) {
        int i10 = (int) handlerTagDouble;
        this.interactionManager.g(i10);
        this.registry.g(i10);
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void flushOperations() {
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "RNGestureHandlerModule";
    }

    @NotNull
    public final i getRegistry() {
        return this.registry;
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void handleClearJSResponder() {
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void handleSetJSResponder(double viewTagDouble, boolean blockNativeResponder) {
        int i10 = (int) viewTagDouble;
        k kVarFindRootHelperForViewAncestor = findRootHelperForViewAncestor(i10);
        if (kVarFindRootHelperForViewAncestor != null) {
            kVarFindRootHelperForViewAncestor.g(i10, blockNativeResponder);
        }
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean install() {
        getReactApplicationContext().runOnJSQueueThread(new g(this));
        return true;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.registry.f();
        this.interactionManager.h();
        synchronized (this.roots) {
            while (!this.roots.isEmpty()) {
                try {
                    this.roots.size();
                    this.roots.get(0).j();
                    this.roots.size();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Unit unit = Unit.f48228a;
        }
        super.invalidate();
    }

    public final void registerRootHelper(@NotNull k root) {
        Intrinsics.checkNotNullParameter(root, "root");
        synchronized (this.roots) {
            this.roots.contains(root);
            this.roots.add(root);
        }
    }

    @Override // Ga.a
    public void setGestureHandlerState(int handlerTag, int newState) {
        AbstractC1098d abstractC1098dH = this.registry.h(handlerTag);
        if (abstractC1098dH != null) {
            if (newState == 1) {
                abstractC1098dH.D();
                return;
            }
            if (newState == 2) {
                abstractC1098dH.p();
                return;
            }
            if (newState == 3) {
                abstractC1098dH.q();
            } else if (newState == 4) {
                abstractC1098dH.l(true);
            } else {
                if (newState != 5) {
                    return;
                }
                abstractC1098dH.B();
            }
        }
    }

    public final void unregisterRootHelper(@NotNull k root) {
        Intrinsics.checkNotNullParameter(root, "root");
        synchronized (this.roots) {
            this.roots.remove(root);
        }
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void updateGestureHandler(double handlerTagDouble, @NotNull ReadableMap config) {
        Intrinsics.checkNotNullParameter(config, "config");
        updateGestureHandlerHelper((int) handlerTagDouble, config);
    }
}
