package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f46239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f46240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f46241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f46242d;

    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public m a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            m mVar = new m();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "params":
                        List list = (List) interfaceC3724j1.z3();
                        if (list == null) {
                            break;
                        } else {
                            mVar.f46241c = list;
                            break;
                        }
                        break;
                    case "message":
                        mVar.f46240b = interfaceC3724j1.D2();
                        break;
                    case "formatted":
                        mVar.f46239a = interfaceC3724j1.D2();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC3724j1.M2(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            mVar.g(concurrentHashMap);
            interfaceC3724j1.T();
            return mVar;
        }
    }

    public String d() {
        return this.f46239a;
    }

    public String e() {
        return this.f46240b;
    }

    public void f(String str) {
        this.f46239a = str;
    }

    public void g(Map map) {
        this.f46242d = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        if (this.f46239a != null) {
            interfaceC3729k1.d("formatted").e(this.f46239a);
        }
        if (this.f46240b != null) {
            interfaceC3729k1.d("message").e(this.f46240b);
        }
        List list = this.f46241c;
        if (list != null && !list.isEmpty()) {
            interfaceC3729k1.d("params").j(iLogger, this.f46241c);
        }
        Map map = this.f46242d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f46242d.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }
}
