package com.google.android.gms.measurement.internal;

import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class C5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ D5 f34934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f34935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ C3032q2 f34936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ Intent f34937d;

    /* synthetic */ C5(D5 d10, int i10, C3032q2 c3032q2, Intent intent) {
        this.f34934a = d10;
        this.f34935b = i10;
        this.f34936c = c3032q2;
        this.f34937d = intent;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        this.f34934a.f(this.f34935b, this.f34936c, this.f34937d);
    }
}
