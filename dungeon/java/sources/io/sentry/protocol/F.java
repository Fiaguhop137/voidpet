package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import io.sentry.util.AbstractC3801c;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class F implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String[] f46114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f46115b;

    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public F a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            interfaceC3724j1.I();
            F f10 = new F();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                if (strX0.equals("active_profiles")) {
                    List list = (List) interfaceC3724j1.z3();
                    if (list != null) {
                        String[] strArr = new String[list.size()];
                        list.toArray(strArr);
                        f10.f46114a = strArr;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC3724j1.M2(iLogger, concurrentHashMap, strX0);
                }
            }
            f10.b(concurrentHashMap);
            interfaceC3724j1.T();
            return f10;
        }
    }

    public F() {
    }

    public F(F f10) {
        this.f46114a = f10.f46114a;
        this.f46115b = AbstractC3801c.b(f10.f46115b);
    }

    public void b(Map map) {
        this.f46115b = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || F.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f46114a, ((F) obj).f46114a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f46114a);
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        if (this.f46114a != null) {
            interfaceC3729k1.d("active_profiles").j(iLogger, this.f46114a);
        }
        Map map = this.f46115b;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f46115b.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }
}
