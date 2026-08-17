package io.sentry;

import java.io.File;

/* JADX INFO: renamed from: io.sentry.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3739m1 implements io.sentry.util.l.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3749o1 f45983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f45984b;

    public /* synthetic */ C3739m1(C3749o1 c3749o1, File file) {
        this.f45983a = c3749o1;
        this.f45984b = file;
    }

    @Override // io.sentry.util.l.a
    public final void accept(Object obj) {
        C3749o1.f(this.f45983a, this.f45984b, (io.sentry.hints.l) obj);
    }
}
