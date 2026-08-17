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
public final class z implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f46307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f46308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f46309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f46310d;

    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public z a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            z zVar = new z();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "raw_description":
                        zVar.f46309c = interfaceC3724j1.D2();
                        break;
                    case "name":
                        zVar.f46307a = interfaceC3724j1.D2();
                        break;
                    case "version":
                        zVar.f46308b = interfaceC3724j1.D2();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC3724j1.M2(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            zVar.g(concurrentHashMap);
            interfaceC3724j1.T();
            return zVar;
        }
    }

    public z() {
    }

    z(z zVar) {
        this.f46307a = zVar.f46307a;
        this.f46308b = zVar.f46308b;
        this.f46309c = zVar.f46309c;
        this.f46310d = AbstractC3801c.b(zVar.f46310d);
    }

    public String d() {
        return this.f46307a;
    }

    public String e() {
        return this.f46308b;
    }

    public void f(String str) {
        this.f46307a = str;
    }

    public void g(Map map) {
        this.f46310d = map;
    }

    public void h(String str) {
        this.f46308b = str;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        if (this.f46307a != null) {
            interfaceC3729k1.d("name").e(this.f46307a);
        }
        if (this.f46308b != null) {
            interfaceC3729k1.d("version").e(this.f46308b);
        }
        if (this.f46309c != null) {
            interfaceC3729k1.d("raw_description").e(this.f46309c);
        }
        Map map = this.f46310d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f46310d.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }
}
