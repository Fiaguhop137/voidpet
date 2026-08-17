package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import io.sentry.util.AbstractC3801c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3758b implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f46155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f46156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f46157c;

    /* JADX INFO: renamed from: io.sentry.protocol.b$a */
    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3758b a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            C3758b c3758b = new C3758b();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                if (strX0.equals("name")) {
                    c3758b.f46155a = interfaceC3724j1.D2();
                } else if (strX0.equals("version")) {
                    c3758b.f46156b = interfaceC3724j1.D2();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC3724j1.M2(iLogger, concurrentHashMap, strX0);
                }
            }
            c3758b.c(concurrentHashMap);
            interfaceC3724j1.T();
            return c3758b;
        }
    }

    public C3758b() {
    }

    C3758b(C3758b c3758b) {
        this.f46155a = c3758b.f46155a;
        this.f46156b = c3758b.f46156b;
        this.f46157c = AbstractC3801c.b(c3758b.f46157c);
    }

    public void c(Map map) {
        this.f46157c = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3758b.class == obj.getClass()) {
            C3758b c3758b = (C3758b) obj;
            if (io.sentry.util.w.a(this.f46155a, c3758b.f46155a) && io.sentry.util.w.a(this.f46156b, c3758b.f46156b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f46155a, this.f46156b);
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        if (this.f46155a != null) {
            interfaceC3729k1.d("name").e(this.f46155a);
        }
        if (this.f46156b != null) {
            interfaceC3729k1.d("version").e(this.f46156b);
        }
        Map map = this.f46157c;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f46157c.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }
}
