package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC3070w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3 f35917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC3077x f35918b;

    RunnableC3070w(AbstractC3077x abstractC3077x, C3 c10) {
        this.f35917a = c10;
        Objects.requireNonNull(abstractC3077x);
        this.f35918b = abstractC3077x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3 c10 = this.f35917a;
        c10.c();
        if (C2947f.a()) {
            c10.b().t(this);
            return;
        }
        AbstractC3077x abstractC3077x = this.f35918b;
        boolean zC = abstractC3077x.c();
        abstractC3077x.e(0L);
        if (zC) {
            abstractC3077x.a();
        }
    }
}
