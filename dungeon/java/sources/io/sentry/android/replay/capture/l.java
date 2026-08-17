package io.sentry.android.replay.capture;

import io.sentry.android.replay.s;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f45417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f45418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f45419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f45420d;

    public /* synthetic */ l(m mVar, Function2 function2, long j10, s sVar) {
        this.f45417a = mVar;
        this.f45418b = function2;
        this.f45419c = j10;
        this.f45420d = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m.K(this.f45417a, this.f45418b, this.f45419c, this.f45420d);
    }
}
