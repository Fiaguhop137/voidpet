package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.C2333b;
import com.google.android.gms.common.C2341j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p170j8.AbstractC3844i;
import p170j8.AbstractC3857w;
import p170j8.C3850o;
import p170j8.C3853s;
import p170j8.C3854t;
import p170j8.C3856v;
import p170j8.InterfaceC3858x;
import p323s.C4102b;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2314g implements Handler.Callback {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Status f31815p = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Status f31816q = new Status(4, "The user must be signed in to make this API call.");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Object f31817r = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static C2314g f31818s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C3856v f31821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC3858x f31822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f31823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C2341j f31824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p170j8.J f31825g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Handler f31832n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile boolean f31833o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f31819a = 10000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f31820b = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicInteger f31826h = new AtomicInteger(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicInteger f31827i = new AtomicInteger(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f31828j = new ConcurrentHashMap(5, 0.75f, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C2331y f31829k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Set f31830l = new C4102b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Set f31831m = new C4102b();

    private C2314g(Context context, Looper looper, C2341j c2341j) {
        this.f31833o = true;
        this.f31823e = context;
        I8.h hVar = new I8.h(looper, this);
        this.f31832n = hVar;
        this.f31824f = c2341j;
        this.f31825g = new p170j8.J(c2341j);
        if (com.google.android.gms.common.util.i.a(context)) {
            this.f31833o = false;
        }
        hVar.sendMessage(hVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (f31817r) {
            try {
                C2314g c2314g = f31818s;
                if (c2314g != null) {
                    c2314g.f31827i.incrementAndGet();
                    Handler handler = c2314g.f31832n;
                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status g(C2309b c2309b, C2333b c2333b) {
        return new Status(c2333b, "API: " + c2309b.b() + " is not available on this device. Connection failed with: " + String.valueOf(c2333b));
    }

    private final G h(p135h8.e eVar) {
        Map map = this.f31828j;
        C2309b c2309bM = eVar.m();
        G g10 = (G) map.get(c2309bM);
        if (g10 == null) {
            g10 = new G(this, eVar);
            this.f31828j.put(c2309bM, g10);
        }
        if (g10.a()) {
            this.f31831m.add(c2309bM);
        }
        g10.E();
        return g10;
    }

    private final InterfaceC3858x i() {
        if (this.f31822d == null) {
            this.f31822d = AbstractC3857w.a(this.f31823e);
        }
        return this.f31822d;
    }

    private final void j() {
        C3856v c3856v = this.f31821c;
        if (c3856v != null) {
            if (c3856v.a4() > 0 || e()) {
                i().d(c3856v);
            }
            this.f31821c = null;
        }
    }

    private final void k(TaskCompletionSource taskCompletionSource, int i10, p135h8.e eVar) {
        Q qA;
        if (i10 == 0 || (qA = Q.a(this, i10, eVar.m())) == null) {
            return;
        }
        Task task = taskCompletionSource.getTask();
        Handler handler = this.f31832n;
        handler.getClass();
        task.addOnCompleteListener(new A(handler), qA);
    }

    public static C2314g u(Context context) {
        C2314g c2314g;
        synchronized (f31817r) {
            try {
                if (f31818s == null) {
                    f31818s = new C2314g(context.getApplicationContext(), AbstractC3844i.c().getLooper(), C2341j.o());
                }
                c2314g = f31818s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2314g;
    }

    public final void A(p135h8.e eVar, int i10, AbstractC2311d abstractC2311d) {
        this.f31832n.sendMessage(this.f31832n.obtainMessage(4, new T(new b0(i10, abstractC2311d), this.f31827i.get(), eVar)));
    }

    public final void B(p135h8.e eVar, int i10, AbstractC2326t abstractC2326t, TaskCompletionSource taskCompletionSource, r rVar) {
        k(taskCompletionSource, abstractC2326t.d(), eVar);
        this.f31832n.sendMessage(this.f31832n.obtainMessage(4, new T(new c0(i10, abstractC2326t, taskCompletionSource, rVar), this.f31827i.get(), eVar)));
    }

    final void C(C3850o c3850o, int i10, long j10, int i11) {
        this.f31832n.sendMessage(this.f31832n.obtainMessage(18, new S(c3850o, i10, j10, i11)));
    }

    public final void D(C2333b c2333b, int i10) {
        if (f(c2333b, i10)) {
            return;
        }
        Handler handler = this.f31832n;
        handler.sendMessage(handler.obtainMessage(5, i10, 0, c2333b));
    }

    public final void E() {
        Handler handler = this.f31832n;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void F(p135h8.e eVar) {
        Handler handler = this.f31832n;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final void b(C2331y c2331y) {
        synchronized (f31817r) {
            try {
                if (this.f31829k != c2331y) {
                    this.f31829k = c2331y;
                    this.f31830l.clear();
                }
                this.f31830l.addAll(c2331y.i());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final void c(C2331y c2331y) {
        synchronized (f31817r) {
            try {
                if (this.f31829k == c2331y) {
                    this.f31829k = null;
                    this.f31830l.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final boolean e() {
        if (this.f31820b) {
            return false;
        }
        C3854t c3854tA = C3853s.b().a();
        if (c3854tA != null && !c3854tA.c4()) {
            return false;
        }
        int iA = this.f31825g.a(this.f31823e, 203400000);
        return iA == -1 || iA == 0;
    }

    final boolean f(C2333b c2333b, int i10) {
        return this.f31824f.z(this.f31823e, c2333b, i10);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:64:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ff  */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x01c1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x01ff, please report this as an issue */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        G g10 = null;
        switch (i10) {
            case 1:
                this.f31819a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f31832n.removeMessages(12);
                for (C2309b c2309b : this.f31828j.keySet()) {
                    Handler handler = this.f31832n;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c2309b), this.f31819a);
                }
                return true;
            case 2:
                android.support.v4.media.session.b.a(message.obj);
                throw null;
            case 3:
                for (G g11 : this.f31828j.values()) {
                    g11.D();
                    g11.E();
                }
                return true;
            case 4:
            case 8:
            case 13:
                T t10 = (T) message.obj;
                G gH = (G) this.f31828j.get(t10.f31783c.m());
                if (gH == null) {
                    gH = h(t10.f31783c);
                }
                if (!gH.a() || this.f31827i.get() == t10.f31782b) {
                    gH.F(t10.f31781a);
                } else {
                    t10.f31781a.a(f31815p);
                    gH.K();
                }
                return true;
            case 5:
                int i11 = message.arg1;
                C2333b c2333b = (C2333b) message.obj;
                for (G g12 : this.f31828j.values()) {
                    if (g12.s() == i11) {
                        g10 = g12;
                        if (g10 != null) {
                            Log.wtf("GoogleApiManager", "Could not find API instance " + i11 + " while trying to fail enqueued calls.", new Exception());
                        } else if (c2333b.b4() == 13) {
                            g10.e(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f31824f.e(c2333b.b4()) + ": " + c2333b.c4()));
                        } else {
                            g10.e(g(g10.f31747g, c2333b));
                        }
                        return true;
                    }
                }
                if (g10 != null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i11 + " while trying to fail enqueued calls.", new Exception());
                } else if (c2333b.b4() == 13) {
                    g10.e(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f31824f.e(c2333b.b4()) + ": " + c2333b.c4()));
                } else {
                    g10.e(g(g10.f31747g, c2333b));
                }
                return true;
            case 6:
                if (this.f31823e.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C2310c.c((Application) this.f31823e.getApplicationContext());
                    ComponentCallbacks2C2310c.b().a(new B(this));
                    if (!ComponentCallbacks2C2310c.b().e(true)) {
                        this.f31819a = 300000L;
                    }
                }
                return true;
            case 7:
                h((p135h8.e) message.obj);
                return true;
            case 9:
                if (this.f31828j.containsKey(message.obj)) {
                    ((G) this.f31828j.get(message.obj)).J();
                }
                return true;
            case 10:
                Iterator it = this.f31831m.iterator();
                while (it.hasNext()) {
                    G g13 = (G) this.f31828j.remove((C2309b) it.next());
                    if (g13 != null) {
                        g13.K();
                    }
                }
                this.f31831m.clear();
                return true;
            case 11:
                if (this.f31828j.containsKey(message.obj)) {
                    ((G) this.f31828j.get(message.obj)).L();
                }
                return true;
            case 12:
                if (this.f31828j.containsKey(message.obj)) {
                    ((G) this.f31828j.get(message.obj)).b();
                }
                return true;
            case 14:
                android.support.v4.media.session.b.a(message.obj);
                throw null;
            case 15:
                I i12 = (I) message.obj;
                if (this.f31828j.containsKey(i12.f31758a)) {
                    G.B((G) this.f31828j.get(i12.f31758a), i12);
                }
                return true;
            case 16:
                I i13 = (I) message.obj;
                if (this.f31828j.containsKey(i13.f31758a)) {
                    G.C((G) this.f31828j.get(i13.f31758a), i13);
                }
                return true;
            case 17:
                j();
                return true;
            case 18:
                S s10 = (S) message.obj;
                if (s10.f31779c == 0) {
                    i().d(new C3856v(s10.f31778b, Arrays.asList(s10.f31777a)));
                } else {
                    C3856v c3856v = this.f31821c;
                    if (c3856v != null) {
                        List listB4 = c3856v.b4();
                        if (c3856v.a4() != s10.f31778b || (listB4 != null && listB4.size() >= s10.f31780d)) {
                            this.f31832n.removeMessages(17);
                            j();
                        } else {
                            this.f31821c.c4(s10.f31777a);
                        }
                    }
                    if (this.f31821c == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(s10.f31777a);
                        this.f31821c = new C3856v(s10.f31778b, arrayList);
                        Handler handler2 = this.f31832n;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), s10.f31779c);
                    }
                }
                return true;
            case 19:
                this.f31820b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i10);
                return false;
        }
    }

    public final int l() {
        return this.f31826h.getAndIncrement();
    }

    final G t(C2309b c2309b) {
        return (G) this.f31828j.get(c2309b);
    }
}
