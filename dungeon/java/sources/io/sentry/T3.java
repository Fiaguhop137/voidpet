package io.sentry;

import io.sentry.util.AbstractC3801c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class T3 implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.protocol.x f44482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Y3 f44483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Y3 f44484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient g4 f44485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected String f44486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f44487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected a4 f44488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected Map f44489h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected String f44490i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected Map f44491j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map f44492k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private EnumC3748o0 f44493l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected C3692d f44494m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected io.sentry.featureflags.b f44495n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private io.sentry.protocol.x f44496o;

    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public T3 a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            String strJ2 = null;
            io.sentry.protocol.x xVarA = null;
            Y3 y3B = null;
            Y3 y10 = null;
            ConcurrentHashMap concurrentHashMap = null;
            String strJ3 = null;
            a4 a4Var = null;
            String strJ4 = null;
            Map mapB = null;
            Map map = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "span_id":
                        y3B = new Y3.a().a(interfaceC3724j1, iLogger);
                        break;
                    case "parent_span_id":
                        y10 = (Y3) interfaceC3724j1.A1(iLogger, new Y3.a());
                        break;
                    case "description":
                        strJ3 = interfaceC3724j1.j2();
                        break;
                    case "origin":
                        strJ4 = interfaceC3724j1.j2();
                        break;
                    case "status":
                        a4Var = (a4) interfaceC3724j1.A1(iLogger, new a4.a());
                        break;
                    case "op":
                        strJ2 = interfaceC3724j1.j2();
                        break;
                    case "data":
                        map = (Map) interfaceC3724j1.z3();
                        break;
                    case "tags":
                        mapB = AbstractC3801c.b((Map) interfaceC3724j1.z3());
                        break;
                    case "trace_id":
                        xVarA = new io.sentry.protocol.x.a().a(interfaceC3724j1, iLogger);
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC3724j1.M2(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            if (xVarA == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
                iLogger.b(EnumC3721i3.ERROR, "Missing required field \"trace_id\"", illegalStateException);
                throw illegalStateException;
            }
            if (y3B == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"span_id\"");
                iLogger.b(EnumC3721i3.ERROR, "Missing required field \"span_id\"", illegalStateException2);
                throw illegalStateException2;
            }
            if (strJ2 == null) {
                strJ2 = "";
            }
            T3 t10 = new T3(xVarA, y3B, strJ2, y10, null);
            t10.r(strJ3);
            t10.v(a4Var);
            t10.t(strJ4);
            if (mapB != null) {
                t10.f44489h = mapB;
            }
            if (map != null) {
                t10.f44491j = map;
            }
            t10.w(concurrentHashMap);
            interfaceC3724j1.T();
            return t10;
        }
    }

    public T3(T3 t10) {
        this.f44489h = new ConcurrentHashMap();
        this.f44490i = "manual";
        this.f44491j = new ConcurrentHashMap();
        this.f44493l = EnumC3748o0.SENTRY;
        this.f44495n = io.sentry.featureflags.d.a();
        this.f44496o = io.sentry.protocol.x.f46302b;
        this.f44482a = t10.f44482a;
        this.f44483b = t10.f44483b;
        this.f44484c = t10.f44484c;
        u(t10.f44485d);
        this.f44486e = t10.f44486e;
        this.f44487f = t10.f44487f;
        this.f44488g = t10.f44488g;
        Map mapB = AbstractC3801c.b(t10.f44489h);
        if (mapB != null) {
            this.f44489h = mapB;
        }
        Map mapB2 = AbstractC3801c.b(t10.f44492k);
        if (mapB2 != null) {
            this.f44492k = mapB2;
        }
        this.f44494m = t10.f44494m;
        Map mapB3 = AbstractC3801c.b(t10.f44491j);
        if (mapB3 != null) {
            this.f44491j = mapB3;
        }
    }

    public T3(io.sentry.protocol.x xVar, Y3 y10, Y3 y11, String str, String str2, g4 g4Var, a4 a4Var, String str3) {
        this.f44489h = new ConcurrentHashMap();
        this.f44490i = "manual";
        this.f44491j = new ConcurrentHashMap();
        this.f44493l = EnumC3748o0.SENTRY;
        this.f44495n = io.sentry.featureflags.d.a();
        this.f44496o = io.sentry.protocol.x.f46302b;
        this.f44482a = (io.sentry.protocol.x) io.sentry.util.w.c(xVar, "traceId is required");
        this.f44483b = (Y3) io.sentry.util.w.c(y10, "spanId is required");
        this.f44486e = (String) io.sentry.util.w.c(str, "operation is required");
        this.f44484c = y11;
        this.f44487f = str2;
        this.f44488g = a4Var;
        this.f44490i = str3;
        u(g4Var);
        io.sentry.util.thread.a threadChecker = Q1.b().g().getThreadChecker();
        this.f44491j.put("thread.id", String.valueOf(threadChecker.c()));
        this.f44491j.put("thread.name", threadChecker.b());
    }

    public T3(io.sentry.protocol.x xVar, Y3 y10, String str, Y3 y11, g4 g4Var) {
        this(xVar, y10, y11, str, null, g4Var, null, "manual");
    }

    public T3(String str) {
        this(new io.sentry.protocol.x(), new Y3(), str, null, null);
    }

    public T3 a(String str, Y3 y10, Y3 y11) {
        io.sentry.protocol.x xVar = this.f44482a;
        if (y11 == null) {
            y11 = new Y3();
        }
        return new T3(xVar, y11, y10, str, null, this.f44485d, null, "manual");
    }

    public C3692d b() {
        return this.f44494m;
    }

    public String c() {
        return this.f44487f;
    }

    public io.sentry.featureflags.b d() {
        return this.f44495n;
    }

    public EnumC3748o0 e() {
        return this.f44493l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T3)) {
            return false;
        }
        T3 t10 = (T3) obj;
        return this.f44482a.equals(t10.f44482a) && this.f44483b.equals(t10.f44483b) && io.sentry.util.w.a(this.f44484c, t10.f44484c) && this.f44486e.equals(t10.f44486e) && io.sentry.util.w.a(this.f44487f, t10.f44487f) && n() == t10.n();
    }

    public String f() {
        return this.f44486e;
    }

    public String g() {
        return this.f44490i;
    }

    public Y3 h() {
        return this.f44484c;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f44482a, this.f44483b, this.f44484c, this.f44486e, this.f44487f, n());
    }

    public Boolean i() {
        g4 g4Var = this.f44485d;
        if (g4Var == null) {
            return null;
        }
        return g4Var.b();
    }

    public io.sentry.protocol.x j() {
        return this.f44496o;
    }

    public Boolean k() {
        g4 g4Var = this.f44485d;
        if (g4Var == null) {
            return null;
        }
        return g4Var.e();
    }

    public g4 l() {
        return this.f44485d;
    }

    public Y3 m() {
        return this.f44483b;
    }

    public a4 n() {
        return this.f44488g;
    }

    public Map o() {
        return this.f44489h;
    }

    public io.sentry.protocol.x p() {
        return this.f44482a;
    }

    public void q(String str, Object obj) {
        if (str == null) {
            return;
        }
        if (obj == null) {
            this.f44491j.remove(str);
        } else {
            this.f44491j.put(str, obj);
        }
    }

    public void r(String str) {
        this.f44487f = str;
    }

    public void s(EnumC3748o0 enumC3748o0) {
        this.f44493l = enumC3748o0;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        interfaceC3729k1.d("trace_id");
        this.f44482a.serialize(interfaceC3729k1, iLogger);
        interfaceC3729k1.d("span_id");
        this.f44483b.serialize(interfaceC3729k1, iLogger);
        if (this.f44484c != null) {
            interfaceC3729k1.d("parent_span_id");
            this.f44484c.serialize(interfaceC3729k1, iLogger);
        }
        interfaceC3729k1.d("op").e(this.f44486e);
        if (this.f44487f != null) {
            interfaceC3729k1.d("description").e(this.f44487f);
        }
        if (n() != null) {
            interfaceC3729k1.d("status").j(iLogger, n());
        }
        if (this.f44490i != null) {
            interfaceC3729k1.d("origin").j(iLogger, this.f44490i);
        }
        if (!this.f44489h.isEmpty()) {
            interfaceC3729k1.d("tags").j(iLogger, this.f44489h);
        }
        if (!this.f44491j.isEmpty()) {
            interfaceC3729k1.d("data").j(iLogger, this.f44491j);
        }
        Map map = this.f44492k;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC3729k1.d(str).j(iLogger, this.f44492k.get(str));
            }
        }
        interfaceC3729k1.T();
    }

    public void t(String str) {
        this.f44490i = str;
    }

    public void u(g4 g4Var) {
        this.f44485d = g4Var;
        C3692d c3692d = this.f44494m;
        if (c3692d != null) {
            c3692d.G(g4Var);
        }
    }

    public void v(a4 a4Var) {
        this.f44488g = a4Var;
    }

    public void w(Map map) {
        this.f44492k = map;
    }
}
