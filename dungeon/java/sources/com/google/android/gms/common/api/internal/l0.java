package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class l0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC2317j f31845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f31846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ m0 f31847c;

    l0(m0 m0Var, AbstractC2317j abstractC2317j, String str) {
        this.f31845a = abstractC2317j;
        this.f31846b = str;
        Objects.requireNonNull(m0Var);
        this.f31847c = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        m0 m0Var = this.f31847c;
        if (m0Var.k() > 0) {
            AbstractC2317j abstractC2317j = this.f31845a;
            if (m0Var.l() != null) {
                bundle = m0Var.l().getBundle(this.f31846b);
            } else {
                bundle = null;
            }
            abstractC2317j.onCreate(bundle);
        }
        if (m0Var.k() >= 2) {
            this.f31845a.onStart();
        }
        if (m0Var.k() >= 3) {
            this.f31845a.onResume();
        }
        if (m0Var.k() >= 4) {
            this.f31845a.onStop();
        }
        if (m0Var.k() >= 5) {
            this.f31845a.onDestroy();
        }
    }
}
