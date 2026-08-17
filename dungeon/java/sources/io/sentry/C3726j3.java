package io.sentry;

import io.sentry.util.AbstractC3801c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3726j3 implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f45935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f45936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f45937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f45938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Long f45939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f45940f;

    /* JADX INFO: renamed from: io.sentry.j3$a */
    public static final class a implements InterfaceC3773r0 {
        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3726j3 a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) {
            C3726j3 c3726j3 = new C3726j3();
            interfaceC3724j1.I();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "package_name":
                        c3726j3.f45937c = interfaceC3724j1.D2();
                        break;
                    case "thread_id":
                        c3726j3.f45939e = interfaceC3724j1.x2();
                        break;
                    case "address":
                        c3726j3.f45936b = interfaceC3724j1.D2();
                        break;
                    case "class_name":
                        c3726j3.f45938d = interfaceC3724j1.D2();
                        break;
                    case "type":
                        c3726j3.f45935a = interfaceC3724j1.nextInt();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC3724j1.M2(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            c3726j3.m(concurrentHashMap);
            interfaceC3724j1.T();
            return c3726j3;
        }
    }

    public C3726j3() {
    }

    public C3726j3(C3726j3 c3726j3) {
        this.f45935a = c3726j3.f45935a;
        this.f45936b = c3726j3.f45936b;
        this.f45937c = c3726j3.f45937c;
        this.f45938d = c3726j3.f45938d;
        this.f45939e = c3726j3.f45939e;
        this.f45940f = AbstractC3801c.b(c3726j3.f45940f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3726j3.class != obj.getClass()) {
            return false;
        }
        return io.sentry.util.w.a(this.f45936b, ((C3726j3) obj).f45936b);
    }

    public String f() {
        return this.f45936b;
    }

    public int g() {
        return this.f45935a;
    }

    public void h(String str) {
        this.f45936b = str;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f45936b);
    }

    public void i(String str) {
        this.f45938d = str;
    }

    public void j(String str) {
        this.f45937c = str;
    }

    public void k(Long l10) {
        this.f45939e = l10;
    }

    public void l(int i10) {
        this.f45935a = i10;
    }

    public void m(Map map) {
        this.f45940f = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        interfaceC3729k1.d("type").a(this.f45935a);
        if (this.f45936b != null) {
            interfaceC3729k1.d("address").e(this.f45936b);
        }
        if (this.f45937c != null) {
            interfaceC3729k1.d("package_name").e(this.f45937c);
        }
        if (this.f45938d != null) {
            interfaceC3729k1.d("class_name").e(this.f45938d);
        }
        if (this.f45939e != null) {
            interfaceC3729k1.d("thread_id").i(this.f45939e);
        }
        Map map = this.f45940f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f45940f.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }
}
