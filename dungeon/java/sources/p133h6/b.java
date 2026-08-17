package p133h6;

import V4.e;
import V4.i;
import V4.k;
import V5.d;
import V5.f;
import V5.g;
import V5.h;
import W5.EnumC1611n;
import android.net.Uri;
import android.os.Build;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final e f42588A = new a();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static boolean f42589y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static boolean f42590z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f42591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC0495b f42592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Uri f42593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f42594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private File f42595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f42596f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f42597g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f42598h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final d f42599i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final g f42600j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final h f42601k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final V5.b f42602l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final f f42603m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final c f42604n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected int f42605o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f42606p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f42607q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Boolean f42608r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final d f42609s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final p061d6.e f42610t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Boolean f42611u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final EnumC1611n f42612v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final String f42613w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f42614x;

    class a implements e {
        a() {
        }

        @Override // V4.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Uri apply(b bVar) {
            if (bVar != null) {
                return bVar.v();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: h6.b$b, reason: collision with other inner class name */
    public enum EnumC0495b {
        SMALL,
        DEFAULT,
        DYNAMIC
    }

    public enum c {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f42624a;

        c(int i10) {
            this.f42624a = i10;
        }

        public static c e(c cVar, c cVar2) {
            return cVar.g() > cVar2.g() ? cVar : cVar2;
        }

        public int g() {
            return this.f42624a;
        }
    }

    protected b(p133h6.c cVar) {
        this.f42592b = cVar.d();
        Uri uriR = cVar.r();
        this.f42593c = uriR;
        this.f42594d = x(uriR);
        this.f42596f = cVar.w();
        this.f42597g = cVar.u();
        this.f42598h = cVar.j();
        this.f42599i = cVar.i();
        this.f42600j = cVar.o();
        this.f42601k = cVar.q() == null ? h.c() : cVar.q();
        this.f42602l = cVar.c();
        this.f42603m = cVar.n();
        this.f42604n = cVar.k();
        boolean zT = cVar.t();
        this.f42606p = zT;
        int iE = cVar.e();
        this.f42605o = zT ? iE : iE | 48;
        this.f42607q = cVar.v();
        this.f42608r = cVar.S();
        this.f42609s = cVar.l();
        this.f42610t = cVar.m();
        this.f42611u = cVar.p();
        this.f42612v = cVar.h();
        this.f42614x = cVar.f();
        this.f42613w = cVar.g();
    }

    public static b a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return p133h6.c.x(uri).a();
    }

    private static int x(Uri uri) {
        if (uri == null) {
            return -1;
        }
        if (p060d5.f.n(uri)) {
            return 0;
        }
        if (uri.getPath() != null && p060d5.f.l(uri)) {
            return X4.a.c(X4.a.b(uri.getPath())) ? 2 : 3;
        }
        if (p060d5.f.k(uri)) {
            return 4;
        }
        if (p060d5.f.h(uri)) {
            return 5;
        }
        if (p060d5.f.m(uri)) {
            return 6;
        }
        if (p060d5.f.g(uri)) {
            return 7;
        }
        return p060d5.f.o(uri) ? 8 : -1;
    }

    public V5.b b() {
        return this.f42602l;
    }

    public EnumC0495b c() {
        return this.f42592b;
    }

    public int d() {
        return this.f42605o;
    }

    public int e() {
        return this.f42614x;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (f42589y) {
            int i10 = this.f42591a;
            int i11 = bVar.f42591a;
            if (i10 != 0 && i11 != 0 && i10 != i11) {
                return false;
            }
        }
        if (this.f42597g == bVar.f42597g && this.f42606p == bVar.f42606p && this.f42607q == bVar.f42607q && i.a(this.f42593c, bVar.f42593c) && i.a(this.f42592b, bVar.f42592b) && i.a(this.f42613w, bVar.f42613w) && i.a(this.f42595e, bVar.f42595e) && i.a(this.f42602l, bVar.f42602l) && i.a(this.f42599i, bVar.f42599i) && i.a(this.f42600j, bVar.f42600j) && i.a(this.f42603m, bVar.f42603m) && i.a(this.f42604n, bVar.f42604n) && i.a(Integer.valueOf(this.f42605o), Integer.valueOf(bVar.f42605o)) && i.a(this.f42608r, bVar.f42608r) && i.a(this.f42611u, bVar.f42611u) && i.a(this.f42612v, bVar.f42612v) && i.a(this.f42601k, bVar.f42601k) && this.f42598h == bVar.f42598h) {
            d dVar = this.f42609s;
            P4.d dVarA = dVar != null ? dVar.a() : null;
            d dVar2 = bVar.f42609s;
            if (i.a(dVarA, dVar2 != null ? dVar2.a() : null) && this.f42614x == bVar.f42614x) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return this.f42613w;
    }

    public EnumC1611n g() {
        return this.f42612v;
    }

    public d h() {
        return this.f42599i;
    }

    public int hashCode() {
        boolean z10 = f42590z;
        int i10 = z10 ? this.f42591a : 0;
        if (i10 != 0) {
            return i10;
        }
        d dVar = this.f42609s;
        int iA = p258o6.a.a(p258o6.a.a(p258o6.a.a(p258o6.a.a(p258o6.a.a(p258o6.a.a(p258o6.a.a(p258o6.a.a(p258o6.a.a(p258o6.a.a(p258o6.a.a(p258o6.a.a(p258o6.a.a(p258o6.a.a(p258o6.a.a(p258o6.a.a(p258o6.a.a(p258o6.a.a(0, this.f42592b), this.f42593c), Boolean.valueOf(this.f42597g)), this.f42602l), this.f42603m), this.f42604n), Integer.valueOf(this.f42605o)), Boolean.valueOf(this.f42606p)), Boolean.valueOf(this.f42607q)), this.f42599i), this.f42608r), this.f42600j), this.f42601k), dVar != null ? dVar.a() : null), this.f42611u), this.f42612v), Integer.valueOf(this.f42614x)), Boolean.valueOf(this.f42598h));
        if (z10) {
            this.f42591a = iA;
        }
        return iA;
    }

    public boolean i() {
        return Build.VERSION.SDK_INT >= 29 && this.f42598h;
    }

    public boolean j() {
        return this.f42597g;
    }

    public c k() {
        return this.f42604n;
    }

    public d l() {
        return this.f42609s;
    }

    public int m() {
        g gVar = this.f42600j;
        if (gVar != null) {
            return gVar.f14103b;
        }
        return 2048;
    }

    public int n() {
        g gVar = this.f42600j;
        if (gVar != null) {
            return gVar.f14102a;
        }
        return 2048;
    }

    public f o() {
        return this.f42603m;
    }

    public boolean p() {
        return this.f42596f;
    }

    public p061d6.e q() {
        return this.f42610t;
    }

    public g r() {
        return this.f42600j;
    }

    public Boolean s() {
        return this.f42611u;
    }

    public h t() {
        return this.f42601k;
    }

    public String toString() {
        return i.b(this).b("uri", this.f42593c).b("cacheChoice", this.f42592b).b("decodeOptions", this.f42599i).b("postprocessor", this.f42609s).b("priority", this.f42603m).b("resizeOptions", this.f42600j).b("rotationOptions", this.f42601k).b("bytesRange", this.f42602l).b("resizingAllowedOverride", this.f42611u).b("downsampleOverride", this.f42612v).c("progressiveRenderingEnabled", this.f42596f).c("localThumbnailPreviewsEnabled", this.f42597g).c("loadThumbnailOnly", this.f42598h).b("lowestPermittedRequestLevel", this.f42604n).a("cachesDisabled", this.f42605o).c("isDiskCacheEnabled", this.f42606p).c("isMemoryCacheEnabled", this.f42607q).b("decodePrefetches", this.f42608r).a("delayMs", this.f42614x).toString();
    }

    public synchronized File u() {
        try {
            if (this.f42595e == null) {
                k.g(this.f42593c.getPath());
                this.f42595e = new File(this.f42593c.getPath());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f42595e;
    }

    public Uri v() {
        return this.f42593c;
    }

    public int w() {
        return this.f42594d;
    }

    public boolean y(int i10) {
        return (i10 & d()) == 0;
    }

    public Boolean z() {
        return this.f42608r;
    }
}
