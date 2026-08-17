package io.sentry;

import io.sentry.util.C3799a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class H {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Map f44339h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f44340a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f44341b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3799a f44342c = new C3799a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C3682b f44343d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C3682b f44344e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C3682b f44345f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private A1 f44346g = null;

    static {
        HashMap map = new HashMap();
        f44339h = map;
        map.put("boolean", Boolean.class);
        map.put("char", Character.class);
        map.put("byte", Byte.class);
        map.put("short", Short.class);
        map.put("int", Integer.class);
        map.put("long", Long.class);
        map.put("float", Float.class);
        map.put("double", Double.class);
    }

    private boolean k(Object obj, Class cls) {
        Class cls2 = (Class) f44339h.get(cls.getCanonicalName());
        return obj != null && cls.isPrimitive() && cls2 != null && cls2.isInstance(obj);
    }

    public void a(C3682b c3682b) {
        if (c3682b != null) {
            this.f44341b.add(c3682b);
        }
    }

    public void b(List list) {
        if (list != null) {
            this.f44341b.addAll(list);
        }
    }

    public void c() {
        InterfaceC3698e0 interfaceC3698e0A = this.f44342c.a();
        try {
            Iterator it = this.f44340a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getKey() == null || !((String) entry.getKey()).startsWith("sentry:")) {
                    it.remove();
                }
            }
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
        } catch (Throwable th) {
            if (interfaceC3698e0A != null) {
                try {
                    interfaceC3698e0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public Object d(String str) {
        InterfaceC3698e0 interfaceC3698e0A = this.f44342c.a();
        try {
            Object obj = this.f44340a.get(str);
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            return obj;
        } catch (Throwable th) {
            if (interfaceC3698e0A != null) {
                try {
                    interfaceC3698e0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public Object e(String str, Class cls) {
        InterfaceC3698e0 interfaceC3698e0A = this.f44342c.a();
        try {
            Object obj = this.f44340a.get(str);
            if (cls.isInstance(obj)) {
                if (interfaceC3698e0A != null) {
                    interfaceC3698e0A.close();
                    return obj;
                }
            } else {
                if (!k(obj, cls)) {
                    if (interfaceC3698e0A != null) {
                        interfaceC3698e0A.close();
                    }
                    return null;
                }
                if (interfaceC3698e0A != null) {
                    interfaceC3698e0A.close();
                }
            }
            return obj;
        } catch (Throwable th) {
            if (interfaceC3698e0A != null) {
                try {
                    interfaceC3698e0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public List f() {
        return new ArrayList(this.f44341b);
    }

    public A1 g() {
        return this.f44346g;
    }

    public C3682b h() {
        return this.f44343d;
    }

    public C3682b i() {
        return this.f44345f;
    }

    public C3682b j() {
        return this.f44344e;
    }

    public void l(String str, Object obj) {
        InterfaceC3698e0 interfaceC3698e0A = this.f44342c.a();
        try {
            this.f44340a.put(str, obj);
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
        } catch (Throwable th) {
            if (interfaceC3698e0A != null) {
                try {
                    interfaceC3698e0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void m(A1 a10) {
        this.f44346g = a10;
    }

    public void n(C3682b c3682b) {
        this.f44343d = c3682b;
    }

    public void o(C3682b c3682b) {
        this.f44345f = c3682b;
    }

    public void p(C3682b c3682b) {
        this.f44344e = c3682b;
    }
}
