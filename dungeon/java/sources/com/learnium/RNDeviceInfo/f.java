package com.learnium.RNDeviceInfo;

import com.facebook.react.bridge.Promise;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Promise f38598a;

    public /* synthetic */ f(Promise promise) {
        this.f38598a = promise;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        return RNDeviceModule.a(this.f38598a, obj, method, objArr);
    }
}
