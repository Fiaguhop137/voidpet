package com.th3rdwave.safeareacontext;

import com.facebook.react.AbstractC2194a;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends AbstractC2194a {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Map d(Map map) {
        return map;
    }

    @Override // com.facebook.react.AbstractC2194a, com.facebook.react.P
    public List createViewManagers(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return CollectionsKt.o(new SafeAreaProviderManager(), new SafeAreaViewManager());
    }

    @Override // com.facebook.react.AbstractC2194a, com.facebook.react.P
    public NativeModule getModule(String name, ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        if (Intrinsics.b(name, "RNCSafeAreaContext")) {
            return new SafeAreaContextModule(reactContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC2194a
    public H6.a getReactModuleInfoProvider() {
        HashMap map = new HashMap();
        Class cls = new Class[]{SafeAreaContextModule.class}[0];
        G6.a aVar = (G6.a) cls.getAnnotation(G6.a.class);
        if (aVar != null) {
            String strName = aVar.name();
            String strName2 = aVar.name();
            String name = cls.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            map.put(strName, new ReactModuleInfo(strName2, name, true, aVar.needsEagerInit(), aVar.isCxxModule(), false));
        }
        return new d(map);
    }
}
