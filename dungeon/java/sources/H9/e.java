package H9;

import K9.C1135c;
import K9.n;
import K9.w;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C2310c;
import com.google.android.gms.common.util.m;
import com.google.android.gms.common.util.p;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p128h1.o;
import p170j8.AbstractC3851p;
import p170j8.r;
import p323s.C4101a;
import p359u.G;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Object f4248k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final Map f4249l = new C4101a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f4250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f4252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n f4253d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w f4256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final W9.b f4257h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f4254e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f4255f = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f4258i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f4259j = new CopyOnWriteArrayList();

    public interface a {
        void a(boolean z10);
    }

    private static class b implements ComponentCallbacks2C2310c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static AtomicReference f4260a = new AtomicReference();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Context context) {
            if (m.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f4260a.get() == null) {
                    b bVar = new b();
                    if (G.a(f4260a, null, bVar)) {
                        ComponentCallbacks2C2310c.c(application);
                        ComponentCallbacks2C2310c.b().a(bVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C2310c.a
        public void a(boolean z10) {
            synchronized (e.f4248k) {
                try {
                    for (e eVar : new ArrayList(e.f4249l.values())) {
                        if (eVar.f4254e.get()) {
                            eVar.z(z10);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static class c extends BroadcastReceiver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static AtomicReference f4261b = new AtomicReference();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f4262a;

        public c(Context context) {
            this.f4262a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (f4261b.get() == null) {
                c cVar = new c(context);
                if (G.a(f4261b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f4262a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (e.f4248k) {
                try {
                    Iterator it = e.f4249l.values().iterator();
                    while (it.hasNext()) {
                        ((e) it.next()).s();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c();
        }
    }

    protected e(Context context, String str, k kVar) {
        this.f4250a = (Context) r.l(context);
        this.f4251b = r.f(str);
        this.f4252c = (k) r.l(kVar);
        l lVarB = FirebaseInitProvider.b();
        p101fa.c.b("Firebase");
        p101fa.c.b("ComponentDiscovery");
        List listB = K9.f.c(context, ComponentDiscoveryService.class).b();
        p101fa.c.a();
        p101fa.c.b("Runtime");
        n.b bVarF = n.k(L9.l.INSTANCE).d(listB).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(C1135c.q(context, Context.class, new Class[0])).b(C1135c.q(this, e.class, new Class[0])).b(C1135c.q(kVar, k.class, new Class[0])).f(new p101fa.b());
        if (o.a(context) && FirebaseInitProvider.c()) {
            bVarF.b(C1135c.q(lVarB, l.class, new Class[0]));
        }
        n nVarE = bVarF.e();
        this.f4253d = nVarE;
        p101fa.c.a();
        this.f4256g = new w(new H9.c(this, context));
        this.f4257h = nVarE.g(U9.f.class);
        g(new d(this));
        p101fa.c.a();
    }

    private void A() {
        Iterator it = this.f4259j.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    public static /* synthetic */ void a(e eVar, boolean z10) {
        if (z10) {
            eVar.getClass();
        } else {
            ((U9.f) eVar.f4257h.get()).h();
        }
    }

    public static /* synthetic */ p029ba.a b(e eVar, Context context) {
        return new p029ba.a(context, eVar.r(), (T9.c) eVar.f4253d.a(T9.c.class));
    }

    private void h() {
        r.p(!this.f4255f.get(), "FirebaseApp was deleted");
    }

    private static List k() {
        ArrayList arrayList = new ArrayList();
        synchronized (f4248k) {
            try {
                Iterator it = f4249l.values().iterator();
                while (it.hasNext()) {
                    arrayList.add(((e) it.next()).p());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List m(Context context) {
        ArrayList arrayList;
        synchronized (f4248k) {
            arrayList = new ArrayList(f4249l.values());
        }
        return arrayList;
    }

    public static e n() {
        e eVar;
        synchronized (f4248k) {
            try {
                eVar = (e) f4249l.get("[DEFAULT]");
                if (eVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + p.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((U9.f) eVar.f4257h.get()).h();
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public static e o(String str) {
        e eVar;
        String str2;
        synchronized (f4248k) {
            try {
                eVar = (e) f4249l.get(y(str));
                if (eVar == null) {
                    List listK = k();
                    if (listK.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", listK);
                    }
                    throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
                }
                ((U9.f) eVar.f4257h.get()).h();
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        if (!o.a(this.f4250a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + p());
            c.b(this.f4250a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + p());
        this.f4253d.n(x());
        ((U9.f) this.f4257h.get()).h();
    }

    public static e t(Context context) {
        synchronized (f4248k) {
            try {
                if (f4249l.containsKey("[DEFAULT]")) {
                    return n();
                }
                k kVarA = k.a(context);
                if (kVarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return u(context, kVarA);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static e u(Context context, k kVar) {
        return v(context, kVar, "[DEFAULT]");
    }

    public static e v(Context context, k kVar, String str) {
        e eVar;
        b.c(context);
        String strY = y(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f4248k) {
            Map map = f4249l;
            r.p(!map.containsKey(strY), "FirebaseApp name " + strY + " already exists!");
            r.m(context, "Application context cannot be null.");
            eVar = new e(context, strY, kVar);
            map.put(strY, eVar);
        }
        eVar.s();
        return eVar;
    }

    private static String y(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(boolean z10) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.f4258i.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(z10);
        }
    }

    public void B(boolean z10) {
        h();
        if (this.f4254e.compareAndSet(!z10, z10)) {
            boolean zD = ComponentCallbacks2C2310c.b().d();
            if (z10 && zD) {
                z(true);
            } else {
                if (z10 || !zD) {
                    return;
                }
                z(false);
            }
        }
    }

    public void C(Boolean bool) {
        h();
        ((p029ba.a) this.f4256g.get()).e(bool);
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f4251b.equals(((e) obj).p());
        }
        return false;
    }

    public void g(a aVar) {
        h();
        if (this.f4254e.get() && ComponentCallbacks2C2310c.b().d()) {
            aVar.a(true);
        }
        this.f4258i.add(aVar);
    }

    public int hashCode() {
        return this.f4251b.hashCode();
    }

    public void i() {
        if (this.f4255f.compareAndSet(false, true)) {
            synchronized (f4248k) {
                f4249l.remove(this.f4251b);
            }
            A();
        }
    }

    public Object j(Class cls) {
        h();
        return this.f4253d.a(cls);
    }

    public Context l() {
        h();
        return this.f4250a;
    }

    public String p() {
        h();
        return this.f4251b;
    }

    public k q() {
        h();
        return this.f4252c;
    }

    public String r() {
        return com.google.android.gms.common.util.c.a(p().getBytes(Charset.defaultCharset())) + "+" + com.google.android.gms.common.util.c.a(q().c().getBytes(Charset.defaultCharset()));
    }

    public String toString() {
        return AbstractC3851p.c(this).a("name", this.f4251b).a("options", this.f4252c).toString();
    }

    public boolean w() {
        h();
        return ((p029ba.a) this.f4256g.get()).b();
    }

    public boolean x() {
        return "[DEFAULT]".equals(p());
    }
}
