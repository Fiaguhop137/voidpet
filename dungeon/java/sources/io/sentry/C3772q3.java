package io.sentry;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.q3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3772q3 implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f46318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f46319b;

    /* JADX INFO: renamed from: io.sentry.q3$a */
    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3772q3 a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            List listL3 = null;
            HashMap map = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                if (strX0.equals("items")) {
                    listL3 = interfaceC3724j1.L3(iLogger, new C3756p3.a());
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    interfaceC3724j1.M2(iLogger, map, strX0);
                }
            }
            interfaceC3724j1.T();
            if (listL3 != null) {
                C3772q3 c3772q3 = new C3772q3(listL3);
                c3772q3.b(map);
                return c3772q3;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"items\"");
            iLogger.b(EnumC3721i3.ERROR, "Missing required field \"items\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public C3772q3(List list) {
        this.f46318a = list;
    }

    public List a() {
        return this.f46318a;
    }

    public void b(Map map) {
        this.f46319b = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        interfaceC3729k1.d("items").j(iLogger, this.f46318a);
        Map map = this.f46319b;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC3729k1.d(str).j(iLogger, this.f46319b.get(str));
            }
        }
        interfaceC3729k1.T();
    }
}
