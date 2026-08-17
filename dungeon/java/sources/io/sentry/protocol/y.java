package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.EnumC3721i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f46304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f46305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f46306c;

    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public y a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            String strJ2 = null;
            String strJ3 = null;
            HashMap map = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                if (strX0.equals("name")) {
                    strJ2 = interfaceC3724j1.j2();
                } else if (strX0.equals("version")) {
                    strJ3 = interfaceC3724j1.j2();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    interfaceC3724j1.M2(iLogger, map, strX0);
                }
            }
            interfaceC3724j1.T();
            if (strJ2 == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"name\"");
                iLogger.b(EnumC3721i3.ERROR, "Missing required field \"name\"", illegalStateException);
                throw illegalStateException;
            }
            if (strJ3 != null) {
                y yVar = new y(strJ2, strJ3);
                yVar.c(map);
                return yVar;
            }
            IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"version\"");
            iLogger.b(EnumC3721i3.ERROR, "Missing required field \"version\"", illegalStateException2);
            throw illegalStateException2;
        }
    }

    public y(String str, String str2) {
        this.f46304a = (String) io.sentry.util.w.c(str, "name is required.");
        this.f46305b = (String) io.sentry.util.w.c(str2, "version is required.");
    }

    public String a() {
        return this.f46304a;
    }

    public String b() {
        return this.f46305b;
    }

    public void c(Map map) {
        this.f46306c = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y.class == obj.getClass()) {
            y yVar = (y) obj;
            if (Objects.equals(this.f46304a, yVar.f46304a) && Objects.equals(this.f46305b, yVar.f46305b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f46304a, this.f46305b);
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        interfaceC3729k1.d("name").e(this.f46304a);
        interfaceC3729k1.d("version").e(this.f46305b);
        Map map = this.f46306c;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC3729k1.d(str).j(iLogger, this.f46306c.get(str));
            }
        }
        interfaceC3729k1.T();
    }
}
