package com.google.firebase.concurrent;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements p.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f37385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f37386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f37387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f37388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f37389e;

    public /* synthetic */ g(o oVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        this.f37385a = oVar;
        this.f37386b = runnable;
        this.f37387c = j10;
        this.f37388d = j11;
        this.f37389e = timeUnit;
    }

    @Override // com.google.firebase.concurrent.p.c
    public final ScheduledFuture a(p.b bVar) {
        o oVar = this.f37385a;
        return oVar.f37411b.scheduleWithFixedDelay(new l(oVar, this.f37386b, bVar), this.f37387c, this.f37388d, this.f37389e);
    }
}
