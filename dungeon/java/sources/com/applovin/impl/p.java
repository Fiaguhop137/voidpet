package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.Axon;
import com.applovin.sdk.AxonInitializationConfiguration;
import com.applovin.sdk.AxonUserData;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import p184k4.C3902f0;
import p184k4.RunnableC3898d0;
import p184k4.RunnableC3900e0;
import p184k4.RunnableC3904g0;

/* JADX INFO: loaded from: classes.dex */
public final class p extends Axon implements o {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static p f28245H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static Context f28247J;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static volatile b f28249L;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Axon.InitializationListener f28252B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f28253C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Long f28254D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f28255E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public AxonUserData f28256F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f28257G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f28258a;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AxonInitializationConfiguration f28279v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f28282y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f28283z;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final Object f28246I = new Object();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final long f28248K = System.currentTimeMillis();

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final Object f28250M = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f28259b = "Axon";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f28260c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f28261d = new AtomicReference();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference f28262e = new AtomicReference();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f28263f = new AtomicReference();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f28264g = new AtomicReference();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f28265h = new AtomicReference();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicReference f28266i = new AtomicReference();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference f28267j = new AtomicReference();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicReference f28268k = new AtomicReference();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicReference f28269l = new AtomicReference();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AtomicReference f28270m = new AtomicReference();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AtomicReference f28271n = new AtomicReference();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicReference f28272o = new AtomicReference();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicReference f28273p = new AtomicReference();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicReference f28274q = new AtomicReference();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AtomicReference f28275r = new AtomicReference();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AtomicReference f28276s = new AtomicReference();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AtomicReference f28277t = new AtomicReference();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AtomicReference f28278u = new AtomicReference();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f28280w = new Object();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f28281x = new Object();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final long f28251A = System.currentTimeMillis();

