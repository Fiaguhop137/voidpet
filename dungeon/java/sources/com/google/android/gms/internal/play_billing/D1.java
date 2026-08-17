package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
public abstract class D1 extends X0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F1 f34434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected F1 f34435b;

    protected D1(F1 f10) {
        this.f34434a = f10;
        if (f10.h()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f34435b = f10.t();
    }

    private static void c(Object obj, Object obj2) {
        C2834j2.a().b(obj.getClass()).f(obj, obj2);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final D1 clone() {
        D1 d10 = (D1) this.f34434a.m(5, null, null);
        d10.f34435b = k();
        return d10;
    }

    public final D1 e(F1 f10) {
        if (!this.f34434a.equals(f10)) {
            if (!this.f34435b.h()) {
                j();
            }
            c(this.f34435b, f10);
        }
        return this;
    }

    public final F1 f() {
        F1 f1K = k();
        if (f1K.p()) {
            return f1K;
        }
        throw new C2873r2(f1K);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2794b2
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public F1 k() {
        if (!this.f34435b.h()) {
            return this.f34435b;
        }
        this.f34435b.B();
        return this.f34435b;
    }

    protected final void h() {
        if (this.f34435b.h()) {
            return;
        }
        j();
    }

    protected void j() {
        F1 f1T = this.f34434a.t();
        c(f1T, this.f34435b);
        this.f34435b = f1T;
    }
}
