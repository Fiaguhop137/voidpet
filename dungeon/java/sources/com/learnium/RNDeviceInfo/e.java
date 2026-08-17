package com.learnium.RNDeviceInfo;

import com.facebook.react.bridge.Promise;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Promise f38597a;

    public /* synthetic */ e(Promise promise) {
        this.f38597a = promise;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        return RNDeviceModule.b(this.f38597a, obj, method, objArr);
    }
}
