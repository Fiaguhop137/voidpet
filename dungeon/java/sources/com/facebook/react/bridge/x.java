package com.facebook.react.bridge;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class x implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReadableNativeArray f29502a;

    public /* synthetic */ x(ReadableNativeArray readableNativeArray) {
        this.f29502a = readableNativeArray;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return ReadableNativeArray.localTypeArray_delegate$lambda$1(this.f29502a);
    }
}
