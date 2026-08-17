package p339sf;

import If.C1106h;
import If.InterfaceC1108j;
import java.io.Closeable;
import java.io.EOFException;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p447yf.c;
import p465zf.e;

/* JADX INFO: loaded from: classes3.dex */
public final class E implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C f53747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B f53748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f53749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f53750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s f53751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t f53752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final F f53753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final E f53754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final E f53755i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final E f53756j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f53757k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f53758l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final c f53759m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C4185d f53760n;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private C f53761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private B f53762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f53763c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f53764d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private s f53765e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private t.a f53766f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private F f53767g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private E f53768h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private E f53769i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private E f53770j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f53771k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f53772l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private c f53773m;

        public a() {
            this.f53763c = -1;
            this.f53766f = new t.a();
        }

        public a(E response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.f53763c = -1;
            this.f53761a = response.O();
            this.f53762b = response.K();
            this.f53763c = response.i();
            this.f53764d = response.u();
            this.f53765e = response.m();
            this.f53766f = response.s().h();
            this.f53767g = response.e();
            this.f53768h = response.x();
            this.f53769i = response.g();
            this.f53770j = response.G();
            this.f53771k = response.P();
            this.f53772l = response.L();
            this.f53773m = response.k();
        }

        private final void e(E e10) {
            if (e10 != null && e10.e() != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        private final void f(String str, E e10) {
            if (e10 != null) {
                if (e10.e() != null) {
                    throw new IllegalArgumentException((str + ".body != null").toString());
                }
                if (e10.x() != null) {
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                if (e10.g() != null) {
                    throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                }
                if (e10.G() == null) {
                    return;
                }
                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
            }
        }

        public a a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f53766f.a(name, value);
            return this;
        }

        public a b(F f10) {
            this.f53767g = f10;
            return this;
        }

        public E c() {
            int i10 = this.f53763c;
            if (i10 < 0) {
                throw new IllegalStateException(("code < 0: " + this.f53763c).toString());
            }
            C c10 = this.f53761a;
            if (c10 == null) {
                throw new IllegalStateException("request == null");
            }
            B b10 = this.f53762b;
            if (b10 == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.f53764d;
            if (str != null) {
                return new E(c10, b10, str, i10, this.f53765e, this.f53766f.e(), this.f53767g, this.f53768h, this.f53769i, this.f53770j, this.f53771k, this.f53772l, this.f53773m);
            }
            throw new IllegalStateException("message == null");
        }

        public a d(E e10) {
            f("cacheResponse", e10);
            this.f53769i = e10;
            return this;
        }

        public a g(int i10) {
            this.f53763c = i10;
            return this;
        }

        public final int h() {
            return this.f53763c;
        }

        public a i(s sVar) {
            this.f53765e = sVar;
            return this;
        }

        public a j(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f53766f.i(name, value);
            return this;
        }

        public a k(t headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f53766f = headers.h();
            return this;
        }

        public final void l(c deferredTrailers) {
            Intrinsics.checkNotNullParameter(deferredTrailers, "deferredTrailers");
            this.f53773m = deferredTrailers;
        }

        public a m(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f53764d = message;
            return this;
        }

        public a n(E e10) {
            f("networkResponse", e10);
            this.f53768h = e10;
            return this;
        }

        public a o(E e10) {
            e(e10);
            this.f53770j = e10;
            return this;
        }

        public a p(B protocol) {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            this.f53762b = protocol;
            return this;
        }

        public a q(long j10) {
            this.f53772l = j10;
            return this;
        }

        public a r(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f53766f.h(name);
            return this;
        }

        public a s(C request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f53761a = request;
            return this;
        }

        public a t(long j10) {
            this.f53771k = j10;
            return this;
        }
    }

    public E(C request, B protocol, String message, int i10, s sVar, t headers, F f10, E e10, E e11, E e12, long j10, long j11, c cVar) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f53747a = request;
        this.f53748b = protocol;
        this.f53749c = message;
        this.f53750d = i10;
        this.f53751e = sVar;
        this.f53752f = headers;
        this.f53753g = f10;
        this.f53754h = e10;
        this.f53755i = e11;
        this.f53756j = e12;
        this.f53757k = j10;
        this.f53758l = j11;
        this.f53759m = cVar;
    }

    public static /* synthetic */ String r(E e10, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return e10.p(str, str2);
    }

    public final F F(long j10) throws EOFException {
        F f10 = this.f53753g;
        Intrinsics.c(f10);
        InterfaceC1108j interfaceC1108jPeek = f10.P3().peek();
        C1106h c1106h = new C1106h();
        interfaceC1108jPeek.u1(j10);
        c1106h.V(interfaceC1108jPeek, Math.min(j10, interfaceC1108jPeek.B().size()));
        return F.f53774a.a(c1106h, this.f53753g.e(), c1106h.size());
    }

    public final E G() {
        return this.f53756j;
    }

    public final B K() {
        return this.f53748b;
    }

    public final long L() {
        return this.f53758l;
    }

    public final C O() {
        return this.f53747a;
    }

    public final long P() {
        return this.f53757k;
    }

    public final F a() {
        return this.f53753g;
    }

    public final int b() {
        return this.f53750d;
    }

    public final t c() {
        return this.f53752f;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        F f10 = this.f53753g;
        if (f10 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        f10.close();
    }

    public final C d() {
        return this.f53747a;
    }

    public final F e() {
        return this.f53753g;
    }

    public final C4185d f() {
        C4185d c4185d = this.f53760n;
        if (c4185d != null) {
            return c4185d;
        }
        C4185d c4185dB = C4185d.f53836n.b(this.f53752f);
        this.f53760n = c4185dB;
        return c4185dB;
    }

    public final E g() {
        return this.f53755i;
    }

    public final List h() {
        String str;
        t tVar = this.f53752f;
        int i10 = this.f53750d;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i10 != 407) {
                return CollectionsKt.l();
            }
            str = "Proxy-Authenticate";
        }
        return e.a(tVar, str);
    }

    public final int i() {
        return this.f53750d;
    }

    public final boolean isSuccessful() {
        int i10 = this.f53750d;
        return 200 <= i10 && i10 < 300;
    }

    public final c k() {
        return this.f53759m;
    }

    public final s m() {
        return this.f53751e;
    }

    public final String o(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return r(this, name, null, 2, null);
    }

    public final String p(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strC = this.f53752f.c(name);
        return strC == null ? str : strC;
    }

    public final t s() {
        return this.f53752f;
    }

    public final boolean t() {
        int i10 = this.f53750d;
        if (i10 == 307 || i10 == 308) {
            return true;
        }
        switch (i10) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    public String toString() {
        return "Response{protocol=" + this.f53748b + ", code=" + this.f53750d + ", message=" + this.f53749c + ", url=" + this.f53747a.n() + '}';
    }

    public final String u() {
        return this.f53749c;
    }

    public final E x() {
        return this.f53754h;
    }

    public final a z() {
        return new a(this);
    }
}
