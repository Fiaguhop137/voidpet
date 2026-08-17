package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class F4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f34998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ E4 f34999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ E4 f35000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f35001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ M4 f35002e;

    F4(M4 m10, Bundle bundle, E4 e10, E4 e11, long j10) {
        this.f34998a = bundle;
        this.f34999b = e10;
        this.f35000c = e11;
        this.f35001d = j10;
        Objects.requireNonNull(m10);
        this.f35002e = m10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35002e.A(this.f34998a, this.f34999b, this.f35000c, this.f35001d);
    }
}
