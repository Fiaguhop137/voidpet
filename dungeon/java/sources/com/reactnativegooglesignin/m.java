package com.reactnativegooglesignin;

import com.facebook.react.Z;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class m extends Z {
    public static /* synthetic */ Map c() {
        HashMap map = new HashMap();
        map.put("RNGoogleSignin", new ReactModuleInfo("RNGoogleSignin", "RNGoogleSignin", false, false, true, false, false));
        return map;
    }

    @Override // com.facebook.react.AbstractC2194a, com.facebook.react.P
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new RNGoogleSigninButtonViewManager());
    }

    @Override // com.facebook.react.AbstractC2194a, com.facebook.react.P
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals("RNGoogleSignin")) {
            return new RNGoogleSigninModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC2194a
    public H6.a getReactModuleInfoProvider() {
        return new l();
    }
}
