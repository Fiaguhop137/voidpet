package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class I implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K f27527a;

    public /* synthetic */ I(K k10) {
        this.f27527a = k10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        K.a(this.f27527a);
        return null;
    }
}
