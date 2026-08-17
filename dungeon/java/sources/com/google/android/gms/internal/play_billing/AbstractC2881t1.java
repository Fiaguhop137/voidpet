package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2881t1 extends AbstractC2803d1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f34807b = AbstractC2906z2.C();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f34808c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object f34809a;

    /* synthetic */ AbstractC2881t1(AbstractC2877s1 abstractC2877s1) {
    }

    public static int s(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int t(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public final void a() {
        if (c() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract int c();

    public abstract void d(byte b10);

    public abstract void e(int i10, boolean z10);

    public abstract void f(int i10, AbstractC2843l1 abstractC2843l1);

    public abstract void g(int i10, int i11);

    public abstract void h(int i10);

    public abstract void i(int i10, long j10);

    public abstract void j(long j10);

    public abstract void k(int i10, int i11);

    public abstract void l(int i10);

    public abstract void m(int i10, String str);

    public abstract void n(int i10, int i11);

    public abstract void o(int i10, int i11);

    public abstract void p(int i10);

    public abstract void q(int i10, long j10);

    public abstract void r(long j10);
}
