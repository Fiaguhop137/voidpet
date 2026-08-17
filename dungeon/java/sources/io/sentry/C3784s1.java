package io.sentry;

import io.sentry.util.AbstractC3801c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3784s1 implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private io.sentry.protocol.x f46480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f46481b;

    /* JADX INFO: renamed from: io.sentry.s1$a */
    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3784s1 a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            C3784s1 c3784s1 = new C3784s1();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                if (strX0.equals("profiler_id")) {
                    io.sentry.protocol.x xVar = (io.sentry.protocol.x) interfaceC3724j1.A1(iLogger, new io.sentry.protocol.x.a());
                    if (xVar != null) {
                        c3784s1.f46480a = xVar;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC3724j1.M2(iLogger, concurrentHashMap, strX0);
                }
            }
            c3784s1.b(concurrentHashMap);
            interfaceC3724j1.T();
            return c3784s1;
        }
    }

    public C3784s1() {
        this(io.sentry.protocol.x.f46302b);
    }

    public C3784s1(io.sentry.protocol.x xVar) {
        this.f46480a = xVar;
    }

    public C3784s1(C3784s1 c3784s1) {
        this.f46480a = c3784s1.f46480a;
        Map mapB = AbstractC3801c.b(c3784s1.f46481b);
        if (mapB != null) {
            this.f46481b = mapB;
        }
    }

    public void b(Map map) {
        this.f46481b = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3784s1) {
            return this.f46480a.equals(((C3784s1) obj).f46480a);
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f46480a);
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        interfaceC3729k1.d("profiler_id").j(iLogger, this.f46480a);
        Map map = this.f46481b;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC3729k1.d(str).j(iLogger, this.f46481b.get(str));
            }
        }
        interfaceC3729k1.T();
    }
}
