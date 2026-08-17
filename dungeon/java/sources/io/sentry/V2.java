package io.sentry;

import io.sentry.util.AbstractC3801c;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class V2 extends AbstractC3725j2 implements B0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Date f44520p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private io.sentry.protocol.m f44521q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f44522r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private N3 f44523s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private N3 f44524t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private EnumC3721i3 f44525u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f44526v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List f44527w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Map f44528x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Map f44529y;

    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public V2 a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            V2 v10 = new V2();
            AbstractC3725j2.a aVar = new AbstractC3725j2.a();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "fingerprint":
                        List list = (List) interfaceC3724j1.z3();
                        if (list == null) {
                            break;
                        } else {
                            v10.f44527w = list;
                            break;
                        }
                        break;
                    case "threads":
                        interfaceC3724j1.I();
                        interfaceC3724j1.X0();
                        v10.f44523s = new N3(interfaceC3724j1.L3(iLogger, new io.sentry.protocol.D.a()));
                        interfaceC3724j1.T();
                        break;
                    case "logger":
                        v10.f44522r = interfaceC3724j1.D2();
                        break;
                    case "timestamp":
                        Date dateE1 = interfaceC3724j1.e1(iLogger);
                        if (dateE1 == null) {
                            break;
                        } else {
                            v10.f44520p = dateE1;
                            break;
                        }
                        break;
                    case "level":
                        v10.f44525u = (EnumC3721i3) interfaceC3724j1.A1(iLogger, new EnumC3721i3.a());
                        break;
                    case "message":
                        v10.f44521q = (io.sentry.protocol.m) interfaceC3724j1.A1(iLogger, new io.sentry.protocol.m.a());
                        break;
                    case "modules":
                        v10.f44529y = AbstractC3801c.b((Map) interfaceC3724j1.z3());
                        break;
                    case "exception":
                        interfaceC3724j1.I();
                        interfaceC3724j1.X0();
                        v10.f44524t = new N3(interfaceC3724j1.L3(iLogger, new io.sentry.protocol.s.a()));
                        interfaceC3724j1.T();
                        break;
                    case "transaction":
                        v10.f44526v = interfaceC3724j1.D2();
                        break;
                    default:
                        if (!aVar.a(v10, strX0, interfaceC3724j1, iLogger)) {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            interfaceC3724j1.M2(iLogger, concurrentHashMap, strX0);
                            break;
                        } else {
                            break;
                        }
                        break;
                }
            }
            v10.I0(concurrentHashMap);
            interfaceC3724j1.T();
            return v10;
        }
    }

    public V2() {
        this(new io.sentry.protocol.x(), AbstractC3732l.d());
    }

    V2(io.sentry.protocol.x xVar, Date date) {
        super(xVar);
        this.f44520p = date;
    }

    public V2(Throwable th) {
        this();
        this.f45929j = th;
    }

    public void A0(List list) {
        this.f44524t = new N3(list);
    }

    public void B0(List list) {
        this.f44527w = list != null ? new ArrayList(list) : null;
    }

    public void C0(EnumC3721i3 enumC3721i3) {
        this.f44525u = enumC3721i3;
    }

    public void D0(io.sentry.protocol.m mVar) {
        this.f44521q = mVar;
    }

    public void E0(Map map) {
        this.f44529y = AbstractC3801c.c(map);
    }

    public void F0(List list) {
        this.f44523s = new N3(list);
    }

    public void G0(Date date) {
        this.f44520p = date;
    }

    public void H0(String str) {
        this.f44526v = str;
    }

    public void I0(Map map) {
        this.f44528x = map;
    }

    public List p0() {
        N3 n10 = this.f44524t;
        if (n10 == null) {
            return null;
        }
        return n10.a();
    }

    public List q0() {
        return this.f44527w;
    }

    public EnumC3721i3 r0() {
        return this.f44525u;
    }

    public io.sentry.protocol.m s0() {
        return this.f44521q;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        interfaceC3729k1.d("timestamp").j(iLogger, this.f44520p);
        if (this.f44521q != null) {
            interfaceC3729k1.d("message").j(iLogger, this.f44521q);
        }
        if (this.f44522r != null) {
            interfaceC3729k1.d("logger").e(this.f44522r);
        }
        N3 n10 = this.f44523s;
        if (n10 != null && !n10.a().isEmpty()) {
            interfaceC3729k1.d("threads");
            interfaceC3729k1.I();
            interfaceC3729k1.d("values").j(iLogger, this.f44523s.a());
            interfaceC3729k1.T();
        }
        N3 n11 = this.f44524t;
        if (n11 != null && !n11.a().isEmpty()) {
            interfaceC3729k1.d("exception");
            interfaceC3729k1.I();
            interfaceC3729k1.d("values").j(iLogger, this.f44524t.a());
            interfaceC3729k1.T();
        }
        if (this.f44525u != null) {
            interfaceC3729k1.d("level").j(iLogger, this.f44525u);
        }
        if (this.f44526v != null) {
            interfaceC3729k1.d("transaction").e(this.f44526v);
        }
        if (this.f44527w != null) {
            interfaceC3729k1.d("fingerprint").j(iLogger, this.f44527w);
        }
        if (this.f44529y != null) {
            interfaceC3729k1.d("modules").j(iLogger, this.f44529y);
        }
        new AbstractC3725j2.b().a(this, interfaceC3729k1, iLogger);
        Map map = this.f44528x;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f44528x.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }

    Map t0() {
        return this.f44529y;
    }

    public List u0() {
        N3 n10 = this.f44523s;
        if (n10 != null) {
            return n10.a();
        }
        return null;
    }

    public Date v0() {
        return (Date) this.f44520p.clone();
    }

    public String w0() {
        return this.f44526v;
    }

    public io.sentry.protocol.s x0() {
        N3 n10 = this.f44524t;
        if (n10 == null) {
            return null;
        }
        for (io.sentry.protocol.s sVar : n10.a()) {
            if (sVar.g() != null && sVar.g().l() != null && !sVar.g().l().booleanValue()) {
                return sVar;
            }
        }
        return null;
    }

    public boolean y0() {
        return x0() != null;
    }

    public boolean z0() {
        N3 n10 = this.f44524t;
        return (n10 == null || n10.a().isEmpty()) ? false : true;
    }
}
