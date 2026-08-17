package com.swmansion.rnscreens;

import com.facebook.react.bridge.ReadableArray;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReadableArray f39042a;

    public /* synthetic */ a0(ReadableArray readableArray) {
        this.f39042a = readableArray;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Double.valueOf(this.f39042a.getDouble(((Integer) obj).intValue()));
    }
}
