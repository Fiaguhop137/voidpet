package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
public final class L3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object f34473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    P3 f34474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private R3 f34475c = R3.h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f34476d;

    L3() {
    }

    final void a() {
        this.f34473a = null;
        this.f34474b = null;
        this.f34475c.c(null);
    }

    public final boolean b(Object obj) {
        this.f34476d = true;
        P3 p10 = this.f34474b;
        boolean z10 = p10 != null && p10.a(obj);
        if (z10) {
            this.f34473a = null;
            this.f34474b = null;
            this.f34475c = null;
        }
        return z10;
    }

    protected final void finalize() {
        R3 r10;
        P3 p10 = this.f34474b;
        if (p10 != null && !p10.isDone()) {
            p10.b(new M3("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.f34473a))));
        }
        if (this.f34476d || (r10 = this.f34475c) == null) {
            return;
        }
        r10.c(null);
    }
}
