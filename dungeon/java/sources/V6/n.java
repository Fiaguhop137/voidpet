package V6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements A6.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f14133g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Executor f14134h = c.f14114c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Executor f14135i = c.f14113b;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final n f14136j = new n((Object) null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final n f14137k = new n(Boolean.TRUE);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final n f14138l = new n(Boolean.FALSE);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final n f14139m = new n(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f14141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f14142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f14143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Exception f14144e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f14140a = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f14145f = new ArrayList();

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(Callable callable, o oVar) {
            j jVar = new j(oVar);
            try {
                n nVar = (n) callable.call();
                synchronized (nVar.f14140a) {
                    try {
                        if (nVar.u()) {
                            Intrinsics.c(nVar);
                            jVar.a(nVar);
                        } else {
                            nVar.f14145f.add(jVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (CancellationException unused) {
                oVar.b();
            } catch (Exception e10) {
                oVar.c(e10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit j(o oVar, n task) {
            Intrinsics.checkNotNullParameter(task, "task");
            if (task.t()) {
                oVar.b();
            } else if (task.v()) {
                oVar.c(task.r());
            } else {
                oVar.d(task.s());
            }
            return Unit.f48228a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void l(o oVar, V6.a aVar, n nVar, Executor executor) {
            try {
                executor.execute(new l(aVar, nVar, oVar));
            } catch (Exception e10) {
                oVar.c(new b(e10));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(V6.a aVar, n nVar, o oVar) {
            try {
                n nVar2 = (n) aVar.a(nVar);
                if (nVar2 == null) {
                    oVar.d(null);
                } else {
                    n.m(nVar2, new m(oVar), null, 2, null);
                }
            } catch (CancellationException unused) {
                oVar.b();
            } catch (Exception e10) {
                oVar.c(e10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit n(o oVar, n task) {
            Intrinsics.checkNotNullParameter(task, "task");
            if (task.t()) {
                oVar.b();
            } else if (task.v()) {
                oVar.c(task.r());
            } else {
                oVar.d(task.s());
            }
            return Unit.f48228a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void o(o oVar, V6.a aVar, n nVar, Executor executor) {
            try {
                executor.execute(new k(aVar, nVar, oVar));
            } catch (Exception e10) {
                oVar.c(new b(e10));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void p(V6.a aVar, n nVar, o oVar) {
            try {
                oVar.d(aVar.a(nVar));
            } catch (CancellationException unused) {
                oVar.b();
            } catch (Exception e10) {
                oVar.c(e10);
            }
        }

        public final n h(Callable callable, Executor executor) {
            Intrinsics.checkNotNullParameter(callable, "callable");
            Intrinsics.checkNotNullParameter(executor, "executor");
            o oVar = new o();
            try {
                executor.execute(new i(callable, oVar));
            } catch (Exception e10) {
                oVar.c(new b(e10));
            }
            return oVar.a();
        }

        public final n k() {
            n nVar = n.f14139m;
            Intrinsics.d(nVar, "null cannot be cast to non-null type com.facebook.react.runtime.internal.bolts.Task<TResult of com.facebook.react.runtime.internal.bolts.Task.Companion.cancelled>");
            return nVar;
        }

        public final n q(Exception exc) {
            o oVar = new o();
            oVar.c(exc);
            return oVar.a();
        }

        public final n r(Object obj) {
            if (obj == null) {
                n nVar = n.f14136j;
                Intrinsics.d(nVar, "null cannot be cast to non-null type com.facebook.react.runtime.internal.bolts.Task<TResult of com.facebook.react.runtime.internal.bolts.Task.Companion.forResult>");
                return nVar;
            }
            if (obj instanceof Boolean) {
                n nVar2 = ((Boolean) obj).booleanValue() ? n.f14137k : n.f14138l;
                Intrinsics.d(nVar2, "null cannot be cast to non-null type com.facebook.react.runtime.internal.bolts.Task<TResult of com.facebook.react.runtime.internal.bolts.Task.Companion.forResult>");
                return nVar2;
            }
            o oVar = new o();
            oVar.d(obj);
            return oVar.a();
        }
    }

    public n() {
    }

    private n(Object obj) {
        G(obj);
    }

    private n(boolean z10) {
        if (z10) {
            E();
        } else {
            G(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n A(V6.a aVar, n task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.t()) {
            return f14133g.k();
        }
        return task.v() ? f14133g.q(task.r()) : m(task, aVar, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n C(V6.a aVar, n task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.t()) {
            return f14133g.k();
        }
        return task.v() ? f14133g.q(task.r()) : p(task, aVar, null, 2, null);
    }

    private final void D() {
        synchronized (this.f14140a) {
            Iterator it = this.f14145f.iterator();
            while (it.hasNext()) {
                try {
                } catch (RuntimeException e10) {
                    throw e10;
                } catch (Exception e11) {
                    throw new RuntimeException(e11);
                }
            }
            this.f14145f.clear();
            Unit unit = Unit.f48228a;
        }
    }

    public static /* synthetic */ n m(n nVar, V6.a aVar, Executor executor, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            executor = f14134h;
        }
        return nVar.l(aVar, executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(o oVar, V6.a aVar, Executor executor, n task) {
        Intrinsics.checkNotNullParameter(task, "task");
        f14133g.o(oVar, aVar, task, executor);
        return Unit.f48228a;
    }

    public static /* synthetic */ n p(n nVar, V6.a aVar, Executor executor, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            executor = f14134h;
        }
        return nVar.o(aVar, executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(o oVar, V6.a aVar, Executor executor, n task) {
        Intrinsics.checkNotNullParameter(task, "task");
        f14133g.l(oVar, aVar, task, executor);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n x(n task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.t()) {
            return f14133g.k();
        }
        return task.v() ? f14133g.q(task.r()) : f14136j;
    }

    public static /* synthetic */ n z(n nVar, V6.a aVar, Executor executor, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            executor = f14134h;
        }
        return nVar.y(aVar, executor);
    }

    public final n B(V6.a continuation, Executor executor) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        return o(new h(continuation), executor);
    }

    public final boolean E() {
        synchronized (this.f14140a) {
            if (this.f14141b) {
                return false;
            }
            this.f14141b = true;
            this.f14142c = true;
            this.f14140a.notifyAll();
            D();
            return true;
        }
    }

    public final boolean F(Exception exc) {
        synchronized (this.f14140a) {
            if (this.f14141b) {
                return false;
            }
            this.f14141b = true;
            this.f14144e = exc;
            this.f14140a.notifyAll();
            D();
            return true;
        }
    }

    public final boolean G(Object obj) {
        synchronized (this.f14140a) {
            if (this.f14141b) {
                return false;
            }
            this.f14141b = true;
            this.f14143d = obj;
            this.f14140a.notifyAll();
            D();
            return true;
        }
    }

    public final n l(V6.a continuation, Executor executor) {
        boolean zU;
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        o oVar = new o();
        synchronized (this.f14140a) {
            try {
                zU = u();
                if (!zU) {
                    this.f14145f.add(new g(oVar, continuation, executor));
                }
                Unit unit = Unit.f48228a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zU) {
            f14133g.o(oVar, continuation, this, executor);
        }
        return oVar.a();
    }

    public final n o(V6.a continuation, Executor executor) {
        boolean zU;
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        o oVar = new o();
        synchronized (this.f14140a) {
            try {
                zU = u();
                if (!zU) {
                    this.f14145f.add(new e(oVar, continuation, executor));
                }
                Unit unit = Unit.f48228a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zU) {
            f14133g.l(oVar, continuation, this, executor);
        }
        return oVar.a();
    }

    public Exception r() {
        Exception exc;
        synchronized (this.f14140a) {
            exc = this.f14144e;
        }
        return exc;
    }

    public Object s() {
        Object obj;
        synchronized (this.f14140a) {
            obj = this.f14143d;
        }
        return obj;
    }

    public boolean t() {
        boolean z10;
        synchronized (this.f14140a) {
            z10 = this.f14142c;
        }
        return z10;
    }

    public boolean u() {
        boolean z10;
        synchronized (this.f14140a) {
            z10 = this.f14141b;
        }
        return z10;
    }

    public boolean v() {
        boolean z10;
        synchronized (this.f14140a) {
            z10 = r() != null;
        }
        return z10;
    }

    public final n w() {
        return p(this, new d(), null, 2, null);
    }

    public final n y(V6.a continuation, Executor executor) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        return o(new f(continuation), executor);
    }
}
