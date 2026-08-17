package com.margelo.nitro.core;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Promise.OnResolvedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f38616a;

    public /* synthetic */ c(Function1 function1) {
        this.f38616a = function1;
    }

    @Override // com.margelo.nitro.core.Promise.OnResolvedCallback
    public final void onResolved(Object obj) {
        Promise.then$lambda$0(this.f38616a, obj);
    }
}
