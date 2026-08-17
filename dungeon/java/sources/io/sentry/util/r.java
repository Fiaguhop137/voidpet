package io.sentry.util;

import io.sentry.ILogger;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements p.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f46577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f46578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ILogger f46579c;

    public /* synthetic */ r(s sVar, String str, ILogger iLogger) {
        this.f46577a = sVar;
        this.f46578b = str;
        this.f46579c = iLogger;
    }

    @Override // io.sentry.util.p.a
    public final Object a() {
        return Boolean.valueOf(this.f46577a.c(this.f46578b, this.f46579c));
    }
}
