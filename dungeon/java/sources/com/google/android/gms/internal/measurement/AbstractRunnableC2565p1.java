package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractRunnableC2565p1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final long f33074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f33075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f33076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2651z1 f33077d;

    AbstractRunnableC2565p1(C2651z1 c2651z1, boolean z10) {
        Objects.requireNonNull(c2651z1);
        this.f33077d = c2651z1;
        this.f33074a = c2651z1.f33273b.a();
        this.f33075b = c2651z1.f33273b.c();
        this.f33076c = z10;
    }

    abstract void a();

    protected void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f33077d.m()) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e10) {
            this.f33077d.k(e10, false, this.f33076c);
            b();
        }
    }
}
