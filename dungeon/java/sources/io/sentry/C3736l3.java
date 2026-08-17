package io.sentry;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.l3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3736l3 implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f45961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f45962c;

    /* JADX INFO: renamed from: io.sentry.l3$a */
    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3736l3 a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            String strD2 = null;
            Object objZ3 = null;
            HashMap map = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                if (strX0.equals("type")) {
                    strD2 = interfaceC3724j1.D2();
                } else if (strX0.equals("value")) {
                    objZ3 = interfaceC3724j1.z3();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    interfaceC3724j1.M2(iLogger, map, strX0);
                }
            }
            interfaceC3724j1.T();
            if (strD2 != null) {
                C3736l3 c3736l3 = new C3736l3(strD2, objZ3);
                c3736l3.a(map);
                return c3736l3;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"type\"");
            iLogger.b(EnumC3721i3.ERROR, "Missing required field \"type\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public C3736l3(String str, Object obj) {
        this.f45960a = str;
        if (obj == null || !str.equals("string")) {
            this.f45961b = obj;
        } else {
            this.f45961b = obj.toString();
        }
    }

    public void a(Map map) {
        this.f45962c = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        interfaceC3729k1.d("type").j(iLogger, this.f45960a);
        interfaceC3729k1.d("value").j(iLogger, this.f45961b);
        Map map = this.f45962c;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC3729k1.d(str).j(iLogger, this.f45962c.get(str));
            }
        }
        interfaceC3729k1.T();
    }
}
