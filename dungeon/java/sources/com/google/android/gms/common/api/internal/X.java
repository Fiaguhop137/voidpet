package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.C2333b;
import java.util.Set;
import p170j8.C3840e;

/* JADX INFO: loaded from: classes2.dex */
public final class X extends W8.d implements h8.f.a, h8.f.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final p135h8.a.AbstractC0496a f31787l = V8.d.f14238c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f31788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Handler f31789f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p135h8.a.AbstractC0496a f31790g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set f31791h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C3840e f31792i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private V8.e f31793j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private W f31794k;

    public X(Context context, Handler handler, C3840e c3840e) {
        p135h8.a.AbstractC0496a abstractC0496a = f31787l;
        this.f31788e = context;
        this.f31789f = handler;
        this.f31792i = (C3840e) p170j8.r.m(c3840e, "ClientSettings must not be null");
        this.f31791h = c3840e.h();
        this.f31790g = abstractC0496a;
    }

    static /* bridge */ /* synthetic */ void e1(X x10, W8.l lVar) {
        C2333b c2333bA4 = lVar.a4();
        if (c2333bA4.f4()) {
            p170j8.T t10 = (p170j8.T) p170j8.r.l(lVar.b4());
            C2333b c2333bA5 = t10.a4();
            if (!c2333bA5.f4()) {
                String strValueOf = String.valueOf(c2333bA5);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                x10.f31794k.b(c2333bA5);
                x10.f31793j.k();
                return;
            }
            x10.f31794k.c(t10.b4(), x10.f31791h);
        } else {
            x10.f31794k.b(c2333bA4);
        }
        x10.f31793j.k();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [V8.e, h8.a$f] */
    public final void f1(W w10) {
        V8.e eVar = this.f31793j;
        if (eVar != null) {
            eVar.k();
        }
        this.f31792i.m(Integer.valueOf(System.identityHashCode(this)));
        p135h8.a.AbstractC0496a abstractC0496a = this.f31790g;
        Context context = this.f31788e;
        Handler handler = this.f31789f;
        C3840e c3840e = this.f31792i;
        this.f31793j = abstractC0496a.b(context, handler.getLooper(), c3840e, c3840e.j(), this, this);
        this.f31794k = w10;
        Set set = this.f31791h;
        if (set == null || set.isEmpty()) {
            this.f31789f.post(new U(this));
        } else {
            this.f31793j.g();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC2313f
    public final void g(Bundle bundle) {
        this.f31793j.l(this);
    }

    public final void g1() {
        V8.e eVar = this.f31793j;
        if (eVar != null) {
            eVar.k();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC2313f
    public final void h(int i10) {
        this.f31794k.d(i10);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC2321n
    public final void k(C2333b c2333b) {
        this.f31794k.b(c2333b);
    }

    @Override // W8.f
    public final void l0(W8.l lVar) {
        this.f31789f.post(new V(this, lVar));
    }
}
