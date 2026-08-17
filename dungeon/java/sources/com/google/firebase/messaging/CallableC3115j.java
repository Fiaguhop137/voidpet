package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.firebase.messaging.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC3115j implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f37627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f37628b;

    public /* synthetic */ CallableC3115j(Context context, Intent intent) {
        this.f37627a = context;
        this.f37628b = intent;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Integer.valueOf(Y.b().g(this.f37627a, this.f37628b));
    }
}
