package com.swmansion.reanimated;

import androidx.annotation.NonNull;
import com.facebook.react.AbstractC2194a;
import com.facebook.react.I;
import com.facebook.react.InterfaceC2296w;
import com.facebook.react.P;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ReanimatedUIManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.swmansion.worklets.WorkletsModule;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class ReanimatedPackage extends AbstractC2194a implements P {
    public static /* synthetic */ Map c(Map map) {
        return map;
    }

    private UIManagerModule createUIManager(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_START);
        p381v3.a.c("createUIManagerModule");
        try {
            return ReanimatedUIManagerFactory.create(reactApplicationContext, getReactInstanceManager(reactApplicationContext).I(reactApplicationContext), -1);
        } finally {
            p381v3.a.f();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END);
        }
    }

    @Override // com.facebook.react.AbstractC2194a, com.facebook.react.P
    public NativeModule getModule(@NonNull String str, @NonNull ReactApplicationContext reactApplicationContext) {
        str.getClass();
        switch (str) {
            case "WorkletsModule":
                return new WorkletsModule(reactApplicationContext);
            case "ReanimatedModule":
                return new ReanimatedModule(reactApplicationContext);
            case "UIManager":
                return createUIManager(reactApplicationContext);
            default:
                return null;
        }
    }

    public I getReactInstanceManager(ReactApplicationContext reactApplicationContext) {
        return ((InterfaceC2296w) reactApplicationContext.getApplicationContext()).a().c();
    }

    @Override // com.facebook.react.AbstractC2194a
    public H6.a getReactModuleInfoProvider() {
        Class[] clsArr = {WorkletsModule.class, ReanimatedModule.class, ReanimatedUIManager.class};
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < 3; i10++) {
            Class cls = clsArr[i10];
            G6.a aVar = (G6.a) cls.getAnnotation(G6.a.class);
            Objects.requireNonNull(aVar);
            G6.a aVar2 = aVar;
            map.put(aVar2.name(), new ReactModuleInfo(aVar2.name(), cls.getName(), true, aVar2.needsEagerInit(), aVar2.isCxxModule(), false));
        }
        return new j(map);
    }
}
