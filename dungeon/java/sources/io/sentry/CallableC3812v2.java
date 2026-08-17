package io.sentry;

import java.io.File;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: io.sentry.v2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC3812v2 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ File f46627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f46628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3811v1 f46629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3703f0 f46630d;

    public /* synthetic */ CallableC3812v2(File file, long j10, C3811v1 c3811v1, InterfaceC3703f0 interfaceC3703f0) {
        this.f46627a = file;
        this.f46628b = j10;
        this.f46629c = c3811v1;
        this.f46630d = interfaceC3703f0;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return T2.p(this.f46627a, this.f46628b, this.f46629c, this.f46630d);
    }
}
