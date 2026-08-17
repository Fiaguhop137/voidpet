package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class G implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ boolean f31662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f31663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ E f31664c;

    /* synthetic */ G(boolean z10, String str, E e10) {
        this.f31662a = z10;
        this.f31663b = str;
        this.f31664c = e10;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return J.e(this.f31662a, this.f31663b, this.f31664c);
    }
}
