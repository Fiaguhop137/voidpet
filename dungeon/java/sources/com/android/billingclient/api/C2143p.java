package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;
import p131h4.InterfaceC3459o;
import p131h4.InterfaceC3464u;
import p131h4.InterfaceC3466w;

/* JADX INFO: renamed from: com.android.billingclient.api.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C2143p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3464u f27803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3466w f27804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3459o f27805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b0 f27806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C2142o f27807f = new C2142o(this, true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C2142o f27808g = new C2142o(this, false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f27809h;

    C2143p(Context context, InterfaceC3464u interfaceC3464u, p131h4.N n10, p131h4.C c10, InterfaceC3466w interfaceC3466w, InterfaceC3459o interfaceC3459o, b0 b0Var) {
        this.f27802a = context;
        this.f27803b = interfaceC3464u;
        this.f27804c = interfaceC3466w;
        this.f27805d = interfaceC3459o;
        this.f27806e = b0Var;
    }

    static /* bridge */ /* synthetic */ p131h4.C a(C2143p c2143p) {
        c2143p.getClass();
        return null;
    }

    final InterfaceC3464u e() {
        return this.f27803b;
    }

    final void g() {
        C2142o c2142o = this.f27807f;
        Context context = this.f27802a;
        c2142o.c(context);
        this.f27808g.c(context);
    }

    final void h(boolean z10) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f27809h = z10;
        C2142o c2142o = this.f27808g;
        Context context = this.f27802a;
        c2142o.a(context, intentFilter2);
        if (this.f27809h) {
            this.f27807f.b(context, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
        } else {
            this.f27807f.a(context, intentFilter);
        }
    }
}
