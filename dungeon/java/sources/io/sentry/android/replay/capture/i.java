package io.sentry.android.replay.capture;

import io.sentry.android.replay.s;
import io.sentry.protocol.x;
import java.util.Date;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f45410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f45411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Date f45412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f45413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f45414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function1 f45415f;

    public /* synthetic */ i(m mVar, long j10, Date date, x xVar, s sVar, Function1 function1) {
        this.f45410a = mVar;
        this.f45411b = j10;
        this.f45412c = date;
        this.f45413d = xVar;
        this.f45414e = sVar;
        this.f45415f = function1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m.J(this.f45410a, this.f45411b, this.f45412c, this.f45413d, this.f45414e, this.f45415f);
    }
}
