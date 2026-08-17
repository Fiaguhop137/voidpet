package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class r0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f29244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f29245b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f29248e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ConcurrentLinkedQueue f29247d = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29246c = 0;

    private class a extends AbstractC2187t {

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.r0$a$a, reason: collision with other inner class name */
        class RunnableC0371a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Pair f29250a;

            RunnableC0371a(Pair pair) {
                this.f29250a = pair;
            }

            @Override // java.lang.Runnable
            public void run() {
                r0 r0Var = r0.this;
                Pair pair = this.f29250a;
                r0Var.g((InterfaceC2182n) pair.first, (e0) pair.second);
            }
        }

        private a(InterfaceC2182n interfaceC2182n) {
            super(interfaceC2182n);
        }

        /* synthetic */ a(r0 r0Var, InterfaceC2182n interfaceC2182n, s0 s0Var) {
            this(interfaceC2182n);
        }

        private void p() {
            Pair pair;
            synchronized (r0.this) {
                try {
                    pair = (Pair) r0.this.f29247d.poll();
                    if (pair == null) {
                        r0.this.f29246c--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (pair != null) {
                r0.this.f29248e.execute(new RunnableC0371a(pair));
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC2187t, com.facebook.imagepipeline.producers.AbstractC2171c
        protected void f() {
            o().a();
            p();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC2187t, com.facebook.imagepipeline.producers.AbstractC2171c
        protected void g(Throwable th) {
            o().onFailure(th);
            p();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC2171c
        protected void h(Object obj, int i10) {
            o().b(obj, i10);
            if (AbstractC2171c.d(i10)) {
                p();
            }
        }
    }

    public r0(int i10, Executor executor, d0 d0Var) {
        this.f29245b = i10;
        this.f29248e = (Executor) V4.k.g(executor);
        this.f29244a = (d0) V4.k.g(d0Var);
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC2182n interfaceC2182n, e0 e0Var) {
        boolean z10;
        e0Var.h().d(e0Var, "ThrottlingProducer");
        synchronized (this) {
            try {
                int i10 = this.f29246c;
                z10 = true;
                if (i10 >= this.f29245b) {
                    this.f29247d.add(Pair.create(interfaceC2182n, e0Var));
                } else {
                    this.f29246c = i10 + 1;
                    z10 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            return;
        }
        g(interfaceC2182n, e0Var);
    }

    void g(InterfaceC2182n interfaceC2182n, e0 e0Var) {
        e0Var.h().j(e0Var, "ThrottlingProducer", null);
        this.f29244a.b(new a(this, interfaceC2182n, null), e0Var);
    }
}
