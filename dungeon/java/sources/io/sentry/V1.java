package io.sentry;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class V1 implements T1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ILogger f44516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f44517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC3787t f44518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ File f44519d;

    public /* synthetic */ V1(ILogger iLogger, String str, AbstractC3787t abstractC3787t, File file) {
        this.f44516a = iLogger;
        this.f44517b = str;
        this.f44518c = abstractC3787t;
        this.f44519d = file;
    }

    @Override // io.sentry.T1
    public final void a() {
        W1.b(this.f44516a, this.f44517b, this.f44518c, this.f44519d);
    }
}
