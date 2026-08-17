package com.google.firebase.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements p.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f37390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Callable f37391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f37392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f37393d;

    public /* synthetic */ h(o oVar, Callable callable, long j10, TimeUnit timeUnit) {
        this.f37390a = oVar;
        this.f37391b = callable;
        this.f37392c = j10;
        this.f37393d = timeUnit;
    }

    @Override // com.google.firebase.concurrent.p.c
    public final ScheduledFuture a(p.b bVar) {
        o oVar = this.f37390a;
        return oVar.f37411b.schedule(new k(oVar, this.f37391b, bVar), this.f37392c, this.f37393d);
    }
}
