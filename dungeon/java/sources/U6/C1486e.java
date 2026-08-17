package U6;

import com.facebook.react.AbstractC2194a;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.LogBoxModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ExceptionsManagerModule;
import com.facebook.react.modules.debug.DevMenuModule;
import com.facebook.react.modules.debug.DevSettingsModule;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.modules.systeminfo.AndroidInfoModule;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: U6.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1486e extends AbstractC2194a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p456z6.e f13261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M6.a f13262b;

    public C1486e(p456z6.e devSupportManager, M6.a hardwareBackBtnHandler) {
        Intrinsics.checkNotNullParameter(devSupportManager, "devSupportManager");
        Intrinsics.checkNotNullParameter(hardwareBackBtnHandler, "hardwareBackBtnHandler");
        this.f13261a = devSupportManager;
        this.f13262b = hardwareBackBtnHandler;
    }

    private final H6.a d() {
        Class[] clsArr = {AndroidInfoModule.class, DeviceInfoModule.class, SourceCodeModule.class, DevMenuModule.class, DevSettingsModule.class, DeviceEventManagerModule.class, LogBoxModule.class, ExceptionsManagerModule.class};
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < 8; i10++) {
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
        return new C1485d(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map e(Map map) {
        return map;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.AbstractC2194a, com.facebook.react.P
    public NativeModule getModule(String name, ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        switch (name.hashCode()) {
            case -2013505529:
                if (name.equals("LogBox")) {
                    return new LogBoxModule(reactContext, this.f13261a);
                }
                return null;
            case -1633589448:
                if (name.equals("DevSettings")) {
                    return new DevSettingsModule(reactContext, this.f13261a);
                }
                return null;
            case -1520650172:
                if (name.equals("DeviceInfo")) {
                    return new DeviceInfoModule(reactContext);
                }
                return null;
            case -1071344908:
                if (name.equals("DevMenu")) {
                    return new DevMenuModule(reactContext, this.f13261a);
                }
                return null;
            case -1037217463:
                if (name.equals("DeviceEventManager")) {
                    return new DeviceEventManagerModule(reactContext, this.f13262b);
                }
                return null;
            case -790603268:
                if (name.equals("PlatformConstants")) {
                    return new AndroidInfoModule(reactContext);
                }
                return null;
            case 512434409:
                if (name.equals("ExceptionsManager")) {
                    return new ExceptionsManagerModule(this.f13261a);
                }
                return null;
            case 881516744:
                if (name.equals("SourceCode")) {
                    return new SourceCodeModule(reactContext);
                }
                return null;
            default:
                return null;
        }
    }

    @Override // com.facebook.react.AbstractC2194a
    public H6.a getReactModuleInfoProvider() throws Exception {
        if (!p312r6.a.a()) {
            return d();
        }
        try {
            Class clsB = p312r6.a.b(C1486e.class.getName() + "$$ReactModuleInfoProvider");
            Object objNewInstance = clsB != null ? clsB.newInstance() : null;
            H6.a aVar = objNewInstance instanceof H6.a ? (H6.a) objNewInstance : null;
            return aVar == null ? d() : aVar;
        } catch (Exception e10) {
            if (e10 instanceof ClassNotFoundException) {
                return d();
            }
            if (!(e10 instanceof InstantiationException) && !(e10 instanceof IllegalAccessException)) {
                throw e10;
            }
            throw new RuntimeException("No ReactModuleInfoProvider for " + C1486e.class.getName() + "$$ReactModuleInfoProvider", e10);
        }
    }
}
