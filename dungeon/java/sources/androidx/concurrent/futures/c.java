package androidx.concurrent.futures;

import com.google.common.util.concurrent.g;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f22438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        d f22439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private androidx.concurrent.futures.d f22440c = androidx.concurrent.futures.d.E();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f22441d;

        a() {
        }

        private void d() {
            this.f22438a = null;
            this.f22439b = null;
            this.f22440c = null;
        }

        void a() {
            this.f22438a = null;
            this.f22439b = null;
            this.f22440c.A(null);
        }

        public boolean b(Object obj) {
            this.f22441d = true;
            d dVar = this.f22439b;
            boolean z10 = dVar != null && dVar.b(obj);
            if (z10) {
                d();
            }
            return z10;
        }

        public boolean c() {
            this.f22441d = true;
            d dVar = this.f22439b;
            boolean z10 = dVar != null && dVar.a(true);
            if (z10) {
                d();
            }
            return z10;
        }

        public boolean e(Throwable th) {
            this.f22441d = true;
            d dVar = this.f22439b;
            boolean z10 = dVar != null && dVar.c(th);
            if (z10) {
                d();
            }
            return z10;
        }

        protected void finalize() {
            androidx.concurrent.futures.d dVar;
            d dVar2 = this.f22439b;
            if (dVar2 != null && !dVar2.isDone()) {
                dVar2.c(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f22438a));
            }
            if (this.f22441d || (dVar = this.f22440c) == null) {
                return;
            }
            dVar.A(null);
        }
    }

    static final class b extends Throwable {
        b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.c$c, reason: collision with other inner class name */
    public interface InterfaceC0275c {
        Object a(a aVar);
    }

    private static final class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final WeakReference f22442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.concurrent.futures.a f22443b = new a();

        class a extends androidx.concurrent.futures.a {
            a() {
            }

            @Override // androidx.concurrent.futures.a
            protected String x() {
                a aVar = (a) d.this.f22442a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f22438a + "]";
            }
        }

        d(a aVar) {
            this.f22442a = new WeakReference(aVar);
        }

        boolean a(boolean z10) {
            return this.f22443b.cancel(z10);
        }

        boolean b(Object obj) {
            return this.f22443b.A(obj);
        }

        boolean c(Throwable th) {
            return this.f22443b.B(th);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            a aVar = (a) this.f22442a.get();
            boolean zCancel = this.f22443b.cancel(z10);
            if (zCancel && aVar != null) {
                aVar.a();
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.f22443b.get();
        }

        @Override // java.util.concurrent.Future
        public Object get(long j10, TimeUnit timeUnit) {
            return this.f22443b.get(j10, timeUnit);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f22443b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f22443b.isDone();
        }

        @Override // com.google.common.util.concurrent.g
        public void o(Runnable runnable, Executor executor) {
            this.f22443b.o(runnable, executor);
        }

        public String toString() {
            return this.f22443b.toString();
        }
    }

    public static g a(InterfaceC0275c interfaceC0275c) {
        a aVar = new a();
        d dVar = new d(aVar);
        aVar.f22439b = dVar;
        aVar.f22438a = interfaceC0275c.getClass();
        try {
            Object objA = interfaceC0275c.a(aVar);
            if (objA == null) {
                return dVar;
            }
            aVar.f22438a = objA;
            return dVar;
        } catch (Exception e10) {
            dVar.c(e10);
            return dVar;
        }
    }
}
