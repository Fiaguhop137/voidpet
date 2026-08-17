package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3763g implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f46201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f46202b;

    /* JADX INFO: renamed from: io.sentry.protocol.g$a */
    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3763g a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            List arrayList = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                if (strX0.equals("values")) {
                    arrayList = interfaceC3724j1.L3(iLogger, new C3762f.a());
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC3724j1.M2(iLogger, concurrentHashMap, strX0);
                }
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            C3763g c3763g = new C3763g(arrayList);
            c3763g.b(concurrentHashMap);
            interfaceC3724j1.T();
            return c3763g;
        }
    }

    public C3763g(List list) {
        this.f46201a = list;
    }

    public List a() {
        return this.f46201a;
    }

    public void b(Map map) {
        this.f46202b = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3763g.class != obj.getClass()) {
            return false;
        }
        return io.sentry.util.w.a(this.f46201a, ((C3763g) obj).f46201a);
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f46201a);
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        interfaceC3729k1.d("values").j(iLogger, this.f46201a);
        Map map = this.f46202b;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC3729k1.d(str).j(iLogger, this.f46202b.get(str));
            }
        }
        interfaceC3729k1.T();
    }
}
