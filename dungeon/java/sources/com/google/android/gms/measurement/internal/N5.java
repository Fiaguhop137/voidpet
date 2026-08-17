package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.HandlerC2581r0;

/* JADX INFO: loaded from: classes2.dex */
public final class N5 extends AbstractC2950f2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f35119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f35120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final M5 f35121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final L5 f35122f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final I5 f35123g;

    N5(X2 x10) {
        super(x10);
        this.f35120d = true;
        this.f35121e = new M5(this);
        this.f35122f = new L5(this);
        this.f35123g = new I5(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void q() {
        h();
        if (this.f35119c == null) {
            this.f35119c = new HandlerC2581r0(Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2950f2
    protected final boolean m() {
        return false;
    }

    final void o(boolean z10) {
        h();
        this.f35120d = z10;
    }

    final boolean p() {
        h();
        return this.f35120d;
    }

    final /* synthetic */ void r(long j10) {
        h();
        q();
        X2 x10 = this.f34853a;
        x10.a().w().b("Activity resumed, time", Long.valueOf(j10));
        if (x10.w().H(null, AbstractC2934d2.f35426V0)) {
            if (x10.w().N() || this.f35120d) {
                this.f35122f.a(j10);
            }
        } else if (x10.w().N() || x10.x().f34973t.a()) {
            this.f35122f.a(j10);
        }
        this.f35123g.a();
        M5 m10 = this.f35121e;
        N5 n10 = m10.f35107a;
        n10.h();
        if (n10.f34853a.g()) {
            m10.b(n10.f34853a.e().a(), false);
        }
    }

    final /* synthetic */ void s(long j10) {
        h();
        q();
        X2 x10 = this.f34853a;
        x10.a().w().b("Activity paused, time", Long.valueOf(j10));
        this.f35123g.b(j10);
        if (x10.w().N()) {
            this.f35122f.b(j10);
        }
    }

    final /* synthetic */ Handler t() {
        return this.f35119c;
    }
}
