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
public final class p implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f46262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f46263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f46264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f46265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f46266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f46267f;

    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            p pVar = new p();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "status_code":
                        pVar.f46264c = interfaceC3724j1.t2();
                        break;
                    case "data":
                        pVar.f46266e = interfaceC3724j1.z3();
                        break;
                    case "headers":
                        Map map = (Map) interfaceC3724j1.z3();
                        if (map == null) {
                            break;
                        } else {
                            pVar.f46263b = AbstractC3801c.b(map);
                            break;
                        }
                        break;
                    case "cookies":
                        pVar.f46262a = interfaceC3724j1.D2();
                        break;
                    case "body_size":
                        pVar.f46265d = interfaceC3724j1.x2();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC3724j1.M2(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            pVar.f(concurrentHashMap);
            interfaceC3724j1.T();
            return pVar;
        }
    }

    public p() {
    }

    public p(p pVar) {
        this.f46262a = pVar.f46262a;
        this.f46263b = AbstractC3801c.b(pVar.f46263b);
        this.f46267f = AbstractC3801c.b(pVar.f46267f);
        this.f46264c = pVar.f46264c;
        this.f46265d = pVar.f46265d;
        this.f46266e = pVar.f46266e;
    }

    public void f(Map map) {
        this.f46267f = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        if (this.f46262a != null) {
            interfaceC3729k1.d("cookies").e(this.f46262a);
        }
        if (this.f46263b != null) {
            interfaceC3729k1.d("headers").j(iLogger, this.f46263b);
        }
        if (this.f46264c != null) {
            interfaceC3729k1.d("status_code").j(iLogger, this.f46264c);
        }
        if (this.f46265d != null) {
            interfaceC3729k1.d("body_size").j(iLogger, this.f46265d);
        }
        if (this.f46266e != null) {
            interfaceC3729k1.d("data").j(iLogger, this.f46266e);
        }
        Map map = this.f46267f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f46267f.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }
}
