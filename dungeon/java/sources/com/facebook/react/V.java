package com.facebook.react;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.CxxModuleWrapper;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class V extends TurboModuleManagerDelegate {

    @NotNull
    private final List<b> moduleProviders;

    @NotNull
    private final Map<b, Map<String, ReactModuleInfo>> packageModuleInfos;
    private final boolean shouldEnableLegacyModuleInterop;

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f29377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ReactApplicationContext f29378b;

        public final V a() {
            ReactApplicationContext reactApplicationContext = this.f29378b;
            if (reactApplicationContext == null) {
                throw new IllegalArgumentException("The ReactApplicationContext must be provided to create ReactPackageTurboModuleManagerDelegate");
            }
            List list = this.f29377a;
            if (list != null) {
                return b(reactApplicationContext, list);
            }
            throw new IllegalArgumentException("A set of ReactPackages must be provided to create ReactPackageTurboModuleManagerDelegate");
        }

        protected abstract V b(ReactApplicationContext reactApplicationContext, List list);

        public final a c(List packages) {
            Intrinsics.checkNotNullParameter(packages, "packages");
            this.f29377a = CollectionsKt.U0(packages);
            return this;
        }

        public final a d(ReactApplicationContext reactApplicationContext) {
            this.f29378b = reactApplicationContext;
            return this;
        }
    }

    public interface b {
        NativeModule getModule(String str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected V(ReactApplicationContext reactApplicationContext, List packages, HybridData hybridData) {
        super(hybridData);
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactApplicationContext");
        Intrinsics.checkNotNullParameter(packages, "packages");
        Intrinsics.checkNotNullParameter(hybridData, "hybridData");
        this.moduleProviders = new ArrayList();
        this.packageModuleInfos = new LinkedHashMap();
        this.shouldEnableLegacyModuleInterop = D6.e.a() && D6.e.d();
        c(reactApplicationContext, packages);
    }

    private final void c(ReactApplicationContext reactApplicationContext, List list) {
        String name;
        ReactModuleInfo reactModuleInfo;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            P p10 = (P) it.next();
            if (p10 instanceof AbstractC2194a) {
                T t10 = new T(p10, reactApplicationContext);
                this.moduleProviders.add(t10);
                this.packageModuleInfos.put(t10, ((AbstractC2194a) p10).getReactModuleInfoProvider().a());
            } else {
                f();
                if (f()) {
                    List<NativeModule> listCreateNativeModules = p10.createNativeModules(reactApplicationContext);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (NativeModule nativeModule : listCreateNativeModules) {
                        Class<?> cls = nativeModule.getClass();
                        G6.a aVar = (G6.a) cls.getAnnotation(G6.a.class);
                        if (aVar == null || (name = aVar.name()) == null) {
                            name = nativeModule.getName();
                            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                        }
                        String str = name;
                        if (aVar != null) {
                            String name2 = cls.getName();
                            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                            reactModuleInfo = new ReactModuleInfo(str, name2, aVar.canOverrideExistingModule(), true, aVar.isCxxModule(), ReactModuleInfo.f29842g.a(cls));
                        } else {
                            String name3 = cls.getName();
                            Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
                            reactModuleInfo = new ReactModuleInfo(str, name3, nativeModule.canOverrideExistingModule(), true, CxxModuleWrapper.class.isAssignableFrom(cls), ReactModuleInfo.f29842g.a(cls));
                        }
                        linkedHashMap2.put(str, reactModuleInfo);
                        linkedHashMap.put(str, nativeModule);
                    }
                    U u10 = new U(linkedHashMap);
                    this.moduleProviders.add(u10);
                    this.packageModuleInfos.put(u10, linkedHashMap2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule d(P p10, ReactApplicationContext reactApplicationContext, String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        return ((AbstractC2194a) p10).getModule(moduleName, reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule e(Map map, String module) {
        Intrinsics.checkNotNullParameter(module, "module");
        return (NativeModule) map.get(module);
    }

    private final boolean f() {
        return unstable_shouldEnableLegacyModuleInterop();
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    @NotNull
    public List<String> getEagerInitModuleNames() {
        Collection<ReactModuleInfo> collectionL;
        List listC = CollectionsKt.c();
        Iterator<b> it = this.moduleProviders.iterator();
        while (it.hasNext()) {
            Map<String, ReactModuleInfo> map = this.packageModuleInfos.get(it.next());
            if (map == null || (collectionL = map.values()) == null) {
                collectionL = CollectionsKt.l();
            }
            for (ReactModuleInfo reactModuleInfo : collectionL) {
                if (reactModuleInfo.d() && reactModuleInfo.f()) {
                    listC.add(reactModuleInfo.e());
                }
            }
        }
        return CollectionsKt.a(listC);
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    @Nullable
    public NativeModule getLegacyModule(@NotNull String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        if (!unstable_shouldEnableLegacyModuleInterop()) {
            return null;
        }
        NativeModule nativeModule = null;
        for (b bVar : this.moduleProviders) {
            Map<String, ReactModuleInfo> map = this.packageModuleInfos.get(bVar);
            ReactModuleInfo reactModuleInfo = map != null ? map.get(moduleName) : null;
            if (reactModuleInfo != null && !reactModuleInfo.d() && (nativeModule == null || reactModuleInfo.a())) {
                NativeModule module = bVar.getModule(moduleName);
                if (module != null) {
                    nativeModule = module;
                }
            }
        }
        if (nativeModule instanceof TurboModule) {
            return null;
        }
        return nativeModule;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    @Nullable
    public TurboModule getModule(@NotNull String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        NativeModule nativeModule = null;
        for (b bVar : this.moduleProviders) {
            Map<String, ReactModuleInfo> map = this.packageModuleInfos.get(bVar);
            ReactModuleInfo reactModuleInfo = map != null ? map.get(moduleName) : null;
            if (reactModuleInfo != null && reactModuleInfo.d() && (nativeModule == null || reactModuleInfo.a())) {
                NativeModule module = bVar.getModule(moduleName);
                if (module != null) {
                    nativeModule = module;
                }
            }
        }
        if (!(nativeModule instanceof TurboModule)) {
            return null;
        }
        Intrinsics.d(nativeModule, "null cannot be cast to non-null type com.facebook.react.turbomodule.core.interfaces.TurboModule");
        return (TurboModule) nativeModule;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public boolean unstable_isLegacyModuleRegistered(@NotNull String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Iterator<b> it = this.moduleProviders.iterator();
        while (it.hasNext()) {
            Map<String, ReactModuleInfo> map = this.packageModuleInfos.get(it.next());
            ReactModuleInfo reactModuleInfo = map != null ? map.get(moduleName) : null;
            if (reactModuleInfo != null && !reactModuleInfo.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public boolean unstable_isModuleRegistered(@NotNull String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Iterator<b> it = this.moduleProviders.iterator();
        while (it.hasNext()) {
            Map<String, ReactModuleInfo> map = this.packageModuleInfos.get(it.next());
            ReactModuleInfo reactModuleInfo = map != null ? map.get(moduleName) : null;
            if (reactModuleInfo != null && reactModuleInfo.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public boolean unstable_shouldEnableLegacyModuleInterop() {
        return this.shouldEnableLegacyModuleInterop;
    }
}
