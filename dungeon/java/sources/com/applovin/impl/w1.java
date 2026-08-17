package com.applovin.impl;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class w1 implements c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z1 f28394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c2 f28395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x1 f28396c;

    public w1(x1 x1Var, z1 z1Var, c2 c2Var) {
        this.f28396c = x1Var;
        this.f28394a = z1Var;
        this.f28395b = c2Var;
    }

    @Override // com.applovin.impl.c2
    public final void a(String str) {
        this.f28396c.a(this.f28394a);
        p1 p1Var = this.f28396c.f28400b;
        if (p1.f28289b) {
            p1Var.a("PersistentPostbackManager", "Successfully submit postback: " + this.f28394a);
        }
        x1 x1Var = this.f28396c;
        synchronized (x1Var.f28403e) {
            try {
                Iterator it = x1Var.f28406h.iterator();
                while (it.hasNext()) {
                    x1Var.a((z1) it.next(), (c2) null);
                }
                x1Var.f28406h.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        x1.a(this.f28395b, str);
    }

    @Override // com.applovin.impl.c2
    public final void a(String str, int i10) {
        p1 p1Var = this.f28396c.f28400b;
        if (p1.f28289b) {
            p1Var.b("PersistentPostbackManager", "Failed to submit postback: " + this.f28394a + " with error code: " + i10 + "; will retry later...");
        }
        x1 x1Var = this.f28396c;
        z1 z1Var = this.f28394a;
        synchronized (x1Var.f28403e) {
            x1Var.f28405g.remove(z1Var);
            x1Var.f28406h.add(z1Var);
        }
        x1.a(this.f28395b, str, i10);
    }
}
