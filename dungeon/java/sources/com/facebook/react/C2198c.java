package com.facebook.react;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.devsupport.LogBoxModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ExceptionsManagerModule;
import com.facebook.react.modules.core.HeadlessJsTaskSupportModule;
import com.facebook.react.modules.core.TimingModule;
import com.facebook.react.modules.debug.DevMenuModule;
import com.facebook.react.modules.debug.DevSettingsModule;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.modules.systeminfo.AndroidInfoModule;
import com.facebook.react.uimanager.K0;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewManager;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.react.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2198c extends AbstractC2194a implements S {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f29505e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I f29506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M6.a f29507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f29508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f29509d;

    /* JADX INFO: renamed from: com.facebook.react.c$a */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.c$b */
    public static final class b implements K0 {
        b() {
        }

        @Override // com.facebook.react.uimanager.K0
        public Collection a() {
            Collection collectionJ = C2198c.this.f29506a.J();
            Intrinsics.checkNotNullExpressionValue(collectionJ, "getViewManagerNames(...)");
            return collectionJ;
        }

        @Override // com.facebook.react.uimanager.K0
        public ViewManager b(String viewManagerName) {
            Intrinsics.checkNotNullParameter(viewManagerName, "viewManagerName");
            return C2198c.this.f29506a.A(viewManagerName);
        }
    }

    static {
        p348t6.b.a("CoreModulesPackage", p348t6.a.ERROR);
    }

    public C2198c(I reactInstanceManager, M6.a hardwareBackBtnHandler, boolean z10, int i10) {
        Intrinsics.checkNotNullParameter(reactInstanceManager, "reactInstanceManager");
        Intrinsics.checkNotNullParameter(hardwareBackBtnHandler, "hardwareBackBtnHandler");
        this.f29506a = reactInstanceManager;
        this.f29507b = hardwareBackBtnHandler;
        this.f29508c = z10;
        this.f29509d = i10;
    }

    private final UIManagerModule createUIManager(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_START);
        p295q7.a.c(0L, "createUIManagerModule");
        try {
            return this.f29508c ? new UIManagerModule(reactApplicationContext, new b(), this.f29509d) : new UIManagerModule(reactApplicationContext, (List<ViewManager>) this.f29506a.I(reactApplicationContext), this.f29509d);
        } finally {
            p295q7.a.i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END);
        }
    }

    private final H6.a e() {
        Class[] clsArr = {AndroidInfoModule.class, DeviceEventManagerModule.class, DeviceInfoModule.class, DevMenuModule.class, DevSettingsModule.class, ExceptionsManagerModule.class, LogBoxModule.class, HeadlessJsTaskSupportModule.class, SourceCodeModule.class, TimingModule.class, UIManagerModule.class};
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < 11; i10++) {
            Class cls = clsArr[i10];
            G6.a aVar = (G6.a) cls.getAnnotation(G6.a.class);
            if (aVar != null) {
                String strName = aVar.name();
                String strName2 = aVar.name();
                String name = cls.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                map.put(strName, new ReactModuleInfo(strName2, name, aVar.canOverrideExistingModule(), aVar.needsEagerInit(), aVar.isCxxModule(), ReactModuleInfo.f29842g.a(cls)));
            }
        }
        return new C2195b(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map f(Map map) {
        return map;
    }

    @Override // com.facebook.react.S
    public void a() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_END);
    }

    @Override // com.facebook.react.S
    public void b() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_START);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.AbstractC2194a, com.facebook.react.P
    public NativeModule getModule(String name, ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        switch (name.hashCode()) {
            case -2013505529:
                if (name.equals("LogBox")) {
                    p456z6.e eVarE = this.f29506a.E();
                    Intrinsics.checkNotNullExpressionValue(eVarE, "getDevSupportManager(...)");
                    return new LogBoxModule(reactContext, eVarE);
                }
                break;
            case -1789797270:
                if (name.equals("Timing")) {
                    p456z6.e eVarE2 = this.f29506a.E();
                    Intrinsics.checkNotNullExpressionValue(eVarE2, "getDevSupportManager(...)");
                    return new TimingModule(reactContext, eVarE2);
                }
                break;
            case -1633589448:
                if (name.equals("DevSettings")) {
                    p456z6.e eVarE3 = this.f29506a.E();
                    Intrinsics.checkNotNullExpressionValue(eVarE3, "getDevSupportManager(...)");
                    return new DevSettingsModule(reactContext, eVarE3);
                }
                break;
            case -1520650172:
                if (name.equals("DeviceInfo")) {
                    return new DeviceInfoModule(reactContext);
                }
                break;
            case -1071344908:
                if (name.equals("DevMenu")) {
                    p456z6.e eVarE4 = this.f29506a.E();
                    Intrinsics.checkNotNullExpressionValue(eVarE4, "getDevSupportManager(...)");
                    return new DevMenuModule(reactContext, eVarE4);
                }
                break;
            case -1037217463:
                if (name.equals("DeviceEventManager")) {
                    return new DeviceEventManagerModule(reactContext, this.f29507b);
                }
                break;
            case -790603268:
                if (name.equals("PlatformConstants")) {
                    return new AndroidInfoModule(reactContext);
                }
                break;
            case 512434409:
                if (name.equals("ExceptionsManager")) {
                    p456z6.e eVarE5 = this.f29506a.E();
                    Intrinsics.checkNotNullExpressionValue(eVarE5, "getDevSupportManager(...)");
                    return new ExceptionsManagerModule(eVarE5);
                }
                break;
            case 881516744:
                if (name.equals("SourceCode")) {
                    return new SourceCodeModule(reactContext);
                }
                break;
            case 1256514152:
                if (name.equals("HeadlessJsTaskSupport")) {
                    return new HeadlessJsTaskSupportModule(reactContext);
                }
                break;
            case 1861242489:
                if (name.equals("UIManager")) {
                    return createUIManager(reactContext);
                }
                break;
        }
        throw new IllegalArgumentException("In CoreModulesPackage, could not find Native module for " + name);
    }

    @Override // com.facebook.react.AbstractC2194a
    public H6.a getReactModuleInfoProvider() throws InvocationTargetException {
        Constructor declaredConstructor;
        if (!p312r6.a.a()) {
            return e();
        }
        try {
            Class clsB = p312r6.a.b("com.facebook.react.CoreModulesPackage$$ReactModuleInfoProvider");
            Object objNewInstance = null;
            if (clsB != null && (declaredConstructor = clsB.getDeclaredConstructor(null)) != null) {
                objNewInstance = declaredConstructor.newInstance(null);
            }
            Intrinsics.d(objNewInstance, "null cannot be cast to non-null type com.facebook.react.module.model.ReactModuleInfoProvider");
            return (H6.a) objNewInstance;
        } catch (ClassNotFoundException unused) {
            return e();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", e11);
        }
    }
}
