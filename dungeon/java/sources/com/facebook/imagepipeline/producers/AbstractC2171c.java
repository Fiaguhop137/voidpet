package com.facebook.imagepipeline.producers;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2171c implements InterfaceC2182n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f29127a = false;

    public static boolean d(int i10) {
        return (i10 & 1) == 1;
    }

    public static boolean e(int i10) {
        return !d(i10);
    }

    public static int k(boolean z10) {
        return z10 ? 1 : 0;
    }

    public static boolean l(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public static boolean m(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    public static int n(int i10, int i11) {
        return i10 & (~i11);
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC2182n
    public synchronized void a() {
        if (this.f29127a) {
            return;
        }
        this.f29127a = true;
        try {
            f();
        } catch (Exception e10) {
            j(e10);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC2182n
    public synchronized void b(Object obj, int i10) {
        if (this.f29127a) {
            return;
        }
        this.f29127a = d(i10);
        try {
            h(obj, i10);
        } catch (Exception e10) {
            j(e10);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC2182n
    public synchronized void c(float f10) {
        if (this.f29127a) {
            return;
        }
        try {
            i(f10);
        } catch (Exception e10) {
            j(e10);
        }
    }

    protected abstract void f();

    protected abstract void g(Throwable th);

    protected abstract void h(Object obj, int i10);

    protected abstract void i(float f10);

    protected void j(Exception exc) {
        W4.a.M(getClass(), "unhandled exception", exc);
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC2182n
    public synchronized void onFailure(Throwable th) {
        if (this.f29127a) {
            return;
        }
        this.f29127a = true;
        try {
            g(th);
        } catch (Exception e10) {
            j(e10);
        }
    }
}
