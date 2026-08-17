package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import io.sentry.util.AbstractC3801c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f46250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f46251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f46252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f46253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f46254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f46255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f46256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f46257h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map f46258i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f46259j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f46260k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map f46261l;

    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public o a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            o oVar = new o();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "fragment":
                        oVar.f46259j = interfaceC3724j1.D2();
                        break;
                    case "method":
                        oVar.f46251b = interfaceC3724j1.D2();
                        break;
                    case "env":
                        Map map = (Map) interfaceC3724j1.z3();
                        if (map == null) {
                            break;
                        } else {
                            oVar.f46256g = AbstractC3801c.b(map);
                            break;
                        }
                        break;
                    case "url":
                        oVar.f46250a = interfaceC3724j1.D2();
                        break;
                    case "data":
                        oVar.f46253d = interfaceC3724j1.z3();
                        break;
                    case "other":
                        Map map2 = (Map) interfaceC3724j1.z3();
                        if (map2 == null) {
                            break;
                        } else {
                            oVar.f46258i = AbstractC3801c.b(map2);
                            break;
                        }
                        break;
                    case "headers":
                        Map map3 = (Map) interfaceC3724j1.z3();
                        if (map3 == null) {
                            break;
                        } else {
                            oVar.f46255f = AbstractC3801c.b(map3);
                            break;
                        }
                        break;
                    case "cookies":
                        oVar.f46254e = interfaceC3724j1.D2();
                        break;
                    case "body_size":
                        oVar.f46257h = interfaceC3724j1.x2();
                        break;
                    case "query_string":
                        oVar.f46252c = interfaceC3724j1.D2();
                        break;
                    case "api_target":
                        oVar.f46260k = interfaceC3724j1.D2();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC3724j1.M2(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            oVar.m(concurrentHashMap);
            interfaceC3724j1.T();
            return oVar;
        }
    }

    public o() {
    }

    public o(o oVar) {
        this.f46250a = oVar.f46250a;
        this.f46254e = oVar.f46254e;
        this.f46251b = oVar.f46251b;
        this.f46252c = oVar.f46252c;
        this.f46255f = AbstractC3801c.b(oVar.f46255f);
        this.f46256g = AbstractC3801c.b(oVar.f46256g);
        this.f46258i = AbstractC3801c.b(oVar.f46258i);
        this.f46261l = AbstractC3801c.b(oVar.f46261l);
        this.f46253d = oVar.f46253d;
        this.f46259j = oVar.f46259j;
        this.f46257h = oVar.f46257h;
        this.f46260k = oVar.f46260k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (io.sentry.util.w.a(this.f46250a, oVar.f46250a) && io.sentry.util.w.a(this.f46251b, oVar.f46251b) && io.sentry.util.w.a(this.f46252c, oVar.f46252c) && io.sentry.util.w.a(this.f46254e, oVar.f46254e) && io.sentry.util.w.a(this.f46255f, oVar.f46255f) && io.sentry.util.w.a(this.f46256g, oVar.f46256g) && io.sentry.util.w.a(this.f46257h, oVar.f46257h) && io.sentry.util.w.a(this.f46259j, oVar.f46259j) && io.sentry.util.w.a(this.f46260k, oVar.f46260k)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f46250a, this.f46251b, this.f46252c, this.f46254e, this.f46255f, this.f46256g, this.f46257h, this.f46259j, this.f46260k);
    }

    public Map l() {
        return this.f46255f;
    }

    public void m(Map map) {
        this.f46261l = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        if (this.f46250a != null) {
            interfaceC3729k1.d("url").e(this.f46250a);
        }
        if (this.f46251b != null) {
            interfaceC3729k1.d("method").e(this.f46251b);
        }
        if (this.f46252c != null) {
            interfaceC3729k1.d("query_string").e(this.f46252c);
        }
        if (this.f46253d != null) {
            interfaceC3729k1.d("data").j(iLogger, this.f46253d);
        }
        if (this.f46254e != null) {
            interfaceC3729k1.d("cookies").e(this.f46254e);
        }
        if (this.f46255f != null) {
            interfaceC3729k1.d("headers").j(iLogger, this.f46255f);
        }
        if (this.f46256g != null) {
            interfaceC3729k1.d("env").j(iLogger, this.f46256g);
        }
        if (this.f46258i != null) {
            interfaceC3729k1.d("other").j(iLogger, this.f46258i);
        }
        if (this.f46259j != null) {
            interfaceC3729k1.d("fragment").j(iLogger, this.f46259j);
        }
        if (this.f46257h != null) {
            interfaceC3729k1.d("body_size").j(iLogger, this.f46257h);
        }
        if (this.f46260k != null) {
            interfaceC3729k1.d("api_target").j(iLogger, this.f46260k);
        }
        Map map = this.f46261l;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f46261l.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }
}
