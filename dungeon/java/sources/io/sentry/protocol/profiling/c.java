package io.sentry.protocol.profiling;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f46277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f46278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f46279c;

    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            c cVar = new c();
            HashMap map = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                if (strX0.equals("priority")) {
                    cVar.f46278b = interfaceC3724j1.nextInt();
                } else if (strX0.equals("name")) {
                    cVar.f46277a = interfaceC3724j1.D2();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    interfaceC3724j1.M2(iLogger, map, strX0);
                }
            }
            cVar.c(map);
            interfaceC3724j1.T();
            return cVar;
        }
    }

    public void c(Map map) {
        this.f46279c = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        if (this.f46277a != null) {
            interfaceC3729k1.d("name").j(iLogger, this.f46277a);
        }
        interfaceC3729k1.d("priority").j(iLogger, Integer.valueOf(this.f46278b));
        Map map = this.f46279c;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC3729k1.d(str).j(iLogger, this.f46279c.get(str));
            }
        }
        interfaceC3729k1.T();
    }
}