    public static b a(Context context) {
        if (f28249L == null) {
            synchronized (f28250M) {
                try {
                    if (f28249L == null) {
                        f28249L = new b(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f28249L;
    }

    public static p b(Context context) {
        p pVar;
        if (f28247J == null && context != null) {
            f28247J = context.getApplicationContext();
        }
        a(context);
        p pVar2 = f28245H;
        if (pVar2 != null) {
            return pVar2;
        }
        synchronized (f28246I) {
            try {
                if (f28245H == null) {
                    f28245H = new p();
                }
                pVar = f28245H;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pVar;
    }

    public final void a() {
        n().a(new y2(this, new C3902f0(this)), 0L);
    }

    public final void a(Axon.InitializationListener initializationListener) {
        g();
        if (p1.f28289b) {
            g().a("AxonSdk", "Calling back publisher's initialization completion handler...");
        }
        initializationListener.onInitialized();
    }

    public final void a(Boolean bool, String str) {
        if (s()) {
            synchronized (this.f28281x) {
                n().b();
                a();
            }
        }
        g();
        if (p1.f28289b) {
            g().b("AxonSdk", "Toggled '" + str + "' to " + bool);
        }
        w0 eventService = getEventService();
        Map map = CollectionUtils.map("value", bool);
        eventService.getClass();
        eventService.trackEvent(str, map, new HashMap());
    }

    public final void a(JSONObject jSONObject) {
        b(jSONObject);
        this.f28257G = JsonUtils.getBoolean(jSONObject, "ed", Boolean.FALSE).booleanValue();
        p pVar = e().f27984a;
        JsonUtils.deserialize((String) pVar.l().a(m2.f28171Z));
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, "default_browser_package_name", StringUtils.emptyIfNull(k0.f28078i));
        JsonUtils.putBoolean(jSONObject2, "init_success", JsonUtils.isValid(jSONObject));
        JsonUtils.putInt(jSONObject2, "default_preferences_key_count", PreferenceManager.getDefaultSharedPreferences(f28247J).getAll().size());
        p().b(b1.f27947e, CollectionUtils.map("details", jSONObject2.toString()));
        Iterator it = JsonUtils.getList(jSONObject, "error_messages", Collections.EMPTY_LIST).iterator();
        while (it.hasNext()) {
            p1.c("AxonSdk", (String) it.next(), null);
        }
        n().a(new z2(this));
    }

    public final void a(boolean z10) {
        synchronized (this.f28281x) {
            this.f28282y = z10;
        }
        if (z10) {
            n().a();
            if (this.f28257G) {
                this.f28255E = true;
            }
            d().c();
            Axon.InitializationListener initializationListenerB = b();
            if (initializationListenerB != null) {
                JSONObject jSONObject = new JSONObject();
                JsonUtils.putBoolean(jSONObject, "enabled", s());
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f28283z;
                HashMap map = new HashMap();
                map.put("duration_ms", String.valueOf(jCurrentTimeMillis));
                map.put("details", jSONObject.toString());
                p().b(b1.f27951i, map);
                i3.a(false, new RunnableC3898d0(this, initializationListenerB));
            }
        }
    }

    public final Axon.InitializationListener b() {
        Axon.InitializationListener initializationListener;
        synchronized (this.f28281x) {
            initializationListener = this.f28252B;
            this.f28252B = null;
        }
        return initializationListener;
    }

    public final void b(JSONObject jSONObject) {
        try {
            if (jSONObject.has("settings")) {
                n2 n2VarL = l();
                if (jSONObject.isNull("settings")) {
                    return;
                }
                n2VarL.a(jSONObject.getJSONObject("settings"));
                n2VarL.a();
            }
        } catch (JSONException e10) {
            g();
            if (p1.f28289b) {
                g().a("AxonSdk", "Unable to parse settings out of API response", e10);
            }
        }
    }

    public final k0 c() {
        Object k0Var = this.f28268k.get();
        if (k0Var == null) {
            synchronized (this.f28268k) {
                try {
                    k0Var = this.f28268k.get();
                    if (k0Var == null) {
                        k0Var = new k0(this);
                        this.f28268k.set(k0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (k0Var == this.f28268k) {
            k0Var = null;
        }
        return (k0) k0Var;
    }

    public final void c(JSONObject jSONObject) {
        b(jSONObject);
        String string = JsonUtils.getString(jSONObject, "persisted_data", null);
        if (StringUtils.isValidString(string)) {
            m().getClass();
            p2.a("com.applovin.sdk.persisted_data", string, p2.a(f28247J), null);
            g();
            if (p1.f28289b) {
                g().b("AxonSdk", "Updated persisted data");
            }
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "filesystem_values", (JSONObject) null);
        if (jSONObject2 == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(f28247J).edit();
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object object = JsonUtils.getObject(jSONObject2, next, null);
            if (object != null) {
                p2.a(next, object, null, editorEdit);
            }
        }
        if (((Boolean) l().a(m2.f28139J)).booleanValue()) {
            p2.a(editorEdit);
        } else {
            editorEdit.apply();
        }
    }

    public final r0 d() {
        Object r0Var = this.f28272o.get();
        if (r0Var == null) {
            synchronized (this.f28272o) {
                try {
                    r0Var = this.f28272o.get();
                    if (r0Var == null) {
                        r0Var = new r0(this);
                        this.f28272o.set(r0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (r0Var == this.f28272o) {
            r0Var = null;
        }
        return (r0) r0Var;
    }

    public final u0 e() {
        Object u0Var = this.f28260c.get();
        if (u0Var == null) {
            synchronized (this.f28260c) {
                try {
                    u0Var = this.f28260c.get();
                    if (u0Var == null) {
                        u0Var = new u0(this);
                        this.f28260c.set(u0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (u0Var == this.f28260c) {
            u0Var = null;
        }
        return (u0) u0Var;
    }

    public final z0 f() {
        Object z0Var = this.f28276s.get();
        if (z0Var == null) {
            synchronized (this.f28276s) {
                try {
                    z0Var = this.f28276s.get();
                    if (z0Var == null) {
                        z0Var = new z0(this);
                        this.f28276s.set(z0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z0Var == this.f28276s) {
            z0Var = null;
        }
        return (z0) z0Var;
    }

    public final p1 g() {
        Object p1Var = this.f28262e.get();
        if (p1Var == null) {
            synchronized (this.f28262e) {
                try {
                    p1Var = this.f28262e.get();
                    if (p1Var == null) {
                        p1Var = new p1();
                        this.f28262e.set(p1Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (p1Var == this.f28262e) {
            p1Var = null;
        }
        return (p1) p1Var;
    }

    @Override // com.applovin.sdk.Axon
    public final w0 getEventService() {
        Object w0Var = this.f28270m.get();
        if (w0Var == null) {
            synchronized (this.f28270m) {
                try {
                    w0Var = this.f28270m.get();
                    if (w0Var == null) {
                        w0Var = new w0(this);
                        this.f28270m.set(w0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (w0Var == this.f28270m) {
            w0Var = null;
        }
        return (w0) w0Var;
    }

    @Override // com.applovin.sdk.Axon
    public final AxonUserData getUserData() {
        return this.f28256F;
    }

    public final x1 h() {
        Object x1Var = this.f28273p.get();
        if (x1Var == null) {
            synchronized (this.f28273p) {
                try {
                    x1Var = this.f28273p.get();
                    if (x1Var == null) {
                        x1Var = new x1(this);
                        this.f28273p.set(x1Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (x1Var == this.f28273p) {
            x1Var = null;
        }
        return (x1) x1Var;
    }

    public final d2 i() {
        Object d2Var = this.f28271n.get();
        if (d2Var == null) {
            synchronized (this.f28271n) {
                try {
                    d2Var = this.f28271n.get();
                    if (d2Var == null) {
                        d2Var = new d2(this);
                        this.f28271n.set(d2Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (d2Var == this.f28271n) {
            d2Var = null;
        }
        return (d2) d2Var;
    }

    @Override // com.applovin.sdk.Axon
    public final void initialize(AxonInitializationConfiguration axonInitializationConfiguration, Axon.InitializationListener initializationListener) {
        synchronized (this.f28280w) {
            try {
                if (this.f28279v != null) {
                    p1.c("AxonSdk", "Axon SDK already initialized with Key: " + this.f28258a + ". Ignoring the provided initialization configuration.", null);
                    if (!s() || initializationListener == null) {
                        return;
                    }
                    i3.a(true, new RunnableC3904g0(initializationListener));
                    return;
                }
                this.f28283z = System.currentTimeMillis();
                this.f28279v = axonInitializationConfiguration;
                this.f28252B = initializationListener;
                String key = axonInitializationConfiguration.getKey();
                this.f28258a = key;
                if (TextUtils.isEmpty(key)) {
                    p1.c("AxonSdk", "Axon SDK cannot be initialized: no Event key provided.", null);
                }
                int length = this.f28258a.length();
                if (length != 86 && length != 36) {
                    p1.c("AxonSdk", "Key provided is invalid (" + this.f28258a + "). Expected length 36 or 86 characters.", null);
                }
                this.f28259b = length == 86 ? "AppLovin-MAX" : "Axon";
                t();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.applovin.sdk.Axon
    public final boolean isDebuggerEnabled() {
        return this.f28255E;
    }

    @Override // com.applovin.sdk.Axon
    public final boolean isVerboseLoggingEnabled() {
        return p1.f28289b;
    }

    public final g2 j() {
        Object g2Var = this.f28267j.get();
        if (g2Var == null) {
            synchronized (this.f28267j) {
                try {
                    g2Var = this.f28267j.get();
                    if (g2Var == null) {
                        g2Var = new g2(e());
                        this.f28267j.set(g2Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (g2Var == this.f28267j) {
            g2Var = null;
        }
        return (g2) g2Var;
    }

    public final SessionTracker k() {
        Object sessionTracker = this.f28269l.get();
        if (sessionTracker == null) {
            synchronized (this.f28269l) {
                try {
                    sessionTracker = this.f28269l.get();
                    if (sessionTracker == null) {
                        sessionTracker = new SessionTracker(this);
                        this.f28269l.set(sessionTracker);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (sessionTracker == this.f28269l) {
            sessionTracker = null;
        }
        return (SessionTracker) sessionTracker;
    }

    public final n2 l() {
        Object n2Var = this.f28263f.get();
        if (n2Var == null) {
            synchronized (this.f28263f) {
                try {
                    n2Var = this.f28263f.get();
                    if (n2Var == null) {
                        n2Var = new n2(this);
                        this.f28263f.set(n2Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (n2Var == this.f28263f) {
            n2Var = null;
        }
        return (n2) n2Var;
    }

    public final p2 m() {
        Object p2Var = this.f28275r.get();
        if (p2Var == null) {
            synchronized (this.f28275r) {
                try {
                    p2Var = this.f28275r.get();
                    if (p2Var == null) {
                        p2Var = new p2(this);
                        this.f28275r.set(p2Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (p2Var == this.f28275r) {
            p2Var = null;
        }
        return (p2) p2Var;
    }

    public final d3 n() {
        Object d3Var = this.f28265h.get();
        if (d3Var == null) {
            synchronized (this.f28265h) {
                try {
                    d3Var = this.f28265h.get();
                    if (d3Var == null) {
                        d3Var = new d3(this);
                        this.f28265h.set(d3Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (d3Var == this.f28265h) {
            d3Var = null;
        }
        return (d3) d3Var;
    }

    public final h3 o() {
        Object h3Var = this.f28264g.get();
        if (h3Var == null) {
            synchronized (this.f28264g) {
                try {
                    h3Var = this.f28264g.get();
                    if (h3Var == null) {
                        h3Var = new h3(this);
                        this.f28264g.set(h3Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (h3Var == this.f28264g) {
            h3Var = null;
        }
        return (h3) h3Var;
    }

    public final m3 p() {
        Object m3Var = this.f28261d.get();
        if (m3Var == null) {
            synchronized (this.f28261d) {
                try {
                    m3Var = this.f28261d.get();
                    if (m3Var == null) {
                        m3Var = new m3(this);
                        this.f28261d.set(m3Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (m3Var == this.f28261d) {
            m3Var = null;
        }
        return (m3) m3Var;
    }

    @Override // com.applovin.sdk.Axon
    public final void processDeepLink(Uri uri) {
        Object s0Var = this.f28278u.get();
        if (s0Var == null) {
            synchronized (this.f28278u) {
                try {
                    s0Var = this.f28278u.get();
                    if (s0Var == null) {
                        s0Var = new s0(this);
                        this.f28278u.set(s0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (s0Var == this.f28278u) {
            s0Var = null;
        }
        ((s0) s0Var).a(uri);
    }

    public final n3 q() {
        Object n3Var = this.f28274q.get();
        if (n3Var == null) {
            synchronized (this.f28274q) {
                try {
                    n3Var = this.f28274q.get();
                    if (n3Var == null) {
                        n3Var = new n3();
                        this.f28274q.set(n3Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (n3Var == this.f28274q) {
            n3Var = null;
        }
        return (n3) n3Var;
    }

    public final q3 r() {
        Object q3Var = this.f28277t.get();
        if (q3Var == null) {
            synchronized (this.f28277t) {
                try {
                    q3Var = this.f28277t.get();
                    if (q3Var == null) {
                        q3Var = new q3(this);
                        this.f28277t.set(q3Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (q3Var == this.f28277t) {
            q3Var = null;
        }
        return (q3) q3Var;
    }

    public final boolean s() {
        boolean z10;
        synchronized (this.f28281x) {
            z10 = this.f28282y;
        }
        return z10;
    }

    @Override // com.applovin.sdk.Axon
    public final void setDebuggerEnabled(boolean z10) {
        this.f28255E = z10;
    }

    @Override // com.applovin.sdk.Axon
    public final void setUserData(AxonUserData axonUserData) {
        this.f28256F = axonUserData;
    }

    @Override // com.applovin.sdk.Axon
    public final void setVerboseLoggingEnabled(boolean z10) {
        g().getClass();
        p1.f28289b = z10;
    }

    public final void t() {
        synchronized (this.f28281x) {
            RunnableC3900e0 runnableC3900e0 = new RunnableC3900e0(this);
            Handler handler = i3.f28069a;
            Thread thread = new Thread(runnableC3900e0);
            thread.setPriority(1);
            thread.start();
        }
    }

    public final void u() {
        p2 p2VarM = m();
        o2 o2Var = o2.f28237c;
        p2VarM.getClass();
        this.f28253C = ((Long) p2.a("com.applovin.sdk.launch_count", 0L, Long.class, p2.a(f28247J), true)).longValue() + 1;
        p2 p2VarM2 = m();
        Long lValueOf = Long.valueOf(this.f28253C);
        p2VarM2.getClass();
        p2.a(o2Var, lValueOf);
        o2 o2Var2 = o2.f28238d;
        this.f28254D = (Long) p2.a("com.applovin.sdk.last_launch_timestamp", null, Long.class, p2.a(f28247J), true);
        p2 p2VarM3 = m();
        Long lValueOf2 = Long.valueOf(f28248K);
        p2VarM3.getClass();
        p2.a(o2Var2, lValueOf2);
        m3 m3VarP = p();
        b1 b1Var = b1.f27946d;
        m3VarP.getClass();
        m3VarP.b(b1Var, new HashMap());
        a();
    }
}
