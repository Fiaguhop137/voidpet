package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3765i implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f46210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f46211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f46212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f46213d;

    /* JADX INFO: renamed from: io.sentry.protocol.i$a */
    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3765i a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            C3765i c3765i = new C3765i();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "region":
                        c3765i.f46212c = interfaceC3724j1.D2();
                        break;
                    case "city":
                        c3765i.f46210a = interfaceC3724j1.D2();
                        break;
                    case "country_code":
                        c3765i.f46211b = interfaceC3724j1.D2();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC3724j1.M2(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            c3765i.g(concurrentHashMap);
            interfaceC3724j1.T();
            return c3765i;
        }
    }

    public void d(String str) {
        this.f46210a = str;
    }

    public void e(String str) {
        this.f46211b = str;
    }

    public void f(String str) {
        this.f46212c = str;
    }

    public void g(Map map) {
        this.f46213d = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        if (this.f46210a != null) {
            interfaceC3729k1.d("city").e(this.f46210a);
        }
        if (this.f46211b != null) {
            interfaceC3729k1.d("country_code").e(this.f46211b);
        }
        if (this.f46212c != null) {
            interfaceC3729k1.d("region").e(this.f46212c);
        }
        Map map = this.f46213d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f46213d.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }
}
