package com.google.common.util.concurrent;

import B9.n;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d extends e {

    private static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Future f37331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final c f37332b;

        a(Future future, c cVar) {
            this.f37331a = future;
            this.f37332b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable thA;
            Object obj = this.f37331a;
            if ((obj instanceof G9.a) && (thA = G9.b.a((G9.a) obj)) != null) {
                this.f37332b.onFailure(thA);
                return;
            }
            try {
                this.f37332b.onSuccess(d.b(this.f37331a));
            } catch (ExecutionException e10) {
                this.f37332b.onFailure(e10.getCause());
            } catch (Throwable th) {
                this.f37332b.onFailure(th);
            }
        }

        public String toString() {
            return B9.h.b(this).c(this.f37332b).toString();
        }
    }

    public static void a(g gVar, c cVar, Executor executor) {
        n.j(cVar);
        gVar.o(new a(gVar, cVar), executor);
    }

    public static Object b(Future future) {
        n.q(future.isDone(), "Future was expected to be done: %s", future);
        return l.a(future);
    }
}
