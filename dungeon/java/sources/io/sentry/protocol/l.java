package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import io.sentry.util.AbstractC3801c;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient Thread f46227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f46228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f46229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f46230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f46231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f46232f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f46233g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Boolean f46234h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Integer f46235i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Integer f46236j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Boolean f46237k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map f46238l;

    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            l lVar = new l();
            interfaceC3724j1.I();
            HashMap map = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "description":
                        lVar.f46229c = interfaceC3724j1.D2();
                        break;
                    case "exception_id":
                        lVar.f46235i = interfaceC3724j1.t2();
                        break;
                    case "data":
                        lVar.f46233g = AbstractC3801c.b((Map) interfaceC3724j1.z3());
                        break;
                    case "meta":
                        lVar.f46232f = AbstractC3801c.b((Map) interfaceC3724j1.z3());
                        break;
                    case "type":
                        lVar.f46228b = interfaceC3724j1.D2();
                        break;
                    case "handled":
                        lVar.f46231e = interfaceC3724j1.m1();
                        break;
                    case "synthetic":
                        lVar.f46234h = interfaceC3724j1.m1();
                        break;
                    case "is_exception_group":
                        lVar.f46237k = interfaceC3724j1.m1();
                        break;
                    case "help_link":
                        lVar.f46230d = interfaceC3724j1.D2();
                        break;
                    case "parent_id":
                        lVar.f46236j = interfaceC3724j1.t2();
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
            lVar.s(map);
            return lVar;
        }
    }

    public l() {
        this(null);
    }

    public l(Thread thread) {
        this.f46227a = thread;
    }

    public String k() {
        return this.f46228b;
    }

    public Boolean l() {
        return this.f46231e;
    }

    public void m(Integer num) {
        this.f46235i = num;
    }

    public void n(Boolean bool) {
        this.f46231e = bool;
    }

    public void o(Map map) {
        this.f46232f = AbstractC3801c.c(map);
    }

    public void p(Integer num) {
        this.f46236j = num;
    }

    public void q(Boolean bool) {
        this.f46234h = bool;
    }

    public void r(String str) {
        this.f46228b = str;
    }

    public void s(Map map) {
        this.f46238l = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        if (this.f46228b != null) {
            interfaceC3729k1.d("type").e(this.f46228b);
        }
        if (this.f46229c != null) {
            interfaceC3729k1.d("description").e(this.f46229c);
        }
        if (this.f46230d != null) {
            interfaceC3729k1.d("help_link").e(this.f46230d);
        }
        if (this.f46231e != null) {
            interfaceC3729k1.d("handled").k(this.f46231e);
        }
        if (this.f46232f != null) {
            interfaceC3729k1.d("meta").j(iLogger, this.f46232f);
        }
        if (this.f46233g != null) {
            interfaceC3729k1.d("data").j(iLogger, this.f46233g);
        }
        if (this.f46234h != null) {
            interfaceC3729k1.d("synthetic").k(this.f46234h);
        }
        if (this.f46235i != null) {
            interfaceC3729k1.d("exception_id").j(iLogger, this.f46235i);
        }
        if (this.f46236j != null) {
            interfaceC3729k1.d("parent_id").j(iLogger, this.f46236j);
        }
        if (this.f46237k != null) {
            interfaceC3729k1.d("is_exception_group").k(this.f46237k);
        }
        Map map = this.f46238l;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC3729k1.d(str).j(iLogger, this.f46238l.get(str));
            }
        }
        interfaceC3729k1.T();
    }
}
