package io.sentry.react;

import com.facebook.react.Z;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import io.sentry.react.replay.RNSentryReplayMaskManager;
import io.sentry.react.replay.RNSentryReplayUnmaskManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class s extends Z {
    public static /* synthetic */ Map c() {
        HashMap map = new HashMap();
        map.put("RNSentry", new ReactModuleInfo("RNSentry", "RNSentry", false, false, true, false, false));
        return map;
    }

    @Override // com.facebook.react.AbstractC2194a, com.facebook.react.P
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return p146i1.h.a(new Object[]{new RNSentryOnDrawReporterManager(reactApplicationContext), new RNSentryReplayMaskManager(), new RNSentryReplayUnmaskManager()});
    }

    @Override // com.facebook.react.AbstractC2194a, com.facebook.react.P
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if ("RNSentry".equals(str)) {
            return new RNSentryModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC2194a
    public H6.a getReactModuleInfoProvider() {
        return new r();
    }
}
