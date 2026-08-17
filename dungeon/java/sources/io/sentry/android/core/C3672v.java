package io.sentry.android.core;

import io.sentry.AbstractC3710g2;
import io.sentry.AbstractC3750o2;
import io.sentry.C3774r1;
import io.sentry.C3776r3;
import io.sentry.C3833z3;
import io.sentry.EnumC3721i3;
import io.sentry.EnumC3727k;
import io.sentry.EnumC3789t1;
import io.sentry.ILogger;
import io.sentry.InterfaceC3619a0;
import io.sentry.InterfaceC3693d0;
import io.sentry.InterfaceC3698e0;
import io.sentry.InterfaceC3717i;
import io.sentry.f4;
import io.sentry.util.C3799a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: io.sentry.android.core.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3672v implements io.sentry.N, io.sentry.transport.z.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ILogger f45173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f45174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f45175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.sentry.util.p.a f45176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C3636g0 f45177e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.H f45179g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private InterfaceC3619a0 f45182j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Future f45183k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private InterfaceC3717i f45184l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private io.sentry.protocol.x f45186n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private io.sentry.protocol.x f45187o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f45188p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private AbstractC3750o2 f45189q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private volatile boolean f45190r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f45191s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f45192t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f45193u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final C3799a f45194v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final C3799a f45195w;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f45178f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private N f45180h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f45181i = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f45185m = new ArrayList();

    /* JADX INFO: renamed from: io.sentry.android.core.v$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45196a;

        static {
            int[] iArr = new int[EnumC3789t1.values().length];
            f45196a = iArr;
            try {
                iArr[EnumC3789t1.TRACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45196a[EnumC3789t1.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C3672v(C3636g0 c3636g0, io.sentry.android.core.internal.util.H h10, ILogger iLogger, String str, int i10, io.sentry.util.p.a aVar) {
        io.sentry.protocol.x xVar = io.sentry.protocol.x.f46302b;
        this.f45186n = xVar;
        this.f45187o = xVar;
        this.f45188p = new AtomicBoolean(false);
        this.f45189q = new C3776r3();
        this.f45190r = true;
        this.f45191s = false;
        this.f45192t = false;
        this.f45193u = 0;
        this.f45194v = new C3799a();
        this.f45195w = new C3799a();
        this.f45173a = iLogger;
        this.f45179g = h10;
        this.f45177e = c3636g0;
        this.f45174b = str;
        this.f45175c = i10;
        this.f45176d = aVar;
    }

    public static /* synthetic */ void b(C3672v c3672v, C3833z3 c3833z3, InterfaceC3619a0 interfaceC3619a0) {
        if (c3672v.f45188p.get()) {
            return;
        }
        ArrayList arrayList = new ArrayList(c3672v.f45185m.size());
        InterfaceC3698e0 interfaceC3698e0A = c3672v.f45195w.a();
        try {
            Iterator it = c3672v.f45185m.iterator();
            while (it.hasNext()) {
                arrayList.add(((C3774r1.a) it.next()).a(c3833z3));
            }
            c3672v.f45185m.clear();
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                interfaceC3619a0.E((C3774r1) it2.next());
            }
        } catch (Throwable th) {
            if (interfaceC3698e0A != null) {
                try {
                    interfaceC3698e0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private void c() {
        if (this.f45178f) {
            return;
        }
        this.f45178f = true;
        String str = this.f45174b;
        if (str == null) {
            this.f45173a.c(EnumC3721i3.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            return;
        }
        int i10 = this.f45175c;
        if (i10 <= 0) {
            this.f45173a.c(EnumC3721i3.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i10));
        } else {
            this.f45180h = new N(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / this.f45175c, this.f45179g, null, this.f45173a);
        }
    }

    private void d() {
        InterfaceC3619a0 interfaceC3619a0 = this.f45182j;
        if ((interfaceC3619a0 == null || interfaceC3619a0 == io.sentry.U0.c()) && AbstractC3710g2.r() != io.sentry.U0.c()) {
            this.f45182j = AbstractC3710g2.r();
            this.f45184l = AbstractC3710g2.r().g().getCompositePerformanceCollector();
            io.sentry.transport.z zVarW = this.f45182j.w();
            if (zVarW != null) {
                zVarW.e(this);
            }
        }
    }

    private void e(InterfaceC3619a0 interfaceC3619a0, C3833z3 c3833z3) {
        try {
            c3833z3.getExecutorService().submit(new RunnableC3670u(this, c3833z3, interfaceC3619a0));
        } catch (Throwable th) {
            c3833z3.getLogger().b(EnumC3721i3.DEBUG, "Failed to send profile chunks.", th);
        }
    }

    private void g() {
        d();
        if (this.f45177e.d() < 22) {
            return;
        }
        c();
        if (this.f45180h == null) {
            return;
        }
        InterfaceC3619a0 interfaceC3619a0 = this.f45182j;
        if (interfaceC3619a0 != null) {
            io.sentry.transport.z zVarW = interfaceC3619a0.w();
            if (zVarW != null && (zVarW.i(EnumC3727k.All) || zVarW.i(EnumC3727k.ProfileChunkUi))) {
                this.f45173a.c(EnumC3721i3.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
                h(false);
                return;
            } else {
                if (this.f45182j.g().getConnectionStatusProvider().o1() == io.sentry.M.a.DISCONNECTED) {
                    this.f45173a.c(EnumC3721i3.WARNING, "Device is offline. Stopping profiler.", new Object[0]);
                    h(false);
                    return;
                }
                this.f45189q = this.f45182j.g().getDateProvider().now();
            }
        } else {
            this.f45189q = new C3776r3();
        }
        if (this.f45180h.j() == null) {
            return;
        }
        this.f45181i = true;
        io.sentry.protocol.x xVar = this.f45186n;
        io.sentry.protocol.x xVar2 = io.sentry.protocol.x.f46302b;
        if (xVar.equals(xVar2)) {
            this.f45186n = new io.sentry.protocol.x();
        }
        if (this.f45187o.equals(xVar2)) {
            this.f45187o = new io.sentry.protocol.x();
        }
        InterfaceC3717i interfaceC3717i = this.f45184l;
        if (interfaceC3717i != null) {
            interfaceC3717i.f(this.f45187o.toString());
        }
        try {
            this.f45183k = ((InterfaceC3693d0) this.f45176d.a()).c(new RunnableC3668t(this), 60000L);
        } catch (RejectedExecutionException e10) {
            this.f45173a.b(EnumC3721i3.ERROR, "Failed to schedule profiling chunk finish. Did you call Sentry.close()?", e10);
            this.f45191s = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(boolean z10) {
        d();
        InterfaceC3698e0 interfaceC3698e0A = this.f45194v.a();
        try {
            Future future = this.f45183k;
            if (future != null) {
                future.cancel(true);
            }
            if (this.f45180h != null && this.f45181i) {
                if (this.f45177e.d() < 22) {
                    if (interfaceC3698e0A != null) {
                        interfaceC3698e0A.close();
                        return;
                    }
                    return;
                }
                InterfaceC3717i interfaceC3717i = this.f45184l;
                N.b bVarG = this.f45180h.g(false, interfaceC3717i != null ? interfaceC3717i.c(this.f45187o.toString()) : null);
                if (bVarG == null) {
                    this.f45173a.c(EnumC3721i3.ERROR, "An error occurred while collecting a profile chunk, and it won't be sent.", new Object[0]);
                } else {
                    InterfaceC3698e0 interfaceC3698e0A2 = this.f45195w.a();
                    try {
                        this.f45185m.add(new C3774r1.a(this.f45186n, this.f45187o, bVarG.f44690d, bVarG.f44689c, this.f45189q, "android"));
                        if (interfaceC3698e0A2 != null) {
                            interfaceC3698e0A2.close();
                        }
                    } catch (Throwable th) {
                        if (interfaceC3698e0A2 == null) {
                            throw th;
                        }
                        try {
                            interfaceC3698e0A2.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                this.f45181i = false;
                io.sentry.protocol.x xVar = io.sentry.protocol.x.f46302b;
                this.f45187o = xVar;
                InterfaceC3619a0 interfaceC3619a0 = this.f45182j;
                if (interfaceC3619a0 != null) {
                    e(interfaceC3619a0, interfaceC3619a0.g());
                }
                if (!z10 || this.f45191s) {
                    this.f45186n = xVar;
                    this.f45173a.c(EnumC3721i3.DEBUG, "Profile chunk finished.", new Object[0]);
                } else {
                    this.f45173a.c(EnumC3721i3.DEBUG, "Profile chunk finished. Starting a new one.", new Object[0]);
                    g();
                }
                if (interfaceC3698e0A != null) {
                    interfaceC3698e0A.close();
                    return;
                }
                return;
            }
            io.sentry.protocol.x xVar2 = io.sentry.protocol.x.f46302b;
            this.f45186n = xVar2;
            this.f45187o = xVar2;
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
        } catch (Throwable th3) {
            if (interfaceC3698e0A == null) {
                throw th3;
            }
            try {
                interfaceC3698e0A.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    @Override // io.sentry.transport.z.b
    public void f(io.sentry.transport.z zVar) {
        if (zVar.i(EnumC3727k.All) || zVar.i(EnumC3727k.ProfileChunkUi)) {
            this.f45173a.c(EnumC3721i3.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
            h(false);
        }
    }

    @Override // io.sentry.N
    public boolean isRunning() {
        return this.f45181i;
    }

    @Override // io.sentry.N
    public void j(boolean z10) {
        InterfaceC3698e0 interfaceC3698e0A = this.f45194v.a();
        try {
            this.f45193u = 0;
            this.f45191s = true;
            if (z10) {
                h(false);
                this.f45188p.set(true);
            }
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
        } catch (Throwable th) {
            if (interfaceC3698e0A != null) {
                try {
                    interfaceC3698e0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.N
    public void k(EnumC3789t1 enumC3789t1, f4 f4Var) {
        InterfaceC3698e0 interfaceC3698e0A = this.f45194v.a();
        try {
            if (this.f45190r) {
                this.f45192t = f4Var.c(io.sentry.util.B.a().c());
                this.f45190r = false;
            }
            if (!this.f45192t) {
                this.f45173a.c(EnumC3721i3.DEBUG, "Profiler was not started due to sampling decision.", new Object[0]);
                if (interfaceC3698e0A != null) {
                    interfaceC3698e0A.close();
                    return;
                }
                return;
            }
            int i10 = a.f45196a[enumC3789t1.ordinal()];
            if (i10 == 1) {
                if (this.f45193u < 0) {
                    this.f45193u = 0;
                }
                this.f45193u++;
            } else if (i10 == 2 && isRunning()) {
                this.f45173a.c(EnumC3721i3.DEBUG, "Profiler is already running.", new Object[0]);
                if (interfaceC3698e0A != null) {
                    interfaceC3698e0A.close();
                    return;
                }
                return;
            }
            if (!isRunning()) {
                this.f45173a.c(EnumC3721i3.DEBUG, "Started Profiler.", new Object[0]);
                g();
            }
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
        } catch (Throwable th) {
            if (interfaceC3698e0A != null) {
                try {
                    interfaceC3698e0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.N
    public void l() {
        this.f45190r = true;
    }

    @Override // io.sentry.N
    public io.sentry.protocol.x m() {
        return this.f45187o;
    }

    @Override // io.sentry.N
    public void n(EnumC3789t1 enumC3789t1) {
        InterfaceC3698e0 interfaceC3698e0A = this.f45194v.a();
        try {
            int i10 = a.f45196a[enumC3789t1.ordinal()];
            if (i10 == 1) {
                int i11 = this.f45193u - 1;
                this.f45193u = i11;
                if (i11 > 0) {
                    if (interfaceC3698e0A != null) {
                        interfaceC3698e0A.close();
                        return;
                    }
                    return;
                } else {
                    if (i11 < 0) {
                        this.f45193u = 0;
                    }
                    this.f45191s = true;
                }
            } else if (i10 == 2) {
                this.f45191s = true;
            }
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
        } catch (Throwable th) {
            if (interfaceC3698e0A != null) {
                try {
                    interfaceC3698e0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.N
    public io.sentry.protocol.x o() {
        return this.f45186n;
    }
}
