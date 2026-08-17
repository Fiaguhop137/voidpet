package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f37400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Callable f37401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p.b f37402c;

    public /* synthetic */ k(o oVar, Callable callable, p.b bVar) {
        this.f37400a = oVar;
        this.f37401b = callable;
        this.f37402c = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f37400a.f37410a.submit(new n(this.f37401b, this.f37402c));
    }
}
