package com.airbnb.android.react.lottie;

import R3.C1363j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f27476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f27478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1363j f27479d;

    public /* synthetic */ e(boolean z10, int i10, int i11, C1363j c1363j) {
        this.f27476a = z10;
        this.f27477b = i10;
        this.f27478c = i11;
        this.f27479d = c1363j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g.k(this.f27476a, this.f27477b, this.f27478c, this.f27479d);
    }
}
