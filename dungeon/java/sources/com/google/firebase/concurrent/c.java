package com.google.firebase.concurrent;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements p.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f37372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f37373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f37374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f37375d;

    public /* synthetic */ c(o oVar, Runnable runnable, long j10, TimeUnit timeUnit) {
        this.f37372a = oVar;
        this.f37373b = runnable;
        this.f37374c = j10;
        this.f37375d = timeUnit;
    }

    @Override // com.google.firebase.concurrent.p.c
    public final ScheduledFuture a(p.b bVar) {
        o oVar = this.f37372a;
        return oVar.f37411b.schedule(new j(oVar, this.f37373b, bVar), this.f37374c, this.f37375d);
    }
}
