package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import io.sentry.util.AbstractC3801c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3766j implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f46214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f46215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f46216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f46217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f46218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f46219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Boolean f46220g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f46221h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f46222i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map f46223j;

    /* JADX INFO: renamed from: io.sentry.protocol.j$a */
    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3766j a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            C3766j c3766j = new C3766j();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "npot_support":
                        c3766j.f46222i = interfaceC3724j1.D2();
                        break;
                    case "vendor_id":
                        c3766j.f46216c = interfaceC3724j1.D2();
                        break;
                    case "multi_threaded_rendering":
                        c3766j.f46220g = interfaceC3724j1.m1();
                        break;
                    case "id":
                        c3766j.f46215b = interfaceC3724j1.t2();
                        break;
                    case "name":
                        c3766j.f46214a = interfaceC3724j1.D2();
                        break;
                    case "vendor_name":
                        c3766j.f46217d = interfaceC3724j1.D2();
                        break;
                    case "version":
                        c3766j.f46221h = interfaceC3724j1.D2();
                        break;
                    case "api_type":
                        c3766j.f46219f = interfaceC3724j1.D2();
                        break;
                    case "memory_size":
                        c3766j.f46218e = interfaceC3724j1.t2();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC3724j1.M2(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            c3766j.j(concurrentHashMap);
            interfaceC3724j1.T();
            return c3766j;
        }
    }

    public C3766j() {
    }

    C3766j(C3766j c3766j) {
        this.f46214a = c3766j.f46214a;
        this.f46215b = c3766j.f46215b;
        this.f46216c = c3766j.f46216c;
        this.f46217d = c3766j.f46217d;
        this.f46218e = c3766j.f46218e;
        this.f46219f = c3766j.f46219f;
        this.f46220g = c3766j.f46220g;
        this.f46221h = c3766j.f46221h;
        this.f46222i = c3766j.f46222i;
        this.f46223j = AbstractC3801c.b(c3766j.f46223j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3766j.class == obj.getClass()) {
            C3766j c3766j = (C3766j) obj;
            if (io.sentry.util.w.a(this.f46214a, c3766j.f46214a) && io.sentry.util.w.a(this.f46215b, c3766j.f46215b) && io.sentry.util.w.a(this.f46216c, c3766j.f46216c) && io.sentry.util.w.a(this.f46217d, c3766j.f46217d) && io.sentry.util.w.a(this.f46218e, c3766j.f46218e) && io.sentry.util.w.a(this.f46219f, c3766j.f46219f) && io.sentry.util.w.a(this.f46220g, c3766j.f46220g) && io.sentry.util.w.a(this.f46221h, c3766j.f46221h) && io.sentry.util.w.a(this.f46222i, c3766j.f46222i)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f46214a, this.f46215b, this.f46216c, this.f46217d, this.f46218e, this.f46219f, this.f46220g, this.f46221h, this.f46222i);
    }

    public void j(Map map) {
        this.f46223j = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        if (this.f46214a != null) {
            interfaceC3729k1.d("name").e(this.f46214a);
        }
        if (this.f46215b != null) {
            interfaceC3729k1.d("id").i(this.f46215b);
        }
        if (this.f46216c != null) {
            interfaceC3729k1.d("vendor_id").e(this.f46216c);
        }
        if (this.f46217d != null) {
            interfaceC3729k1.d("vendor_name").e(this.f46217d);
        }
        if (this.f46218e != null) {
            interfaceC3729k1.d("memory_size").i(this.f46218e);
        }
        if (this.f46219f != null) {
            interfaceC3729k1.d("api_type").e(this.f46219f);
        }
        if (this.f46220g != null) {
            interfaceC3729k1.d("multi_threaded_rendering").k(this.f46220g);
        }
        if (this.f46221h != null) {
            interfaceC3729k1.d("version").e(this.f46221h);
        }
        if (this.f46222i != null) {
            interfaceC3729k1.d("npot_support").e(this.f46222i);
        }
        Map map = this.f46223j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f46223j.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }
}
