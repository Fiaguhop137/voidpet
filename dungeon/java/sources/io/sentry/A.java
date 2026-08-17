package io.sentry;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class A implements io.sentry.util.l.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B f44186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f44187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ File f44188c;

    public /* synthetic */ A(B b10, Throwable th, File file) {
        this.f44186a = b10;
        this.f44187b = th;
        this.f44188c = file;
    }

    @Override // io.sentry.util.l.a
    public final void accept(Object obj) {
        B.h(this.f44186a, this.f44187b, this.f44188c, (io.sentry.hints.l) obj);
    }
}
