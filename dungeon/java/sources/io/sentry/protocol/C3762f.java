package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.EnumC3721i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3762f implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f46198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f46199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f46200c;

    /* JADX INFO: renamed from: io.sentry.protocol.f$a */
    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3762f a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            String strD2 = null;
            Boolean boolM1 = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                if (strX0.equals("result")) {
                    boolM1 = interfaceC3724j1.m1();
                } else if (strX0.equals("flag")) {
                    strD2 = interfaceC3724j1.D2();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC3724j1.M2(iLogger, concurrentHashMap, strX0);
                }
            }
            if (strD2 == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"flag\"");
                iLogger.b(EnumC3721i3.ERROR, "Missing required field \"flag\"", illegalStateException);
                throw illegalStateException;
            }
            if (boolM1 == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"result\"");
                iLogger.b(EnumC3721i3.ERROR, "Missing required field \"result\"", illegalStateException2);
                throw illegalStateException2;
            }
            C3762f c3762f = new C3762f(strD2, boolM1.booleanValue());
            c3762f.c(concurrentHashMap);
            interfaceC3724j1.T();
            return c3762f;
        }
    }

    public C3762f(String str, boolean z10) {
        this.f46198a = str;
        this.f46199b = z10;
    }

    public String a() {
        return this.f46198a;
    }

    public Boolean b() {
        return Boolean.valueOf(this.f46199b);
    }

    public void c(Map map) {
        this.f46200c = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3762f.class == obj.getClass()) {
            C3762f c3762f = (C3762f) obj;
            if (io.sentry.util.w.a(this.f46198a, c3762f.f46198a) && io.sentry.util.w.a(Boolean.valueOf(this.f46199b), Boolean.valueOf(c3762f.f46199b))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f46198a, Boolean.valueOf(this.f46199b));
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        interfaceC3729k1.d("flag").e(this.f46198a);
        interfaceC3729k1.d("result").c(this.f46199b);
        Map map = this.f46200c;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC3729k1.d(str).j(iLogger, this.f46200c.get(str));
            }
        }
        interfaceC3729k1.T();
    }
}
