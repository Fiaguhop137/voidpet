package io.sentry.profilemeasurements;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import io.sentry.util.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f46047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f46048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Collection f46049c;

    /* JADX INFO: renamed from: io.sentry.profilemeasurements.a$a, reason: collision with other inner class name */
    public static final class C0539a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            a aVar = new a();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                if (strX0.equals("values")) {
                    List listL3 = interfaceC3724j1.L3(iLogger, new b.a());
                    if (listL3 != null) {
                        aVar.f46049c = listL3;
                    }
                } else if (strX0.equals("unit")) {
                    String strD2 = interfaceC3724j1.D2();
                    if (strD2 != null) {
                        aVar.f46048b = strD2;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC3724j1.M2(iLogger, concurrentHashMap, strX0);
                }
            }
            aVar.c(concurrentHashMap);
            interfaceC3724j1.T();
            return aVar;
        }
    }

    public a() {
        this("unknown", new ArrayList());
    }

    public a(String str, Collection collection) {
        this.f46048b = str;
        this.f46049c = collection;
    }

    public void c(Map map) {
        this.f46047a = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (w.a(this.f46047a, aVar.f46047a) && this.f46048b.equals(aVar.f46048b) && new ArrayList(this.f46049c).equals(new ArrayList(aVar.f46049c))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return w.b(this.f46047a, this.f46048b, this.f46049c);
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        interfaceC3729k1.d("unit").j(iLogger, this.f46048b);
        interfaceC3729k1.d("values").j(iLogger, this.f46049c);
        Map map = this.f46047a;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f46047a.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }
}
