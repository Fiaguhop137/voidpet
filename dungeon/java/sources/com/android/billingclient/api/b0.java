package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.D3;
import com.google.android.gms.internal.play_billing.H2;
import com.google.android.gms.internal.play_billing.M2;
import com.google.android.gms.internal.play_billing.U2;
import com.google.android.gms.internal.play_billing.W2;
import com.google.android.gms.internal.play_billing.z3;

/* JADX INFO: loaded from: classes.dex */
interface b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f27604a = 0;

    static {
        com.google.android.gms.internal.play_billing.N.c("com.android.vending.billing.PURCHASES_UPDATED", W2.PURCHASES_UPDATED_ACTION, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", W2.LOCAL_PURCHASES_UPDATED_ACTION, "com.android.vending.billing.ALTERNATIVE_BILLING", W2.ALTERNATIVE_BILLING_ACTION);
    }

    void a(M2 m10, int i10);

    void b(U2 u10);

    void c(H2 h10, long j10, boolean z10);

    void d(H2 h10, int i10, long j10);

    void e(z3 z3Var);

    void f(H2 h10, int i10);

    void g(M2 m10);

    void h(D3 d10);

    void i(M2 m10, long j10, boolean z10);

    void j(H2 h10, int i10, long j10, boolean z10);

    void k(H2 h10);
}
