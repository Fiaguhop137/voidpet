package com.google.firebase.concurrent;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements p.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f37380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f37381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f37382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f37383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f37384e;

    public /* synthetic */ f(o oVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        this.f37380a = oVar;
        this.f37381b = runnable;
        this.f37382c = j10;
        this.f37383d = j11;
        this.f37384e = timeUnit;
    }

    @Override // com.google.firebase.concurrent.p.c
    public final ScheduledFuture a(p.b bVar) {
        o oVar = this.f37380a;
        return oVar.f37411b.scheduleAtFixedRate(new i(oVar, this.f37381b, bVar), this.f37382c, this.f37383d, this.f37384e);
    }
}
