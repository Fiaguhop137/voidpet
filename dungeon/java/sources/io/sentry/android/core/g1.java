package io.sentry.android.core;

import io.sentry.AbstractC3732l;
import io.sentry.AbstractC3750o2;
import io.sentry.C3694d1;
import io.sentry.C3704f1;
import io.sentry.C3776r3;
import io.sentry.InterfaceC3698e0;
import io.sentry.InterfaceC3713h0;
import io.sentry.InterfaceC3723j0;
import io.sentry.util.C3799a;
import java.util.Date;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class g1 implements io.sentry.V, io.sentry.android.core.internal.util.H.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f44896h = TimeUnit.SECONDS.toNanos(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final C3776r3 f44897i = new C3776r3(new Date(0), 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f44898a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.H f44900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile String f44901d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final C3799a f44899b = new C3799a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SortedSet f44902e = new TreeSet(new f1());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ConcurrentSkipListSet f44903f = new ConcurrentSkipListSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f44904g = 16666666;

    private static class a implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f44905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f44906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f44907c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f44908d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f44909e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f44910f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f44911g;

        a(long j10) {
            this(j10, j10, 0L, 0L, false, false, 0L);
        }

        a(long j10, long j11, long j12, long j13, boolean z10, boolean z11, long j14) {
            this.f44905a = j10;
            this.f44906b = j11;
            this.f44907c = j12;
            this.f44908d = j13;
            this.f44909e = z10;
            this.f44910f = z11;
            this.f44911g = j14;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return Long.compare(this.f44906b, aVar.f44906b);
        }
    }

    public g1(SentryAndroidOptions sentryAndroidOptions, io.sentry.android.core.internal.util.H h10) {
        this.f44900c = h10;
        this.f44898a = sentryAndroidOptions.isEnablePerformanceV2() && sentryAndroidOptions.isEnableFramesTracking();
    }

    public static /* synthetic */ int f(InterfaceC3713h0 interfaceC3713h0, InterfaceC3713h0 interfaceC3713h1) {
        if (interfaceC3713h0 == interfaceC3713h1) {
            return 0;
        }
        int iCompareTo = interfaceC3713h0.q().compareTo(interfaceC3713h1.q());
        return iCompareTo != 0 ? iCompareTo : interfaceC3713h0.n().m().toString().compareTo(interfaceC3713h1.n().m().toString());
    }

    private static int g(b1 b1Var, long j10, long j11, long j12) {
        long jMax = Math.max(0L, j11 - j12);
        if (!io.sentry.android.core.internal.util.H.j(jMax, j10)) {
            return 0;
        }
        b1Var.a(jMax, Math.max(0L, jMax - j10), true, io.sentry.android.core.internal.util.H.i(jMax));
        return 1;
    }

    private void h(InterfaceC3713h0 interfaceC3713h0) {
        InterfaceC3698e0 interfaceC3698e0A = this.f44899b.a();
        try {
            if (!this.f44902e.remove(interfaceC3713h0)) {
                if (interfaceC3698e0A != null) {
                    interfaceC3698e0A.close();
                    return;
                }
                return;
            }
            AbstractC3750o2 abstractC3750o2O = interfaceC3713h0.o();
            if (abstractC3750o2O == null) {
                if (interfaceC3698e0A != null) {
                    interfaceC3698e0A.close();
                    return;
                }
                return;
            }
            long j10 = j(interfaceC3713h0.q());
            long j11 = j(abstractC3750o2O);
            long j12 = j11 - j10;
            long j13 = 0;
            if (j12 <= 0) {
                if (interfaceC3698e0A != null) {
                    interfaceC3698e0A.close();
                    return;
                }
                return;
            }
            b1 b1Var = new b1();
            long j14 = this.f44904g;
            if (!this.f44903f.isEmpty()) {
                for (a aVar : this.f44903f.tailSet(new a(j10))) {
                    if (aVar.f44905a > j11) {
                        break;
                    }
                    if (aVar.f44905a >= j10 && aVar.f44906b <= j11) {
                        b1Var.a(aVar.f44907c, aVar.f44908d, aVar.f44909e, aVar.f44910f);
                    } else if ((j10 > aVar.f44905a && j10 < aVar.f44906b) || (j11 > aVar.f44905a && j11 < aVar.f44906b)) {
                        long jMin = Math.min(aVar.f44908d - Math.max(j13, Math.max(j13, j10 - aVar.f44905a) - aVar.f44911g), j12);
                        long jMin2 = Math.min(j11, aVar.f44906b) - Math.max(j10, aVar.f44905a);
                        b1Var.a(jMin2, jMin, io.sentry.android.core.internal.util.H.j(jMin2, aVar.f44911g), io.sentry.android.core.internal.util.H.i(jMin2));
                    }
                    j14 = aVar.f44911g;
                    j13 = 0;
                }
            }
            long j15 = j14;
            int iF = b1Var.f();
            long jH = this.f44900c.h();
            if (jH != -1) {
                iF = iF + g(b1Var, j15, j11, jH) + i(b1Var, j15, j12);
            }
            double dE = (b1Var.e() + b1Var.c()) / 1.0E9d;
            interfaceC3713h0.h("frames.total", Integer.valueOf(iF));
            interfaceC3713h0.h("frames.slow", Integer.valueOf(b1Var.d()));
            interfaceC3713h0.h("frames.frozen", Integer.valueOf(b1Var.b()));
            interfaceC3713h0.h("frames.delay", Double.valueOf(dE));
            if (interfaceC3713h0 instanceof InterfaceC3723j0) {
                interfaceC3713h0.e("frames_total", Integer.valueOf(iF));
                interfaceC3713h0.e("frames_slow", Integer.valueOf(b1Var.d()));
                interfaceC3713h0.e("frames_frozen", Integer.valueOf(b1Var.b()));
                interfaceC3713h0.e("frames_delay", Double.valueOf(dE));
            }
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
        } catch (Throwable th) {
            if (interfaceC3698e0A == null) {
                throw th;
            }
            try {
                interfaceC3698e0A.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    private static int i(b1 b1Var, long j10, long j11) {
        long jG = j11 - b1Var.g();
        if (jG > 0) {
            return (int) Math.ceil(jG / j10);
        }
        return 0;
    }

    private static long j(AbstractC3750o2 abstractC3750o2) {
        if (abstractC3750o2 instanceof C3776r3) {
            return abstractC3750o2.g(f44897i);
        }
        return System.nanoTime() - (AbstractC3732l.i(System.currentTimeMillis()) - abstractC3750o2.p());
    }

    @Override // io.sentry.V
    public void a(InterfaceC3713h0 interfaceC3713h0) {
        if (!this.f44898a || (interfaceC3713h0 instanceof C3694d1) || (interfaceC3713h0 instanceof C3704f1)) {
            return;
        }
        InterfaceC3698e0 interfaceC3698e0A = this.f44899b.a();
        try {
            if (!this.f44902e.contains(interfaceC3713h0)) {
                if (interfaceC3698e0A != null) {
                    interfaceC3698e0A.close();
                    return;
                }
                return;
            }
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            h(interfaceC3713h0);
            InterfaceC3698e0 interfaceC3698e0A2 = this.f44899b.a();
            try {
                if (this.f44902e.isEmpty()) {
                    clear();
                } else {
                    this.f44903f.headSet(new a(j(((InterfaceC3713h0) this.f44902e.first()).q()))).clear();
                }
                if (interfaceC3698e0A2 != null) {
                    interfaceC3698e0A2.close();
                }
            } catch (Throwable th) {
                if (interfaceC3698e0A2 != null) {
                    try {
                        interfaceC3698e0A2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (interfaceC3698e0A != null) {
                try {
                    interfaceC3698e0A.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @Override // io.sentry.V
    public void b(InterfaceC3713h0 interfaceC3713h0) {
        if (!this.f44898a || (interfaceC3713h0 instanceof C3694d1) || (interfaceC3713h0 instanceof C3704f1)) {
            return;
        }
        InterfaceC3698e0 interfaceC3698e0A = this.f44899b.a();
        try {
            this.f44902e.add(interfaceC3713h0);
            if (this.f44901d == null) {
                this.f44901d = this.f44900c.l(this);
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

    @Override // io.sentry.V
    public void clear() {
        InterfaceC3698e0 interfaceC3698e0A = this.f44899b.a();
        try {
            if (this.f44901d != null) {
                this.f44900c.m(this.f44901d);
                this.f44901d = null;
            }
            this.f44903f.clear();
            this.f44902e.clear();
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

    @Override // io.sentry.android.core.internal.util.H.b
    public void e(long j10, long j11, long j12, long j13, boolean z10, boolean z11, float f10) {
        if (this.f44903f.size() > 3600) {
            return;
        }
        long j14 = (long) (f44896h / ((double) f10));
        this.f44904g = j14;
        if (z10 || z11) {
            this.f44903f.add(new a(j10, j11, j12, j13, z10, z11, j14));
        }
    }
}
