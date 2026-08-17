package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class K implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f46129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f46130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f46131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f46132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Double f46133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Double f46134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Double f46135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Double f46136h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f46137i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Double f46138j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f46139k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map f46140l;

    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public K a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            K k10 = new K();
            interfaceC3724j1.I();
            HashMap map = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "rendering_system":
                        k10.f46129a = interfaceC3724j1.D2();
                        break;
                    case "identifier":
                        k10.f46131c = interfaceC3724j1.D2();
                        break;
                    case "height":
                        k10.f46134f = interfaceC3724j1.S0();
                        break;
                    case "x":
                        k10.f46135g = interfaceC3724j1.S0();
                        break;
                    case "y":
                        k10.f46136h = interfaceC3724j1.S0();
                        break;
                    case "tag":
                        k10.f46132d = interfaceC3724j1.D2();
                        break;
                    case "type":
                        k10.f46130b = interfaceC3724j1.D2();
                        break;
                    case "alpha":
                        k10.f46138j = interfaceC3724j1.S0();
                        break;
                    case "width":
                        k10.f46133e = interfaceC3724j1.S0();
                        break;
                    case "children":
                        k10.f46139k = interfaceC3724j1.L3(iLogger, this);
                        break;
                    case "visibility":
                        k10.f46137i = interfaceC3724j1.D2();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        interfaceC3724j1.M2(iLogger, map, strX0);
                        break;
                }
            }
            interfaceC3724j1.T();
            k10.q(map);
            return k10;
        }
    }

    public void l(Double d10) {
        this.f46138j = d10;
    }

    public void m(List list) {
        this.f46139k = list;
    }

    public void n(Double d10) {
        this.f46134f = d10;
    }

    public void o(String str) {
        this.f46131c = str;
    }

    public void p(String str) {
        this.f46130b = str;
    }

    public void q(Map map) {
        this.f46140l = map;
    }

    public void r(String str) {
        this.f46137i = str;
    }

    public void s(Double d10) {
        this.f46133e = d10;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        if (this.f46129a != null) {
            interfaceC3729k1.d("rendering_system").e(this.f46129a);
        }
        if (this.f46130b != null) {
            interfaceC3729k1.d("type").e(this.f46130b);
        }
        if (this.f46131c != null) {
            interfaceC3729k1.d("identifier").e(this.f46131c);
        }
        if (this.f46132d != null) {
            interfaceC3729k1.d("tag").e(this.f46132d);
        }
        if (this.f46133e != null) {
            interfaceC3729k1.d("width").i(this.f46133e);
        }
        if (this.f46134f != null) {
            interfaceC3729k1.d("height").i(this.f46134f);
        }
        if (this.f46135g != null) {
            interfaceC3729k1.d("x").i(this.f46135g);
        }
        if (this.f46136h != null) {
            interfaceC3729k1.d("y").i(this.f46136h);
        }
        if (this.f46137i != null) {
            interfaceC3729k1.d("visibility").e(this.f46137i);
        }
        if (this.f46138j != null) {
            interfaceC3729k1.d("alpha").i(this.f46138j);
        }
        List list = this.f46139k;
        if (list != null && !list.isEmpty()) {
            interfaceC3729k1.d("children").j(iLogger, this.f46139k);
        }
        Map map = this.f46140l;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC3729k1.d(str).j(iLogger, this.f46140l.get(str));
            }
        }
        interfaceC3729k1.T();
    }

    public void t(Double d10) {
        this.f46135g = d10;
    }

    public void u(Double d10) {
        this.f46136h = d10;
    }
}
