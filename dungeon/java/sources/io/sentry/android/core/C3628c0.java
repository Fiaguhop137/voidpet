package io.sentry.android.core;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1994q;
import androidx.lifecycle.ProcessLifecycleOwner;
import io.sentry.C3833z3;
import io.sentry.EnumC3721i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC3698e0;
import io.sentry.util.C3799a;
import java.io.Closeable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: io.sentry.android.core.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3628c0 implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static C3628c0 f44850e = new C3628c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile b f44852b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3799a f44851a = new C3799a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private N0 f44853c = new N0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Boolean f44854d = null;

    /* JADX INFO: renamed from: io.sentry.android.core.c0$a */
    public interface a {
        void a();

        void b();
    }

    /* JADX INFO: renamed from: io.sentry.android.core.c0$b */
    public final class b implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List f44855a = new a();

        /* JADX INFO: renamed from: io.sentry.android.core.c0$b$a */
        class a extends CopyOnWriteArrayList {
            a() {
            }

            @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public boolean add(a aVar) {
                boolean zAdd = super.add(aVar);
                if (Boolean.FALSE.equals(C3628c0.this.f44854d)) {
                    aVar.a();
                    return zAdd;
                }
                if (Boolean.TRUE.equals(C3628c0.this.f44854d)) {
                    aVar.b();
                }
                return zAdd;
            }
        }

        public b() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(InterfaceC1994q interfaceC1994q) {
            C3628c0.this.o(false);
            Iterator it = this.f44855a.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a();
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(InterfaceC1994q interfaceC1994q) {
            C3628c0.this.o(true);
            Iterator it = this.f44855a.iterator();
            while (it.hasNext()) {
                ((a) it.next()).b();
            }
        }
    }

    private C3628c0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(ILogger iLogger) {
        b bVar = this.f44852b;
        if (bVar != null) {
            try {
                ProcessLifecycleOwner.m().y().a(bVar);
            } catch (Throwable th) {
                this.f44852b = null;
                iLogger.b(EnumC3721i3.ERROR, "AppState failed to get Lifecycle and could not install lifecycle observer.", th);
            }
        }
    }

    private void f(ILogger iLogger) {
        if (this.f44852b != null) {
            return;
        }
        try {
            ProcessLifecycleOwner.Companion companion = ProcessLifecycleOwner.INSTANCE;
            this.f44852b = new b();
            if (io.sentry.android.core.internal.util.m.e().a()) {
                e(iLogger);
            } else {
                this.f44853c.b(new RunnableC3624a0(this, iLogger));
            }
        } catch (ClassNotFoundException unused) {
            iLogger.c(EnumC3721i3.WARNING, "androidx.lifecycle is not available, some features might not be properly working,e.g. Session Tracking, Network and System Events breadcrumbs, etc.", new Object[0]);
        } catch (Throwable th) {
            iLogger.b(EnumC3721i3.ERROR, "AppState could not register lifecycle observer", th);
        }
    }

    public static C3628c0 g() {
        return f44850e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(b bVar) {
        if (bVar != null) {
            ProcessLifecycleOwner.m().y().d(bVar);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        p();
    }

    public void d(a aVar) {
        InterfaceC3698e0 interfaceC3698e0A = this.f44851a.a();
        try {
            f(io.sentry.N0.e());
            if (this.f44852b != null) {
                this.f44852b.f44855a.add(aVar);
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

    public Boolean h() {
        return this.f44854d;
    }

    public void i(C3833z3 c3833z3) {
        if (this.f44852b != null) {
            return;
        }
        InterfaceC3698e0 interfaceC3698e0A = this.f44851a.a();
        try {
            f(c3833z3 != null ? c3833z3.getLogger() : io.sentry.N0.e());
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

    public void k(a aVar) {
        InterfaceC3698e0 interfaceC3698e0A = this.f44851a.a();
        try {
            if (this.f44852b != null) {
                this.f44852b.f44855a.remove(aVar);
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

    void o(boolean z10) {
        this.f44854d = Boolean.valueOf(z10);
    }

    public void p() {
        if (this.f44852b == null) {
            return;
        }
        InterfaceC3698e0 interfaceC3698e0A = this.f44851a.a();
        try {
            b bVar = this.f44852b;
            this.f44852b.f44855a.clear();
            this.f44852b = null;
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            if (io.sentry.android.core.internal.util.m.e().a()) {
                m(bVar);
            } else {
                this.f44853c.b(new RunnableC3626b0(this, bVar));
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
}
