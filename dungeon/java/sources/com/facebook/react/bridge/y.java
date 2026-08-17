package com.facebook.react.bridge;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReadableNativeMap f29503a;

    public /* synthetic */ y(ReadableNativeMap readableNativeMap) {
        this.f29503a = readableNativeMap;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return ReadableNativeMap.keys_delegate$lambda$1(this.f29503a);
    }
}
