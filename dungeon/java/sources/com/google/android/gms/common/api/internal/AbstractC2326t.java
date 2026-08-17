package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.C2335d;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2326t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2335d[] f31854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f31855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f31856c;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.t$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private InterfaceC2323p f31857a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private C2335d[] f31859c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f31858b = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f31860d = 0;

        /* synthetic */ a(Z z10) {
        }

        public AbstractC2326t a() {
            p170j8.r.b(this.f31857a != null, "execute parameter required");
            return new Y(this, this.f31859c, this.f31858b, this.f31860d);
        }

        public a b(InterfaceC2323p interfaceC2323p) {
            this.f31857a = interfaceC2323p;
            return this;
        }

        public a c(boolean z10) {
            this.f31858b = z10;
            return this;
        }

        public a d(C2335d... c2335dArr) {
            this.f31859c = c2335dArr;
            return this;
        }

        public a e(int i10) {
            this.f31860d = i10;
            return this;
        }
    }

    protected AbstractC2326t(C2335d[] c2335dArr, boolean z10, int i10) {
        this.f31854a = c2335dArr;
        boolean z11 = false;
        if (c2335dArr != null && z10) {
            z11 = true;
        }
        this.f31855b = z11;
        this.f31856c = i10;
    }

    public static a a() {
        return new a(null);
    }

    protected abstract void b(h8.a.b bVar, TaskCompletionSource taskCompletionSource);

    public boolean c() {
        return this.f31855b;
    }

    public final int d() {
        return this.f31856c;
    }

    public final C2335d[] e() {
        return this.f31854a;
    }
}
