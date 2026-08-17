package com.google.android.gms.measurement.internal;

import android.content.Context;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import p170j8.AbstractC3857w;
import p170j8.C3850o;
import p170j8.C3856v;
import p170j8.C3859y;
import p170j8.InterfaceC3858x;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.m2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3004m2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static C3004m2 f35667d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X2 f35668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3858x f35669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicLong f35670c = new AtomicLong(-1);

    private C3004m2(Context context, X2 x10) {
        this.f35669b = AbstractC3857w.b(context, C3859y.a().b("measurement:api").a());
        this.f35668a = x10;
    }

    static C3004m2 a(X2 x10) {
        if (f35667d == null) {
            f35667d = new C3004m2(x10.d(), x10);
        }
        return f35667d;
    }

    public final synchronized void b(int i10, int i11, long j10, long j11, int i12) {
        long jC = this.f35668a.e().c();
        AtomicLong atomicLong = this.f35670c;
        if (atomicLong.get() != -1 && jC - atomicLong.get() <= 1800000) {
            return;
        }
        this.f35669b.d(new C3856v(0, Arrays.asList(new C3850o(36301, i11, 0, j10, j11, null, null, 0, i12)))).addOnFailureListener(new C2997l2(this, jC));
    }

    final /* synthetic */ void c(long j10, Exception exc) {
        this.f35670c.set(j10);
    }
}
