package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.C3726j3;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class B implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f46067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f46068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f46069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f46070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f46071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f46072f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f46073g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Integer f46074h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Integer f46075i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f46076j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f46077k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Boolean f46078l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f46079m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Boolean f46080n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f46081o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f46082p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f46083q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f46084r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f46085s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f46086t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Map f46087u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f46088v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private C3726j3 f46089w;

    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public B a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            B b10 = new B();
            interfaceC3724j1.I();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "post_context":
                        b10.f46068b = (List) interfaceC3724j1.z3();
                        break;
                    case "image_addr":
                        b10.f46082p = interfaceC3724j1.D2();
                        break;
                    case "in_app":
                        b10.f46078l = interfaceC3724j1.m1();
                        break;
                    case "raw_function":
                        b10.f46088v = interfaceC3724j1.D2();
                        break;
                    case "lineno":
                        b10.f46074h = interfaceC3724j1.t2();
                        break;
                    case "module":
                        b10.f46073g = interfaceC3724j1.D2();
                        break;
                    case "native":
                        b10.f46080n = interfaceC3724j1.m1();
                        break;
                    case "symbol":
                        b10.f46086t = interfaceC3724j1.D2();
                        break;
                    case "package":
                        b10.f46079m = interfaceC3724j1.D2();
                        break;
                    case "filename":
                        b10.f46071e = interfaceC3724j1.D2();
                        break;
                    case "symbol_addr":
                        b10.f46083q = interfaceC3724j1.D2();
                        break;
                    case "lock":
                        b10.f46089w = (C3726j3) interfaceC3724j1.A1(iLogger, new C3726j3.a());
                        break;
                    case "vars":
                        b10.f46069c = (Map) interfaceC3724j1.z3();
                        break;
                    case "colno":
                        b10.f46075i = interfaceC3724j1.t2();
                        break;
                    case "instruction_addr":
                        b10.f46084r = interfaceC3724j1.D2();
                        break;
                    case "pre_context":
                        b10.f46067a = (List) interfaceC3724j1.z3();
                        break;
                    case "addr_mode":
                        b10.f46085s = interfaceC3724j1.D2();
                        break;
                    case "context_line":
                        b10.f46077k = interfaceC3724j1.D2();
                        break;
                    case "function":
                        b10.f46072f = interfaceC3724j1.D2();
                        break;
                    case "abs_path":
                        b10.f46076j = interfaceC3724j1.D2();
                        break;
                    case "platform":
                        b10.f46081o = interfaceC3724j1.D2();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC3724j1.M2(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            b10.H(concurrentHashMap);
            interfaceC3724j1.T();
            return b10;
        }
    }

    public void A(String str) {
        this.f46084r = str;
    }

    public void B(Integer num) {
        this.f46074h = num;
    }

    public void C(C3726j3 c3726j3) {
        this.f46089w = c3726j3;
    }

    public void D(String str) {
        this.f46073g = str;
    }

    public void E(Boolean bool) {
        this.f46080n = bool;
    }

    public void F(String str) {
        this.f46079m = str;
    }

    public void G(String str) {
        this.f46081o = str;
    }

    public void H(Map map) {
        this.f46087u = map;
    }

    public boolean equals(Object obj) {
        if (obj != null && B.class == obj.getClass()) {
            B b10 = (B) obj;
            if (Objects.equals(this.f46067a, b10.f46067a) && Objects.equals(this.f46068b, b10.f46068b) && Objects.equals(this.f46069c, b10.f46069c) && Objects.equals(this.f46070d, b10.f46070d) && Objects.equals(this.f46071e, b10.f46071e) && Objects.equals(this.f46072f, b10.f46072f) && Objects.equals(this.f46073g, b10.f46073g) && Objects.equals(this.f46074h, b10.f46074h) && Objects.equals(this.f46075i, b10.f46075i) && Objects.equals(this.f46076j, b10.f46076j) && Objects.equals(this.f46077k, b10.f46077k) && Objects.equals(this.f46078l, b10.f46078l) && Objects.equals(this.f46079m, b10.f46079m) && Objects.equals(this.f46080n, b10.f46080n) && Objects.equals(this.f46081o, b10.f46081o) && Objects.equals(this.f46082p, b10.f46082p) && Objects.equals(this.f46083q, b10.f46083q) && Objects.equals(this.f46084r, b10.f46084r) && Objects.equals(this.f46085s, b10.f46085s) && Objects.equals(this.f46086t, b10.f46086t) && Objects.equals(this.f46087u, b10.f46087u) && Objects.equals(this.f46088v, b10.f46088v) && Objects.equals(this.f46089w, b10.f46089w)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f46067a, this.f46068b, this.f46069c, this.f46070d, this.f46071e, this.f46072f, this.f46073g, this.f46074h, this.f46075i, this.f46076j, this.f46077k, this.f46078l, this.f46079m, this.f46080n, this.f46081o, this.f46082p, this.f46083q, this.f46084r, this.f46085s, this.f46086t, this.f46087u, this.f46088v, this.f46089w);
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        if (this.f46071e != null) {
            interfaceC3729k1.d("filename").e(this.f46071e);
        }
        if (this.f46072f != null) {
            interfaceC3729k1.d("function").e(this.f46072f);
        }
        if (this.f46073g != null) {
            interfaceC3729k1.d("module").e(this.f46073g);
        }
        if (this.f46074h != null) {
            interfaceC3729k1.d("lineno").i(this.f46074h);
        }
        if (this.f46075i != null) {
            interfaceC3729k1.d("colno").i(this.f46075i);
        }
        if (this.f46076j != null) {
            interfaceC3729k1.d("abs_path").e(this.f46076j);
        }
        if (this.f46077k != null) {
            interfaceC3729k1.d("context_line").e(this.f46077k);
        }
        if (this.f46078l != null) {
            interfaceC3729k1.d("in_app").k(this.f46078l);
        }
        if (this.f46079m != null) {
            interfaceC3729k1.d("package").e(this.f46079m);
        }
        if (this.f46080n != null) {
            interfaceC3729k1.d("native").k(this.f46080n);
        }
        if (this.f46081o != null) {
            interfaceC3729k1.d("platform").e(this.f46081o);
        }
        if (this.f46082p != null) {
            interfaceC3729k1.d("image_addr").e(this.f46082p);
        }
        if (this.f46083q != null) {
            interfaceC3729k1.d("symbol_addr").e(this.f46083q);
        }
        if (this.f46084r != null) {
            interfaceC3729k1.d("instruction_addr").e(this.f46084r);
        }
        if (this.f46085s != null) {
            interfaceC3729k1.d("addr_mode").e(this.f46085s);
        }
        if (this.f46088v != null) {
            interfaceC3729k1.d("raw_function").e(this.f46088v);
        }
        if (this.f46086t != null) {
            interfaceC3729k1.d("symbol").e(this.f46086t);
        }
        if (this.f46089w != null) {
            interfaceC3729k1.d("lock").j(iLogger, this.f46089w);
        }
        List list = this.f46067a;
        if (list != null && !list.isEmpty()) {
            interfaceC3729k1.d("pre_context").j(iLogger, this.f46067a);
        }
        List list2 = this.f46068b;
        if (list2 != null && !list2.isEmpty()) {
            interfaceC3729k1.d("post_context").j(iLogger, this.f46068b);
        }
        Map map = this.f46069c;
        if (map != null && !map.isEmpty()) {
            interfaceC3729k1.d("vars").j(iLogger, this.f46069c);
        }
        Map map2 = this.f46087u;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                Object obj = this.f46087u.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }

    public String v() {
        return this.f46073g;
    }

    public void w(String str) {
        this.f46085s = str;
    }

    public void x(String str) {
        this.f46071e = str;
    }

    public void y(String str) {
        this.f46072f = str;
    }

    public void z(Boolean bool) {
        this.f46078l = bool;
    }
}
