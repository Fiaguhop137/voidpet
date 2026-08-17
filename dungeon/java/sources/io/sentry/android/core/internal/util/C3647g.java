package io.sentry.android.core.internal.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Handler;
import io.sentry.C3833z3;
import io.sentry.EnumC3721i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC3698e0;
import io.sentry.M;
import io.sentry.android.core.AbstractC3662p0;
import io.sentry.android.core.C3628c0;
import io.sentry.android.core.C3636g0;
import io.sentry.util.C3799a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3647g implements M, C3628c0.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile ConnectivityManager f45031n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f45036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3833z3 f45037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3636g0 f45038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.sentry.transport.o f45039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f45040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Handler f45041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C3799a f45042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile ConnectivityManager.NetworkCallback f45043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile NetworkCapabilities f45044i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile Network f45045j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile long f45046k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f45047l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final C3799a f45030m = new C3799a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final C3799a f45032o = new C3799a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final List f45033p = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int[] f45034q = {1, 0, 3, 2};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f45035r = new int[2];

    /* JADX INFO: renamed from: io.sentry.android.core.internal.util.g$a */
    class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        private void a() {
            C3647g.this.f45047l.set(false);
            InterfaceC3698e0 interfaceC3698e0A = C3647g.this.f45042g.a();
            try {
                C3647g.this.f45044i = null;
                C3647g.this.f45045j = null;
                C3647g c3647g = C3647g.this;
                c3647g.f45046k = c3647g.f45039d.a();
                C3647g.this.f45037b.getLogger().c(EnumC3721i3.DEBUG, "Cache cleared - network lost/unavailable", new Object[0]);
                Iterator it = C3647g.this.f45040e.iterator();
                while (it.hasNext()) {
                    ((M.b) it.next()).b(M.a.DISCONNECTED);
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

        private boolean b(NetworkCapabilities networkCapabilities, NetworkCapabilities networkCapabilities2) {
            for (int i10 : C3647g.f45035r) {
                if (i10 != 0 && networkCapabilities.hasCapability(i10) != networkCapabilities2.hasCapability(i10)) {
                    return true;
                }
            }
            return false;
        }

        private boolean c(NetworkCapabilities networkCapabilities, NetworkCapabilities networkCapabilities2) {
            for (int i10 : C3647g.f45034q) {
                if (networkCapabilities.hasTransport(i10) != networkCapabilities2.hasTransport(i10)) {
                    return true;
                }
            }
            return false;
        }

        private boolean d(NetworkCapabilities networkCapabilities) {
            NetworkCapabilities networkCapabilities2 = C3647g.this.f45044i;
            if ((networkCapabilities2 == null) != (networkCapabilities == null)) {
                return true;
            }
            if (networkCapabilities2 == null && networkCapabilities == null) {
                return false;
            }
            return b(networkCapabilities2, networkCapabilities) || c(networkCapabilities2, networkCapabilities);
        }

        private void e(Network network, NetworkCapabilities networkCapabilities) {
            if (d(networkCapabilities)) {
                C3647g.this.t0(networkCapabilities);
                M.a aVarS = C3647g.this.S();
                InterfaceC3698e0 interfaceC3698e0A = C3647g.this.f45042g.a();
                try {
                    Iterator it = C3647g.this.f45040e.iterator();
                    while (it.hasNext()) {
                        ((M.b) it.next()).b(aVarS);
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
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            C3647g.this.f45045j = network;
            if (C3647g.this.f45047l.getAndSet(true)) {
                return;
            }
            InterfaceC3698e0 interfaceC3698e0A = C3647g.f45032o.a();
            try {
                Iterator it = C3647g.f45033p.iterator();
                while (it.hasNext()) {
                    ((ConnectivityManager.NetworkCallback) it.next()).onAvailable(network);
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

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            if (network.equals(C3647g.this.f45045j)) {
                e(network, networkCapabilities);
                InterfaceC3698e0 interfaceC3698e0A = C3647g.f45032o.a();
                try {
                    Iterator it = C3647g.f45033p.iterator();
                    while (it.hasNext()) {
                        ((ConnectivityManager.NetworkCallback) it.next()).onCapabilitiesChanged(network, networkCapabilities);
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
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            if (network.equals(C3647g.this.f45045j)) {
                a();
                InterfaceC3698e0 interfaceC3698e0A = C3647g.f45032o.a();
                try {
                    Iterator it = C3647g.f45033p.iterator();
                    while (it.hasNext()) {
                        ((ConnectivityManager.NetworkCallback) it.next()).onLost(network);
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
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            a();
            InterfaceC3698e0 interfaceC3698e0A = C3647g.f45032o.a();
            try {
                Iterator it = C3647g.f45033p.iterator();
                while (it.hasNext()) {
                    ((ConnectivityManager.NetworkCallback) it.next()).onUnavailable();
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
    }

    public C3647g(Context context, C3833z3 c3833z3, C3636g0 c3636g0, io.sentry.transport.o oVar) {
        this(context, c3833z3, c3636g0, oVar, null);
    }

    public C3647g(Context context, C3833z3 c3833z3, C3636g0 c3636g0, io.sentry.transport.o oVar, Handler handler) {
        this.f45042g = new C3799a();
        this.f45046k = 0L;
        this.f45047l = new AtomicBoolean(false);
        this.f45036a = AbstractC3662p0.g(context);
        this.f45037b = c3833z3;
        this.f45038c = c3636g0;
        this.f45039d = oVar;
        this.f45041f = handler;
        this.f45040e = new ArrayList();
        int[] iArr = f45035r;
        iArr[0] = 12;
        if (c3636g0.d() >= 23) {
            iArr[1] = 16;
        }
        q0(new RunnableC3643c(this));
        C3628c0.g().d(this);
    }

    public static boolean L(Context context, ILogger iLogger, C3636g0 c3636g0, ConnectivityManager.NetworkCallback networkCallback) {
        if (c3636g0.d() < 24) {
            iLogger.c(EnumC3721i3.DEBUG, "NetworkCallbacks need Android N+.", new Object[0]);
            return false;
        }
        if (!w.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.c(EnumC3721i3.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        InterfaceC3698e0 interfaceC3698e0A = f45032o.a();
        try {
            f45033p.add(networkCallback);
            if (interfaceC3698e0A == null) {
                return true;
            }
            interfaceC3698e0A.close();
            return true;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        if (AbstractC3662p0.s() && this.f45043h == null) {
            InterfaceC3698e0 interfaceC3698e0A = this.f45042g.a();
            try {
                if (this.f45043h != null) {
                    if (interfaceC3698e0A != null) {
                        interfaceC3698e0A.close();
                        return;
                    }
                    return;
                }
                a aVar = new a();
                if (h0(this.f45036a, this.f45037b.getLogger(), this.f45038c, this.f45041f, aVar)) {
                    this.f45043h = aVar;
                    this.f45037b.getLogger().c(EnumC3721i3.DEBUG, "Network callback registered successfully", new Object[0]);
                } else {
                    this.f45037b.getLogger().c(EnumC3721i3.WARNING, "Failed to register network callback", new Object[0]);
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
    }

    private static M.a P(Context context, ConnectivityManager connectivityManager, ILogger iLogger) {
        if (!w.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.c(EnumC3721i3.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return M.a.NO_PERMISSION;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected() ? M.a.CONNECTED : M.a.DISCONNECTED;
            }
            iLogger.c(EnumC3721i3.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
            return M.a.DISCONNECTED;
        } catch (Throwable th) {
            iLogger.b(EnumC3721i3.WARNING, "Could not retrieve Connection Status", th);
            return M.a.UNKNOWN;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public M.a S() {
        if (this.f45044i != null) {
            return e0(this.f45044i) ? M.a.CONNECTED : M.a.DISCONNECTED;
        }
        ConnectivityManager connectivityManagerB0 = b0(this.f45036a, this.f45037b.getLogger());
        return connectivityManagerB0 != null ? P(this.f45036a, connectivityManagerB0, this.f45037b.getLogger()) : M.a.UNKNOWN;
    }

    public static String U(Context context, ILogger iLogger, C3636g0 c3636g0) {
        ConnectivityManager connectivityManagerB0 = b0(context, iLogger);
        if (connectivityManagerB0 == null) {
            return null;
        }
        boolean zHasTransport = false;
        if (!w.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.c(EnumC3721i3.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return null;
        }
        try {
            boolean zHasTransport2 = true;
            if (c3636g0.d() >= 23) {
                Network activeNetwork = connectivityManagerB0.getActiveNetwork();
                if (activeNetwork == null) {
                    iLogger.c(EnumC3721i3.INFO, "Network is null and cannot check network status", new Object[0]);
                    return null;
                }
                NetworkCapabilities networkCapabilities = connectivityManagerB0.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities == null) {
                    iLogger.c(EnumC3721i3.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);
                    return null;
                }
                boolean zHasTransport3 = networkCapabilities.hasTransport(3);
                zHasTransport = networkCapabilities.hasTransport(1);
                zHasTransport2 = networkCapabilities.hasTransport(0);
                zHasTransport = zHasTransport3;
            } else {
                NetworkInfo activeNetworkInfo = connectivityManagerB0.getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    iLogger.c(EnumC3721i3.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
                    return null;
                }
                int type = activeNetworkInfo.getType();
                if (type == 0) {
                    zHasTransport = false;
                } else if (type != 1) {
                    if (type == 9) {
                        zHasTransport = true;
                    }
                    zHasTransport2 = zHasTransport;
                } else {
                    zHasTransport = true;
                    zHasTransport2 = false;
                }
            }
            if (zHasTransport) {
                return "ethernet";
            }
            if (zHasTransport) {
                return "wifi";
            }
            if (zHasTransport2) {
                return "cellular";
            }
            return null;
        } catch (Throwable th) {
            iLogger.b(EnumC3721i3.ERROR, "Failed to retrieve network info", th);
        }
    }

    public static String V(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasTransport(3)) {
            return "ethernet";
        }
        if (networkCapabilities.hasTransport(1)) {
            return "wifi";
        }
        if (networkCapabilities.hasTransport(0)) {
            return "cellular";
        }
        return null;
    }

    private String Z() {
        NetworkCapabilities networkCapabilities = this.f45044i;
        return networkCapabilities != null ? V(networkCapabilities) : U(this.f45036a, this.f45037b.getLogger(), this.f45038c);
    }

    private static ConnectivityManager b0(Context context, ILogger iLogger) {
        if (f45031n != null) {
            return f45031n;
        }
        InterfaceC3698e0 interfaceC3698e0A = f45030m.a();
        try {
            if (f45031n != null) {
                ConnectivityManager connectivityManager = f45031n;
                if (interfaceC3698e0A != null) {
                    interfaceC3698e0A.close();
                }
                return connectivityManager;
            }
            f45031n = (ConnectivityManager) context.getSystemService("connectivity");
            if (f45031n == null) {
                iLogger.c(EnumC3721i3.INFO, "ConnectivityManager is null and cannot check network status", new Object[0]);
            }
            ConnectivityManager connectivityManager2 = f45031n;
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            return connectivityManager2;
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

    private boolean c0() {
        return this.f45039d.a() - this.f45046k < 120000;
    }

    public static /* synthetic */ void e(C3647g c3647g) {
        c3647g.s0(true);
        InterfaceC3698e0 interfaceC3698e0A = f45032o.a();
        try {
            f45033p.clear();
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            InterfaceC3698e0 interfaceC3698e0A2 = f45030m.a();
            try {
                f45031n = null;
                if (interfaceC3698e0A2 != null) {
                    interfaceC3698e0A2.close();
                }
                C3628c0.g().k(c3647g);
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

    private boolean e0(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return false;
        }
        boolean zHasCapability = networkCapabilities.hasCapability(12);
        if (this.f45038c.d() >= 23) {
            zHasCapability = zHasCapability && networkCapabilities.hasCapability(16);
        }
        if (!zHasCapability) {
            return false;
        }
        for (int i10 : f45034q) {
            if (networkCapabilities.hasTransport(i10)) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void f(C3647g c3647g) {
        c3647g.t0(null);
        M.a aVarS = c3647g.S();
        if (aVarS == M.a.DISCONNECTED) {
            c3647g.f45047l.set(false);
            InterfaceC3698e0 interfaceC3698e0A = f45032o.a();
            try {
                Iterator it = f45033p.iterator();
                while (it.hasNext()) {
                    ((ConnectivityManager.NetworkCallback) it.next()).onLost(null);
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
        InterfaceC3698e0 interfaceC3698e0A2 = c3647g.f45042g.a();
        try {
            Iterator it2 = c3647g.f45040e.iterator();
            while (it2.hasNext()) {
                ((M.b) it2.next()).b(aVarS);
            }
            if (interfaceC3698e0A2 != null) {
                interfaceC3698e0A2.close();
            }
            c3647g.O();
        } catch (Throwable th3) {
            if (interfaceC3698e0A2 != null) {
                try {
                    interfaceC3698e0A2.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    static boolean h0(Context context, ILogger iLogger, C3636g0 c3636g0, Handler handler, ConnectivityManager.NetworkCallback networkCallback) {
        if (c3636g0.d() < 24) {
            iLogger.c(EnumC3721i3.DEBUG, "NetworkCallbacks need Android N+.", new Object[0]);
            return false;
        }
        ConnectivityManager connectivityManagerB0 = b0(context, iLogger);
        if (connectivityManagerB0 == null) {
            return false;
        }
        if (!w.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.c(EnumC3721i3.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        try {
            if (handler != null) {
                connectivityManagerB0.registerDefaultNetworkCallback(networkCallback, handler);
                return true;
            }
            connectivityManagerB0.registerDefaultNetworkCallback(networkCallback);
            return true;
        } catch (Throwable th) {
            iLogger.b(EnumC3721i3.WARNING, "registerDefaultNetworkCallback failed", th);
            return false;
        }
    }

    public static void m0(ConnectivityManager.NetworkCallback networkCallback) {
        InterfaceC3698e0 interfaceC3698e0A = f45032o.a();
        try {
            f45033p.remove(networkCallback);
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

    private void q0(Runnable runnable) {
        try {
            this.f45037b.getExecutorService().submit(runnable);
        } catch (Throwable th) {
            this.f45037b.getLogger().b(EnumC3721i3.ERROR, "AndroidConnectionStatusProvider submit failed", th);
        }
    }

    static void r0(Context context, ILogger iLogger, ConnectivityManager.NetworkCallback networkCallback) {
        ConnectivityManager connectivityManagerB0 = b0(context, iLogger);
        if (connectivityManagerB0 == null) {
            return;
        }
        try {
            connectivityManagerB0.unregisterNetworkCallback(networkCallback);
        } catch (Throwable th) {
            iLogger.b(EnumC3721i3.WARNING, "unregisterNetworkCallback failed", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0(boolean z10) {
        InterfaceC3698e0 interfaceC3698e0A = this.f45042g.a();
        if (z10) {
            try {
                this.f45040e.clear();
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
        ConnectivityManager.NetworkCallback networkCallback = this.f45043h;
        this.f45043h = null;
        if (networkCallback != null) {
            r0(this.f45036a, this.f45037b.getLogger(), networkCallback);
        }
        this.f45044i = null;
        this.f45045j = null;
        this.f45046k = 0L;
        if (interfaceC3698e0A != null) {
            interfaceC3698e0A.close();
        }
        this.f45037b.getLogger().c(EnumC3721i3.DEBUG, "Network callback unregistered", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0(NetworkCapabilities networkCapabilities) {
        InterfaceC3698e0 interfaceC3698e0A = this.f45042g.a();
        try {
            if (networkCapabilities != null) {
                this.f45044i = networkCapabilities;
            } else {
                if (!w.a(this.f45036a, "android.permission.ACCESS_NETWORK_STATE")) {
                    this.f45037b.getLogger().c(EnumC3721i3.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                    this.f45044i = null;
                    this.f45046k = this.f45039d.a();
                    if (interfaceC3698e0A != null) {
                        interfaceC3698e0A.close();
                        return;
                    }
                    return;
                }
                if (this.f45038c.d() < 23) {
                    this.f45044i = null;
                    this.f45046k = this.f45039d.a();
                    if (interfaceC3698e0A != null) {
                        interfaceC3698e0A.close();
                        return;
                    }
                    return;
                }
                ConnectivityManager connectivityManagerB0 = b0(this.f45036a, this.f45037b.getLogger());
                if (connectivityManagerB0 != null) {
                    Network activeNetwork = connectivityManagerB0.getActiveNetwork();
                    this.f45044i = activeNetwork != null ? connectivityManagerB0.getNetworkCapabilities(activeNetwork) : null;
                } else {
                    this.f45044i = null;
                }
            }
            this.f45046k = this.f45039d.a();
            this.f45037b.getLogger().c(EnumC3721i3.DEBUG, "Cache updated - Status: " + S() + ", Type: " + Z(), new Object[0]);
        } catch (Throwable th) {
            try {
                this.f45037b.getLogger().b(EnumC3721i3.WARNING, "Failed to update connection status cache", th);
                this.f45044i = null;
                this.f45046k = this.f45039d.a();
            } catch (Throwable th2) {
                if (interfaceC3698e0A != null) {
                    try {
                        interfaceC3698e0A.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        if (interfaceC3698e0A != null) {
            interfaceC3698e0A.close();
        }
    }

    @Override // io.sentry.M
    public void F3(M.b bVar) {
        InterfaceC3698e0 interfaceC3698e0A = this.f45042g.a();
        try {
            this.f45040e.remove(bVar);
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

    @Override // io.sentry.android.core.C3628c0.a
    public void a() {
        if (this.f45043h != null) {
            return;
        }
        q0(new RunnableC3645e(this));
    }

    @Override // io.sentry.android.core.C3628c0.a
    public void b() {
        if (this.f45043h == null) {
            return;
        }
        q0(new RunnableC3644d(this));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        q0(new RunnableC3642b(this));
    }

    @Override // io.sentry.M
    public boolean k3(M.b bVar) {
        InterfaceC3698e0 interfaceC3698e0A = this.f45042g.a();
        try {
            this.f45040e.add(bVar);
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            O();
            return this.f45043h != null;
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

    @Override // io.sentry.M
    public M.a o1() {
        if (!c0()) {
            t0(null);
        }
        return S();
    }

    @Override // io.sentry.M
    public String p0() {
        if (!c0()) {
            t0(null);
        }
        return Z();
    }
}
