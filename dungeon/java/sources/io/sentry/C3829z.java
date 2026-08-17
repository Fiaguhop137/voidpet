package io.sentry;

import java.io.File;

/* JADX INFO: renamed from: io.sentry.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3829z implements io.sentry.util.l.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B f46707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f46708b;

    public /* synthetic */ C3829z(B b10, File file) {
        this.f46707a = b10;
        this.f46708b = file;
    }

    @Override // io.sentry.util.l.a
    public final void accept(Object obj) {
        B.g(this.f46707a, this.f46708b, (io.sentry.hints.l) obj);
    }
}
