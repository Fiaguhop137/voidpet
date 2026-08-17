package io.sentry.android.core.cache;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.util.l;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements l.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f.a f44861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SentryAndroidOptions f44862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f44863c;

    public /* synthetic */ e(f.a aVar, SentryAndroidOptions sentryAndroidOptions, f fVar) {
        this.f44861a = aVar;
        this.f44862b = sentryAndroidOptions;
        this.f44863c = fVar;
    }

    @Override // io.sentry.util.l.a
    public final void accept(Object obj) {
        f.a.a(this.f44861a, this.f44862b, this.f44863c, obj);
    }
}
