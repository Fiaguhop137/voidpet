package io.sentry;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class U2 implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f44499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f44500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f44501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f44502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final EnumC3716h3 f44503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f44504f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Callable f44505g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f44506h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map f44507i;

    public static final class a implements InterfaceC3773r0 {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.b(EnumC3721i3.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.InterfaceC3773r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public U2 a(InterfaceC3724j1 interfaceC3724j1, ILogger iLogger) throws Exception {
            interfaceC3724j1.I();
            HashMap map = null;
            EnumC3716h3 enumC3716h3 = null;
            String strD2 = null;
            String strD3 = null;
            String strD4 = null;
            String strD5 = null;
            Integer numT2 = null;
            int iNextInt = 0;
            while (interfaceC3724j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = interfaceC3724j1.X0();
                strX0.getClass();
                switch (strX0) {
                    case "item_count":
                        numT2 = interfaceC3724j1.t2();
                        break;
                    case "length":
                        iNextInt = interfaceC3724j1.nextInt();
                        break;
                    case "filename":
                        strD3 = interfaceC3724j1.D2();
                        break;
                    case "attachment_type":
                        strD4 = interfaceC3724j1.D2();
                        break;
                    case "type":
                        enumC3716h3 = (EnumC3716h3) interfaceC3724j1.A1(iLogger, new EnumC3716h3.a());
                        break;
                    case "content_type":
                        strD2 = interfaceC3724j1.D2();
                        break;
                    case "platform":
                        strD5 = interfaceC3724j1.D2();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        interfaceC3724j1.M2(iLogger, map, strX0);
                        break;
                }
            }
            if (enumC3716h3 == null) {
                throw c("type", iLogger);
            }
            U2 u10 = new U2(enumC3716h3, iNextInt, strD2, strD3, strD4, strD5, numT2);
            u10.f(map);
            interfaceC3724j1.T();
            return u10;
        }
    }

    public U2(EnumC3716h3 enumC3716h3, int i10, String str, String str2, String str3, String str4, Integer num) {
        this.f44503e = (EnumC3716h3) io.sentry.util.w.c(enumC3716h3, "type is required");
        this.f44499a = str;
        this.f44504f = i10;
        this.f44501c = str2;
        this.f44505g = null;
        this.f44506h = str3;
        this.f44502d = str4;
        this.f44500b = num;
    }

    U2(EnumC3716h3 enumC3716h3, Callable callable, String str, String str2) {
        this(enumC3716h3, callable, str, str2, null);
    }

    U2(EnumC3716h3 enumC3716h3, Callable callable, String str, String str2, String str3) {
        this(enumC3716h3, callable, str, str2, str3, (String) null, (Integer) null);
    }

    U2(EnumC3716h3 enumC3716h3, Callable callable, String str, String str2, String str3, String str4, Integer num) {
        this.f44503e = (EnumC3716h3) io.sentry.util.w.c(enumC3716h3, "type is required");
        this.f44499a = str;
        this.f44504f = -1;
        this.f44501c = str2;
        this.f44505g = callable;
        this.f44506h = str3;
        this.f44502d = str4;
        this.f44500b = num;
    }

    public String a() {
        return this.f44506h;
    }

    public String b() {
        return this.f44499a;
    }

    public String c() {
        return this.f44501c;
    }

    public int d() {
        Callable callable = this.f44505g;
        if (callable == null) {
            return this.f44504f;
        }
        try {
            return ((Integer) callable.call()).intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    public EnumC3716h3 e() {
        return this.f44503e;
    }

    public void f(Map map) {
        this.f44507i = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC3729k1 interfaceC3729k1, ILogger iLogger) {
        interfaceC3729k1.I();
        if (this.f44499a != null) {
            interfaceC3729k1.d("content_type").e(this.f44499a);
        }
        if (this.f44501c != null) {
            interfaceC3729k1.d("filename").e(this.f44501c);
        }
        interfaceC3729k1.d("type").j(iLogger, this.f44503e);
        if (this.f44506h != null) {
            interfaceC3729k1.d("attachment_type").e(this.f44506h);
        }
        if (this.f44502d != null) {
            interfaceC3729k1.d("platform").e(this.f44502d);
        }
        if (this.f44500b != null) {
            interfaceC3729k1.d("item_count").i(this.f44500b);
        }
        interfaceC3729k1.d("length").a(d());
        Map map = this.f44507i;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f44507i.get(str);
                interfaceC3729k1.d(str);
                interfaceC3729k1.j(iLogger, obj);
            }
        }
        interfaceC3729k1.T();
    }
}
