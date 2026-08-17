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
public final class n implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f46243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f46244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f46245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f46246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f46247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Boolean f46248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f46249g;

    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public n a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            n nVar = new n();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "rooted":
                        nVar.f46248f = interfaceC3724j1.m1();
                        break;
                    case "raw_description":
                        nVar.f46245c = interfaceC3724j1.D2();
                        break;
                    case "name":
                        nVar.f46243a = interfaceC3724j1.D2();
                        break;
                    case "build":
                        nVar.f46246d = interfaceC3724j1.D2();
                        break;
                    case "version":
                        nVar.f46244b = interfaceC3724j1.D2();
                        break;
                    case "kernel_version":
                        nVar.f46247e = interfaceC3724j1.D2();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC3724j1.M2(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            nVar.l(concurrentHashMap);
            interfaceC3724j1.T();
            return nVar;
        }
    }

    public n() {
    }

    n(n nVar) {
        this.f46243a = nVar.f46243a;
        this.f46244b = nVar.f46244b;
        this.f46245c = nVar.f46245c;
        this.f46246d = nVar.f46246d;
        this.f46247e = nVar.f46247e;
        this.f46248f = nVar.f46248f;
        this.f46249g = AbstractC3801c.b(nVar.f46249g);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (io.sentry.util.w.a(this.f46243a, nVar.f46243a) && io.sentry.util.w.a(this.f46244b, nVar.f46244b) && io.sentry.util.w.a(this.f46245c, nVar.f46245c) && io.sentry.util.w.a(this.f46246d, nVar.f46246d) && io.sentry.util.w.a(this.f46247e, nVar.f46247e) && io.sentry.util.w.a(this.f46248f, nVar.f46248f)) {
                return true;
            }
        }
        return false;
    }

    public String g() {
        return this.f46243a;
    }

    public void h(String str) {
        this.f46246d = str;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f46243a, this.f46244b, this.f46245c, this.f46246d, this.f46247e, this.f46248f);
    }

    public void i(String str) {
        this.f46247e = str;
    }

    public void j(String str) {
        this.f46243a = str;
    }

    public void k(Boolean bool) {
        this.f46248f = bool;
    }

    public void l(Map map) {
        this.f46249g = map;
    }

    public void m(String str) {
        this.f46244b = str;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        if (this.f46243a != null) {
            interfaceC3729k1.d("name").e(this.f46243a);
        }
        if (this.f46244b != null) {
            interfaceC3729k1.d("version").e(this.f46244b);
        }
        if (this.f46245c != null) {
            interfaceC3729k1.d("raw_description").e(this.f46245c);
        }
        if (this.f46246d != null) {
            interfaceC3729k1.d("build").e(this.f46246d);
        }
        if (this.f46247e != null) {
            interfaceC3729k1.d("kernel_version").e(this.f46247e);
        }
        if (this.f46248f != null) {
            interfaceC3729k1.d("rooted").k(this.f46248f);
        }
        Map map = this.f46249g;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f46249g.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }
}
