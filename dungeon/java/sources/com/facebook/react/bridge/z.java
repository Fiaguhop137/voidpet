package com.facebook.react.bridge;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReadableNativeMap f29504a;

    public /* synthetic */ z(ReadableNativeMap readableNativeMap) {
        this.f29504a = readableNativeMap;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return ReadableNativeMap.localMap_delegate$lambda$2(this.f29504a);
    }
}
