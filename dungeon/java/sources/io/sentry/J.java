package io.sentry;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class J implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K f44357a;

    public /* synthetic */ J(K k10) {
        this.f44357a = k10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return K.b(this.f44357a);
    }
}
