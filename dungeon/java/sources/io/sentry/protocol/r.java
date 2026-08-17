package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.C3711g3;
import io.sentry.EnumC3721i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC3724j1;
import io.sentry.InterfaceC3729k1;
import io.sentry.InterfaceC3773r0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f46285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f46286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set f46287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Set f46288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f46289e;

    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public r a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            interfaceC3724j1.I();
            String strJ2 = null;
            String strJ3 = null;
            HashMap map = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "name":
                        strJ2 = interfaceC3724j1.j2();
                        break;
                    case "version":
                        strJ3 = interfaceC3724j1.j2();
                        break;
                    case "packages":
                        List listL3 = interfaceC3724j1.L3(iLogger, new y.a());
                        if (listL3 == null) {
                            break;
                        } else {
                            arrayList.addAll(listL3);
                            break;
                        }
                        break;
                    case "integrations":
                        List list = (List) interfaceC3724j1.z3();
                        if (list == null) {
                            break;
                        } else {
                            arrayList2.addAll(list);
                            break;
                        }
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        interfaceC3724j1.M2(iLogger, map, strX0);
                        break;
                }
            }
            interfaceC3724j1.T();
            if (strJ2 == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"name\"");
                iLogger.b(EnumC3721i3.ERROR, "Missing required field \"name\"", illegalStateException);
                throw illegalStateException;
            }
            if (strJ3 == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"version\"");
                iLogger.b(EnumC3721i3.ERROR, "Missing required field \"version\"", illegalStateException2);
                throw illegalStateException2;
            }
            r rVar = new r(strJ2, strJ3);
            rVar.f46287c = new CopyOnWriteArraySet(arrayList);
            rVar.f46288d = new CopyOnWriteArraySet(arrayList2);
            rVar.i(map);
            return rVar;
        }
    }

    public r(String str, String str2) {
        this.f46285a = (String) io.sentry.util.w.c(str, "name is required.");
        this.f46286b = (String) io.sentry.util.w.c(str2, "version is required.");
    }

    public static r k(r rVar, String str, String str2) {
        io.sentry.util.w.c(str, "name is required.");
        io.sentry.util.w.c(str2, "version is required.");
        if (rVar == null) {
            return new r(str, str2);
        }
        rVar.h(str);
        rVar.j(str2);
        return rVar;
    }

    public void c(String str, String str2) {
        C3711g3.d().b(str, str2);
    }

    public Set d() {
        Set set = this.f46288d;
        return set != null ? set : C3711g3.d().e();
    }

    public String e() {
        return this.f46285a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (this.f46285a.equals(rVar.f46285a) && this.f46286b.equals(rVar.f46286b)) {
                return true;
            }
        }
        return false;
    }

    public Set f() {
        Set set = this.f46287c;
        return set != null ? set : C3711g3.d().f();
    }

    public String g() {
        return this.f46286b;
    }

    public void h(String str) {
        this.f46285a = (String) io.sentry.util.w.c(str, "name is required.");
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f46285a, this.f46286b);
    }

    public void i(Map map) {
        this.f46289e = map;
    }

    public void j(String str) {
        this.f46286b = (String) io.sentry.util.w.c(str, "version is required.");
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        interfaceC3729k1.d("name").e(this.f46285a);
        interfaceC3729k1.d("version").e(this.f46286b);
        Set setF = f();
        Set setD = d();
        if (!setF.isEmpty()) {
            interfaceC3729k1.d("packages").j(iLogger, setF);
        }
        if (!setD.isEmpty()) {
            interfaceC3729k1.d("integrations").j(iLogger, setD);
        }
        Map map = this.f46289e;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC3729k1.d(str).j(iLogger, this.f46289e.get(str));
            }
        }
        interfaceC3729k1.T();
    }
}
