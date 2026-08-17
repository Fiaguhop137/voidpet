package io.sentry;

import java.io.File;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class M2 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ File f44407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3774r1 f44408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ X f44409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3703f0 f44410d;

    public /* synthetic */ M2(File file, C3774r1 c3774r1, X x10, InterfaceC3703f0 interfaceC3703f0) {
        this.f44407a = file;
        this.f44408b = c3774r1;
        this.f44409c = x10;
        this.f44410d = interfaceC3703f0;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return T2.x(this.f44407a, this.f44408b, this.f44409c, this.f44410d);
    }
}
