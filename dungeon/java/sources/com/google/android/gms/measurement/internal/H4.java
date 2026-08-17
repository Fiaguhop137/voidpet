package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class H4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ M4 f35032a;

    H4(M4 m10) {
        Objects.requireNonNull(m10);
        this.f35032a = m10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        M4 m10 = this.f35032a;
        m10.f35099e = m10.D();
    }
}
