package Ha;

import Ad.j;
import Ad.v;
import com.facebook.react.AbstractC2194a;
import com.facebook.react.a0;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import com.swmansion.gesturehandler.react.RNGestureHandlerRootViewManager;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.collections.N;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends AbstractC2194a implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lazy f4277a = j.b(new a());

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map g() {
        Annotation annotation = RNGestureHandlerModule.class.getAnnotation(G6.a.class);
        Intrinsics.c(annotation);
        G6.a aVar = (G6.a) annotation;
        String strName = aVar.name();
        String name = RNGestureHandlerModule.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return N.m(v.a("RNGestureHandlerModule", new ReactModuleInfo(strName, name, aVar.canOverrideExistingModule(), aVar.needsEagerInit(), aVar.isCxxModule(), true)));
    }

    private final Map h() {
        return (Map) this.f4277a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map i() {
        ModuleSpec.Companion companion = ModuleSpec.INSTANCE;
        return N.l(v.a("RNGestureHandlerRootView", companion.viewManagerSpec(new c())), v.a("RNGestureHandlerButton", companion.viewManagerSpec(new d())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule j() {
        return new RNGestureHandlerRootViewManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule k() {
        return new RNGestureHandlerButtonViewManager();
    }

    @Override // com.facebook.react.a0
    public ViewManager createViewManager(ReactApplicationContext reactContext, String viewManagerName) {
        Provider provider;
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(viewManagerName, "viewManagerName");
        ModuleSpec moduleSpec = (ModuleSpec) h().get(viewManagerName);
        NativeModule nativeModule = (moduleSpec == null || (provider = moduleSpec.provider()) == null) ? null : (NativeModule) provider.get();
        if (nativeModule instanceof ViewManager) {
            return (ViewManager) nativeModule;
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC2194a, com.facebook.react.P
    public List createViewManagers(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return CollectionsKt.o(new RNGestureHandlerRootViewManager(), new RNGestureHandlerButtonViewManager());
    }

    @Override // com.facebook.react.AbstractC2194a, com.facebook.react.P
    public NativeModule getModule(String name, ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        if (Intrinsics.b(name, "RNGestureHandlerModule")) {
            return new RNGestureHandlerModule(reactContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC2194a
    public H6.a getReactModuleInfoProvider() throws InvocationTargetException {
        try {
            Object objNewInstance = Class.forName("com.swmansion.gesturehandler.RNGestureHandlerPackage$$ReactModuleInfoProvider").getDeclaredConstructor(null).newInstance(null);
            Intrinsics.d(objNewInstance, "null cannot be cast to non-null type com.facebook.react.module.model.ReactModuleInfoProvider");
            return (H6.a) objNewInstance;
        } catch (ClassNotFoundException unused) {
            return new b();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("No ReactModuleInfoProvider for RNGestureHandlerPackage$$ReactModuleInfoProvider", e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("No ReactModuleInfoProvider for RNGestureHandlerPackage$$ReactModuleInfoProvider", e11);
        }
    }

    @Override // com.facebook.react.a0
    public List getViewManagerNames(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return CollectionsKt.U0(h().keySet());
    }

    @Override // com.facebook.react.AbstractC2194a
    protected List getViewManagers(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return CollectionsKt.W0(h().values());
    }
}
