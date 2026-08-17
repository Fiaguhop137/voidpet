package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.C3784s1;
import io.sentry.ILogger;
import io.sentry.InterfaceC3698e0;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import io.sentry.T3;
import io.sentry.util.C3799a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3759c implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f46158a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final C3799a f46159b = new C3799a();

    /* JADX INFO: renamed from: io.sentry.protocol.c$a */
    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3759c a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            C3759c c3759c = new C3759c();
            interfaceC3724j1.I();
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "device":
                        c3759c.q(new C3761e.a().a(interfaceC3724j1, iLogger));
                        break;
                    case "spring":
                        c3759c.y(new F.a().a(interfaceC3724j1, iLogger));
                        break;
                    case "response":
                        c3759c.w(new p.a().a(interfaceC3724j1, iLogger));
                        break;
                    case "profile":
                        c3759c.v(new C3784s1.a().a(interfaceC3724j1, iLogger));
                        break;
                    case "feedback":
                        c3759c.s(new C3764h.a().a(interfaceC3724j1, iLogger));
                        break;
                    case "os":
                        c3759c.u(new n.a().a(interfaceC3724j1, iLogger));
                        break;
                    case "app":
                        c3759c.o(new C3757a.C0540a().a(interfaceC3724j1, iLogger));
                        break;
                    case "gpu":
                        c3759c.t(new C3766j.a().a(interfaceC3724j1, iLogger));
                        break;
                    case "flags":
                        c3759c.r(new C3763g.a().a(interfaceC3724j1, iLogger));
                        break;
                    case "trace":
                        c3759c.z(new T3.a().a(interfaceC3724j1, iLogger));
                        break;
                    case "browser":
                        c3759c.p(new C3758b.a().a(interfaceC3724j1, iLogger));
                        break;
                    case "runtime":
                        c3759c.x(new z.a().a(interfaceC3724j1, iLogger));
                        break;
                    default:
                        Object objZ3 = interfaceC3724j1.z3();
                        if (objZ3 == null) {
                            break;
                        } else {
                            c3759c.l(strX0, objZ3);
                            break;
                        }
                        break;
                }
            }
            interfaceC3724j1.T();
            return c3759c;
        }
    }

    public C3759c() {
    }

    public C3759c(C3759c c3759c) {
        for (Map.Entry entry : c3759c.b()) {
            if (entry != null) {
                Object value = entry.getValue();
                if ("app".equals(entry.getKey()) && (value instanceof C3757a)) {
                    o(new C3757a((C3757a) value));
                } else if ("browser".equals(entry.getKey()) && (value instanceof C3758b)) {
                    p(new C3758b((C3758b) value));
                } else if ("device".equals(entry.getKey()) && (value instanceof C3761e)) {
                    q(new C3761e((C3761e) value));
                } else if ("os".equals(entry.getKey()) && (value instanceof n)) {
                    u(new n((n) value));
                } else if ("runtime".equals(entry.getKey()) && (value instanceof z)) {
                    x(new z((z) value));
                } else if ("feedback".equals(entry.getKey()) && (value instanceof C3764h)) {
                    s(new C3764h((C3764h) value));
                } else if ("gpu".equals(entry.getKey()) && (value instanceof C3766j)) {
                    t(new C3766j((C3766j) value));
                } else if ("trace".equals(entry.getKey()) && (value instanceof T3)) {
                    z(new T3((T3) value));
                } else if ("profile".equals(entry.getKey()) && (value instanceof C3784s1)) {
                    v(new C3784s1((C3784s1) value));
                } else if ("response".equals(entry.getKey()) && (value instanceof p)) {
                    w(new p((p) value));
                } else if ("spring".equals(entry.getKey()) && (value instanceof F)) {
                    y(new F((F) value));
                } else {
                    l((String) entry.getKey(), value);
                }
            }
        }
    }

    private Object A(String str, Class cls) {
        Object objC = c(str);
        if (cls.isInstance(objC)) {
            return cls.cast(objC);
        }
        return null;
    }

    public boolean a(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f46158a.containsKey(obj);
    }

    public Set b() {
        return this.f46158a.entrySet();
    }

    public Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        return this.f46158a.get(obj);
    }

    public C3757a d() {
        return (C3757a) A("app", C3757a.class);
    }

    public C3761e e() {
        return (C3761e) A("device", C3761e.class);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C3759c)) {
            return false;
        }
        return this.f46158a.equals(((C3759c) obj).f46158a);
    }

    public C3763g f() {
        return (C3763g) A("flags", C3763g.class);
    }

    public C3764h g() {
        return (C3764h) A("feedback", C3764h.class);
    }

    public n h() {
        return (n) A("os", n.class);
    }

    public int hashCode() {
        return this.f46158a.hashCode();
    }

    public z i() {
        return (z) A("runtime", z.class);
    }

    public T3 j() {
        return (T3) A("trace", T3.class);
    }

    public Enumeration k() {
        return this.f46158a.keys();
    }

    public Object l(String str, Object obj) {
        if (str == null) {
            return null;
        }
        return obj == null ? this.f46158a.remove(str) : this.f46158a.put(str, obj);
    }

    public void m(C3759c c3759c) {
        if (c3759c == null) {
            return;
        }
        this.f46158a.putAll(c3759c.f46158a);
    }

    public Object n(Object obj) {
        if (obj == null) {
            return null;
        }
        return this.f46158a.remove(obj);
    }

    public void o(C3757a c3757a) {
        l("app", c3757a);
    }

    public void p(C3758b c3758b) {
        l("browser", c3758b);
    }

    public void q(C3761e c3761e) {
        l("device", c3761e);
    }

    public void r(C3763g c3763g) {
        l("flags", c3763g);
    }

    public void s(C3764h c3764h) {
        l("feedback", c3764h);
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        ArrayList<String> list = Collections.list(k());
        Collections.sort(list);
        for (String str : list) {
            Object objC = c(str);
            if (objC != null) {
                interfaceC3729k1.d(str).j(iLogger, objC);
            }
        }
        interfaceC3729k1.T();
    }

    public void t(C3766j c3766j) {
        l("gpu", c3766j);
    }

    public void u(n nVar) {
        l("os", nVar);
    }

    public void v(C3784s1 c3784s1) {
        io.sentry.util.w.c(c3784s1, "profileContext is required");
        l("profile", c3784s1);
    }

    public void w(p pVar) {
        InterfaceC3698e0 interfaceC3698e0A = this.f46159b.a();
        try {
            l("response", pVar);
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

    public void x(z zVar) {
        l("runtime", zVar);
    }

    public void y(F f10) {
        l("spring", f10);
    }

    public void z(T3 t10) {
        io.sentry.util.w.c(t10, "traceContext is required");
        l("trace", t10);
    }
}
