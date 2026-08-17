package p133h6;

import V4.k;
import V5.b;
import V5.d;
import V5.f;
import V5.g;
import V5.h;
import W5.C1617u;
import W5.EnumC1611n;
import android.net.Uri;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p061d6.e;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Set f42625t = new HashSet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private e f42639n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f42643r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Uri f42626a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b.c f42627b = b.c.FULL_FETCH;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f42628c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g f42629d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h f42630e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d f42631f = d.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b.EnumC0495b f42632g = b.EnumC0495b.DEFAULT;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f42633h = C1617u.J().a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f42634i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f42635j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private f f42636k = f.HIGH;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private d f42637l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Boolean f42638m = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private b f42640o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Boolean f42641p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private EnumC1611n f42642q = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f42644s = null;

    public static class a extends RuntimeException {
        public a(String str) {
            super("Invalid request builder: " + str);
        }
    }

    private c() {
    }

    private c B(int i10) {
        this.f42628c = i10;
        if (this.f42632g != b.EnumC0495b.DYNAMIC) {
            this.f42644s = null;
        }
        return this;
    }

    public static c b(b bVar) {
        return x(bVar.v()).F(bVar.h()).z(bVar.b()).A(bVar.c()).H(bVar.j()).G(bVar.i()).I(bVar.k()).B(bVar.d()).J(bVar.l()).K(bVar.p()).M(bVar.o()).N(bVar.r()).L(bVar.q()).P(bVar.t()).Q(bVar.z()).C(bVar.e()).D(bVar.f()).E(bVar.g()).O(bVar.s());
    }

    public static boolean s(Uri uri) {
        Set set = f42625t;
        if (set != null && uri != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(uri.getScheme())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static c x(Uri uri) {
        return new c().R(uri);
    }

    public c A(b.EnumC0495b enumC0495b) {
        this.f42632g = enumC0495b;
        return this;
    }

    public c C(int i10) {
        this.f42643r = i10;
        return this;
    }

    public c D(String str) {
        this.f42644s = str;
        return this;
    }

    public c E(EnumC1611n enumC1611n) {
        this.f42642q = enumC1611n;
        return this;
    }

    public c F(d dVar) {
        this.f42631f = dVar;
        return this;
    }

    public c G(boolean z10) {
        this.f42635j = z10;
        return this;
    }

    public c H(boolean z10) {
        this.f42634i = z10;
        return this;
    }

    public c I(b.c cVar) {
        this.f42627b = cVar;
        return this;
    }

    public c J(d dVar) {
        this.f42637l = dVar;
        return this;
    }

    public c K(boolean z10) {
        this.f42633h = z10;
        return this;
    }

    public c L(e eVar) {
        this.f42639n = eVar;
        return this;
    }

    public c M(f fVar) {
        this.f42636k = fVar;
        return this;
    }

    public c N(g gVar) {
        this.f42629d = gVar;
        return this;
    }

    public c O(Boolean bool) {
        this.f42641p = bool;
        return this;
    }

    public c P(h hVar) {
        this.f42630e = hVar;
        return this;
    }

    public c Q(Boolean bool) {
        this.f42638m = bool;
        return this;
    }

    public c R(Uri uri) {
        k.g(uri);
        this.f42626a = uri;
        return this;
    }

    public Boolean S() {
        return this.f42638m;
    }

    protected void T() {
        Uri uri = this.f42626a;
        if (uri == null) {
            throw new a("Source must be set!");
        }
        if (p060d5.f.m(uri)) {
            if (!this.f42626a.isAbsolute()) {
                throw new a("Resource URI path must be absolute.");
            }
            if (this.f42626a.getPath().isEmpty()) {
                throw new a("Resource URI must not be empty");
            }
            try {
                Integer.parseInt(this.f42626a.getPath().substring(1));
            } catch (NumberFormatException unused) {
                throw new a("Resource URI path must be a resource id.");
            }
        }
        if (p060d5.f.h(this.f42626a) && !this.f42626a.isAbsolute()) {
            throw new a("Asset URI path must be absolute.");
        }
    }

    public b a() {
        T();
        return new b(this);
    }

    public b c() {
        return this.f42640o;
    }

    public b.EnumC0495b d() {
        return this.f42632g;
    }

    public int e() {
        return this.f42628c;
    }

    public int f() {
        return this.f42643r;
    }

    public String g() {
        return this.f42644s;
    }

    public EnumC1611n h() {
        return this.f42642q;
    }

    public d i() {
        return this.f42631f;
    }

    public boolean j() {
        return this.f42635j;
    }

    public b.c k() {
        return this.f42627b;
    }

    public d l() {
        return this.f42637l;
    }

    public e m() {
        return this.f42639n;
    }

    public f n() {
        return this.f42636k;
    }

    public g o() {
        return this.f42629d;
    }

    public Boolean p() {
        return this.f42641p;
    }

    public h q() {
        return this.f42630e;
    }

    public Uri r() {
        return this.f42626a;
    }

    public boolean t() {
        if ((this.f42628c & 48) == 0) {
            return p060d5.f.n(this.f42626a) || s(this.f42626a);
        }
        return false;
    }

    public boolean u() {
        return this.f42634i;
    }

    public boolean v() {
        return (this.f42628c & 15) == 0;
    }

    public boolean w() {
        return this.f42633h;
    }

    public c y(boolean z10) {
        return z10 ? P(h.c()) : P(h.e());
    }

    public c z(b bVar) {
        this.f42640o = bVar;
        return this;
    }
}
