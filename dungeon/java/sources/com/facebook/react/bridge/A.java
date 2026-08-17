package com.facebook.react.bridge;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class A implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReadableNativeMap f29487a;

    public /* synthetic */ A(ReadableNativeMap readableNativeMap) {
        this.f29487a = readableNativeMap;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return ReadableNativeMap.localTypeMap_delegate$lambda$3(this.f29487a);
    }
}
