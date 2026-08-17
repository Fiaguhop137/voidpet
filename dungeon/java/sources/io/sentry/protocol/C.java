package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import io.sentry.util.AbstractC3801c;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class C implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f46090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f46091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f46092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f46093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f46094e;

    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            C c10 = new C();
            interfaceC3724j1.I();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "frames":
                        c10.f46090a = interfaceC3724j1.L3(iLogger, new B.a());
                        break;
                    case "instruction_addr_adjustment":
                        c10.f46093d = (b) interfaceC3724j1.A1(iLogger, new b.a());
                        break;
                    case "registers":
                        c10.f46091b = AbstractC3801c.b((Map) interfaceC3724j1.z3());
                        break;
                    case "snapshot":
                        c10.f46092c = interfaceC3724j1.m1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC3724j1.M2(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            c10.j(concurrentHashMap);
            interfaceC3724j1.T();
            return c10;
        }
    }

    public enum b implements B0 {
        AUTO,
        ALL,
        ALL_BUT_FIRST,
        NONE;

        public static final class a implements InterfaceC3773r0 {
            @Override // io.sentry.InterfaceC3773r0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
                return b.valueOf(interfaceC3724j1.j2().toUpperCase(Locale.ROOT));
            }
        }

        @Override // io.sentry.B0
        public void serialize(@NotNull InterfaceC3729k1 interfaceC3729k1, @NotNull ILogger iLogger) throws IOException {
            interfaceC3729k1.e(toString().toLowerCase(Locale.ROOT));
        }
    }

    public C() {
    }

    public C(List list) {
        this.f46090a = list;
    }

    public List e() {
        return this.f46090a;
    }

    public void f(List list) {
        this.f46090a = list;
    }

    public void g(b bVar) {
        this.f46093d = bVar;
    }

    public void h(Map map) {
        this.f46091b = map;
    }

    public void i(Boolean bool) {
        this.f46092c = bool;
    }

    public void j(Map map) {
        this.f46094e = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        if (this.f46090a != null) {
            interfaceC3729k1.d("frames").j(iLogger, this.f46090a);
        }
        if (this.f46091b != null) {
            interfaceC3729k1.d("registers").j(iLogger, this.f46091b);
        }
        if (this.f46092c != null) {
            interfaceC3729k1.d("snapshot").k(this.f46092c);
        }
        if (this.f46093d != null) {
            interfaceC3729k1.d("instruction_addr_adjustment").j(iLogger, this.f46093d);
        }
        Map map = this.f46094e;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f46094e.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }
}
