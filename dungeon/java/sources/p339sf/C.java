package p339sf;

import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.N;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p375uf.e;
import p465zf.f;

/* JADX INFO: loaded from: classes3.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f53727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f53728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t f53729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final D f53730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f53731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C4185d f53732f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private u f53733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f53734b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private t.a f53735c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private D f53736d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map f53737e;

        public a() {
            this.f53737e = new LinkedHashMap();
            this.f53734b = "GET";
            this.f53735c = new t.a();
        }

        public a(C request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f53737e = new LinkedHashMap();
            this.f53733a = request.n();
            this.f53734b = request.j();
            this.f53736d = request.c();
            this.f53737e = request.e().isEmpty() ? new LinkedHashMap() : N.v(request.e());
            this.f53735c = request.h().h();
        }

        public a a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f53735c.a(name, value);
            return this;
        }

        public C b() {
            u uVar = this.f53733a;
            if (uVar != null) {
                return new C(uVar, this.f53734b, this.f53735c.e(), this.f53736d, e.W(this.f53737e));
            }
            throw new IllegalStateException("url == null");
        }

        public a c(C4185d cacheControl) {
            Intrinsics.checkNotNullParameter(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            return string.length() == 0 ? i("Cache-Control") : e("Cache-Control", string);
        }

        public a d() {
            return g("GET", null);
        }

        public a e(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f53735c.i(name, value);
            return this;
        }

        public a f(t headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f53735c = headers.h();
            return this;
        }

        public a g(String method, D d10) {
            Intrinsics.checkNotNullParameter(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (d10 == null) {
                if (f.e(method)) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!f.b(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            this.f53734b = method;
            this.f53736d = d10;
            return this;
        }

        public a h(D body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return g("POST", body);
        }

        public a i(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f53735c.h(name);
            return this;
        }

        public a j(Class type, Object obj) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (obj == null) {
                this.f53737e.remove(type);
                return this;
            }
            if (this.f53737e.isEmpty()) {
                this.f53737e = new LinkedHashMap();
            }
            Map map = this.f53737e;
            Object objCast = type.cast(obj);
            Intrinsics.c(objCast);
            map.put(type, objCast);
            return this;
        }

        public a k(Object obj) {
            return j(Object.class, obj);
        }

        public a l(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            if (StringsKt.M(url, "ws:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("http:");
                String strSubstring = url.substring(3);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring);
                url = sb2.toString();
            } else if (StringsKt.M(url, "wss:", true)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("https:");
                String strSubstring2 = url.substring(4);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                sb3.append(strSubstring2);
                url = sb3.toString();
            }
            return n(u.f54059k.d(url));
        }

        public a m(URL url) {
            Intrinsics.checkNotNullParameter(url, "url");
            u.b bVar = u.f54059k;
            String string = url.toString();
            Intrinsics.checkNotNullExpressionValue(string, "url.toString()");
            return n(bVar.d(string));
        }

        public a n(u url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f53733a = url;
            return this;
        }
    }

    public C(u url, String method, t headers, D d10, Map tags) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f53727a = url;
        this.f53728b = method;
        this.f53729c = headers;
        this.f53730d = d10;
        this.f53731e = tags;
    }

    public final String a() {
        return this.f53728b;
    }

    public final u b() {
        return this.f53727a;
    }

    public final D c() {
        return this.f53730d;
    }

    public final C4185d d() {
        C4185d c4185d = this.f53732f;
        if (c4185d != null) {
            return c4185d;
        }
        C4185d c4185dB = C4185d.f53836n.b(this.f53729c);
        this.f53732f = c4185dB;
        return c4185dB;
    }

    public final Map e() {
        return this.f53731e;
    }

    public final String f(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f53729c.c(name);
    }

    public final List g(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f53729c.n(name);
    }

    public final t h() {
        return this.f53729c;
    }

    public final boolean i() {
        return this.f53727a.i();
    }

    public final String j() {
        return this.f53728b;
    }

    public final a k() {
        return new a(this);
    }

    public final Object l() {
        return m(Object.class);
    }

    public final Object m(Class type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return type.cast(this.f53731e.get(type));
    }

    public final u n() {
        return this.f53727a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request{method=");
        sb2.append(this.f53728b);
        sb2.append(", url=");
        sb2.append(this.f53727a);
        if (this.f53729c.size() != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (Object obj : this.f53729c) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.v();
                }
                Pair pair = (Pair) obj;
                String str = (String) pair.getFirst();
                String str2 = (String) pair.getSecond();
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append(':');
                sb2.append(str2);
                i10 = i11;
            }
            sb2.append(']');
        }
        if (!this.f53731e.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(this.f53731e);
        }
        sb2.append('}');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
