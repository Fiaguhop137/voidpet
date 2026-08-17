package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class f implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f27866a;

    class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Handler f27867a;

        a(Handler handler) {
            this.f27867a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f27867a.post(runnable);
        }
    }

    private static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n f27869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p f27870b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f27871c;

        public b(n nVar, p pVar, Runnable runnable) {
            this.f27869a = nVar;
            this.f27870b = pVar;
            this.f27871c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f27869a.isCanceled()) {
                this.f27869a.finish("canceled-at-delivery");
                return;
            }
            if (this.f27870b.b()) {
                this.f27869a.deliverResponse(this.f27870b.f27904a);
            } else {
                this.f27869a.deliverError(this.f27870b.f27906c);
            }
            if (this.f27870b.f27907d) {
                this.f27869a.addMarker("intermediate-response");
            } else {
                this.f27869a.finish("done");
            }
            Runnable runnable = this.f27871c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public f(Handler handler) {
        this.f27866a = new a(handler);
    }

    @Override // com.android.volley.q
    public void a(n nVar, p pVar) {
        b(nVar, pVar, null);
    }

    @Override // com.android.volley.q
    public void b(n nVar, p pVar, Runnable runnable) {
        nVar.markDelivered();
        nVar.addMarker("post-response");
        this.f27866a.execute(new b(nVar, pVar, runnable));
    }

    @Override // com.android.volley.q
    public void c(n nVar, u uVar) {
        nVar.addMarker("post-error");
        this.f27866a.execute(new b(nVar, p.a(uVar), null));
    }
}
