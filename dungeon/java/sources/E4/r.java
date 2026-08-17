package E4;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile r f2667d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f2668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Set f2669b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f2670c;

    class a implements L4.f.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f2671a;

        a(Context context) {
            this.f2671a = context;
        }

        @Override // L4.f.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f2671a.getSystemService("connectivity");
        }
    }

    class b implements E4.b.a {
        b() {
        }

        @Override // E4.b.a
        public void a(boolean z10) {
            ArrayList arrayList;
            L4.l.b();
            synchronized (r.this) {
                arrayList = new ArrayList(r.this.f2669b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((E4.b.a) it.next()).a(z10);
            }
        }
    }

    private interface c {
        void a();

        boolean b();
    }

    private static final class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f2674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final E4.b.a f2675b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final L4.f.b f2676c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ConnectivityManager.NetworkCallback f2677d = new a();

        class a extends ConnectivityManager.NetworkCallback {

            /* JADX INFO: renamed from: E4.r$d$a$a, reason: collision with other inner class name */
            class RunnableC0055a implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ boolean f2679a;

                RunnableC0055a(boolean z10) {
                    this.f2679a = z10;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.a(this.f2679a);
                }
            }

            a() {
            }

            private void b(boolean z10) {
                L4.l.v(new RunnableC0055a(z10));
            }

            void a(boolean z10) {
                L4.l.b();
                d dVar = d.this;
                boolean z11 = dVar.f2674a;
                dVar.f2674a = z10;
                if (z11 != z10) {
                    dVar.f2675b.a(z10);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                b(false);
            }
        }

        d(L4.f.b bVar, E4.b.a aVar) {
            this.f2676c = bVar;
            this.f2675b = aVar;
        }

        @Override // E4.r.c
        public void a() {
            ((ConnectivityManager) this.f2676c.get()).unregisterNetworkCallback(this.f2677d);
        }

        @Override // E4.r.c
        public boolean b() {
            this.f2674a = ((ConnectivityManager) this.f2676c.get()).getActiveNetwork() != null;
            try {
                ((ConnectivityManager) this.f2676c.get()).registerDefaultNetworkCallback(this.f2677d);
                return true;
            } catch (RuntimeException e10) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e10);
                }
                return false;
            }
        }
    }

    private r(Context context) {
        this.f2668a = new d(L4.f.a(new a(context)), new b());
    }

    static r a(Context context) {
        if (f2667d == null) {
            synchronized (r.class) {
                try {
                    if (f2667d == null) {
                        f2667d = new r(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f2667d;
    }

    private void b() {
        if (this.f2670c || this.f2669b.isEmpty()) {
            return;
        }
        this.f2670c = this.f2668a.b();
    }

    private void c() {
        if (this.f2670c && this.f2669b.isEmpty()) {
            this.f2668a.a();
            this.f2670c = false;
        }
    }

    synchronized void d(E4.b.a aVar) {
        this.f2669b.add(aVar);
        b();
    }

    synchronized void e(E4.b.a aVar) {
        this.f2669b.remove(aVar);
        c();
    }
}
