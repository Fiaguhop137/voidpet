package Da;

import com.facebook.react.AbstractC2194a;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.margelo.nitro.NitroModules;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends AbstractC2194a {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Map d() {
        HashMap map = new HashMap();
        map.put("NitroModules", new ReactModuleInfo("NitroModules", "NitroModules", false, false, false, false));
        return map;
    }

    @Override // com.facebook.react.AbstractC2194a, com.facebook.react.P
    public NativeModule getModule(String name, ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        if (Intrinsics.b(name, "NitroModules")) {
            return new NitroModules(reactContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC2194a
    public H6.a getReactModuleInfoProvider() {
        return new b();
    }
}
