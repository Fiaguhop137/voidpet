package com.swmansion.worklets;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static CallInvokerHolderImpl a(ReactApplicationContext reactApplicationContext) {
        try {
            try {
                return (CallInvokerHolderImpl) reactApplicationContext.getClass().getMethod("getJSCallInvokerHolder", null).invoke(reactApplicationContext, null);
            } catch (Exception e10) {
                throw new RuntimeException("Failed to get JSCallInvokerHolder", e10);
            }
        } catch (Exception unused) {
            Object objInvoke = reactApplicationContext.getClass().getMethod("getCatalystInstance", null).invoke(reactApplicationContext, null);
            return (CallInvokerHolderImpl) objInvoke.getClass().getMethod("getJSCallInvokerHolder", null).invoke(objInvoke, null);
        }
    }
}
